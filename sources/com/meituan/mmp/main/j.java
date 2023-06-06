package com.meituan.mmp.main;

import com.meituan.mmp.lib.utils.aa;
import com.meituan.mmp.lib.utils.an;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;
    private static volatile a.InterfaceC0637a c;
    private static volatile a.InterfaceC0637a d;
    private static Boolean e;
    private static List<Interceptor> f = new ArrayList();

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80715794b35efe0acf592bc4ddfe0cb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80715794b35efe0acf592bc4ddfe0cb7");
        }
        if (b != null) {
            return b;
        }
        return b();
    }

    private static a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d303ac8262b6163efaf75d3f6dd6ec62", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d303ac8262b6163efaf75d3f6dd6ec62");
        }
        if (d == null) {
            synchronized (j.class) {
                if (d == null) {
                    d = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(an.a().f());
                }
            }
        }
        return d;
    }

    public static a.InterfaceC0637a a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa9bb2e95562343927d7b02c89501d4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa9bb2e95562343927d7b02c89501d4b");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b89d1dcf14ad209b4cbd2ae14f10a641", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b89d1dcf14ad209b4cbd2ae14f10a641");
        }
        if (c == null) {
            synchronized (j.class) {
                if (c == null) {
                    c = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(an.a().b());
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "629f4b3d060233d2aa95a75bc7caf50b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "629f4b3d060233d2aa95a75bc7caf50b");
        }
        List<Interceptor> a2 = aa.c.a(z);
        a2.addAll(f);
        return a2;
    }

    public static List<Interceptor> a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62664977267db8f5b99a24c752584d14", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62664977267db8f5b99a24c752584d14");
        }
        ArrayList arrayList = new ArrayList();
        if (com.meituan.mmp.lib.utils.aa.a()) {
            if (z) {
                arrayList.add(new aa.d(MMPEnvHelper.getContext()));
            }
            if (z2) {
                arrayList.add(new aa.e());
            }
        }
        return arrayList;
    }
}
