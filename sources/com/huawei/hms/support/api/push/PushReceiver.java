package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.h;
import com.huawei.hms.push.s;
import com.huawei.hms.push.u;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.push.v;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.sankuai.waimai.platform.utils.f;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PushReceiver extends BroadcastReceiver {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public Context a;
        public Intent b;

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(this.b.getPackage());
            JSONObject b = PushReceiver.b(this.b);
            String string = JsonUtil.getString(b, "moduleName", "");
            int i = JsonUtil.getInt(b, "msgType", 0);
            int i2 = JsonUtil.getInt(b, "status", 0);
            if (ErrorEnum.SUCCESS.getInternalCode() != i2) {
                i2 = ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode();
            }
            Bundle bundle = new Bundle();
            if ("Push".equals(string) && i == 1) {
                bundle.putString(RemoteMessageConst.MSGTYPE, "delivery");
                bundle.putString("message_id", JsonUtil.getString(b, "msgId", ""));
                bundle.putInt("error", i2);
                bundle.putString(CommonCode.MapKey.TRANSACTION_ID, JsonUtil.getString(b, "transactionId", ""));
            } else {
                if (this.b.getExtras() != null) {
                    bundle.putAll(this.b.getExtras());
                }
                bundle.putString(RemoteMessageConst.MSGTYPE, "received_message");
                bundle.putString("message_id", f.a(this.b, "msgIdStr"));
                bundle.putByteArray(RemoteMessageConst.MSGBODY, this.b.getByteArrayExtra("msg_data"));
                bundle.putString(RemoteMessageConst.DEVICE_TOKEN, v.a(this.b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN)));
                bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
                bundle.putString("message_proxy_type", f.a(this.b, "message_proxy_type"));
            }
            if (new h().a(this.a, bundle, intent)) {
                HMSLog.i("PushReceiver", "receive " + this.b.getAction() + " and start service success");
                return;
            }
            HMSLog.e("PushReceiver", "receive " + this.b.getAction() + " and start service failed");
        }

        public a(Context context, Intent intent) {
            this.a = context;
            this.b = intent;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {
        public Context a;
        public Intent b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] byteArrayExtra = this.b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN);
                if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("receive a push token: ");
                    sb.append(this.a.getPackageName());
                    HMSLog.i("PushReceiver", sb.toString());
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.b.getPackage());
                    Bundle bundle = new Bundle();
                    bundle.putString(RemoteMessageConst.MSGTYPE, "new_token");
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, v.a(byteArrayExtra));
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, f.a(this.b, CommonCode.MapKey.TRANSACTION_ID));
                    bundle.putString("subjectId", f.a(this.b, "subjectId"));
                    bundle.putInt("error", f.a(this.b, "error", ErrorEnum.SUCCESS.getInternalCode()));
                    bundle.putString("belongId", f.a(this.b, "belongId"));
                    if (new h().a(this.a, bundle, intent)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("receive ");
                    sb2.append(this.b.getAction());
                    sb2.append(" and start service failed");
                    HMSLog.e("PushReceiver", sb2.toString());
                    return;
                }
                HMSLog.i("PushReceiver", "get a deviceToken, but it is null or empty");
            } catch (RejectedExecutionException unused) {
                HMSLog.e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.e("PushReceiver", "handle push token error");
            }
        }

        public b(Context context, Intent intent) {
            this.a = context;
            this.b = intent;
        }
    }

    public final void b(Context context, Intent intent) {
        try {
            if (intent.hasExtra(RemoteMessageConst.DEVICE_TOKEN)) {
                u.a().execute(new b(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.e("PushReceiver", "handlePushTokenEvent execute task error");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            f.a(intent, "TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                b(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action)) {
                a(context, intent);
            } else {
                HMSLog.i("PushReceiver", "message can't be recognised:" + intent.toUri(0));
            }
        } catch (Exception unused) {
            HMSLog.e("PushReceiver", "intent has some error");
        }
    }

    public final void a(Context context, Intent intent) {
        try {
            if (intent.hasExtra("msg_data")) {
                u.a().execute(new a(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task error");
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    public static JSONObject a(byte[] bArr) {
        try {
            return new JSONObject(v.a(bArr));
        } catch (JSONException unused) {
            HMSLog.w("PushReceiver", "JSONException:parse message body failed.");
            return null;
        }
    }

    public static JSONObject b(Intent intent) {
        JSONObject a2 = a(intent.getByteArrayExtra("msg_data"));
        JSONObject a3 = a(a2);
        String string = JsonUtil.getString(a3, "data", null);
        if (s.a(a3, b(a3), string)) {
            return a2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
