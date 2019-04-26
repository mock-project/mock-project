package vn.fsoft.bookingbusticket.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import vn.fsoft.bookingbusticket.entity.Ticket;
import vn.fsoft.bookingbusticket.model.TicketDto;

public interface TicketService {
	CrudRepository<Ticket, Integer> getRepo();
	
	List<TicketDto> retrieveAllTicket();
	
	TicketDto retriveTicketByTicketId(int ticketId);
	
	List<TicketDto> retrieveTicketByTicketStatus(int ticketStatus);
	
	List<TicketDto> retrieveTicketByAccountdAndStatus(int custId, int status);
	
	List<TicketDto> retrieveTicketByRouteId(int routeId);
}
