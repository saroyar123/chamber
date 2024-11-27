package com.chamber.chamber_backend.user;

import com.chamber.chamber_backend.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<user,Long> {

}
