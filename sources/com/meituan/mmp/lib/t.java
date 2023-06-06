package com.meituan.mmp.lib;

import android.support.annotation.NonNull;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class t {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, List<Integer>> b = new HashMap<>();
    private static final HashMap<String, List<Integer>> c = new HashMap<>();
    private static String d;
    private static String e;
    @NonNull
    private static final a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void a(String str, int i);

        void b(String str, int i);
    }

    public static /* synthetic */ void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95c67f27a378180278d3eda4c54ffbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95c67f27a378180278d3eda4c54ffbdf");
            return;
        }
        synchronized (t.class) {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "012df6aa536b1b7d19d1dd9dc09060d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "012df6aa536b1b7d19d1dd9dc09060d5");
            return;
        }
        synchronized (t.class) {
            List<Integer> list = c.get(str);
            if (list != null) {
                list.remove(Integer.valueOf(i));
            }
            if (com.meituan.mmp.lib.utils.h.a((List) list)) {
                c.remove(str);
            }
            if (c.isEmpty()) {
                e = "";
            }
        }
    }

    public static /* synthetic */ void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "684e5c1034474be32cef1adbab296c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "684e5c1034474be32cef1adbab296c77");
            return;
        }
        synchronized (t.class) {
            e = str;
        }
    }

    static {
        if (com.meituan.mmp.lib.mp.a.f()) {
            f = new b();
        } else {
            f = (a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN);
        }
    }

    public static void a(String str, com.meituan.mmp.lib.engine.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "909deb815ee821b16836f6687f7f321f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "909deb815ee821b16836f6687f7f321f");
            return;
        }
        int g = bVar.g();
        Object[] objArr2 = {str, Integer.valueOf(g)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "21f39cde14e9fa724f84ec466e3a18ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "21f39cde14e9fa724f84ec466e3a18ab");
        } else {
            synchronized (t.class) {
                List<Integer> list = b.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(Integer.valueOf(g));
                b.put(str, list);
            }
        }
        f.a(str, bVar.d);
    }

    public static void b(String str, com.meituan.mmp.lib.engine.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7df650c024d9b7db7fd28646e5621c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7df650c024d9b7db7fd28646e5621c9");
            return;
        }
        int g = bVar.g();
        Object[] objArr2 = {str, Integer.valueOf(g)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "207c16ed9740d2d93bc22c68bae38ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "207c16ed9740d2d93bc22c68bae38ff7");
        } else {
            synchronized (t.class) {
                List<Integer> list = b.get(str);
                if (list != null) {
                    list.remove(Integer.valueOf(g));
                }
                if (com.meituan.mmp.lib.utils.h.a((List) list)) {
                    b.remove(str);
                }
                if (b.isEmpty()) {
                    d = "";
                }
            }
        }
        f.b(str, bVar.d);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48d226e4e19ea02a1e0f5da7a964cd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48d226e4e19ea02a1e0f5da7a964cd4b");
            return;
        }
        synchronized (t.class) {
            d = str;
        }
        f.a(str);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbef5d873fd2037301640a5485595e11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbef5d873fd2037301640a5485595e11")).booleanValue();
        }
        synchronized (t.class) {
            List<Integer> list = c.get(str);
            return !com.meituan.mmp.lib.utils.h.a((List) list) && list.size() > 1;
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08f2ec06d2270d46a02aee6edd77aa03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08f2ec06d2270d46a02aee6edd77aa03")).booleanValue();
        }
        synchronized (t.class) {
            return !com.meituan.mmp.lib.utils.h.a((List) c.get(str));
        }
    }

    public static String a() {
        return d;
    }

    public static String b() {
        return e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.t.a
        public final void a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9b5e42ebd055a0170bc908e8316c3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9b5e42ebd055a0170bc908e8316c3f");
            } else {
                t.a(str, i);
            }
        }

        @Override // com.meituan.mmp.lib.t.a
        public final void b(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6c657ecf3f6f451cabbab59f0ef52e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6c657ecf3f6f451cabbab59f0ef52e");
            } else {
                t.b(str, i);
            }
        }

        @Override // com.meituan.mmp.lib.t.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d4e8212093743ba84b5ce8c202e5b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d4e8212093743ba84b5ce8c202e5b4");
            } else {
                t.d(str);
            }
        }
    }
}
