package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PeopleDAO;
import dto.People;

public class Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		master(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		master(req, resp);
	}
	
	protected void master(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cmd = request.getParameter("cmd");
		String nextpage = null;
		String msg=null;
		PeopleDAO dao;
		System.out.println("수정해보자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		if(cmd.equals("login")){
			
			dao = new PeopleDAO();
			People peo = new People();
			
			peo.setId(request.getParameter("id"));
			peo.setPw(request.getParameter("pw"));
			
			People pp = dao.loginMember(peo);
			
			nextpage = "/msg.jsp";
			if(pp==null){
				request.setAttribute("nextPage", "Home.jsp");
				request.setAttribute("msg", "로그인실패");
				
			}else{
				request.setAttribute("nextPage", "memberList.do?cmd=memberList");
				request.setAttribute("msg", pp.getId()+" 님 환영합니다");
			}
			
		}else if(cmd.equals("joinForm")){
			nextpage="/JoinForm.jsp";
			
		}else if(cmd.equals("join")){
			dao = new PeopleDAO();
			People peo = new People();
			
			peo.setId(request.getParameter("id"));
			peo.setPw(request.getParameter("pw"));
			peo.setName(request.getParameter("name"));
			
			msg = dao.insertMember(peo);
			request.setAttribute("msg", msg);
			request.setAttribute("nextPage", "/Study/Home.jsp");
			nextpage = "/msg.jsp";
			
		}else if(cmd.equals("memberList")){
			
			dao = new PeopleDAO();
			ArrayList<People> list = dao.selectList();
			
			request.setAttribute("list", list);
			nextpage = "/memberList.jsp";
			
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(nextpage);
		rd.forward(request, response);
	
	}
	
}
