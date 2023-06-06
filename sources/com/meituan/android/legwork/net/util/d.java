package com.meituan.android.legwork.net.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49bde502637517f16401eb4e6fa0cfbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49bde502637517f16401eb4e6fa0cfbc");
        }
        UUID randomUUID = UUID.randomUUID();
        return Long.toString(randomUUID.getLeastSignificantBits() ^ randomUUID.getMostSignificantBits());
    }
}
