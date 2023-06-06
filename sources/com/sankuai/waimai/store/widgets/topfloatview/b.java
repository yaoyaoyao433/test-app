package com.sankuai.waimai.store.widgets.topfloatview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.widgets.topfloatview.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public View b;
    public RecyclerView c;
    public RecyclerView d;
    public c e;
    public c f;
    public List<PrimaryFilterCondList> g;
    public List<CategoryInfo> h;
    public d i;
    public d j;
    private SCBaseActivity k;
    private Context l;
    private com.sankuai.waimai.store.param.a m;
    private View n;
    private LinearLayoutManager o;
    private LinearLayoutManager p;
    private RecyclerView q;

    public b(SCBaseActivity sCBaseActivity, Context context, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {sCBaseActivity, context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba1f89893e7096edb2875130abcfca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba1f89893e7096edb2875130abcfca5");
            return;
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.k = sCBaseActivity;
        this.l = context;
        this.m = aVar;
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f93e87cc6055082f1854b15aa3c551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f93e87cc6055082f1854b15aa3c551");
            return;
        }
        this.n = view;
        b();
        c();
        d();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5fc2e5ef565f940b5676274622327e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5fc2e5ef565f940b5676274622327e");
            return;
        }
        this.q = (RecyclerView) this.n.findViewById(R.id.top_float_empty_view);
        if (this.q != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.l);
            linearLayoutManager.setOrientation(0);
            this.q.setLayoutManager(linearLayoutManager);
            this.q.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.widgets.topfloatview.b.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ea311b0ed8b9dad13c07faead31e48c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ea311b0ed8b9dad13c07faead31e48c");
                    } else {
                        super.onScrollStateChanged(recyclerView, i);
                    }
                }
            });
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92e5035d2b0ea4163b0d118918107eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92e5035d2b0ea4163b0d118918107eb");
            return;
        }
        this.b = this.n.findViewById(R.id.fl_sg_top_float_block);
        if (this.b != null) {
            ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).setMargins(0, u.a() + h.a(this.l, 43.0f), 0, 0);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ced9eaaf72f6d22e774390144711c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ced9eaaf72f6d22e774390144711c0");
            return;
        }
        this.c = (RecyclerView) this.n.findViewById(R.id.top_float_kingkong_navigation_view);
        if (this.c != null) {
            this.o = new LinearLayoutManager(this.l);
            this.o.setOrientation(0);
            this.e = new c(this.l, 1, this.g, null, this.o, this.m);
            this.c.setLayoutManager(this.o);
            this.c.setAdapter(this.e);
            this.e.c = new c.InterfaceC1346c() { // from class: com.sankuai.waimai.store.widgets.topfloatview.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.topfloatview.c.InterfaceC1346c
                public final void a(View view, int i, long j) {
                    Object[] objArr2 = {view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b3f1ed2fdbd73edec604869b5bff967", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b3f1ed2fdbd73edec604869b5bff967");
                        return;
                    }
                    u.c(b.this.d);
                    b.this.i.a(view, i, j, null);
                }
            };
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b04172028a64b7e5a26c22e908158cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b04172028a64b7e5a26c22e908158cd");
            return;
        }
        this.d = (RecyclerView) this.n.findViewById(R.id.top_float_category_navigation_view);
        if (this.d != null) {
            this.p = new LinearLayoutManager(this.l);
            this.p.setOrientation(0);
            this.f = new c(this.l, 2, null, this.h, this.p, this.m);
            this.d.setLayoutManager(this.p);
            this.d.addItemDecoration(new e(h.a(this.l, 12.0f)));
            this.d.setAdapter(this.f);
            this.f.c = new c.InterfaceC1346c() { // from class: com.sankuai.waimai.store.widgets.topfloatview.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.topfloatview.c.InterfaceC1346c
                public final void a(View view, int i, long j) {
                    Object[] objArr2 = {view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f20c5be09bb3c41780dfd39ed4647c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f20c5be09bb3c41780dfd39ed4647c7");
                    } else {
                        b.this.j.a(view, i, j, null);
                    }
                }
            };
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb635f13ee9bcf73cae1bbd6356e4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb635f13ee9bcf73cae1bbd6356e4c2");
        } else if (this.b != null) {
            this.b.setVisibility(i);
        }
    }

    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6660676e53072e0c248b515b41c5ff66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6660676e53072e0c248b515b41c5ff66");
            return;
        }
        switch (i) {
            case 1:
                this.e.a(i, j);
                return;
            case 2:
                this.f.a(i, j);
                return;
            default:
                return;
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ce2d850472e58804d07cd987696dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ce2d850472e58804d07cd987696dcd");
        } else if (this.q != null) {
            this.q.setVisibility(i);
        }
    }
}
