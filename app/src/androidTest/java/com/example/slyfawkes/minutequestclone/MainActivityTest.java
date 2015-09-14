package com.example.slyfawkes.minutequestclone;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivityTest;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivityTest = getActivity();
    }

    public void testPreconditions() {
        assertNotNull(mainActivityTest);
    }
}
