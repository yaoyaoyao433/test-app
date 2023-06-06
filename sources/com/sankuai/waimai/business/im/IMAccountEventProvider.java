package com.sankuai.waimai.business.im;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.f;
import com.sankuai.waimai.platform.provider.AccountEventProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMAccountEventProvider implements AccountEventProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.AccountEventProvider
    public void logOff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b25ccc40a98e5f49f828af4cba35b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b25ccc40a98e5f49f828af4cba35b8");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i();
        long c = com.sankuai.waimai.platform.domain.manager.user.a.c();
        f a = f.a();
        Object[] objArr2 = {new Long(c)};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "953f59470c806f5aef330754525d78cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "953f59470c806f5aef330754525d78cb");
            return;
        }
        SharedPreferences.Editor editor = a.f;
        editor.remove("cancel_time_" + c).commit();
    }
}
