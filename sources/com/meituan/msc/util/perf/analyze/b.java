package com.meituan.msc.util.perf.analyze;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msc.util.perf.g;
import com.meituan.msc.util.perf.k;
import com.meituan.msc.util.perf.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Comparator<l> b = new Comparator<l>() { // from class: com.meituan.msc.util.perf.analyze.b.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(l lVar, l lVar2) {
            l lVar3 = lVar;
            l lVar4 = lVar2;
            Object[] objArr = {lVar3, lVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04206633e2e35e0364d6faacb3d258c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04206633e2e35e0364d6faacb3d258c")).intValue();
            }
            if (lVar3 == lVar4) {
                return 0;
            }
            return Long.compare(lVar3.b.g, lVar4.b.g);
        }
    };
    private final List<l> c;
    private c d;

    public b(@NonNull List<l> list) {
        this(list, c.MS);
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8923ef253fa8f30853b8765339eadbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8923ef253fa8f30853b8765339eadbb");
        }
    }

    private b(@NonNull List<l> list, c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbc0e1c402045bdd7df71e0cb41f8d41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbc0e1c402045bdd7df71e0cb41f8d41");
            return;
        }
        Collections.sort(list, b);
        this.c = list;
        this.d = cVar;
    }

    private b(b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4b66656cc8bb557a632ee9a61abe89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4b66656cc8bb557a632ee9a61abe89");
        } else {
            this.c = bVar.c.subList(i, i2);
        }
    }

    private l a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127c5c2fe64c4ca6092d966e39c579ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127c5c2fe64c4ca6092d966e39c579ab");
        }
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    public final b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61fb93b85d102a9ec033a214f9036ea", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61fb93b85d102a9ec033a214f9036ea") : a(d.a(c(j)), false);
    }

    private b a(a aVar, boolean z) {
        Object[] objArr = {aVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64414b47133d9b9cf9a1a08e73fa0894", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64414b47133d9b9cf9a1a08e73fa0894");
        }
        int b2 = b(aVar, false);
        return b2 > 0 ? new b(this, b2, this.c.size()) : this;
    }

    public final long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c03187a9e7f019789ce7efdddd2315", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c03187a9e7f019789ce7efdddd2315")).longValue() : a(str, -1L, false);
    }

    public final long a(final String str, long j, final boolean z) {
        l a2;
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2daf735a765fff1a8553b027817e28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2daf735a765fff1a8553b027817e28")).longValue();
        }
        final long c = c(j);
        if (TextUtils.isEmpty(str) || (a2 = a(b(new a() { // from class: com.meituan.msc.util.perf.analyze.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.e
            public final /* synthetic */ boolean a(l lVar) {
                l lVar2 = lVar;
                Object[] objArr2 = {lVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9f8c7116a6fa05c4e11e6bb8f8bb690", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9f8c7116a6fa05c4e11e6bb8f8bb690")).booleanValue();
                }
                g gVar = lVar2.b;
                if (!z ? gVar.g > c : gVar.g < c) {
                    if (TextUtils.equals(gVar.b, str) && !"E".equals(gVar.c)) {
                        return true;
                    }
                }
                return false;
            }
        }, z))) == null) {
            return -1L;
        }
        return b(a2.b.g);
    }

    public final long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33aa4948e1ec295faa301fd3f74bb70b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33aa4948e1ec295faa301fd3f74bb70b")).longValue() : b(str, -1L, false);
    }

    public final long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b272a3be644be69c69cdf4e7879b4072", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b272a3be644be69c69cdf4e7879b4072")).longValue() : b(str, j, false);
    }

    private long b(final String str, long j, boolean z) {
        long j2;
        Object[] objArr = {str, new Long(j), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b41d09131933fd96968e65ffcffa51a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b41d09131933fd96968e65ffcffa51a")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        final long c = c(j);
        l a2 = a(b(new a() { // from class: com.meituan.msc.util.perf.analyze.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.e
            public final /* synthetic */ boolean a(l lVar) {
                l lVar2 = lVar;
                Object[] objArr2 = {lVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57122dc854fb55b783420df05afe218f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57122dc854fb55b783420df05afe218f")).booleanValue();
                }
                g gVar = lVar2.b;
                if (!r2 ? gVar.g > c : gVar.g < c) {
                    if (TextUtils.equals(gVar.b, str) && !ErrorCode.ERROR_TYPE_B.equals(gVar.c)) {
                        return true;
                    }
                }
                return false;
            }
        }, false));
        if (a2 == null) {
            return -1L;
        }
        g gVar = a2.b;
        if (TextUtils.equals(gVar.c, "X")) {
            j2 = gVar.g + gVar.b();
        } else {
            j2 = gVar.g;
        }
        return b(j2);
    }

    private int b(a aVar, boolean z) {
        int i = 0;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8565b3ca7959746f313a8d4b58d59f90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8565b3ca7959746f313a8d4b58d59f90")).intValue();
        }
        if (aVar == null) {
            return -1;
        }
        if (!z) {
            for (l lVar : this.c) {
                if (lVar != null && aVar.a(lVar)) {
                    return i;
                }
                i++;
            }
        } else {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                l lVar2 = this.c.get(size);
                if (lVar2 != null && aVar.a(lVar2)) {
                    return size;
                }
            }
        }
        return -1;
    }

    private long b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5e72887207334ef2883267569a8353", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5e72887207334ef2883267569a8353")).longValue() : this.d == c.NS ? j : k.a(j);
    }

    private long c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c69ead02cb56bcead7b77c879947984", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c69ead02cb56bcead7b77c879947984")).longValue() : this.d == c.NS ? j : k.b(j);
    }
}
