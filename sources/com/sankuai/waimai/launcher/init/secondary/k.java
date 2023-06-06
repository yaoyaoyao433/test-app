package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends AbsInit {
    public static ChangeQuickRedirect a;
    private static HornCallback b = new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.k.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0518388ea0abca9474a02ecdff1a8401", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0518388ea0abca9474a02ecdff1a8401");
            } else if (!z || TextUtils.isEmpty(str)) {
                com.sankuai.waimai.platform.b.A().l = false;
            } else {
                try {
                    com.sankuai.waimai.platform.b.A().l = new JSONObject(str).optBoolean("is_upload_fingerprint");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "FingerprintHornConfigInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9c4daa44820b2e1d2d3fa462b0fede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9c4daa44820b2e1d2d3fa462b0fede");
            return;
        }
        String c = com.sankuai.waimai.foundation.location.g.c();
        HashMap hashMap = new HashMap();
        hashMap.put("wm_city_code", c);
        Horn.register("mt_wm_fingerprint", b, hashMap);
    }
}
