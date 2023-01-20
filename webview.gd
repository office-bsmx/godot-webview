extends Node

var singleton = null

func _init():
	if Engine.has_singleton("WebViewLibrary"):
		singleton = Engine.get_singleton("WebViewLibrary")

func open_webview(url: String):
	if singleton != null:
		if !url.empty():
			singleton.open(url)
