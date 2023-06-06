package com.sankuai.waimai.store.goodslist.viewblocks;

import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    d b;
    public SCRecyclerView c;
    private com.sankuai.waimai.store.goods.list.viewblocks.category.a d;
    private List<RestMenuResponse.NavigateItem> e;

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c79d3176f19825b183dc878a9adee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c79d3176f19825b183dc878a9adee8");
        } else {
            this.b = dVar;
        }
    }

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e3fc388e8dde2c7c1b76c1e02e157e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e3fc388e8dde2c7c1b76c1e02e157e");
        } else {
            this.b = eVar;
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4044e600f8cb1c740f64ec2eee88c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4044e600f8cb1c740f64ec2eee88c80");
            return;
        }
        this.c = (SCRecyclerView) view.findViewById(R.id.category_recycler_view);
        this.c.setLayoutManager(new LinearLayoutManager(this.b.k(), 0, false));
        this.c.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goodslist.viewblocks.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bc392d9eb494878749777e9d439c31e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bc392d9eb494878749777e9d439c31e");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    b.c(a.this.b.b(), "b_hvwhmzv8").a("poi_id", a.this.b.d().d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77a8314d680ca4e16b1b245c13637c8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77a8314d680ca4e16b1b245c13637c8f");
                } else {
                    super.onScrolled(recyclerView, i, i2);
                }
            }
        });
        this.c.setNestedScrollingEnabled(false);
        this.c.setDispatchTouchEventListener(new SCRecyclerView.b() { // from class: com.sankuai.waimai.store.goodslist.viewblocks.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.list.SCRecyclerView.b
            public final boolean a(View view2, MotionEvent motionEvent) {
                Object[] objArr2 = {view2, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7b1118a31f08a383889a8fb9c5860b0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7b1118a31f08a383889a8fb9c5860b0")).booleanValue();
                }
                ViewParent parent = view2.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
        this.d = new com.sankuai.waimai.store.goods.list.viewblocks.category.a(this.b);
        this.c.setAdapter(new l(this.d));
    }

    public final void a(int i, List<RestMenuResponse.NavigateItem> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0018e1086479d8ff1bcfc08b2f55c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0018e1086479d8ff1bcfc08b2f55c4");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.e = list;
            this.d.a(i, this.e);
            this.c.setVisibility(0);
            this.c.scrollToPosition(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eff84336e2ba22a8a890425a02808a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eff84336e2ba22a8a890425a02808a6");
        } else if (this.d.e()) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(i);
        }
    }
}
