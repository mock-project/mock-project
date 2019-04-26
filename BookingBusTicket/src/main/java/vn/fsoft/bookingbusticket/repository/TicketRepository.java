package vn.fsoft.bookingbusticket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vn.fsoft.bookingbusticket.entity.AccountUser;
import vn.fsoft.bookingbusticket.entity.Customer;
import vn.fsoft.bookingbusticket.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	List<Ticket> findByAccountUser(AccountUser acc);

	List<Ticket> findByTicketStatus(int ticketStatus);
	
	

	/*@Query("SELECT t FROM Ticket t \r\n" + "WHERE t.accountUser.accountId = :accountId")
	List<Ticket> findTicketByAccountId(@Param("accountId") int accountId);

	@Query("SELECT t FROM Ticket t \r\n" + "WHERE t.accountUser.accountId = :accountId \n" + "AND t.ticketStatus = :status")
	List<Ticket> findTicketByAccountIdAndTicketStatus(@Param("accountId") int cutomerId, @Param("status") int status);


	@Query("SELECT t FROM Ticket t \r\n" + "WHERE t.route.routeId = :routeId")
	List<Ticket> findTicketByRouteId(@Param("routeId")int routeId);*/
	
}
