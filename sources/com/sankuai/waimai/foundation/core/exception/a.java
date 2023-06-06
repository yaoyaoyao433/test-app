package com.sankuai.waimai.foundation.core.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(boolean z) {
        b = z;
    }

    private static void c(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "805a546f6c5aad2df7f131e83012f3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "805a546f6c5aad2df7f131e83012f3d1");
        } else if (th != null) {
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }

    private static void d(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dca91993e4c1767a5f94e85f32850a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dca91993e4c1767a5f94e85f32850a8");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ef6e59f32f0ea284a332309dbe1a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ef6e59f32f0ea284a332309dbe1a33");
        } else if (b) {
            c(th);
        } else {
            d(new CriticalError(th));
        }
    }

    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae06393d11f4b7e39c671205882ca08e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae06393d11f4b7e39c671205882ca08e");
        } else if (th != null) {
            if (b) {
                c(th);
            } else {
                d(new MajorError(th));
            }
        }
    }
}
