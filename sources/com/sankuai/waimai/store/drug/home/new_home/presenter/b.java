package com.sankuai.waimai.store.drug.home.new_home.presenter;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.home.DrugHomePoiIdManager;
import com.sankuai.waimai.store.drug.home.new_home.presenter.a;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC1151a {
    public static ChangeQuickRedirect a;
    a.b b;
    List<a> c;
    private com.sankuai.waimai.store.param.a d;

    public b(@NonNull a.b bVar, @NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6029fba4631f622246b8bd869d40c2ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6029fba4631f622246b8bd869d40c2ef");
            return;
        }
        this.c = new ArrayList();
        this.b = bVar;
        this.d = aVar;
    }

    private void a(@NonNull CategoryInfo categoryInfo, @NonNull j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {categoryInfo, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688eb1de7aa62d4372d81da80193e58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688eb1de7aa62d4372d81da80193e58c");
        } else {
            com.sankuai.waimai.store.drug.base.net.b.a(this.b.c()).a(jVar, 1, false, r.a(categoryInfo.code, 0L), categoryInfo.categoryCodeType, (String) com.sankuai.waimai.store.drug.home.util.b.b(this.d, com.sankuai.waimai.store.drug.home.util.b.e, ""), 0, categoryInfo.rankTraceId, Statistics.getSession(), com.sankuai.waimai.store.drug.home.model.b.a(), 0, 0, "", "", false);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.InterfaceC1151a
    public final void a(@NonNull final CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6879f91157f2a8244407c4bf17c5003c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6879f91157f2a8244407c4bf17c5003c");
            return;
        }
        final a aVar = new a(categoryInfo);
        this.c.add(aVar);
        a(categoryInfo, new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.new_home.presenter.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                Object[] objArr2 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1088f3cab8175135e8f500a52935b927", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1088f3cab8175135e8f500a52935b927");
                } else if (aVar.a) {
                    DrugHomePoiIdManager.a(b.this.b.f(), poiVerticalityDataResponse);
                    b.this.b.a(categoryInfo, poiVerticalityDataResponse);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "749439cd0af082cbb24e54cf039cc74d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "749439cd0af082cbb24e54cf039cc74d");
                } else {
                    b.this.b.a(categoryInfo);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29ae3c1b2bb75456dd73240f79a841aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29ae3c1b2bb75456dd73240f79a841aa");
                } else if (aVar.a) {
                    b.this.b.c(categoryInfo);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "706b4e6308f21e57dca05db4b6ae83d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "706b4e6308f21e57dca05db4b6ae83d8");
                    return;
                }
                aVar.a = false;
                b.this.c.remove(aVar);
            }
        });
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.InterfaceC1151a
    public final void a(@NonNull final CategoryInfo categoryInfo, final long j) {
        Object[] objArr = {categoryInfo, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3897188aec3a83ee8a5c5cea09abdf4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3897188aec3a83ee8a5c5cea09abdf4b");
        } else {
            a(categoryInfo, new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.new_home.presenter.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                    Object[] objArr2 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c56479f1b01174d46a816cc6d396c23f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c56479f1b01174d46a816cc6d396c23f");
                        return;
                    }
                    DrugHomePoiIdManager.a(b.this.b.f(), poiVerticalityDataResponse);
                    b.this.b.a(categoryInfo, poiVerticalityDataResponse, j);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30c5ce318d660a5dc9be6f6c51506d53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30c5ce318d660a5dc9be6f6c51506d53");
                    } else {
                        b.this.b.a(categoryInfo);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1defd8e53491265a2ee8f2c434baa51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1defd8e53491265a2ee8f2c434baa51");
                    } else {
                        b.this.b.a(categoryInfo, j);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.InterfaceC1151a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd92484989ab0d2419fd30760cd81cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd92484989ab0d2419fd30760cd81cda");
        } else if (com.sankuai.waimai.foundation.utils.b.b(this.c)) {
        } else {
            Iterator<a> it = this.c.iterator();
            boolean z = true;
            while (it.hasNext()) {
                a next = it.next();
                if (next.a) {
                    next.a = false;
                }
                if (z && next.b != null) {
                    this.b.b(next.b);
                    z = false;
                }
                it.remove();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public boolean a = true;
        public CategoryInfo b;

        public a(@NonNull CategoryInfo categoryInfo) {
            this.b = categoryInfo;
        }
    }
}
