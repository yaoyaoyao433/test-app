package com.sankuai.waimai.platform.domain.manager.location.locatesdk;

import android.content.Context;
import android.util.Pair;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends a {
    public static ChangeQuickRedirect i;

    public f(Context context, com.sankuai.waimai.foundation.location.c cVar, com.sankuai.waimai.foundation.location.d dVar, MtLocationConfig mtLocationConfig) {
        super(context, cVar, dVar);
        Object[] objArr = {context, cVar, dVar, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f5cfc7bc3a57cbfae497219755a7837", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f5cfc7bc3a57cbfae497219755a7837");
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a25664f515f5e7f101c02781ff4c873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a25664f515f5e7f101c02781ff4c873");
        } else if ((Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, "Locate.once", kVar.b) > 0 || Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, kVar.b) > 0) && com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN)) {
            if (this.d != null) {
                this.d.a(kVar);
            }
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f43aaa4142be03c5f4f10df900e2bf5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f43aaa4142be03c5f4f10df900e2bf5");
                return;
            }
            WMLocation wMLocation = new WMLocation(LocateSDK.MT);
            LocationResultCode locationResultCode = new LocationResultCode();
            wMLocation.setLocationSdk(LocateSDK.MT);
            wMLocation.setLocationResultCode(locationResultCode);
            wMLocation.setLocationSnifferReporter(c());
            locationResultCode.a = 1200;
            WMLocation p = g.a().p();
            if (p == null || p.getLongitude() <= 0.0d || p.getLatitude() <= 0.0d) {
                g.a();
                wMLocation.setLongitude(116.176188d);
                g.a();
                wMLocation.setLatitude(40.240957d);
            } else {
                wMLocation.setLongitude(p.getLongitude());
                wMLocation.setLatitude(p.getLatitude());
            }
            wMLocation.hasLocatedPermission = false;
            if (this.b != null) {
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("PermissionCheckChain", "locateFinished", Pair.create("Success", "setDefaultLocation:" + wMLocation.getLatitude() + CommonConstant.Symbol.COMMA + wMLocation.getLongitude()));
                this.b.a(wMLocation);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c3fccc5648f6f65f29dc2773a5945f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c3fccc5648f6f65f29dc2773a5945f");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("PermissionCheckChain", "stopLocate");
        super.a();
    }
}
