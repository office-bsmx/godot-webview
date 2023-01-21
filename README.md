# Simple Godot plugin that helps you integrate a WebView into your Android game

## Why this plugin?
- It's free and open source
- You can improve your app's user experience by adding this plugin - the user stays in your app while being on the Web-Page.
- You can use this plugin to let users to log in via social networks.
*e.g. to extract Facebook's or VK's access token from the return URL*
This feature will be added soon.


## Documentation
**!!! This plugin only works in Android export.**

### To use this plugin in your Godot project follow this steps:
1. In the Godot Editor click **Project -> Install Android Build Template**
2. Download the latest release, put *webbview.gdap* and *WebViewLibrary-release.aar* files into **[your_project_directory]/android/plugins**
3.  Go to **Project Settings... -> AutoLoad** and add the *webview.gd* script to Node list, and set the node's name like *WebView*
4. You are set to **GO!**

You can open a URL in the WebView with this code:

	func _ready():
		WebView.open_webview("https://someurl.com")

### How to make it work:
1. Go to **Export -> Android** and make sure **Use custom build** option is checked.
2. Also, you have to enable the plugin by clicking **Web View Library** checkbox in the Plugin's list.
3. Target SDK Version must be set to Level >=32 (same as the compiled .aar library)

To destroy the WebView just press the back button.
Maybe in the future there will be some properties for changing the widget's behavior.
