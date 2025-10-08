# WebView Plugin v2 for Godot Engine 4.5

Simple Android plugin that helps you integrate a WebView into your Godot game.

## Why this plugin?
- It's free and super simple
- You can improve your app's user experience by adding this plugin - the user stays in your app while browsing web pages

## Documentation
**!!! This plugin only works in Android export.**

**For quick start, you can simply open the test project in the `example` folder.**

### Installing the plugin in your Godot project:

1. Download the latest release of the **webview** addon
2. Copy the **webview** folder into the **addons** directory of your project
3. Open **Project -> Project Settings -> Plugins** and activate the **WebView** plugin
4. Go to **Export -> Android** and make sure **Use custom build** option is checked
5. Install Android Build Template: **Project -> Install Android Build Template**
6. You're all set!

### Usage example:

```gdscript
extends Control

var webview: WebView = null

func _ready() -> void:
	webview = WebView.new()

func _on_button_pressed() -> void:
	webview.open("https://google.com")
```