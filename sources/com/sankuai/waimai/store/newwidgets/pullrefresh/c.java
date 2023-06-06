package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements a {
    public static ChangeQuickRedirect c;

    public abstract void a(b bVar);

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2, int i3) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5645e52074facbfea76f38795898c829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5645e52074facbfea76f38795898c829");
        } else if (i == 3) {
            a(bVar);
        }
    }
}
