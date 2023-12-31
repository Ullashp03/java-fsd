package com.ecommerce.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pojo.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}