package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.mrn.WMMRNConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p extends AbsInit {
    public static ChangeQuickRedirect a;
    private HornCallback b;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "WMMRNHornConfigInit";
    }

    public p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecfd7d5230f20d2bb6a71df9adc0d800", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecfd7d5230f20d2bb6a71df9adc0d800");
        } else {
            this.b = new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.p.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0c0a4896007f0b8b965166e26bdcfc0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0c0a4896007f0b8b965166e26bdcfc0");
                    } else if (!z || TextUtils.isEmpty(str)) {
                        WMMRNConfig.a("");
                    } else {
                        WMMRNConfig.a(str);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857344d4f06f4b11a7929fc1707e2239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857344d4f06f4b11a7929fc1707e2239");
        } else {
            com.sankuai.waimai.foundation.router.impl.a.a().a(new com.sankuai.waimai.launcher.provider.scheme.b(application), 400);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe774c477ddf0b2d8f1e69230a6cd7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe774c477ddf0b2d8f1e69230a6cd7ed");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uid", com.sankuai.waimai.platform.b.A().B());
        hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
        hashMap.put("debug", Integer.valueOf(com.sankuai.meituan.takeoutnew.a.a ? 1 : 0));
        hashMap.put("appVersion", com.sankuai.meituan.takeoutnew.a.d);
        try {
            hashMap.put("cityId", com.sankuai.waimai.foundation.location.v2.g.a().m().getCityCode());
        } catch (Exception unused) {
        }
        try {
            hashMap.put("abi", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        Horn.register("wmrouter_redirect", this.b, hashMap);
    }
}
