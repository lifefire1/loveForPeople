package com.lifefire.loveForPeople;

import com.lifefire.loveForPeople.entity.Motivation;
import com.lifefire.loveForPeople.service.FullDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class HandlContr {
    private FullDB db;

    @Autowired
    public HandlContr(FullDB db) {
        this.db = db;
    }

    @GetMapping
    public String indexPage() throws IOException {
        db.fullDB(db.parseFile(new File("result.txt")));
        return "index";
    }

    @ModelAttribute
    public void Mode(Model model){
        Motivation motivation = db.getRandomMotivation().get();
        model.addAttribute("motivation", motivation);
    }
}
