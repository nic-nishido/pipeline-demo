package com.nic.sample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.File;

public class SampleApp extends HttpServlet {
    
  public void doGet (HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        
    PrintWriter out = res.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html lang=\"en\">");
    out.println("<head>");
    out.println("<meta charset=\"utf-8\">");
    out.println("<title>Sample WebAPP</title>");
    out.println("<meta name=\"viewport\" content=\"initial-scale=1,width=720\">");
    out.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
    out.println("<script src=\"js/jquery-3.5.1.min.js\"></script>");
    out.println("<script src=\"js/jquery.bgswitcher.js\"></script>");
      
    //umi.js or yama.js  
    out.println("<script src=\"js/yama.js\"></script>");
    out.println("</head>");
    out.println("<div class=\"bg-slider\">");
    out.println("  <h1 class=\"bg-slider__title\">Sample Web Application</h1>");
    out.println("</div>");
   }
}
