package uz.mathers;

import uz.mathers.models.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {

    @Override
  // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   // PrintWriter printWriter = resp.getWriter();
   //    printWriter.write(
            //   "<html>" +
            //   "     <body>"+
            //   "       <form action '/' method='post' >" +
            //   "           <input type ='text' name='fullName' placeholder='Enter fullName'/>" +
            //   "           <input type ='text' name='userName' placeholder='Enter userName'/>" +
            //   "           <input type ='password' id='password' name='password' placeholder='Enter password' onChange='checkPassword()' />" +
            //   "           <input type ='password' id='prePassword' name='prePassword' placeholder='Enter prepassword' />" +
            //   "           <button type ='button' id='button' onClick='send()' > Login" +
            //   "            </button>" +
            //   "       </form>" +
            //   "       <script> " +
            //   "          function send(){" +
            //   "           var password=document.getElementById('password').value;" +
            //   "           var prePassword=document.getElementById('prePassword').value;" +
            //   "           if(password!=prePassword){"+
            //   "              alert('Parollar bir xil emas')"+
            //   "            }" +
            //   "         }"+
            //   "           function checkPassword(){" +
            //   "            var password=document.getElementById('password').value;\" +\n" +
            //   "             var prePassword=document.getElementById('prePassword').value;" +
            //   "                if(password==prePassword){" +
            //   "                document.getElementById('button').setAttribute('type','submit');"+
            //   "                                         }else{" +
            //   "                       document.getElementById('button').setAttribute('type','button');" +
            //   "                                              }          " +
            //   "                                  }"+
            //   "          </script>" +
            //   "    </body>" +
            //   "  </html"
  //             );
 //  }

 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();

      printWriter.write(
             "<html>" +
                     "<body>" +
                     "<form action='/' method='post'>" +
                     "<input name='fullName' type='text' placeholder='Enter fullname'><br>" +
                     "<input name='username' type='text' placeholder='Enter login'><br>" +
                     "<input name='password' id='password' type='password' placeholder='Enter password'><br>" +
                     "<input name='prePassword' id='prepassword' type='password' onChange='change_type()' placeholder='Enter password'>" +
                     " <button type='button' id='signup' onClick='send()'> Sign up </button>" +
                     "</form>" +
                     "<script >" +
                     "function send() {\n" +
                     "        var password = document.getElementById(\"password\").value;\n" +
                     "        var prepassword = document.getElementById(\"prepassword\").value;\n" +
                     "        if (password != prepassword) {\n" +
                     "            alert(\"Parollar bir xil emas!\");\n" +
                     "        }\n" +
                     "    }" +
                     "function change_type() {\n" +
                     "        var password = document.getElementById(\"password\").value;\n" +
                     "        var prepassword = document.getElementById(\"prepassword\").value;\n" +
                     "        if (password == prepassword) {\n" +
                     "            document.getElementById(\"signup\").setAttribute(\"type\", \"submit\");\n" +
                     "        }else {\n" +
                     "            document.getElementById(\"signup\").setAttribute(\"type\", \"button\");\n" +
                     "        }\n" +
                     "    }" +
                     "</script>" +
                     "</body>" +
                     "</html>"
     );
 }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

Users user=new  Users(
        req.getParameter("username"),
        req.getParameter("fullName"),
        req.getParameter("password"));
    }
}
