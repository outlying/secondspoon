package com.antyzero.secondspoon.data;

import android.content.Intent;
import android.os.IBinder;
import android.test.ServiceTestCase;

public class SimpleServiceTest extends ServiceTestCase<SimpleService> {

    public SimpleServiceTest() {
        super( SimpleService.class );
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        setupService();
    }

    public void testBinding() {

        IBinder binder = bindService( new Intent() );

        assertNotNull( binder );
    }
}