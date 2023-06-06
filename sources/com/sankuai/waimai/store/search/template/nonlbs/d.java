package com.sankuai.waimai.store.search.template.nonlbs;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.search.model.NonDeliveryV732Info;
import com.sankuai.waimai.store.search.model.Poi;
import com.sankuai.waimai.store.search.model.j;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.search.adapterdelegates.b<NonDeliveryV732Info, a> {
    public static ChangeQuickRedirect a;
    private final String b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c54979fa37a4580f43ee39ab307453b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c54979fa37a4580f43ee39ab307453b") : new a(viewGroup, this.b);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull NonDeliveryV732Info nonDeliveryV732Info, @NonNull a aVar, int i) {
        final NonDeliveryV732Info nonDeliveryV732Info2 = nonDeliveryV732Info;
        final a aVar2 = aVar;
        Object[] objArr = {nonDeliveryV732Info2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a484af69868250bb7401339907b2870a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a484af69868250bb7401339907b2870a");
            return;
        }
        final SearchShareData searchShareData = this.l;
        Object[] objArr2 = {nonDeliveryV732Info2, searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "010453cbbac2ec0b90cffac5e87bb6ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "010453cbbac2ec0b90cffac5e87bb6ba");
        } else if (nonDeliveryV732Info2 == null || searchShareData == null) {
        } else {
            aVar2.g.clear();
            aVar2.h = false;
            aVar2.itemView.post(new Runnable() { // from class: com.sankuai.waimai.store.search.template.nonlbs.d.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f1cedab5a45fba6a3c92d198011f662", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f1cedab5a45fba6a3c92d198011f662");
                    } else if (nonDeliveryV732Info2.isExposed) {
                    } else {
                        nonDeliveryV732Info2.isExposed = true;
                        com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_abu41tr9_mv").a(a.a(a.this, searchShareData)).a();
                    }
                }
            });
            if (nonDeliveryV732Info2.showAddress) {
                aVar2.d.setVisibility(0);
                aVar2.c.setVisibility(0);
                WmAddress k = g.a().k();
                if (k != null) {
                    aVar2.c.setText(k.getAddress());
                } else {
                    WmAddress j = g.a().j();
                    if (j != null) {
                        aVar2.c.setText(j.getAddress());
                    } else {
                        aVar2.c.setText("定位中");
                    }
                }
            } else {
                aVar2.d.setVisibility(8);
                aVar2.c.setVisibility(8);
            }
            aVar2.e.setText(nonDeliveryV732Info2.poiNonContent);
            aVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.nonlbs.d.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ebf36d13a588636ea16a3d6823be3f94", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ebf36d13a588636ea16a3d6823be3f94");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_xf9Q4").a(a.a(a.this, searchShareData)).a();
                    if (a.this.g.isEmpty()) {
                        final a aVar3 = a.this;
                        final SearchShareData searchShareData2 = searchShareData;
                        Object[] objArr4 = {searchShareData2};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "931e43130ff3ed4f008c18a8bb85c4a9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "931e43130ff3ed4f008c18a8bb85c4a9");
                            return;
                        } else {
                            com.sankuai.waimai.store.search.common.api.net.a.a(aVar3.b).a(searchShareData2.y, searchShareData2.z, searchShareData2.B, searchShareData2.h, searchShareData2.n, 0, 20, 0, new k<j>() { // from class: com.sankuai.waimai.store.search.template.nonlbs.d.a.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final /* synthetic */ void a(Object obj) {
                                    j jVar = (j) obj;
                                    Object[] objArr5 = {jVar};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f61208309e73270b5fe321f0af2a734f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f61208309e73270b5fe321f0af2a734f");
                                    } else if (jVar == null || com.sankuai.shangou.stone.util.a.b(jVar.b)) {
                                        a.a(a.this);
                                    } else {
                                        a.this.g.addAll(jVar.b);
                                        a.this.h = jVar.a;
                                        a.b(a.this, searchShareData2);
                                    }
                                }

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                    Object[] objArr5 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1740838a836cba3ee43f409744911543", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1740838a836cba3ee43f409744911543");
                                    } else {
                                        a.a(a.this);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    a.b(a.this, searchShareData);
                }
            });
        }
    }

    public d(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3437a9f0ed57abe966728ef5b9e1d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3437a9f0ed57abe966728ef5b9e1d9");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47514184f259e097e672e9032d746466", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47514184f259e097e672e9032d746466")).booleanValue() : str.equals("shangou_only_nondelivery_poi_732_template");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        String b;
        TextView c;
        FrameLayout d;
        TextView e;
        ImageView f;
        List<Poi> g;
        boolean h;
        private TextView i;

        public static /* synthetic */ Map a(a aVar, SearchShareData searchShareData) {
            Object[] objArr = {searchShareData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fa7e82535a238a8757e8248ebc52f6df", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fa7e82535a238a8757e8248ebc52f6df");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
            hashMap.put("keyword", searchShareData.h);
            hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(searchShareData));
            hashMap.put("search_log_id", searchShareData.q);
            return hashMap;
        }

        public static /* synthetic */ void a(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6653ecc65a1607e42e72d341a8a542b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6653ecc65a1607e42e72d341a8a542b0");
            } else {
                am.a(aVar.itemView, aVar.itemView.getContext().getString(R.string.wm_sc_search_api_fail_text));
            }
        }

        public static /* synthetic */ void b(a aVar, SearchShareData searchShareData) {
            Object[] objArr = {searchShareData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a2eaf050c6f2e24dae98c722c6b08e82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a2eaf050c6f2e24dae98c722c6b08e82");
                return;
            }
            for (Poi poi : aVar.g) {
                if (poi != null) {
                    poi.isExposed = false;
                }
            }
            Rect rect = new Rect();
            aVar.i.getGlobalVisibleRect(rect);
            NonDeliveryDialog nonDeliveryDialog = new NonDeliveryDialog(aVar.itemView.getContext(), searchShareData, aVar.g, aVar.h);
            nonDeliveryDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.search.template.nonlbs.d.a.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8279aa81858e3b10c0d3f3b2204b3090", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8279aa81858e3b10c0d3f3b2204b3090");
                    } else {
                        a.this.f.setImageResource(R.drawable.wm_sc_nox_search_poi_activity_arrow_down);
                    }
                }
            });
            nonDeliveryDialog.a(rect.bottom);
            aVar.f.setImageResource(R.drawable.wm_sc_nox_search_poi_activity_arrow_up);
        }

        public a(ViewGroup viewGroup, String str) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_nox_search_global_poi_v732_non_delivery, viewGroup, false));
            Object[] objArr = {viewGroup, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dead6526cb2a7991cfc38f9b2ac721c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dead6526cb2a7991cfc38f9b2ac721c2");
                return;
            }
            this.b = str;
            this.c = (TextView) this.itemView.findViewById(R.id.location_text);
            this.d = (FrameLayout) this.itemView.findViewById(R.id.non_delivery_image_container);
            this.e = (TextView) this.itemView.findViewById(R.id.non_delivery_text);
            this.i = (TextView) this.itemView.findViewById(R.id.lookup_text);
            this.f = (ImageView) this.itemView.findViewById(R.id.arrow_icon);
            this.g = new ArrayList();
        }
    }
}
