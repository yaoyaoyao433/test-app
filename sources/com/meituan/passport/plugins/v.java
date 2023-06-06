package com.meituan.passport.plugins;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class v {
    public static ChangeQuickRedirect c;

    public abstract a.InterfaceC0637a a();

    public int b() {
        return 1;
    }

    public List<Interceptor> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0710e9818e6ff8ccb1e26cc6fee36f15", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0710e9818e6ff8ccb1e26cc6fee36f15") : Collections.emptyList();
    }
}
