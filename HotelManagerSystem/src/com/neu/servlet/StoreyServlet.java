package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Storey;
import com.neu.service.StoreyService;
import com.neu.service.StoreyServiceImpl;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet("/StoreyServlet")
public class StoreyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		
		if("getAll".equals(method)) {
			try {
				doGetAll(request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
		}else if("getModify".equals(method)) {
			doGetModify(request,response);
		}else if("getAdd".equals(method)) {
			doGetAdd(request,response);
		}
	}

	private void doGetAdd(HttpServletRequest request, HttpServletResponse response) {
		StoreyService stoService = new StoreyServiceImpl();
		
		String storey = request.getParameter("sid");
		String storename = request.getParameter("sname");
		
		Storey sto = new Storey(storey, storename);
		
		try {
			int n = stoService.add(sto);
			if(n == 1) {
				request.getRequestDispatcher("/StoreyServlet?method=getAll").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private void doGetModify(HttpServletRequest request, HttpServletResponse response) {
		StoreyService stoService = new StoreyServiceImpl();
		
		
		
	}
	
	private void doGetAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
			StoreyService stoService = new StoreyServiceImpl();
			
			List<Storey> list = stoService.getStorey();
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/storeyinfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
