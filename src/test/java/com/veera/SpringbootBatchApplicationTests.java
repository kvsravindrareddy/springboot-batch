package com.veera;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;

@RunWith(MockitoJUnitRunner.class)
public class SpringbootBatchApplicationTests {

    @Mock
    private SpringApplicationBuilder builder;

    @Test
    public void testMain1() {
        SpringbootBatchApplication.main(new String[]{});
        Assert.assertTrue(true);
    }

    @Test
    public void testMain2() {
        SpringbootBatchApplication application = new SpringbootBatchApplication();
        Mockito.when(builder.sources(SpringbootBatchApplication.class)).thenReturn(builder);
        SpringApplicationBuilder result = application.configure(builder);
        Mockito.verify(builder).sources(SpringbootBatchApplication.class);
        Assert.assertEquals(builder, result);
    }
}