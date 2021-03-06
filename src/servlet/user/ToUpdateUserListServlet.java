package servlet.user;

import entity.Category;
import entity.Product;
import entity.User;
import service.CategoryService;
import service.ProductService;
import service.UserService;
import service.impl.CategoryServiceImpl;
import service.impl.ProductServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/toupdateUserListServlet")
public class ToUpdateUserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        //获取用户id
        String UserId = request.getParameter("id");
        System.out.println(UserId);
        int uId = Integer.valueOf(UserId);

        //创建用户服务层对象 查询该用户后传到前台
        //实例化service层中UserService对象
        UserService service = new UserServiceImpl();
        //调用service层中findUserByUserId方法
        User user = service.findUserByUserId(uId);

        request.setAttribute("u",user);

        request.getRequestDispatcher("admin_usermodify.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}