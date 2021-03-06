package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    @Mock
    DoorPanel doorPanel;

    SecurityCenter securityCenter;


    @BeforeEach
    public void setUp() {
        // securityCenter = new SecurityCenter(new MockDoorPanel());
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter = new SecurityCenter(new DoorPanel());
        securityCenter.switchOn();
    }

    @Test
    public void shouldVerityDoorIsClosed() {
        securityCenter = new SecurityCenter(new MockDoorPanel());
        securityCenter.switchOn();
    }
}
