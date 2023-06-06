package com.sankuai.waimai.store.poi.list.model;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public boolean b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(PoiVerticalityDataResponse poiVerticalityDataResponse);

        void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.repository.net.b bVar);

        void a(com.sankuai.waimai.store.repository.net.b bVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements a {
        @Override // com.sankuai.waimai.store.poi.list.model.e.a
        public void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        }

        @Override // com.sankuai.waimai.store.poi.list.model.e.a
        public void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.repository.net.b bVar) {
        }

        @Override // com.sankuai.waimai.store.poi.list.model.e.a
        public void a(com.sankuai.waimai.store.repository.net.b bVar) {
        }
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290f8d5e18753238a84f96586d394864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290f8d5e18753238a84f96586d394864");
        } else {
            this.b = false;
        }
    }

    public static /* synthetic */ void a(e eVar, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "04c254d953181f92504847489429bcb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "04c254d953181f92504847489429bcb7");
        } else if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.getPoiList())) {
            for (PoiVerticality poiVerticality : poiVerticalityDataResponse.getPoiList()) {
                if (poiVerticality != null) {
                    poiVerticality.boldingList = poiVerticalityDataResponse.boldingList;
                }
            }
        }
    }

    public final void a(String str, com.sankuai.waimai.store.param.a aVar, boolean z, long j, String str2, String str3, String str4, boolean z2, String str5, String str6, final a aVar2) {
        Object[] objArr = {str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), str2, str3, str4, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str5, str6, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d6e22f9ed97bae63b118fe62b52121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d6e22f9ed97bae63b118fe62b52121");
            return;
        }
        k<PoiVerticalityDataResponse> kVar = new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.model.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                Object[] objArr2 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "defb047fd913594053c7f86bd728dcc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "defb047fd913594053c7f86bd728dcc6");
                    return;
                }
                super.a((AnonymousClass1) poiVerticalityDataResponse);
                e.this.b = false;
                e.a(e.this, poiVerticalityDataResponse);
                aVar2.a(poiVerticalityDataResponse);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ab5a34b4ccbf21c63f24da1203478f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ab5a34b4ccbf21c63f24da1203478f");
                    return;
                }
                super.a(bVar);
                e.this.b = false;
                if (bVar.c == 2 && bVar.e != null) {
                    aVar2.a((PoiVerticalityDataResponse) bVar.e, bVar);
                } else {
                    aVar2.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbfc503ba9da54ff3e4caebaa2a5340e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbfc503ba9da54ff3e4caebaa2a5340e");
                    return;
                }
                super.b();
                e.this.b = false;
            }
        };
        com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(aVar.b, 20, aVar.c, aVar.f, aVar.k, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), j, z, str2, aVar.J, str3, aVar.K, aVar.n, z2 ? 1 : 0, aVar.aj, str4, str5, str6, aVar.o(), aVar.m, kVar);
    }
}
