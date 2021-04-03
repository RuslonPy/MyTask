package infinbank.uz.task.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class SquareService {

    @Transactional
    public Map<String, Double> squareSurfaceAndPeremeter(Double a){
        double P = 4*a;
        double S = a*a;
        Map<String, Double> square = new HashMap<>();
        square.put("Perimeter :", P);
        square.put("Surface :", S);
        return square;
    }
}
