package com.meituan.msc.common.framework;

import android.support.annotation.NonNull;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.msc.common.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, List<Integer>> b = new HashMap<>();
    private static final HashMap<String, List<Integer>> c = new HashMap<>();
    private static String d;
    private static String e;
    @NonNull
    private static final a f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void a(String str, Integer num);

        void b(String str, Integer num);
    }

    public static /* synthetic */ void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b64596ee4d323747dcfec57ebf28f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b64596ee4d323747dcfec57ebf28f03");
            return;
        }
        synchronized (d.class) {
            List<Integer> list = c.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(Integer.valueOf(i));
            c.put(str, list);
        }
    }

    public static /* synthetic */ void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e955308cdf99a0a43852ace2ddf46e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e955308cdf99a0a43852ace2ddf46e97");
            return;
        }
        synchronized (d.class) {
            List<Integer> list = c.get(str);
            if (list != null) {
                list.remove(Integer.valueOf(i));
            }
            if (f.a((List) list)) {
                c.remove(str);
            }
            if (c.isEmpty()) {
                e = "";
            }
        }
    }

    public static /* synthetic */ void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3b32599bf8152d7153794d79729dfb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3b32599bf8152d7153794d79729dfb0");
            return;
        }
        synchronized (d.class) {
            e = str;
        }
    }

    static {
        if (com.meituan.msc.common.process.a.f()) {
            f = new b();
        } else {
            f = (a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.MAIN);
        }
    }

    public static void a(String str, com.meituan.msc.modules.apploader.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb62ec6af851e03aebecdc5ae0706f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb62ec6af851e03aebecdc5ae0706f2c");
            return;
        }
        int f2 = aVar.f();
        Object[] objArr2 = {str, Integer.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f2a7e5b88b79e4b4aa1cb393d71b928a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f2a7e5b88b79e4b4aa1cb393d71b928a");
        } else {
            synchronized (d.class) {
                List<Integer> list = b.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(Integer.valueOf(f2));
                b.put(str, list);
            }
        }
        f.a(str, Integer.valueOf(aVar.f()));
    }

    public static void b(String str, com.meituan.msc.modules.apploader.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73a4bc34d6f16459c13f0df857211706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73a4bc34d6f16459c13f0df857211706");
            return;
        }
        int f2 = aVar.f();
        Object[] objArr2 = {str, Integer.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1ee406247c0b20e19298d2f3f93b7709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1ee406247c0b20e19298d2f3f93b7709");
        } else {
            synchronized (d.class) {
                List<Integer> list = b.get(str);
                if (list != null) {
                    list.remove(Integer.valueOf(f2));
                }
                if (f.a((List) list)) {
                    b.remove(str);
                }
                if (b.isEmpty()) {
                    d = "";
                }
            }
        }
        f.b(str, Integer.valueOf(aVar.f()));
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d8094f121c2f821c923d953bd58e24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d8094f121c2f821c923d953bd58e24d");
            return;
        }
        synchronized (d.class) {
            d = str;
        }
        f.a(str);
    }

    public static boolean b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "461ea02506ba612e7759e984b6ec1945", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "461ea02506ba612e7759e984b6ec1945")).booleanValue();
        }
        synchronized (d.class) {
            List<Integer> list = c.get(str);
            if (f.a((List) list) || list.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.common.framework.d.a
        public final void a(String str, Integer num) {
            Object[] objArr = {str, num};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7ab9cad76ac63a4a2f4f9b6b2b2e7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7ab9cad76ac63a4a2f4f9b6b2b2e7f");
            } else {
                d.a(str, num.intValue());
            }
        }

        @Override // com.meituan.msc.common.framework.d.a
        public final void b(String str, Integer num) {
            Object[] objArr = {str, num};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb83ad0892f59789eb412df9806aed4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb83ad0892f59789eb412df9806aed4");
            } else {
                d.b(str, num.intValue());
            }
        }

        @Override // com.meituan.msc.common.framework.d.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc589545383c00e7bc0d6bedc08d75f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc589545383c00e7bc0d6bedc08d75f0");
            } else {
                d.c(str);
            }
        }
    }
}
