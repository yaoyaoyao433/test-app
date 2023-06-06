package com.sankuai.waimai.platform.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.platform.domain.core.location.CityInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static CityInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8364c00c7c3a6942ef07eeb5da3f7d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CityInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8364c00c7c3a6942ef07eeb5da3f7d5");
        }
        CityInfo cityInfo = new CityInfo();
        List<MtBackCityInfo> u = com.sankuai.waimai.foundation.location.v2.h.u();
        List<MtBackCityInfo> s = com.sankuai.waimai.foundation.location.v2.h.s();
        if (u != null) {
            try {
                if (!u.isEmpty()) {
                    for (MtBackCityInfo mtBackCityInfo : u) {
                        if (mtBackCityInfo.level == 2) {
                            cityInfo.selectSecondCityId = Long.parseLong(mtBackCityInfo.id);
                        } else if (mtBackCityInfo.level == 3) {
                            cityInfo.selectThirdCityId = Long.parseLong(mtBackCityInfo.id);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (s != null && !s.isEmpty()) {
            for (MtBackCityInfo mtBackCityInfo2 : s) {
                if (mtBackCityInfo2.level == 2) {
                    cityInfo.actualSecondCityId = Long.parseLong(mtBackCityInfo2.id);
                } else if (mtBackCityInfo2.level == 3) {
                    cityInfo.actualThirdCityId = Long.parseLong(mtBackCityInfo2.id);
                }
            }
        }
        return cityInfo;
    }
}
