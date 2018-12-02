package brocker.controller;


import brocker.model.Bid;
import brocker.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BidController {

    @Autowired
    BidService bidService;

    @GetMapping("/bids")
    @ResponseBody
    public List<Bid> findAll(){
        return bidService.findAll();
    }

    @GetMapping("/bid/{id}")
    public Bid getOne (@PathVariable(value = "id") Long id){
        return bidService.getBidById(id);
    }

    @PostMapping("/bid")
    public Bid save(@Valid @RequestBody Bid bid){
        return bidService.save(bid);
    }

}
