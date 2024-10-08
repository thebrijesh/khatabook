package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.Model.ExpansesCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpanceCatagoryRepository extends JpaRepository<ExpansesCategory,Long> {

    List<ExpansesCategory> findByBusinessId(Long businessId);
}
