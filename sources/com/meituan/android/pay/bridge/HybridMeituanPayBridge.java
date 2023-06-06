package com.meituan.android.pay.bridge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.pay.process.b;
import com.meituan.android.pay.utils.p;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridMeituanPayBridge extends a implements NeoBridgeCustomizeInterface, b {
    public static ChangeQuickRedirect a;
    private int e;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "pay_hybridMtpCashierTransferProcess";
    }

    public HybridMeituanPayBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089ccf65bc24992e7751de700d12724a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089ccf65bc24992e7751de700d12724a");
        } else {
            this.e = 89;
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @MTPaySuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        JSONObject jSONObject;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c627246f64a82e690f3c9ccdc0822c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c627246f64a82e690f3c9ccdc0822c63");
            return;
        }
        Activity d = aVar.d();
        if (d == null) {
            a(11, "activity为空");
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(jSONObject.optString("scene_incoming_native_business"), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER)) {
                a(-405, "scene数据有误");
                return;
            }
            com.meituan.android.pay.common.analyse.a.b = "7";
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6020327099a0a7dbd03c81f316ce0a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6020327099a0a7dbd03c81f316ce0a2");
            } else {
                this.c.f();
            }
            int i = this.e;
            Object[] objArr3 = {d, str, Integer.valueOf(i), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER};
            ChangeQuickRedirect changeQuickRedirect3 = p.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fa1c06a418a03cd4ecfca36b96996dc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fa1c06a418a03cd4ecfca36b96996dc6");
                return;
            }
            Uri.Builder buildUpon = Uri.parse("meituanpayment://meituanpay/launch").buildUpon();
            buildUpon.appendQueryParameter(RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, str);
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.setPackage(d.getPackageName());
            d.startActivityForResult(intent, i);
            return;
        }
        a(-405, "数据有误");
    }

    @Override // com.meituan.android.pay.process.b
    public void callBackData(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddce024c479f7db04ab04fbd70901d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddce024c479f7db04ab04fbd70901d57");
        } else if (obj instanceof JSONObject) {
            a((JSONObject) obj);
        } else {
            a(-405, "数据有误");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r12, int r13, android.content.Intent r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.pay.bridge.HybridMeituanPayBridge.a
            java.lang.String r10 = "98c779b8187e50cea210845e2ed48914"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L29:
            super.a(r12, r13, r14)
            int r0 = r11.e
            if (r12 != r0) goto L8d
            r12 = -1
            if (r13 != r12) goto L5c
            if (r14 == 0) goto L5c
            java.lang.String r13 = "pay_result"
            int r12 = com.sankuai.waimai.platform.utils.f.a(r14, r13, r12)     // Catch: org.json.JSONException -> L6a
            r13 = 7
            if (r12 != r13) goto L5c
            java.lang.String r12 = "pay_msg"
            java.lang.String r12 = com.sankuai.waimai.platform.utils.f.a(r14, r12)     // Catch: org.json.JSONException -> L6a
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: org.json.JSONException -> L6a
            if (r12 != 0) goto L5c
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6a
            java.lang.String r13 = "pay_msg"
            java.lang.String r13 = com.sankuai.waimai.platform.utils.f.a(r14, r13)     // Catch: org.json.JSONException -> L6a
            r12.<init>(r13)     // Catch: org.json.JSONException -> L6a
            r11.callBackData(r12)     // Catch: org.json.JSONException -> L6a
            goto L6e
        L5c:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6a
            r12.<init>()     // Catch: org.json.JSONException -> L6a
            java.lang.String r13 = "callback_status"
            r12.put(r13, r8)     // Catch: org.json.JSONException -> L6a
            r11.callBackData(r12)     // Catch: org.json.JSONException -> L6a
            goto L6e
        L6a:
            r12 = move-exception
            r12.printStackTrace()
        L6e:
            com.meituan.android.pay.analyse.a.a()
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.android.neohybrid.neo.bridge.handler.a.b
            java.lang.String r14 = "1dfdfd267cd24d25e5e62e088602479f"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r12
            r1 = r11
            r2 = r13
            r4 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L88
            com.meituan.robust.PatchProxy.accessDispatch(r12, r11, r13, r8, r14)
            return
        L88:
            com.meituan.android.neohybrid.neo.bridge.presenter.b r12 = r11.c
            r12.g()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.bridge.HybridMeituanPayBridge.a(int, int, android.content.Intent):void");
    }
}
