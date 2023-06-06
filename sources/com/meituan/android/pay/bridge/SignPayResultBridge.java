package com.meituan.android.pay.bridge;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.pay.common.analyse.b;
import com.meituan.android.pay.jshandler.mediator.a;
import com.meituan.android.pay.utils.d;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SignPayResultBridge extends a implements NeoBridgeCustomizeInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "signPay_signPayResult";
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b22a6f699cdb5e97c60fcb5099765a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b22a6f699cdb5e97c60fcb5099765a64");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Activity d = aVar.d();
            Object[] objArr2 = {d, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43a12bc17d4cfeb33ba5d363e9a2e982", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43a12bc17d4cfeb33ba5d363e9a2e982");
                return;
            }
            int optInt = jSONObject.optInt(Constant.KEY_RESULT_CODE);
            JSONObject optJSONObject = jSONObject.optJSONObject("resultData");
            b.b("c_pay_emhyaxrm", "b_pay_l272ki0a_mc", "", new a.c().a("type", Integer.valueOf(optInt)).a(Constant.KEY_RESULT_CODE, Integer.valueOf(optInt)).a("argsJson", jSONObject.toString()).b, ak.a(d));
            d.a("paybiz_hybrid_mtpay_bridage_native_receive_h5", optInt);
            a.InterfaceC0326a a2 = com.meituan.android.pay.jshandler.mediator.a.a().a(d);
            if (a2 != null) {
                a2.a(optJSONObject.optString("data"), optJSONObject.optString("error"), optJSONObject.optString("param"), optJSONObject.optString("path"));
            } else {
                com.meituan.android.neohybrid.neo.report.b.a("SignPayNeoFragment_signPayResult", "signStateChange_is_null");
            }
        } catch (JSONException e) {
            f.a("SignPayBridge_execUIThread" + e.toString());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @Nullable
    public final String c(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a8150b36d10af192a656c95dc3620b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a8150b36d10af192a656c95dc3620b");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            return jSONObject.toString();
        } catch (JSONException e) {
            f.a("SignPayBridge_execJSResult" + e.toString());
            return super.c(aVar, str);
        }
    }
}
