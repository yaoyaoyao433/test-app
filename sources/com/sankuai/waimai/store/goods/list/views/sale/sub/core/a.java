package com.sankuai.waimai.store.goods.list.views.sale.sub.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c implements com.sankuai.waimai.store.goods.list.views.sale.sub.a {
    public static ChangeQuickRedirect a;
    final List<SaleCampaignGather> b;
    private C1200a e;

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c
    public final int a() {
        return R.layout.wm_sg_on_sale_multi_view;
    }

    public a(@NonNull ViewGroup viewGroup, @Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3bc54922e9a21c5dddc4ad3857d753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3bc54922e9a21c5dddc4ad3857d753");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13eea333a18170e41427da03e24637f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13eea333a18170e41427da03e24637f1");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findView(R.id.rv_content);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.e = new C1200a();
        recyclerView.setAdapter(this.e);
    }

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.a
    public final void a(List<SaleCampaignGather> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c6c793a0b0906cc512f74338519b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c6c793a0b0906cc512f74338519b4d");
            return;
        }
        this.b.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.addAll(list);
        }
        this.e.notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.store.goods.list.views.sale.business.a b;
        @Nullable
        com.sankuai.waimai.store.expose.v2.entity.b c;

        public b(View view, com.sankuai.waimai.store.expose.v2.entity.b bVar) {
            super(view);
            Object[] objArr = {view, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6144ed0a33764c3a3537b9aabf55826", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6144ed0a33764c3a3537b9aabf55826");
                return;
            }
            this.b = new com.sankuai.waimai.store.goods.list.views.sale.business.a(view);
            this.c = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.views.sale.sub.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1200a extends RecyclerView.a<b> {
        public static ChangeQuickRedirect a;

        private C1200a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb4f9e07f60139a01e9f60fe38693f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb4f9e07f60139a01e9f60fe38693f7");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
            final b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e62921b562728b1556f544864ac87f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e62921b562728b1556f544864ac87f2");
                return;
            }
            SaleCampaignGather saleCampaignGather = (SaleCampaignGather) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, i);
            final com.sankuai.waimai.store.base.statistic.a aVar = a.this.d;
            Object[] objArr2 = {saleCampaignGather, Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "ad8a67e8b5ed161c9a344f031a6ac557", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "ad8a67e8b5ed161c9a344f031a6ac557");
            } else if (saleCampaignGather == null) {
            } else {
                final HashMap hashMap = new HashMap();
                hashMap.put("activity_type", saleCampaignGather.activityType);
                hashMap.put("index", Integer.valueOf(i));
                bVar2.b.c = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.views.sale.sub.core.a.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc825886923bc90f908aa6e8c4430b5f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc825886923bc90f908aa6e8c4430b5f");
                        } else if (aVar != null) {
                            aVar.a(hashMap);
                        }
                    }
                };
                bVar2.b.a(saleCampaignGather);
                if (aVar != null) {
                    aVar.a(bVar2.c, i, hashMap);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf917ba7395155f1eb87565ba59b6a80", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf917ba7395155f1eb87565ba59b6a80");
            }
            View a2 = z.a(viewGroup.getContext(), R.layout.wm_sg_on_sale_multi_item_view, viewGroup, false);
            return new b(a2, a.this.d != null ? a.this.d.a(a2) : null);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c3a927e7a3628d062a3289757192d3c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c3a927e7a3628d062a3289757192d3c")).intValue() : com.sankuai.shangou.stone.util.a.a((List) a.this.b);
        }
    }
}
