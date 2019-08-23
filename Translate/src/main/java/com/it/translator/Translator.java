package com.it.translator;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Translator")
public class Translator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Translator() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ñ���  
        request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
        response.setHeader("Content-Type","text/html; charset=utf-8");  
        
        String word = request.getParameter("word");
        TranslatorWebService factory = new TranslatorWebService();
		TranslatorWebServiceSoap soap = factory.getTranslatorWebServiceSoap();
		ArrayOfString wordse = soap.getEnCnTwoWayTranslator(word);
		List<String> list = wordse.getString();
		request.getSession().setAttribute("infor", list);
		request.getRequestDispatcher("templates/index.jsp").forward(request, response);
	}
}
