package com.meituan.android.pay.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SignPayClosePageBridge extends a implements NeoBridgeCustomizeInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "signPay_closePage";
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @Nullable
    public final String c(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491b0d45c19d86974da41b9fe5a49a55", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491b0d45c19d86974da41b9fe5a49a55");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            return jSONObject.toString();
        } catch (JSONException e) {
            f.a("SignPayClosePageBridge_execJSResult" + e.toString());
            return super.c(aVar, str);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2260b69c3695d12527f2450a09b288f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2260b69c3695d12527f2450a09b288f0");
        } else if (aVar == null || aVar.d() == null) {
        } else {
            aVar.d().finish();
        }
    }
}
