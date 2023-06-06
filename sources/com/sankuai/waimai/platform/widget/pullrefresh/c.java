package com.sankuai.waimai.platform.widget.pullrefresh;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements a {
    public static ChangeQuickRedirect d;

    public abstract void a(b bVar);

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public void a(@NonNull b bVar, int i, int i2, int i3) {
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public void a(@NonNull b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9630c5fc3b21c51ff8641ea0271e6a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9630c5fc3b21c51ff8641ea0271e6a56");
        } else if (i == 3) {
            a(bVar);
            i.b(new h().a("PullRefreshWidget").d("PullRefreshListener onRefresh").b());
        }
    }
}
