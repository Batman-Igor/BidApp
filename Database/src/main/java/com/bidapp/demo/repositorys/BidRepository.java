package com.bidapp.demo.repositorys;

import com.bidapp.demo.objects.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long>{
}
