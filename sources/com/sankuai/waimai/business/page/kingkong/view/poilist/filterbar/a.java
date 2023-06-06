package com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar;

import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.graphics.Color;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageActivity;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.c;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final int b = Color.parseColor("#F5F5F6");
    public static final int c = Color.parseColor("#FFFFFF");
    public final FrameLayout d;
    public final com.sankuai.waimai.business.page.common.second.b e;
    public final PageActivity f;
    public final KingkongInfo g;
    public FilterBarViewController h;
    public boolean i;
    public FrameLayout j;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b k;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b l;
    public com.sankuai.waimai.business.page.common.model.b m;
    public com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a n;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC0812a {
        void a();

        void a(boolean z);

        long b();
    }

    public static /* synthetic */ void a(a aVar, InterfaceC0812a interfaceC0812a, boolean z) {
        Object[] objArr = {interfaceC0812a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "9d7add2e451339c260ad675d00a589c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "9d7add2e451339c260ad675d00a589c7");
            return;
        }
        interfaceC0812a.a(z);
        if (aVar.m.i) {
            aVar.h.a();
        }
    }

    static {
        b.a(com.sankuai.waimai.business.page.kingkong.b.SELF_DELIVERY, c.SELF_DELIVERY);
    }

    public a(PageActivity pageActivity, KingkongInfo kingkongInfo, FrameLayout frameLayout, com.sankuai.waimai.business.page.common.second.b bVar) {
        Object[] objArr = {pageActivity, kingkongInfo, frameLayout, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7e1d1f614136b9d78547d32917cb15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7e1d1f614136b9d78547d32917cb15");
            return;
        }
        this.m = new com.sankuai.waimai.business.page.common.model.b(kingkongInfo.d, kingkongInfo.i, kingkongInfo.b, kingkongInfo.k, kingkongInfo.l, kingkongInfo.g, kingkongInfo.o, kingkongInfo.p);
        this.d = frameLayout;
        this.e = bVar;
        this.f = pageActivity;
        this.g = kingkongInfo;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b3e79c045f83bd8770393582e89fc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b3e79c045f83bd8770393582e89fc33");
        } else {
            KingKongViewModel kingKongViewModel = (KingKongViewModel) q.a((FragmentActivity) this.f).a(KingKongViewModel.class);
            com.sankuai.waimai.business.page.common.model.b bVar2 = this.m;
            Object[] objArr3 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect3 = KingKongViewModel.a;
            if (PatchProxy.isSupport(objArr3, kingKongViewModel, changeQuickRedirect3, false, "5c10fa3b790cb19aaf05ec8552475ed9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, kingKongViewModel, changeQuickRedirect3, false, "5c10fa3b790cb19aaf05ec8552475ed9");
            } else {
                kingKongViewModel.k.b((k<com.sankuai.waimai.business.page.common.model.b>) bVar2);
            }
        }
        ((KingKongViewModel) q.a((FragmentActivity) pageActivity).a(KingKongViewModel.class)).a(this.m);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da09fbc39c20bad151e6404dbd2dba5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da09fbc39c20bad151e6404dbd2dba5f");
            return;
        }
        this.i = z;
        if (this.m.i) {
            this.h.a(z);
        }
    }

    public Object a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0480f36005d0873a1e87c7d0770c503", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0480f36005d0873a1e87c7d0770c503");
        }
        return this.f.getClass().getSimpleName() + System.currentTimeMillis();
    }

    public com.sankuai.waimai.business.page.common.model.b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61d9d4873f9d889218f494281fe0cdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.common.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61d9d4873f9d889218f494281fe0cdf");
        }
        com.sankuai.waimai.business.page.common.model.b b2 = this.e != null ? this.e.b(j) : null;
        if (b2 == null) {
            b2 = new com.sankuai.waimai.business.page.common.model.b(this.g.d, this.g.i, this.g.b, null, null, this.g.g, this.g.o, this.g.p);
        }
        ((KingKongViewModel) q.a((FragmentActivity) this.f).a(KingKongViewModel.class)).a(this.m);
        return b2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static Map<com.sankuai.waimai.business.page.kingkong.b, c> b = new HashMap();

        public static /* synthetic */ c a(KingkongInfo kingkongInfo) {
            Object[] objArr = {kingkongInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19589b2fb1c5dfcc8b85e1bffe039366", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19589b2fb1c5dfcc8b85e1bffe039366");
            }
            c cVar = b.get(com.sankuai.waimai.business.page.kingkong.b.a(kingkongInfo));
            return cVar == null ? c.GLOBAL : cVar;
        }

        public static /* synthetic */ void a(com.sankuai.waimai.business.page.kingkong.b bVar, c cVar) {
            Object[] objArr = {bVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c74f68d82a5fc96f90b4483f6534ffd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c74f68d82a5fc96f90b4483f6534ffd1");
            } else {
                b.put(bVar, cVar);
            }
        }
    }

    public final void a(int i) {
        View findViewById;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d3d76629528a9a749780d14805cdde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d3d76629528a9a749780d14805cdde");
        } else if (this.d == null || (findViewById = this.d.findViewById(R.id.filter_bar_tab)) == null) {
        } else {
            findViewById.setBackgroundColor(i);
        }
    }

    public void b(int i) {
        View findViewById;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946d42c7fe86e15f8e6f0ca205d77cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946d42c7fe86e15f8e6f0ca205d77cb8");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.j.findViewById(R.id.fast_filter_bar);
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (viewGroup.getChildAt(i2) != null && (findViewById = viewGroup.getChildAt(i2).findViewById(R.id.txt_bg_activity_cond)) != null) {
                findViewById.setBackgroundResource(i);
            }
        }
    }
}
