class_name WebView extends Object



var _plugin_name = "GodotWebView"
var _plugin_singleton = null

func _init():
	if Engine.has_singleton(_plugin_name):
		_plugin_singleton = Engine.get_singleton(_plugin_name)
	else:
		printerr("Initialization error: unable to access the java logic")

func open(url: String):
	if _plugin_singleton:
		_plugin_singleton.open(url)
	else:
		printerr("WebView not loaded")
