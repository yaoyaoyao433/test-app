package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.module.video.data.entity.CallResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.mrn.analytics.library.Constants;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HangUpNet {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class HangupReason {
        public static final String DOCTOR_HANGUP = "对方挂断";
        public static final String NORMAL = "正常挂断";
        public static final String SELF = "主动挂断";
    }

    public static <T> void cancel(HangUpParam hangUpParam, HHGsonRequest.OnNetListener<T> onNetListener) {
        if (hangUpParam == null) {
            return;
        }
        new HHGsonRequest(new InterruptHis(hangUpParam.hangUpMaps()), onNetListener).start();
    }

    public static <T> void interrupt(HangUpParam hangUpParam, HHGsonRequest.OnNetListener<T> onNetListener) {
        if (hangUpParam == null) {
            return;
        }
        new HHGsonRequest(new InterruptHis(hangUpParam.interruptMaps()), onNetListener).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InterruptHis extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/v2/orderByUser/hangUp";
        }

        InterruptHis(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<CallResult>>() { // from class: com.hhmedic.android.sdk.module.video.data.HangUpNet.InterruptHis.1
            }.getType();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HangUpParam {
        String cancelType;
        String channelId;
        Context context;
        String orderId;
        String reason;
        long time;

        HangUpParam(Context context) {
            this.context = context;
        }

        HashMap<String, Object> hangUpMaps() {
            if (TextUtils.isEmpty(this.orderId)) {
                this.orderId = "NULL";
            }
            if (TextUtils.isEmpty(this.cancelType)) {
                this.cancelType = "call_cancel";
            }
            if (TextUtils.isEmpty(this.reason)) {
                this.reason = HangupReason.NORMAL;
            }
            if (TextUtils.isEmpty(this.channelId)) {
                this.channelId = "0";
            }
            return Maps.of(Constants.EventConstants.KEY_ORDER_ID, this.orderId, "videoTime", 0, "reason", this.reason, RemoteMessageConst.Notification.CHANNEL_ID, this.channelId);
        }

        HashMap<String, Object> interruptMaps() {
            if (TextUtils.isEmpty(this.orderId)) {
                this.orderId = "NULL";
            }
            if (TextUtils.isEmpty(this.channelId)) {
                this.channelId = "0";
            }
            if (TextUtils.isEmpty(this.reason)) {
                this.reason = HangupReason.DOCTOR_HANGUP;
            }
            return Maps.of(Constants.EventConstants.KEY_ORDER_ID, this.orderId, "videoTime", Long.valueOf(this.time / 1000), RemoteMessageConst.Notification.CHANNEL_ID, this.channelId, "reason", this.reason);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HangUpBuilder {
        HangUpParam mParam;

        public HangUpBuilder(Context context) {
            this.mParam = new HangUpParam(context);
        }

        public HangUpBuilder setOrderId(String str) {
            this.mParam.orderId = str;
            return this;
        }

        public HangUpBuilder setReason(String str) {
            this.mParam.reason = str;
            return this;
        }

        public HangUpBuilder setChatTime(long j) {
            this.mParam.time = j;
            return this;
        }

        public HangUpBuilder setChannelId(String str) {
            this.mParam.channelId = str;
            return this;
        }

        public HangUpParam builder() {
            return this.mParam;
        }
    }
}
