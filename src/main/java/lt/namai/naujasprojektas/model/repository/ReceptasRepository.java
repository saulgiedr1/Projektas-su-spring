package lt.namai.naujasprojektas.model.repository;

import lt.namai.naujasprojektas.model.entity.Receptas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptasRepository  extends JpaRepository<Receptas, Long> {

    Receptas findByPavadinimas(String pavadinimas);

    List<Receptas> findByKainaBetween(double pradineKaina, double galutineKaina);

}
