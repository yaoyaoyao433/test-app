package com.sankuai.waimai.store.base.vessel.impl;

import android.support.annotation.NonNull;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b implements com.sankuai.waimai.store.base.vessel.b {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.store.base.vessel.b
    public void b(@NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63c064a161a2f3d75afd6c9b2b4b9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63c064a161a2f3d75afd6c9b2b4b9c1");
            return;
        }
        Window window = sCBaseActivity.getWindow();
        if (window != null) {
            window.getDecorView().setBackgroundColor(-1);
        }
    }
}
