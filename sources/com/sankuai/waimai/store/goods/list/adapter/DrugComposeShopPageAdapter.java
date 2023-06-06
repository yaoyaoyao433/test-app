package com.sankuai.waimai.store.goods.list.adapter;

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
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
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
    public RecyclerView.k e;
    private final a f;
    private Context g;
    private com.sankuai.waimai.store.goods.list.delegate.e h;
    private FragmentManager m;

    public DrugComposeShopPageAdapter(Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, eVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32cb229e2dea019cfc0a8bff37dcd6c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32cb229e2dea019cfc0a8bff37dcd6c7");
            return;
        }
        this.f = new a();
        this.c = new ArrayList();
        this.g = context;
        this.h = eVar;
        this.m = fragmentManager;
        this.d = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d dVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053c7af692e722c7a856e3bca61c17cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053c7af692e722c7a856e3bca61c17cb");
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        int i2 = bVar == null ? -1 : bVar.c;
        if (i2 == 1) {
            if (bVar.f == null || TextUtils.isEmpty(bVar.f.scheme)) {
                com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d a2 = a();
                a2.createView(viewGroup);
                RestMenuResponse restMenuResponse = this.b;
                boolean z = bVar.d;
                Object[] objArr2 = {restMenuResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.b;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "78214430911e957655c541fb1d609ca5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "78214430911e957655c541fb1d609ca5");
                } else if (!z || restMenuResponse == null || a2.b(restMenuResponse)) {
                    a2.e();
                } else {
                    if (a2.h != null) {
                        a2.h.e();
                    }
                    a2.a(restMenuResponse);
                    a2.d.a();
                }
                dVar = a2;
            }
            dVar = a(bVar);
        } else {
            if (i2 == 5) {
                com.sankuai.waimai.store.goods.list.templet.newmarket.b a3 = a(this.h, null, bVar.d);
                a3.h = false;
                com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b bVar2 = new com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b(this.g);
                Object[] objArr3 = {viewGroup, a3};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b.a;
                if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "c69810f71738cf98d0fe27ba71a3f3c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "c69810f71738cf98d0fe27ba71a3f3c4");
                } else {
                    bVar2.b = a3;
                    bVar2.bindView(a3.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                a3.a(this.b);
                dVar = bVar2;
            }
            dVar = a(bVar);
        }
        this.d.add(dVar);
        return dVar;
    }

    @NotNull
    private com.sankuai.waimai.store.base.b a(RestMenuResponse.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0807625e36f43abf9393436c13e4c72", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0807625e36f43abf9393436c13e4c72");
        }
        DrugPoiTabMRNFragment c = DrugPoiTabMRNFragment.c((bVar == null || bVar.f == null) ? "" : bVar.f.scheme);
        if (bVar != null && bVar.c == 1) {
            HashMap hashMap = new HashMap();
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
        c.a(this.h);
        c.o = bVar;
        return new com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.e(this.h, this.g, c, this.m, bVar, this.f.a());
    }

    public com.sankuai.waimai.store.goods.list.templet.newmarket.b a(@NonNull com.sankuai.waimai.store.goods.list.delegate.e eVar, a.InterfaceC1266a interfaceC1266a, boolean z) {
        Object[] objArr = {eVar, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd81f24c4a62f7f1b2087593ca53e813", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd81f24c4a62f7f1b2087593ca53e813") : new com.sankuai.waimai.store.goods.list.templet.newmarket.b(eVar, null, z);
    }

    public com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c017431c1c27ed9595e363af8f07d1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c017431c1c27ed9595e363af8f07d1") : new com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d(this.h, new a.InterfaceC1266a() { // from class: com.sankuai.waimai.store.goods.list.adapter.DrugComposeShopPageAdapter.1
            @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
            public final void a(boolean z) {
            }

            @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
            public final void b(boolean z) {
            }
        });
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final void a(com.sankuai.waimai.store.base.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86eb705f842dceab513663c80d6d45de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86eb705f842dceab513663c80d6d45de");
        } else if (this.e != null && (bVar instanceof f)) {
            ((f) bVar).a(this.e);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8d9054576b1b2cec351736c1d702531", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8d9054576b1b2cec351736c1d702531")).intValue();
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff59f1b7fc674137b246479d3e474d9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff59f1b7fc674137b246479d3e474d9b")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908e047223cec101324ba6c37bd65445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908e047223cec101324ba6c37bd65445");
        } else if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                com.sankuai.waimai.store.base.b bVar = this.d.get(i);
                if (bVar instanceof com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b) {
                    com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b bVar2 = (com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b) bVar;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "d55821c7f3cdbcb4e943f9fa06ffebaa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "d55821c7f3cdbcb4e943f9fa06ffebaa");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c057785964e005725a83756a472c989", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c057785964e005725a83756a472c989")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c);
    }
}
