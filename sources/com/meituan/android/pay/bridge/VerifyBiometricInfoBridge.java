package com.meituan.android.pay.bridge;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.bridge.handler.a;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.pay.fragment.VerifyFingerprintFragment;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.pay.process.ntv.pay.n;
import com.meituan.android.pay.utils.k;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyBiometricInfoBridge extends a implements com.meituan.android.pay.process.a {
    public static ChangeQuickRedirect a;
    private Activity e;
    @MTPayNeedToPersist
    private boolean f;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @NonNull
    public final String a() {
        return "pay_verifyBiometricInfo";
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.a, com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @MTPaySuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcad48164e816bc2a16a9fa090b4ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcad48164e816bc2a16a9fa090b4ea2");
            return;
        }
        Activity d = aVar.d();
        this.f = true;
        if (d != null) {
            this.e = d;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (TextUtils.equals(jSONObject.optString("scene_incoming_native_business"), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER)) {
                    int optInt = jSONObject.optInt("finger_type");
                    String optString = jSONObject.optString("challenge");
                    int optInt2 = jSONObject.optInt("verify_type");
                    if (optInt2 == 1) {
                        com.meituan.android.pay.desk.component.data.a.b = true;
                        com.meituan.android.pay.analyse.a.a(d, "VerifyBiometricInfoBridge", jSONObject.optJSONObject("report_params"));
                        k.a().c = this;
                        h.c((FragmentActivity) d, VerifyFingerprintFragment.a(optInt, optString, ""));
                        return;
                    } else if (-1 == optInt2) {
                        callBackFingerprintData(2, false, null);
                        return;
                    } else {
                        a(-404, "未识别到该验证方式");
                        return;
                    }
                }
                a(1000, "scene数据有误");
                return;
            } catch (JSONException e) {
                a(11, "JSData解析失败");
                f.a("VerifyBiometricInfoBridge_execUIThread" + e.toString());
                return;
            }
        }
        a(11, "activity为空");
    }

    @Override // com.meituan.android.pay.process.a
    public void callBackFingerprintData(int i, boolean z, HashMap<String, String> hashMap) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fc52264adfc5bd7c7e830337949da1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fc52264adfc5bd7c7e830337949da1");
            return;
        }
        if (i == 3 || i == 0 || i == 4 || i == 2) {
            n.a().c();
            h.a((FragmentActivity) this.e);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("verify_state", i);
            jSONObject.put("fail_too_many_times", z);
            if (!i.a(hashMap)) {
                jSONObject.put("verify_result", new JSONObject(hashMap));
            }
            if (this.f) {
                a(jSONObject);
                this.f = false;
            }
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridMeituanPayJsHandler_exec", (Map<String, Object>) null);
            a(1000, "数据有误");
        }
    }
}
