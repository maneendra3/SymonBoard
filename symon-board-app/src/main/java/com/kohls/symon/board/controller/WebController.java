package com.kohls.symon.board.controller;

import org.apache.http.protocol.HTTP;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping(method = RequestMethod.GET)
    public String indexPage(){
        return "/index.html";
    }

    @RequestMapping(value="signing-board-bundle.js",method = RequestMethod.GET)
    public String bundledJs(){
        return "/app/signing-board-bundle.js";
    }
}
