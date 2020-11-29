package com.mycart.core;

import com.mycart.MyCartCoreApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyCartCoreApplication.class)
@WebAppConfiguration
public class MyCartCoreApplicationTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void testDummy() throws SQLException{
        String schema = dataSource.getConnection().getCatalog();
        assertEquals("mycart", schema);
    }
}
