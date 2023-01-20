package com.bsmx.webviewlibrary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

public class WebViewLibrary extends GodotPlugin {
    private FrameLayout lay;
    private WebView webView;

    public WebViewLibrary(Godot godot) {
        super(godot);
    }
    @Override
    public View onMainCreate(Activity activity) {
        lay = new FrameLayout(activity);
        return lay;
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "WebViewLibrary";
    }

    @SuppressLint("SetJavaScriptEnabled")
    @UsedByGodot
    public void open(@NonNull String url) {
        runOnUiThread(() -> {
            if (!url.isEmpty()){
                webView= new WebView(lay.getContext());
                webView.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT));
                lay.addView(webView);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
            }
        });
    }

    @Override
    public boolean onMainBackPressed() {
        runOnUiThread(() -> lay.removeView(webView));
        return super.onMainBackPressed();
    }
}
