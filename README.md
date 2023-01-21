# Godot-WebView
## Simple Godot plugin that helps you integrate a WebView into your Android game

## Why this plugin?
- It's free and open source
- You can improve your app's user experience by adding this plugin - the user stays in your app while being on the Web-Page.
- You can use this plugin to let users to log in via social networks.
*e.g. to extract Facebook's or VK's access token from the return URL*
This feature will be added soon.

### To use this plugin in your Godot project follow this steps:
1. In the Godot Editor click **Project -> Install Android Build Template**
2. Download the latest release, put *webbview.gdap* and *WebViewLibrary-release.aar* files into **[your_project_directory]/android/plugins**
3.  Go to **Project Settings... -> AutoLoad** and add the *webview.gd* script to Node list, and set the node's name like *WebView*
4. You are set to **GO!**
## Documentation
You can open a URL in the WebView with this code:

	func _ready():
		WebView.open_webview("https://someurl.com")
To destroy the WebView just press the back button.
Maybe in the future there will be some properties for changing the widget's behavior.
