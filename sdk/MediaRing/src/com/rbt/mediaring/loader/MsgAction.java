package com.rbt.mediaring.loader;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MsgAction extends FragmentActivity{
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		 getIntent().getStringExtra("");
	}
}
