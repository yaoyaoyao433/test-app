package com.sankuai.waimai.ugc.creator.component;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.MTUgcView;
import com.sankuai.meituan.mtlive.ugc.library.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    private MTUgcView b;

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7776bbcd2d0395466f5d42126f0fbbf4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7776bbcd2d0395466f5d42126f0fbbf4") : layoutInflater.inflate(R.layout.wm_ugc_camera_viewfinder_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7029267dcc86c680083da4dfb67d1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7029267dcc86c680083da4dfb67d1e5");
            return;
        }
        super.a(view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03b251e1425b1658b453d19cf797c718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03b251e1425b1658b453d19cf797c718");
            return;
        }
        this.b = new MTUgcView(A());
        ((FrameLayout) b(R.id.viewfinder_view_container)).addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        c.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090ecee1fa18fa09dfa01b9dda281fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090ecee1fa18fa09dfa01b9dda281fdc");
            return;
        }
        super.a();
        com.sankuai.waimai.ugc.creator.manager.g a2 = com.sankuai.waimai.ugc.creator.manager.g.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af80696126de6c3bb6a0fdedb4d6a1fb", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (c.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af80696126de6c3bb6a0fdedb4d6a1fb");
        } else {
            dVar = new c.d();
            dVar.e = false;
            dVar.a = 2;
            dVar.g = this.o.m;
            dVar.h = this.o.n;
        }
        MTUgcView mTUgcView = this.b;
        Object[] objArr3 = {dVar, mTUgcView};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.manager.g.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "dc90c87b2817e0d13b7ab0cf8b028bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "dc90c87b2817e0d13b7ab0cf8b028bf7");
        } else if (a2.b == null || a2.b.a(dVar, mTUgcView) == 0) {
        } else {
            a2.a(-112);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66540b58ad97ec3380fa10389d5ad560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66540b58ad97ec3380fa10389d5ad560");
            return;
        }
        super.o();
        com.sankuai.waimai.ugc.creator.manager.g a2 = com.sankuai.waimai.ugc.creator.manager.g.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.manager.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0033e93709513a986235461b7f2a05b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0033e93709513a986235461b7f2a05b8");
        } else if (a2.b != null) {
            a2.b.a();
        }
    }
}
