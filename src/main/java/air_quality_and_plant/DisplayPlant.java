package air_quality_and_plant;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/plantdetails")
public class DisplayPlant extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlantCrud crud=new PlantCrud();
		try {
			List<Plant> plant=crud.displayAll();
			if(plant!=null) {
			req.setAttribute("plantList", plant);
			req.getRequestDispatcher("PlantDetail.jsp").forward(req, resp);;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
