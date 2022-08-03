package lt.namai.naujasprojektas.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Receptas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    private String nurodymai;
    private int kalorijosPer100g;
    private double kaina;

    @ManyToMany
    @JoinTable(
            name = "sujungimas_receptas_ingredientas",
            joinColumns = @JoinColumn(name = "receptas_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredientas_id"))
    private Set<Ingredientas> receptoIngredientai;

    @ManyToOne
    @JoinColumn(name = "vartotojas_id")
    private Vartotojas receptoKurejas;

    public Receptas() {
    }

    public Receptas(long id, String pavadinimas, String nurodymai, int kalorijosPer100g, double kaina, Set<Ingredientas> receptoIngredientai, Vartotojas receptoKurejas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.nurodymai = nurodymai;
        this.kalorijosPer100g = kalorijosPer100g;
        this.kaina = kaina;
        this.receptoIngredientai = receptoIngredientai;
        this.receptoKurejas = receptoKurejas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getNurodymai() {
        return nurodymai;
    }

    public void setNurodymai(String nurodymai) {
        this.nurodymai = nurodymai;
    }

    public int getKalorijosPer100g() {
        return kalorijosPer100g;
    }

    public void setKalorijosPer100g(int kalorijosPer100g) {
        this.kalorijosPer100g = kalorijosPer100g;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public Set<Ingredientas> getReceptoIngredientai() {
        return receptoIngredientai;
    }

    public void setReceptoIngredientai(Set<Ingredientas> receptoIngredientai) {
        this.receptoIngredientai = receptoIngredientai;
    }

    public Vartotojas getReceptoKurejas() {
        return receptoKurejas;
    }

    public void setReceptoKurejas(Vartotojas receptoKurejas) {
        this.receptoKurejas = receptoKurejas;
    }

    @Override
    public String toString() {
        return "Receptas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", nurodymai='" + nurodymai + '\'' +
                ", kalorijosPer100g=" + kalorijosPer100g +
                ", kaina=" + kaina +
                ", receptoIngredientai=" + receptoIngredientai +
                ", receptoKurejas=" + receptoKurejas +
                '}';
    }
}
