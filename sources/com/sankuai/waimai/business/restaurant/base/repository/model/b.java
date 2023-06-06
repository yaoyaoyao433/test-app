package com.sankuai.waimai.business.restaurant.base.repository.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("mt_sec_city_id")
    public String b;
    @SerializedName("mt_thr_city_id")
    public String c;
    @SerializedName("mt_actual_sec_city_id")
    public String d;
    @SerializedName("mt_actual_thr_city_id")
    public String e;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a19896653b5f6277ca6da714e1cefc36", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a19896653b5f6277ca6da714e1cefc36");
        }
        b bVar = new b();
        List<MtBackCityInfo> s = com.sankuai.waimai.foundation.location.v2.h.s();
        if (s != null) {
            for (MtBackCityInfo mtBackCityInfo : s) {
                if (2 == mtBackCityInfo.level) {
                    bVar.d = mtBackCityInfo.id;
                } else if (3 == mtBackCityInfo.level) {
                    bVar.e = mtBackCityInfo.id;
                }
            }
        }
        List<MtBackCityInfo> u = com.sankuai.waimai.foundation.location.v2.h.u();
        if (u != null) {
            for (MtBackCityInfo mtBackCityInfo2 : u) {
                if (2 == mtBackCityInfo2.level) {
                    bVar.b = mtBackCityInfo2.id;
                } else if (3 == mtBackCityInfo2.level) {
                    bVar.c = mtBackCityInfo2.id;
                }
            }
        }
        return bVar;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0a366a1884493b4a39cdc2da93d287", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0a366a1884493b4a39cdc2da93d287") : com.sankuai.waimai.foundation.location.v2.d.a().toJson(this);
    }
}
