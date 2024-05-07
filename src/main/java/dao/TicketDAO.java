package dao;

import entity.ticket.Abbonamento;
import entity.ticket.Ticket;
import entity.ticket.rivenditore.Rivenditore;
import entity.utente.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class TicketDAO {
    private EntityManager em;

    public TicketDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Ticket ticket) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(ticket);
        et.commit();
    }

    public Ticket getById(Integer id) {
        return em.find(Ticket.class, id);
    }

    public void update(Ticket ticket) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(ticket);
        et.commit();
    }

    public List<Ticket> findAll() {
        return em.createQuery("SELECT t FROM Ticket t", Ticket.class).getResultList();
    }

    public Integer findTicketFromPeriod(LocalDate fromDate, LocalDate toDate) {
        return em.createQuery("SELECT t FROM Ticket t", Ticket.class)
                .getResultStream()
                .filter(ticket ->
                        ticket.getDataEmissione()
                                .isAfter(fromDate)
                        &&
                        ticket.getDataEmissione()
                                .isBefore(toDate)
                        ||
                        ticket.getDataEmissione()
                                .isEqual(toDate)
                        ||
                        ticket.getDataEmissione()
                                .isEqual(fromDate)
                )
                .toList()
                .size();
    }

    public void delete(Ticket ticket) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(ticket);
        et.commit();
    }

    public Boolean isValid(Ticket ticket, Utente utente) {
        return ((Abbonamento) ticket)
                .getTessera()
                .getUtente()
                .getId()
                .equals(utente.getId());
    }
}
