package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "902df9a7f5d4325af398a211a987870e", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "902df9a7f5d4325af398a211a987870e") : com.sankuai.android.jarvis.c.a();
    }
}
