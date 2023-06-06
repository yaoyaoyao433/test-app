package com.sankuai.waimai.store.poilist.view.sub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.repository.model.PoiRecommend;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.poilist.view.sub.a {
    public static ChangeQuickRedirect e;
    com.sankuai.waimai.store.newwidgets.list.f<PoiVerticality, b> f;
    PoiRecommend g;
    private int h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b extends com.sankuai.waimai.store.newwidgets.list.b {
        int a();

        int b();
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1140734f0ce56edbb3ec3a539420560b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1140734f0ce56edbb3ec3a539420560b");
        } else {
            this.h = -1;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.a
    public final void a(PoiRecommend poiRecommend) {
        Object[] objArr = {poiRecommend};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accc79d7c68f1d58d5f3b09e7b794ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accc79d7c68f1d58d5f3b09e7b794ea1");
            return;
        }
        int hashCode = poiRecommend.hashCode();
        this.g = poiRecommend;
        this.f.b_(poiRecommend.poiList);
        this.h = hashCode;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373ca8f45b123cd8b9364517a59e6bd7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373ca8f45b123cd8b9364517a59e6bd7") : layoutInflater.inflate(R.layout.wm_sc_poi_recommend_vertical_view_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.a, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351cafb1c5201a9ca04868794149c96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351cafb1c5201a9ca04868794149c96d");
            return;
        }
        super.onViewCreated();
        this.c.setNestedScrollingEnabled(false);
        this.c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f = new a(new b() { // from class: com.sankuai.waimai.store.poilist.view.sub.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.view.sub.d.b
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dea56987e58bfe4eac15ee5532657e8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dea56987e58bfe4eac15ee5532657e8")).intValue() : d.this.g.poiIndex;
            }

            @Override // com.sankuai.waimai.store.poilist.view.sub.d.b
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ec8b626ad344a35aa3ac7a438dbca59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ec8b626ad344a35aa3ac7a438dbca59")).intValue() : d.this.f.getItemCount();
            }
        });
        this.c.setAdapter(this.f);
        this.f.a(new k() { // from class: com.sankuai.waimai.store.poilist.view.sub.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.list.k
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca00a13b67b0996285082086f2141799", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca00a13b67b0996285082086f2141799");
                    return;
                }
                PoiVerticality h = d.this.f.h(i);
                if (h == null) {
                    return;
                }
                if (d.this.d != null) {
                    Map<String, Object> a2 = com.sankuai.waimai.store.poilist.view.sub.a.a(h, i);
                    a2.put(DataConstants.INDEX, Integer.valueOf(d.this.g.poiIndex));
                    a2.put("is_have_sku", Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(h.products)));
                    d.this.d.a(a2);
                }
                d.this.a(h.restaurantScheme);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends com.sankuai.waimai.store.newwidgets.list.f<PoiVerticality, b> {
        public static ChangeQuickRedirect a;

        public a(@NonNull b bVar) {
            super(bVar);
            Object[] objArr = {d.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "570bd97ea2ccfd5743bd06283019911f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "570bd97ea2ccfd5743bd06283019911f");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40eb4f888ef5465e71a1695e7537381", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40eb4f888ef5465e71a1695e7537381") : new e(d.this.d);
        }
    }
}
