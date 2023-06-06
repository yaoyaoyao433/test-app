package com.meituan.android.pay.process;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.HybridInfo;
import com.meituan.android.pay.desk.component.bean.standardcomponent.OtherVerifyType;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.fragment.AdditionVerifyFragment;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.utils.k;
import com.meituan.android.pay.utils.l;
import com.meituan.android.pay.utils.m;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.f;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static boolean b = false;

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d93b87c342ec3499159d004dbaac836", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d93b87c342ec3499159d004dbaac836")).booleanValue() : !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "need_confirm")) && TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "need_confirm"), "1");
    }

    public static boolean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e4fb2dad0dc3bfeb16b4ed99beb705d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e4fb2dad0dc3bfeb16b4ed99beb705d")).booleanValue() : !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "web_url"));
    }

    public static boolean c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a1650d87b91169fbe821ce2cbcc47cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a1650d87b91169fbe821ce2cbcc47cf")).booleanValue() : com.meituan.android.pay.common.payment.utils.c.h(com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type"));
    }

    public static boolean d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74f9ee6f1867fcee7691eb18e26888df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74f9ee6f1867fcee7691eb18e26888df")).booleanValue() : (!com.meituan.android.pay.common.payment.utils.c.e(com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type")) || TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "real_name_auth_url")) || b) ? false : true;
    }

    public static HybridInfo e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ca57a34a366910e67d582fdf55d8ac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ca57a34a366910e67d582fdf55d8ac8");
        }
        if (com.meituan.android.pay.common.payment.utils.b.c(activity).containsKey("hybrid_info")) {
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "hybrid_info");
            try {
                return (HybridInfo) n.a().fromJson(b2, (Class<Object>) HybridInfo.class);
            } catch (JsonSyntaxException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MtProcessUtils_getHybridInfo", new a.c().a("hybridInfo", b2).b);
            }
        }
        return null;
    }

    public static void a(FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29418152fd89a55f096bffb3392018c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29418152fd89a55f096bffb3392018c3");
        } else if (fragmentActivity != null) {
            f(fragmentActivity);
            u.a().e = "meituanpay";
            com.meituan.android.pay.utils.d.a(i, com.meituan.android.pay.common.analyse.a.b, e(fragmentActivity));
            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "launch_url", "/qdbsign/sign");
            f.a(fragmentActivity, (Object) null);
        }
    }

    public static void f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ee8a4d4b09478434ee2895017ea7058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ee8a4d4b09478434ee2895017ea7058");
        } else if (com.meituan.android.pay.common.payment.utils.b.c(activity).containsKey("hybrid_info")) {
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "hybrid_info");
            try {
                JSONObject jSONObject = new JSONObject(b2);
                jSONObject.put("load_already", false);
                com.meituan.android.pay.common.payment.utils.b.a(activity, "hybrid_info", jSONObject.toString());
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MtProcessUtils_putLoadAlreadyFlag", new a.c().a("hybridInfo", b2).b);
            }
        }
    }

    private static void g(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db649113686e60369ab05946848fad87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db649113686e60369ab05946848fad87");
        } else if (com.meituan.android.pay.common.payment.utils.b.c(activity).containsKey("hybrid_info")) {
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "hybrid_info");
            try {
                JSONObject jSONObject = new JSONObject(b2);
                jSONObject.put("load_already", true);
                com.meituan.android.pay.common.payment.utils.b.a(activity, "hybrid_info", jSONObject.toString());
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MtProcessUtils_putLoadAlreadyFlag", new a.c().a("hybridInfo", b2).b);
            }
        }
    }

    public static c a(FragmentActivity fragmentActivity) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4 = true;
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b3369dcaa8545c7cf949e5e043b92b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b3369dcaa8545c7cf949e5e043b92b5");
        }
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bd8472accb7ae0082d2fb1be532f5f82", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bd8472accb7ae0082d2fb1be532f5f82")).booleanValue();
        } else {
            z = c(fragmentActivity) || d(fragmentActivity) || b((Activity) fragmentActivity) || a((Activity) fragmentActivity);
        }
        if (z) {
            Object[] objArr3 = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b9bbef338a957cb368c8bde20f711986", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b9bbef338a957cb368c8bde20f711986");
            } else {
                str = "";
                if (b((Activity) fragmentActivity)) {
                    str = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "web_url");
                } else if (c(fragmentActivity)) {
                    str = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url");
                } else if (d(fragmentActivity)) {
                    str = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "real_name_auth_url");
                } else if (a((Activity) fragmentActivity)) {
                    com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                    str = (cVar == null || TextUtils.isEmpty(cVar.l)) ? "https://npay.meituan.com/pay-week/index.html" : cVar.l;
                }
            }
            return new com.meituan.android.pay.process.web.a(fragmentActivity, str);
        }
        Object[] objArr4 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "fed47fe612eade6e56029e85fc5c5f69", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "fed47fe612eade6e56029e85fc5c5f69")).booleanValue();
        } else {
            Object[] objArr5 = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "d939541851ec72a699f5882eebe54733", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "d939541851ec72a699f5882eebe54733")).booleanValue();
            } else if (TextUtils.equals("/qdbsign/sign", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url"))) {
                HybridInfo e = e(fragmentActivity);
                z2 = com.meituan.android.pay.utils.d.a(e) && !e.isLoadAlready();
                g(fragmentActivity);
            } else {
                z2 = false;
            }
            if (!z2) {
                Object[] objArr6 = {fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "41de432f927be6a7d1216eba5baac3eb", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "41de432f927be6a7d1216eba5baac3eb")).booleanValue();
                } else {
                    z3 = com.meituan.android.pay.desk.component.data.b.e(fragmentActivity) && !com.meituan.android.pay.desk.component.data.b.d(fragmentActivity);
                    com.meituan.android.pay.desk.component.data.b.c(fragmentActivity);
                }
                if (!z3) {
                    z4 = false;
                }
            }
        }
        if (z4) {
            return new com.meituan.android.pay.process.hybrid.b(fragmentActivity, e(fragmentActivity));
        }
        return new com.meituan.android.pay.process.ntv.a(fragmentActivity);
    }

    public static void b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47edc7439da270ef1a10afad0aa2df57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47edc7439da270ef1a10afad0aa2df57");
            return;
        }
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        f.a((Activity) fragmentActivity).a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81a9f95255d1570fa2258754bd298361", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81a9f95255d1570fa2258754bd298361") : new com.meituan.android.pay.process.ntv.a(fragmentActivity));
        f.a((Activity) fragmentActivity).a();
    }

    public static void a(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3c6022c006062039fc259f9000e6a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3c6022c006062039fc259f9000e6a62");
            return;
        }
        Object[] objArr2 = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        f.a((Activity) fragmentActivity).a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1f47df7884761429929e35d555eccb6d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1f47df7884761429929e35d555eccb6d") : new com.meituan.android.pay.process.web.a(fragmentActivity, str));
        f.a((Activity) fragmentActivity).a();
    }

    public static void a() {
        b = false;
    }

    public static void a(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "655d153c940cd8056b0d3ad70e70f63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "655d153c940cd8056b0d3ad70e70f63a");
            return;
        }
        if (com.meituan.android.pay.desk.component.data.b.e(fragmentActivity)) {
            com.meituan.android.paycommon.lib.utils.h.b(fragmentActivity);
        }
        f.b(fragmentActivity, obj);
    }

    public static void a(FragmentActivity fragmentActivity, JSONObject jSONObject, String str) {
        Object[] objArr = {fragmentActivity, jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3ec3e1c12c46c391ccafe046789467a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3ec3e1c12c46c391ccafe046789467a");
            return;
        }
        int optInt = jSONObject.optInt(OtherVerifyTypeConstants.REQUEST_CODE);
        JSONObject optJSONObject = jSONObject.optJSONObject("request_data");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pay_params");
        HashMap<String, String> a2 = com.meituan.android.pay.desk.component.data.b.a(fragmentActivity, optJSONObject2);
        com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "scene_incoming_native_business", str);
        try {
            if (optInt == 12000) {
                f.a(fragmentActivity, (BankInfo) n.a().fromJson(optJSONObject.optString("data"), (Class<Object>) BankInfo.class));
            } else if (optInt == 12010) {
                String optString = jSONObject.optString("web_url");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "web_url", optString);
                com.meituan.android.pay.analyse.a.a(fragmentActivity, "MtProcessUtils", jSONObject.optJSONObject("report_params"));
                f.a(fragmentActivity, (Object) null);
            } else if (optInt == 12020) {
                String optString2 = jSONObject.optString("hybrid_info");
                JSONObject jSONObject2 = jSONObject.getJSONObject("hybrid_info");
                if (TextUtils.isEmpty(optString2) || jSONObject2 == null) {
                    return;
                }
                String optString3 = jSONObject2.optString("launch_url");
                if (TextUtils.isEmpty(optString3)) {
                    return;
                }
                int optInt2 = jSONObject2.optInt("entry_code");
                Object[] objArr2 = {fragmentActivity, Integer.valueOf(optInt2), str};
                ChangeQuickRedirect changeQuickRedirect2 = m.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b80638c0dc7e89902e2d8316eba60e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b80638c0dc7e89902e2d8316eba60e0");
                } else {
                    l.a("c_8l4w761d", "b_pay_thyfohxa_mc", null, new a.c().a("from", Integer.valueOf(optInt2)).a(KnbConstants.PARAMS_SCENE, str).b, m.a(fragmentActivity));
                }
                com.meituan.android.pay.analyse.a.a(fragmentActivity, "MtProcessUtils", jSONObject.optJSONObject("report_params"));
                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "launch_url", optString3);
                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "hybrid_info", optString2);
                f.a(fragmentActivity, (Object) null);
            } else if (optInt == 12030) {
                AdditionVerifyFragment.a(fragmentActivity, (OtherVerifyType) n.a().fromJson(jSONObject.optString("other_verify_type"), (Class<Object>) OtherVerifyType.class), optJSONObject2.optString("submit_url"), a2, null, jSONObject.optJSONObject("other_verify_type").getInt("password_error_count"));
            } else if (optInt == 12040) {
                Object[] objArr3 = {fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect3 = m.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a6a835ac69201faacac931786f5e2097", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a6a835ac69201faacac931786f5e2097");
                } else {
                    l.a("b_pay_hybrid_mt_get_result_sc", (Map<String, Object>) null, m.a(fragmentActivity));
                    l.a("hybrid_mt_get_result", (Map<String, Object>) null, (List<Float>) null, m.a(fragmentActivity));
                }
                int optInt3 = optJSONObject.optInt(Constant.KEY_RESULT_CODE);
                JSONObject jSONObject3 = new JSONObject(optJSONObject.optString("resultData"));
                com.meituan.android.pay.desk.component.data.b.a(fragmentActivity, jSONObject3.optJSONObject("pay_params"));
                boolean optBoolean = jSONObject3.optBoolean("is_degrade");
                if (optInt3 == -1) {
                    Object[] objArr4 = {fragmentActivity};
                    ChangeQuickRedirect changeQuickRedirect4 = m.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a92ccbb8af16ccb2bb43115a1a46ca07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a92ccbb8af16ccb2bb43115a1a46ca07");
                    } else {
                        l.a("b_pay_hybrid_mt_pay_succ_sc", (Map<String, Object>) null, m.a(fragmentActivity));
                        l.a("hybrid_mt_pay_succ", (Map<String, Object>) null, (List<Float>) null, m.a(fragmentActivity));
                    }
                    if (jSONObject3.optJSONObject("data") != null) {
                        BankInfo bankInfo = (BankInfo) n.a().fromJson(jSONObject3.optString("data"), (Class<Object>) BankInfo.class);
                        if (com.meituan.android.paybase.utils.e.a()) {
                            f.a(fragmentActivity, bankInfo);
                            return;
                        } else {
                            fragmentActivity.runOnUiThread(h.a(fragmentActivity, bankInfo));
                            return;
                        }
                    }
                    PayActivity.a(fragmentActivity);
                } else if (!optBoolean) {
                    if (jSONObject3.optJSONObject("error") != null) {
                        s.a((Activity) fragmentActivity, (Exception) ((PayException) n.a().fromJson(jSONObject3.optString("error"), (Class<Object>) PayException.class)), 3);
                        return;
                    }
                    Object[] objArr5 = {fragmentActivity, null, 0};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ac87041acbb77fed9dc30335a96cdeab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ac87041acbb77fed9dc30335a96cdeab");
                        return;
                    }
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("action", "downgrade_to_business");
                    PayActivity.a(fragmentActivity, (String) null, (int) PayErrorCode.HALFPAGE_CASHIER_CANCEL, String.valueOf(jsonObject));
                } else {
                    Object[] objArr6 = {fragmentActivity};
                    ChangeQuickRedirect changeQuickRedirect6 = m.a;
                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "69151e028dbe4398cfa06b478af4bfac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "69151e028dbe4398cfa06b478af4bfac");
                    } else {
                        l.a("b_pay_hybrid_mt_downgrade_reason_sc", (Map<String, Object>) null, m.a(fragmentActivity));
                        l.a("hybrid_mt_downgrade_reason", (Map<String, Object>) null, (List<Float>) null, m.a(fragmentActivity));
                    }
                    Object[] objArr7 = {fragmentActivity, null, 0};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "27ba5766a6e5ee467e8e9d3969c54c4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "27ba5766a6e5ee467e8e9d3969c54c4f");
                        return;
                    }
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("action", "downgrade_standard_cashier");
                    PayActivity.a(fragmentActivity, (String) null, (int) PayErrorCode.HALFPAGE_CASHIER_CANCEL, String.valueOf(jsonObject2));
                }
            } else {
                a((Activity) fragmentActivity, (Object) null);
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridMeituanPayJsHandler_exec", (Map<String, Object>) null);
            a((Activity) fragmentActivity, (Object) null);
        }
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, BankInfo bankInfo, boolean z) {
        Object[] objArr = {fragmentActivity, bankInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d48f7b67451a74c98faa04ad50b57668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d48f7b67451a74c98faa04ad50b57668");
        } else {
            f.a(fragmentActivity, bankInfo);
        }
    }

    private static void a(Activity activity, Object obj) {
        Object[] objArr = {activity, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bed1c9642b075d0e27028d9a09296a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bed1c9642b075d0e27028d9a09296a5");
        } else if (activity != null && com.meituan.android.pay.desk.component.data.a.a(activity)) {
            PayActivity.b(activity, (String) null);
        } else if (!com.meituan.android.pay.desk.component.data.b.e(activity) || k.a().b == null) {
        } else {
            k.a().b.callBackData(null);
        }
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, BankInfo bankInfo) {
        Object[] objArr = {fragmentActivity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78f341a5a73b5c3775663b126d945466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78f341a5a73b5c3775663b126d945466");
            return;
        }
        Object[] objArr2 = {fragmentActivity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        com.meituan.android.paybase.utils.f.a(fragmentActivity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5838eb024a44278839a718205c99b10a", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5838eb024a44278839a718205c99b10a") : new i(fragmentActivity, bankInfo));
    }
}
