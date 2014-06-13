package war.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import war.api.FooApi;
import war.api.FooDto;
import war.service.FooService;

@Controller
@RequestMapping("/foo")
public class FooController {
    @Resource
    private FooService fooService;

    @Resource
    private FooApi fooApi;
    
    @RequestMapping("/byId")
    public ModelAndView byId(Integer id) {
        ModelAndView mav = new ModelAndView("/foo/byId");
        mav.addObject("foo", fooService.getById(id));
        mav.addObject("doo", new Date());
        return mav;
    }

    @RequestMapping("/byUsername")
    public ModelAndView byUsername(String username) {
        ModelAndView mav = new ModelAndView("/foo/byUsername");
        mav.addObject("foo", fooApi.getByUsername(username));
        return mav;
    }

    @ResponseBody
    @RequestMapping("/jsonByUsername")
    public FooDto jsonByUsername(String username) {
        return fooApi.getByUsername(username);
    }
}
