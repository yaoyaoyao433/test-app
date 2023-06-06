package com.meizu.cloud.pushsdk.handler.a.c;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class e {
    private int a;
    private String b = "-1";
    private String c = "";
    private String d = "";
    private int e = -1;
    private String f = "";

    public static String a(MessageV3 messageV3) {
        String str;
        JSONObject jSONObject;
        String str2;
        String notificationMessage = messageV3.getNotificationMessage();
        String str3 = null;
        try {
            try {
            } catch (Throwable th) {
                if (TextUtils.isEmpty(null)) {
                    try {
                        new JSONObject(notificationMessage).getString("se");
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        }
        if (!TextUtils.isEmpty(notificationMessage)) {
            try {
                JSONObject jSONObject2 = new JSONObject(notificationMessage).getJSONObject("data");
                if (!jSONObject2.isNull("extra")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("extra");
                    if (!jSONObject3.isNull("se")) {
                        str3 = jSONObject3.getString("se");
                    }
                }
            } catch (JSONException e) {
                DebugLogger.e("SecurityMessage", "parse notification message error " + e.getMessage());
                if (TextUtils.isEmpty(null)) {
                    jSONObject = new JSONObject(notificationMessage);
                    str2 = "se";
                }
            }
            if (TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject(notificationMessage);
                str2 = "se";
                str = jSONObject.getString(str2);
                DebugLogger.i("SecurityMessage", "encrypt message " + str);
                return str;
            }
        }
        str = str3;
        DebugLogger.i("SecurityMessage", "encrypt message " + str);
        return str;
    }

    public final String toString() {
        return "SecurityMessage{timestamp=" + this.a + ", taskId='" + this.b + "', title='" + this.c + "', content='" + this.d + "', clickType=" + this.e + ", params='" + this.f + "'}";
    }

    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public String b;
        public String c;

        public final String toString() {
            return "PublicKeyStatus{code='" + this.a + "', message='" + this.b + "', publicKey='" + this.c + "'}";
        }

        public a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("code")) {
                    this.a = jSONObject.getString("code");
                }
                if (!jSONObject.isNull("message")) {
                    this.b = jSONObject.getString("message");
                }
                if (jSONObject.isNull("value")) {
                    return;
                }
                this.c = jSONObject.getString("value");
            } catch (JSONException e) {
                DebugLogger.e("SecurityMessage", "covert json error " + e.getMessage());
            }
        }
    }

    public static boolean a(String str, MessageV3 messageV3) {
        String str2;
        String str3;
        e a2 = a(str);
        DebugLogger.e("SecurityMessage", "securityMessage " + a2);
        if (System.currentTimeMillis() / 1000 > a2.a) {
            DebugLogger.e("SecurityMessage", "message expire");
            return false;
        } else if (!messageV3.getTitle().contains(a2.c)) {
            DebugLogger.e("SecurityMessage", "invalid title");
            return false;
        } else if (!messageV3.getContent().contains(a2.d)) {
            DebugLogger.e("SecurityMessage", "invalid content");
            return false;
        } else if (!"-1".equals(a2.b) && !a2.b.equals(messageV3.getTaskId())) {
            DebugLogger.e("SecurityMessage", "invalid taskId");
            return false;
        } else {
            if (a2.e != -1) {
                switch (a2.e) {
                    case 1:
                        if (messageV3.getActivity().contains(a2.f)) {
                            return true;
                        }
                        DebugLogger.e("SecurityMessage", "invalid click activity");
                        return false;
                    case 2:
                        if (messageV3.getWebUrl().contains(a2.f)) {
                            return true;
                        }
                        DebugLogger.e("SecurityMessage", "invalid web url");
                        return false;
                    case 3:
                        if (!MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString().contains(a2.f)) {
                            str2 = "SecurityMessage";
                            str3 = "invalid self define";
                            break;
                        } else {
                            return true;
                        }
                    default:
                        return true;
                }
            } else {
                str2 = "SecurityMessage";
                str3 = "invalid click type";
            }
            DebugLogger.e(str2, str3);
            return false;
        }
    }

    private static e a(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
                eVar.a = jSONObject.getInt(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
            }
            if (!jSONObject.isNull("ti")) {
                eVar.b = jSONObject.getString("ti");
            }
            if (!jSONObject.isNull("tl")) {
                eVar.c = jSONObject.getString("tl");
            }
            if (!jSONObject.isNull("cont")) {
                eVar.d = jSONObject.getString("cont");
            }
            if (!jSONObject.isNull(Constants.Environment.KEY_CT)) {
                eVar.e = jSONObject.getInt(Constants.Environment.KEY_CT);
            }
            if (!jSONObject.isNull("pm")) {
                eVar.f = jSONObject.getString("pm");
            }
        } catch (Exception e) {
            DebugLogger.e("SecurityMessage", "parse decryptSign error " + e.getMessage());
        }
        return eVar;
    }
}
