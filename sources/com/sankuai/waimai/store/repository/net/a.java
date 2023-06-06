package com.sankuai.waimai.store.repository.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.c;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @Deprecated
    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84e3927146bc05e727844259d8907f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84e3927146bc05e727844259d8907f28");
        } else {
            c.a(obj);
        }
    }
}
