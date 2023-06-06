package com.sankuai.waimai.store.im;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public final int a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64506ebeb7047238e640be2338f5c10", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64506ebeb7047238e640be2338f5c10")).intValue() : (bVar == null || bVar.g == 2) ? R.drawable.wm_sc_im_default_right : R.drawable.wm_sc_im_grou_portrait;
    }
}
