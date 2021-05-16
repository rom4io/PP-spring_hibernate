package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "model")
    private String model;

    @Column (name = "series")
    private int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @OneToOne (mappedBy = "car")
    private User user;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getSeries() { return series; }

    public void setSeries(int series) { this.series = series; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}