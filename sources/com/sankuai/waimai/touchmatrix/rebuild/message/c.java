package com.sankuai.waimai.touchmatrix.rebuild.message;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.rebuild.utils.d;
import com.sankuai.waimai.touchmatrix.utils.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    Map<String, d> b;
    final List<d> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b51272685fa0c7422f9c32991fd2d73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b51272685fa0c7422f9c32991fd2d73");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new CopyOnWriteArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92d0c3e9c40046d66ebd80d45ddda79f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92d0c3e9c40046d66ebd80d45ddda79f");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4cf9a8f7cc1445b1b4f2b3d12a4247e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4cf9a8f7cc1445b1b4f2b3d12a4247e");
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.utils.d a2 = com.sankuai.waimai.touchmatrix.rebuild.utils.d.a();
                d.a aVar = new d.a() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.c.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.touchmatrix.rebuild.utils.d.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "150c86449e3098f61cfab964ec75ba32", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "150c86449e3098f61cfab964ec75ba32");
                            return;
                        }
                        for (d dVar : c.this.c) {
                            if (dVar != null) {
                                dVar.a();
                            }
                        }
                        c.this.c.clear();
                    }

                    @Override // com.sankuai.waimai.touchmatrix.rebuild.utils.d.a
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a20cd379017c96734c8b6dc826a73a9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a20cd379017c96734c8b6dc826a73a9e");
                            return;
                        }
                        for (d dVar : c.this.b.values()) {
                            if (dVar != null) {
                                dVar.b();
                                c.this.c.add(dVar);
                            }
                        }
                    }
                };
                Object[] objArr4 = {aVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.touchmatrix.rebuild.utils.d.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "22b2a14a862d1933fbde93ebac5c9e22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "22b2a14a862d1933fbde93ebac5c9e22");
                } else {
                    a2.b.add(aVar);
                }
            }
        };
        Object[] objArr3 = {runnable};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a964649a43a4e91c9bbfb6263af87af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a964649a43a4e91c9bbfb6263af87af6");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            com.sankuai.waimai.touchmatrix.rebuild.utils.e.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68e1b123c58ebb0d4b9dd85851191c04", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68e1b123c58ebb0d4b9dd85851191c04") : a.a;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0d311d463dc5beea65fb03e072842d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0d311d463dc5beea65fb03e072842d");
            return;
        }
        a.C1348a b = com.sankuai.waimai.touchmatrix.a.a().b(str);
        if (b == null || g.a(b.c)) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixMessageManagerCenter 没有有效cmd，注册失败 ，biz: " + str, new Object[0]);
            return;
        }
        d b2 = b(str);
        if (b2 != null) {
            b2.b();
        }
        d dVar = new d(str, b.c);
        this.b.put(str, dVar);
        dVar.a();
    }

    public final d b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a9ffeafbcb42c85775a5050a9aa451", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a9ffeafbcb42c85775a5050a9aa451");
        }
        if (g.a(str)) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e(" biz ==null  getMessageManager返回空,无匹配消息队列", new Object[0]);
            return null;
        }
        return this.b.get(str);
    }
}
