package com.meituan.msi.api.report;

import com.dianping.monitor.impl.m;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReportApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    @com.meituan.msi.annotations.MsiApiMethod(name = "sendBabelLog", request = com.meituan.msi.api.report.BabelParam.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendBabelLog(com.meituan.msi.api.report.BabelParam r12, com.meituan.msi.bean.MsiContext r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msi.api.report.ReportApi.a
            java.lang.String r10 = "5dbb53d1404e056b45c3210b7f2a5ae0"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1e:
            r0 = 0
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r12.details     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L2b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r12.details     // Catch: java.lang.Exception -> L38
            r1.<init>(r2)     // Catch: java.lang.Exception -> L38
            goto L2c
        L2b:
            r1 = r0
        L2c:
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r12.raw     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L3e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L39
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r12.raw     // Catch: java.lang.Exception -> L39
            r2.<init>(r3)     // Catch: java.lang.Exception -> L39
            goto L3f
        L38:
            r1 = r0
        L39:
            java.lang.String r2 = "fail to create JSONObject"
            com.meituan.msi.log.a.a(r2)
        L3e:
            r2 = r0
        L3f:
            com.meituan.android.common.kitefly.Log$Builder r3 = new com.meituan.android.common.kitefly.Log$Builder
            java.lang.String r4 = r12.content
            r3.<init>(r4)
            java.lang.String r4 = r12.tag
            com.meituan.android.common.kitefly.Log$Builder r3 = r3.tag(r4)
            boolean r4 = r12.lv4LocalStatus
            com.meituan.android.common.kitefly.Log$Builder r3 = r3.lv4LocalStatus(r4)
            boolean r4 = r12.newLogStatus
            com.meituan.android.common.kitefly.Log$Builder r3 = r3.newLogStatus(r4)
            java.lang.Long r4 = r12.value
            if (r4 == 0) goto L65
            java.lang.Long r4 = r12.value
            long r4 = r4.longValue()
            r3.value(r4)
        L65:
            java.lang.String r4 = r12.category
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L72
            java.lang.String r4 = r12.category
            r3.reportChannel(r4)
        L72:
            java.lang.String r4 = r12.token
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L7f
            java.lang.String r4 = r12.token
            r3.token(r4)
        L7f:
            java.util.HashMap<java.lang.String, java.lang.Object> r4 = r12.options
            if (r4 == 0) goto L88
            java.util.HashMap<java.lang.String, java.lang.Object> r4 = r12.options
            r3.optional(r4)
        L88:
            if (r1 == 0) goto L91
            java.lang.String r1 = r1.toString()
            r3.details(r1)
        L91:
            if (r2 == 0) goto L9a
            java.lang.String r1 = r2.toString()
            r3.raw(r1)
        L9a:
            com.meituan.android.common.kitefly.Log r1 = r3.build()
            boolean r12 = r12.immediately
            if (r12 == 0) goto La6
            com.meituan.android.common.babel.Babel.logRT(r1)
            goto La9
        La6:
            com.meituan.android.common.babel.Babel.log(r1)
        La9:
            r13.onSuccess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.report.ReportApi.sendBabelLog(com.meituan.msi.api.report.BabelParam, com.meituan.msi.bean.MsiContext):void");
    }

    @MsiApiMethod(name = "sendCatLog", request = CatParam.class)
    public void sendCatLog(CatParam catParam, MsiContext msiContext) {
        Object[] objArr = {catParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3904f585d6e3cd46aa4a894ed1fdf30a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3904f585d6e3cd46aa4a894ed1fdf30a");
            return;
        }
        int e = a.e();
        if (e == -1) {
            msiContext.onError(400, "not set catAppId");
            return;
        }
        m mVar = new m(e, a.f());
        if (catParam.tags == null && catParam.values == null) {
            msiContext.onError(400, "param is empty");
            return;
        }
        if (catParam.tags != null) {
            for (Map.Entry<String, String> entry : catParam.tags.entrySet()) {
                mVar.a(entry.getKey(), entry.getValue());
            }
        }
        if (catParam.values != null) {
            for (Map.Entry<String, ArrayList<Float>> entry2 : catParam.values.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
        msiContext.onSuccess(null);
    }
}
