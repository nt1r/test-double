package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = new GradeService(new StubGradeSystem()).calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
