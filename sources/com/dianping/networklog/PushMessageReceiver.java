package com.dianping.networklog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.networklog.ae;
import com.dianping.networklog.ai;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PushMessageReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f076b5b201287cc0a73cbd7fffefd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f076b5b201287cc0a73cbd7fffefd3");
            return;
        }
        String action = intent.getAction();
        if (!"com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGElogan".equalsIgnoreCase(action)) {
            if ("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE.SHARK_PUSH_LOGAN".equalsIgnoreCase(action)) {
                String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "message");
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1754969aeae3b16c20f6651740905939", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1754969aeae3b16c20f6651740905939");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    String optString = jSONObject.optString("logDate");
                    String optString2 = jSONObject.optString("bizTaskId");
                    String optString3 = jSONObject.optString("source");
                    boolean equals = "1".equals(jSONObject.optString("isWifi"));
                    int optInt = jSONObject.optInt("fileSize") * 1024;
                    a(equals, optInt, optString2, optString, optString3);
                    c.a(optString, optString2, equals, optInt, 2, false, jSONObject.optBoolean("isForce"), optString3);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            return;
        }
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "message");
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        Object[] objArr3 = {a3};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eccc0d2fc562d4a19b3922b03428376", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eccc0d2fc562d4a19b3922b03428376");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(a3).optJSONObject("extra");
            if (optJSONObject == null) {
                return;
            }
            String optString4 = optJSONObject.optString("logankick");
            JSONObject jSONObject2 = TextUtils.isEmpty(optString4) ? null : new JSONObject(optString4);
            if (jSONObject2 != null) {
                String optString5 = jSONObject2.optString("logDate");
                String optString6 = jSONObject2.optString(ResponseWithInnerData.TASK_ID);
                boolean equals2 = "1".equals(jSONObject2.optString("isWifi"));
                int optInt2 = jSONObject2.optInt("fileSize") * 1024;
                a(equals2, optInt2, optString6, optString5, "");
                c.a(optString5, optString6, equals2, optInt2, 2, false, jSONObject2.optBoolean("isForce"), "");
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void a(boolean z, int i, String str, String str2, String str3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a0c736fdbd712bea18cd534177450f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a0c736fdbd712bea18cd534177450f");
            return;
        }
        ae aeVar = new ae();
        aeVar.b = z;
        aeVar.d = i;
        aeVar.e = str2;
        aeVar.c = str;
        aeVar.g = 2;
        aeVar.h = 1;
        aeVar.j = str3;
        aeVar.k = ae.a.UPLOAD_ING;
        ai.a.a.a(aeVar);
    }
}
