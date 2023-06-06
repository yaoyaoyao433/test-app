package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    Context b;
    SearchShareData c;
    PoiEntity d;
    int e;
    final List<ProductItemEntity> f;

    public j(Context context, PoiEntity poiEntity) {
        Object[] objArr = {context, poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e732506cf57740c5ceab419f526ada1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e732506cf57740c5ceab419f526ada1");
            return;
        }
        this.f = new ArrayList();
        this.b = context;
        this.c = SearchShareData.a(this.b);
        this.d = poiEntity;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363e5635c275853d9fbe35c829ec1061", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363e5635c275853d9fbe35c829ec1061")).intValue() : (i < 0 || i >= this.f.size()) ? 1 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7632e29809500b58075fe02bee0d423f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7632e29809500b58075fe02bee0d423f");
        }
        if (i == 0) {
            return new b(LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_label_new_b, viewGroup, false));
        }
        return new a(LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_see_more, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770184e21b3ecc7cd18c39434fd4ef8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770184e21b3ecc7cd18c39434fd4ef8e");
        } else if (sVar instanceof b) {
            final b bVar = (b) sVar;
            final ProductItemEntity productItemEntity = this.f.get(i);
            PoiEntity poiEntity = this.d;
            Object[] objArr2 = {Integer.valueOf(i), productItemEntity, poiEntity};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "517cd8b42703524b3abc488740c51fd0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "517cd8b42703524b3abc488740c51fd0");
            } else if (!(bVar.b instanceof PoiGoodLabelView) || productItemEntity == null || poiEntity == null) {
            } else {
                bVar.c.put("cat_id", Integer.valueOf(j.this.c.z));
                bVar.c.put("search_log_id", j.this.c.b(poiEntity));
                bVar.c.put("search_source", Integer.valueOf(j.this.c.aw));
                bVar.c.put("keyword", j.this.c.h);
                bVar.c.put("poi_id", Long.valueOf(productItemEntity.poiId));
                bVar.c.put("spu_id", Long.valueOf(productItemEntity.productId));
                bVar.c.put("sku_id", Long.valueOf(productItemEntity.skuId));
                bVar.c.put(DataConstants.INDEX, Integer.valueOf(i));
                bVar.c.put("poi_index", Integer.valueOf(poiEntity.getStatisticsIndex()));
                bVar.c.put("stid", com.sankuai.waimai.store.search.statistics.g.f(j.this.c));
                bVar.c.put("distance", poiEntity.poiDistance);
                bVar.c.put("min_total", poiEntity.minPriceTip);
                bVar.c.put("delivery_fee", poiEntity.shippingFeeTip);
                bVar.c.put("status", Integer.valueOf(poiEntity.status));
                bVar.c.put("ship_type", Integer.valueOf(poiEntity.deliveryType));
                bVar.c.put("search_global_id", j.this.c.r);
                bVar.c.put("template_type", Integer.valueOf(j.this.c.D));
                bVar.c.put("region", Integer.valueOf(poiEntity.regionId));
                bVar.c.put("poi_sales", poiEntity.monthSalesTip);
                bVar.c.put("food_sales", productItemEntity.monthSaledContent);
                bVar.c.put("spu_label", Integer.valueOf((productItemEntity.mLabelOnPicture == null || productItemEntity.mLabelOnPicture.labelType != 4) ? -999 : 1));
                bVar.c.put("spu_type", productItemEntity.preSale == 1 ? "2" : "-999");
                if (!productItemEntity.isExposed) {
                    productItemEntity.isExposed = true;
                    com.sankuai.waimai.store.manager.judas.b.b(j.this.b, "b_waimai_sg_mxv3dt3h_mv").b(bVar.c).a();
                }
                ((PoiGoodLabelView) bVar.b).a(productItemEntity, poiEntity.type, poiEntity.status);
                bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.j.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fb0fb38aed4a13fdc769ad1fb2cc4d6", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fb0fb38aed4a13fdc769ad1fb2cc4d6");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(j.this.b, "b_waimai_sg_mxv3dt3h_mc").b(b.this.c).a();
                        com.sankuai.waimai.store.router.d.a(j.this.b, productItemEntity.restaurantScheme);
                    }
                });
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return this.e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public View b;
        Map<String, Object> c;

        public b(View view) {
            super(view);
            Object[] objArr = {j.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c4dbfdb99b80b37fcef856a83fbaff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c4dbfdb99b80b37fcef856a83fbaff");
                return;
            }
            this.c = new HashMap();
            this.b = view;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;

        public a(View view) {
            super(view);
            Object[] objArr = {j.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be4924d21546bc3e283700ee97ed87ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be4924d21546bc3e283700ee97ed87ac");
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3d08850b14874240e2ef9e0bf94f8fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3d08850b14874240e2ef9e0bf94f8fe");
            } else if (j.this.d != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.j.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "04d4d5fcfbac76c7f51eb91ff33dd2af", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "04d4d5fcfbac76c7f51eb91ff33dd2af");
                        } else {
                            com.sankuai.waimai.store.router.d.a(j.this.b, j.this.d.restaurantScheme);
                        }
                    }
                });
            }
        }
    }
}
