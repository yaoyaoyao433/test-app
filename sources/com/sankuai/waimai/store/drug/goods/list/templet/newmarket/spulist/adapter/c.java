package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

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
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final d b;
    View c;
    public View d;
    private TextView e;

    public c(@NonNull Context context, @NonNull d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b305b938277e7e1bc63d80c714430a3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b305b938277e7e1bc63d80c714430a3b");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416908a43a0a2fe513dc061d97dccb59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416908a43a0a2fe513dc061d97dccb59");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b4f69b598ff7086159e7899bca4c7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b4f69b598ff7086159e7899bca4c7e")).intValue();
        }
        if (this.b.a(goodsPoiCategory) && b(goodsPoiCategory, goodsPoiCategory2)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84833c662d9f39be0b9281bded701a60", RobustBitConfig.DEFAULT_VALUE)) {
                measuredHeight = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84833c662d9f39be0b9281bded701a60")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c618c7c94c76e8160170a74ddda41be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c618c7c94c76e8160170a74ddda41be");
        } else {
            this.c.setVisibility(8);
        }
    }

    public void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bec2eda40c022068e554295f8258e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bec2eda40c022068e554295f8258e50");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b15a6a0005238e410c18e072061c43b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b15a6a0005238e410c18e072061c43b")).booleanValue() : (goodsPoiCategory == null || goodsPoiCategory2 == null || (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory) && goodsPoiCategory.childGoodPoiCategory.indexOf(goodsPoiCategory2) != 0)) ? false : true;
    }
}
