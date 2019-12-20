package com.bidapp.demo.repositorys;

import com.bidapp.demo.objects.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long>{
    List<Bid> findBidByEmail(String email);
    List<Bid> findBidByStatus(String status);
}
