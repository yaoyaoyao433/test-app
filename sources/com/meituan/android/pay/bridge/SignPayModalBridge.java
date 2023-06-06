package com.meituan.android.pay.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.paybase.dialog.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SignPayModalBridge extends a implements NeoBridgeCustomizeInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "signPay_modal";
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @Nullable
    public final String c(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1734ffd54d581d6eeb4e43d63dafde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1734ffd54d581d6eeb4e43d63dafde");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            return jSONObject.toString();
        } catch (JSONException e) {
            f.a("SignPayModalBridge_execJSResult" + e.toString());
            return super.c(aVar, str);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c9838ee42adc06d1ceac625988eacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c9838ee42adc06d1ceac625988eacf");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("enable_modal", false);
            String optString = jSONObject.optString("background_color", "");
            UIConfig uiConfig = aVar.f().uiConfig();
            uiConfig.setModal(optBoolean);
            if (!TextUtils.isEmpty(optString)) {
                uiConfig.setBackgroundColor(optString);
            }
            aVar.m();
        } catch (Exception e) {
            f.a(e.toString());
            if (com.meituan.android.neohybrid.init.a.h()) {
                e.a(com.meituan.android.neohybrid.init.a.d(), e.toString());
            }
        }
    }
}
