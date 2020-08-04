package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    @Mock
    DoorPanel doorPanel = new DoorPanel();

    @InjectMocks
    SecurityCenter securityCenter;

    @BeforeEach
    public void setUp() {
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
    }
}
