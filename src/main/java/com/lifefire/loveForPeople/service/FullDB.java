package com.lifefire.loveForPeople.service;

import com.lifefire.loveForPeople.entity.Motivation;
import com.lifefire.loveForPeople.initDB.RepDB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

@Service
@Slf4j
public class FullDB {
    private RepDB repDB;

    @Autowired
    public FullDB(RepDB repDB) {
        this.repDB = repDB;
    }

    public void fullDB(ArrayList<String> mass){
        for (String s :
                mass) {
            Motivation motivation = new Motivation();
            motivation.setName(s);
            repDB.save(motivation);
        }
    }

    public ArrayList<String> parseFile(File file) throws IOException {
        ArrayList<String> mass = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            mass.add(scanner.next());
        }
        return mass;
    }

    public Optional<Motivation> getRandomMotivation(){
        Random random = new Random();
        Long i = random.nextLong(180L);
        log.info(i.toString());
        Optional<Motivation> motivation = repDB.findById(i);
        log.info(motivation.toString());
        return motivation;
    }
}
