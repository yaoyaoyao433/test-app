package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.support.annotation.Nullable;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i);

        void a(GuidedItem guidedItem);

        void a(SearchFilterGroup.SearchFilterItem searchFilterItem);

        String b();

        String c();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.ui.result.item.sortFilter.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1323b {
        void a();

        void e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void a(int i, int i2);

        void a(SearchFilterGroup.SearchFilterItem searchFilterItem);

        void a(com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a aVar);

        @Nullable
        int[] a(SearchFilterGroup searchFilterGroup);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d extends c {
        void c();

        void d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface e extends f {
        void b_(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f {
        void a();

        void a(int i, int i2);

        void a(com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a aVar);

        void e();

        @Nullable
        int[] g();

        void h();

        void i();

        void j();

        String q();
    }
}
