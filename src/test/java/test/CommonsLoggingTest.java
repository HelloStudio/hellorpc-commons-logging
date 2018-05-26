/*
 * Author: George <GeorgeNiceWorld@gmail.com> | <Georgeinfo@163.com>
 * Copyright (C) George (www.georgeinfo.com), All Rights Reserved.
 */
package test;

import com.github.hellorpc.logger.GeorgeLogger;
import com.github.hellorpc.logger.GeorgeLoggerFactory;
import org.junit.*;

/**
 * Hello RPC 日志代理测试(Apache Commons Logging)
 *
 * @author George <Georgeinfo@163.com>
 */
public class CommonsLoggingTest {
    private static final GeorgeLogger LOG = GeorgeLoggerFactory.getLogger(CommonsLoggingTest.class);

    public CommonsLoggingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testLogger() throws Exception {
        LOG.debug("### 这是Apache Commons Logging打印的日志");
    }

}
