package com.hhmedic.android.sdk.tim;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.net.open.HHNetFetch;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.user.UserExtension;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.module.message.Body;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Signalling {
    private final Context mContext;
    private String orderId;
    private long receiverId;

    public Signalling(Context context) {
        this.mContext = context;
    }

    public Signalling setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public void setReceiverId(long j) {
        this.receiverId = j;
    }

    public void sendCall(HHGsonRequest.OnNetListener<HHEmptyModel> onNetListener) {
        try {
            HHNetFetch.request(this.mContext, new SendMessageHttp(httpParams(), sendBody(TCommand.call, this.orderId)), onNetListener);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void sendCancel() {
        doSendCancelMessage(TCommand.call_cancel);
    }

    private void doSendCancelMessage(String str) {
        try {
            if (this.receiverId == 0) {
                return;
            }
            HHNetFetch.request(this.mContext, new SendMessageHttp(httpParams(), sendBody(str, this.orderId)), null);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void sendRefuse() {
        doSendCancelMessage(TCommand.refuse);
    }

    public void sendCameraOpened(boolean z) {
        doSendCancelMessage(z ? TCommand.open_local : TCommand.close_local);
    }

    private Body sendBody(String str, String str2) {
        Body body = new Body(str, str2);
        UserExtension userInfo = Caches.getUserInfo(this.mContext);
        if (userInfo != null) {
            body.uuid = userInfo.uuid;
        }
        return body;
    }

    private HashMap<String, Object> httpParams() {
        UserExtension userInfo = Caches.getUserInfo(this.mContext);
        return Maps.of("toUuid", Long.valueOf(this.receiverId), "fromUuid", Long.valueOf(userInfo != null ? userInfo.uuid : 0L), "sdkProductId", HHConfig.getPid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class SendMessageHttp extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public final String serverApiPath() {
            return "/miniprogram/sendNetMsgByWx";
        }

        SendMessageHttp(HashMap<String, Object> hashMap, Body body) {
            super(hashMap, null);
            try {
                this.mBodyByte = new Gson().toJson(body).getBytes(StandardCharsets.UTF_8);
            } catch (Exception e) {
                Logger.e(e.getMessage());
            }
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public final Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.tim.Signalling.SendMessageHttp.1
            }.getType();
        }
    }
}
