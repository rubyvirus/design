package cim.whatistest.abstractfactoryexeicise;

import com.whatistest.clonemodel.abstractfactoryexercise.AndroidOperationSystem;
import com.whatistest.clonemodel.abstractfactoryexercise.OperationSystem;
import org.junit.Test;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class TestOperationSystem {

    @Test
    public void TestOperationSystem() {
        OperationSystem operationSystem;
        operationSystem = new AndroidOperationSystem();
        operationSystem.createInterfaceController().interfaceUp();
        operationSystem.createOperationController().operationUp();
    }
}
