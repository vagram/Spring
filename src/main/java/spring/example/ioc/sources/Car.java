package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Engine engine;
    private Wheel wheel;
    private CarBody carBody;
    private Name name;
    private GearBoxMT gearBoxMT;
}
