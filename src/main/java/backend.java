

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultBoundedRangeModel;

/**
 * Servlet implementation class backend
 */
@WebServlet ("/backend")
public class backend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String Fullname=request.getParameter("Fullname");
	
	String category =request.getParameter("category");
	String pasword =request.getParameter("pasword");
	String confirmpasword=request.getParameter("confirmpasword");
	
	
	String Trainer="";
	String Amount="";

	PrintWriter pw=response.getWriter();
	
	 

    if(pasword.equals(confirmpasword)) {
        
    
	switch(category) {
	      case "fatloss":
	    	  Trainer="Haswanth";
	    	  Amount="2500";
	    	 
	    	  break;
	      case "Body building":
	    	  
	    	  Trainer="Abhishek";
	    	  Amount="5000";
	    	  break;
	    	  
	      case "strength training":
	    	  Trainer="Sunil";
	    	  Amount="3000";
	    	  break;	  
	     
	    	  }
	
	
	
	 request.setAttribute("Fullname",Fullname);
     request.setAttribute("category",category);
    
     request.setAttribute("Trainer",Trainer);
     request.setAttribute("Amount",Amount);
     
     
     
     request.getRequestDispatcher("result.jsp").forward(request, response);
		
		
	}
    else {
    	pw.println("Enter valid pasword");
    }

}
}
