package com.sankuai.waimai.store.base.net.drug;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.order.prescription.model.PharmacistStatus;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.net.d<DrugApiService> {
    public static ChangeQuickRedirect a;

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "635b5d095fd3e74559140af988c022db", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "635b5d095fd3e74559140af988c022db");
        }
        a aVar = (a) com.sankuai.waimai.store.base.net.c.a(obj, a.class);
        if (aVar == null) {
            a aVar2 = new a();
            com.sankuai.waimai.store.base.net.c.a(obj, aVar2);
            return aVar2;
        }
        return aVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1591f7ba36541bde24c34a9aa132a73", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1591f7ba36541bde24c34a9aa132a73") : new d();
    }

    public final void a(Map<String, String> map, j<GoodDetailResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5783379d7f2290d6286b6fe5642e74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5783379d7f2290d6286b6fe5642e74d");
        } else {
            a(jVar, ((DrugApiService) this.d).getDrugDetail(map));
        }
    }

    public final void a(long j, int i, long j2, String str, String str2, String str3, String str4, long j3, boolean z, String str5, String str6, String str7, int i2, int i3, int i4, int i5, String str8, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {new Long(j), 20, new Long(j2), str, str2, str3, str4, 0L, (byte) 1, null, str6, null, 0, 0, 0, 0, str8, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826f66d44da28c3652f7bfacb369018e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826f66d44da28c3652f7bfacb369018e");
        } else {
            a(jVar, ((DrugApiService) this.d).getDrugHomeFirstVision(j2, str, j, 20, j2, 0L, str2, str3, str4, 0, null, str6, null, 0, 0, 0, 0, str8, true));
        }
    }

    public final void a(long j, String str, long j2, int i, j<PharmacistStatus> jVar) {
        long j3 = j;
        Object[] objArr = {new Long(j3), str, new Long(j2), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806a75997667efa0854c36cfd3b53def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806a75997667efa0854c36cfd3b53def");
            return;
        }
        DrugApiService drugApiService = (DrugApiService) this.d;
        if (i <= 0) {
            j3 = 0;
        }
        a(jVar, drugApiService.getPrescriptionStatus(j3, str, j2, i));
    }
}
