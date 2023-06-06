package com.sankuai.waimai.store.msi.view.shoprest;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final Poi b;
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    public final MsiCustomContext d;
    final String e;

    public e(MsiCustomContext msiCustomContext, Poi poi, String str) {
        Object[] objArr = {msiCustomContext, poi, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c260b3a3fe25816cd33000f3887a14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c260b3a3fe25816cd33000f3887a14");
            return;
        }
        this.b = poi;
        this.c = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
        this.d = msiCustomContext;
        this.e = str;
    }

    void a(Poi poi, View view, String str) {
        Object[] objArr = {poi, view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506c22eded41ae65e052f01e572a5925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506c22eded41ae65e052f01e572a5925");
        } else if (view == null || poi == null) {
        } else {
            if (poi.subscribe != 0) {
                a(poi.id, poi.subscribe, str);
            }
            a(poi.poiIdStr, poi.id, poi.subscribe, (TextView) view.findViewById(R.id.tv_subscribe), str);
        }
    }

    void a(final String str, final long j, final int i, @NonNull final TextView textView, final String str2) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), textView, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcd4a8bd97714ed38607338a6a3ae59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcd4a8bd97714ed38607338a6a3ae59");
            return;
        }
        if (i == 1) {
            textView.setVisibility(0);
            textView.setText(R.string.wm_sg_poi_can_subscribe);
            textView.setSelected(false);
        } else if (i == 2) {
            textView.setVisibility(0);
            textView.setText(R.string.wm_sg_poi_have_subscribe);
            textView.setSelected(true);
        } else {
            textView.setVisibility(8);
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24babcd1c471449e0ab28816a14cca2c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24babcd1c471449e0ab28816a14cca2c");
                } else {
                    com.sankuai.waimai.store.poi.subscribe.a.a().a(e.this.d.getActivity(), new com.sankuai.waimai.store.poi.subscribe.c(e.this.d.getActivity(), j, str, i, com.sankuai.waimai.store.msi.listener.a.a(e.this.d.getActivity())) { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c, com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(PoiSubscribeResponse poiSubscribeResponse) {
                            Object[] objArr3 = {poiSubscribeResponse};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b643e3a09b5429bff5dbbbfd23d2bc50", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b643e3a09b5429bff5dbbbfd23d2bc50");
                                return;
                            }
                            super.a(poiSubscribeResponse);
                            e.this.a(str, j, poiSubscribeResponse.subscribe, textView, str2);
                            e eVar = e.this;
                            long j2 = j;
                            int i2 = poiSubscribeResponse.subscribe;
                            String str3 = str2;
                            Object[] objArr4 = {new Long(j2), Integer.valueOf(i2), str3};
                            ChangeQuickRedirect changeQuickRedirect4 = e.a;
                            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "cd2806ed23fd8871b77f987e4ff90c6e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "cd2806ed23fd8871b77f987e4ff90c6e");
                            } else {
                                com.sankuai.waimai.store.manager.judas.b.a(str3, "b_waimai_8qdr0n48_mc").a("poi_id", Long.valueOf(j2)).a("status", Integer.valueOf(i2)).a();
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b90fc9d9dfb843b7413e941704d819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b90fc9d9dfb843b7413e941704d819");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(str, "b_waimai_8qdr0n48_mv").a("poi_id", Long.valueOf(j)).a("status", Integer.valueOf(i)).a();
        }
    }
}
