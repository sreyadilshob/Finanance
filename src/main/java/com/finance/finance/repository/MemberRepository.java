package com.finance.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.finance.finance.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


}
