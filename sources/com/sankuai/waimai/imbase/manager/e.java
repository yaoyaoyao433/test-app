package com.sankuai.waimai.imbase.manager;

import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    int b;
    private Set<com.sankuai.waimai.imbase.d> c;
    private final LongSparseArray<Integer> d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477f45d395a70633f1450b528764ab8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477f45d395a70633f1450b528764ab8a");
            return;
        }
        this.d = new LongSparseArray<>();
        this.b = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final e a = new e();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87bde0936f9ae91d60e46d58c75c4616", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87bde0936f9ae91d60e46d58c75c4616") : a.a;
    }

    public final void a(@Nullable List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a99156bd6666aaa2d55e899f29f796e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a99156bd6666aaa2d55e899f29f796e");
            return;
        }
        synchronized (this.d) {
            this.d.clear();
            this.b = 0;
            if (list != null && !list.isEmpty()) {
                for (com.sankuai.xm.im.session.entry.a aVar : list) {
                    if (aVar != null) {
                        this.d.put(aVar.b.getChatId(), Integer.valueOf(aVar.d));
                        this.b += aVar.d;
                    }
                }
            }
        }
    }

    public final void a(com.sankuai.waimai.imbase.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed11a688bc8bf34109daf2ccb02f60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed11a688bc8bf34109daf2ccb02f60c");
            return;
        }
        synchronized (this.d) {
            if (this.c == null) {
                this.c = new HashSet();
            }
            this.c.add(dVar);
        }
    }

    public final void b(com.sankuai.waimai.imbase.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "214eb282e822dde883dbf88831d1835b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "214eb282e822dde883dbf88831d1835b");
            return;
        }
        synchronized (this.d) {
            if (this.c != null) {
                this.c.remove(dVar);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e269a64bdef8d9695d2abee8ce88b86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e269a64bdef8d9695d2abee8ce88b86e");
            return;
        }
        synchronized (this.d) {
            if (this.c != null && this.c.size() > 0) {
                for (com.sankuai.waimai.imbase.d dVar : new ArrayList(this.c)) {
                    if (dVar != null) {
                        dVar.updateUnReadCount(this.d);
                    }
                }
            }
        }
    }
}
