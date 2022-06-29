package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarAT {
    private Engine engine;
    private Name name;
    private Wheel wheel;
    private CarBody carBody;
    private GearBoxAT gearBoxAT;
}
