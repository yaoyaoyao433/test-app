package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.utils.EventReporter;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseJsHandler implements JsHandler {
    public static final int ERROR_CODE_METHOD_NOT_IMPLEMENTED = -504;
    public static final String ERROR_MSG_METHOD_NOT_IMPLEMENTED = "method not implemented";
    private static final String SCENE_TOKEN = "sceneToken";
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isVerfying;
    private volatile JsCallback jsCallback;
    protected JsHandlerReportStrategy jsHandlerReportStrategy;
    protected JsHandlerVerifyStrategy jsHandlerVerifyStrategy;
    protected final JsBean mJsBean;
    protected JsHost mJsHost;
    public long timeRecordT2;
    public long timeRecordT21;
    public long timeRecordT22;
    public long timeRecordT3;

    public abstract void exec();

    public String getApiVersion() {
        return "1.0.0";
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public int getAuthority() {
        return -1;
    }

    public String getSignature() {
        return "";
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public boolean isApiSupported() {
        return true;
    }

    public boolean isExecInCurrentThread() {
        return false;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c21d9be5f759ca1a221950577807e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c21d9be5f759ca1a221950577807e74");
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6eab83c1714aa1479883643fa23ff51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6eab83c1714aa1479883643fa23ff51");
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void setAuthority(int i) {
    }

    public BaseJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f859fb44dd4fd7dbec2b12d44755d60d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f859fb44dd4fd7dbec2b12d44755d60d");
            return;
        }
        this.mJsBean = new JsBean();
        this.isVerfying = false;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void setJsHost(JsHost jsHost) {
        this.mJsHost = jsHost;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void setJsHandlerVerifyStrategy(JsHandlerVerifyStrategy jsHandlerVerifyStrategy) {
        this.jsHandlerVerifyStrategy = jsHandlerVerifyStrategy;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void setJsHandlerReportStrategy(JsHandlerReportStrategy jsHandlerReportStrategy) {
        this.jsHandlerReportStrategy = jsHandlerReportStrategy;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void setJsCallback(JsCallback jsCallback) {
        this.jsCallback = jsCallback;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public JsBean jsBean() {
        return this.mJsBean;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public JsHost jsHost() {
        return this.mJsHost;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void doExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15f705b194aa12dc6c4df462e8b6b2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15f705b194aa12dc6c4df462e8b6b2ec");
            return;
        }
        this.timeRecordT21 = System.currentTimeMillis();
        this.isVerfying = false;
        if (jsBean().source != JsHandler.Source.TITANS) {
            this.jsHandlerReportStrategy.reportBridgeArrival(jsBean().method, jsBean().source, jsBean().argsJson.optString("__biz_id"));
            b.a aVar = new b.a();
            aVar.b = b.EnumC0496b.TITANS;
            aVar.c = jsBean().source.name();
            aVar.d = jsBean().method;
            b.a(aVar);
        }
        if (this.jsHandlerVerifyStrategy == null || this.jsHandlerVerifyStrategy.verify(this)) {
            if (isApiSupported()) {
                if (isExecInCurrentThread()) {
                    try {
                        c.a(this.mJsBean.method + " bridge exec in current thread " + Thread.currentThread().getName(), 35, new String[]{"BaseJsHandler"});
                        exec();
                    } catch (Throwable th) {
                        EventReporter.reportException("SyncBridge_Exec", jsHost().getUrl(), th);
                        jsCallbackError(8, Log.getStackTraceString(th));
                    }
                } else {
                    jsHost().post(new Runnable() { // from class: com.dianping.titans.js.jshandler.BaseJsHandler.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7deb328567398db3c90427bc87fcc50a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7deb328567398db3c90427bc87fcc50a");
                                return;
                            }
                            try {
                                BaseJsHandler.this.exec();
                            } catch (Exception e) {
                                EventReporter.reportException("AsyncBridge_Exec", BaseJsHandler.this.jsHost().getUrl(), e);
                                BaseJsHandler.this.jsCallbackError(8, Log.getStackTraceString(e));
                            }
                        }
                    });
                }
            } else {
                jsCallbackError(ERROR_CODE_METHOD_NOT_IMPLEMENTED, ERROR_MSG_METHOD_NOT_IMPLEMENTED);
            }
        } else if (this.isVerfying) {
            jsCallbackError(-403, "ERR_IS_VERIFYING");
        } else {
            jsCallbackError(-403, "ERR_AUTHENTICATION_FAIL");
        }
        if (TextUtils.isEmpty(jsBean().callbackId)) {
            return;
        }
        jsHost().post(new Runnable() { // from class: com.dianping.titans.js.jshandler.BaseJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cf924f983bc314ca1083644a65b73acb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cf924f983bc314ca1083644a65b73acb");
                } else {
                    BaseJsHandler.this.jsHost().loadJs("javascript:window.DPApp && window.DPApp.dequeue && window.DPApp.dequeue()");
                }
            }
        });
    }

    public void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ea1f7000e312dddc59a390d26210056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ea1f7000e312dddc59a390d26210056");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errMsg", str);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    public void jsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "542b12feb64d8057f2e6270af0c795d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "542b12feb64d8057f2e6270af0c795d2");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorCode", i);
            jSONObject.put("errMsg", str);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    public void jsCallbackError(KNBJsErrorInfo kNBJsErrorInfo) {
        Object[] objArr = {kNBJsErrorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe18914659b128f3e0dadcb1f65b1374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe18914659b128f3e0dadcb1f65b1374");
        } else {
            jsCallbackError(kNBJsErrorInfo.getErrorCode(), kNBJsErrorInfo.getErrorMsg());
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void parseJsScheme(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8ef93e24568453414b5666b953c2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8ef93e24568453414b5666b953c2e0");
            return;
        }
        Uri parse = Uri.parse(str);
        jsBean().url = str;
        jsBean().method = parse.getQueryParameter("method");
        jsBean().args = parse.getQueryParameter("args");
        jsBean().callbackId = parse.getQueryParameter("callbackId");
        if (TextUtils.isEmpty(jsBean().callbackId)) {
            String url = jsHost() != null ? jsHost().getUrl() : "页面未知";
            EventReporter.reportException("BaseJsHandler_parseJsScheme", "page:" + url + ";jsHandler:" + str, new Exception("callbackId is null"));
        }
        jsBean().argsJson = new JSONObject(jsBean().args);
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1452d537d9978df3ac90eefd0a67984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1452d537d9978df3ac90eefd0a67984");
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.timeRecordT22 = System.currentTimeMillis();
        try {
            if (TextUtils.isEmpty(jSONObject.optString("status"))) {
                jSONObject.put("status", "success");
            }
            if (TextUtils.isEmpty(jSONObject.optString("result"))) {
                jSONObject.put("result", "next");
            }
        } catch (Exception unused) {
        }
        if (this.jsCallback != null) {
            try {
                jSONObject.put("callbackId", jsBean().callbackId);
            } catch (Throwable unused2) {
            }
            JsCallback jsCallback = this.jsCallback;
            if (jsCallback != null) {
                jsCallback.jsCallback(jSONObject);
            }
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.dianping.titans.js.jshandler.BaseJsHandler.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d5543ea8b44337e95e768a7731402642", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d5543ea8b44337e95e768a7731402642");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("sampleRate", 1.0d);
                        jSONObject3.put("t2", BaseJsHandler.this.timeRecordT2);
                        jSONObject3.put("t21", BaseJsHandler.this.timeRecordT21);
                        jSONObject3.put("t22", BaseJsHandler.this.timeRecordT22);
                        BaseJsHandler baseJsHandler = BaseJsHandler.this;
                        long currentTimeMillis = System.currentTimeMillis();
                        baseJsHandler.timeRecordT3 = currentTimeMillis;
                        jSONObject3.put("t3", currentTimeMillis);
                        jSONObject2.put(SnifferDBHelper.COLUMN_LOG, jSONObject3);
                        jSONObject.put("knbExtra", jSONObject2);
                    } catch (Throwable unused3) {
                    }
                    String str = "DPApp";
                    String str2 = BaseJsHandler.this.jsBean().callbackId;
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf = str2.indexOf(CommonConstant.Symbol.UNDERLINE);
                        int length = str2.length();
                        if (indexOf >= 0 && (i = indexOf + 1) < length) {
                            str = str2.substring(i);
                        }
                    }
                    BaseJsHandler.this.jsHost().loadJs("javascript:window." + str + " && window." + str + ".callback && window." + str + ".callback('" + str2 + "'," + jSONObject.toString() + ");");
                }
            });
        }
        if (this.jsHandlerReportStrategy != null) {
            this.jsHandlerReportStrategy.report(this, jSONObject);
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce34f409cd964705c5e5c4c130a8d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce34f409cd964705c5e5c4c130a8d47");
            return;
        }
        try {
            jsCallback(new JSONObject(str));
        } catch (JSONException unused) {
            String str2 = "DPApp";
            int indexOf = jsBean().callbackId.indexOf(CommonConstant.Symbol.UNDERLINE);
            int length = jsBean().callbackId.length();
            if (indexOf >= 0 && (i = indexOf + 1) < length) {
                str2 = jsBean().callbackId.substring(i);
            }
            jsHost().post(new JsRunnable(jsHost(), "javascript:window." + str2 + " && window." + str2 + ".callback && window." + str2 + ".callback('" + jsBean().callbackId + "'," + str + ");"));
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f42760e3613d293bfe53967a85899464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f42760e3613d293bfe53967a85899464");
        } else {
            jsCallback(new JSONObject());
        }
    }

    public String getSceneToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f5989bf84212cd78e6be410eb3f6173", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f5989bf84212cd78e6be410eb3f6173");
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || jsBean.argsJson == null) ? "" : jsBean.argsJson.optString("sceneToken");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class JsRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private WeakReference<JsHost> jsHostWeakReference;
        private String jsString;

        public JsRunnable(JsHost jsHost, String str) {
            Object[] objArr = {jsHost, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "189adddb8997b2111687495c8fecf6a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "189adddb8997b2111687495c8fecf6a3");
                return;
            }
            this.jsHostWeakReference = new WeakReference<>(jsHost);
            this.jsString = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2890c28f2622374a7b0b7b2f8144c523", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2890c28f2622374a7b0b7b2f8144c523");
                return;
            }
            JsHost jsHost = this.jsHostWeakReference.get();
            if (jsHost == null || TextUtils.isEmpty(this.jsString)) {
                return;
            }
            jsHost.loadJs(this.jsString);
        }
    }
}
