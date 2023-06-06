package com.dianping.titans.js;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class CommonJsHost implements JsHost {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Activity activity;
    protected final HashMap<String, JsHandler> mSubscribeJsHandlerMap;

    @Override // com.dianping.titans.js.JsHost
    public abstract void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener);

    @Override // com.dianping.titans.js.JsHost
    public JsHandler getJsHandler(String str) {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public FrameLayout getLayVideo() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public LinearLayout getLayWeb() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getResult() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public ITitleBar getTitleBarHost() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getTitleText() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public TextView getTvUrl() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public TitansUIManager getUIManager() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getUrl() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getVersionName() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public int getWebTimeout() {
        return 0;
    }

    @Override // com.dianping.titans.js.JsHost
    public WebView getWebView() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getWebViewEnv() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public void goBack() {
    }

    @Override // com.dianping.titans.js.JsHost
    public void hiddenWindow() {
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isBtnCloseShow() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isDebug() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isInWhiteList(String str) {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isOnScroll() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isShowTitlebarOnReceivedError() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadJs(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map, boolean z) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void onWebViewTitleReceived(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void putJsHandler(JsHandler jsHandler) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void replaceTitleBar(BaseTitleBar baseTitleBar) {
    }

    @Override // com.dianping.titans.js.JsHost
    public String requestId() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public void resetJsHandler() {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setBackgroundColor(int i) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setOnScroll(boolean z) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setTitle(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUIManager(TitansUIManager titansUIManager) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUrl(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void share() {
    }

    @Override // com.dianping.titans.js.JsHost
    public void showMask() {
    }

    public CommonJsHost(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "416746a54ac71e384e788db54222a0a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "416746a54ac71e384e788db54222a0a8");
            return;
        }
        this.mSubscribeJsHandlerMap = new HashMap<>();
        this.activity = activity;
    }

    @Override // com.dianping.titans.js.JsHost
    public void subscribe(String str, JsHandler jsHandler) {
        Object[] objArr = {str, jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "693fef1bc8d4352e28d72c2690129687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "693fef1bc8d4352e28d72c2690129687");
        } else {
            this.mSubscribeJsHandlerMap.put(str, jsHandler);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void unsubscribe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dd42db56a9428aa5a40aa717eaf1530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dd42db56a9428aa5a40aa717eaf1530");
        } else {
            this.mSubscribeJsHandlerMap.remove(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db40e055a06ccf3f5f1302af7cda806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db40e055a06ccf3f5f1302af7cda806");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException unused) {
        }
        publish(jSONObject);
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd9b93db8c3307a57887a57a166d1f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd9b93db8c3307a57887a57a166d1f65");
            return;
        }
        try {
            jSONObject.put("status", "action");
        } catch (JSONException unused) {
        }
        JsHandler jsHandler = this.mSubscribeJsHandlerMap.get(jSONObject.optString("action"));
        if (jsHandler != null) {
            jsHandler.jsCallback(jSONObject);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e99302339398cb075bbfa9fbe84ee26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e99302339398cb075bbfa9fbe84ee26");
        } else {
            this.activity.runOnUiThread(runnable);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1db8736578739405d1d7b15c302cc3e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1db8736578739405d1d7b15c302cc3e0");
        } else {
            this.activity.startActivity(intent);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922341fbf589428d2e02b8f4feca2a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922341fbf589428d2e02b8f4feca2a58");
        } else {
            this.activity.startActivityForResult(intent, i);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78c2a6cbd181a8895cd94d0c7f0c6648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78c2a6cbd181a8895cd94d0c7f0c6648");
        } else {
            this.activity.finish();
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public Context getContext() {
        return this.activity;
    }

    @Override // com.dianping.titans.js.JsHost
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isActivated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5059daebdf5e086a92bd6de56440af39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5059daebdf5e086a92bd6de56440af39")).booleanValue() : (this.activity == null || this.activity.isFinishing() || this.activity.isDestroyed()) ? false : true;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34d418001bf84b2f1dbcded9d3d26b7b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34d418001bf84b2f1dbcded9d3d26b7b") : this.activity.getPackageName();
    }
}
