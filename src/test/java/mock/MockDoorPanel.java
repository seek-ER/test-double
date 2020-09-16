package mock;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockDoorPanel extends DoorPanel{
    private boolean wasCalled = false;

    @Override
    public void close() {
        this.wasCalled = true;
        System.out.println("Mock door panel close method is called");
    }

    public boolean verifyThatMockDoorPanelWasCalled(){
        return wasCalled;
    }
}
