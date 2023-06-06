package com.meituan.msi.util;

import android.content.Context;
import com.meituan.msi.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;
    private static com.meituan.msi.api.network.a c;
    private static volatile a.InterfaceC0637a d;
    private static Boolean e;
    private static final List<Interceptor> f = new ArrayList();

    public static a.InterfaceC0637a a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11de60be36e3ca5f7499aa67290627cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11de60be36e3ca5f7499aa67290627cb");
        }
        if (e != null) {
            z = e.booleanValue();
        }
        if (z && b != null) {
            return b;
        }
        return b();
    }

    public static boolean a(a.InterfaceC0637a interfaceC0637a) {
        return interfaceC0637a != null && interfaceC0637a == d;
    }

    private static a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4121fa4a4e8cf2bbb0268978c891fb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4121fa4a4e8cf2bbb0268978c891fb0");
        }
        if (d == null) {
            synchronized (l.class) {
                if (d == null) {
                    d = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(u.a().b());
                }
            }
        }
        return d;
    }

    public static void a(a.InterfaceC0637a interfaceC0637a, com.meituan.msi.api.network.a aVar) {
        b = interfaceC0637a;
        c = aVar;
    }

    public static List<Interceptor> b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa2b5351574cbb70342df6a54d110a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa2b5351574cbb70342df6a54d110a7a");
        }
        List<Interceptor> a2 = j.c.a(z);
        a2.addAll(f);
        return a2;
    }

    public static List<Interceptor> a(Context context, boolean z, boolean z2) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9baa1eb4b3cdc42bbaba8ef2ed5b2e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9baa1eb4b3cdc42bbaba8ef2ed5b2e7c");
        }
        ArrayList arrayList = new ArrayList();
        if (j.a()) {
            if (z) {
                arrayList.add(new j.d(context));
            }
            if (z2) {
                arrayList.add(new j.e());
            }
        }
        return arrayList;
    }

    public static com.meituan.msi.api.network.a a() {
        return c;
    }
}
