package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final String b;
    Map<String, Set<q>> c;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afbdab4a2d0563e00054f4c722721d31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afbdab4a2d0563e00054f4c722721d31");
            return;
        }
        this.b = "MSCEventBus " + hashCode();
        this.c = new ConcurrentHashMap();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe5e7e0230d7c6924a72634fff93072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe5e7e0230d7c6924a72634fff93072");
        } else {
            this.c.clear();
        }
    }

    public final void a(String str, q qVar) {
        Object[] objArr = {str, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40e8cab7ffeb8803dd9211417e0f134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40e8cab7ffeb8803dd9211417e0f134");
        } else if (qVar != null) {
            Set<q> set = this.c.get(str);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                this.c.put(str, set);
            }
            set.add(qVar);
        }
    }

    public final void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a85b868d30f50f9b4c2189a2965d421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a85b868d30f50f9b4c2189a2965d421");
        } else if (qVar != null) {
            for (Set<q> set : this.c.values()) {
                if (set.contains(qVar)) {
                    set.remove(qVar);
                }
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc62ac305794dd25b4a2ea7ff139856d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc62ac305794dd25b4a2ea7ff139856d");
        } else {
            this.c.remove(str);
        }
    }

    public final void a(final f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bcfeeef39dd27b28b5791ab94fd28e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bcfeeef39dd27b28b5791ab94fd28e8");
        } else {
            com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.manager.g.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Set<q> set;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d0d279a1807f9440724c66060331189", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d0d279a1807f9440724c66060331189");
                    } else if (fVar != null && fVar.b != null && (set = g.this.c.get(fVar.b)) != null) {
                        com.meituan.msc.modules.reporter.g.d(g.this.b, "publish msc event ", fVar.b);
                        for (q qVar : set) {
                            qVar.a(fVar);
                        }
                    }
                }
            });
        }
    }
}
