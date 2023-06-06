package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.SGFilterTypeItemsBlock;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterMiddleBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.filterbar.home.scene.a {
    public static ChangeQuickRedirect e;
    SGFilterTypeItemsBlock f;
    CouponFilterMachViewBlock g;
    private com.sankuai.waimai.store.widgets.filterbar.sortlist.b h;
    private ViewGroup i;
    private ViewGroup j;
    private ViewGroup k;
    private com.sankuai.waimai.store.param.a l;
    private final int m;
    private final int n;

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
    }

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.b bVar, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.scene.b bVar2, com.sankuai.waimai.store.param.a aVar) {
        super(context, bVar, bVar2);
        Object[] objArr = {context, bVar, bVar2, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39396199e3800e7cdbc9bad43ca09855", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39396199e3800e7cdbc9bad43ca09855");
            return;
        }
        this.m = 0;
        this.n = 1;
        this.l = aVar;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ec1b6d4e437328355a9dc173529467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ec1b6d4e437328355a9dc173529467");
            return;
        }
        this.i = viewGroup;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.gravity = 3;
        viewGroup.setLayoutParams(layoutParams);
        this.h = new com.sankuai.waimai.store.widgets.filterbar.sortlist.b(this.b, new com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
            public final void a(View view, long j) {
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b26bb62f589a399dfdd6e89b10e41170", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b26bb62f589a399dfdd6e89b10e41170");
                    return;
                }
                a.this.c.a(i2, true);
                a.this.d.a(0);
            }
        });
        this.h.e = 3;
        this.h.b = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12);
        com.sankuai.waimai.store.widgets.filterbar.sortlist.b bVar = this.h;
        int b = com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_575859);
        int b2 = com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_292724);
        bVar.c = b;
        bVar.d = b2;
        View createView = this.h.createView(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(createView);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85cb25e6c72f721029576f91070995b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85cb25e6c72f721029576f91070995b1");
            return;
        }
        this.j = viewGroup;
        this.f = new SGFilterTypeItemsBlock(this.b, this.l);
        this.f.g = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_3);
        this.f.f = new com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.b
            public final void a(boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "969ada9a35f74b1451e11a3a0899828d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "969ada9a35f74b1451e11a3a0899828d");
                } else {
                    a.this.c.a(a.this.f.getView(), z, str, z2, str2, bubbleInfoBean);
                }
            }
        };
        View createView = this.f.createView(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(createView);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc52ae3ead6a0c804bf767d337ceb66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc52ae3ead6a0c804bf767d337ceb66");
            return;
        }
        this.k = viewGroup;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.topMargin = h.a(this.b, -4.0f);
        viewGroup.setLayoutParams(layoutParams);
        this.g = new CouponFilterMachViewBlock((SCBaseActivity) this.b, viewGroup, this.l);
        CouponFilterMachViewBlock couponFilterMachViewBlock = this.g;
        CouponFilterMachViewBlock.b bVar = new CouponFilterMachViewBlock.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.b
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20be61c0334b997a15da4959047adaf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20be61c0334b997a15da4959047adaf5");
                } else if (map == null || map.get("custom_ext_category") == null) {
                } else {
                    String valueOf = String.valueOf(map.get("custom_ext_category"));
                    new StringBuilder("---- customExtCategory : ").append(valueOf);
                    a.this.c.a(a.this.g.getView(), valueOf);
                }
            }
        };
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = CouponFilterMachViewBlock.a;
        if (PatchProxy.isSupport(objArr2, couponFilterMachViewBlock, changeQuickRedirect2, false, "c38b0c36b80dd308b280f2fc7d767fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, couponFilterMachViewBlock, changeQuickRedirect2, false, "c38b0c36b80dd308b280f2fc7d767fe5");
        } else {
            couponFilterMachViewBlock.j = bVar;
            couponFilterMachViewBlock.i.a("selectActivityFilter", new com.sankuai.waimai.store.poi.list.newp.methods.h(couponFilterMachViewBlock.j));
        }
        this.g.bindView(this.k);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(QuickSortFilterMiddleBean quickSortFilterMiddleBean) {
        Object[] objArr = {quickSortFilterMiddleBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44525525c1e41e8f801cf889500d9acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44525525c1e41e8f801cf889500d9acf");
        } else {
            this.h.a(quickSortFilterMiddleBean.selectType, quickSortFilterMiddleBean.modelList);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(QuickSortFilterBottomBean quickSortFilterBottomBean) {
        Object[] objArr = {quickSortFilterBottomBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3a050db63c76849d04a5169d9b4b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3a050db63c76849d04a5169d9b4b1c");
        } else if (com.sankuai.shangou.stone.util.a.b(quickSortFilterBottomBean.filterList)) {
            this.f.hide();
            c(0);
        } else {
            c(1);
            SGFilterTypeItemsBlock sGFilterTypeItemsBlock = this.f;
            int min = Math.min(com.sankuai.shangou.stone.util.a.a((List) quickSortFilterBottomBean.filterList), 4);
            Object[] objArr2 = {Integer.valueOf(min)};
            ChangeQuickRedirect changeQuickRedirect2 = SGFilterTypeItemsBlock.a;
            if (PatchProxy.isSupport(objArr2, sGFilterTypeItemsBlock, changeQuickRedirect2, false, "ae372cec0bd09c3ab356757258b3d0a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sGFilterTypeItemsBlock, changeQuickRedirect2, false, "ae372cec0bd09c3ab356757258b3d0a2");
            } else {
                sGFilterTypeItemsBlock.e = min;
                sGFilterTypeItemsBlock.d.a(sGFilterTypeItemsBlock.e);
            }
            this.f.a(quickSortFilterBottomBean.canMultiSelect, quickSortFilterBottomBean.group, quickSortFilterBottomBean.selectCodeList, quickSortFilterBottomBean.filterList);
            this.f.show();
            this.c.a(this.f.getView());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(BaseModuleDesc baseModuleDesc) {
        boolean z = true;
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c846dccb73c1b52f94eda45581a0133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c846dccb73c1b52f94eda45581a0133");
            return;
        }
        super.a(baseModuleDesc);
        Object obj = null;
        if (baseModuleDesc != null) {
            try {
                if (baseModuleDesc.jsonData != null) {
                    obj = baseModuleDesc.jsonData.get("activity_list");
                }
            } catch (Exception e2) {
                com.sankuai.waimai.store.base.log.a.a(e2);
                this.k.setVisibility(8);
                return;
            }
        }
        if (obj == null || ((ArrayList) obj).size() < 2) {
            z = false;
        }
        if (z) {
            this.k.setVisibility(0);
            this.g.b((CouponFilterMachViewBlock) baseModuleDesc);
            return;
        }
        this.k.setVisibility(8);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072f9c30c7988937d2cfad519882c204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072f9c30c7988937d2cfad519882c204");
            return;
        }
        switch (i) {
            case 0:
                this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, h.a(this.b, 4.0f)));
                return;
            case 1:
                this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef02aaab38dcbc49620d3351dfff9d3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef02aaab38dcbc49620d3351dfff9d3") : this.f.getView();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683371525c93ac6c148c680cab1cbe27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683371525c93ac6c148c680cab1cbe27");
            return;
        }
        SGFilterTypeItemsBlock sGFilterTypeItemsBlock = this.f;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = SGFilterTypeItemsBlock.a;
        if (PatchProxy.isSupport(objArr2, sGFilterTypeItemsBlock, changeQuickRedirect2, false, "b017e7418bb7e43ace437db352688acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGFilterTypeItemsBlock, changeQuickRedirect2, false, "b017e7418bb7e43ace437db352688acc");
        } else if (aVar != null) {
            sGFilterTypeItemsBlock.b = aVar;
            if (sGFilterTypeItemsBlock.c != null) {
                sGFilterTypeItemsBlock.c.notifyDataSetChanged();
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d83e0550c52017dd3c5e499b076abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d83e0550c52017dd3c5e499b076abb");
            return;
        }
        if (this.i != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.gravity = 3;
            this.i.setLayoutParams(layoutParams);
            this.i.removeAllViews();
            this.i.addView(this.h.getView());
        }
        if (this.j != null) {
            this.j.removeAllViews();
            this.j.addView(this.f.getView());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387b0c386510a49fbdb0afbeef3a6b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387b0c386510a49fbdb0afbeef3a6b4d");
            return;
        }
        if (this.f != null) {
            this.f.onDestroy();
        }
        if (this.g != null) {
            this.g.onDestroy();
        }
    }
}
