package com.sankuai.waimai.alita.core.event.autorunner;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.cache.a;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private Map<String, Set<String>> b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50a5ad268ff33e8371c0c487a1f1d877", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50a5ad268ff33e8371c0c487a1f1d877") : new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675960e3817905a9e518e9de34124f88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675960e3817905a9e518e9de34124f88");
            return;
        }
        this.b = new HashMap();
        this.b.put(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, new HashSet());
    }

    public final synchronized void a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3f833348058e52267a27136142f7ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3f833348058e52267a27136142f7ae");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Set<String> set = this.b.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.b.put(str, set);
            }
            if (!TextUtils.isEmpty(str2)) {
                set.add(str2);
            }
        }
    }

    public final synchronized void a(com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242afcd0eb637a13a88e244ecd4e2465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242afcd0eb637a13a88e244ecd4e2465");
            return;
        }
        com.sankuai.waimai.alita.core.tasklistener.c cVar = new com.sankuai.waimai.alita.core.tasklistener.c(bVar);
        boolean z = false;
        for (Map.Entry<String, Set<String>> entry : this.b.entrySet()) {
            if (entry != null) {
                final String key = entry.getKey();
                Set<String> value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    for (String str : value) {
                        if (!TextUtils.isEmpty(str)) {
                            final com.sankuai.waimai.alita.core.tasklistener.a<V, E> a2 = cVar.a((com.sankuai.waimai.alita.core.tasklistener.c) str);
                            com.sankuai.waimai.alita.bundle.a.a().a(str, "js", new a.InterfaceC0691a() { // from class: com.sankuai.waimai.alita.core.event.autorunner.b.1
                                public static ChangeQuickRedirect a;

                                /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
                                @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void a(@android.support.annotation.NonNull com.sankuai.waimai.alita.bundle.model.a r22) {
                                    /*
                                        Method dump skipped, instructions count: 388
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.event.autorunner.b.AnonymousClass1.a(com.sankuai.waimai.alita.bundle.model.a):void");
                                }

                                @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
                                public final void a(@NonNull com.sankuai.waimai.alita.bundle.cache.b bVar2) {
                                    Object[] objArr2 = {bVar2};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e41aea46a3397da611255264e4feca9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e41aea46a3397da611255264e4feca9");
                                    } else {
                                        a2.a((com.sankuai.waimai.alita.core.tasklistener.a) bVar2);
                                    }
                                }
                            });
                            z = true;
                        }
                    }
                }
            }
        }
        if (!z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.tasklistener.b.e;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "52e0de539decd626d0a645333302fe0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "52e0de539decd626d0a645333302fe0c");
                return;
            }
            bVar.b();
        }
    }
}
