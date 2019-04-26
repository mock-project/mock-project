package vn.fsoft.bookingbusticket.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * The persistent class for the noneuser database table.
 * 
 */
@Entity
@NamedQuery(name = "Noneuser.findAll", query = "SELECT n FROM Noneuser n")
public class Noneuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String address;

	private String email;

	private String fullName;

	private String phone;

	// bi-directional many-to-one association to Ticket
	/*@OneToMany(mappedBy = "noneuser")
	private List<Ticket> tickets;*/

	// bi-directional many-to-one association to AccountUser
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "account_id")
	private AccountUser accountUser;

	public Noneuser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public AccountUser getAccountUser() {
		return accountUser;
	}

	public void setAccountUser(AccountUser accountUser) {
		this.accountUser = accountUser;
	}

	/*public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setNoneuser(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setNoneuser(null);

		return ticket;
	}*/

}