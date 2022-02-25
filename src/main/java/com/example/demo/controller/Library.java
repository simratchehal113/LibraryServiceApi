package com.example.demo.controller;

import com.example.demo.entity.LibraryLedger;
import com.example.demo.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/libraryDataBank")
public class Library {
    @Autowired
    LibraryRepository libraryRepository;
    @RequestMapping(value = "/getLibraryLogs",method = RequestMethod.GET)
    @ResponseBody
    public List<LibraryLedger> getAllLibraryLogs(){
        return (List<LibraryLedger>) libraryRepository.findAll();
    }

    @RequestMapping(value = "/addToLibraryLogs",method = RequestMethod.POST)
    @ResponseBody
    public LibraryLedger addToLibraryLogs(@RequestBody LibraryLedger libraryObj){
        LibraryLedger libraryObject=new LibraryLedger();
        libraryObject.setBookName(libraryObj.getBookName());
        libraryObject.setIssuedToName(libraryObj.getIssuedToName());
        libraryObject.setIssuerName(libraryObj.getIssuerName());
//        libraryObject.setIssuedOn(new SimpleDateFormat("MM/dd/yyyy"));
        return libraryRepository.save(libraryObject);
    }

    @RequestMapping(value = "/deleteLibraryLogs",method = RequestMethod.DELETE)
    public void removeFromLibraryLogs(@RequestParam Integer id){
        libraryRepository.delete(id);
    }


}
