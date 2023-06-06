package com.sankuai.waimai.store.search.ui.result;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.model.Poi;
import com.sankuai.waimai.store.search.statistics.h;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.search.adapterdelegates.a {
    public static ChangeQuickRedirect c;
    public b d;
    private com.sankuai.waimai.store.search.adapterdelegates.c e;
    private SearchShareData f;
    private ResultFragment g;
    private String h;
    private Context i;
    private ISearchTemplateProvider j;
    private ISearchTemplateProvider k;
    private List<OasisModule> l;
    private Set<String> m;

    public e(ResultFragment resultFragment, Context context, List<OasisModule> list, b bVar, String str) {
        int i;
        Object[] objArr = {resultFragment, context, list, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d1a66ef1c6a13b30e9dacc17a5ae74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d1a66ef1c6a13b30e9dacc17a5ae74");
            return;
        }
        this.m = new HashSet();
        this.g = resultFragment;
        this.i = context;
        this.l = list;
        this.d = bVar;
        this.f = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this.i, SearchShareData.class);
        this.h = str;
        this.j = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH);
        this.k = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c41ca20cd51b1cf3af75578c1753a4a7", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c41ca20cd51b1cf3af75578c1753a4a7");
        } else {
            this.e = new com.sankuai.waimai.store.search.adapterdelegates.c(this.i, new com.sankuai.waimai.store.search.ui.result.adapterDelegate.a(this.i, this.d), new com.sankuai.waimai.store.search.ui.result.adapterDelegate.b(this.i));
            if (this.j != null) {
                this.e.a(this.j.provideNativeTemplates(this.i, this.h, this.d));
                this.e.b = this.j.provideMachAdapterDelegate(this.i, this.d);
            }
            if (this.k != null) {
                this.e.a(this.k.provideNativeTemplates(this.i, this.h, this.d));
                this.e.c = this.k.provideMachAdapterDelegate(this.i, this.d);
            }
            i = 0;
        }
        Object[] objArr3 = new Object[i];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0d0b41959fba87161315cc27181d2de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0d0b41959fba87161315cc27181d2de");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_global_search/mach_index_black_list", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.e.1
        }.getType());
        if (strArr != null) {
            this.m.addAll(Arrays.asList(strArr));
            h.b = this.m;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e08b886c0ba37b28a7c3e039f8a430b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e08b886c0ba37b28a7c3e039f8a430b");
            return;
        }
        h.a(this.l);
        int i = 0;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            Serializable serializable = this.l.get(i2) == null ? null : this.l.get(i2).data;
            if (serializable instanceof com.sankuai.waimai.store.search.model.f) {
                com.sankuai.waimai.store.search.model.f fVar = (com.sankuai.waimai.store.search.model.f) serializable;
                if (!fVar.isChildItem) {
                    fVar.outCardIndex = i;
                    fVar.inCardIndex = 0;
                }
                i++;
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de12671015212b11bdc158236bf54cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de12671015212b11bdc158236bf54cde");
        } else {
            this.f.b();
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final int b() {
        if (this.l == null) {
            return 0;
        }
        return this.l.size();
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final int a(int i) {
        return this.e.a(this.l.get(i));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    @NonNull
    public final RecyclerView.s a(@NonNull ViewGroup viewGroup, int i) {
        return this.e.a(viewGroup, i);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final void a(@NonNull RecyclerView.s sVar, int i) {
        com.sankuai.waimai.store.search.adapterdelegates.c cVar = this.e;
        OasisModule oasisModule = this.l.get(i);
        Object[] objArr = {oasisModule, sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.store.search.adapterdelegates.c.a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "233c302398696d3cdb57f9b285731991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "233c302398696d3cdb57f9b285731991");
        } else {
            com.sankuai.waimai.store.search.adapterdelegates.b a = cVar.a(sVar.getItemViewType());
            if (oasisModule.data != null) {
                a.a((com.sankuai.waimai.store.search.adapterdelegates.b) oasisModule.data, cVar.d.L);
                a.a((com.sankuai.waimai.store.search.adapterdelegates.b) oasisModule.data, (Serializable) sVar, i);
            }
        }
        this.d.a(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewRecycled(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5074ff906917909e6bc6634e6d64d951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5074ff906917909e6bc6634e6d64d951");
            return;
        }
        super.onViewRecycled(sVar);
        com.sankuai.waimai.store.search.adapterdelegates.c cVar = this.e;
        Object[] objArr2 = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.adapterdelegates.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "146d47203aef63a3e39ce6a27e991050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "146d47203aef63a3e39ce6a27e991050");
            return;
        }
        com.sankuai.waimai.store.search.adapterdelegates.b a = cVar.a(sVar.getItemViewType());
        if (a != null) {
            a.a((com.sankuai.waimai.store.search.adapterdelegates.b) sVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.s sVar) {
        OasisModule oasisModule;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f98fed0c94fc65789727cc587fbfb39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f98fed0c94fc65789727cc587fbfb39");
            return;
        }
        ViewGroup.LayoutParams layoutParams = sVar.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            int adapterPosition = sVar.getAdapterPosition();
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (adapterPosition < this.l.size() && (oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) this.l, adapterPosition)) != null) {
                if (oasisModule.layoutInfo == null || oasisModule.layoutInfo.templateStyle != 2) {
                    Set<String> provideWaterfallTemplateId = this.j == null ? null : this.j.provideWaterfallTemplateId();
                    if (provideWaterfallTemplateId == null || !provideWaterfallTemplateId.contains(oasisModule.nativeTemplateId)) {
                        Set<String> provideWaterfallTemplateId2 = this.k != null ? this.k.provideWaterfallTemplateId() : null;
                        if (provideWaterfallTemplateId2 != null && (provideWaterfallTemplateId2.contains(oasisModule.nativeTemplateId) || provideWaterfallTemplateId2.contains(oasisModule.machTemplateId))) {
                            bVar.b = false;
                            return;
                        }
                    } else {
                        bVar.b = false;
                        return;
                    }
                } else {
                    bVar.b = false;
                    return;
                }
            }
            bVar.b = true;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.a
    public final void a(long j, int i) {
        boolean z = false;
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3884327f1f80092b84498c156deb654f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3884327f1f80092b84498c156deb654f");
            return;
        }
        for (OasisModule oasisModule : this.l) {
            if (oasisModule != null) {
                if ((oasisModule.data instanceof CommonMachData) && (((CommonMachData) oasisModule.data).mNativeModel instanceof Poi) && ((Poi) ((CommonMachData) oasisModule.data).mNativeModel).id == j) {
                    ((Poi) ((CommonMachData) oasisModule.data).mNativeModel).subscribe = i;
                    Mach l = ((CommonMachData) oasisModule.data).mItem != null ? ((CommonMachData) oasisModule.data).mItem.l() : null;
                    if (l != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", Long.valueOf(j));
                        hashMap.put("subscribe_status", Integer.valueOf(i));
                        l.sendJsEvent("subscribe_callback", hashMap);
                    }
                }
                if ((oasisModule.data instanceof Poi) && ((Poi) oasisModule.data).id == j) {
                    ((Poi) oasisModule.data).subscribe = i;
                    z = true;
                }
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
    }
}
