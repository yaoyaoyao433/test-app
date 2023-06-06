package com.sankuai.waimai.ad.view.mach.nested;

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
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c b = new c();
    private Map<Mach, List<a>> c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(Rect rect);
    }

    public static c a() {
        return b;
    }

    public final synchronized void a(Mach mach, Rect rect) {
        Object[] objArr = {mach, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f241784a316852238f4dfbc5ac35e594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f241784a316852238f4dfbc5ac35e594");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5022005d9cf5f943e6a76b60b15d544e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5022005d9cf5f943e6a76b60b15d544e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6b49c5b46c9aeff880b85814bd831f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6b49c5b46c9aeff880b85814bd831f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47a5e77d5371324b1d200260c40b0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47a5e77d5371324b1d200260c40b0bb");
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

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a50834d9819927976a9ebc0a3f15b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a50834d9819927976a9ebc0a3f15b7e");
        } else {
            this.c = new WeakHashMap();
        }
    }
}
