package com.bsmx.godotwebview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

public class GodotWebView extends GodotPlugin {
    public GodotWebView(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotWebView";
    }

//    private FrameLayout layout;
//    private WebView webView;

//    @Override
//    public View onMainCreate(Activity activity) {
//        layout = new FrameLayout(activity);
//        return layout;
//    }

    @SuppressLint("SetJavaScriptEnabled")
    @UsedByGodot
    public void open(@NonNull String url) {
        runOnUiThread(() -> {
            CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder()
                    .setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder()
                            .setToolbarColor(0xFF000000)
                            .build())
                    .setShowTitle(true)
                    .setShareState(CustomTabsIntent.SHARE_STATE_ON)
                    .build();

            customTabsIntent.launchUrl(getActivity(), Uri.parse(url));
        });
    }

//    @Override
//    public boolean onMainBackPressed() {
//        runOnUiThread(() -> layout.removeView(webView));
//        return false;
//    }

}
