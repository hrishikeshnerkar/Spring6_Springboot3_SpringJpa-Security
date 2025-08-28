package com.example.SpringbootWeb1.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /*
    @RequestMapping("/")
    public String home(){
//        return "index.jsp";
        return "index"; // when i config the prefix and sufix in appli.prop
    }

     */

    // 1st way to do
    /*@RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;

        session.setAttribute("result", result);//This can be used in result.jsp

        return "result.jsp";
    }*/

    // In this way we minimize the above code
    /*
    @RequestMapping("add")
    public String add(int num1, int num2, HttpSession session){
        int result = num1+ num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }
    */

    /*
    //Now we want to use model as we use controller which is reqmap and view "result.jsp" and now we use model to transfer data from controller to view
    @RequestMapping("add")
    public String add(int num1, int num2, Model model){
        int result = num1+ num2;
        model.addAttribute("result", result);
      //return "result.jsp";
        return "result"; // when i config the prefix and sufix in appli.prop
    }
     */

    //Using modelview
    /*
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int x, @RequestParam("num2") int y, ModelAndView mv){
        int result = x + y;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }
     */

    //From now for index2.jsp
    @RequestMapping("/")
    public String home(){
        return "index2";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){ // ModelAttribute for different name
        return "result";
    }
}
