package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.TrainDao;
import com.neu.dao.TrainDaoImpl;
import com.neu.entity.Traininfo;

/**
 * Servlet implementation class getByIdServlet
 */
@WebServlet("/getByIdServlet")
public class getByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String trainno = request.getParameter("trainno");
		
		TrainDao trainDao = new TrainDaoImpl();
		
		try {
			Traininfo train = trainDao.getById(trainno);
			
			request.setAttribute("train", train);
			request.getRequestDispatcher("/getById.jsp").forward(request, response);
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
