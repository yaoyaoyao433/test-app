package com.sankuai.waimai.alita.modules;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.modules.m;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.h;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return a.d;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        JSONObject jSONObject;
        double d;
        double d2;
        double d3;
        String str4;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba1a0c5466412e07fd1a9867701c9e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba1a0c5466412e07fd1a9867701c9e5");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a(str + " | FeatureMethodModule | " + str2);
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.d + ": taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        String cityCode = h.b().getCityCode();
        String cityCode2 = h.a().getCityCode();
        WMLocation j = h.j();
        JSONObject jSONObject2 = null;
        double d4 = 0.0d;
        if (j != null) {
            d = j.getLatitude();
            d2 = j.getLongitude();
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("lat", Double.valueOf(d));
                    jSONObject.putOpt("lng", Double.valueOf(d2));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
            d = 0.0d;
            d2 = 0.0d;
        }
        WMLocation i = h.i();
        if (i != null) {
            d4 = i.getLatitude();
            d3 = i.getLongitude();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("lat", Double.valueOf(d4));
                    jSONObject3.putOpt("lng", Double.valueOf(d3));
                } catch (Exception unused3) {
                }
                jSONObject2 = jSONObject3;
            } catch (Exception unused4) {
            }
        } else {
            d3 = 0.0d;
        }
        List<MtBackCityInfo> u = h.u();
        JSONArray a = a(u);
        JSONArray a2 = a(h.s());
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.putOpt("lat", Double.valueOf(d));
            jSONObject4.putOpt("lng", Double.valueOf(d2));
            jSONObject4.putOpt("alat", Double.valueOf(d4));
            jSONObject4.putOpt("alng", Double.valueOf(d3));
            str4 = com.sankuai.waimai.platform.encrypt.c.a().a(jSONObject4.toString());
        } catch (Exception unused5) {
            str4 = "";
        }
        JSONObject jSONObject5 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(cityCode)) {
                jSONObject5.putOpt("cityID", cityCode);
            }
            if (!TextUtils.isEmpty(cityCode2)) {
                jSONObject5.putOpt("actualCityID", cityCode2);
            }
            if (jSONObject != null) {
                jSONObject5.putOpt("location", jSONObject);
            }
            if (jSONObject2 != null) {
                jSONObject5.putOpt("actualLocation", jSONObject2);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject5.putOpt("encryptLocation", str4);
            }
            if (u != null) {
                jSONObject5.putOpt("cityInfoList", a);
            }
            if (a2 != null) {
                jSONObject5.putOpt("actualCityInfoList", a2);
            }
        } catch (Exception unused6) {
        }
        if (jSONObject5.length() > 0) {
            com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.d + ".success: taskKey = " + str + ", callbackId = " + str3 + ", result = " + jSONObject5);
            a(str, mVar, str3, jSONObject5);
            return;
        }
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.d + ".failed: taskKey = " + str + ", callbackId = " + str3);
        a(mVar, str3);
    }

    @Nullable
    private JSONArray a(@Nullable List<MtBackCityInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e79b3e1f1d7fc1f2ae83cf295afcf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e79b3e1f1d7fc1f2ae83cf295afcf2");
        }
        JSONArray jSONArray = null;
        if (list != null && !list.isEmpty()) {
            for (MtBackCityInfo mtBackCityInfo : list) {
                if (mtBackCityInfo != null) {
                    int i = mtBackCityInfo.level;
                    String str = mtBackCityInfo.adcode;
                    String str2 = mtBackCityInfo.id;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("level", Integer.valueOf(i));
                            jSONObject.putOpt("adminCode", str);
                            jSONObject.putOpt("mtCode", str2);
                            jSONArray.put(jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONArray;
    }
}
