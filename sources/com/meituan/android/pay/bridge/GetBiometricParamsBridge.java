package com.meituan.android.pay.bridge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.fingerprint.util.b;
import com.meituan.android.paybase.fingerprint.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GetBiometricParamsBridge extends a {
    public static ChangeQuickRedirect a;
    private static JSONObject e;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "pay_getBiometricsInfo";
    }

    public static /* synthetic */ JSONObject c() throws Exception {
        return d();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @Nullable
    public final String c(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73961607cad14819c04d70eec998adc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73961607cad14819c04d70eec998adc7");
        }
        if (e == null) {
            return d;
        }
        return e.toString();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void b(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa8a7125912e517fcbad99bd02dfac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa8a7125912e517fcbad99bd02dfac5");
        } else if (e != null) {
        } else {
            try {
                JSONObject d = d();
                e = d;
                a(d);
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GetFingerprintParamJsHandler_exec").a("message", e2.getMessage()).b);
                a(11, (String) null);
            }
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1836a021a53e70f639758c7306b7fe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1836a021a53e70f639758c7306b7fe0");
        } else if (e != null) {
        } else {
            new com.meituan.android.paybase.asynctask.a<Object, Object, JSONObject>() { // from class: com.meituan.android.pay.bridge.GetBiometricParamsBridge.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ void a(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3749e318c16933b6f6d0a0683c4c7832", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3749e318c16933b6f6d0a0683c4c7832");
                    } else if (jSONObject != null) {
                        JSONObject unused = GetBiometricParamsBridge.e = jSONObject;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.paybase.asynctask.b
                /* renamed from: c */
                public JSONObject a(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "9bf06cdfa658bcd7d8a9cc636ac2f777", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JSONObject) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "9bf06cdfa658bcd7d8a9cc636ac2f777");
                    }
                    try {
                        return GetBiometricParamsBridge.c();
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }.b(new Object[0]);
        }
    }

    private static JSONObject d() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "483e0b597cd1f9d8b21cbf8e4c03f6d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "483e0b597cd1f9d8b21cbf8e4c03f6d5");
        }
        Context d = com.meituan.android.neohybrid.init.a.d();
        if (d != null) {
            String f = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.f();
            String valueOf = String.valueOf(com.meituan.android.paybase.fingerprint.util.a.a(d));
            String c = c.c();
            String valueOf2 = String.valueOf(e.a(d, ""));
            String str = b.c(com.meituan.android.paybase.config.a.d().i()) ? "0" : "1";
            String d2 = c.d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("model_key", f);
            jSONObject.put("support_finger_type", valueOf);
            jSONObject.put("has_touchid", c);
            jSONObject.put("need_update_soter_key", valueOf2);
            jSONObject.put("google_fingerprint_locked", str);
            jSONObject.put("hardware_detected", d2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", "success");
            jSONObject2.put("data", jSONObject);
            return jSONObject2;
        }
        return null;
    }
}
