package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ExpInfo implements Serializable {
    public static final String JUDAS_KEY_DELIVERY = "preview_delivery_abtest";
    public static final String JUDAS_KEY_INSURANCE = "free_insurance_type_name";
    public static final String JUDAS_KEY_VOUCHER = "preview_coupon_abtest";
    public static final String JUDAS_KEY_WEATHER = "abnormal_hints_name";
    public static final int TYPE_ADD_STAPLE_FOOD = 5;
    public static final int TYPE_DELIVERY_FEE = 3;
    public static final int TYPE_DONATE_INSURANCE = 2;
    public static final int TYPE_MAKE_UP_HONGBAO = 6;
    public static final int TYPE_MAKE_UP_VOUCHER = 7;
    public static final int TYPE_UNORMAL_WEATHER = 1;
    public static final int TYPE_USE_CACHE = 12;
    public static final int TYPE_VOUCHER_MERCHANT = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("exp_name")
    public String expName;
    @SerializedName("exp_type")
    public int expType;

    public static Map<Integer, String> convertToMap(List<ExpInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        HashMap hashMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ea11a8127bcff7b6a9a6f4466dda287", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ea11a8127bcff7b6a9a6f4466dda287");
        }
        if (list != null && list.size() > 0) {
            hashMap = new HashMap();
            for (ExpInfo expInfo : list) {
                hashMap.put(Integer.valueOf(expInfo.expType), expInfo.expName);
            }
        }
        return hashMap;
    }

    public static ExpInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "811815be0699e8eb8322974bdcbeed4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExpInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "811815be0699e8eb8322974bdcbeed4a");
        }
        if (jSONObject == null) {
            return null;
        }
        ExpInfo expInfo = new ExpInfo();
        expInfo.expName = jSONObject.optString("exp_name");
        expInfo.expType = jSONObject.optInt("exp_type");
        return expInfo;
    }

    public static List<ExpInfo> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e963fe6d01e5cc971d58c4245868c46c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e963fe6d01e5cc971d58c4245868c46c");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            ExpInfo fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getDeliveryExpName(List<ExpInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4875f95a607418433d641c7fe16fa56f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4875f95a607418433d641c7fe16fa56f");
        }
        Map<Integer, String> convertToMap = convertToMap(list);
        return (convertToMap == null || !convertToMap.containsKey(3)) ? "" : convertToMap.get(3);
    }

    public static String getExpName(List<ExpInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4c7bc05bc0e3c7e805e55e49800ed63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4c7bc05bc0e3c7e805e55e49800ed63");
        }
        Map<Integer, String> convertToMap = convertToMap(list);
        return (convertToMap == null || !convertToMap.containsKey(Integer.valueOf(i))) ? "" : convertToMap.get(Integer.valueOf(i));
    }

    public static boolean isUseCache(List<ExpInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4c757c49d3485b831154a2fcdc25175", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4c757c49d3485b831154a2fcdc25175")).booleanValue();
        }
        Map<Integer, String> convertToMap = convertToMap(list);
        if (convertToMap == null || !convertToMap.containsKey(12)) {
            return false;
        }
        return "C".equals(convertToMap.get(12));
    }
}
