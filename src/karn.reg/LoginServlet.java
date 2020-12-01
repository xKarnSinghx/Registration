package karn;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import karnbean.LoginBean;
import karndatabase.LoginDao;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public LoginServlet() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
 * @see HttpServlet#doGet(HttpServletRequest request,
HttpServletResponse response)
 */
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at:
").append(request.getContextPath());
}
/**
 * @see HttpServlet#doPost(HttpServletRequest request,
HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
LoginDao loginDao = new LoginDao();//creating object for LoginDao.
This class contains main logic of the application.
PrintWriter out = response.getWriter();
String username = request.getParameter("uname");// Here I am
retrieving the values entered by the user and keeping in instance variables
for further use.
String password = request.getParameter("password");
LoginBean loginBean = new LoginBean();//creating object for
LoginBean class, which is a normal java class, contains just setters and
getters. Bean classes are efficiently used in java to access user
information wherever required in the application.
loginBean.setUname(username);//setting the username and password
through the loginBean object then only you can get it in future.
loginBean.setPassword(password);
if (loginDao.validate(loginBean))//If it returns success string
then user will be rooted to Home page
{
 HttpSession session = request.getSession(true); // reuse existing
 // session if exist
 // or create one
 session.setAttribute("user", username);
response.sendRedirect("home.jsp");
}
else
{
RequestDispatcher rd =
request.getRequestDispatcher("login.html");
 out.println("<font color=red>Either user name or password is
wrong.</font>");//If authentication fails then user will be directed to
Login page with the error message .
 rd.include(request, response);
}
}
}
