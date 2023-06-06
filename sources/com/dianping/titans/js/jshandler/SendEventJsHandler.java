package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendEventJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: JSONException -> 0x00cd, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:29:0x0091, B:31:0x0099, B:33:0x00a1, B:34:0x00b7), top: B:41:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[Catch: JSONException -> 0x00cd, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:29:0x0091, B:31:0x0099, B:33:0x00a1, B:34:0x00b7), top: B:41:0x0091 }] */
    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void exec() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.titans.js.jshandler.SendEventJsHandler.changeQuickRedirect
            java.lang.String r10 = "ab3a31bc597f0a6236a42a295c72cd61"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            return
        L18:
            com.dianping.titans.js.JsHost r1 = r12.jsHost()
            if (r1 != 0) goto L24
            java.lang.String r0 = "no host"
            r12.jsCallbackErrorMsg(r0)
            return
        L24:
            com.dianping.titans.js.JsBean r2 = r12.jsBean()
            org.json.JSONObject r2 = r2.argsJson
            if (r2 == 0) goto Lce
            java.lang.String r3 = "frame"
            java.lang.String r3 = r2.optString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3a
            goto Lce
        L3a:
            boolean r4 = r1 instanceof com.dianping.titans.js.KNBJsHost
            if (r4 == 0) goto Lcd
            r4 = r1
            com.dianping.titans.js.KNBJsHost r4 = (com.dianping.titans.js.KNBJsHost) r4
            org.json.JSONObject r4 = r4.getHostState()
            java.lang.String r5 = "value"
            boolean r5 = r2.has(r5)
            r6 = -1
            if (r5 == 0) goto L60
            java.lang.String r5 = "value"
            double r8 = r2.getDouble(r5)     // Catch: org.json.JSONException -> L60
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8
            goto L61
        L60:
            r8 = r6
        L61:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L71
            java.lang.String r5 = "page_start_load_time"
            long r5 = r4.optLong(r5)
            long r7 = java.lang.System.currentTimeMillis()
            long r8 = r7 - r5
        L71:
            java.lang.String r1 = r1.getUrl()
            java.lang.String r5 = "page"
            boolean r5 = r2.isNull(r5)
            if (r5 != 0) goto L83
            java.lang.String r1 = "page"
            java.lang.String r1 = r2.optString(r1)
        L83:
            com.sankuai.titans.EventReporter r2 = com.sankuai.titans.EventReporter.getInstance()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.reportTiming(r3, r1, r8)
            r12.jsCallback()
            java.lang.String r1 = "Page.TTI"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: org.json.JSONException -> Lcd
            if (r1 != 0) goto Lb7
            java.lang.String r1 = "page_tti_done"
            boolean r0 = r4.optBoolean(r1, r0)     // Catch: org.json.JSONException -> Lcd
            if (r0 != 0) goto Lcd
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcd
            r0.<init>()     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "frame"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lcd
            com.dianping.titans.js.JsHost r1 = r12.jsHost()     // Catch: org.json.JSONException -> Lcd
            com.dianping.titans.js.KNBJsHost r1 = (com.dianping.titans.js.KNBJsHost) r1     // Catch: org.json.JSONException -> Lcd
            java.lang.String r2 = "Send.Event"
            r1.onMessageReceive(r2, r0)     // Catch: org.json.JSONException -> Lcd
            goto Lcd
        Lb7:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcd
            r0.<init>()     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "frame"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lcd
            com.dianping.titans.js.JsHost r1 = r12.jsHost()     // Catch: org.json.JSONException -> Lcd
            com.dianping.titans.js.KNBJsHost r1 = (com.dianping.titans.js.KNBJsHost) r1     // Catch: org.json.JSONException -> Lcd
            java.lang.String r2 = "Send.Event"
            r1.onMessageReceive(r2, r0)     // Catch: org.json.JSONException -> Lcd
            return
        Lcd:
            return
        Lce:
            java.lang.String r0 = "no frame"
            r12.jsCallbackErrorMsg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.SendEventJsHandler.exec():void");
    }
}
