package edu.fud.childrencharity.controller;

//import edu.fud.childrencharity.repository.TestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    //@Autowired
    //private TestRespository test;

    //HOME ============================================
    @GetMapping({"/", "/index"})
    public String Home(Model model) {
        //model.addAttribute("test", test.findAll());
        return "index";
    }

    //CONTACT & ABOUT =================================
    @GetMapping("/contact")
    public String Contact(Model model) {
        return "contact";
    }
    @GetMapping("/donation")
    public String Donation(Model model) {
        return "donation";
    }
    @GetMapping("/about")
    public String About(Model model) {
        return "about";
    }

    //CAUSE ============================================
    @GetMapping("/cause")
    public String Cause(Model model) {
        return "cause";
    }
    @GetMapping("/cause-details")
    public String CauseDetails(Model model) {
        return "cause-details";
    }

    //TEAM =============================================
    @GetMapping("/our-team")
    public String Team(Model model) {
        return "our-team";
    }
    @GetMapping("/our-partner")
    public String Partner(Model model) {
        return "our-partner";
    }

    //EVENT =============================================
    @GetMapping("/gallery")
    public String Gallery(Model model) {
        return "gallery";
    }
    @GetMapping("/event")
    public String Event(Model model) {
        return "event";
    }
    @GetMapping("/event-details")
    public String EventDetails(Model model) {
        return "event-details";
    }

    //BLOG ==============================================
    @GetMapping("/blog")
    public String Blog1(Model model) {
        return "blog";
    }
    @GetMapping("/blog-2")
    public String Blog2(Model model) {
        return "blog-2";
    }
    @GetMapping("/single-blog")
    public String Blog3(Model model) {
        return "single-blog";
    }

    //SHOP =============================================
    @GetMapping("/shop")
    public String Shop(Model model) {
        return "shop";
    }
    @GetMapping("/product")
    public String Product(Model model) {
        return "product";
    }
    @GetMapping("/cart")
    public String Cart(Model model) {
        return "cart";
    }
    @GetMapping("/checkout")
    public String Checkout(Model model) {
        return "checkout";
    }

    //AUTHOZIRE =========================================
    @GetMapping("/register")
    public String Register(Model model) {
        return "register";
    }
    @GetMapping("/login")
    public String Login(Model model) {
        return "login";
    }

    //OTHER =============================================
    @GetMapping("/faq")
    public String FAQ(Model model) {
        return "faq";
    }
    @GetMapping("/element")
    public String Element(Model model) {
        return "element";
    }
    @GetMapping("/404")
    public String Page404(Model model) {
        return "error/404";
    }
    @GetMapping("/search-archive")
    public String SearchArchive(Model model) {
        return "search-archive";
    }

}
