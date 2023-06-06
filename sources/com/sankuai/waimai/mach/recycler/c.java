package com.sankuai.waimai.mach.recycler;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a {
    public static ChangeQuickRedirect d;
    protected Mach e;
    protected h f;
    protected Mach.a g;
    public com.sankuai.waimai.mach.f h;
    MonitorManager i;
    public String j;
    public long k;
    public Map<String, Object> l;
    String m;
    public int n;
    public int o;
    public String p;
    boolean q;
    int r;
    String s;
    int t;
    public Mach.d u;
    protected com.sankuai.waimai.mach.g v;
    com.sankuai.waimai.mach.f w;
    private Map<String, Object> x;

    public c(String str, h hVar, Mach.a aVar, String str2, String str3) {
        Object[] objArr = {str, hVar, aVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ed4fdd037a1b4ba2439993cab16c43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ed4fdd037a1b4ba2439993cab16c43");
            return;
        }
        this.q = false;
        this.r = 0;
        this.x = new HashMap();
        this.t = 5000;
        this.v = new com.sankuai.waimai.mach.g() { // from class: com.sankuai.waimai.mach.recycler.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a10e93c792d54b1f11b72ac05faaeca2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a10e93c792d54b1f11b72ac05faaeca2");
                } else if (c.this.e != null) {
                    c.this.a(aVar2);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a7e0f43ed108ab9b3c5748500b7ccbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a7e0f43ed108ab9b3c5748500b7ccbc");
                } else if (m.e()) {
                    c.this.l = null;
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b3f666964af9b49d99679d3d4ea7b57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b3f666964af9b49d99679d3d4ea7b57");
                } else {
                    c.this.i.renderFailure(c.this.j, c.this.p, c.this.b, c.this.i(), c.this.l, th, (int) (SystemClock.elapsedRealtime() - c.this.k));
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str4, String str5) {
                Object[] objArr2 = {str4, str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78a3a97ee57b153286d46b9d65776943", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78a3a97ee57b153286d46b9d65776943");
                } else {
                    c.this.i.exprError(c.this.p, c.this.i(), c.this.j, c.this.b, c.this.l, str4, str5);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9adc09dd587f7c9fbeb0a54188ccf367", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9adc09dd587f7c9fbeb0a54188ccf367");
                } else {
                    c.this.i.jsError(c.this.p, c.this.i(), c.this.j, c.this.b, c.this.l, th);
                }
            }
        };
        this.w = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.mach.recycler.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.f
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18fdea105b3d5f83728bfc1bafce9e25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18fdea105b3d5f83728bfc1bafce9e25");
                } else if (c.this.h != null) {
                    c.this.h.a();
                }
            }
        };
        this.b = str;
        this.f = hVar;
        this.g = aVar;
        this.j = str2;
        this.p = str3;
        this.i = com.sankuai.waimai.mach.manager.a.a().b();
    }

    public c(String str, String str2, Mach.a aVar, String str3, String str4) {
        Object[] objArr = {str, str2, aVar, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e096503eef82e169ae4bd9cf524d24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e096503eef82e169ae4bd9cf524d24");
            return;
        }
        this.q = false;
        this.r = 0;
        this.x = new HashMap();
        this.t = 5000;
        this.v = new com.sankuai.waimai.mach.g() { // from class: com.sankuai.waimai.mach.recycler.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a10e93c792d54b1f11b72ac05faaeca2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a10e93c792d54b1f11b72ac05faaeca2");
                } else if (c.this.e != null) {
                    c.this.a(aVar2);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a7e0f43ed108ab9b3c5748500b7ccbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a7e0f43ed108ab9b3c5748500b7ccbc");
                } else if (m.e()) {
                    c.this.l = null;
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b3f666964af9b49d99679d3d4ea7b57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b3f666964af9b49d99679d3d4ea7b57");
                } else {
                    c.this.i.renderFailure(c.this.j, c.this.p, c.this.b, c.this.i(), c.this.l, th, (int) (SystemClock.elapsedRealtime() - c.this.k));
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str42, String str5) {
                Object[] objArr2 = {str42, str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78a3a97ee57b153286d46b9d65776943", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78a3a97ee57b153286d46b9d65776943");
                } else {
                    c.this.i.exprError(c.this.p, c.this.i(), c.this.j, c.this.b, c.this.l, str42, str5);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9adc09dd587f7c9fbeb0a54188ccf367", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9adc09dd587f7c9fbeb0a54188ccf367");
                } else {
                    c.this.i.jsError(c.this.p, c.this.i(), c.this.j, c.this.b, c.this.l, th);
                }
            }
        };
        this.w = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.mach.recycler.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.f
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18fdea105b3d5f83728bfc1bafce9e25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18fdea105b3d5f83728bfc1bafce9e25");
                } else if (c.this.h != null) {
                    c.this.h.a();
                }
            }
        };
        this.b = str;
        this.s = str2;
        this.g = aVar;
        this.j = str3;
        this.p = str4;
        this.i = com.sankuai.waimai.mach.manager.a.a().b();
    }

    @Override // com.sankuai.waimai.mach.recycler.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e2dc5c5966147f8998111ab59399b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e2dc5c5966147f8998111ab59399b5");
        } else if (this.e != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.e.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar : searchNodeWithViewReport) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5388c8249497abb7f4537f70421329ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5388c8249497abb7f4537f70421329ca");
                } else if (aVar != null) {
                    if (!com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.swiper.b.class)) {
                        if (com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                            com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) aVar.e.h;
                            if (!CollectionUtils.isEmpty(bVar.e())) {
                                List<Integer> e = bVar.e();
                                int indexOf = aVar.e.b().indexOf(aVar);
                                if (indexOf >= 0 && e.contains(Integer.valueOf(indexOf))) {
                                    b(aVar);
                                }
                            }
                        } else {
                            b(aVar);
                        }
                    } else if (aVar.e.b().indexOf(aVar) == ((com.sankuai.waimai.mach.component.swiper.b) aVar.e.h).b) {
                        b(aVar);
                    }
                }
            }
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3961bcdd7b69ddfaf35c2b83b46f5687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3961bcdd7b69ddfaf35c2b83b46f5687");
        } else if (this.r <= 0) {
            this.r = 1;
        } else {
            this.r++;
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d020db64b928961419d010f0271c6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d020db64b928961419d010f0271c6a");
        } else {
            this.r--;
        }
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08cef9307a370281cf73a487a50c36e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08cef9307a370281cf73a487a50c36e8") : (this.f == null || this.f.c == null) ? "" : this.f.c.a();
    }

    private void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00582de4471f7568b34dc661094d3826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00582de4471f7568b34dc661094d3826");
        } else if (aVar != null) {
            this.e.triggerViewReport(aVar);
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db61e8d5b0a2c28a3682e64ecd81f68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db61e8d5b0a2c28a3682e64ecd81f68");
            return;
        }
        this.k = SystemClock.elapsedRealtime();
        if (map != null) {
            this.l = map;
        } else {
            this.l = new HashMap();
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6779ab367d9b1aaf12d7aba72e15a8d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6779ab367d9b1aaf12d7aba72e15a8d3");
        } else {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    public final Mach k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61072f66355d524263d1d73cd4e1efd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61072f66355d524263d1d73cd4e1efd0");
        }
        if (this.e == null && this.g != null) {
            this.e = this.g.a();
            this.e.addRenderListener(this.v);
            if (this.u != null) {
                this.e.registerJsEventCallback(this.u);
            }
        }
        return this.e;
    }

    @Override // com.sankuai.waimai.mach.recycler.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a28a4d3908456eee241ce4b3310a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a28a4d3908456eee241ce4b3310a2e");
            return;
        }
        super.f();
        if (this.e != null) {
            this.e.onDestroy();
        }
        this.q = true;
    }

    public final Mach l() {
        return this.e;
    }

    public final h m() {
        return this.f;
    }

    public final void a(h hVar) {
        this.f = hVar;
    }

    public final c a(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d9451b69ff861b89ae9af4d2a5f743", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d9451b69ff861b89ae9af4d2a5f743");
        }
        if (this.x == null) {
            this.x = new HashMap();
        }
        this.x.put(str, obj);
        return this;
    }

    @Nullable
    public final Object a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39136dbab6de36a5e6c44ac74d73e21d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39136dbab6de36a5e6c44ac74d73e21d");
        }
        if (this.x != null) {
            return this.x.get(str);
        }
        return null;
    }
}
