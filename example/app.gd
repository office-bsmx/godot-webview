extends Control

var webview: WebView = null

func _ready() -> void:
	webview = WebView.new()


func _on_button_pressed() -> void:
	webview.open("https://google.com")
