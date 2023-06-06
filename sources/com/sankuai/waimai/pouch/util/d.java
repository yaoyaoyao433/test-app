package com.sankuai.waimai.pouch.util;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f51f744f73b4e6bc2debcb283b17d70f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f51f744f73b4e6bc2debcb283b17d70f")).booleanValue() : q.a(context, str, 1).b(str2, false);
    }
}
