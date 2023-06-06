package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.INetFactory;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static final Random b = new Random();
    private static com.sankuai.meituan.kernel.net.b c;

    static {
        INetFactory iNetFactory;
        List a2 = com.sankuai.meituan.serviceloader.b.a(INetFactory.class, (String) null);
        if (a2 == null || a2.size() <= 0 || (iNetFactory = (INetFactory) a2.get(0)) == null) {
            return;
        }
        c = iNetFactory.b();
    }

    public static void a(String str, int i, int i2, int i3, int i4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), 0, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97b65a72669b63ebe72abb28066e23c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97b65a72669b63ebe72abb28066e23c2");
        } else if (com.dianping.imagemanager.base.b.a().g != null) {
            com.dianping.imagemanager.base.b.a();
            System.currentTimeMillis();
            a();
        } else if (c != null) {
            c.a(System.currentTimeMillis(), str, a(), 0, i, i2, 0, i4, null, null, 100);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {str, Integer.valueOf(i), 0, Integer.valueOf(i3), Integer.valueOf(i4), 5, 10000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45450bc4082f07684cfddd61bf4b3243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45450bc4082f07684cfddd61bf4b3243");
        } else if (com.dianping.imagemanager.base.b.a().g != null && b.nextInt(10000) < 5) {
            com.dianping.imagemanager.base.b.a();
            System.currentTimeMillis();
            a();
        } else if (c == null || b.nextInt(10000) >= 5) {
        } else {
            c.a(System.currentTimeMillis(), str, a(), 0, i, 0, i3, i4, null, null, 100);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cf88b03f166b83bc18b71e67d1c9398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cf88b03f166b83bc18b71e67d1c9398");
        } else if (com.dianping.imagemanager.base.b.a().g != null) {
            com.dianping.imagemanager.base.b.a();
            System.currentTimeMillis();
            a();
        } else if (c != null) {
            c.a(System.currentTimeMillis(), str, a(), 0, i, i2, i3, i4, null, null, 10);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), 0, Integer.valueOf(i3), Integer.valueOf(i4), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aabe43e3c54cde13ff0a2141c1d7c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aabe43e3c54cde13ff0a2141c1d7c0f");
        } else if (com.dianping.imagemanager.base.b.a().g != null) {
            com.dianping.imagemanager.base.b.a();
            System.currentTimeMillis();
            a();
        } else if (c != null) {
            c.a(System.currentTimeMillis(), str, a(), 0, i, 0, i3, i4, null, str2, 100);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, String str2, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, 10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "feab0f3e1a45e4d214c9fda6347b8dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "feab0f3e1a45e4d214c9fda6347b8dc7");
        } else if (com.dianping.imagemanager.base.b.a().g != null) {
            com.dianping.imagemanager.base.b.a();
            System.currentTimeMillis();
            a();
        } else if (c != null) {
            c.a(System.currentTimeMillis(), str, a(), 0, i, i2, i3, i4, null, str2, 10);
        }
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6cd2e29d53dcf73363019f45b94d8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6cd2e29d53dcf73363019f45b94d8fa")).intValue();
        }
        if (com.dianping.imagemanager.base.b.a().f == null) {
            return 0;
        }
        return com.dianping.imagemanager.base.b.a().f.a();
    }
}
