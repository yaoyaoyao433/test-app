package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.SGFilterTypeItemsBlock;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.newwidgets.list.g<g, e> {
    public static ChangeQuickRedirect a;
    private int b;
    private SGFilterTypeItemsBlock c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(g gVar, int i) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8313befeb9ac383fda962d9342084e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8313befeb9ac383fda962d9342084e65");
            return;
        }
        this.c.a(gVar2.d, gVar2.c, gVar2.e, gVar2.f);
        this.c.f = new com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.b
            public final void a(boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9bb33fcef47adee1c93f79aba26636d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9bb33fcef47adee1c93f79aba26636d");
                } else if (f.this.o != null) {
                    ((e) f.this.o).a(z, str, z2, str2, bubbleInfoBean);
                }
            }
        };
    }

    public f() {
        this(4);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84fcdcba4c164bdea40607d27ef04d05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84fcdcba4c164bdea40607d27ef04d05");
        }
    }

    public f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a741424bf03b49292146bb34fb7f9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a741424bf03b49292146bb34fb7f9d");
            return;
        }
        this.b = 4;
        this.b = i;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941a1f42a7d4579a7e3e94135a6d3243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941a1f42a7d4579a7e3e94135a6d3243");
            return;
        }
        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
        this.c.getView().setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cbb1e229ca35449b08a82ba48db657", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cbb1e229ca35449b08a82ba48db657");
        }
        this.c = new SGFilterTypeItemsBlock(viewGroup.getContext(), this.b, (e) this.o);
        this.c.h = true;
        this.c.g = viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
        return this.c.createView(viewGroup);
    }
}
