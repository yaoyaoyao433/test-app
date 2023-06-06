package com.meituan.android.neohybrid.framework.neo.js;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.SetTitleButtonJsHandler;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.BaseTitleBar;
import com.dianping.titans.widget.LineTitleLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.multiprocess.PublishReceiverManager;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.mapsdk.internal.y;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements KNBJsHost {
    public static ChangeQuickRedirect b;
    private final g a;
    protected boolean c;
    protected final Map<String, JsHandler> d;
    private TitansUIManager e;
    private String f;
    private CaptureJsHandler.BitmapCallbackListener g;
    private final Map<String, JsHandler> h;

    public abstract com.meituan.android.neohybrid.protocol.kernel.c<WebView> g();

    @Override // com.dianping.titans.js.JsHost
    public abstract Context getContext();

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public String getInnerURLKey() {
        return "";
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public String getPrefixURL() {
        return "";
    }

    @Override // com.dianping.titans.js.JsHost
    public abstract ITitleBar getTitleBarHost();

    @Override // com.dianping.titans.js.JsHost
    public String getTitleText() {
        return "";
    }

    @Override // com.dianping.titans.js.JsHost
    public int getWebTimeout() {
        return -1;
    }

    @Override // com.dianping.titans.js.JsHost
    public void hiddenWindow() {
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isBtnCloseShow() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public boolean isOnScroll() {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isShowTitlebarOnReceivedError() {
        return false;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public void onMessageReceive(String str, JSONObject jSONObject) {
    }

    @Override // com.dianping.titans.js.JsHost
    public String requestId() {
        return null;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public boolean setDynamicTitleBar(LineTitleLayout lineTitleLayout, ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public void setOnScroll(boolean z) {
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public void setWebViewCanPause(boolean z) {
    }

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public void share() {
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public void showMask(int i, String str, String str2) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21929cf665285e325d089d9c6d23d8c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21929cf665285e325d089d9c6d23d8c2");
            return;
        }
        this.a = new g();
        this.h = new ConcurrentHashMap();
        this.c = false;
        this.d = new ConcurrentHashMap();
    }

    @Override // com.dianping.titans.js.JsHost
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4434a15a9ede004a790f1a6dc2207522", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4434a15a9ede004a790f1a6dc2207522");
        }
        Context context = getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) getContext()).getBaseContext();
        }
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public WebView getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbc5451f15285b9d242d46b5eb531a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbc5451f15285b9d242d46b5eb531a9");
        }
        if (g().j() == null || !(g().j() instanceof WebView)) {
            return null;
        }
        return g().j();
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadJs(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901381918706c3deeac715952da25885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901381918706c3deeac715952da25885");
        } else if (getWebView() == null) {
        } else {
            Runnable a = b.a(this, str);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a.run();
            } else {
                post(a);
            }
        }
    }

    public static /* synthetic */ void b(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "336288450fc0f0b0e4dcc7514334f466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "336288450fc0f0b0e4dcc7514334f466");
        } else if (aVar.getWebView() == null) {
        } else {
            try {
                aVar.g().a(str.startsWith(TitansConstants.JAVASCRIPT_PREFIX) ? str.substring(TitansConstants.JAVASCRIPT_PREFIX.length()) : str, (ValueCallback<String>) null);
            } catch (Exception unused) {
                aVar.g().a(str);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a09fce96d37e8ea382aa7fdda1e96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a09fce96d37e8ea382aa7fdda1e96a");
        } else {
            loadUrl(str, null);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3d4f77ba0142c58a520c543e0426bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3d4f77ba0142c58a520c543e0426bd");
        } else {
            loadUrl(str, map, true);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map, boolean z) {
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083d10241379d6ad26e1019cdfb1a968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083d10241379d6ad26e1019cdfb1a968");
        } else if (g() == null) {
        } else {
            if (map != null) {
                g().a(str, map);
            } else {
                g().a(str);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a993c3fe325b659c3ebbf5946441f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a993c3fe325b659c3ebbf5946441f7");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            publish(jSONObject);
        } catch (JSONException e) {
            if (isDebug()) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5250380e5fcd17a10c1080fd9f5611d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5250380e5fcd17a10c1080fd9f5611d1");
            return;
        }
        try {
            jSONObject.put("status", "action");
            JsHandler jsHandler = this.h.get(jSONObject.optString("action"));
            if (jsHandler != null) {
                jsHandler.jsCallback(jSONObject);
            }
        } catch (JSONException e) {
            if (isDebug()) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public LinearLayout getLayWeb() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632331dbab10d18b02135c8f4ebb11ce", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632331dbab10d18b02135c8f4ebb11ce") : new LinearLayout(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab2b17d8390360f18d3b504c91a044b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab2b17d8390360f18d3b504c91a044b");
        } else if (getActivity() == null || getActivity().isDestroyed() || getContext() == null) {
        } else {
            if (!(getContext() instanceof Activity)) {
                intent.addFlags(y.a);
            }
            getContext().startActivity(intent);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c40899e0739acf91ef888a9f8e77f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c40899e0739acf91ef888a9f8e77f7");
        } else if (getActivity() == null || getActivity().isDestroyed() || getContext() == null) {
        } else {
            getActivity().startActivityForResult(intent, i);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void finish() {
        Handler handler;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7473450811801920040824db4fd64908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7473450811801920040824db4fd64908");
            return;
        }
        if (getWebView() != null && (handler = getWebView().getHandler()) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a489d2b88792460899c3cf4da368f302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a489d2b88792460899c3cf4da368f302");
        } else {
            getWebView().post(runnable);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void putJsHandler(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f86797a81446008ebe530874bea09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f86797a81446008ebe530874bea09f");
        } else {
            this.d.put(jsHandler.jsBean().method, jsHandler);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void subscribe(String str, JsHandler jsHandler) {
        Object[] objArr = {str, jsHandler};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae33f0c98e4b215b5b00ea031bd16c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae33f0c98e4b215b5b00ea031bd16c7");
            return;
        }
        this.h.put(str, jsHandler);
        this.c = PublishReceiverManager.registerReceiver(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public void unsubscribe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9081204c4634cba944345b3ead7160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9081204c4634cba944345b3ead7160");
        } else {
            this.h.remove(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public JsHandler getJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b960c508c3f27f5dffad8a2860693208", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b960c508c3f27f5dffad8a2860693208") : this.d.get(str);
    }

    @Override // com.dianping.titans.js.JsHost
    public void resetJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c302d1be2dca28692c547c5b748481d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c302d1be2dca28692c547c5b748481d");
        } else if (getContext() != null) {
            for (Map.Entry<String, JsHandler> entry : this.d.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    entry.getValue().onDestroy();
                }
            }
            this.d.clear();
            this.h.clear();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae8fc95753920c1455d343ef297f26a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae8fc95753920c1455d343ef297f26a6");
            } else {
                setBackgroundColor(0);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0812c123e524c3d53ba8b8f0e35b35ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0812c123e524c3d53ba8b8f0e35b35ec");
        } else if (getWebView() != null) {
            getWebView().setBackgroundColor(i);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void replaceTitleBar(BaseTitleBar baseTitleBar) {
        Object[] objArr = {baseTitleBar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bdf941b591746b840d9c663410e031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bdf941b591746b840d9c663410e031");
            return;
        }
        for (JsHandler jsHandler : this.d.values()) {
            if (jsHandler instanceof SetTitleButtonJsHandler) {
                ((SetTitleButtonJsHandler) jsHandler).setTitleButton();
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd72f2e501a06f017c561351173dbad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd72f2e501a06f017c561351173dbad0");
        } else if (getWebView() != null && getWebView().canGoBack()) {
            getWebView().goBack();
        } else {
            finish();
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public String getVersionName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71e0b63e201a00744f8d68733cca053", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71e0b63e201a00744f8d68733cca053") : this.a.a(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public String getPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae61413528520eba2e037106ccec53bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae61413528520eba2e037106ccec53bc") : getContext() == null ? "" : getContext().getPackageName();
    }

    @Override // com.dianping.titans.js.JsHost
    public String getUrl() {
        return this.f;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUrl(String str) {
        this.f = str;
    }

    @Override // com.dianping.titans.js.JsHost
    public TextView getTvUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe84765da8a257c06951c3b4545edcc1", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe84765da8a257c06951c3b4545edcc1") : new TextView(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public FrameLayout getLayVideo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b512af317d09bd149e10a43ac68f3ee", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b512af317d09bd149e10a43ac68f3ee") : new FrameLayout(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isActivated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e9b8d9682c14f9f2f915a7b4e19830", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e9b8d9682c14f9f2f915a7b4e19830")).booleanValue() : UIUtil.isActivityLive(getActivity());
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae53f29360650dbf98ac83b14ca4c71", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae53f29360650dbf98ac83b14ca4c71")).booleanValue() : (getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isInWhiteList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331026693ee2c692562a60ceae13feed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331026693ee2c692562a60ceae13feed")).booleanValue() : UriUtil.hostEndWith(str, KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST));
    }

    @Override // com.dianping.titans.js.JsHost
    public void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Bitmap bitmap;
        Object[] objArr = {str, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ad0ffe1075bb83916af3fd96e2237d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ad0ffe1075bb83916af3fd96e2237d");
        } else if (g() == null) {
            if (bitmapCallbackListener != null) {
                bitmapCallbackListener.onGetBitmap(null, null);
            }
        } else {
            g().j().post(c.a(this, bitmapCallbackListener));
            try {
                if (TextUtils.equals(CaptureJsHandler.CAPTURE_TYPE_DEFAULT, str)) {
                    g gVar = this.a;
                    Activity activity = getActivity();
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = g.a;
                    if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "bfb8e1966619f6dec62ef30109d4497b", RobustBitConfig.DEFAULT_VALUE)) {
                        bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "bfb8e1966619f6dec62ef30109d4497b");
                    } else if (activity == null) {
                        bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
                    } else {
                        View decorView = activity.getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                        decorView.draw(new Canvas(createBitmap));
                        bitmap = createBitmap;
                    }
                    bitmapCallbackListener.onGetBitmap(bitmap, Bitmap.CompressFormat.JPEG);
                } else if (TextUtils.equals("webview", str)) {
                    g().j().post(d.a(this, bitmapCallbackListener));
                } else if (TextUtils.isEmpty(str) || !str.startsWith("#")) {
                } else {
                    g().j().post(e.a(this, str));
                    g().j().postDelayed(f.a(this), 10000L);
                }
            } catch (OutOfMemoryError unused) {
                bitmapCallbackListener.onOOM();
            }
        }
    }

    public static /* synthetic */ void b(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {aVar, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fae30cd785d2074c353b3a3828417f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fae30cd785d2074c353b3a3828417f3");
        } else {
            aVar.g = bitmapCallbackListener;
        }
    }

    public static /* synthetic */ void a(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {aVar, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4f361eaab6ff8da81e532e52a38297a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4f361eaab6ff8da81e532e52a38297a");
            return;
        }
        try {
            if (aVar.g().j() instanceof WebView) {
                g gVar = aVar.a;
                WebView j = aVar.g().j();
                Object[] objArr2 = {j};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "9ebe7ef4a634c47f5f5211909d8169ba", RobustBitConfig.DEFAULT_VALUE)) {
                    bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "9ebe7ef4a634c47f5f5211909d8169ba");
                } else if (j != null) {
                    bitmap = Bitmap.createBitmap(j.getWidth(), (int) (j.getContentHeight() * j.getScale()), Bitmap.Config.ARGB_8888);
                    j.draw(new Canvas(bitmap));
                }
                bitmapCallbackListener.onGetBitmap(bitmap, Bitmap.CompressFormat.JPEG);
            }
        } catch (OutOfMemoryError unused) {
            bitmapCallbackListener.onOOM();
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1565d4e8af7ad48f0a9bfe47d4df6aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1565d4e8af7ad48f0a9bfe47d4df6aaa");
            return;
        }
        aVar.loadJs(TitansConstants.JAVASCRIPT_PREFIX + "function jsGetPic(id){\n var str = 'getCapturePic://' + document.getElementById(id).toDataURL();\n console.log(str);\n}");
        aVar.loadJs("javascript:jsGetPic(\"" + str.substring(1) + "\")");
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a6e8a5402e2d5d0dceee14a63607e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a6e8a5402e2d5d0dceee14a63607e6a");
            return;
        }
        if (aVar.g != null) {
            aVar.g.onTimeOut();
        }
        aVar.g = null;
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8acee8610ad959ba2d13a27722b1616a", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8acee8610ad959ba2d13a27722b1616a") : new JSONObject();
    }

    @Override // com.dianping.titans.js.JsHost
    public void onWebViewTitleReceived(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561c085a44a64cc130915dea8080a3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561c085a44a64cc130915dea8080a3f9");
        } else {
            getTitleBarHost().setWebTitle(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getWebViewEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2334627a251c5f6408f40147ddd309a", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2334627a251c5f6408f40147ddd309a") : new JSONObject();
    }

    @Override // com.dianping.titans.js.JsHost
    public TitansUIManager getUIManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e129587270a8b326ec6070ff2baee7", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansUIManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e129587270a8b326ec6070ff2baee7");
        }
        if (this.e != null) {
            return this.e;
        }
        g gVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "23bd823eb78714d5fbd5bec7867ec30a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansUIManager) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "23bd823eb78714d5fbd5bec7867ec30a");
        }
        if (gVar.b == null) {
            gVar.b = new TitansUIManager();
            gVar.b.setBackIconId(R.drawable.knb_web_ic_home_as_up_indicator);
            gVar.b.setCloseIconId(R.drawable.knb_web_close_black);
            gVar.b.setCustomBackIconId(R.drawable.knb_web_ic_home_as_up_indicator);
            gVar.b.setSearchIconId(R.drawable.knb_web_ic_action_search);
            gVar.b.setSearchBarIconId(R.drawable.search_box_icon);
            gVar.b.setShareIconId(R.drawable.knb_web_ic_action_share);
            gVar.b.setMaskLayoutResId(R.layout.knb_network_error);
        }
        return gVar.b;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUIManager(TitansUIManager titansUIManager) {
        this.e = titansUIManager;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public LineTitleLayout getDynamicTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6baf628dbba724a11c00145004740b", RobustBitConfig.DEFAULT_VALUE) ? (LineTitleLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6baf628dbba724a11c00145004740b") : new LineTitleLayout(getContext());
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @Deprecated
    public JSONObject getHostState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0191dbb10589fae2430b79289cb412c", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0191dbb10589fae2430b79289cb412c") : new JSONObject();
    }
}
