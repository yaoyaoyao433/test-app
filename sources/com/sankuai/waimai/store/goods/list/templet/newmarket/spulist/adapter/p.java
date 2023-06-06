package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class p extends com.sankuai.waimai.store.newwidgets.list.g<k, j> implements com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b, com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.store.widgets.filterbar.sortlist.b a;
    protected l c;
    protected m d;
    protected View e;
    private com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a f;
    private View g;
    private GoodsPoiCategory h;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public int a() {
        return R.layout.wm_sc_shop_content_goods_sort_item_layout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(k kVar, int i) {
        boolean z;
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee64771ecf51b4512fdf21930b50d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee64771ecf51b4512fdf21930b50d91");
        } else if (kVar == null || kVar.b == null) {
        } else {
            this.g.setVisibility(8);
            this.h = kVar.b;
            if (d(this.h)) {
                this.e.setVisibility(0);
                this.a.a(this.h.sortType, this.h.sortList);
            } else {
                this.a.a(this.h.sortType, (List<SGSortModel>) null);
            }
            if (c(this.h)) {
                this.e.setVisibility(0);
                this.f.a(this.h.getBrandIds(), this.h.brandInfo);
                this.f.a(kVar.e);
                if (!((j) this.o).h()) {
                    this.f.b();
                } else if (kVar.e) {
                    this.f.a();
                }
            } else {
                this.f.a((List<Long>) null, (SGSortModel) null);
                if (!((j) this.o).h()) {
                    this.f.b();
                }
            }
            if (d(this.h) || c(this.h)) {
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            GoodsPoiCategory goodsPoiCategory = this.h;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5c6d24066b5008c3dc47075b98757ff", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5c6d24066b5008c3dc47075b98757ff")).booleanValue();
            } else {
                z = (goodsPoiCategory.receiveCouponTip == null || com.sankuai.shangou.stone.util.t.a(goodsPoiCategory.receiveCouponTip.activityDesc)) ? false : true;
            }
            if (z) {
                this.e.setVisibility(0);
                this.c.hide();
                this.d.show();
                this.d.a(kVar, i, 0);
            } else if (a(this.h)) {
                this.e.setVisibility(0);
                this.d.hide();
                this.c.show();
                this.c.a(kVar, i, 0);
            } else if (b(kVar.c)) {
                this.e.setVisibility(0);
                this.d.hide();
                this.c.show();
                this.c.a(kVar, i, 1);
            } else {
                this.c.hide();
                this.d.hide();
            }
        }
    }

    public final boolean a(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05e223a73fc177840aac5a1d2cbf6ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05e223a73fc177840aac5a1d2cbf6ac")).booleanValue() : (goodsPoiCategory.activityInfo == null || com.sankuai.shangou.stone.util.t.a(goodsPoiCategory.activityInfo.activityText)) ? false : true;
    }

    public final boolean b(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764bc1b520956c63cb06b49b78093c93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764bc1b520956c63cb06b49b78093c93")).booleanValue() : (goodsPoiCategory.mDescriptionBar == null || com.sankuai.shangou.stone.util.t.a(goodsPoiCategory.mDescriptionBar.content)) ? false : true;
    }

    private boolean c(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9abad9127cec3480bef21f6a1ea61c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9abad9127cec3480bef21f6a1ea61c5")).booleanValue() : goodsPoiCategory.brandInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.brandInfo.subFilterList);
    }

    private boolean d(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2664b9ac909d70a07248e644e68846dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2664b9ac909d70a07248e644e68846dc")).booleanValue();
        }
        return com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.sortList) && !(goodsPoiCategory.activityTag != null && goodsPoiCategory.activityTag.contains("hotsale_food")) && ((j) this.o).b(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c0807d0bc157525d4a744edaf7f939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c0807d0bc157525d4a744edaf7f939");
            return;
        }
        this.g = view.findViewById(R.id.filter_layout);
        this.e = view.findViewById(R.id.root_spin_layout);
        this.a = new com.sankuai.waimai.store.widgets.filterbar.sortlist.b(view.getContext(), this);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_sort_container);
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).leftMargin = -com.sankuai.shangou.stone.util.h.a(view.getContext(), 2.0f);
        }
        frameLayout.addView(this.a.createView(frameLayout));
        this.f = new com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a(view.getContext(), ((j) this.o).q(), this);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.fl_brand_filter_container);
        frameLayout2.addView(this.f.createView(frameLayout2));
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.fl_slogan_container);
        this.c = new l(view.getContext());
        frameLayout3.addView(this.c.createView(frameLayout3));
        this.d = new m(view.getContext(), (j) this.o);
        frameLayout3.addView(this.d.createView(frameLayout3));
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b779d0e6e2ca9b4cbdf9cdf761eac44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b779d0e6e2ca9b4cbdf9cdf761eac44f");
        } else {
            ((j) this.o).a(this.h, view, (int) j);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df41cc3cd052ea2abb907975434a08c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df41cc3cd052ea2abb907975434a08c");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = this.h;
        ((j) this.o).a(goodsPoiCategory, i2, goodsPoiCategory.getBrandIds());
        ((j) this.o).a(i, this.h, i2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5037284a74d85800da1a176c84803728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5037284a74d85800da1a176c84803728");
        } else {
            ((j) this.o).a(view, this.h);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325a76e791c00f19ebbe5daa50f67305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325a76e791c00f19ebbe5daa50f67305");
        } else {
            ((j) this.o).d(this.h);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd8c12ac5f4e442bfc92bdce0ef398a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd8c12ac5f4e442bfc92bdce0ef398a");
        } else {
            ((j) this.o).a(z, this.h);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd2398048d7ca3f7258def3809adbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd2398048d7ca3f7258def3809adbd2");
        } else {
            ((j) this.o).a(this.h, view, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(int i, String str, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), str, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f27a9f4cb59a17b9ca3d7ed0f01b4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f27a9f4cb59a17b9ca3d7ed0f01b4ff");
            return;
        }
        ((j) this.o).a(this.h, this.h.sortType, list);
        ((j) this.o).a(this.h, str, i);
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c3747c82ef6e538acb325814f1b21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c3747c82ef6e538acb325814f1b21e");
        } else if (this.d != null) {
            this.d.onDestroy();
        }
    }
}
