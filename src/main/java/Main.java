import dao.RivenditoreDAO;
import dao.TesseraDAO;
import dao.TicketDAO;
import dao.UtenteDAO;
import entity.ticket.Abbonamento;
import entity.ticket.Biglietto;
import entity.ticket.rivenditore.Rivenditore;
import entity.ticket.rivenditore.RivenditoreAutorizzato;
import entity.utente.Tessera;
import enums.Autorizzazione;
import enums.TipoAbbonamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bw4");
        EntityManager em = emf.createEntityManager();

        UtenteDAO utenteDAO = new UtenteDAO(em);
        TesseraDAO tesseraDAO = new TesseraDAO(em);
        RivenditoreDAO rivenditoreDAO = new RivenditoreDAO(em);
        TicketDAO ticketDAO = new TicketDAO(em);
//
//        Utente u1 = new Utente();
//        u1.setNome("Stefano");
//        u1.setCognome("Fortezza");
//        u1.setEmail("stefano.fortezza@epicode.it");
//        u1.setDataDiNascita(LocalDate.of(1998, 7, 28));
//        u1.setSesso(Sesso.UOMO);
//        u1.setNumeroTelefono("+3934085890692");
//
//        utenteDAO.save(u1);
//
//        Tessera t1 = new Tessera();
//        t1.setUtente(u1);
//        t1.setDataEmissione(LocalDate.now());
//        tesseraDAO.save(t1);

//        DistributoreAutomatico da1 = new DistributoreAutomatico();
//        da1.aggiungiDisponibilita(100);
//        try {
//            da1.aggiungiVendita(1);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        try {
//            da1.aggiungiVendita(1000);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        try {
//            da1.rimuoviDisponibilita(1000);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        try {
//            da1.rimuoviDisponibilita(10);
//        }catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        da1.setAttivo(false);
//
//        rivenditoreDAO.save(da1);

//        RivenditoreAutorizzato ra1 = new RivenditoreAutorizzato();
//        ra1.aggiungiDisponibilita(100);
//        try {
//            ra1.aggiungiVendita(1);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        try {
//            ra1.aggiungiVendita(1000);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        try {
//            ra1.rimuoviDisponibilita(1000);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        try {
//            ra1.rimuoviDisponibilita(10);
//        }catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        ra1.setAutorizzazione(Autorizzazione.REGIONE);
//        ra1.setNomeRivenditore("Chest'è");
//
//        rivenditoreDAO.save(ra1);
//        Rivenditore findRa1 = rivenditoreDAO.getById(7);
//        Rivenditore findDa1 = rivenditoreDAO.getById(5);
//        Tessera findT1 = tesseraDAO.getById(4);
//        Abbonamento ab1 = new Abbonamento();
//        ab1.setTessera(findT1);
//        ab1.setTipoAbbonamento(TipoAbbonamento.MENSILE);
//        ab1.setPrezzo(49.99);
//        try {
//            ab1.aggiungiRivenditore(findRa1);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        try {
//            ab1.setDataEmissione(LocalDate.now());
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        ticketDAO.save(ab1);
//
//        Biglietto b1 = new Biglietto();
//        b1.setPrezzo(3.99);
//        try {
//            b1.aggiungiRivenditore(findDa1);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        try {
//            b1.setDataEmissione(LocalDate.now());
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        ticketDAO.save(b1);

        // Conteggio biglietti per periodo
//        Integer bigliettiDatati = ticketDAO.findTicketFromPeriod(LocalDate.of(2023, 12, 25), LocalDate.now());
//        System.out.println(bigliettiDatati);

        // Conteggio biglietti per Rivenditore
//        HashMap<String, Integer> numTicketFromRivenditore = rivenditoreDAO.findNumTicketFromRivenditore();
//        System.out.println(numTicketFromRivenditore);
    }
}
