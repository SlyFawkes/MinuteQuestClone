package com.example.slyfawkes.minutequestclone;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivityTest;
    private TextView firstTextView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivityTest = getActivity();
        firstTextView = (TextView) mainActivityTest.findViewById(R.id.first_text_view);
    }

    public void testPreconditions() {
        assertNotNull(mainActivityTest);
        assertNotNull(firstTextView);
    }

    public void testMyFirstTestTextView_labelText() {
        final String expected =
                mainActivityTest.getString(R.string.hello_world);
        final String actual = firstTextView.getText().toString();
        assertEquals(expected, actual);
    }
}
