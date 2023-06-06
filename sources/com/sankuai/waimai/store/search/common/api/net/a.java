package com.sankuai.waimai.store.search.common.api.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.d;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends d<SCSearchApiService> {
    public static ChangeQuickRedirect a;

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03e0f291ca74ab326854531e24b423a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03e0f291ca74ab326854531e24b423a8");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401cec5e95d1dee9b8fd403af2b2c1b2", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401cec5e95d1dee9b8fd403af2b2c1b2") : new b();
    }

    public final void a(long j, int i, String str, int i2, String str2, int i3, int i4, int i5, String str3, String str4, String str5, long j2, boolean z, String str6, String str7, Integer num, int i6, int i7, String str8, long j3, int i8, int i9, String str9, String str10, String str11, String str12, long j4, j<GlobalPageResponse> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, Integer.valueOf(i2), str2, Integer.valueOf(i3), Integer.valueOf(i4), 20, str3, str4, str5, new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str6, str7, num, Integer.valueOf(i6), 0, str8, new Long(j3), Integer.valueOf(i8), Integer.valueOf(i9), str9, str10, str11, str12, new Long(j4), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc4da2d27a5c4ba3d405ed11a898321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc4da2d27a5c4ba3d405ed11a898321");
        } else {
            a(jVar, ((SCSearchApiService) this.d).searchGlobalPage(j, i, str, i2, str2, i3, i4, 20, str3, str4, str5, j2, z, str6, str7, num, i6, 0, str8, j3, i8, i9, str10, str9, str11, str12, j4));
        }
    }

    public final void a(int i, String str, long j, int i2, int i3, j<SGSearchFilterEntity> jVar) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j), Integer.valueOf(i2), Integer.valueOf(i3), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3473931a95e258759330a1f91d2a8075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3473931a95e258759330a1f91d2a8075");
        } else {
            a(jVar, ((SCSearchApiService) this.d).getFilterConditionV2(i, str, j, i2, i3));
        }
    }

    public final void a(long j, int i, int i2, String str, int i3, int i4, int i5, int i6, j<com.sankuai.waimai.store.search.model.j> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), 20, 0, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4486e1ed4adfea841e09394eb871c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4486e1ed4adfea841e09394eb871c3");
        } else {
            a(jVar, ((SCSearchApiService) this.d).searchGlobalNonDelivery(j, i, i2, str, i3, i4, 20, 0));
        }
    }

    public final void a(long j, int i, j<PoiSubscribeResponse> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56656e2b9b79e63e5ee3bd61b3e2c611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56656e2b9b79e63e5ee3bd61b3e2c611");
        } else {
            a(jVar, ((SCSearchApiService) this.d).subscribePoi(j, i));
        }
    }
}
