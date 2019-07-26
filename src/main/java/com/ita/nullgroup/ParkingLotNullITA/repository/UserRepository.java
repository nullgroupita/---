package com.ita.nullgroup.ParkingLotNullITA.repository;

import com.ita.nullgroup.ParkingLotNullITA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
