package com.sankuai.waimai.platform.widget.filterbar.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.c;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.e;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.i;
import com.sankuai.waimai.platform.widget.filterbar.presenter.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC1093a {
    public static ChangeQuickRedirect a;
    a.c b;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b c;
    public boolean d;
    public boolean e;
    public boolean f;
    boolean g;
    public boolean h;
    a.b i;
    boolean j;
    private boolean k;

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar2, final long j, final long j2, final int i) {
        Object[] objArr = {bVar2, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fb4fd088efcdff83cb7a19b15b5adb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fb4fd088efcdff83cb7a19b15b5adb27");
        } else if (bVar.c != null) {
            f.a aVar = new f.a();
            aVar.e = bVar2;
            c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(bVar.c), (f) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final void a(Error error) {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final /* synthetic */ void a(f.b bVar3) {
                    Object[] objArr2 = {bVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "470173f2d7e4fca8f9103eda88abb59f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "470173f2d7e4fca8f9103eda88abb59f");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                    b.this.a(j, j2, i, false);
                }
            });
        }
    }

    public b(a.c cVar, com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0603cbe21b971ae0ec344a931f8a1f9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0603cbe21b971ae0ec344a931f8a1f9f");
            return;
        }
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.b = cVar;
        if (this.b != null) {
            this.b.a((a.c) this);
        }
        this.c = bVar;
        this.c.a(new b.a<Void>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
            public final void a(Exception exc) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "178d6fdd4828466f876addb7f959b210", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "178d6fdd4828466f876addb7f959b210");
                } else {
                    b.this.t();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1548d2aba32ef11a067c31cab6d67ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1548d2aba32ef11a067c31cab6d67ad");
        } else {
            t();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(long j) {
        h r;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b1b0f00b4f29325a69d4497668fce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b1b0f00b4f29325a69d4497668fce4");
            return;
        }
        if (this.b != null) {
            this.b.f();
        }
        if (this.c == null) {
            return;
        }
        Long b = this.c.b();
        if (b != null && b.longValue() == j && (r = this.c.r()) != null && r.b != null && !r.b.isEmpty()) {
            Iterator<h.a> it = r.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h.a next = it.next();
                if (next != null) {
                    j = next.a;
                    break;
                }
            }
        }
        b(j);
        h r2 = this.c.r();
        if (r2 == null || r2.a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h.a> it2 = r2.a.iterator();
        while (it2.hasNext()) {
            h.a next2 = it2.next();
            if (next2 != null && next2.h != null && next2.a == j) {
                arrayList.add(next2);
            }
        }
        f.a aVar = new f.a();
        aVar.c = arrayList;
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(this.c), (f) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(f.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32a7835a6d82c0d1be2a7663c5889d9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32a7835a6d82c0d1be2a7663c5889d9c");
                } else {
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void b() {
        h r;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fe72045b8ced89456b9b3210bcfac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fe72045b8ced89456b9b3210bcfac0");
            return;
        }
        if (this.b != null) {
            this.b.f();
        }
        a(true);
        i();
        e();
        if (this.d) {
            c();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5475273ef3181b17edffda3fd3e178fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5475273ef3181b17edffda3fd3e178fa");
        } else if (this.c == null || (r = this.c.r()) == null) {
        } else {
            this.d = true;
            final ArrayList arrayList = null;
            if (r.b != null) {
                arrayList = new ArrayList();
                Iterator<h.a> it = r.b.iterator();
                while (it.hasNext()) {
                    h.a next = it.next();
                    if (next != null) {
                        arrayList.add(new h.a(next));
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    h.a aVar = (h.a) it2.next();
                    if (aVar != null && aVar.h != null && aVar.h.a) {
                        aVar.h.a = !this.c.a(5, String.valueOf(aVar.a), aVar.h.b);
                    }
                }
            }
            Long b = this.c.b();
            this.c.e();
            if (this.i != null) {
                com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
                cVar.a = b;
                cVar.b = this.c.j();
                cVar.c = this.c.m();
                cVar.d = this.c.y();
                cVar.e = this.c.D().g;
                this.i.a(cVar);
            }
            if (this.b != null) {
                this.b.a(arrayList, b);
            }
            f.a aVar2 = new f.a();
            aVar2.b = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(true, 0);
            com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(this.c), (f) aVar2, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.13
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final void a(Error error) {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final /* synthetic */ void a(f.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6ac838952665478ab5ccdd4dc2473bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6ac838952665478ab5ccdd4dc2473bf");
                        return;
                    }
                    b.this.t();
                    f.a aVar3 = new f.a();
                    aVar3.d = arrayList;
                    com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(b.this.c), (f) aVar3, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.13.1
                        @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                        public final void a(Error error) {
                        }

                        @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                        public final /* bridge */ /* synthetic */ void a(f.b bVar2) {
                        }
                    });
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42751305969d3c95a6be7e74126ccfe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42751305969d3c95a6be7e74126ccfe5");
            return;
        }
        this.d = false;
        if (this.b != null) {
            this.b.b();
            this.b.i(false);
        }
        if (this.i != null) {
            this.i.a();
        }
        f.a aVar = new f.a();
        aVar.b = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(false, 0);
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(this.c), (f) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(f.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "661c3c10d2f20cba4d5a3bb9ee64d010", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "661c3c10d2f20cba4d5a3bb9ee64d010");
                } else {
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1746cc076dd12f61821b9fd6c168ebc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1746cc076dd12f61821b9fd6c168ebc8");
            return;
        }
        c();
        a(true);
        e();
        i();
        if (this.c == null) {
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<i, R>) new i(this.c), (i) new i.a(j), (c.InterfaceC1084c) new c.InterfaceC1084c<i.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(i.b bVar) {
                i.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5828d3edf85eabe600484e1568f0ad0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5828d3edf85eabe600484e1568f0ad0a");
                } else if (b.this.c != null) {
                    b.this.t();
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
                    cVar.a = bVar2.b;
                    cVar.b = bVar2.c;
                    cVar.c = b.this.c.m();
                    cVar.d = b.this.c.y();
                    cVar.e = b.this.c.D().g;
                    if (b.this.i != null) {
                        b.this.i.b(cVar);
                    }
                    if (b.this.b != null) {
                        b.this.b.a(cVar);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d7f0fc9ee88fa7b49be0752b2f7f60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d7f0fc9ee88fa7b49be0752b2f7f60");
        } else if (this.c == null) {
        } else {
            this.c.d();
            t();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(final long j, final long j2, final int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a5162d0c4de7fd267e504e74db2389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a5162d0c4de7fd267e504e74db2389");
            return;
        }
        if (this.b != null) {
            this.b.f();
        }
        c();
        i();
        e();
        if (this.e) {
            a(true);
            return;
        }
        Object[] objArr2 = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ca46e991edb7708d839828a679cd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ca46e991edb7708d839828a679cd1d");
            return;
        }
        d(true);
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<d, R>) new d(this.c), (d) new d.a(true, j, j2, i), (c.InterfaceC1084c) new c.InterfaceC1084c<d.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(d.b bVar) {
                d.b bVar2 = bVar;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "963eb9621006d283430dd11b258a0242", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "963eb9621006d283430dd11b258a0242");
                } else if (bVar2 == null) {
                    if (b.this.b != null) {
                        b.this.b.b(false);
                        b.this.b.c(true);
                    }
                } else {
                    final com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar3 = bVar2.b;
                    b.this.a(bVar3);
                    b.this.d(j, j2, i);
                    b.this.a(j, j2, i, false, true, new b.a<Set<String>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.15.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                        public final /* synthetic */ void a(Set<String> set) {
                            Object[] objArr4 = {set};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a65229c1eaa7dc94bf3bb1ef358b323", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a65229c1eaa7dc94bf3bb1ef358b323");
                                return;
                            }
                            b.this.b(bVar3);
                            b.a(b.this, bVar3, j, j2, i);
                        }

                        @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                        public final void a(Exception exc) {
                            Object[] objArr4 = {exc};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4591351e1682aa4ae47aedc4d757fb22", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4591351e1682aa4ae47aedc4d757fb22");
                                return;
                            }
                            b.this.b(bVar3);
                            b.a(b.this, bVar3, j, j2, i);
                        }
                    });
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr3 = {error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b6d2cab88a9f625c5760c298ab412e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b6d2cab88a9f625c5760c298ab412e6");
                } else if (b.this.b != null) {
                    b.this.b.b(false);
                    b.this.b.d(true);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void b(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89e9fa2c46ddcfb46d2ee2fadb3f712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89e9fa2c46ddcfb46d2ee2fadb3f712");
            return;
        }
        if (this.b != null) {
            this.b.f();
        }
        c();
        i();
        a(true);
        if (this.f) {
            e();
            return;
        }
        Object[] objArr2 = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21e1cc608c7a67378b2eec1dc2a6e189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21e1cc608c7a67378b2eec1dc2a6e189");
            return;
        }
        Object[] objArr3 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4e628c0bfef63e4b1546e01a5746dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4e628c0bfef63e4b1546e01a5746dc9");
        } else {
            this.f = true;
            if (this.b != null) {
                this.b.d();
                this.b.e(true);
                this.b.f(false);
                this.b.g(false);
                this.b.i(true);
            }
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<d, R>) new d(this.c), (d) new d.a(false, j, j2, i), (c.InterfaceC1084c) new c.InterfaceC1084c<d.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(d.b bVar) {
                Map<String, g> map;
                d.b bVar2 = bVar;
                Object[] objArr4 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ccf37cad4af5e8c5f2721b8b72c105b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ccf37cad4af5e8c5f2721b8b72c105b5");
                    return;
                }
                if (b.this.b != null) {
                    b.this.b.e(false);
                }
                if (bVar2 == null) {
                    if (b.this.b != null) {
                        b.this.b.f(true);
                        return;
                    }
                    return;
                }
                com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar3 = bVar2.b;
                if (b.this.c != null) {
                    b.this.c.b(bVar3);
                }
                b bVar4 = b.this;
                Object[] objArr5 = {bVar3};
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, bVar4, changeQuickRedirect5, false, "c0420255471eb2a96317115be11f0403", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar4, changeQuickRedirect5, false, "c0420255471eb2a96317115be11f0403");
                } else if (bVar4.b != null) {
                    if (bVar3 == null || bVar3.b == null || bVar3.b.isEmpty()) {
                        bVar4.b.f(true);
                        return;
                    }
                    Set<String> set = null;
                    if (bVar4.c != null) {
                        set = bVar4.c.A();
                        map = bVar4.c.B();
                    } else {
                        map = null;
                    }
                    bVar4.b.b(bVar3, set, map);
                    if (bVar4.i == null || bVar4.c == null) {
                        return;
                    }
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
                    cVar.a = bVar4.s();
                    cVar.b = set;
                    cVar.c = map;
                    cVar.d = bVar4.c.y();
                    cVar.e = bVar4.c.D().g;
                    bVar4.i.h(cVar);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr4 = {error};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "141b4c5fbb2eb6d9470479c9cfb27ce4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "141b4c5fbb2eb6d9470479c9cfb27ce4");
                } else if (b.this.b != null) {
                    b.this.b.b(false);
                    b.this.b.d(true);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void c(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675734ba91b546bca9fe89e75d26cc2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675734ba91b546bca9fe89e75d26cc2a");
            return;
        }
        a(j, j2, i, true);
        d(j, j2, i);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78c3715b73de0cb5e03b93ba1101f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78c3715b73de0cb5e03b93ba1101f7d");
            return;
        }
        c();
        i();
        e();
        if (this.e) {
            a(true);
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b94201b2e29f7d3274c5130945cf57fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b94201b2e29f7d3274c5130945cf57fd");
            return;
        }
        d(true);
        if (this.b != null) {
            this.b.b(true);
            this.b.c(false);
            this.b.d(false);
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<com.sankuai.waimai.platform.widget.filterbar.domain.usecase.c, R>) new com.sankuai.waimai.platform.widget.filterbar.domain.usecase.c(this.b.l(), this.c), (com.sankuai.waimai.platform.widget.filterbar.domain.usecase.c) new c.a(str), (c.InterfaceC1084c) new c.InterfaceC1084c<c.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(c.b bVar) {
                c.b bVar2 = bVar;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ebe817e472ce9de0a0cfed6b28356600", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ebe817e472ce9de0a0cfed6b28356600");
                    return;
                }
                if (b.this.b != null) {
                    b.this.b.b(false);
                }
                if (bVar2 == null) {
                    if (b.this.b != null) {
                        b.this.b.c(true);
                        return;
                    }
                    return;
                }
                com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar3 = bVar2.b;
                final b bVar4 = b.this;
                Object[] objArr4 = {bVar3};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar4, changeQuickRedirect4, false, "f0906fd89b64e3f3525b06002f20cc61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar4, changeQuickRedirect4, false, "f0906fd89b64e3f3525b06002f20cc61");
                    return;
                }
                bVar4.a(bVar3);
                bVar4.b(bVar3);
                f.a aVar = new f.a();
                aVar.e = bVar3;
                com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(bVar4.c), (f) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                    public final void a(Error error) {
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                    public final /* synthetic */ void a(f.b bVar5) {
                        Object[] objArr5 = {bVar5};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2ca9f8f0614bd0627a4d512104776115", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2ca9f8f0614bd0627a4d512104776115");
                        } else {
                            com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr3 = {error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd03b3a8485336835c453981f09896bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd03b3a8485336835c453981f09896bb");
                } else if (b.this.b != null) {
                    b.this.b.b(false);
                    b.this.b.d(true);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df3fb1221021c001f540989913e37c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df3fb1221021c001f540989913e37c8");
            return;
        }
        if (this.b != null) {
            this.b.f();
        }
        c();
        e();
        a(true);
        if (this.h) {
            i();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e854e89611701c80e91b9eb6a98c339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e854e89611701c80e91b9eb6a98c339");
            return;
        }
        this.h = true;
        if (this.b != null) {
            this.b.g();
            this.b.b(2);
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a(new com.sankuai.waimai.platform.widget.filterbar.domain.usecase.b(this.c), (com.sankuai.waimai.platform.widget.filterbar.domain.usecase.b) null, new c.InterfaceC1084c<b.a>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.14
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr3 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a01f672a1bffe3528b3e1d8593d5fc87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a01f672a1bffe3528b3e1d8593d5fc87");
                } else if (b.this.h) {
                    b.this.b.a(aVar2.b.a, aVar2.c);
                    if (b.this.i != null) {
                        b.this.i.c(b.this.c.z());
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr3 = {error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f145cd974d240f44ddc8cf41973f79f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f145cd974d240f44ddc8cf41973f79f7");
                } else {
                    b.this.b.b(3);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7b13e8851d9c0fe831505228504593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7b13e8851d9c0fe831505228504593");
        } else if (this.h) {
            this.h = false;
            t();
            this.b.h();
            if (this.i != null) {
                this.i.b();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c17437d79bf591baba535e454333fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c17437d79bf591baba535e454333fb");
        } else if (this.c == null) {
        } else {
            if (z) {
                this.c.a(str);
            } else {
                this.c.b(str);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(b.a.C1086a c1086a, boolean z, final long j, final long j2, final int i, boolean z2, boolean z3) {
        Object[] objArr = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), new Long(j2), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6075a3ae73afd5f4015fd56f6825781e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6075a3ae73afd5f4015fd56f6825781e");
        } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
        } else {
            this.c.a(this.c.j());
            this.c.a(this.c.m());
            a(c1086a.a, z);
            l();
            if (this.c != null) {
                f.a aVar = new f.a();
                Object[] objArr2 = {c1086a};
                ChangeQuickRedirect changeQuickRedirect2 = f.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "62bcf97158d2a2c003e88f470fa81bc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "62bcf97158d2a2c003e88f470fa81bc1");
                } else {
                    if (aVar.f == null) {
                        aVar.f = new ArrayList();
                    }
                    if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
                        aVar.f.add(c1086a);
                    }
                }
                com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<f, R>) new f(this.c), (f) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<f.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.11
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                    public final void a(Error error) {
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                    public final /* synthetic */ void a(f.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48b1d1e5ea380a23aaada3564217e1ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48b1d1e5ea380a23aaada3564217e1ba");
                            return;
                        }
                        com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                        b.this.j = true;
                        b.this.a(j, j2, i, false);
                    }
                });
            }
            this.k = z3;
            if (this.i != null) {
                this.i.a(c1086a, this.g, z, z2, z3);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed711683f96b205a8b3a27b204af5dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed711683f96b205a8b3a27b204af5dd7");
        } else if (this.c == null) {
        } else {
            this.c.a(str, i, i2);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc3a9634d25b9c941a003bbd12bfb12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc3a9634d25b9c941a003bbd12bfb12");
        } else if (this.c == null) {
        } else {
            this.c.p();
            this.c.o();
            com.sankuai.waimai.platform.widget.filterbar.domain.model.b s = this.c.s();
            Set<String> h = this.c.h();
            Map<String, g> k = this.c.k();
            if (this.b != null) {
                this.b.a(s, h, k);
                this.b.a(this.c.v(), h);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6ef8f32099dafc519a3c1647a564eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6ef8f32099dafc519a3c1647a564eb");
        } else if (this.c == null) {
        } else {
            com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
            cVar.a = this.c.c();
            cVar.b = this.c.i();
            cVar.c = this.c.l();
            this.c.p();
            com.sankuai.waimai.platform.widget.filterbar.domain.model.b s = this.c.s();
            Set<String> h = this.c.h();
            Map<String, g> k = this.c.k();
            if (this.b != null) {
                this.b.a(s, h, k);
            }
            u();
            if (this.i != null) {
                this.i.g(cVar);
            }
            if (this.b != null) {
                this.b.a(this.c.z());
            }
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0552d16ae02834983a097f2bc67f3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0552d16ae02834983a097f2bc67f3c3");
            return;
        }
        this.c.n();
        t();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01c95a82de32d5c515eb459cd5c818b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01c95a82de32d5c515eb459cd5c818b");
            return;
        }
        u();
        a(true);
        com.sankuai.waimai.platform.widget.filterbar.domain.model.c z = this.c.z();
        if (this.i != null) {
            this.i.f(z);
        }
        if (this.b != null) {
            this.b.a(z);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43cf6b3c5d5e5186a1d8e9057787d903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43cf6b3c5d5e5186a1d8e9057787d903");
        } else if (this.e) {
            this.e = false;
            this.c.p();
            t();
            if (this.b != null) {
                this.b.a(true);
                this.b.i(false);
            }
            if (this.i != null) {
                this.i.c();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5845cd1d6dec0ac2461456f4cef3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5845cd1d6dec0ac2461456f4cef3d6");
        } else if (this.f) {
            this.f = false;
            this.c.p();
            t();
            if (this.b != null) {
                this.b.e();
                this.b.i(false);
            }
            if (this.i != null) {
                this.i.d();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e367a3ec51f86da5bb2c09531395802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e367a3ec51f86da5bb2c09531395802");
        } else if (this.c == null) {
        } else {
            this.c.q();
            com.sankuai.waimai.platform.widget.filterbar.domain.model.b u = this.c.u();
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            if (this.b != null) {
                this.b.b(u, treeSet, hashMap);
            }
            u();
            if (this.b != null) {
                this.b.a(this.c.z());
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a68cc113fbec47675bbfd7dc78755e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a68cc113fbec47675bbfd7dc78755e");
            return;
        }
        u();
        e();
        if (this.b != null) {
            this.b.a(this.c.z());
        }
        if (this.i != null) {
            com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
            cVar.e = this.c.D().g;
            cVar.a = this.c.b();
            cVar.c = this.c.B();
            cVar.b = this.c.A();
            this.i.i(cVar);
        }
    }

    public final long r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764b79e33cb55f24ea24cbca226c46ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764b79e33cb55f24ea24cbca226c46ce")).longValue();
        }
        try {
            this.c.D();
        } catch (Throwable unused) {
        }
        return 0L;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200281ccb61c5932dee07a3604457e72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200281ccb61c5932dee07a3604457e72");
        } else if (this.b != null) {
            this.g = z;
            this.b.j(z);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d74fdc5bcda613fdc60b9c15a3721b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d74fdc5bcda613fdc60b9c15a3721b1");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }

    public final Long s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58fcb76b55ab1c1e3346f65aadb0958", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58fcb76b55ab1c1e3346f65aadb0958");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.b();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final Set<String> m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3e82edbfff0451476dd8218f726dd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3e82edbfff0451476dd8218f726dd0");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.j();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final Map<String, g> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee9e7d549cbd044eda4f8fe0b6887f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee9e7d549cbd044eda4f8fe0b6887f6");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.m();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc39656f3c1b4fc91f0f0a2993555542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc39656f3c1b4fc91f0f0a2993555542");
        } else if (this.c != null) {
            this.c.b(j);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(a.b bVar) {
        this.i = bVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7607932735dfad506d7244bacf9a0bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7607932735dfad506d7244bacf9a0bc2");
        } else if (this.b != null) {
            this.b.b(obj);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final List<String> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7a59c4f994be46f6ef39113d426efe", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7a59c4f994be46f6ef39113d426efe") : a(this.c.v());
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf306620d360c096356c0ebef7c3bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf306620d360c096356c0ebef7c3bac");
        } else if (this.c != null) {
            this.c.a(z);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723a5fd1c568dd3ae7cfc00184a9ee9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723a5fd1c568dd3ae7cfc00184a9ee9a");
        } else if (this.c == null) {
        } else {
            this.c.a(fVar);
            com.sankuai.waimai.platform.widget.filterbar.domain.model.c z = this.c.z();
            i();
            t();
            if (this.b != null) {
                this.b.a(z);
            }
            if (this.i != null) {
                this.i.d(z);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.b p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e704446a9af9f9fca439862674a47c2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e704446a9af9f9fca439862674a47c2a");
        }
        if (this.c != null) {
            return this.c.t();
        }
        return null;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.InterfaceC1093a
    public final boolean q() {
        return this.k;
    }

    void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5637390de89284cc360e7d3fcf380ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5637390de89284cc360e7d3fcf380ab");
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a(new e(this.c), (e) null, new c.InterfaceC1084c<e.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(e.b bVar) {
                Long valueOf;
                e.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "139a2355f13f608ee6005ecab9bf7c62", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "139a2355f13f608ee6005ecab9bf7c62");
                } else if (bVar2 != null) {
                    h hVar = bVar2.b;
                    h.a aVar = bVar2.c;
                    if (b.this.c != null) {
                        b.this.c.a(hVar);
                        aVar = b.this.c.e();
                    }
                    if (hVar == null) {
                        b.this.b.a();
                        return;
                    }
                    com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar2 = new com.sankuai.waimai.platform.widget.filterbar.view.model.a();
                    aVar2.a = hVar;
                    if (aVar == null) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(aVar.j ? aVar.i : aVar.a);
                    }
                    aVar2.b = valueOf;
                    aVar2.c = bVar2.d;
                    aVar2.g = b.this.e;
                    aVar2.f = b.this.d;
                    aVar2.h = b.this.h;
                    aVar2.i = b.this.f;
                    aVar2.d = bVar2.e;
                    aVar2.e = bVar2.f;
                    aVar2.j = b.this.c.y();
                    aVar2.k = b.this.c.A().size() + b.this.c.B().size();
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.d D = b.this.c.D();
                    aVar2.l = D.h;
                    aVar2.m = D.i;
                    if (b.this.b != null) {
                        b.this.b.a(aVar2);
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr2 = {error};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b116000785ee81cc3675c9ab1518966", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b116000785ee81cc3675c9ab1518966");
                } else if (b.this.b != null) {
                    error.getMessage();
                }
            }
        });
    }

    void d(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13eb72223c4063c7990b258b25e8dd92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13eb72223c4063c7990b258b25e8dd92");
        } else if (this.c == null || !this.c.F()) {
        } else {
            com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<d, R>) new d(this.c), (d) new d.a(false, j, j2, i), (c.InterfaceC1084c) new c.InterfaceC1084c<d.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final void a(Error error) {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                public final /* synthetic */ void a(d.b bVar) {
                    d.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b2b06908e4723560a21725c6c1ad2c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b2b06908e4723560a21725c6c1ad2c5");
                    } else if (bVar2 == null || b.this.c == null) {
                    } else {
                        b.this.c.b(bVar2.b);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2, int i, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da086ed3fe139d7f58badae49f40d12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da086ed3fe139d7f58badae49f40d12b");
        } else {
            a(j, j2, i, z, false, null);
        }
    }

    void a(long j, long j2, int i, final boolean z, final boolean z2, final b.a<Set<String>> aVar) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ae223f46ad40dfbe06d7820500813d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ae223f46ad40dfbe06d7820500813d");
            return;
        }
        final List<b.a.C1086a> v = this.c.v();
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a, R>) new com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a(this.c, this.j), (com.sankuai.waimai.platform.widget.filterbar.domain.usecase.a) new a.C1092a(j, j2, i), (c.InterfaceC1084c) new c.InterfaceC1084c<a.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.presenter.b.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(a.b bVar) {
                a.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12c9bb711b63ad1afa632416b850fc09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12c9bb711b63ad1afa632416b850fc09");
                    return;
                }
                Set<String> set = null;
                if (bVar2 == null) {
                    if (b.this.b != null) {
                        b.this.b.h(false);
                    }
                } else {
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar3 = bVar2.b;
                    List<b.a.C1086a> list = bVar2.c;
                    Set<String> set2 = bVar2.d;
                    Set<String> set3 = bVar2.e;
                    Set<b.a.C1086a> set4 = bVar2.f;
                    byte b = (z || !((set4 == null || set4.isEmpty()) && ((v != null && !v.isEmpty()) || set2 == null || set2.isEmpty()))) ? (byte) 1 : (byte) 0;
                    b bVar4 = b.this;
                    boolean z3 = z2;
                    Object[] objArr3 = {bVar3, list, set2, Byte.valueOf(b), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar4, changeQuickRedirect3, false, "7110acf6c918024299a72d5e063ebe3c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar4, changeQuickRedirect3, false, "7110acf6c918024299a72d5e063ebe3c");
                    } else {
                        if (bVar4.c != null) {
                            bVar4.c.c(bVar3);
                            bVar4.c.a(list);
                            set = bVar4.c.j();
                        }
                        if (bVar4.b != null) {
                            if (list == null || list.isEmpty()) {
                                bVar4.b.h(false);
                            } else {
                                bVar4.b.h(true);
                                bVar4.b.a(list, set);
                                if (b != 0 && bVar4.i != null) {
                                    bVar4.i.a(bVar4.a(list), bVar4.g);
                                }
                            }
                            if (bVar4.b instanceof com.sankuai.waimai.platform.widget.filterbar.view.controller.a) {
                                ((com.sankuai.waimai.platform.widget.filterbar.view.controller.a) bVar4.b).a(bVar3, set);
                            }
                            if (z3) {
                                bVar4.b.i(z3);
                            }
                        }
                    }
                    set = set3;
                }
                if (aVar != null) {
                    aVar.a((b.a) set);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
                Object[] objArr2 = {error};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0de5e99368baf574c59e8c85846ece37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0de5e99368baf574c59e8c85846ece37");
                    return;
                }
                if (b.this.b != null) {
                    b.this.b.h(false);
                }
                if (aVar != null) {
                    aVar.a((Exception) null);
                }
            }
        });
    }

    void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357f857a9af8a498cd924e3a8028fd7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357f857a9af8a498cd924e3a8028fd7c");
        } else if (this.c != null) {
            this.c.a(bVar);
        }
    }

    void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        Map<String, g> map;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790b7771b26dfd66d03a3c0a4db43a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790b7771b26dfd66d03a3c0a4db43a79");
            return;
        }
        Set<String> set = null;
        if (this.c != null) {
            set = this.c.j();
            map = this.c.m();
        } else {
            map = null;
        }
        if (this.b != null) {
            this.b.b(false);
            if (bVar == null || bVar.b == null || bVar.b.isEmpty()) {
                this.b.c(true);
            } else {
                this.b.a(bVar, set, map);
            }
            if (this.i != null) {
                com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
                cVar.a = s();
                cVar.b = set;
                cVar.c = map;
                cVar.d = this.c.y();
                cVar.e = this.c.D().g;
                this.i.e(cVar);
            }
        }
    }

    private void d(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b88917b89e1778af9c6fb8210c96235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b88917b89e1778af9c6fb8210c96235");
            return;
        }
        this.e = true;
        if (this.b != null) {
            this.b.c();
            this.b.b(true);
            this.b.c(false);
            this.b.d(false);
        }
    }

    List<String> a(List<b.a.C1086a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3697fd493428c1020d460c414f0588", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3697fd493428c1020d460c414f0588");
        }
        ArrayList arrayList = new ArrayList();
        if (this.c != null && list != null) {
            for (b.a.C1086a c1086a : list) {
                if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
                    arrayList.add(c1086a.a);
                }
            }
        }
        return arrayList;
    }
}
