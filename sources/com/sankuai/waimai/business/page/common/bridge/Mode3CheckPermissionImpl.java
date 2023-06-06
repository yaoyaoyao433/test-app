package com.sankuai.waimai.business.page.common.bridge;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.platform.utils.Mode3CheckPermissionI;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Mode3CheckPermissionImpl implements c, Mode3CheckPermissionI {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.utils.Mode3CheckPermissionI
    public void openLocationPermission(Activity activity, d dVar) {
        Object[] objArr = {activity, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9f658bb513e36cd8a9d6744b6d70b0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9f658bb513e36cd8a9d6744b6d70b0e");
        } else {
            com.sankuai.waimai.business.page.common.util.d.a(activity, dVar);
        }
    }

    @Override // com.sankuai.waimai.platform.utils.Mode3CheckPermissionI
    public boolean isLocateFailed(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e756ee3a1f08795ebfdf634d4b43c91", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e756ee3a1f08795ebfdf634d4b43c91")).booleanValue() : com.sankuai.waimai.business.page.common.util.d.a(wMLocation);
    }

    @Override // com.sankuai.waimai.platform.utils.Mode3CheckPermissionI
    public void startLocateScheme(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9996cf0371fa716e834bb01b1d9245f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9996cf0371fa716e834bb01b1d9245f");
        } else {
            com.sankuai.waimai.business.page.common.util.d.a(activity);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94238b9da5d2bc6d20b7c8e6f5c9e5a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94238b9da5d2bc6d20b7c8e6f5c9e5a6");
        } else if (!com.sankuai.waimai.platform.model.c.a().c() || wmAddress == null || wmAddress.getMeitaunCity() == null || TextUtils.isEmpty(wmAddress.getMeitaunCity().getCityCode())) {
        } else {
            com.sankuai.waimai.platform.model.c.a().a(0);
        }
    }
}
