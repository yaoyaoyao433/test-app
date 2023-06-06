package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final j b;
    View c;
    View d;
    private TextView e;

    public i(@NonNull Context context, @NonNull j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069cfa96a2a862be235eb728eb6c218f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069cfa96a2a862be235eb728eb6c218f");
        } else {
            this.b = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf581516cc6eac458d7e8b37fd4a4bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf581516cc6eac458d7e8b37fd4a4bd");
            return;
        }
        this.c = this.mView.findViewById(R.id.title_layout);
        this.e = (TextView) this.mView.findViewById(R.id.txt_category_name);
        this.d = this.mView.findViewById(R.id.base_line);
    }

    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        int measuredHeight;
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6b1ce4696e188142d917c348adf85e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6b1ce4696e188142d917c348adf85e")).intValue();
        }
        if (this.b.a(goodsPoiCategory) && b(goodsPoiCategory, goodsPoiCategory2)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b04758037e69cdcadf0aa57084e59c99", RobustBitConfig.DEFAULT_VALUE)) {
                measuredHeight = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b04758037e69cdcadf0aa57084e59c99")).intValue();
            } else {
                measuredHeight = this.c.getMeasuredHeight();
                if (measuredHeight <= 0) {
                    measuredHeight = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_40);
                }
            }
            return -measuredHeight;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf345728ebed84693a86ca052bb113b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf345728ebed84693a86ca052bb113b6");
        } else {
            this.c.setVisibility(8);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b6cf0bd19937044b36266657e52a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b6cf0bd19937044b36266657e52a7c");
            return;
        }
        b(goodsPoiCategory);
        this.d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6624417ab0268e3a27eb0cffb1b6636e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6624417ab0268e3a27eb0cffb1b6636e");
            return;
        }
        if (goodsPoiCategory != null) {
            this.c.setVisibility(0);
            this.e.setText(goodsPoiCategory.name);
            this.d.setVisibility(this.b.a(goodsPoiCategory) ? 0 : 8);
            return;
        }
        this.c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ebcbb29abaddc2b0247449bad018757", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ebcbb29abaddc2b0247449bad018757")).booleanValue() : (goodsPoiCategory == null || goodsPoiCategory2 == null || (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory) && goodsPoiCategory.childGoodPoiCategory.indexOf(goodsPoiCategory2) != 0)) ? false : true;
    }
}
