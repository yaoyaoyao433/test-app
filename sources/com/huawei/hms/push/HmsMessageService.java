package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.meituan.robust.common.StringUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";
    public final Messenger a = new Messenger(new a());

    /* compiled from: ProGuard */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                HMSLog.e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.i("HmsMessageService", "handle message start ");
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra(RemoteMessageConst.INPUT_TYPE, data.getInt(RemoteMessageConst.INPUT_TYPE, -1));
                HmsMessageService.this.handleIntentMessage(intent);
            }
            super.handleMessage(message);
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        if (!str.equals(BaseUtils.getLocalToken(applicationContext, str2))) {
            HMSLog.i("HmsMessageService", "receive a token, refresh the local token");
            BaseUtils.saveToken(applicationContext, str2, str);
            return;
        }
        BaseUtils.reportAaidToken(applicationContext, str);
    }

    public final void b(Intent intent) {
        HMSLog.i("HmsMessageService", "parse batch response.");
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "batchMsgbody");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("transactionId");
                String optString2 = jSONObject.optString("msgId");
                int optInt = jSONObject.optInt("ret", ErrorEnum.ERROR_UNKNOWN.getInternalCode());
                if (ErrorEnum.SUCCESS.getInternalCode() == optInt) {
                    b(optString, optString2);
                } else {
                    b(optString, optString2, optInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.w("HmsMessageService", "parse batch response failed.");
        }
    }

    public void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(a(intent)));
    }

    public void handleIntentMessage(Intent intent) {
        if (intent == null) {
            HMSLog.e("HmsMessageService", "receive message is null");
            return;
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "message_id");
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, RemoteMessageConst.MSGTYPE);
        String a4 = com.sankuai.waimai.platform.utils.f.a(intent, CommonCode.MapKey.TRANSACTION_ID);
        if ("new_token".equals(a3)) {
            HMSLog.i("HmsMessageService", "onNewToken");
            a(intent, a4);
        } else if ("received_message".equals(a3)) {
            HMSLog.i("HmsMessageService", "onMessageReceived, message id:" + a2);
            a(PushNaming.RECEIVE_MSG_RSP, a2, ErrorEnum.SUCCESS.getInternalCode());
            doMsgReceived(intent);
        } else if ("sent_message".equals(a3)) {
            b(a4, a2);
        } else if ("send_error".equals(a3)) {
            b(a4, a2, com.sankuai.waimai.platform.utils.f.a(intent, "error", ErrorEnum.ERROR_UNKNOWN.getInternalCode()));
        } else if ("delivery".equals(a3)) {
            int a5 = com.sankuai.waimai.platform.utils.f.a(intent, "error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode());
            HMSLog.i("HmsMessageService", "onMessageDelivery, message id:" + a2 + ", status:" + a5 + ", transactionId: " + a4);
            a(PushNaming.UPSEND_RECEIPT, a4, a5);
            onMessageDelivered(a2, new SendException(a5));
        } else if ("server_deleted_message".equals(a3)) {
            HMSLog.i("HmsMessageService", "delete message, message id:" + a2);
            onDeletedMessages();
        } else if ("batchSent".equals(a3)) {
            b(intent);
        } else {
            HMSLog.e("HmsMessageService", "Receive unknown message: " + a3);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMessageService", "start to bind");
        return this.a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
    }

    public void onDeletedMessages() {
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        HMSLog.i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.i("HmsMessageService", "start to command , startId = " + i2);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    public final Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("message_id", com.sankuai.waimai.platform.utils.f.a(intent, "message_id"));
        bundle.putByteArray(RemoteMessageConst.MSGBODY, intent.getByteArrayExtra(RemoteMessageConst.MSGBODY));
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, com.sankuai.waimai.platform.utils.f.a(intent, RemoteMessageConst.DEVICE_TOKEN));
        if (com.sankuai.waimai.platform.utils.f.a(intent, RemoteMessageConst.INPUT_TYPE, -1) == 1) {
            bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
        }
        return bundle;
    }

    public final void b(String str, String str2) {
        HMSLog.i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.getInternalCode());
        onMessageSent(str2);
    }

    public final void a(Intent intent, String str) {
        int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "error", ErrorEnum.SUCCESS.getInternalCode());
        a(PushNaming.GETTOKEN_ASYNC_RSP, str, a2);
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "subjectId");
        String a4 = com.sankuai.waimai.platform.utils.f.a(intent, "message_proxy_type");
        HMSLog.i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + a2 + ",subjectId:" + a3 + ",proxyType:" + a4);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(a3)) {
            bundle.putString(SUBJECT_ID, a3);
        }
        if (!TextUtils.isEmpty(a4)) {
            bundle.putString(PROXY_TYPE, a4);
        }
        if (a2 == ErrorEnum.SUCCESS.getInternalCode()) {
            HMSLog.i("HmsMessageService", "Apply token OnNewToken, subId: " + a3);
            a(intent, bundle, a3);
            return;
        }
        HMSLog.i("HmsMessageService", "Apply token failed, subId: " + a3);
        a(bundle, a3, a2);
    }

    public final void b(String str, String str2, int i) {
        HMSLog.i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i);
        onSendError(str2, new SendException(i));
    }

    public final synchronized void a(Bundle bundle, String str, int i) {
        Context applicationContext = getApplicationContext();
        boolean z = !TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
        if (bundle.isEmpty() && z) {
            HMSLog.i("HmsMessageService", "onTokenError to host app.");
            onTokenError(new BaseException(i));
            BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
        }
        if (TextUtils.isEmpty(str)) {
            String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
            if (subjectIds != null && subjectIds.length != 0) {
                for (int i2 = 0; i2 < subjectIds.length; i2++) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(SUBJECT_ID, subjectIds[i2]);
                    HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + subjectIds[i2]);
                    onTokenError(new BaseException(i), bundle2);
                }
                BaseUtils.clearSubjectIds(applicationContext);
                return;
            }
            HMSLog.i("HmsMessageService", "onTokenError to host app with bundle.");
            onTokenError(new BaseException(i), bundle);
            return;
        }
        HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
        onTokenError(new BaseException(i), bundle);
    }

    public final synchronized void a(Intent intent, Bundle bundle, String str) {
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, RemoteMessageConst.DEVICE_TOKEN);
        a(a2, str);
        Context applicationContext = getApplicationContext();
        boolean z = !TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
        if (bundle.isEmpty() && z) {
            HMSLog.i("HmsMessageService", "onNewToken to host app.");
            onNewToken(a2);
            BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
        }
        if (TextUtils.isEmpty(str)) {
            String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
            if (subjectIds != null && subjectIds.length != 0) {
                for (int i = 0; i < subjectIds.length; i++) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(SUBJECT_ID, subjectIds[i]);
                    HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + subjectIds[i]);
                    onNewToken(a2, bundle2);
                    a(a2, subjectIds[i]);
                }
                BaseUtils.clearSubjectIds(applicationContext);
                return;
            }
            HMSLog.i("HmsMessageService", "onNewToken to host app with bundle.");
            bundle.putString("belongId", com.sankuai.waimai.platform.utils.f.a(intent, "belongId"));
            onNewToken(a2, bundle);
            return;
        }
        HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
        onNewToken(a2, bundle);
    }

    public final void a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            str2 = StringUtil.NULL;
        }
        PushBiUtil.reportExit(getApplicationContext(), str, str2, i);
    }
}
