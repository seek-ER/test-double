package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    private GradeSystem stubGradeSystem;
    private GradeService gradeService;
    @BeforeEach
    public void setUp() {
        stubGradeSystem = mock(GradeSystem.class);
        when(stubGradeSystem.gradesFor(isA(Long.class))).thenReturn(Arrays.asList(90.0, 95.0, 100.0));

        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(1L);
        Assertions.assertEquals(95.0, result);
    }
}
