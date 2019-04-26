package vn.fsoft.bookingbusticket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vn.fsoft.bookingbusticket.entity.Noneuser;

@Repository
public interface NoneUserRepository extends JpaRepository<Noneuser, Integer>{
	Optional<Noneuser> findById(int id);
	Optional<Noneuser> findByIdOrFullName(int id, String fullName);
	Optional<Noneuser> findByFullName(String fullname);
	
	@Query("SELECT n FROM Noneuser n WHERE n.accountUser.accountId = :accountId")
	Optional<Noneuser> findByAccountId(@Param("accountId")int accId);
}
