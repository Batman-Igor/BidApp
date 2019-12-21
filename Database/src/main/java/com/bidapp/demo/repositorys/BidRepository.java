package com.bidapp.demo.repositorys;

import com.bidapp.demo.objects.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {
    List<Bid> findBidByEmail(String email);
    List<Bid> findBidByStatus(String status);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Bid b SET b.status = :status WHERE b.title = :title AND b.dateOfCreation = :date")
    void updateBid(@Param("title") String title, @Param("date") String date, @Param("status") String status);
}
