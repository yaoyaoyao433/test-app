package com.sankuai.titans.jsbridges.base.knb;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.jsbridge.StrictJsBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CheckVersionJsHandler extends StrictJsBridge<CheckVersionParam, CheckVersionResult> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CheckVersionParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("apis")
        @Expose
        public List<String> apis;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CheckVersionResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("infos")
        @Expose
        public Map<String, String> infos = new HashMap();
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public boolean isSync(CheckVersionParam checkVersionParam) {
        return true;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public RespResult<CheckVersionResult> doExecSync(CheckVersionParam checkVersionParam) {
        Object[] objArr = {checkVersionParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6c2a863282c56b85d22460fbb591f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6c2a863282c56b85d22460fbb591f4f");
        }
        if (checkVersionParam == null || checkVersionParam.apis == null || checkVersionParam.apis.size() == 0) {
            return new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid).create();
        }
        CheckVersionResult checkVersionResult = new CheckVersionResult();
        for (String str : checkVersionParam.apis) {
            String jsHandlerApiVersion = getJsHandlerApiVersion(str);
            Map<String, String> map = checkVersionResult.infos;
            if (TextUtils.isEmpty(jsHandlerApiVersion)) {
                jsHandlerApiVersion = "0";
            }
            map.put(str, jsHandlerApiVersion);
        }
        return new RespResult.Builder().append((RespResult.Builder) checkVersionResult).create();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getJsHandlerApiVersion(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.titans.jsbridges.base.knb.CheckVersionJsHandler.changeQuickRedirect
            java.lang.String r10 = "26db5cd4b84e140c1a35c9e18646dd56"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 0
            java.lang.Class<com.sankuai.titans.protocol.jsbridge.AbsJsHandler> r1 = com.sankuai.titans.protocol.jsbridge.AbsJsHandler.class
            java.lang.String r2 = r11.method     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L39
            java.util.List r1 = com.sankuai.meituan.serviceloader.b.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L52
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L32
            goto L52
        L32:
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L39
            com.sankuai.titans.protocol.jsbridge.AbsJsHandler r1 = (com.sankuai.titans.protocol.jsbridge.AbsJsHandler) r1     // Catch: java.lang.Throwable -> L39
            goto L53
        L39:
            r1 = move-exception
            com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost r2 = r11.jsHost()
            com.sankuai.titans.protocol.context.ITitansContext r2 = r2.getTitansContext()
            com.sankuai.titans.protocol.services.IServiceManager r2 = r2.getServiceManager()
            com.sankuai.titans.protocol.services.IStatisticsService r2 = r2.getStatisticsService()
            java.lang.String r3 = "CheckVersionJsHandler"
            java.lang.String r4 = "getJsHandlerApiVersion"
            r2.reportClassError(r3, r4, r1)
        L52:
            r1 = r0
        L53:
            if (r1 == 0) goto L5a
            java.lang.String r12 = r1.getApiVersion()
            return r12
        L5a:
            java.lang.Class<com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate> r1 = com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate.class
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.util.List r1 = com.sankuai.meituan.serviceloader.b.a(r1, r0, r2)
            java.lang.Object r1 = r1.get(r8)
            com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate r1 = (com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate) r1
            if (r1 == 0) goto L75
            java.lang.String r12 = r1.getApiVersion(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L75
            return r12
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.jsbridges.base.knb.CheckVersionJsHandler.getJsHandlerApiVersion(java.lang.String):java.lang.String");
    }
}
