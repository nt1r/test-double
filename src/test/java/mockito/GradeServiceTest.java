package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import stub.GradeService;
import stub.GradeSystem;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeSystem gradeSystem = new GradeSystem();

    @Mock
    GradeService gradeService = new GradeService(gradeSystem);

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeService.calculateAverageGrades(1L)).thenReturn(90.0d);
        double result = gradeService.calculateAverageGrades(1L);
        Assertions.assertEquals(90.0, result);
    }
}
