package com.meituan.android.paybase.downgrading;

import android.content.Context;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static boolean c = true;
    private static volatile d d;
    public c b;
    private HornCallback e;

    @MTPaySuppressFBWarnings({"UR_UNINIT_READ"})
    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65eb57f8d249de50493bdc29277bee01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65eb57f8d249de50493bdc29277bee01");
        } else {
            this.e = e.a(this);
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39d51513aa3d7298d06a5113f55ec426", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39d51513aa3d7298d06a5113f55ec426");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public static /* synthetic */ void a(d dVar, boolean z, String str) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9baaa78851d8090a210dbd94426f497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9baaa78851d8090a210dbd94426f497");
            return;
        }
        v.a("c_pdj05ry3", "b_lzke7dj2", "", new a.b().a("enable", String.valueOf(z)).a("result", str).b);
        if (z) {
            try {
                dVar.b = new c();
                JSONObject jSONObject = new JSONObject(str);
                c.a(jSONObject.optBoolean("finance_boot_optimize"));
                c cVar = dVar.b;
                String optString = jSONObject.optString("safe_key_notice_info");
                Object[] objArr2 = {optString};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "59ad1311f4745c7466894a7abb1b3d39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "59ad1311f4745c7466894a7abb1b3d39");
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        cVar.d = jSONObject2.optBoolean("show");
                        cVar.e = jSONObject2.optString("url");
                    } catch (JSONException e) {
                        cVar.d = false;
                        com.meituan.android.paybase.common.analyse.a.a(e, "setSafeKeyNotice", (Map<String, Object>) null);
                    }
                }
                c cVar2 = dVar.b;
                double optDouble = jSONObject.optDouble("half_page_loading_time", 6.0d);
                Object[] objArr3 = {Double.valueOf(optDouble)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "aa729d7b72f9e2860fd9bab156e7120a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "aa729d7b72f9e2860fd9bab156e7120a");
                } else {
                    cVar2.b = optDouble;
                }
                dVar.b.i = jSONObject.optBoolean("hybrid_halfcashier_asyncloading_fingerprint_switch");
                dVar.b.c = jSONObject.optString("cashier_router_params_rule");
                dVar.b.g = jSONObject.optBoolean("route_info_save_switch");
                dVar.b.h = jSONObject.optBoolean("hw_not_draw_point_switch");
                dVar.b.f = jSONObject.optBoolean("android_pay_thread_switch");
                dVar.b.j = jSONObject.optBoolean("double_pay_optimize_switch");
                dVar.b.k = jSONObject.optBoolean("is_identity_card_ocr_encrypt_off");
                dVar.b.l = jSONObject.optString("weekpay_confirm_url");
                dVar.b.m = jSONObject.optBoolean("mtprocess_instance_switch", true);
                dVar.b.n = jSONObject.optBoolean("payrequestutils_instance_switch", true);
                dVar.b.o = jSONObject.optBoolean("cashier_wrapper_activity_switch", true);
                Boolean valueOf = Boolean.valueOf(!jSONObject.optBoolean("use_new_cashier_callback", false));
                if (com.meituan.android.paybase.utils.e.b == null) {
                    com.meituan.android.paybase.utils.e.b = valueOf;
                }
                dVar.b.p = jSONObject.optBoolean("android_wasm_switch", false);
                dVar.b.q = jSONObject.optBoolean("android_router_back_enabled", true);
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PayCashierHornConfigService_onChanged").a("message", e2.getMessage()).b);
            }
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8206fd00b8530b03754c179eda7edc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8206fd00b8530b03754c179eda7edc8");
            return;
        }
        if (ah.a(context)) {
            Horn.debug(context, "pay_cashier", true ^ c);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.Environment.KEY_CITYID, com.meituan.android.paybase.config.a.d().g());
        hashMap.put("pay_sdk_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("uuid", com.meituan.android.paybase.config.a.d().j());
        hashMap.put("appname", com.meituan.android.paybase.config.a.d().k());
        hashMap.put("userid", com.meituan.android.paybase.config.a.d().i());
        Horn.register("pay_cashier", this.e, hashMap);
    }

    public static void a(boolean z) {
        c = z;
    }
}
