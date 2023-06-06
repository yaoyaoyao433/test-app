package com.meituan.msc.extern;

import com.meituan.msc.common.utils.al;
import com.meituan.msc.common.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;
    private static volatile a.InterfaceC0637a c;
    private static volatile a.InterfaceC0637a d;
    private static Boolean e;
    private static List<Interceptor> f = new ArrayList();

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a9e8fe267750ca4dc362fbf52808830", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a9e8fe267750ca4dc362fbf52808830");
        }
        if (b != null) {
            return b;
        }
        return b();
    }

    private static a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "548956d64db8f24bcab2edf3c07cbc03", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "548956d64db8f24bcab2edf3c07cbc03");
        }
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(al.a().d());
                }
            }
        }
        return d;
    }

    public static a.InterfaceC0637a a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d1eb3ff5b0d4021c7d4ff40b77be910", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d1eb3ff5b0d4021c7d4ff40b77be910");
        }
        if (e != null) {
            z = e.booleanValue();
        }
        if (z && b != null) {
            return b;
        }
        return c();
    }

    private static a.InterfaceC0637a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a363ed66a2e4e6c30d05d0469f2245bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a363ed66a2e4e6c30d05d0469f2245bf");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(al.a().b());
                }
            }
        }
        return c;
    }

    public static void a(a.InterfaceC0637a interfaceC0637a) {
        b = interfaceC0637a;
    }

    public static List<Interceptor> b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "908007daeddfa413cbfb282816fc5495", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "908007daeddfa413cbfb282816fc5495");
        }
        List<Interceptor> a2 = z.c.a(z);
        a2.addAll(f);
        return a2;
    }

    public static List<Interceptor> a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10f5c55a6af142f29ed3f51d4c7e70aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10f5c55a6af142f29ed3f51d4c7e70aa");
        }
        ArrayList arrayList = new ArrayList();
        if (z.a()) {
            if (z) {
                arrayList.add(new z.d(MSCEnvHelper.getContext()));
            }
            if (z2) {
                arrayList.add(new z.e());
            }
        }
        return arrayList;
    }
}
