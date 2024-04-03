package locality;
import jakarta.xml.bind.annotation.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Coordinates {
    @XmlElement(name="x")
    private Float x; //Поле не может быть null
    @XmlElement(name="y")
    private Double y; //Поле не может быть null

    public Coordinates(Float x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Coordinates(){}

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        Coordinates coords = (Coordinates) o;
        return Objects.equals(this.x, coords.getX()) && this.y == coords.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
