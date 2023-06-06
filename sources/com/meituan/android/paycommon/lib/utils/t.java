package com.meituan.android.paycommon.lib.utils;

import android.text.TextUtils;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements HornCallback {
    public static ChangeQuickRedirect a;
    private final s b;

    private t(s sVar) {
        this.b = sVar;
    }

    public static HornCallback a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fe21349b81377b3dffb8b896fc8a4c7", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fe21349b81377b3dffb8b896fc8a4c7") : new t(sVar);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8d72b5a597336c789d3c15df0032c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8d72b5a597336c789d3c15df0032c8");
            return;
        }
        s sVar = this.b;
        Object[] objArr2 = {sVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d619a9b522acac8ad43a4a43240c2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d619a9b522acac8ad43a4a43240c2cc");
        } else if (z && !TextUtils.isEmpty(str)) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_fetch_horn", 200);
            try {
                String string = new JSONObject(str).getString("requestThrottleTime");
                if (TextUtils.isEmpty(sVar.b)) {
                    sVar.b = string;
                    sVar.b();
                    return;
                }
                sVar.b = string;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_fetch_horn", -9753);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5me0lyn1_mv", new a.c().a("enable", String.valueOf(z)).a("result", str).a("uuid", com.meituan.android.paybase.config.a.d().j()).b);
        }
    }
}
