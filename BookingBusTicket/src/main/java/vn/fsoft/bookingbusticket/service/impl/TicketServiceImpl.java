package vn.fsoft.bookingbusticket.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import vn.fsoft.bookingbusticket.entity.Customer;
import vn.fsoft.bookingbusticket.entity.Noneuser;
import vn.fsoft.bookingbusticket.entity.Ticket;
import vn.fsoft.bookingbusticket.exception.NotFoundException;
import vn.fsoft.bookingbusticket.model.TicketDto;
import vn.fsoft.bookingbusticket.repository.BusRepository;
import vn.fsoft.bookingbusticket.repository.CustomerRepository;
import vn.fsoft.bookingbusticket.repository.NoneUserRepository;
import vn.fsoft.bookingbusticket.repository.RouteRepository;
import vn.fsoft.bookingbusticket.repository.TicketRepository;
import vn.fsoft.bookingbusticket.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	RouteRepository routeRepository;

	@Autowired
	BusRepository busRepository;

	@Autowired
	CustomerRepository custRepository;

	@Autowired
	NoneUserRepository noneUserRepository;

	@Override
	public CrudRepository<Ticket, Integer> getRepo() {
		// TODO Auto-generated method stub
		return ticketRepository;
	}

	@Override
	public List<TicketDto> retrieveAllTicket() {
		/*List<Ticket> list = ticketRepository.findAll();
		System.out.println("List all ticket: " + list.size());
		List<TicketDto> listTicketDto = null;
		TicketDto ticket;
		if (list.isEmpty()) {
			throw new NotFoundException("List ticket not found!");
		} else {
			int routeId, accountId;*/
			/*for (Ticket t : list) {
				ticket = new TicketDto();
				routeId = t.getRoute().getRoutesId();
				accountId = t.getAccountUser().getAccountId();

				Optional<Customer> custOptional = custRepository.findByAccountId(accountId);

				if (!custOptional.isPresent()) {
					Optional<Noneuser> noneUserOptional = noneUserRepository.findByAccountId(accountId);
					Noneuser user = noneUserOptional.get();
					ticket.setUserName(user.getFullName());
				} else {
					ticket.setUserName(custOptional.get().getFullName());
				}

				ticket.setAccountId(accountId);

				ticket.setTicketId(t.getTicketId());
				ticket.setBusId(routeRepository.findById(routeId).get().getBusId());
				ticket.setBusName(busRepository.findById(ticket.getBusId()).get().getBusName());
				ticket.setChairId(t.getSeatJunction().getChair().getChairId());
				ticket.setChairName(t.getSeatJunction().getChair().getChairName());

				ticket.setBookingDate(t.getBookingDate());
				ticket.setBookingTime(t.getBookingTime());
				ticket.setDeparture(routeRepository.findById(routeId).get().getDepartture());
				ticket.setFromPlace(routeRepository.findById(routeId).get().getPlace1().getPlaceName());
				ticket.setToPlace(routeRepository.findById(routeId).get().getPlace2().getPlaceName());

				ticket.setStartDate(routeRepository.findById(routeId).get().getStartDate());
				ticket.setRouteId(routeId);
				ticket.setTicketStatus(t.getSeatJunction().getChairStatus());

				listTicketDto.add(ticket);
			}*/
		//}
		return null;
	}

	@Override
	public TicketDto retriveTicketByTicketId(int ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDto> retrieveTicketByTicketStatus(int ticketStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDto> retrieveTicketByAccountdAndStatus(int custId, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDto> retrieveTicketByRouteId(int routeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
