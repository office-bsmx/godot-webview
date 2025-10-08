@tool
extends EditorPlugin


var export_plugin : WebViewPlugin = null

func _enable_plugin() -> void:
	pass


func _disable_plugin() -> void:
	pass


func _enter_tree() -> void:
	export_plugin = WebViewPlugin.new()
	add_export_plugin(export_plugin)


func _exit_tree() -> void:
	remove_export_plugin(export_plugin)
	export_plugin = null


class WebViewPlugin extends EditorExportPlugin:
	var _plugin_name: String = "GodotWebView"
	var subfolder: String = "webview"

	func _supports_platform(platform):
		if platform is EditorExportPlatformAndroid:
			return true
		return false

	func _get_android_libraries(platform, debug):
		if debug:
			return PackedStringArray([subfolder + "/" + _plugin_name + "-debug.aar"])
		else:
			return PackedStringArray([subfolder + "/" + _plugin_name + "-release.aar"])

	func _get_android_dependencies(platform, debug):
		if debug:
			return PackedStringArray(["androidx.browser:browser:1.8.0"])
		else:
			return PackedStringArray([])

	func _get_name():
		return _plugin_name
