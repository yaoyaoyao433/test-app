package com.sankuai.waimai.platform.mach.extension.nestedv2;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final b b = new b();
    private Map<Mach, List<a>> c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(Rect rect);
    }

    public static b a() {
        return b;
    }

    public final synchronized void a(Mach mach, Rect rect) {
        Object[] objArr = {mach, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdead06b5e7798ed17adfb6aa240bdb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdead06b5e7798ed17adfb6aa240bdb9");
            return;
        }
        List<a> list = this.c.get(mach);
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (a aVar : list) {
                aVar.a(rect);
            }
        }
    }

    public final synchronized void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454f013dec15001faf5fbf791106d15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454f013dec15001faf5fbf791106d15d");
            return;
        }
        List<a> list = this.c.get(mach);
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (a aVar : list) {
                aVar.a();
            }
        }
    }

    public final synchronized void a(Mach mach, a aVar) {
        Object[] objArr = {mach, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7219d3bd23d7d771603e6f2136a86633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7219d3bd23d7d771603e6f2136a86633");
            return;
        }
        List<a> list = this.c.get(mach);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.c.put(mach, list);
        }
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }

    public final synchronized void b(Mach mach, a aVar) {
        Object[] objArr = {mach, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb79c0b82388c3a56df45c4eb8d8a79a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb79c0b82388c3a56df45c4eb8d8a79a");
            return;
        }
        List<a> list = this.c.get(mach);
        if (list != null) {
            list.remove(aVar);
            if (list.isEmpty()) {
                this.c.remove(mach);
            }
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6504fdabf8d48a9b84b5b9495d457d33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6504fdabf8d48a9b84b5b9495d457d33");
        } else {
            this.c = new WeakHashMap();
        }
    }
}
