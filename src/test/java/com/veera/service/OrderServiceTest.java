package com.veera.service;

import com.veera.NotificationUtil;
import com.veera.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.powermock.api.mockito.PowerMockito.doReturn;

@RunWith(PowerMockRunner.class)
@PrepareForTest({NotificationUtil.class})
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(NotificationUtil.class);
    }

    //@Test
    public void testStaticMethod() {
        Order order = new Order(1,"Banana",100.00);
        PowerMockito.mockStatic(NotificationUtil.class);
        Mockito.when(NotificationUtil.sendNotification("test msg")).thenReturn("success");
        Order orderResponse = orderService.createOrder(order);
    }

    @Test
    public void testPrivateMethod() throws Exception {
        OrderService spy = PowerMockito.spy(orderService);
        //Mockito.doReturn("Sample Private Method").when(spy);
        doReturn("New Message from Mock!").when(spy,
                "testPvtMethod", ArgumentMatchers.any());
        //String msg = Whitebox.invokeMethod(spy, "testPvtMethod", ArgumentMatchers.any());
        Order order = new Order(1,"Banana",100.00);
        //PowerMockito.mockStatic(NotificationUtil.class);
        //Mockito.when(NotificationUtil.sendNotification("test msg")).thenReturn("success");
        Order orderResponse = spy.createOrder(order);
        //PowerMockito.verifyPrivate(mockService, times(1)).invoke("privateMessage");
    }
}