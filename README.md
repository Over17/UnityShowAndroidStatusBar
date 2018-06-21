# UnityShowAndroidStatusBar
Since Unity 5.3, there's no more option to enable the status bar for Android builds. However, if you are building a non-fullscreen non-immersive application with Unity and want to keep the status bar, you may want to use this plugin.

## Effect
For KitKat (Android 4.4) and later, where the immersive fullscreen mode is available, status bar is shown only when the immersive mode is off, so you have to set Screen.fullScreen to false in your scripts.  
For JellyBean (Android 4.3) and earlier, when fullScreen is set to true, "lights out" mode is enabled - navigation and status bar are shown but dimmed. When fullScreen is set to false, full navigation and status bar are shown.  
By default fullScreen is set to true in Unity.  
This plugin also enables translucent status and navigation bars on KitKat (Android 4.4) and later versions by default. Follow the instructions in **Usage** to make them opaque.

## Usage
0.	Works with Unity 5.3+
1.	Add the plugin to your project. You need the manifest and the AAR (Assets/Plugins/Android/AndroidManifest.xml and Assets/Plugins/Android/unityShowAndroidStatusBar.aar)
2.	Please pay attention to the manifest - you may want to use the one provided here or, if you have your own base manifest, please make sure to use `com.unity3d.nostatusbar.UnityPlayerActivityStatusBar` activity as the MAIN/LAUNCHER one
3.	If you don't want the status and navigation bars to be translucent, change the theme in manifest from `UnityTransparentStatusBarTheme` to `UnityStatusBarTheme`
4.	Add `Screen.fullScreen = false;` to your `Start()` method if you want the status bar shown on KitKat+ devices
5.	Enjoy

## How to Build
0. Put Unity's classes.jar into src/UnityShowAndroidStatusBar/libs/
1. Run `gradlew assemble` from src/UnityShowAndroidStatusBar/

## See Also
Please refer to Google documentation for more details: https://developer.android.com/training/system-ui/index.html
