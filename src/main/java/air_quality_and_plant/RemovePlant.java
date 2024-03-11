package air_quality_and_plant;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletePlant")
public class RemovePlant  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		RoomCrud crud=new RoomCrud();
		try {
			crud.deleteRoom(id);
			List<RoomDetails> details=crud.displayRoom();
			req.setAttribute("roomdetails", details);
			req.getRequestDispatcher("roomDetails.jsp").forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
