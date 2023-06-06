package com.sankuai.waimai.platform.capacity.city;

import android.text.TextUtils;
import com.meituan.msi.api.extension.wm.common.GetGBCityInfoResponse;
import com.meituan.msi.api.extension.wm.common.GetWMCityInfoResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;

    public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        this();
    }

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.city.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1039a {
        private static final a a = new a(null);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d67bb83381e771a7f94952db3250f26c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d67bb83381e771a7f94952db3250f26c") : C1039a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.city.a$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements b<Integer> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ b b;
        public final /* synthetic */ a c;

        @Override // com.sankuai.waimai.platform.capacity.city.b
        public final /* synthetic */ void a(Integer num) {
            Integer num2 = num;
            Object[] objArr = {num2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9346f7cb55567d8357df0dabc714aa58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9346f7cb55567d8357df0dabc714aa58");
            } else {
                this.b.a(this.c.a(num2.intValue() > 0 ? this.c.b : "", num2.intValue() > 0 ? this.c.b : ""));
            }
        }
    }

    public JSONObject a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf9c748372ebd73ed20ce0614b4e846", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf9c748372ebd73ed20ce0614b4e846");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("city_info", new JSONArray(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("actual_city_info", new JSONArray(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public JSONObject b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a0608e5168f52ec85aefc97af8f584", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a0608e5168f52ec85aefc97af8f584");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("city_info", new JSONArray(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("actual_city_info", new JSONArray(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public GetWMCityInfoResponse a(List<MtBackCityInfo> list, List<MtBackCityInfo> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec00269c252da047182d5222e6029e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetWMCityInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec00269c252da047182d5222e6029e7");
        }
        GetWMCityInfoResponse getWMCityInfoResponse = new GetWMCityInfoResponse();
        getWMCityInfoResponse.actual_city_info = new ArrayList();
        getWMCityInfoResponse.city_info = new ArrayList();
        if (list != null) {
            for (MtBackCityInfo mtBackCityInfo : list) {
                GetWMCityInfoResponse.ActualCityInfo actualCityInfo = new GetWMCityInfoResponse.ActualCityInfo();
                actualCityInfo.id = mtBackCityInfo.id;
                actualCityInfo.name = mtBackCityInfo.name;
                actualCityInfo.adcode = mtBackCityInfo.adcode;
                actualCityInfo.level = mtBackCityInfo.level;
                getWMCityInfoResponse.actual_city_info.add(actualCityInfo);
            }
        }
        if (list2 != null) {
            for (MtBackCityInfo mtBackCityInfo2 : list2) {
                GetWMCityInfoResponse.CityInfo cityInfo = new GetWMCityInfoResponse.CityInfo();
                cityInfo.id = mtBackCityInfo2.id;
                cityInfo.name = mtBackCityInfo2.name;
                cityInfo.adcode = mtBackCityInfo2.adcode;
                cityInfo.level = mtBackCityInfo2.level;
                getWMCityInfoResponse.city_info.add(cityInfo);
            }
        }
        return getWMCityInfoResponse;
    }

    public GetGBCityInfoResponse b(List<AdminInfo> list, List<AdminInfo> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e94c4da953f0a06238a4e5593a881d", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetGBCityInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e94c4da953f0a06238a4e5593a881d");
        }
        GetGBCityInfoResponse getGBCityInfoResponse = new GetGBCityInfoResponse();
        getGBCityInfoResponse.actual_city_info = new ArrayList();
        getGBCityInfoResponse.city_info = new ArrayList();
        if (list != null) {
            for (AdminInfo adminInfo : list) {
                GetGBCityInfoResponse.ActualCityInfo actualCityInfo = new GetGBCityInfoResponse.ActualCityInfo();
                actualCityInfo.admin_code = adminInfo.adminCode;
                StringBuilder sb = new StringBuilder();
                sb.append(adminInfo.adminLevel);
                actualCityInfo.admin_level = sb.toString();
                actualCityInfo.name = adminInfo.name;
                actualCityInfo.level_desc = adminInfo.levelDesc;
                getGBCityInfoResponse.actual_city_info.add(actualCityInfo);
            }
        }
        if (list2 != null) {
            for (AdminInfo adminInfo2 : list2) {
                GetGBCityInfoResponse.CityInfo cityInfo = new GetGBCityInfoResponse.CityInfo();
                cityInfo.admin_code = adminInfo2.adminCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(adminInfo2.adminLevel);
                cityInfo.admin_level = sb2.toString();
                cityInfo.name = adminInfo2.name;
                cityInfo.level_desc = adminInfo2.levelDesc;
                getGBCityInfoResponse.city_info.add(cityInfo);
            }
        }
        return getGBCityInfoResponse;
    }
}
