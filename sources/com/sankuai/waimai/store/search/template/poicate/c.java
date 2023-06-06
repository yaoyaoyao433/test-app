package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    Context b;
    PoiEntity c;
    private final List<ProductItemEntity> d;
    private String e;
    private int f;

    public c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2349d562edb83f037fb81f124238b3d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2349d562edb83f037fb81f124238b3d3");
            return;
        }
        this.d = new ArrayList();
        this.b = context;
        this.e = str;
    }

    public final void a(List<ProductItemEntity> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644aea4a4a5bcf2c59dff61737b9d8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644aea4a4a5bcf2c59dff61737b9d8bf");
            return;
        }
        this.d.clear();
        if (list.size() >= 8) {
            this.d.addAll(list.subList(0, 8));
            this.f = this.d.size() + 1;
        } else {
            this.d.addAll(list);
            this.f = this.d.size();
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e9b8ea137fd84e3e834a21515d55c6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e9b8ea137fd84e3e834a21515d55c6")).intValue() : (i < 0 || i >= this.d.size()) ? 1 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7a76d6d941e1931e3b0a299edee8f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7a76d6d941e1931e3b0a299edee8f7");
        }
        if (i == 1) {
            return new a(LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_see_more, viewGroup, false));
        }
        if (TextUtils.equals(this.e, ErrorCode.ERROR_TYPE_B)) {
            return new b(LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_label_new_radical, viewGroup, false));
        }
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
        int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_poi_product_label_new_b, viewGroup, false);
        inflate.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            inflate.setLayoutParams(layoutParams);
        }
        return new b(inflate);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, final int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78860d8d562641bb0dd42c8624b2e5ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78860d8d562641bb0dd42c8624b2e5ee");
        } else if (sVar instanceof b) {
            final b bVar = (b) sVar;
            final ProductItemEntity productItemEntity = this.d.get(i);
            final PoiEntity poiEntity = this.c;
            Object[] objArr2 = {productItemEntity, poiEntity, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c0bf42fad2c436c2b3087eec0dd89bb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c0bf42fad2c436c2b3087eec0dd89bb1");
            } else if (!(bVar.b instanceof PoiGoodLabelView) || productItemEntity == null || poiEntity == null) {
            } else {
                if (!productItemEntity.isExposed) {
                    productItemEntity.isExposed = true;
                    productItemEntity.nodeProduct.a(c.this.b);
                    com.sankuai.waimai.store.search.util.e.a(SearchShareData.a(c.this.b), poiEntity, productItemEntity, i);
                }
                ((PoiGoodLabelView) bVar.b).a(productItemEntity, poiEntity.type, poiEntity.status);
                bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.c.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "229d3728e10ae7fc42ea1892e648b3e1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "229d3728e10ae7fc42ea1892e648b3e1");
                            return;
                        }
                        productItemEntity.nodeProduct.b(c.this.b);
                        com.sankuai.waimai.store.search.util.e.b(SearchShareData.a(c.this.b), poiEntity, productItemEntity, i);
                        com.sankuai.waimai.store.router.d.a(c.this.b, productItemEntity.restaurantScheme);
                    }
                });
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public View b;

        public b(View view) {
            super(view);
            Object[] objArr = {c.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977c3195d2ead25768575ff4d0c0e83a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977c3195d2ead25768575ff4d0c0e83a");
            } else {
                this.b = view;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;

        public a(View view) {
            super(view);
            Object[] objArr = {c.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da85ddbf9ea8a62203f32efd0fdb6aab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da85ddbf9ea8a62203f32efd0fdb6aab");
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e39e284905f55705639ff19697cfe5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e39e284905f55705639ff19697cfe5d");
            } else if (c.this.c != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d99d1865243448b8b10541a80c905fb1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d99d1865243448b8b10541a80c905fb1");
                        } else {
                            com.sankuai.waimai.store.router.d.a(c.this.b, c.this.c.restaurantScheme);
                        }
                    }
                });
            }
        }
    }
}
