package nl.hu.bep.setup;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import java.io.IOException;
import java.io.PrintWriter;

import static java.net.Proxy.Type.HTTP;

@WebServlet(urlPatterns = "/SnakeStart")
public class Snake extends HttpServlet {
    static String headType;
    static String tailType;
    static String colourHex;

    public static void setHeadType(String headType){
        Snake.headType = headType;
    }

    public static void setTailType(String tailType){
        Snake.tailType = tailType;
    }

    public static void setColourHex(String ColourHex){
        Snake.colourHex = ColourHex;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.print("""  
                "apiversion": "1",
                "author": "MyUsername",
                "color": "#888888",
                "head": "default",
                "tail": "default",
                "version": "0.0.1-beta"
                """
);

    }

}
