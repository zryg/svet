//package com.bgrulers.web.json;
//
//import com.bgrulers.entity.Ruler;
//import com.bgrulers.repository.RulerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Collection;
//
///**
// * Created by sslavkov on 5/30/2016.
// */
//@RestController
//@RequestMapping("/api/rulers")
//public class RulerRestController {
//
//	@Autowired
//    private RulerRepository rulerRepository;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public Collection<Ruler> list() {
//        return (Collection<Ruler>) rulerRepository.findAll();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Ruler retrieve(@PathVariable Long id) {
//        // retrieve one from DB
//        return rulerRepository.findOne(id);
//    }
//
//    // TODO - replace with just POST - remove "/create" and PUT/DELETE
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public Ruler create(@RequestBody Ruler ruler) {
//        // create
//        return new Ruler();
//    }
//
//    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
//    public Ruler update(@PathVariable Long id, @RequestBody Ruler ruler) {
//        // update
//        return new Ruler();
//    }
//
//    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
//    public Ruler delete(@PathVariable Long id) {
//        // find from repository and delete
//        return new Ruler();
//    }
//}
