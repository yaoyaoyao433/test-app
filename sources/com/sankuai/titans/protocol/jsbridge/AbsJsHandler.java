package com.sankuai.titans.protocol.jsbridge;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.annotations.Need;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.services.ILogger;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeErrorInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeTimingInfo;
import com.sankuai.titans.protocol.utils.JsonUtils;
import com.sankuai.titans.protocol.utils.ReflectUtils;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsJsHandler<T, R> implements IBridgeActions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Type actualType;
    public String args;
    public JSONObject argsJson;
    public String callbackId;
    private JsCallback jsCallback;
    private AbsJsHost jsHost;
    public String method;
    public String source;
    public long timeRecordT2;
    public long timeRecordT21;
    public long timeRecordT22;
    public long timeRecordT3;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface JsCallback {
        void jsCallback(JSONObject jSONObject);
    }

    public String getApiVersion() {
        return "1.0.0";
    }

    public String getSignature() {
        return "";
    }

    public boolean isApiSupported() {
        return true;
    }

    public boolean isSync(T t) {
        return false;
    }

    public abstract void jsCallback(R r);

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90d25815525fd9a0003aebe163728b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90d25815525fd9a0003aebe163728b4e");
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7041193be57866679fa9561bd0cb346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7041193be57866679fa9561bd0cb346");
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d8fb04d6c303a81487dde2153c8d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d8fb04d6c303a81487dde2153c8d8b");
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42b4070062e93f8e7f3f85decbca4578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42b4070062e93f8e7f3f85decbca4578");
        }
    }

    public AbsJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d315d25dd899571f502c15773c8d394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d315d25dd899571f502c15773c8d394");
        } else {
            this.actualType = null;
        }
    }

    public final void init(String str, String str2, AbsJsHost absJsHost, String str3, String str4) {
        Object[] objArr = {str, str2, absJsHost, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d608ce638f41adab4d6c0bd50862392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d608ce638f41adab4d6c0bd50862392");
            return;
        }
        this.jsHost = absJsHost;
        this.method = str;
        this.callbackId = str2;
        this.args = str3;
        this.source = str4;
        try {
            this.argsJson = new JSONObject(str3);
        } catch (Throwable unused) {
        }
    }

    public AbsJsHost jsHost() {
        return this.jsHost;
    }

    public R doExecSync(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85be6c580ef6d929df511f0c411e178d", RobustBitConfig.DEFAULT_VALUE)) {
            return (R) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85be6c580ef6d929df511f0c411e178d");
        }
        throw new UnsupportedOperationException("you must implement this func #onExecSync in subclass");
    }

    public void doExecAsync(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b59ad1739f8082d7dc0555880ef843", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("you must implement this func #onExecSync in subclass");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b59ad1739f8082d7dc0555880ef843");
    }

    public final void doExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c9b1e8a0fb947b8a780203af37ee8f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c9b1e8a0fb947b8a780203af37ee8f3");
            return;
        }
        this.timeRecordT21 = System.currentTimeMillis();
        if (!TextUtils.equals(this.source, TitansConstants.BridgeConstants.SOURCE_TITANS)) {
            this.jsHost.getTitansContext().getServiceManager().getStatisticsService().reportBridgeInfo(new BridgeInfo(this.method, this.source, this.jsHost.getPageContext().getOriginalUrl(), this.jsHost.getPageContext().getUrl()));
        }
        String str = this.method;
        reportToLogan("info", str, "KNB桥方法开始执行前，方法名: " + this.method + ", source: " + this.source + ", pageUrl" + this.jsHost.getPageContext().getUrl(), null);
        if (isApiSupported()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.titans.protocol.jsbridge.AbsJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00b9b4e9cd37c38515e7b455c573eccf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00b9b4e9cd37c38515e7b455c573eccf");
                        return;
                    }
                    try {
                        AbsJsHandler.this.execImpl();
                    } catch (Exception e) {
                        String originalUrl = (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getOriginalUrl();
                        String url = (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getUrl();
                        AbsJsHandler.this.jsHost.getTitansContext().getServiceManager().getStatisticsService().reportBridgeErrorInfo(new BridgeErrorInfo(AbsJsHandler.this.method, AbsJsHandler.this.args, AbsJsHandler.this.source, originalUrl, url, "", "ReferURL: " + AbsJsHandler.this.jsHost.getPageContext().getReferrer() + ", Exception during AbsJsHandler.doExec(), eStackTraceString: " + Log.getStackTraceString(e)));
                        AbsJsHandler absJsHandler = AbsJsHandler.this;
                        String str2 = AbsJsHandler.this.method;
                        absJsHandler.reportToLogan("error", str2, "KNB桥方法执行时出错，方法名: " + AbsJsHandler.this.method + ", source: " + AbsJsHandler.this.source + ", pageUrl" + AbsJsHandler.this.jsHost.getPageContext().getUrl(), e);
                    }
                }
            });
        } else {
            callbackResult(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_7_FuncNotSupport).create());
        }
        jsHost().getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.protocol.jsbridge.AbsJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f7ec3f0875560c5781da1e076c109601", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f7ec3f0875560c5781da1e076c109601");
                } else {
                    AbsJsHandler.this.jsHost().getUiManager().loadJs("javascript:window.DPApp && window.DPApp.dequeue && window.DPApp.dequeue()", null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportToLogan(String str, String str2, String str3, Exception exc) {
        Object[] objArr = {str, str2, str3, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "541009b7f07153eb0477fed8a5ed6a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "541009b7f07153eb0477fed8a5ed6a7d");
        } else if (this.jsHost == null || this.jsHost.getTitansContext() == null || this.jsHost.getTitansContext().getServiceManager() == null || this.jsHost.getTitansContext().getServiceManager().getLoggerManager() == null) {
        } else {
            ILogger iLoggerManager = this.jsHost.getTitansContext().getServiceManager().getLoggerManager().getInstance("AbsJsHandler");
            if (TextUtils.equals(str, "info")) {
                iLoggerManager.info(str2, str3);
            } else if (TextUtils.equals(str, "error")) {
                iLoggerManager.error(str2, str3, exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execImpl() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.titans.protocol.jsbridge.AbsJsHandler.changeQuickRedirect
            java.lang.String r10 = "dd5f27b135e8d31d9483765fbd0094bb"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            java.lang.reflect.Type r0 = r11.getActualType()
            if (r0 != 0) goto L31
            com.sankuai.titans.protocol.jsbridge.RespResult$Builder r0 = new com.sankuai.titans.protocol.jsbridge.RespResult$Builder
            r0.<init>()
            com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo r1 = com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo.Error_2_JsBridgeInvalid
            com.sankuai.titans.protocol.jsbridge.RespResult$Builder r0 = r0.setResultInfo(r1)
            com.sankuai.titans.protocol.jsbridge.RespResult r0 = r0.create()
            r11.callbackResult(r0)
            return
        L31:
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r2 = 0
            if (r0 == r1) goto L48
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L3d
            java.lang.String r1 = r11.args
            goto L49
        L3d:
            com.google.gson.Gson r1 = com.sankuai.titans.protocol.utils.JsonUtils.getExcludeGson()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r11.args     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r1.fromJson(r3, r0)     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r1 = r2
        L49:
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L58
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            java.lang.Class r2 = r0.getClass()
            goto L5f
        L58:
            boolean r3 = r0 instanceof java.lang.Class
            if (r3 == 0) goto L5f
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
        L5f:
            if (r2 == 0) goto L73
            com.sankuai.titans.protocol.jsbridge.VerifyInfo r0 = r11.baseVerify(r2, r1)
            boolean r2 = r0.isResult()
            if (r2 != 0) goto L73
            com.sankuai.titans.protocol.jsbridge.RespResult r0 = r0.getErrorInfo()
            r11.callbackResult(r0)
            return
        L73:
            com.sankuai.titans.protocol.jsbridge.VerifyInfo r0 = r11.doVerify(r1)
            if (r0 != 0) goto L7a
            return
        L7a:
            boolean r2 = r0.isResult()
            if (r2 != 0) goto L88
            com.sankuai.titans.protocol.jsbridge.RespResult r0 = r0.getErrorInfo()
            r11.callbackResult(r0)
            return
        L88:
            boolean r0 = r11.isSync(r1)
            if (r0 == 0) goto L96
            java.lang.Object r0 = r11.doExecSync(r1)
            r11.jsCallback(r0)
            return
        L96:
            r11.doExecAsync(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.protocol.jsbridge.AbsJsHandler.execImpl():void");
    }

    private VerifyInfo baseVerify(@NonNull Class cls, Object obj) {
        Object[] objArr = {cls, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9532fd1a22d2e01fa697960d3efccf07", RobustBitConfig.DEFAULT_VALUE)) {
            return (VerifyInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9532fd1a22d2e01fa697960d3efccf07");
        }
        if (obj == null) {
            return cls.getAnnotation(Need.class) != null ? VerifyInfo.FAIL(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_2_JsBridgeInvalid).create()) : new VerifyInfo(true, null);
        }
        ArrayList arrayList = new ArrayList();
        boolean respBaseVerifyInfo = getRespBaseVerifyInfo(cls, obj, arrayList);
        String str = arrayList.size() == 0 ? null : arrayList.get(0);
        if (respBaseVerifyInfo) {
            return new VerifyInfo(true, null);
        }
        RespResult.Builder builder = new RespResult.Builder();
        int code = JsHandlerResultInfo.Error_3_ParamsInvalid.code();
        if (TextUtils.isEmpty(str)) {
            str = JsHandlerResultInfo.Error_3_ParamsInvalid.name();
        }
        return VerifyInfo.FAIL(builder.setResultInfo(code, str).create());
    }

    private boolean getRespBaseVerifyInfo(@NonNull Class cls, Object obj, List<String> list) {
        do {
            Object[] objArr = {cls, obj, list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6577ca30934581ff09d8fc05c455c93f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6577ca30934581ff09d8fc05c455c93f")).booleanValue();
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields == null || declaredFields.length == 0) {
                return true;
            }
            for (Field field : declaredFields) {
                if (field.getAnnotation(Need.class) != null) {
                    if (obj == null) {
                        list.add("need field: " + field.getName());
                        return false;
                    } else {
                        field.setAccessible(true);
                        try {
                            obj = field.get(obj);
                        } catch (Throwable unused) {
                            obj = null;
                        }
                        if (obj == null) {
                            list.add("need field: " + field.getName());
                            return false;
                        }
                        cls = obj.getClass();
                    }
                }
            }
            return true;
        } while (cls != Object.class);
        return true;
    }

    public VerifyInfo doVerify(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbc9349a752c076d6126b939b3aa97f", RobustBitConfig.DEFAULT_VALUE) ? (VerifyInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbc9349a752c076d6126b939b3aa97f") : new VerifyInfo(null);
    }

    public void callbackResult(RespResult respResult) {
        Object[] objArr = {respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f28e5dbe7e69c1220f78c982c6e7309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f28e5dbe7e69c1220f78c982c6e7309");
        } else if (respResult == null) {
        } else {
            try {
                Gson excludeGson = JsonUtils.getExcludeGson();
                JSONObject jSONObject = new JSONObject(excludeGson.toJson(respResult));
                if (respResult.getResultData().size() > 0) {
                    JSONObject jSONObject2 = new JSONObject(excludeGson.toJson(respResult.getResultData()));
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
                callbackImplJson(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bcd60f2128aefcee204a5341830971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bcd60f2128aefcee204a5341830971");
        } else {
            callbackImplJson(jSONObject);
        }
    }

    public void callbackImplJson(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40954b2c2db1094315d0e79a17edf350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40954b2c2db1094315d0e79a17edf350");
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.timeRecordT22 = System.currentTimeMillis();
        if (this.jsCallback != null) {
            try {
                jSONObject.put("callbackId", this.callbackId);
                this.jsCallback.jsCallback(jSONObject);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        this.jsHost.getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.protocol.jsbridge.AbsJsHandler.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                String str;
                int i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab34179dfbb9658d58920ae56bfcbef2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab34179dfbb9658d58920ae56bfcbef2");
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("nativeReceivedTimestamp", AbsJsHandler.this.timeRecordT2);
                    AbsJsHandler absJsHandler = AbsJsHandler.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    absJsHandler.timeRecordT3 = currentTimeMillis;
                    jSONObject3.put("nativeCallbackTimestamp", currentTimeMillis);
                    jSONObject2.put(SnifferDBHelper.COLUMN_LOG, jSONObject3);
                    jSONObject.put("knbExtra", jSONObject2);
                } catch (Throwable unused2) {
                }
                String str2 = "DPApp";
                if (!TextUtils.isEmpty(AbsJsHandler.this.callbackId)) {
                    int indexOf = AbsJsHandler.this.callbackId.indexOf(CommonConstant.Symbol.UNDERLINE);
                    int length = AbsJsHandler.this.callbackId.length();
                    if (indexOf >= 0 && (i = indexOf + 1) < length) {
                        str2 = AbsJsHandler.this.callbackId.substring(i);
                    }
                }
                String str3 = str2;
                try {
                    if (TextUtils.equals(jSONObject.optString("status"), "fail")) {
                        String originalUrl = (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getOriginalUrl();
                        String url = (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getUrl();
                        String optString = jSONObject.optString("errorCode");
                        String str4 = "ReferURL: " + AbsJsHandler.this.jsHost.getPageContext().getReferrer() + ", Callback ErrMsg: ";
                        String optString2 = jSONObject.optString("errMsg");
                        String optString3 = jSONObject.optString("errorMsg");
                        if (!TextUtils.isEmpty(optString2)) {
                            str = str4 + optString2;
                        } else if (!TextUtils.isEmpty(optString3)) {
                            str = str4 + optString3;
                        } else {
                            str = str4 + "this bridge has no error message";
                        }
                        AbsJsHandler.this.jsHost.getTitansContext().getServiceManager().getStatisticsService().reportBridgeErrorInfo(new BridgeErrorInfo(AbsJsHandler.this.method, AbsJsHandler.this.args, AbsJsHandler.this.source, originalUrl, url, optString, str));
                        AbsJsHandler.this.reportToLogan("info", AbsJsHandler.this.method, "KNB桥方法执行完，回调状态为失败，方法名: " + AbsJsHandler.this.method + ", source: " + AbsJsHandler.this.source + ", errorCode: " + optString + ", errorMessage: " + str + ", pageUrl" + AbsJsHandler.this.jsHost.getPageContext().getUrl(), null);
                    } else if (TextUtils.equals(jSONObject.optString("status"), "success")) {
                        AbsJsHandler.this.jsHost.getTitansContext().getServiceManager().getStatisticsService().reportBridgeTimingInfo(new BridgeTimingInfo(AbsJsHandler.this.method, AbsJsHandler.this.source, (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getOriginalUrl(), (AbsJsHandler.this.jsHost == null || AbsJsHandler.this.jsHost.getPageContext() == null) ? "" : AbsJsHandler.this.jsHost.getPageContext().getUrl(), AbsJsHandler.this.timeRecordT2, AbsJsHandler.this.timeRecordT21, AbsJsHandler.this.timeRecordT22, AbsJsHandler.this.timeRecordT3));
                        AbsJsHandler.this.reportToLogan("info", AbsJsHandler.this.method, "KNB桥方法执行完，回调状态为成功，方法名: " + AbsJsHandler.this.method + ", source: " + AbsJsHandler.this.source + ", pageUrl" + AbsJsHandler.this.jsHost.getPageContext().getUrl(), null);
                    }
                } catch (Throwable th) {
                    AbsJsHandler.this.jsHost.getTitansContext().getServiceManager().getStatisticsService().reportClassError("AbsJsHandler", "callbackImplJson-run", th);
                    AbsJsHandler.this.reportToLogan("error", AbsJsHandler.this.method, "KNB桥方法执行完，回调时出错exception: " + AbsJsHandler.this.method + ", source: " + AbsJsHandler.this.source + ", pageUrl" + AbsJsHandler.this.jsHost.getPageContext().getUrl(), (Exception) th);
                }
                AbsJsHandler.this.jsHost().getUiManager().loadJs("javascript:window." + str3 + " && window." + str3 + ".callback && window." + str3 + ".callback('" + AbsJsHandler.this.callbackId + "'," + jSONObject.toString() + ");", null);
            }
        });
    }

    public void setJsCallback(JsCallback jsCallback) {
        this.jsCallback = jsCallback;
    }

    public String getMethod() {
        return this.method;
    }

    private Type getActualType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5375e4403c90757b982a1c1441fe3c6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5375e4403c90757b982a1c1441fe3c6a");
        }
        if (this.actualType != null) {
            return this.actualType;
        }
        for (Class<?> cls = getClass(); this.actualType == null && cls != Object.class; cls = cls.getSuperclass()) {
            try {
                this.actualType = ReflectUtils.getActualTypeArguments(cls, 0);
            } catch (Throwable unused) {
            }
            if (this.actualType != null) {
                break;
            }
        }
        return this.actualType != null ? this.actualType : Void.class;
    }
}
