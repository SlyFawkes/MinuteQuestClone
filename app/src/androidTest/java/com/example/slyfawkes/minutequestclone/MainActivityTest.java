package com.example.slyfawkes.minutequestclone;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivityTest;
//    private ListView firstListView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivityTest = getActivity();
//        firstListView = (ListView) mainActivityTest.findViewById(R.id.listview);
    }

    public void testPreconditions() {
        assertNotNull(mainActivityTest);
//        assertNotNull(firstListView);
    }

//    public void testMyFirstTestTextView_labelText() {
//        final String expected =
//                mainActivityTest.get(R.array.list);
//        final String actual = firstTextView.getText().toString();
//        assertEquals(expected, actual);
//    }
}
