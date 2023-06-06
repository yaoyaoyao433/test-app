package com.sankuai.waimai.rocks.view.mach;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.rocks.view.mach.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a<com.sankuai.waimai.mach.recycler.g> {
    public static ChangeQuickRedirect a;
    private Activity b;
    private com.sankuai.waimai.mach.recycler.f c;
    private String d;
    private String e;
    private d f;
    private Map<String, Object> g;
    private com.sankuai.waimai.rocks.log.b h;
    private Mach.d i;
    private rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> j;

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final void a(com.sankuai.waimai.mach.recycler.a aVar) {
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final void a(com.sankuai.waimai.mach.recycler.b bVar) {
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final com.sankuai.waimai.mach.recycler.b c() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final /* synthetic */ void a(com.sankuai.waimai.mach.recycler.g gVar, com.sankuai.waimai.mach.recycler.g gVar2, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        com.sankuai.waimai.mach.recycler.g gVar3 = gVar;
        com.sankuai.waimai.mach.recycler.g gVar4 = gVar2;
        boolean z = false;
        Object[] objArr = {gVar3, gVar4, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "402465deedff684020a73f66cea77cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "402465deedff684020a73f66cea77cc6");
            return;
        }
        com.sankuai.waimai.mach.recycler.f fVar = this.c;
        Object[] objArr2 = {gVar3, gVar4, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.recycler.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "2e48aa32aa2793304d0e47f72811a907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "2e48aa32aa2793304d0e47f72811a907");
        } else if (gVar3 == null || viewGroup == null) {
        } else {
            if (gVar4 != null) {
                Object[] objArr3 = {gVar4, viewGroup};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.recycler.f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "7a4ae35bf8366e5e875b067ce07c217c", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "7a4ae35bf8366e5e875b067ce07c217c")).booleanValue();
                } else if (gVar4 != null && gVar4.e != null && (viewGroup2 = gVar4.e.get()) != null && viewGroup2 == viewGroup) {
                    z = true;
                }
                if (!z) {
                    gVar4 = null;
                }
            }
            if (gVar4 == gVar3) {
                gVar4 = null;
            }
            if (gVar4 != null && gVar4.b() != null && gVar4.b().h.o == 0) {
                gVar4 = null;
            }
            Mach mach = fVar.b.get(gVar3.a());
            if (mach != null) {
                if (gVar4 != null && !gVar3.a().equals(gVar4.a())) {
                    gVar4 = null;
                }
                mach.attachPreRenderNode(gVar3.b(), gVar4 == null ? null : gVar4.b(), viewGroup, fVar.c);
                if (gVar4 != null) {
                    gVar4.e = null;
                }
                gVar3.e = new WeakReference<>(viewGroup);
            }
        }
    }

    public b(Activity activity, String str, String str2, com.sankuai.waimai.rocks.log.b bVar, d dVar, Map<String, Object> map, Mach.d dVar2, rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> cVar) {
        Object[] objArr = {activity, str, str2, bVar, dVar, map, dVar2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463dad65e1c5be8fea1c9727e1e5af5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463dad65e1c5be8fea1c9727e1e5af5f");
            return;
        }
        this.b = activity;
        this.c = new com.sankuai.waimai.mach.recycler.f();
        this.d = str;
        this.e = str2;
        this.f = dVar;
        this.g = map;
        this.h = bVar;
        this.i = dVar2;
        this.j = cVar;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final Activity a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.rocks.view.mach.a
    /* renamed from: b */
    public com.sankuai.waimai.mach.recycler.g a(com.sankuai.waimai.rocks.view.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d721ddfeeeb569fa178d77d4ec343481", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d721ddfeeeb569fa178d77d4ec343481");
        }
        if (aVar.s == null || TextUtils.isEmpty(aVar.s.c)) {
            this.h.a(this.e);
            return null;
        } else if (!aVar.s.c()) {
            this.h.a(this.e, aVar.s.c);
            return null;
        } else {
            synchronized (this) {
                if (!this.c.a(aVar.s.c)) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final com.sankuai.waimai.mach.manager.cache.e[] eVarArr = {null};
                    com.sankuai.waimai.mach.manager.a.a().a(aVar.s.c, aVar.s.d, aVar.s.n, this.d, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.rocks.view.mach.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d9f552508e2a39a126af890c9e70135", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d9f552508e2a39a126af890c9e70135");
                                return;
                            }
                            eVarArr[0] = eVar;
                            countDownLatch.countDown();
                        }

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull CacheException cacheException) {
                            Object[] objArr2 = {cacheException};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0942d074c986d17d3cb80e99434040e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0942d074c986d17d3cb80e99434040e");
                            } else {
                                countDownLatch.countDown();
                            }
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        this.h.a(this.e, e);
                    }
                    com.sankuai.waimai.mach.manager.cache.e eVar = eVarArr[0];
                    if (!eVar.c()) {
                        this.h.c(this.e, aVar.s.c);
                        return null;
                    }
                    this.h.b(this.e, aVar.s.c);
                    d.a a2 = this.f.a(aVar.s.c);
                    if (a2 == null) {
                        return null;
                    }
                    Mach a3 = a2.a().a();
                    if (a3 != null && this.i != null) {
                        a3.registerJsEventCallback(this.i);
                    }
                    a3.initWithBundle(this.b, null, eVar);
                    this.c.a(a3, eVar, eVar.j);
                } else {
                    this.h.b(this.e, aVar.s.c);
                }
                return c(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.rocks.view.mach.a
    /* renamed from: b */
    public com.sankuai.waimai.mach.recycler.g a(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cf626f62ade35ff82f623aa9582617", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cf626f62ade35ff82f623aa9582617");
        }
        if (eVar.s == null || TextUtils.isEmpty(eVar.s.c)) {
            this.h.a(this.e);
            return null;
        } else if (!eVar.s.c()) {
            this.h.a(this.e, eVar.s.c);
            return null;
        } else {
            synchronized (this) {
                if (this.c.a(eVar.s.c)) {
                    this.h.b(this.e, eVar.s.c);
                } else {
                    com.sankuai.waimai.mach.manager.cache.e a2 = com.sankuai.waimai.mach.manager.a.a().a(eVar.s.c, eVar.s.d, eVar.s.n, this.d);
                    if (a2 != null && a2.c()) {
                        this.h.b(this.e, eVar.s.c);
                        d.a a3 = this.f.a(eVar.s.c);
                        if (a3 == null) {
                            return null;
                        }
                        Mach a4 = a3.a().a();
                        if (a4 != null && this.i != null) {
                            a4.registerJsEventCallback(this.i);
                        }
                        a4.initWithBundle(this.b, null, a2);
                        this.c.a(a4, a2, a2.j);
                    }
                    this.h.c(this.e, eVar.s.c);
                    return null;
                }
                return c(eVar);
            }
        }
    }

    private com.sankuai.waimai.mach.recycler.g c(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b250530f6c9b47a36512f98bf986b784", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b250530f6c9b47a36512f98bf986b784");
        }
        Map<String, Object> d = eVar.s.d();
        d.put("index", Integer.valueOf(eVar.v));
        d.put("data_id", eVar.s.e);
        d.put("lx_view_info", eVar.s.f);
        d.put("lx_click_info", eVar.s.g);
        d.put("ad_view_info", eVar.s.h);
        d.put("ad_click_info", eVar.s.i);
        if (this.g != null) {
            d.putAll(this.g);
        }
        if (this.b.isDestroyed()) {
            this.h.e(this.e, eVar.s.c);
            return null;
        }
        com.sankuai.waimai.mach.recycler.g a2 = this.c.a(eVar.s.c, d, eVar.s.q.m, eVar.s.q.n, eVar.s.n, this.d);
        if (a2 == null) {
            this.h.a(this.e, eVar.s.c, eVar.s.e(), "item_null");
        } else if (a2.b() == null) {
            this.h.a(this.e, eVar.s.c, eVar.s.e(), "root_node_null");
        } else {
            a2.b().a("index", Integer.valueOf(eVar.v));
            this.h.d(this.e, eVar.s.c);
        }
        return a2;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    @Nullable
    public final rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> d() {
        return this.j;
    }
}
