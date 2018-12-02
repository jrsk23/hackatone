package brocker.service;

import brocker.model.Bid;
import brocker.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidService {

    @Autowired
    BidRepository bidRepository;

    public List<Bid> findAll(){
        return bidRepository.findAll();
    }

    public Bid getBidById(Long id){
        return bidRepository.getOne(id);
    }

    public Bid save (Bid bid){
        return bidRepository.save(bid);
    }
}
