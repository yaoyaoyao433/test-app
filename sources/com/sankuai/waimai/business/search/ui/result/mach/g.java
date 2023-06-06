package com.sankuai.waimai.business.search.ui.result.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        View view;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12c222d5d41cc67b8af4678068486a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12c222d5d41cc67b8af4678068486a6");
        }
        h hVar = new h(this.b);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "18a1cd11defd252e2f181dc95f1ca685", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "18a1cd11defd252e2f181dc95f1ca685");
        } else {
            View inflate = LayoutInflater.from(hVar.b).inflate(R.layout.wm_nox_search_layout_common_mach_block, viewGroup, false);
            hVar.c = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
            hVar.d = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
            hVar.e = inflate;
            Log.e("CommonMachViewBlock", "createView");
            view = hVar.e;
        }
        return new a(view, hVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        com.sankuai.waimai.mach.recycler.b bVar;
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b7a06546bedf6e132bff13c8be1422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b7a06546bedf6e132bff13c8be1422");
            return;
        }
        final h hVar = aVar.b;
        CommonMachData commonMachData = (CommonMachData) serializable;
        View view = aVar.itemView;
        Object[] objArr2 = {Integer.valueOf(i), commonMachData, view};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "f96a1394a9ae4d917a8fdadaca2d1433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "f96a1394a9ae4d917a8fdadaca2d1433");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(hVar.b, 12.0f);
        if (commonMachData.mNeedAdjustPadding == 1) {
            Object[] objArr3 = {commonMachData, view};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "c27c6793e4a6c0e4534974542aeafc91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "c27c6793e4a6c0e4534974542aeafc91");
            } else if (view != null && (view.getLayoutParams() instanceof StaggeredGridLayoutManager.b)) {
                final StaggeredGridLayoutManager.b bVar2 = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                view.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.h.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1e895a20fa9193a3ad9434f84fba78de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1e895a20fa9193a3ad9434f84fba78de");
                            return;
                        }
                        int a3 = com.sankuai.waimai.foundation.utils.g.a(hVar.b, 4.0f);
                        int i3 = a3 * 2;
                        int b = bVar2.b();
                        if (b == 0) {
                            i2 = a3;
                            a3 *= 3;
                        } else if (b == 1) {
                            i2 = a3 * 3;
                        } else {
                            a3 = 0;
                            i2 = 0;
                        }
                        hVar.d.setPadding(a3, 0, i2, i3);
                    }
                }, 0L);
            }
        } else if (commonMachData.mNeedAdjustPadding == -1) {
            Object[] objArr4 = {commonMachData, view};
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "3806a478f078e1117af06cbbf9c1036f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "3806a478f078e1117af06cbbf9c1036f");
            } else if (view != null && (view.getLayoutParams() instanceof StaggeredGridLayoutManager.b)) {
                final StaggeredGridLayoutManager.b bVar3 = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                view.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.h.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "768685f4bcedd15170245f1b568a9a7e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "768685f4bcedd15170245f1b568a9a7e");
                            return;
                        }
                        int a3 = com.sankuai.waimai.foundation.utils.g.a(hVar.b, 3.0f);
                        int a4 = com.sankuai.waimai.foundation.utils.g.a(hVar.b, 10.0f);
                        int i2 = a3 * 2;
                        int b = bVar3.b();
                        new StringBuilder().append(b);
                        if (b == 0) {
                            a4 = a3;
                            a3 = a4;
                        } else if (b != 1) {
                            a3 = 0;
                            a4 = 0;
                        }
                        hVar.d.setPadding(a3, 0, a4, i2);
                    }
                }, 0L);
            }
        } else if (commonMachData.mNeedAdjustPadding == 2) {
            hVar.d.setPadding(a2, 0, a2, a2 / 2);
        } else if (commonMachData.mNeedAdjustPadding == 5) {
            hVar.d.setPadding(0, 0, 0, a2 / 2);
        } else if (commonMachData.mNeedAdjustPadding == 3) {
            hVar.d.setPadding(a2, 0, a2, a2 / 2);
        } else if (commonMachData.mNeedAdjustPadding == 6) {
            hVar.d.setPadding(0, 0, 0, a2 / 2);
        } else if (commonMachData.mNeedAdjustPadding == 4) {
            hVar.d.setPadding(a2, 0, a2, a2);
        } else if (commonMachData.mNeedAdjustPadding == 7) {
            hVar.d.setPadding(0, 0, 0, a2 / 2);
        } else {
            hVar.d.setPadding(0, 0, 0, 0);
        }
        com.sankuai.waimai.mach.recycler.c cVar = commonMachData.mItem;
        if (cVar != null) {
            if (commonMachData.machProvider != null) {
                bVar = commonMachData.machProvider.machLogicList();
            } else {
                bVar = SearchShareData.s;
            }
            final com.sankuai.waimai.mach.node.a b = cVar.b();
            bVar.a(cVar);
            bVar.a(hVar.c, cVar, bVar.a(cVar.a()));
            ViewGroup.LayoutParams layoutParams = hVar.c.getLayoutParams();
            layoutParams.height = commonMachData.state == CommonMachData.a.SHOWING ? -2 : 0;
            layoutParams.width = cVar.d();
            hVar.f = cVar;
            hVar.g = bVar;
            hVar.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9b04d41059e4015c79dc6cdaec3da3d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9b04d41059e4015c79dc6cdaec3da3d3");
                    } else if (b != null) {
                        b.f.onExpose(b);
                    }
                }
            }, 500L);
            return;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = h.a;
        if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "f6c16215ed71ff10f81864a5770beacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "f6c16215ed71ff10f81864a5770beacf");
        } else if (hVar.c != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hVar.c.getLayoutParams();
            marginLayoutParams.height = 0;
            hVar.c.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.b
    public final /* synthetic */ boolean a(Serializable serializable) {
        Serializable serializable2 = serializable;
        Object[] objArr = {serializable2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50871519465dec13bf0c805018aaf88c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50871519465dec13bf0c805018aaf88c")).booleanValue();
        }
        CommonMachData commonMachData = (CommonMachData) serializable2;
        return (commonMachData.mNeedAdjustPadding == 1 || commonMachData.mNeedAdjustPadding == -1) ? false : true;
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        Serializable serializable = (Serializable) obj;
        return (serializable instanceof CommonMachData) && ((CommonMachData) serializable).mItem != null;
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05c07f07a5e6fd594a4e6ee18d820d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05c07f07a5e6fd594a4e6ee18d820d4");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public h b;

        public a(View view, h hVar) {
            super(view);
            Object[] objArr = {view, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376e321a7b03b1989751ee60d143ca5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376e321a7b03b1989751ee60d143ca5f");
            } else {
                this.b = hVar;
            }
        }
    }
}
