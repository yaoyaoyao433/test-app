package com.sankuai.waimai.platform.widget.filterbar.domain.repository;

import android.support.annotation.Nullable;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.d;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(Exception exc);

        void a(T t);
    }

    Set<String> A();

    Map<String, g> B();

    com.sankuai.waimai.platform.widget.filterbar.domain.model.a C();

    d D();

    @Nullable
    h E();

    boolean F();

    void a(int i, String str);

    void a(long j);

    void a(long j, long j2, int i, int i2, a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar);

    void a(long j, long j2, int i, a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar);

    void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar);

    void a(f fVar);

    void a(h hVar);

    void a(a<Void> aVar);

    void a(CategoryBean categoryBean);

    void a(String str);

    void a(String str, int i, int i2);

    void a(String str, int i, a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar);

    void a(List<b.a.C1086a> list);

    void a(Map<String, g> map);

    void a(Set<String> set);

    void a(boolean z);

    void a(boolean z, long j, long j2, int i, a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar);

    boolean a(int i, String str, int i2);

    Long b();

    void b(int i, String str, int i2);

    void b(long j);

    void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar);

    void b(a<h> aVar);

    void b(String str);

    void b(List<BubbleHistory> list);

    void b(Map<c, h> map);

    Long c();

    List<BubbleHistory> c(long j);

    void c(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar);

    void c(a<CategoryBean> aVar);

    void d();

    h.a e();

    void e(String str);

    void f();

    void g();

    Set<String> h();

    Set<String> i();

    Set<String> j();

    Map<String, g> k();

    Map<String, g> l();

    Map<String, g> m();

    void n();

    void o();

    void p();

    void q();

    h r();

    com.sankuai.waimai.platform.widget.filterbar.domain.model.b s();

    com.sankuai.waimai.platform.widget.filterbar.domain.model.b t();

    com.sankuai.waimai.platform.widget.filterbar.domain.model.b u();

    List<b.a.C1086a> v();

    void w();

    CategoryBean x();

    f y();

    com.sankuai.waimai.platform.widget.filterbar.domain.model.c z();
}
