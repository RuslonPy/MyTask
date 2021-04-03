package infinbank.uz.task.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CircleService {

    @Transactional
    public Map<String, Double> circleSurfaceAndPeremeter(Double r){
        double P = 2 * Math.PI * r;
        double S = Math.PI * r * r;
        Map<String, Double> circle = new HashMap<>();
        circle.put("Perimeter :", P);
        circle.put("Surface :", S);
        return circle;
    }
}
