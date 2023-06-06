package com.sankuai.waimai.store.search.template.nonlbs;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.search.model.Poi;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    private boolean b;
    private SearchShareData c;
    private final List<Poi> d;

    public a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b843686ef4dd502f2932bd4f84d32e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b843686ef4dd502f2932bd4f84d32e0");
            return;
        }
        this.b = false;
        this.d = new ArrayList();
        this.c = searchShareData;
    }

    public final void a(List<Poi> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876c380cbbbc59dff4ab671039e81bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876c380cbbbc59dff4ab671039e81bb5");
            return;
        }
        this.d.clear();
        for (Poi poi : list) {
            if (poi != null) {
                this.d.add(poi);
            }
        }
        this.d.add(null);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205ad514c568882258e725a1076d2cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205ad514c568882258e725a1076d2cf0");
        } else if (this.d.isEmpty()) {
        } else {
            this.b = true;
            notifyItemChanged(this.d.size() - 1);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91d2d3f2cdc0f31ff2b98c8a1a5da7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91d2d3f2cdc0f31ff2b98c8a1a5da7f");
        } else if (this.d.isEmpty()) {
        } else {
            this.b = false;
            notifyItemChanged(this.d.size() - 1);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6ff3fd4a8c4e540dc93e656ce593be", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6ff3fd4a8c4e540dc93e656ce593be");
        }
        if (i == 0) {
            return new b(viewGroup);
        }
        return new C1313a(viewGroup);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f91fbb3ccaa169f958b301b2f8dcd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f91fbb3ccaa169f958b301b2f8dcd1");
            return;
        }
        if (getItemViewType(i) == 0) {
            final b bVar = (b) sVar;
            final Poi poi = this.d.get(i);
            final SearchShareData searchShareData = this.c;
            Object[] objArr2 = {poi, searchShareData};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "002cf16c626addfe7880cf6e45e1e81d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "002cf16c626addfe7880cf6e45e1e81d");
                return;
            }
            final int adapterPosition = bVar.getAdapterPosition();
            if (adapterPosition == -1 || poi == null) {
                return;
            }
            bVar.itemView.post(new Runnable() { // from class: com.sankuai.waimai.store.search.template.nonlbs.a.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Map<String, Object> hashMap;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8ce04e101ff2a7cb154f27c44cf9c24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8ce04e101ff2a7cb154f27c44cf9c24");
                    } else if (poi.isExposed) {
                    } else {
                        poi.isExposed = true;
                        com.sankuai.waimai.store.callback.a b2 = com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_g5ocyk2n_mv");
                        b bVar2 = b.this;
                        Poi poi2 = poi;
                        int i2 = adapterPosition;
                        SearchShareData searchShareData2 = searchShareData;
                        Object[] objArr4 = {poi2, Integer.valueOf(i2), searchShareData2};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "2cfaa2b4ebf202ef0663a366ffc88579", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "2cfaa2b4ebf202ef0663a366ffc88579");
                        } else {
                            hashMap = new HashMap<>();
                            hashMap.put("cat_id", Integer.valueOf(searchShareData2.z));
                            hashMap.put("keyword", searchShareData2.h);
                            hashMap.put("poi_id", poi2.getOfficialPoiId());
                            hashMap.put("poi_index", Integer.valueOf(i2));
                            hashMap.put("search_log_id", searchShareData2.q);
                            hashMap.put("stid", g.f(searchShareData2));
                            hashMap.put("paotui_channel", searchShareData2.bp == null ? "" : searchShareData2.bp);
                            hashMap.put("over_range_page", 1);
                        }
                        b2.a(hashMap).a();
                    }
                }
            });
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.c = poi.picUrl;
            a2.e = 1;
            a2.f = ImageQualityUtil.a();
            a2.i = R.drawable.wm_sc_nox_search_product_label_rank_default_icon;
            a2.j = R.drawable.wm_sc_nox_search_product_label_rank_default_icon;
            a2.a(bVar.b);
            bVar.c.setText(poi.name);
            bVar.d.setText(poi.poiDistance);
            if (TextUtils.isEmpty(poi.nonDeliveryReason)) {
                bVar.e.setVisibility(8);
                bVar.itemView.setPadding(bVar.g, bVar.g, bVar.g, bVar.g);
                return;
            }
            bVar.e.setVisibility(0);
            bVar.e.setText(poi.nonDeliveryReason);
            bVar.itemView.setPadding(bVar.g, bVar.f, bVar.g, bVar.f);
            return;
        }
        C1313a c1313a = (C1313a) sVar;
        boolean z = this.b;
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = C1313a.a;
        if (PatchProxy.isSupport(objArr3, c1313a, changeQuickRedirect3, false, "4c6b504523fe942fd955465fde8082ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c1313a, changeQuickRedirect3, false, "4c6b504523fe942fd955465fde8082ab");
        } else {
            c1313a.b.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189139187937f19bb3d4c8af48139499", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189139187937f19bb3d4c8af48139499")).intValue() : this.d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d66aa6fc8e98b9e4a57f9b84d708b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d66aa6fc8e98b9e4a57f9b84d708b1")).intValue() : this.d.get(i) != null ? 0 : 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        TextView d;
        TextView e;
        int f;
        int g;

        public b(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_nox_search_v732_non_delivery_dialog_item, viewGroup, false));
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9780ded1ffb1c2dec751ef15535495", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9780ded1ffb1c2dec751ef15535495");
                return;
            }
            this.b = (ImageView) this.itemView.findViewById(R.id.poi_logo);
            this.c = (TextView) this.itemView.findViewById(R.id.poi_name);
            this.d = (TextView) this.itemView.findViewById(R.id.poi_distance);
            this.e = (TextView) this.itemView.findViewById(R.id.poi_reason);
            this.f = com.sankuai.waimai.foundation.utils.g.a(this.itemView.getContext(), 6.0f);
            this.g = com.sankuai.waimai.foundation.utils.g.a(this.itemView.getContext(), 12.0f);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.nonlbs.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1313a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        View b;

        public C1313a(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_nox_search_non_delivery_dialog_footer, viewGroup, false));
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6771f68359feada9e912305cca314e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6771f68359feada9e912305cca314e");
            } else {
                this.b = this.itemView.findViewById(R.id.loading_progress);
            }
        }
    }
}
