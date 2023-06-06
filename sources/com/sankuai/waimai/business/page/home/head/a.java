package com.sankuai.waimai.business.page.home.head;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private View w;
    private int x;
    private HomeActionBarViewModel y;

    public a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7161fb3222d9aaf4fc109e460aa40ac6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7161fb3222d9aaf4fc109e460aa40ac6");
        } else if (Q()) {
            this.y = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
        }
    }

    public a(PageFragment pageFragment, int i) {
        super(pageFragment);
        Object[] objArr = {pageFragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ecad6085c4c7c376437c70726bfb18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ecad6085c4c7c376437c70726bfb18");
        } else {
            this.x = i;
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f354a48de15957489c2f965cc7869291", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f354a48de15957489c2f965cc7869291");
        }
        this.w = LayoutInflater.from(this.t).inflate(R.layout.wm_page_main_head_empty_view, viewGroup, false);
        P();
        if (this.y != null && Q()) {
            this.y.j.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Object[] objArr2 = {bool};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0b294e3cdff3ff39e614e88c086f1f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0b294e3cdff3ff39e614e88c086f1f5");
                    } else {
                        a.this.P();
                    }
                }
            });
        }
        return this.w;
    }

    public final void P() {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b065a75518d98bdad5c61657f7b0d3a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b065a75518d98bdad5c61657f7b0d3a9");
            return;
        }
        int e = com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this.s.getActivity()) ? g.e(com.meituan.android.singleton.b.a) : 0;
        if (this.w == null || this.w.getLayoutParams() == null || (layoutParams = this.w.getLayoutParams()) == null) {
            return;
        }
        if (this.x > 0) {
            layoutParams.height = this.x;
        } else {
            layoutParams.height = ((HomeActionBarViewModel) q.a(this.s).a(HomeActionBarViewModel.class)).d() + e;
        }
        this.w.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public final View i() {
        return this.w;
    }

    private boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a3c0efba21dc825bf4b1248ff7311a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a3c0efba21dc825bf4b1248ff7311a")).booleanValue() : this.s != null && this.s.isAdded();
    }
}
