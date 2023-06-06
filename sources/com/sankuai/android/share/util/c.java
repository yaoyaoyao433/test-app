package com.sankuai.android.share.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba7627e7fdf2a35ae6d46b52e3ba8751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba7627e7fdf2a35ae6d46b52e3ba8751");
            return;
        }
        try {
            com.dianping.networklog.c.a("share-logan-tag--" + str, 3);
        } catch (Throwable unused) {
        }
    }
}
