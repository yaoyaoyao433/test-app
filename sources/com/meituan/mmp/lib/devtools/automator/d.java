package com.meituan.mmp.lib.devtools.automator;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @Nullable
    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "292e59ba94a99ac788eadff5e0894191", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "292e59ba94a99ac788eadff5e0894191");
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(c.class, "mock_location_loader_creator");
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        return (c) a2.get(0);
    }
}
