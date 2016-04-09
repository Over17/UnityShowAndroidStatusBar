# UnityShowAndroidStatusBar
Since Unity 5.3, there's no more option to enable the status bar for Android builds. However, if you are building a non-fullscreen non-immersive application with Unity and want to keep the status bar, you may want to use this plugin.

## Effect
For KitKat (Android 4.4) and later, where the immersive fullscreen mode is available, status bar is shown only when the immersive mode is off, so you have to set Screen.fullScreen to false in your scripts.
For JellyBean (Android 4.3) and earlier, when fullScreen is set to true, "lights out" mode is enabled - navigation and status bar are shown but dimmed. When fullScreen is set to false, full navigation and status bar are shown.
By default fullScreen is set to true in Unity.

## Usage
0.	Works with Unity 5.3
1.	Add the plugin to your project
2.	Please pay attention to the manifest - you may want to use the one provided here or, if you have your own base manifest, please make sure to use `com.unity3d.nostatusbar.UnityPlayerActivityStatusBar` activity as the MAIN/LAUNCHER one
3.	Add `Screen.fullScreen = false;` to your `Start()` method if you want the status bar shown on KitKat+ devices
4.	Enjoy

## How to Build
Use your tool of choice if you want to rebuild the code. Since it depends on UnityPlayerActivity, you should add Unity's classes.jar to bin/ to build successfully. Don't forget to remove Unity's classes.jar when adding the plugin to your Unity project to prevent "class already added" errors.

## See Also
Please refer to Google documentation for more details: http://developer.android.com/training/system-ui/index.html
