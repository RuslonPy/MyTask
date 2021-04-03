package infinbank.uz.task.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class TriangleService {

    @Transactional
    public Map<String, Double> triangleSurfaceAndPeremeter(Double a, Double b, Double s){
        double P = a+b+s;
        double p = P/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-s));
        Map<String, Double> triangle = new HashMap<>();
        triangle.put("Perimeter :", P);
        triangle.put("Surface :", S);
        return triangle;
    }
}
