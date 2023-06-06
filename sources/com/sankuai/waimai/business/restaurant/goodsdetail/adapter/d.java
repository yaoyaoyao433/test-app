package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.k;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a implements a.InterfaceC0833a {
    public static ChangeQuickRedirect j;
    private final LayoutInflater k;
    private ArrayList<PoiItem> l;
    private a.InterfaceC0850a m;
    private ArrayList<GoodsSpu> n;
    private long o;
    private String p;
    private g q;
    private int r;
    private boolean s;
    private String t;

    public d(Activity activity, ab abVar, ArrayList<RecommendPackage.a> arrayList, ArrayList<GoodsSpu> arrayList2, String str, int i, boolean z, a.InterfaceC0850a interfaceC0850a, long j2, g gVar, int i2, boolean z2, String str2) {
        super(activity, interfaceC0850a.a(), abVar, arrayList, str, i, z);
        Object[] objArr = {activity, abVar, arrayList, arrayList2, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), interfaceC0850a, new Long(j2), gVar, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340fc871c691be68aea36b9662acfb39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340fc871c691be68aea36b9662acfb39");
            return;
        }
        this.l = new ArrayList<>();
        this.n = new ArrayList<>();
        this.m = interfaceC0850a;
        this.o = j2;
        this.p = str;
        this.q = gVar;
        this.r = i2;
        this.s = z2;
        this.t = str2;
        this.i = this;
        if (arrayList2 == null || arrayList2.size() == 0) {
            this.l.add(new PoiItem() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.d.1
                @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
                public final String getTag() {
                    return RecommendPackage.TAG_NON_GOODS_ITEM;
                }

                @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
                public final void setTag(String str3) {
                }
            });
        } else {
            this.n.addAll(arrayList2);
            this.l.addAll(this.n);
        }
        if (arrayList.size() > 0) {
            this.l.add(new PoiItem() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.d.2
                @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
                public final String getTag() {
                    return RecommendPackage.TAG_TITLE;
                }

                @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
                public final void setTag(String str3) {
                }
            });
            this.l.addAll(arrayList);
        }
        this.l.add(new PoiItem() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.d.3
            @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
            public final String getTag() {
                return null;
            }

            @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
            public final void setTag(String str3) {
            }
        });
        this.k = LayoutInflater.from(activity);
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a, android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5763eece445da513a0d4bd406887ad1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5763eece445da513a0d4bd406887ad1")).intValue();
        }
        if (this.l != null) {
            return this.l.size();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a, android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae79d172075de100cbeb4c3e2c5f920", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae79d172075de100cbeb4c3e2c5f920")).intValue();
        }
        if (getItemCount() - 1 == i) {
            return 4;
        }
        if (this.l == null || this.l.get(i) == null || !TextUtils.equals(this.l.get(i).getTag(), RecommendPackage.TAG_RECOMMEND_ITEM)) {
            if (this.l == null || this.l.get(i) == null || !TextUtils.equals(this.l.get(i).getTag(), RecommendPackage.TAG_TITLE)) {
                return (this.l == null || this.l.get(i) == null || !TextUtils.equals(this.l.get(i).getTag(), RecommendPackage.TAG_NON_GOODS_ITEM)) ? 2 : 5;
            }
            return 1;
        }
        return 3;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89b9706aef80a1347cfe1916bdbd509", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89b9706aef80a1347cfe1916bdbd509");
        }
        if (i == 2) {
            return new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b(this.k, viewGroup, this.m, this.s, this.t);
        }
        if (i == 1) {
            return new c(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_recommend_package_title, viewGroup, false));
        }
        if (i == 4) {
            return new a(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_list_footer_empty, viewGroup, false));
        }
        if (i == 5) {
            return new b(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_recommend_non_goods, viewGroup, false));
        }
        return new com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.b(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_goods_detail_recommend_package_item, viewGroup, false), this.q, this.i, this.h, this.g, this.f, this.d);
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a, android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41376c9f8fbfde5ef96988b3ededb560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41376c9f8fbfde5ef96988b3ededb560");
        } else if (sVar instanceof com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b) {
            GoodsSpu goodsSpu = (GoodsSpu) this.l.get(i);
            com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b bVar = (com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b) sVar;
            Object[] objArr2 = {goodsSpu, null, null, (byte) 0, (byte) 0, 1};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "34e3b4461072201cc23e8dc9ce2b7d0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "34e3b4461072201cc23e8dc9ce2b7d0a");
            } else if (goodsSpu != null) {
                bVar.d = goodsSpu;
                bVar.e.a(goodsSpu, false, bVar.c, -1, bVar.b, false);
                Object[] objArr3 = {bVar.e.a(), (byte) 0, (byte) 0, null, goodsSpu, -1, -1};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "518f3e52456b07496f3e68d5942f4b67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "518f3e52456b07496f3e68d5942f4b67");
                }
            }
        } else if (sVar instanceof com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a) {
            ((com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a) sVar).a(this.e.get(i - this.r), i - this.r, false);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a.InterfaceC0833a
    public final void a(RecommendPackage.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081270afe8e2b6d3c0e85df2a5566627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081270afe8e2b6d3c0e85df2a5566627");
            return;
        }
        new com.sankuai.waimai.business.restaurant.goodsdetail.widget.b(this.q, this.b, this.d).a(aVar.i);
        k.a(aVar, this.o, this.p, i, this.q, this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends RecyclerView.s {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        private TextView b;

        public c(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fff06c77e78f3ea8bf4f18a7378711", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fff06c77e78f3ea8bf4f18a7378711");
            } else {
                this.b = (TextView) view.findViewById(R.id.title);
            }
        }
    }
}
