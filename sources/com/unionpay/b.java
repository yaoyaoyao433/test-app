package com.unionpay;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.unionpay.utils.UPUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class b implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        String str;
        Context context;
        String str2;
        Context context2;
        String str3;
        String str4;
        Context context3;
        String str5;
        String str6;
        String str7;
        boolean z2;
        JSONArray b;
        Context context4;
        String str8;
        String str9;
        Context context5;
        JSONArray jSONArray;
        int i;
        switch (message.what) {
            case 1001:
                UPPayAssistEx.n();
                break;
            case 1002:
                try {
                    if (message.obj != null) {
                        JSONObject jSONObject = new JSONObject((String) message.obj);
                        String a = com.unionpay.utils.i.a(jSONObject, DeviceInfo.SIGN);
                        int i2 = 0;
                        try {
                            str9 = UPPayAssistEx.K;
                            i2 = Integer.parseInt(str9);
                        } catch (NumberFormatException unused) {
                        }
                        String str10 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                        String str11 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                        if (TextUtils.isEmpty(str11)) {
                            str11 = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str10);
                        sb.append(str11);
                        str = UPPayAssistEx.H;
                        sb.append(str);
                        String a2 = com.unionpay.utils.b.a(UPUtils.a(sb.toString()));
                        String forConfig = UPUtils.forConfig(i2, a);
                        if (!TextUtils.isEmpty(forConfig) && forConfig.equals(a2)) {
                            context = UPPayAssistEx.G;
                            StringBuilder sb2 = new StringBuilder("configs");
                            str2 = UPPayAssistEx.C;
                            sb2.append(str2);
                            UPUtils.a(context, (String) message.obj, sb2.toString());
                            context2 = UPPayAssistEx.G;
                            str3 = UPPayAssistEx.K;
                            StringBuilder sb3 = new StringBuilder(JsBridgeResult.ARG_KEY_LOCATION_MODE);
                            str4 = UPPayAssistEx.C;
                            sb3.append(str4);
                            UPUtils.a(context2, str3, sb3.toString());
                            context3 = UPPayAssistEx.G;
                            str5 = UPPayAssistEx.H;
                            StringBuilder sb4 = new StringBuilder("or");
                            str6 = UPPayAssistEx.C;
                            sb4.append(str6);
                            UPUtils.a(context3, str5, sb4.toString());
                            str7 = UPPayAssistEx.A;
                            if (!TextUtils.isEmpty(str7)) {
                                context4 = UPPayAssistEx.G;
                                StringBuilder sb5 = new StringBuilder("se_configs");
                                str8 = UPPayAssistEx.A;
                                sb5.append(str8);
                                UPUtils.a(context4, str11, sb5.toString());
                            }
                            z2 = UPPayAssistEx.P;
                            if (!z2) {
                                b = UPPayAssistEx.b(new JSONArray(str10), "sort");
                                JSONArray unused2 = UPPayAssistEx.W = b;
                                UPPayAssistEx.d(str11);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                z = UPPayAssistEx.P;
                if (z) {
                    return true;
                }
                break;
            default:
                return true;
        }
        context5 = UPPayAssistEx.G;
        jSONArray = UPPayAssistEx.W;
        i = UPPayAssistEx.O;
        UPPayAssistEx.a(context5, jSONArray, i);
        return true;
    }
}
