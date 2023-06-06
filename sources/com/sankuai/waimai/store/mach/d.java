package com.sankuai.waimai.store.mach;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.d;
import com.sankuai.waimai.mach.render.RenderNodeTask;
import com.sankuai.waimai.platform.mach.videoextend.VideoTagProcessor;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.util.monitor.cache.MachModuleCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.mach.container.a implements com.sankuai.waimai.store.mach.event.a, a.InterfaceC1221a {
    private static final com.sankuai.waimai.mach.d a = new com.sankuai.waimai.mach.d() { // from class: com.sankuai.waimai.store.mach.d.1
        @Override // com.sankuai.waimai.mach.d
        public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        }
    };
    public static ChangeQuickRedirect f;
    private final com.sankuai.waimai.store.expose.v2.a b;
    private a c;
    private com.sankuai.waimai.platform.mach.videoextend.d d;
    private boolean e;
    public com.sankuai.waimai.store.mach.event.b g;
    private com.sankuai.waimai.store.mach.inner.a t;
    private com.sankuai.waimai.platform.mach.monitor.c u;
    private b v;
    private final List<com.sankuai.waimai.store.mach.clickhandler.b> w;
    private com.sankuai.waimai.mach.manager.load.a x;
    private com.sankuai.waimai.mach.container.d y;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void b();
    }

    public com.sankuai.waimai.mach.d aZ_() {
        return null;
    }

    public d(com.sankuai.waimai.store.expose.v2.a aVar, String str) {
        super(aVar.bB_(), str);
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f240cd4b0bf5de3e2faedd70f5c77604", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f240cd4b0bf5de3e2faedd70f5c77604");
            return;
        }
        this.v = new b();
        this.w = new LinkedList();
        this.y = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.mach.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69649d8725b8ef6b3236b8df2e35b8c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69649d8725b8ef6b3236b8df2e35b8c9");
                    return;
                }
                super.c();
                d.this.e = false;
                if (d.this.c != null) {
                    a unused = d.this.c;
                } else {
                    u.c(d.this.r());
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82e699dbe430c5c8f572cbac9e409d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82e699dbe430c5c8f572cbac9e409d3");
                    return;
                }
                d.this.e = false;
                if (d.this.l != null) {
                    d.this.l.removeAllViews();
                    d.this.d.b = false;
                    d.this.d.b();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4b037de4da1fa7b08a118ddd710111a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4b037de4da1fa7b08a118ddd710111a");
                    return;
                }
                super.f();
                com.sankuai.waimai.platform.mach.monitor.b.a().a(d.this.u, d.this.p);
                a("success");
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "659cffa8be95037e35bfa599642adabe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "659cffa8be95037e35bfa599642adabe");
                    return;
                }
                super.b();
                d.this.e = false;
                if (d.this.c != null) {
                    a unused = d.this.c;
                } else {
                    u.c(d.this.r());
                }
                a("fail");
            }

            private void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65c03e48c59ec466293b4346134d0197", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65c03e48c59ec466293b4346134d0197");
                } else {
                    com.sankuai.waimai.store.util.monitor.cache.b.a(MachModuleCache.create(d.this.o, str2));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f550c3510d9aa63f8eaf40112d50cd2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f550c3510d9aa63f8eaf40112d50cd2d");
                    return;
                }
                super.a();
                d.this.e = false;
                if (d.this.c != null) {
                    a unused = d.this.c;
                } else {
                    u.c(d.this.r());
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5238271d07ca508fcca7b94ebaa0948e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5238271d07ca508fcca7b94ebaa0948e");
                    return;
                }
                super.d();
                d.this.e = true;
                com.sankuai.waimai.platform.mach.monitor.b.a().a(d.this.u, d.this.p, com.sankuai.waimai.platform.mach.monitor.e.a(d.this.k));
            }
        };
        this.b = aVar;
        this.d = new com.sankuai.waimai.platform.mach.videoextend.d();
        a(this.y);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b357fca4cc6c4c62a01ed3573ebab07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b357fca4cc6c4c62a01ed3573ebab07c");
            return;
        }
        super.a(mach);
        if (this.t != null) {
            com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this.t);
        }
        this.t = new com.sankuai.waimai.store.mach.inner.a(mach);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this.t);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(com.sankuai.waimai.mach.manager.load.a aVar, com.sankuai.waimai.mach.container.c cVar) {
        Object[] objArr = {aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac2908bf2a0282715332ea8e2baf134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac2908bf2a0282715332ea8e2baf134");
            return;
        }
        super.a(aVar, cVar);
        this.x = aVar;
    }

    public final void a(com.sankuai.waimai.store.mach.clickhandler.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f586bd0f17b56c43e6a24d65bd1fe2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f586bd0f17b56c43e6a24d65bd1fe2c");
        } else {
            this.w.add(bVar);
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e675b5e6f5e3fe08a2d74d578217022f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e675b5e6f5e3fe08a2d74d578217022f");
            return;
        }
        com.sankuai.waimai.store.mach.c cVar = new com.sankuai.waimai.store.mach.c(this.j, this.i, aVar);
        com.sankuai.waimai.mach.d aZ_ = aZ_();
        if (aZ_ == null) {
            aZ_ = a;
        }
        aVar.a(new VideoTagProcessor(this.d));
        cVar.a(this.w);
        cVar.a(aZ_);
    }

    public final void a(Activity activity, ViewGroup viewGroup, String str, Map<String, Object> map, String str2, String str3, final c cVar) {
        Object[] objArr = {activity, viewGroup, str, map, str2, str3, cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b75b19d9e0d1520ff1ad7e9e8f8a4b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b75b19d9e0d1520ff1ad7e9e8f8a4b5b");
        } else if (activity == null || t.a(str3) || t.a(str2) || t.a(str)) {
            this.y.c();
        } else {
            super.a(viewGroup, str2, str3);
            this.o = str;
            this.y.g();
            com.sankuai.waimai.mach.manager.cache.e a2 = com.sankuai.waimai.mach.manager.a.a().a(str, str, str2, str3);
            if (a2 == null || !a2.c()) {
                this.y.b();
                cVar.b();
                return;
            }
            this.y.f();
            this.k.initWithBundle(activity, viewGroup, a2);
            this.k.getDataProcessor().a(map, 0, new d.a() { // from class: com.sankuai.waimai.store.mach.d.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.common.d.a
                @SuppressLint({"StaticFieldLeak"})
                public final void a(@NonNull Map<String, Object> map2, @Nullable Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar) {
                    Object[] objArr2 = {map2, map3, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f6ee02873382b36cfc04fc8fa2d4e0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f6ee02873382b36cfc04fc8fa2d4e0e");
                        return;
                    }
                    com.sankuai.waimai.mach.node.a createRenderNode = new RenderNodeTask(d.this.k, 0, 0, aVar, null).createRenderNode(map2, map3);
                    com.sankuai.waimai.mach.render.d.a(d.this.k, createRenderNode);
                    if (d.this.k.getV8JSEngine() != null) {
                        d.this.k.getV8JSEngine().a();
                    }
                    if (createRenderNode != null) {
                        d.this.k.setRootNode(createRenderNode);
                        cVar.a();
                        return;
                    }
                    cVar.b();
                }

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c7734a5b420ccc9ba4d90aa0cd21793", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c7734a5b420ccc9ba4d90aa0cd21793");
                        return;
                    }
                    com.sankuai.waimai.mach.render.d.a(d.this.k, 8, exc);
                    cVar.b();
                }
            });
        }
    }

    public final Mach f() {
        return this.k;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d86eef0e525358f6ebedb416dda6019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d86eef0e525358f6ebedb416dda6019");
        } else if (q() && this.k != null) {
            com.sankuai.waimai.mach.node.a rootNode = this.k.getRootNode();
            c(rootNode);
            if (this.v.b != null) {
                this.v.a();
                ArrayList arrayList = new ArrayList();
                a(rootNode, arrayList);
                a(arrayList);
                return;
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.v.d)) {
                for (com.sankuai.waimai.mach.node.a aVar : this.v.d) {
                    b(aVar);
                    if ((aVar.h instanceof com.sankuai.waimai.store.mach.swiper.a) && ((com.sankuai.waimai.store.mach.swiper.a) aVar.h).d == null) {
                        ((com.sankuai.waimai.store.mach.swiper.a) aVar.h).d = this;
                    }
                }
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.v.c)) {
                for (com.sankuai.waimai.mach.node.a aVar2 : this.v.c) {
                    a(aVar2);
                }
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.v.d) || !com.sankuai.shangou.stone.util.a.b(this.v.c)) {
                this.v.a();
                ArrayList arrayList2 = new ArrayList();
                com.sankuai.waimai.store.mach.a.b(rootNode, arrayList2);
                a(arrayList2);
                return;
            }
            this.v.a();
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.k.searchNodeWithViewReport();
            if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : searchNodeWithViewReport) {
                if (aVar3 != null) {
                    e(aVar3);
                }
            }
        }
    }

    private void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1deb36012bfa52fd5c0d80f941a8f25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1deb36012bfa52fd5c0d80f941a8f25d");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (com.sankuai.waimai.mach.node.a aVar : list) {
                if (aVar != null) {
                    e(aVar);
                }
            }
        }
    }

    private void a(@NonNull com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939677dea186c35f6652012c90cd7add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939677dea186c35f6652012c90cd7add");
            return;
        }
        if (!com.sankuai.waimai.store.mach.a.b(aVar) && com.sankuai.waimai.store.mach.a.a(aVar)) {
            list.add(aVar);
        }
        List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
        if (com.sankuai.waimai.store.mach.a.b(aVar) || com.sankuai.shangou.stone.util.a.b(b2)) {
            return;
        }
        for (int i = 0; i < b2.size(); i++) {
            com.sankuai.waimai.mach.node.a aVar2 = b2.get(i);
            if (aVar2 != null && !com.sankuai.waimai.store.mach.a.b(aVar2)) {
                a(aVar2, list);
            }
        }
    }

    private void b(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8b3e76e3a223034acf0f70efe85a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8b3e76e3a223034acf0f70efe85a84");
            return;
        }
        if (com.sankuai.waimai.store.mach.a.a(aVar)) {
            e(aVar);
        }
        com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), 0);
        if (aVar2 != null) {
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                e(aVar3);
            }
        }
    }

    private com.sankuai.waimai.mach.node.a a(com.sankuai.waimai.mach.node.a aVar, int i) {
        boolean b2;
        boolean z;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761f955d72347986077b7a292c087496", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761f955d72347986077b7a292c087496");
        }
        if (aVar != null) {
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edfb4c2cd49cc4917d3ce77946e16216", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 0:
                        b2 = com.sankuai.waimai.store.mach.a.b(aVar);
                        z = b2;
                        break;
                    case 1:
                        b2 = com.sankuai.waimai.store.mach.a.c(aVar);
                        z = b2;
                        break;
                    case 2:
                        b2 = com.sankuai.waimai.store.mach.a.d(aVar);
                        z = b2;
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edfb4c2cd49cc4917d3ce77946e16216")).booleanValue();
            }
            if (!z) {
                List<com.sankuai.waimai.mach.node.a> b3 = aVar.b();
                com.sankuai.waimai.mach.node.a aVar2 = null;
                if (com.sankuai.shangou.stone.util.a.b(b3)) {
                    return null;
                }
                Iterator<com.sankuai.waimai.mach.node.a> it = b3.iterator();
                while (it.hasNext() && (aVar2 = a(it.next(), i)) == null) {
                }
                return aVar2;
            }
        }
        return aVar;
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d48e077b66c0dba8154fe027d7ee67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d48e077b66c0dba8154fe027d7ee67");
        } else if (aVar != null) {
            d(aVar);
            List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b2)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b2) {
                if (aVar2 != null) {
                    d(aVar2);
                }
                c(aVar2);
            }
        }
    }

    private void d(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7420e676c492b6b6a3ed89e2f9fdc8d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7420e676c492b6b6a3ed89e2f9fdc8d3");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.v.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.v.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.v.c.add(aVar);
        }
    }

    private void e(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0fdaba9f9481661829cb6a5dda5438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0fdaba9f9481661829cb6a5dda5438");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
                str = String.valueOf(aVar.h().get("expose-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.mach.d.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6c2cce90f4d722237022e1f7492b253", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6c2cce90f4d722237022e1f7492b253");
                    } else {
                        d.this.k.triggerViewReport(aVar);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b, aVar2);
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69fce7504ece37fbceaf1e14ec882a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69fce7504ece37fbceaf1e14ec882a8")).booleanValue() : this.l != null && c() && this.l.getWindowVisibility() == 0 && u.a(this.l);
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5668643ae7e7e7361b0436712257bef6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5668643ae7e7e7361b0436712257bef6")).booleanValue() : q() && this.d != null && this.d.a();
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13331cc87f1b963292a29fe8c06ba3dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13331cc87f1b963292a29fe8c06ba3dd");
        } else if (b() && c()) {
            this.d.d();
        }
    }

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff56208fdc529b8bfe7b729bba5ab6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff56208fdc529b8bfe7b729bba5ab6a");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("#MachOnChange,curIndex=%d", Integer.valueOf(i));
        if (!q() || this.k == null) {
            return;
        }
        b(a(this.k.getRootNode(), 1), i);
    }

    private void b(com.sankuai.waimai.mach.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f073655cd6bbb24a30c5c34ef6eac0b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f073655cd6bbb24a30c5c34ef6eac0b6");
        } else if (aVar != null && i >= 0) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                e(aVar);
            }
            com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), i);
            if (aVar2 == null || aVar2.g() == null || com.sankuai.waimai.store.mach.a.d(aVar2)) {
                return;
            }
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                e(aVar3);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f69ab4aadf200bfc937171ce37e4fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f69ab4aadf200bfc937171ce37e4fb8");
            return;
        }
        super.a(str, map);
        com.sankuai.waimai.store.mach.event.b a2 = com.sankuai.waimai.store.mach.event.c.a(str);
        if (a2 != null) {
            a2.a(this, str, map);
        }
        if (this.g != null) {
            this.g.a(this, str, map);
        }
        if ("std_trigger_expose_event".equals(str)) {
            g();
        }
    }

    @Override // com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.container.b
    public final void b(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756dc1152673902e43d9d1971598dd35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756dc1152673902e43d9d1971598dd35");
        } else {
            super.b(str, map);
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464cf11ec165790ee8cc9ef830dc0be4", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464cf11ec165790ee8cc9ef830dc0be4") : this.b.bB_();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.mach.node.a b;
        public final List<com.sankuai.waimai.mach.node.a> c;
        public final List<com.sankuai.waimai.mach.node.a> d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a511cad00ee2997816f5f950e763a84", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a511cad00ee2997816f5f950e763a84");
                return;
            }
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc4068a2c9433de916ac908d4d91e2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc4068a2c9433de916ac908d4d91e2d");
                return;
            }
            this.b = null;
            this.c.clear();
            this.d.clear();
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79303bd8f7eb9531b8b2a3a1502969f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79303bd8f7eb9531b8b2a3a1502969f7");
        } else if (aVar != null && (aVar.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                e(aVar);
            }
            List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar.h).e();
            List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(e) || com.sankuai.shangou.stone.util.a.b(b2)) {
                return;
            }
            for (Integer num : e) {
                com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b2, num.intValue());
                if (aVar2 != null && aVar2.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar2)) {
                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                    com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                            e(aVar3);
                        }
                    }
                }
            }
        }
    }
}
