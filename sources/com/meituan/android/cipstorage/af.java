package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface af {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public final long a;
        public final String[] b;
        public final String[] c;
        public final String[] d;
        public final boolean e;
        public final boolean f;
        public Map<String, Set<String>> g;
        public Map<String, Set<String>> h;
        public Map<String, Set<String>> i;
    }

    @Deprecated
    Set<c> a();

    List<String> b();

    List<String> c();

    List<String> d();

    @Deprecated
    boolean e();

    @Deprecated
    long f();

    @Deprecated
    boolean g();

    boolean h();

    Map<String, a> i();

    boolean j();

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public final l b;
        public final boolean c;
        public final long d;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a80c7c12dbc69c9da30d07d38eb345", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a80c7c12dbc69c9da30d07d38eb345");
            }
            return "LRU: " + this.b + " enable:" + this.c + " threshold: " + this.d;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements af {
        public static ChangeQuickRedirect a;
        private static Set<c> b = Collections.emptySet();
        private static List<String> c = Collections.emptyList();

        @Override // com.meituan.android.cipstorage.af
        public final Set<c> a() {
            return b;
        }

        @Override // com.meituan.android.cipstorage.af
        public final List<String> b() {
            return c;
        }

        @Override // com.meituan.android.cipstorage.af
        public final List<String> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb7e24030cec91c4a33bf992d41963e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb7e24030cec91c4a33bf992d41963e") : Collections.emptyList();
        }

        @Override // com.meituan.android.cipstorage.af
        public final List<String> d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82ed5afdf9e7d82e6f6084afb563e45", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82ed5afdf9e7d82e6f6084afb563e45") : Collections.emptyList();
        }

        @Override // com.meituan.android.cipstorage.af
        public final boolean e() {
            return v.b;
        }

        @Override // com.meituan.android.cipstorage.af
        public final long f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd19a6a9266f496a0d4d9ccc4c8d5d2e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd19a6a9266f496a0d4d9ccc4c8d5d2e")).longValue() : v.b ? 800L : Long.MAX_VALUE;
        }

        @Override // com.meituan.android.cipstorage.af
        public final boolean g() {
            return v.b;
        }

        @Override // com.meituan.android.cipstorage.af
        public final boolean h() {
            return v.b;
        }

        @Override // com.meituan.android.cipstorage.af
        public final Map<String, a> i() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c359610dbc1ebc81182340dc6e98440f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c359610dbc1ebc81182340dc6e98440f") : Collections.emptyMap();
        }

        @Override // com.meituan.android.cipstorage.af
        public final boolean j() {
            return v.b;
        }
    }
}
