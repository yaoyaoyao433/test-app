package com.sankuai.waimai.store.drug.goods.list.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.drug.goods.list.delegate.d;
import com.sankuai.waimai.store.drug.goods.list.delegate.impl.l;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.m;
import com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.SGCachePagerAdapter;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugComposeShopPageAdapter extends SGCachePagerAdapter {
    public static ChangeQuickRedirect a;
    public RestMenuResponse b;
    public final List<RestMenuResponse.b> c;
    public List<com.sankuai.waimai.store.base.b> d;
    private final a e;
    private Context f;
    private d h;
    private FragmentManager i;
    private final b j;

    public DrugComposeShopPageAdapter(Context context, d dVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, dVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe7ec1166220d7ea09610fc34cf2eee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe7ec1166220d7ea09610fc34cf2eee");
            return;
        }
        this.e = new a();
        this.c = new ArrayList();
        this.j = new b();
        this.f = context;
        this.h = dVar;
        this.i = fragmentManager;
        this.d = new ArrayList();
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.SGCachePagerAdapter
    public com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        com.sankuai.waimai.store.base.b a2;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf009e4966a0ef10160e4a092fa05d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf009e4966a0ef10160e4a092fa05d7");
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        int i2 = bVar == null ? -1 : bVar.c;
        if (i2 == 1) {
            a2 = a(bVar);
        } else if (i2 == 5) {
            com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a a3 = a(this.h, null, bVar.d);
            a3.h = false;
            com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b bVar2 = new com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b(this.f);
            Object[] objArr2 = {viewGroup, a3};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "51a2a5d1719b24e9106b869583c96aa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "51a2a5d1719b24e9106b869583c96aa3");
            } else {
                bVar2.b = a3;
                bVar2.bindView(a3.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            }
            a3.a(this.b);
            a2 = bVar2;
        } else {
            a2 = a(bVar);
        }
        if (a2 instanceof m) {
            ((m) a2).a(this.j);
        }
        this.d.add(a2);
        return a2;
    }

    @NotNull
    private com.sankuai.waimai.store.base.b a(RestMenuResponse.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fe6d108818ed4ebc3d2440c4dcbcd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fe6d108818ed4ebc3d2440c4dcbcd2");
        }
        String str = (bVar == null || bVar.f == null) ? "" : bVar.f.scheme;
        DrugPoiTabMRNFragment c = DrugPoiTabMRNFragment.c(str);
        if (bVar != null && bVar.c == 1) {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                c = DrugPoiTabMRNFragment.a("supermarket", "flashbuy-drug-poi", w.g(this.h.d().b) ? "flashbuy-retail-self-poi" : "flashbuy-drug-retail-poi");
                hashMap.put("poiId", String.valueOf(this.h.d().g()));
                hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.h.d().h());
            }
            Uri data = this.h.k().getIntent().getData();
            hashMap.put("poiSchema", data != null ? data.toString() : "");
            if (data != null) {
                this.h.k().getIntent().setData(data.buildUpon().appendQueryParameter("isBundleLoaded", "1").build());
            }
            ((SGCommonRNFragment) c).j = hashMap;
            Bundle bundle = new Bundle();
            bundle.putString("mrn_min_version", "7.71.0");
            c.b(bundle);
        }
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = c;
        drugPoiTabMRNFragment.a(this.h);
        drugPoiTabMRNFragment.o = bVar;
        drugPoiTabMRNFragment.p = l.e(this.b);
        return new com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.d(this.h, this.f, drugPoiTabMRNFragment, this.i, bVar, this.e.a());
    }

    public com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a a(@NonNull d dVar, b.a aVar, boolean z) {
        Object[] objArr = {dVar, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61acb760ff9065615e75ee5e4cff660f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61acb760ff9065615e75ee5e4cff660f") : new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a(dVar, null, z);
    }

    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0da4298cdada5f2bfbf3e1b84bbb54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0da4298cdada5f2bfbf3e1b84bbb54");
            return;
        }
        b bVar = this.j;
        Object[] objArr2 = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "bd0b76a804ab0cad792c4e49044b0b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "bd0b76a804ab0cad792c4e49044b0b5a");
        } else if (kVar != null) {
            bVar.b.add(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.SGCachePagerAdapter
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02579d2cdb01c905fb463c4f2809cd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02579d2cdb01c905fb463c4f2809cd0")).intValue();
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95439953d14f14fecd2877abc5af374", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95439953d14f14fecd2877abc5af374")).intValue();
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.c);
        for (int i = 0; i < a2; i++) {
            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
            if (bVar != null && bVar.c == 5) {
                return i;
            }
        }
        return -1;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e160e3088c95e7140c9b3807f0850ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e160e3088c95e7140c9b3807f0850ba");
        } else if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                com.sankuai.waimai.store.base.b bVar = this.d.get(i);
                if (bVar instanceof com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b) {
                    com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b bVar2 = (com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b) bVar;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "5344b41814dbda7b830e45e8e5b0c4ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "5344b41814dbda7b830e45e8e5b0c4ae");
                        return;
                    } else if (bVar2.b != null) {
                        bVar2.b.a(j);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7eb0691d6fc3f84a4fb4b3cfe8a025", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7eb0691d6fc3f84a4fb4b3cfe8a025")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c);
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be60098a999523d65e249d35cae42d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be60098a999523d65e249d35cae42d1");
        } else if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                com.sankuai.waimai.store.base.b bVar = this.d.get(i);
                if (bVar instanceof com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b) {
                    com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b bVar2 = (com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b) bVar;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "1143be5cb194d2b5477fe7fc28a990d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "1143be5cb194d2b5477fe7fc28a990d0");
                        return;
                    } else if (bVar2.b != null) {
                        bVar2.b.b(j);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
