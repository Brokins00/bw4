package entity.tratta;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Table(name="viaggi")
public class Viaggio {
    @Column(name="orario_partenza")
    private LocalDateTime orarioPartenza;
    @Column(name="orario_arrivo")
    private LocalDateTime orarioArrivo;
    @Column(name="percorrenza_effettiva")
    private Duration percorrenzaEffettiva;
    @ManyToOne
    @JoinColumn(name = "tratta_id")
    private Tratta tratta;



    public Viaggio() {

    }

    public LocalDateTime getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(LocalDateTime orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public LocalDateTime getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(LocalDateTime orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public Duration getPercorrenzaEffettiva() {
        return percorrenzaEffettiva;
    }

    public void setPercorrenzaEffettiva(Duration percorrenzaEffettiva) {
        this.percorrenzaEffettiva = percorrenzaEffettiva;
    }

    @Override
    public String toString() {
        return "Viaggio{" +
                "orarioPartenza=" + orarioPartenza +
                ", orarioArrivo=" + orarioArrivo +
                ", percorrenzaEffettiva=" + percorrenzaEffettiva +
                '}';
    }
}


