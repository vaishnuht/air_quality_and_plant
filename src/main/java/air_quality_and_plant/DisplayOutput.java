package air_quality_and_plant;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/airdetails")
public class DisplayOutput extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OutputCrud crud=new OutputCrud();
		try {
			
			List<PrepareOutput> data= crud.display();
			for(PrepareOutput output: data) {
				System.out.println(output.getDate());
			}
			if(data!=null) {
				req.setAttribute("list", data);
				req.getRequestDispatcher("AirDetails.jsp").forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException|NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
