package infinbank.uz.task.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class PerimeterService {

    @Transactional
    public Map<String, Double> perimeterSurfaceAndPeremeter(Double a, Double b){
        double P = 2*(a+b);
        double S = a*b;
        Map<String, Double> perimeter = new HashMap<>();
        perimeter.put("Perimeter :", P);
        perimeter.put("Surface :", S);
        return perimeter;
    }
}
