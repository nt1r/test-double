package stub;

import java.util.Arrays;
import java.util.List;

public class StubGradeSystem extends GradeSystem {
    public List<Double> gradesFor(long studentId) {
        /*
         * 1. 数据库中获取学生id
         * 2. 向第三方系统发送学生id，获取鉴权信息
         * 3. 根据学生id和鉴权信息去数据库中查出学生成绩
         * */
        return Arrays.asList(80.0, 90.0, 100.0); // 只是一个例子
    }
}
