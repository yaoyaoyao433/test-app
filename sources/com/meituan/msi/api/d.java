package com.meituan.msi.api;

import android.support.annotation.NonNull;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.IContainerEvent;
import com.meituan.msi.module.ApiModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements IContainerEvent, com.meituan.msi.lifecycle.a {
    public static ChangeQuickRedirect a;
    private com.meituan.msi.dispather.e b;
    private h c;
    private ApiPortal.b d;
    private b e;
    private Object f;
    private List<ApiModule> g;

    public d(@NonNull ApiPortal.b bVar, @NonNull com.meituan.msi.dispather.e eVar, h hVar, b bVar2) {
        Object[] objArr = {bVar, eVar, hVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58fc41f86687fa9db099def97115009d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58fc41f86687fa9db099def97115009d");
            return;
        }
        this.f = new Object();
        this.g = new ArrayList();
        this.d = bVar;
        this.b = eVar;
        this.c = hVar;
        this.e = bVar2;
        e();
        f();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed66292f0afba4fa0535500590fd4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed66292f0afba4fa0535500590fd4ec");
            return;
        }
        this.g.add(new com.meituan.msi.module.a(this.e));
        if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.a.f(), new b.a() { // from class: com.meituan.msi.api.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.serviceloader.b.a
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b950a3d46d79db305160bb5c1b3c46a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b950a3d46d79db305160bb5c1b3c46a");
                    } else {
                        com.meituan.msi.log.a.a("init  ServiceLoader fail ");
                    }
                }
            });
        }
        Map<String, String> map = com.sankuai.meituan.serviceloader.b.b().get(ApiModule.class.getName());
        if (map == null || map.size() == 0) {
            com.meituan.msi.log.a.a("ApiModule  is empty ");
        } else {
            for (String str : map.values()) {
                try {
                    this.g.add((ApiModule) Class.forName(str).newInstance());
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
        for (ApiModule apiModule : this.g) {
            apiModule.a(new MsiContext(null, com.meituan.msi.parser.a.a(this.d, (c<String>) null), null));
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3feaa77213ed9a081f9199e40d2e86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3feaa77213ed9a081f9199e40d2e86a");
        } else if (this.c != null && this.g.size() > 0) {
            for (ApiModule apiModule : this.g) {
                if (apiModule != null) {
                    this.c.a(apiModule);
                }
            }
        }
    }

    @Override // com.meituan.msi.dispather.IContainerEvent
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22a3f2e33d8e21ec655b4fe9d24741b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22a3f2e33d8e21ec655b4fe9d24741b");
            return;
        }
        synchronized (this.f) {
            if (this.g.size() > 0) {
                for (ApiModule apiModule : this.g) {
                    if (apiModule instanceof IContainerEvent) {
                        ((IContainerEvent) apiModule).a(str, obj);
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d376e6cc159b65be65c0778c1ff4824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d376e6cc159b65be65c0778c1ff4824");
            return;
        }
        synchronized (this.f) {
            if (this.g.size() > 0) {
                for (ApiModule apiModule : this.g) {
                    if (apiModule != null) {
                        apiModule.a(com.meituan.msi.a.f(), this.b);
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d3e03ca330738174099ba3f4795675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d3e03ca330738174099ba3f4795675");
            return;
        }
        synchronized (this.f) {
            if (this.g.size() > 0) {
                for (ApiModule apiModule : this.g) {
                    if (apiModule instanceof com.meituan.msi.lifecycle.a) {
                        ((com.meituan.msi.lifecycle.a) apiModule).b();
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c11382603b5f4ff67c5f17fd8f31065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c11382603b5f4ff67c5f17fd8f31065");
            return;
        }
        synchronized (this.f) {
            if (this.g.size() > 0) {
                for (ApiModule apiModule : this.g) {
                    if (apiModule instanceof com.meituan.msi.lifecycle.a) {
                        ((com.meituan.msi.lifecycle.a) apiModule).c();
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e33ca02ce6c5ae76fd6f5d65e728ae0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e33ca02ce6c5ae76fd6f5d65e728ae0e");
            return;
        }
        synchronized (this.f) {
            if (this.g.size() > 0) {
                for (ApiModule apiModule : this.g) {
                    if (apiModule != null) {
                        apiModule.a(com.meituan.msi.a.f());
                    }
                }
            }
        }
    }
}
