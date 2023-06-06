package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AddRequestSignatureJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mHasCheckMethod;
    private Method mRequestSignatureMethod;
    private Method mRequestSignatureMethodV4;

    public AddRequestSignatureJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93271d0c973a058d7e6af0f2cbd8d2c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93271d0c973a058d7e6af0f2cbd8d2c8");
        } else {
            this.mHasCheckMethod = false;
        }
    }

    private boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2e90725de6956a4e2f9dbde59b2c52d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2e90725de6956a4e2f9dbde59b2c52d")).booleanValue();
        }
        if (!this.mHasCheckMethod) {
            try {
                try {
                    this.mRequestSignatureMethodV4 = Class.forName("com.meituan.android.common.mtguard.NBridge").getDeclaredMethod("requestSignatureForWebViewV4", String.class, String.class, String.class, String.class, String.class, byte[].class);
                } catch (Exception unused) {
                    this.mRequestSignatureMethod = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("requestSignatureForWebView", String.class, String.class, String.class, String.class, String.class, byte[].class);
                } catch (Throwable th) {
                    this.mHasCheckMethod = true;
                    throw th;
                }
            } catch (Throwable unused2) {
            }
            this.mHasCheckMethod = true;
        }
        return (this.mRequestSignatureMethodV4 == null && this.mRequestSignatureMethod == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: Throwable -> 0x00d8, TryCatch #0 {Throwable -> 0x00d8, blocks: (B:10:0x0027, B:12:0x0061, B:14:0x0069, B:20:0x007d, B:22:0x008c, B:24:0x00d4, B:23:0x00ae, B:15:0x006e, B:17:0x0076), top: B:29:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[Catch: Throwable -> 0x00d8, TryCatch #0 {Throwable -> 0x00d8, blocks: (B:10:0x0027, B:12:0x0061, B:14:0x0069, B:20:0x007d, B:22:0x008c, B:24:0x00d4, B:23:0x00ae, B:15:0x006e, B:17:0x0076), top: B:29:0x0027 }] */
    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void exec() {
        /*
            r16 = this;
            r8 = r16
            r0 = 0
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.titans.js.jshandler.AddRequestSignatureJsHandler.changeQuickRedirect
            java.lang.String r11 = "86a98516baa39efdf8c34901682b574a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r9
            r2 = r16
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r10, r0, r11)
            return
        L1b:
            boolean r1 = r16.prepare()
            if (r1 != 0) goto L27
            java.lang.String r0 = "no MTGuard"
            r8.jsCallbackErrorMsg(r0)
            return
        L27:
            com.dianping.titans.js.JsBean r1 = r16.jsBean()     // Catch: java.lang.Throwable -> Ld8
            org.json.JSONObject r1 = r1.argsJson     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "method"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = "url"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = "header"
            java.lang.String r4 = r1.optString(r4)     // Catch: java.lang.Throwable -> Ld8
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = "userAgent"
            java.lang.String r4 = r5.optString(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r6 = "contentEncoding"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r7 = "contentType"
            java.lang.String r5 = r5.optString(r7)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r7 = "POST"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Ld8
            r9 = 0
            if (r7 == 0) goto L6e
            java.lang.String r7 = "body"
            java.lang.String r1 = r1.optString(r7, r9)     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto L7c
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> Ld8
            goto L7d
        L6e:
            java.lang.String r1 = "GET"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Ld8
            if (r1 != 0) goto L7c
            java.lang.String r0 = "ill method"
            r8.jsCallbackErrorMsg(r0)     // Catch: java.lang.Throwable -> Ld8
            return
        L7c:
            r1 = r9
        L7d:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r7.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.reflect.Method r10 = r8.mRequestSignatureMethodV4     // Catch: java.lang.Throwable -> Ld8
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 1
            r9 = 6
            if (r10 == 0) goto Lae
            java.lang.reflect.Method r10 = r8.mRequestSignatureMethodV4     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Ld8
            r9[r0] = r2     // Catch: java.lang.Throwable -> Ld8
            r9[r15] = r3     // Catch: java.lang.Throwable -> Ld8
            r9[r14] = r4     // Catch: java.lang.Throwable -> Ld8
            r9[r13] = r6     // Catch: java.lang.Throwable -> Ld8
            r9[r12] = r5     // Catch: java.lang.Throwable -> Ld8
            r9[r11] = r1     // Catch: java.lang.Throwable -> Ld8
            r0 = 0
            java.lang.Object r0 = r10.invoke(r0, r9)     // Catch: java.lang.Throwable -> Ld8
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "mtgsig"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            r7.put(r1, r2)     // Catch: java.lang.Throwable -> Ld8
            goto Ld4
        Lae:
            java.lang.reflect.Method r10 = r8.mRequestSignatureMethod     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Ld8
            r9[r0] = r2     // Catch: java.lang.Throwable -> Ld8
            r9[r15] = r3     // Catch: java.lang.Throwable -> Ld8
            r9[r14] = r4     // Catch: java.lang.Throwable -> Ld8
            r9[r13] = r6     // Catch: java.lang.Throwable -> Ld8
            r9[r12] = r5     // Catch: java.lang.Throwable -> Ld8
            r9[r11] = r1     // Catch: java.lang.Throwable -> Ld8
            r0 = 0
            java.lang.Object r0 = r10.invoke(r0, r9)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch: java.lang.Throwable -> Ld8
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> Ld8
        Ld4:
            r8.jsCallback(r7)     // Catch: java.lang.Throwable -> Ld8
            return
        Ld8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r8.jsCallbackErrorMsg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.AddRequestSignatureJsHandler.exec():void");
    }
}
