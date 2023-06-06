package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CheckAuthorizationJsHandler extends BaseJsHandler {
    private static final String MODE_READ = "read";
    private static final String MODE_READ_AND_REQUEST = "readAndRequest";
    private static final int NOT_IMPLEMENTED = -404;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r2.equals(com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler.MODE_READ_AND_REQUEST) != false) goto L21;
     */
    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void exec() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler.changeQuickRedirect
            java.lang.String r10 = "f167712bd3f761d79e45a9c8e657c9e8"
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
            com.dianping.titans.js.JsBean r1 = r11.jsBean()
            org.json.JSONObject r1 = r1.argsJson
            java.lang.String r2 = "type"
            java.lang.String r1 = r1.optString(r2)
            com.dianping.titans.js.JsBean r2 = r11.jsBean()
            org.json.JSONObject r2 = r2.argsJson
            java.lang.String r3 = "mode"
            java.lang.String r2 = r2.optString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L3c
            java.lang.String r0 = "must have the type value."
            r11.jsCallbackErrorMsg(r0)
            return
        L3c:
            java.lang.String r3 = "location"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L4a
            r0 = -404(0xfffffffffffffe6c, float:NaN)
            r11.jsCallbackResult(r0)
            return
        L4a:
            java.lang.String r1 = r11.getSceneToken()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -1230679314(0xffffffffb6a552ee, float:-4.9270375E-6)
            if (r4 == r5) goto L68
            r0 = 3496342(0x355996, float:4.899419E-39)
            if (r4 == r0) goto L5e
            goto L71
        L5e:
            java.lang.String r0 = "read"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L71
            r0 = 1
            goto L72
        L68:
            java.lang.String r4 = "readAndRequest"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L71
            goto L72
        L71:
            r0 = -1
        L72:
            switch(r0) {
                case 0: goto L98;
                case 1: goto L85;
                default: goto L75;
            }
        L75:
            com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo r0 = com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid
            int r0 = r0.getErrorCode()
            com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo r1 = com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid
            java.lang.String r1 = r1.getErrorMsg()
            r11.jsCallbackResultRequestError(r0, r1)
            return
        L85:
            com.dianping.titans.js.JsHost r0 = r11.jsHost()
            android.app.Activity r0 = r0.getActivity()
            java.lang.String r2 = "Locate.once"
            com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler$2 r3 = new com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler$2
            r3.<init>()
            com.sankuai.titans.result.TitansPermissionUtil.checkSelfPermission(r0, r2, r1, r3)
            return
        L98:
            com.dianping.titans.js.JsHost r0 = r11.jsHost()
            android.app.Activity r0 = r0.getActivity()
            java.lang.String r2 = "Locate.once"
            com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler$1 r3 = new com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler$1
            r3.<init>()
            com.sankuai.titans.result.TitansPermissionUtil.requestPermission(r0, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler.exec():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackResultRequestError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3c8dafc31c615de8d8698639b2b023d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3c8dafc31c615de8d8698639b2b023d");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("auth", false);
            jSONObject.put("errorMsg", str);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackResult(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c16b6623f6672fe07630ea7ab46b75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c16b6623f6672fe07630ea7ab46b75b");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("auth", true);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
