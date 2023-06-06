package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.utils.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ApiLoganInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85167725723cc78e5a5ff06dc1f2f68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85167725723cc78e5a5ff06dc1f2f68c");
            return;
        }
        final com.sankuai.waimai.platform.capacity.log.d a2 = com.sankuai.waimai.platform.capacity.log.d.a();
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.capacity.log.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d1dd577ae72e056f6850d1bac2e82e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d1dd577ae72e056f6850d1bac2e82e2a");
            return;
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.waimai.platform.capacity.log.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b820d88dbd0fb6a9264aa7866f01319", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b820d88dbd0fb6a9264aa7866f01319");
                } else if (z) {
                    try {
                        a aVar = (a) k.a().fromJson(str, (Class<Object>) a.class);
                        if (aVar != null) {
                            d.a(a2, aVar);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            }
        };
        Horn.register("waimai_android_logan_config", hornCallback);
        Horn.accessCache("waimai_android_logan_config", hornCallback);
    }
}
