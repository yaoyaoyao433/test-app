package com.sankuai.waimai.bussiness.order.confirm.model.ap;

import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("native_id")
    public String b;
    @SerializedName("default_id")
    public String c;
    @SerializedName("template_id")
    public String d;
    @SerializedName("string_data")
    public String e;

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f217abc75314a76a5d93bdcbeb06eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f217abc75314a76a5d93bdcbeb06eb")).booleanValue() : !TextUtils.isEmpty(this.e);
    }

    public static List<Map<String, Object>> a(ApDataWrapper apDataWrapper) {
        a aVar;
        Object[] objArr = {apDataWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c07b4222489e009612cb30ba587e820d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c07b4222489e009612cb30ba587e820d");
        }
        if (apDataWrapper == null) {
            return null;
        }
        b poiCouponGuideData = apDataWrapper.getPoiCouponGuideData();
        if (poiCouponGuideData == null) {
            poiCouponGuideData = apDataWrapper.getPoiCouponPkgDetailData();
        }
        if (poiCouponGuideData != null && poiCouponGuideData.a() && (aVar = (a) new Gson().fromJson(poiCouponGuideData.b, (Class<Object>) a.class)) != null && aVar.c()) {
            try {
                JSONArray optJSONArray = new JSONObject(aVar.e).optJSONArray("products");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("type", Integer.valueOf(optJSONObject.optInt("product_type")));
                            hashMap.put(DMKeys.KEY_SELECTED, Boolean.valueOf(optJSONObject.optBoolean(DMKeys.KEY_SELECTED)));
                            hashMap.put("product_id", optJSONObject.optString("product_id"));
                            hashMap.put("biz_custom_param", optJSONObject.optString("biz_custom_param"));
                            arrayList.add(hashMap);
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String a() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143860d545331891c40c99668ba83955", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143860d545331891c40c99668ba83955");
        }
        String str = "";
        if (c()) {
            try {
                JSONArray optJSONArray = new JSONObject(this.e).optJSONArray("products");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.optJSONObject(i) != null) {
                            if (!TextUtils.isEmpty(str)) {
                                str = str + CommonConstant.Symbol.COMMA;
                            }
                            str = str + optJSONObject.optString("product_id");
                        }
                    }
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return str;
    }

    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59423bc1db863d558e6b76a5ce0e12a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59423bc1db863d558e6b76a5ce0e12a");
        }
        if (TextUtils.isEmpty(this.e)) {
            return null;
        }
        try {
            return a(new JSONObject(this.e));
        } catch (JSONException unused) {
            return null;
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3418693b558ea65e5c924f3e1cf05faf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3418693b558ea65e5c924f3e1cf05faf");
        }
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<Map<String, Object>> a(c cVar) {
        a aVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c324d967dd4d7b8c5963d437c177314e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c324d967dd4d7b8c5963d437c177314e");
        }
        if (cVar == null) {
            return null;
        }
        b bVar = cVar.a;
        if (bVar == null) {
            bVar = cVar.b;
        }
        if (bVar != null && bVar.a() && (aVar = (a) new Gson().fromJson(bVar.b, (Class<Object>) a.class)) != null && aVar.c()) {
            try {
                JSONArray optJSONArray = new JSONObject(aVar.e).optJSONArray("products");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("type", Integer.valueOf(optJSONObject.optInt("product_type")));
                            hashMap.put(DMKeys.KEY_SELECTED, Boolean.valueOf(optJSONObject.optBoolean(DMKeys.KEY_SELECTED)));
                            hashMap.put("product_id", optJSONObject.optString("product_id"));
                            hashMap.put("biz_custom_param", optJSONObject.optString("biz_custom_param"));
                            arrayList.add(hashMap);
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
