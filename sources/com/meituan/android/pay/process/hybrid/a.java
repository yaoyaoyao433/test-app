package com.meituan.android.pay.process.hybrid;

import android.app.Activity;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.d;
import com.meituan.android.pay.utils.k;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private Activity b;

    @Override // com.meituan.android.pay.process.d
    public final String a() {
        return "HybridPayCenter";
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63df91ab30a9770e585a0dbfbe4ee50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63df91ab30a9770e585a0dbfbe4ee50");
        } else {
            this.b = activity;
        }
    }

    @Override // com.meituan.android.pay.process.d
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42b192aa544611a6430e0ce5e5a8e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42b192aa544611a6430e0ce5e5a8e51");
            return;
        }
        JSONObject b = b(obj);
        if (com.meituan.android.pay.desk.component.data.a.a(this.b)) {
            PayActivity.b(this.b, b.toString());
        } else if (k.a().b != null) {
            k.a().b.callBackData(b);
        }
    }

    private JSONObject b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd039b58a19ed0313ed1b39f11f5967", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd039b58a19ed0313ed1b39f11f5967");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof BankInfo) {
                jSONObject.put("callback_status", -1);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", new JSONObject(n.a().toJson(obj)));
                jSONObject.put("callback_data", jSONObject2);
            } else if (obj instanceof PayException) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("callback_status", 2);
                jSONObject3.put("error", new JSONObject(n.a().toJson(obj)));
                jSONObject.put("callback_data", jSONObject3);
            } else {
                jSONObject.put("callback_status", 0);
            }
            jSONObject.put("pay_params", new JSONObject(com.meituan.android.pay.common.payment.utils.b.c(this.b)));
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BankInfoUtils_getCallbackMould", (Map<String, Object>) null);
        }
        return jSONObject;
    }
}
