package com.websarva.wings.android.cameraintentsample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
	@Test
	public void useAppContext() throws Exception {
		Context appContext = InstrumentationRegistry.getTargetContext();

		assertEquals("com.websarva.wings.android.cameraintentsample", appContext.getPackageName());
	}
}
