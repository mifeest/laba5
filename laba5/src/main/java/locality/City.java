package locality;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import static java.time.LocalDateTime.now;
    @Getter
    @Setter
    @XmlRootElement(name = "dragon")
    @XmlAccessorType(XmlAccessType.FIELD)
public class City implements Comparable{
    @XmlElement(name = "id")
    private Integer id;//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @XmlElement(name = "name")
    private String name; //Поле не может быть null, Строка не может быть пустой
    @XmlElement(name = "coordinates")
    private Coordinates coordinates; //Поле не может быть null
    @XmlElement(name = "creationDate",required = true)
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @XmlElement(name = "area")
    private long area; //Значение поля должно быть больше 0
    @XmlElement(name = "population")
    private int population; //Значение поля должно быть больше 0
    @XmlElement(name = "metersAboveSeaLevel")
    private double metersAboveSeaLevel;
    @XmlElement(name = "establishmentDate")
    private java.time.LocalDate establishmentDate;
    @XmlElement(name = "timezone")
    private Float timezone; //Значение поля должно быть больше -13, Максимальное значение поля: 15
    @XmlElement(name = "standardOfLiving")
    private StandardOfLiving standardOfLiving; //Поле не может быть null
    @XmlElement(name = "governor")
    private Human governor; //Поле может быть null

    public City(Integer id, String name, Coordinates coordinates, long area, int population, double metersAboveSeaLevel, Float timezone, StandardOfLiving standardOfLiving, Human governor) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.area = area;
        this.population = population;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
        this.timezone = timezone;
        this.standardOfLiving = standardOfLiving;
        this.governor = governor;
    }

    public City(Integer id, String name, Coordinates coordinates, LocalDateTime creationDate, long area, int population, double metersAboveSeaLevel, LocalDate establishmentDate, Float timezone, StandardOfLiving standardOfLiving, Human governor) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.population = population;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
        this.establishmentDate = establishmentDate;
        this.timezone = timezone;
        this.standardOfLiving = standardOfLiving;
        this.governor = governor;
    }

        public City(String[] data) {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof City city)) return false;
            return getArea() == city.getArea()
                    && getPopulation() == city.getPopulation()
                    && Double.compare(city.getMetersAboveSeaLevel(), getMetersAboveSeaLevel()) == 0
                    && Objects.equals(getId(), city.getId())
                    && Objects.equals(getName(), city.getName())
                    && Objects.equals(getCoordinates(), city.getCoordinates())
                    && Objects.equals(getTimezone(), city.getTimezone())
                    && getStandardOfLiving() == city.getStandardOfLiving()
                    && Objects.equals(getGovernor(), city.getGovernor());

        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName(), getCoordinates(), getArea(), getPopulation(), getMetersAboveSeaLevel(), getTimezone(), getStandardOfLiving(), getGovernor());
        }

        @Override
        public int compareTo(Object o) {
        City anotherCity = (City) o;
            return this.name.compareTo(((City) o).name);
        }

        @Override
        public String toString() {
            return "City{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", coordinates=" + coordinates +
                    ", area=" + area +
                    ", population=" + population +
                    ", metersAboveSeaLevel=" + metersAboveSeaLevel +
                    ", timezone=" + timezone +
                    ", standardOfLiving=" + standardOfLiving +
                    ", governor=" + governor +
                    '}';
        }
    }
