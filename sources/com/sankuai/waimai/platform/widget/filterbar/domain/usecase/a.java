package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<C1092a, b> {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;
    private boolean f;

    public static /* synthetic */ Set a(a aVar, com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar2, Set set) {
        b.a.C1086a c1086a;
        boolean a;
        char c = 0;
        int i = 2;
        Object[] objArr = {bVar, bVar2, set};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f46b23ac79f763a1f51542b4dc76c464", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f46b23ac79f763a1f51542b4dc76c464");
        }
        HashSet hashSet = new HashSet();
        if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(bVar)) {
            Iterator<b.a> it = bVar.b.iterator();
            while (it.hasNext()) {
                b.a next = it.next();
                if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next)) {
                    it.remove();
                } else {
                    Iterator<b.a.C1086a> it2 = next.c.iterator();
                    while (it2.hasNext()) {
                        b.a.C1086a next2 = it2.next();
                        if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next2)) {
                            it2.remove();
                        } else if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(bVar2)) {
                            Object[] objArr2 = new Object[i];
                            objArr2[c] = next2;
                            objArr2[1] = bVar2;
                            ChangeQuickRedirect changeQuickRedirect2 = d;
                            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "be9b358ab6b8e454a6e922049ce828e5", RobustBitConfig.DEFAULT_VALUE)) {
                                a = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "be9b358ab6b8e454a6e922049ce828e5")).booleanValue();
                                c1086a = next2;
                            } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next2)) {
                                c1086a = next2;
                                a = false;
                            } else {
                                c1086a = next2;
                                a = aVar.a(c1086a.a, bVar2);
                            }
                            if (!a) {
                                it2.remove();
                                if (aVar.a(c1086a)) {
                                    hashSet.add(c1086a.a);
                                }
                                if (set != null) {
                                    set.add(c1086a);
                                }
                            }
                            c = 0;
                            i = 2;
                        }
                    }
                    if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next)) {
                        it.remove();
                    }
                    c = 0;
                    i = 2;
                }
            }
        }
        return hashSet;
    }

    public static /* synthetic */ boolean a(a aVar, com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "99372adc949a30558edae3f745708f1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "99372adc949a30558edae3f745708f1a")).booleanValue();
        }
        if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(bVar)) {
            for (b.a aVar2 : bVar.b) {
                if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(aVar2)) {
                    for (b.a.C1086a c1086a : aVar2.c) {
                        if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5c47966dae86e0d7b3cb4a3d1a5ed3a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5c47966dae86e0d7b3cb4a3d1a5ed3a7")).booleanValue() : aVar.a(str, aVar.e.s());
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(C1092a c1092a) {
        C1092a c1092a2 = c1092a;
        Object[] objArr = {c1092a2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390b3f32a9ac1412fc00ed14ad500875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390b3f32a9ac1412fc00ed14ad500875");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (c1092a2 == null) {
            this.c.a(new Error("request value is null!"));
        } else {
            long j = c1092a2.b;
            long j2 = c1092a2.c;
            int i = c1092a2.d;
            final com.sankuai.waimai.platform.widget.filterbar.domain.model.b s = this.e.s();
            final com.sankuai.waimai.platform.widget.filterbar.domain.model.b t = this.e.t();
            this.e.a(this.f, j, j2, i, new b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b r13) {
                    /*
                        Method dump skipped, instructions count: 465
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a.AnonymousClass1.a(java.lang.Object):void");
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b16910b5dff4a3e9b0296b436ab4e18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b16910b5dff4a3e9b0296b436ab4e18");
                    } else {
                        a.this.c.a(new Error(exc.getMessage()));
                    }
                }
            });
        }
    }

    public a(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d207ee7235d53513df46d1a99eb23d85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d207ee7235d53513df46d1a99eb23d85");
            return;
        }
        this.f = false;
        this.e = bVar;
        this.f = z;
    }

    boolean a(b.a.C1086a c1086a) {
        Set<String> j;
        Object[] objArr = {c1086a};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb00b436b307288fa37766b99745fc64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb00b436b307288fa37766b99745fc64")).booleanValue();
        }
        if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a) || (j = this.e.j()) == null) {
            return false;
        }
        return j.contains(c1086a.a);
    }

    private boolean a(String str, com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        boolean z = false;
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4244532a084c6370ecfc29c219d39c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4244532a084c6370ecfc29c219d39c0")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(bVar)) {
            return false;
        }
        Iterator<b.a> it = bVar.b.iterator();
        while (it.hasNext()) {
            b.a next = it.next();
            if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next)) {
                Iterator<b.a.C1086a> it2 = next.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    b.a.C1086a next2 = it2.next();
                    if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(next2) && TextUtils.equals(str, next2.a)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1092a extends c.a {
        public static ChangeQuickRedirect a;
        long b;
        long c;
        int d;

        public C1092a(long j, long j2, int i) {
            Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d37d93b74d26a946532dd7d03f6121a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d37d93b74d26a946532dd7d03f6121a");
                return;
            }
            this.b = j;
            this.c = j2;
            this.d = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.b b;
        public List<b.a.C1086a> c;
        public Set<String> d;
        public Set<String> e;
        public Set<b.a.C1086a> f;

        public b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, List<b.a.C1086a> list, Set<String> set, Set<String> set2, Set<b.a.C1086a> set3, boolean z) {
            Object[] objArr = {bVar, list, set, set2, set3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0fe171141b1644fe8989a68de521b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0fe171141b1644fe8989a68de521b4");
                return;
            }
            this.b = bVar;
            this.c = list;
            this.d = set;
            this.e = set2;
            this.f = set3;
        }
    }
}
