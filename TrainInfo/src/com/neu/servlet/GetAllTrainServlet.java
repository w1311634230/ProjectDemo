package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.TrainDao;
import com.neu.dao.TrainDaoImpl;
import com.neu.entity.Traininfo;

/**
 * Servlet implementation class GetAllTrainServlet
 */
@WebServlet("/GetAllTrainServlet")
public class GetAllTrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllTrainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		TrainDao trainDao = new TrainDaoImpl();
		
		try {
			int pageSize = 3;
			int pageNum = 1;
			
			String num = request.getParameter("pageNum");
			if(num != null) {
				pageNum = Integer.parseInt(num);
			}
			List<Traininfo> train = trainDao.getPaged(pageSize, pageNum);
			
			request.setAttribute("train", train);
			
			
			int count = trainDao.count();
			int page = count % pageSize == 0?count / pageSize : count / pageSize+1;
			request.setAttribute("page", page);
			request.getRequestDispatcher("/allList.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
