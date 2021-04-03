package infinbank.uz.task.controller;

import infinbank.uz.task.service.CircleService;
import infinbank.uz.task.service.PerimeterService;
import infinbank.uz.task.service.SquareService;
import infinbank.uz.task.service.TriangleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ShapeController {

    private final CircleService circleService;
    private final SquareService squareService;
    private final TriangleService triangleService;
    private final PerimeterService  perimeterService;

    public ShapeController(CircleService circleService, SquareService squareService, TriangleService triangleService, PerimeterService perimeterService) {
        this.circleService = circleService;
        this.squareService = squareService;
        this.triangleService = triangleService;
        this.perimeterService = perimeterService;
    }

    @GetMapping("/cirle")
    public ResponseEntity<Map<String, Double>> getCircle(@RequestParam(value = "r") Double r){
        return ResponseEntity.ok(circleService.circleSurfaceAndPeremeter(r) );
    }

    @GetMapping("/square")  //@RequestParam(value = "a") Double a
    public ResponseEntity<Map<String, Double>> getSquare(){
        Map<String, Double> map = squareService.squareSurfaceAndPeremeter(3.0);
        return ResponseEntity.ok(map);
    }

    @GetMapping("/triangle")
    public ResponseEntity<Map<String, Double>> getTriangle(@RequestParam(value = "a") Double a, @RequestParam(value = "b") Double b, @RequestParam(value = "s") Double s){
        return ResponseEntity.ok(triangleService.triangleSurfaceAndPeremeter(a,b,s));
    }

    @GetMapping("/perimeter")
    public ResponseEntity<Map<String, Double>> getPerimeter(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b){
        return ResponseEntity.ok(perimeterService.perimeterSurfaceAndPeremeter(a,b));
    }

}
