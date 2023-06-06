package com.sankuai.waimai.mmp.modules.api;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.addapter.location.IOpenLocation;
import com.meituan.msi.addapter.location.OpenLocationParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.utils.a;
import com.sankuai.waimai.foundation.router.interfaces.c;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMSIOpenLocationApi extends IOpenLocation {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.location.IOpenLocation
    public final void a(MsiCustomContext msiCustomContext, OpenLocationParam openLocationParam, i iVar) {
        Object[] objArr = {msiCustomContext, openLocationParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00764c3cd8521cf52539597d35c8a32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00764c3cd8521cf52539597d35c8a32f");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.PRIVACY.KEY_LATITUDE, (int) (openLocationParam.latitude * 1000000.0d));
        bundle.putInt(Constants.PRIVACY.KEY_LONGITUDE, (int) (openLocationParam.longitude * 1000000.0d));
        if (!TextUtils.isEmpty(openLocationParam.name)) {
            bundle.putString("poiName", openLocationParam.name);
        }
        if (!TextUtils.isEmpty(openLocationParam.address)) {
            bundle.putString("poiAddress", openLocationParam.address);
        }
        double[] e = g.e();
        if (e != null && e.length == 2) {
            bundle.putString("distance", String.format(Locale.CHINA, "%.2fkm", Float.valueOf(a.a(new com.sankuai.waimai.foundation.location.model.a(e[0], e[1]), new com.sankuai.waimai.foundation.location.model.a(openLocationParam.latitude, openLocationParam.longitude)) / 1000.0f)));
        }
        Activity activity = msiCustomContext.getActivity();
        if (activity == null) {
            iVar.a(500, "activity is null");
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(activity, c.s, bundle);
        iVar.a(null);
    }
}
