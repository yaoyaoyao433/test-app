package com.dianping.live.live.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(Context context) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        String str5;
        boolean z5 = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9da1231fd35ca21b7599a59d8f83fd10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9da1231fd35ca21b7599a59d8f83fd10");
        }
        String accessCache = Horn.accessCache("live_fft_optimization_switch");
        HashMap hashMap = new HashMap();
        Map<String, String> a2 = a(accessCache, context);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3cf0293b67ad4f5f569aee2f5e836655", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3cf0293b67ad4f5f569aee2f5e836655")).booleanValue();
        } else {
            z = (a2 == null || (str = a2.get(MarketingModel.TYPE_ENTER_DIALOG)) == null || !str.equals("1")) ? false : true;
        }
        hashMap.put("fftSwitch", Boolean.valueOf(z));
        Object[] objArr3 = {a2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e2353d5bf4493a29317144ef66a90764", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e2353d5bf4493a29317144ef66a90764")).booleanValue();
        } else {
            z2 = a2 == null || (str2 = a2.get("onlyCold")) == null || str2.equals("1");
        }
        hashMap.put("fftOnlyCold", Boolean.valueOf(z2));
        hashMap.put("fftRequestUrl", b(accessCache, context));
        hashMap.put("fftType", c(accessCache, context));
        Object[] objArr4 = {a2};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b58571cc0f0f106b651f0d05c5d61643", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b58571cc0f0f106b651f0d05c5d61643")).booleanValue();
        } else {
            z3 = (a2 == null || (str3 = a2.get("fftSwitchInChannelFirst")) == null || !str3.equals("1")) ? false : true;
        }
        hashMap.put("fftSwitchInChannelFirst", Boolean.valueOf(z3));
        Object[] objArr5 = {a2};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "fc20116fcdd76ded800681bd10bdc505", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "fc20116fcdd76ded800681bd10bdc505")).booleanValue();
        } else {
            z4 = (a2 == null || (str4 = a2.get("fftSwitchInChannelOther")) == null || !str4.equals("1")) ? false : true;
        }
        hashMap.put("fftSwitchInChannelOther", Boolean.valueOf(z4));
        Object[] objArr6 = {a2};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "4dbd4705969c9496da7d2ea69d235d66", RobustBitConfig.DEFAULT_VALUE)) {
            z5 = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "4dbd4705969c9496da7d2ea69d235d66")).booleanValue();
        } else if (a2 == null || (str5 = a2.get("fftSwitchInChannelPlayback")) == null || !str5.equals("1")) {
            z5 = false;
        }
        hashMap.put("fftSwitchInChannelPlayback", Boolean.valueOf(z5));
        hashMap.put("live_list_guide_enabled", Boolean.valueOf(c(accessCache)));
        hashMap.put("live_list_guide_time", Integer.valueOf(b(accessCache)));
        hashMap.put("live_list_guide_wait_time", Integer.valueOf(a(accessCache)));
        return hashMap;
    }

    private static Map<String, String> a(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4580b37cebc9a56e074bfe31a218a3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4580b37cebc9a56e074bfe31a218a3e");
        }
        if (!TextUtils.isEmpty(str) && context != null && context.getApplicationInfo() != null) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("fft_android_switch_new");
                for (int i = 0; i < jSONArray.length(); i++) {
                    Map<String, String> map = (Map) new Gson().fromJson(jSONArray.optString(i), (Class<Object>) new HashMap().getClass());
                    String str2 = map.get(Constants.ModelBeanConstants.KEY_BUNDLE_NAME);
                    if (!TextUtils.isEmpty(str2) && str2.equals(context.getApplicationInfo().packageName)) {
                        return map;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                j.a("MLive_LogangetHornFFTSwitch: Exception");
                j.a(context);
                com.dianping.codelog.b.b(f.class, "getHornFFTSwitch", e.getMessage());
            }
        }
        return new HashMap();
    }

    private static String b(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c000714e96d576cc734a431cbef9d606", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c000714e96d576cc734a431cbef9d606");
        }
        if (TextUtils.isEmpty(str) || context == null || context.getApplicationInfo() == null) {
            return "";
        }
        try {
            return new JSONObject(str).getString("fft_request_url");
        } catch (JSONException e) {
            j.a("MLive_LogangetHornFFTRequestUrl: Exception");
            j.a(context);
            com.dianping.codelog.b.b(f.class, "getHornFFTRequestUrl", e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    private static JSONArray c(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fde8a2bfb69e2a25dd21d045a11944ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fde8a2bfb69e2a25dd21d045a11944ce");
        }
        if (!TextUtils.isEmpty(str) && context != null && context.getApplicationInfo() != null) {
            try {
                return new JSONObject(str).getJSONArray("fft_type");
            } catch (JSONException e) {
                e.printStackTrace();
                j.a("MLive_LogangetHornFFTType: Exception");
                j.a(context);
                com.dianping.codelog.b.b(f.class, "getHornFFTType", e.getMessage());
            }
        }
        return new JSONArray();
    }

    private static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c475989e3024de8f9583b7b6506f200", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c475989e3024de8f9583b7b6506f200")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 5;
        }
        try {
            return new JSONObject(str).getInt("live_list_guide_wait_time");
        } catch (JSONException e) {
            j.a("MLive_LogangetHornGuideWaitTime: Exception");
            com.dianping.codelog.b.b(f.class, "getHornGuideWaitTime", e.getMessage());
            e.printStackTrace();
            return 5;
        }
    }

    private static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f872501746d4479ecb96512e64cec96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f872501746d4479ecb96512e64cec96")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 4;
        }
        try {
            return new JSONObject(str).getInt("live_list_guide_time");
        } catch (JSONException e) {
            j.a("MLive_Loganlive_list_guide_time: Exception");
            com.dianping.codelog.b.b(f.class, "live_list_guide_time", e.getMessage());
            e.printStackTrace();
            return 4;
        }
    }

    private static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48701a4bc263f6a0c698ae924b77b1bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48701a4bc263f6a0c698ae924b77b1bf")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).getBoolean("live_list_guide_enabled");
            } catch (JSONException e) {
                j.a("MLive_Loganlive_list_guide_enabled: Exception");
                com.dianping.codelog.b.b(f.class, "live_list_guide_enabled", e.getMessage());
                e.printStackTrace();
            }
        }
        return true;
    }
}
