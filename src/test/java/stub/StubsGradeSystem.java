package stub;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class StubsGradeSystem extends GradeSystem{
    @Override
    public List<Double> gradesFor(long studentId){
        return Arrays.asList(90.0,100.0,80.0);
    }
}
