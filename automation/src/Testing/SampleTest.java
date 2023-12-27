package Testing;

import org.testng.annotations.Test;

public class SampleTest {


    @Test(priority = 1,dependsOnMethods = "DTest")
    public void ATest(){
        System.out.println("ATest Method");

    }

    @Test(priority = 2,invocationCount = 3,enabled = false)
    public void BTest(){
        System.out.println("BTest Method");

    }

    @Test(priority = -1)
    public void CTest(){
        System.out.println("CTest Method");

    }

    @Test(timeOut = 2000)
    public void DTest() throws  InterruptedException{
        Thread.sleep(2000);
        System.out.println("ATest Method");

    }
}
