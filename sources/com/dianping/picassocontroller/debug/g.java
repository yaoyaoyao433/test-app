package com.dianping.picassocontroller.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g {
    public static ChangeQuickRedirect a = null;
    public static String b = "127.0.0.1";
    public static String c = "10000";
    public static String d = "picasso-playground";
    public static a e = a.DEBUG_OFF;
    public static ArrayList<String[]> f = new ArrayList<>();
    private static volatile g k = null;
    public com.dianping.picassocontroller.debug.a g;
    public b h;
    private d i;
    private com.dianping.picassocontroller.debug.b j;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379a450a77bd7d223d2d9df69f00a29c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379a450a77bd7d223d2d9df69f00a29c");
            return;
        }
        this.i = null;
        this.j = null;
        this.g = null;
        this.h = b.LIVE_LOAD_OFF;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c90b6979110da2f3a8cf4fcdcdfba91d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c90b6979110da2f3a8cf4fcdcdfba91d");
            return;
        }
        f.add(new String[]{"@dp/picasso-controller", "picasso-controller-bundle.js"});
        f.add(new String[]{"@dp/picasso", "picassojs-bundle.js"});
        f.add(new String[]{"mobx", "mobx.js"});
        f.add(new String[]{"@dp/duxjs", "duxjs.js"});
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09fbb47b5eef72d3b9951d5a0dfefd9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09fbb47b5eef72d3b9951d5a0dfefd9d");
        }
        if (k == null) {
            synchronized (g.class) {
                if (k == null) {
                    k = new g();
                }
            }
        }
        return k;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88d282fbe62e8585a6a6e0c701f595c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88d282fbe62e8585a6a6e0c701f595c");
        } else {
            this.h = b.LIVE_LOAD_OFF;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a04a2a2c4ce08ee677c2010181b92f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a04a2a2c4ce08ee677c2010181b92f3");
        } else {
            e = a.DEBUG_OFF;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        DEBUG_ON,
        DEBUG_CONNECTING,
        DEBUG_OFF;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8d41c95cee5468e5600cc39e081d1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8d41c95cee5468e5600cc39e081d1e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86f96d6552f51a1cb5495d379d7b30f6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86f96d6552f51a1cb5495d379d7b30f6") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e757e9fcf68806dde96210852a49fcb0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e757e9fcf68806dde96210852a49fcb0") : (a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        LIVE_LOAD_ON,
        LIVE_LOAD_CONNECTING,
        LIVE_LOAD_OFF;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3e5510dc981e16f39c38a9a3ef77fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3e5510dc981e16f39c38a9a3ef77fa");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68816d73f2eabae644e6c4e4174f78f3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68816d73f2eabae644e6c4e4174f78f3") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86fe6d23754f10d6c0d128be4c440a6c", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86fe6d23754f10d6c0d128be4c440a6c") : (b[]) values().clone();
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e58f7f5d939215d23aa5d6c62db09e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e58f7f5d939215d23aa5d6c62db09e7");
        }
        ArrayList<String[]> arrayList = f;
        return arrayList.get(arrayList.size() - 1)[1];
    }
}
