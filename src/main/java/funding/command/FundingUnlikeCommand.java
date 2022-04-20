package funding.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import funding.dao.FDaoC;

public class FundingUnlikeCommand implements FCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String like_customer  = request.getParameter("customer_id");
		
//		String like_At  = request.getParameter("customer_id");
		int like_funding  = Integer.parseInt(request.getParameter("funding_num")) ;
		
		request.setAttribute("viewpage", "/fundingContent_view.do?fid=" + request.getParameter("funding_num"));
		FDaoC dao = new FDaoC();

		
		dao.unlike(like_customer, like_funding);
	}

}
