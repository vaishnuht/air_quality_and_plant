package air_quality_and_plant;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addplant")
public class AddPlant extends HttpServlet {
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String plant=req.getParameter("plant");
		String date=req.getParameter("date");
		int room=Integer.parseInt(req.getParameter("roomno"));
		RoomDetails details=new RoomDetails(room, date, plant);
		
		RoomCrud crud=new RoomCrud();
		try {
			int res=crud.addRoom(details);
			List<RoomDetails> list=crud.displayRoom();
			req.setAttribute("roomdetails",list);
			req.getRequestDispatcher("roomDetails.jsp").forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
