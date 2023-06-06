package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OnSaleUnionView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.store.base.statistic.a f;
    private final List<SaleCampaignGather> g;
    private a h;

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_sg_on_sale_multi_view;
    }

    public OnSaleUnionView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6299df9042f16bc5d03a3f205c80e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6299df9042f16bc5d03a3f205c80e74");
        } else {
            this.g = new ArrayList();
        }
    }

    public OnSaleUnionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3e96cd4df3612f8d1b19ad95525d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3e96cd4df3612f8d1b19ad95525d34");
        } else {
            this.g = new ArrayList();
        }
    }

    public OnSaleUnionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce4d793264352ae04356bc330b18c24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce4d793264352ae04356bc330b18c24");
        } else {
            this.g = new ArrayList();
        }
    }

    @TargetApi(21)
    public OnSaleUnionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab35a45a4ccac13562a7f61b1628fde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab35a45a4ccac13562a7f61b1628fde");
        } else {
            this.g = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8324b0d1177608d822b9caa6f3ccf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8324b0d1177608d822b9caa6f3ccf9");
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_content);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.h = new a();
        int a2 = h.a(getContext(), 12.0f);
        recyclerView.setPadding(a2, 0, a2, 0);
        recyclerView.setAdapter(this.h);
        return this;
    }

    @UiThread
    public final void a(List<SaleCampaignGather> list, com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e59877bb33243be41d179c654752f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e59877bb33243be41d179c654752f09");
            return;
        }
        try {
            com.sankuai.waimai.store.manager.judas.b.b("c_waimai_bwm78neq", "b_waimai_7sdonqph_mv").a();
        } catch (Throwable unused) {
        }
        if (com.sankuai.shangou.stone.util.a.a((List) list) < 2) {
            u.c(this);
            return;
        }
        u.a(this);
        this.g.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.g.addAll(list);
        }
        this.h.notifyDataSetChanged();
        this.f = aVar;
        this.h.notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.business.a b;
        @Nullable
        com.sankuai.waimai.store.expose.v2.entity.b c;

        public b(View view) {
            super(view);
            Object[] objArr = {OnSaleUnionView.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28432192e9e42c85eb095180a9b48e1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28432192e9e42c85eb095180a9b48e1f");
                return;
            }
            this.b = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.business.a(view);
            if (OnSaleUnionView.this.f != null) {
                this.c = OnSaleUnionView.this.f.a(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends RecyclerView.a<b> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {OnSaleUnionView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9f0c574c8158e2a9d57809a7866b2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9f0c574c8158e2a9d57809a7866b2c");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
            final b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32aefb3a974d8762f1394a004b64d2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32aefb3a974d8762f1394a004b64d2e");
                return;
            }
            SaleCampaignGather saleCampaignGather = (SaleCampaignGather) com.sankuai.shangou.stone.util.a.a((List<Object>) OnSaleUnionView.this.g, i);
            final com.sankuai.waimai.store.base.statistic.a aVar = OnSaleUnionView.this.f;
            Object[] objArr2 = {saleCampaignGather, Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "b46f03dde47ec8bbc81d78f1f7cab143", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "b46f03dde47ec8bbc81d78f1f7cab143");
            } else if (saleCampaignGather == null) {
            } else {
                final HashMap hashMap = new HashMap();
                hashMap.put("activity_type", saleCampaignGather.activityType);
                hashMap.put("index", Integer.valueOf(i));
                bVar2.b.b = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.OnSaleUnionView.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4839ac385315a875e5172bc08049bce", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4839ac385315a875e5172bc08049bce");
                        } else if (aVar != null) {
                            aVar.a(hashMap);
                        }
                    }
                };
                bVar2.b.a(saleCampaignGather, OnSaleUnionView.this.g.size());
                if (aVar != null) {
                    aVar.a(bVar2.c, i, hashMap);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2d6b2eac37a2904d21901d57eb937a", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2d6b2eac37a2904d21901d57eb937a");
            }
            switch (com.sankuai.shangou.stone.util.a.a(OnSaleUnionView.this.g)) {
                case 2:
                    return new b(z.a(viewGroup.getContext(), R.layout.wm_sc_googs_list_floor_activity_double_item_view, viewGroup, false));
                case 3:
                    return new b(z.a(viewGroup.getContext(), R.layout.wm_sc_googs_list_floor_activity_three_item_view, viewGroup, false));
                default:
                    return new b(z.a(viewGroup.getContext(), R.layout.wm_sc_googs_list_floor_activity_multi_item_view, viewGroup, false));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88359be1d992c9805f9c950e14b1278c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88359be1d992c9805f9c950e14b1278c")).intValue() : com.sankuai.shangou.stone.util.a.a(OnSaleUnionView.this.g);
        }
    }
}
