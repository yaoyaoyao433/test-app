package com.sankuai.waimai.platform.widget.filterbar.presenter;

import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.filterbar.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1093a extends com.sankuai.waimai.platform.widget.filterbar.clean.a {
        void a(int i);

        void a(long j);

        void a(long j, long j2, int i);

        void a(b.a.C1086a c1086a, boolean z, long j, long j2, int i, boolean z2, boolean z3);

        void a(f fVar);

        void a(b bVar);

        void a(Object obj);

        void a(String str);

        void a(String str, int i, int i2);

        void a(String str, boolean z);

        void a(boolean z);

        void b();

        void b(long j);

        void b(long j, long j2, int i);

        void b(boolean z);

        void c();

        void c(long j);

        void c(long j, long j2, int i);

        void c(boolean z);

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();

        void l();

        Set<String> m();

        Map<String, g> n();

        List<String> o();

        com.sankuai.waimai.platform.widget.filterbar.domain.model.b p();

        boolean q();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(b.a.C1086a c1086a, boolean z, boolean z2, boolean z3, boolean z4);

        void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void a(List<String> list, boolean z);

        void b();

        void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void c();

        void c(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void d();

        void d(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void e(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void f(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void g(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void h(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void i(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c extends com.sankuai.waimai.platform.widget.filterbar.clean.b<InterfaceC1093a> {
        void a();

        void a(int i);

        void a(long j, long j2, int i);

        void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, g> map);

        void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);

        void a(com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar);

        void a(String str);

        void a(ArrayList<CategoryBean.Category> arrayList, f fVar);

        void a(List<h.a> list, Long l);

        void a(List<b.a.C1086a> list, Set<String> set);

        void a(boolean z);

        void b();

        void b(int i);

        void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, g> map);

        void b(Object obj);

        void b(boolean z);

        void c();

        void c(int i);

        void c(boolean z);

        void d();

        void d(boolean z);

        void e();

        void e(boolean z);

        void f();

        void f(boolean z);

        void g();

        void g(boolean z);

        void h();

        void h(boolean z);

        void i(boolean z);

        void j(boolean z);

        int l();
    }
}
