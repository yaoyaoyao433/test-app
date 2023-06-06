package com.sankuai.waimai.drug;

import android.support.annotation.NonNull;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    @NonNull
    public static Pair<Boolean, Pair<Double, Double>> a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d18f604aaccaddf096d102021b0fa9dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d18f604aaccaddf096d102021b0fa9dd");
        }
        WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
        double latitude = i == null ? 0.0d : i.getLatitude();
        double longitude = i == null ? 0.0d : i.getLongitude();
        if (latitude > 0.0d && longitude > 0.0d && com.sankuai.waimai.foundation.location.v2.g.a().j() != null) {
            z = true;
        }
        return Pair.create(Boolean.valueOf(z), Pair.create(Double.valueOf(latitude), Double.valueOf(longitude)));
    }
}
