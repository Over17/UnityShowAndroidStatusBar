package com.unity3d.nostatusbar;

import android.os.Bundle;
import android.view.WindowManager;
import com.unity3d.player.UnityPlayerActivity;

public class UnityPlayerActivityStatusBar extends UnityPlayerActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
}
