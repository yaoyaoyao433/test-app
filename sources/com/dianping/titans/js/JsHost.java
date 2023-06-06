package com.dianping.titans.js;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.BaseTitleBar;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JsHost {
    @Deprecated
    void finish();

    Activity getActivity();

    void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener);

    Context getContext();

    @Deprecated
    JsHandler getJsHandler(String str);

    @Deprecated
    FrameLayout getLayVideo();

    @Deprecated
    LinearLayout getLayWeb();

    @Deprecated
    String getPackageName();

    @Deprecated
    JSONObject getResult();

    @Deprecated
    ITitleBar getTitleBarHost();

    @Deprecated
    String getTitleText();

    @Deprecated
    TextView getTvUrl();

    @Deprecated
    TitansUIManager getUIManager();

    @Deprecated
    String getUrl();

    @Deprecated
    String getVersionName();

    @Deprecated
    int getWebTimeout();

    @Deprecated
    WebView getWebView();

    @Deprecated
    JSONObject getWebViewEnv();

    @Deprecated
    void goBack();

    @Deprecated
    void hiddenWindow();

    @Deprecated
    boolean isActivated();

    @Deprecated
    boolean isBtnCloseShow();

    @Deprecated
    boolean isDebug();

    @Deprecated
    boolean isInWhiteList(String str);

    @Deprecated
    boolean isOnScroll();

    @Deprecated
    boolean isShowTitlebarOnReceivedError();

    void loadJs(String str);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void loadUrl(String str, Map<String, String> map, boolean z);

    @Deprecated
    void onWebViewTitleReceived(String str);

    @Deprecated
    void post(Runnable runnable);

    void publish(String str);

    void publish(JSONObject jSONObject);

    @Deprecated
    void putJsHandler(JsHandler jsHandler);

    @Deprecated
    void replaceTitleBar(BaseTitleBar baseTitleBar);

    @Deprecated
    String requestId();

    @Deprecated
    void resetJsHandler();

    @Deprecated
    void setBackgroundColor(int i);

    @Deprecated
    void setOnScroll(boolean z);

    @Deprecated
    void setTitle(String str);

    @Deprecated
    void setUIManager(TitansUIManager titansUIManager);

    @Deprecated
    void setUrl(String str);

    @Deprecated
    void share();

    @Deprecated
    void showMask();

    @Deprecated
    void startActivity(Intent intent);

    @Deprecated
    void startActivityForResult(Intent intent, int i);

    @Deprecated
    void subscribe(String str, JsHandler jsHandler);

    @Deprecated
    void unsubscribe(String str);
}
