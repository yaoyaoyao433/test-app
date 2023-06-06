package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b, com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b {
    public static ChangeQuickRedirect a;
    public View b;
    public View c;
    public com.sankuai.waimai.store.widgets.filterbar.sortlist.b d;
    public com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a e;
    public j f;
    public GoodsPoiCategory g;

    public a(@NonNull Context context, j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1547edce7c734681ec1cb342804bc24a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1547edce7c734681ec1cb342804bc24a");
        } else {
            this.f = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9131078984c1517479985475cac03ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9131078984c1517479985475cac03ad");
            return;
        }
        super.onViewCreated();
        this.c = findView(R.id.filter_layout);
        this.b = findView(R.id.root_spin_layout);
        this.d = new com.sankuai.waimai.store.widgets.filterbar.sortlist.b(this.mContext, this);
        FrameLayout frameLayout = (FrameLayout) findView(R.id.fl_sort_container);
        frameLayout.addView(this.d.createView(frameLayout));
        this.e = new com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a(this.mContext, this.f.q(), this);
        FrameLayout frameLayout2 = (FrameLayout) findView(R.id.fl_brand_filter_container);
        frameLayout2.addView(this.e.createView(frameLayout2));
    }

    public boolean a(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647811a86f473e15fe69cd6688292d7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647811a86f473e15fe69cd6688292d7f")).booleanValue();
        }
        return com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.sortList) && !(goodsPoiCategory.activityTag != null && goodsPoiCategory.activityTag.contains("hotsale_food")) && this.f.b(goodsPoiCategory);
    }

    public boolean b(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8d430bd3c4f7b7978414a72e4a2d16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8d430bd3c4f7b7978414a72e4a2d16")).booleanValue() : goodsPoiCategory.brandInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.brandInfo.subFilterList);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080f5d9c3a5b12b041824f40384a7d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080f5d9c3a5b12b041824f40384a7d2c");
        } else {
            this.f.a(view, this.g);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3b97d40b2baac22774b44eddec6b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3b97d40b2baac22774b44eddec6b94");
        } else {
            this.f.d(this.g);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4790cdc44ab8c8d76ceda9360353dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4790cdc44ab8c8d76ceda9360353dc3");
        } else {
            this.f.a(z, this.g);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72aa627b1b94519c8d51173b49901e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72aa627b1b94519c8d51173b49901e38");
        } else {
            this.f.a(this.g, view, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(int i, String str, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8cd58c2fe9d058378da9be207d03fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8cd58c2fe9d058378da9be207d03fb7");
            return;
        }
        this.f.a(this.g, this.g.sortType, list);
        this.f.a(this.g, str, i);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5de7f25e18e904be226573482640c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5de7f25e18e904be226573482640c4");
        } else {
            this.f.a(this.g, view, (int) j);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9c439ad0a53efc0119b5cb4c53b7a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9c439ad0a53efc0119b5cb4c53b7a2");
            return;
        }
        this.f.a(this.g, i2, this.g.getBrandIds());
        this.f.a(i, this.g, i2);
    }
}
