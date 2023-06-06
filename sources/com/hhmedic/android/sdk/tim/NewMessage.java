package com.hhmedic.android.sdk.tim;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.net.open.HHNetFetch;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.logger.SystemNetLog;
import com.hhmedic.android.sdk.module.message.Body;
import com.hhmedic.android.sdk.module.message.Command;
import com.hhmedic.android.sdk.module.message.CustomMessage;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NewMessage {
    private static NewMessage instance;
    private boolean isLineUp;
    private boolean isStop = false;
    private String mCacheMessage;
    private Context mContext;
    private Handler mHandler;
    private long mLocalCacheTime;
    private OnTimNewMessage mNewMessageListener;
    private String mOrderId;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnTimNewMessage {
        boolean onMessage(Body body, String str);
    }

    private NewMessage(Context context) {
        if (context.getApplicationContext() != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
    }

    public void addNewMessageListener(OnTimNewMessage onTimNewMessage) {
        this.mNewMessageListener = onTimNewMessage;
    }

    public static NewMessage getInstance(Context context) {
        NewMessage newMessage;
        synchronized (NewMessage.class) {
            if (instance == null) {
                instance = new NewMessage(context);
            }
            newMessage = instance;
        }
        return newMessage;
    }

    public static boolean haveInstance() {
        return instance != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Body parserCustomMessage(String str) {
        try {
            Body body = Body.get(str);
            if (body == null) {
                return null;
            }
            if (this.mNewMessageListener != null) {
                this.mNewMessageListener.onMessage(body, str);
            } else {
                CustomMessage.getInstance().send(body, str);
                if (!TextUtils.isEmpty(body.command)) {
                    SystemNetLog.send(this.mContext, Maps.of("action", body.command, SnifferDBHelper.COLUMN_LOG, "listener_null"));
                }
                if (TextUtils.equals("cancel", body.command)) {
                    this.mCacheMessage = str;
                    this.mLocalCacheTime = System.currentTimeMillis();
                    return body;
                }
            }
            return body;
        } catch (Exception e) {
            Logger.e(e.getMessage());
            return null;
        }
    }

    public String getCacheMessageJson() {
        return this.mCacheMessage;
    }

    public long getCacheTime() {
        return this.mLocalCacheTime;
    }

    public void clearCachedMessage() {
        this.mCacheMessage = null;
        this.mLocalCacheTime = 0L;
    }

    public void clearListener() {
        this.mNewMessageListener = null;
        stop();
        this.mContext = null;
        instance = null;
    }

    public void start(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mOrderId = str;
            this.isLineUp = z;
            this.isStop = false;
            if (this.mHandler == null) {
                this.mHandler = Handlers.newHandler(this.mContext);
            }
            doDelayTask();
        } catch (Exception e) {
            Logger.e("New Message Start error:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doDelayTask() {
        if (this.mHandler != null) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.hhmedic.android.sdk.tim.NewMessage.1
                @Override // java.lang.Runnable
                public void run() {
                    NewMessage.this.doQueryMessage();
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doQueryMessage() {
        if (this.isStop) {
            return;
        }
        if (this.isLineUp) {
            queryQueue();
        } else {
            queryTurnCall();
        }
    }

    private void queryTurnCall() {
        try {
            if (TextUtils.isEmpty(this.mOrderId)) {
                return;
            }
            HHNetFetch.request(this.mContext, new TurnCallConfig(Maps.of(Constants.EventConstants.KEY_ORDER_ID, this.mOrderId)), new HHGsonRequest.OnNetListener<String>() { // from class: com.hhmedic.android.sdk.tim.NewMessage.2
                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onSuccess(String str) {
                    NewMessage.this.doGetMessage(str);
                }

                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onFail(String str, int i) {
                    NewMessage.this.doGetMessage(null);
                }
            });
        } catch (Exception e) {
            Logger.e("queryTurnCall:error=" + e.getMessage());
        }
    }

    private void queryQueue() {
        try {
            if (TextUtils.isEmpty(this.mOrderId)) {
                return;
            }
            HHNetFetch.request(this.mContext, new QueueInfoConfig(Maps.of(Constants.EventConstants.KEY_ORDER_ID, this.mOrderId)), new HHGsonRequest.OnNetListener<String>() { // from class: com.hhmedic.android.sdk.tim.NewMessage.3
                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onSuccess(String str) {
                    Body parserCustomMessage;
                    try {
                        if ((TextUtils.isEmpty(str) || (parserCustomMessage = NewMessage.this.parserCustomMessage(str)) == null || !TextUtils.equals("dispatchDoctorByONS", parserCustomMessage.command)) && !NewMessage.this.isStop) {
                            NewMessage.this.doDelayTask();
                        }
                    } catch (Exception e) {
                        Logger.e("doGetMessage error:" + e.getMessage());
                    }
                }

                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onFail(String str, int i) {
                    NewMessage.this.doGetMessage(null);
                }
            });
        } catch (Exception e) {
            Logger.e("queryTurnCall:error=" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doGetMessage(String str) {
        Body parserCustomMessage;
        try {
            if (!TextUtils.isEmpty(str) && (parserCustomMessage = parserCustomMessage(str)) != null && (TextUtils.equals(parserCustomMessage.command, "transfer") || TextUtils.equals(parserCustomMessage.command, Command.agent_transfer))) {
                stop();
            } else if (this.isStop) {
            } else {
                doDelayTask();
            }
        } catch (Exception e) {
            Logger.e("doGetMessage error:" + e.getMessage());
        }
    }

    public void stop() {
        this.isStop = true;
        Logger.e("now stop doQueryMessage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TurnCallConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/sdk/order/turnCallInfo";
        }

        public TurnCallConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<String>>() { // from class: com.hhmedic.android.sdk.tim.NewMessage.TurnCallConfig.1
            }.getType();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class QueueInfoConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/sdk/order/queueInfo";
        }

        public QueueInfoConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<String>>() { // from class: com.hhmedic.android.sdk.tim.NewMessage.QueueInfoConfig.1
            }.getType();
        }
    }
}
