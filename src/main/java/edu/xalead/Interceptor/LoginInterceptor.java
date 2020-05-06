package edu.xalead.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    //拦截器
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String) request.getSession().getAttribute("username");
        System.out.println(username);
        if(username!=null){
            return true;
        }
        if(request.getRequestURI().contains("login")){
            return true;
        }

        request.setAttribute("error","你还没登陆");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
