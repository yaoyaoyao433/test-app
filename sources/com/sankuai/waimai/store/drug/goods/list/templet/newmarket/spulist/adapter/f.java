package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.DescriptionBarInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b3255d8742dfd1780a1d249dd54778", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b3255d8742dfd1780a1d249dd54778");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c97e7acb766129aa44586fde5d6eabf", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c97e7acb766129aa44586fde5d6eabf") : layoutInflater.inflate(R.layout.wm_drug_poi_market_adapter_slogen_header, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb47274984dd05e723707d76b823eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb47274984dd05e723707d76b823eaf");
            return;
        }
        super.onViewCreated();
        this.b = this.mView.findViewById(R.id.root_view);
        this.c = (TextView) this.mView.findViewById(R.id.txt_slogen_header_content);
    }

    public final void a(e eVar, int i, int i2) {
        GoodsPoiCategory goodsPoiCategory;
        DescriptionBarInfo descriptionBarInfo;
        Object[] objArr = {eVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a3231b46f6af8df5264bb88851fb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a3231b46f6af8df5264bb88851fb7c");
        } else if (eVar == null || (goodsPoiCategory = eVar.b) == null) {
        } else {
            if (i2 == 0) {
                if (goodsPoiCategory.activityInfo == null) {
                    this.b.setVisibility(8);
                    return;
                }
                if (goodsPoiCategory.activityInfo.viewType == 0) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36c163218debfec663bd6c21a82cfd9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36c163218debfec663bd6c21a82cfd9f");
                    } else {
                        this.b.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f)).c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FFEDED)).a());
                        this.c.setTextColor(ContextCompat.getColor(this.c.getContext(), R.color.wm_st_common_F4A26));
                    }
                } else {
                    StoreActivityInfo storeActivityInfo = goodsPoiCategory.activityInfo;
                    Object[] objArr3 = {storeActivityInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51df5538a6167fce37441aa9c1781b24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51df5538a6167fce37441aa9c1781b24");
                    } else {
                        String str = "";
                        String str2 = "";
                        if (storeActivityInfo != null) {
                            str = storeActivityInfo.textColor;
                            str2 = storeActivityInfo.textBgColor;
                        }
                        this.b.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f)).c(com.sankuai.shangou.stone.util.d.a(str2, ContextCompat.getColor(this.c.getContext(), R.color.wm_sg_color_0fffa200))).a());
                        this.c.setTextColor(com.sankuai.shangou.stone.util.d.a(str, ContextCompat.getColor(this.c.getContext(), R.color.wm_sg_color_666460)));
                    }
                }
                this.c.setText(com.sankuai.waimai.store.util.l.a(goodsPoiCategory.activityInfo.activityText, "#FFA200"));
            } else if (i2 != 1 || (descriptionBarInfo = goodsPoiCategory.mDescriptionBar) == null || t.a(descriptionBarInfo.content)) {
            } else {
                String str3 = descriptionBarInfo.backgroundColor;
                String str4 = descriptionBarInfo.contentColor;
                Object[] objArr4 = {str3, str4};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fe864849486229ac6fa092ed8411a6a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fe864849486229ac6fa092ed8411a6a7");
                } else {
                    this.b.setBackground(new e.a().a(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4)).c(com.sankuai.shangou.stone.util.d.a(str3, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_white))).a());
                    this.c.setTextColor(com.sankuai.shangou.stone.util.d.a(str4, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sc_color_222426)));
                }
                this.c.setText(descriptionBarInfo.content);
            }
        }
    }
}
