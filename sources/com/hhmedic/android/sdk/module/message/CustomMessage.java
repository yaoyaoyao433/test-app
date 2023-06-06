package com.hhmedic.android.sdk.module.message;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomMessage {
    private static CustomMessage instance;
    private CacheMessage mCache;
    private OnMessageListener mListener;

    private CustomMessage() {
    }

    public static CustomMessage getInstance() {
        CustomMessage customMessage;
        synchronized (CustomMessage.class) {
            if (instance == null) {
                instance = new CustomMessage();
            }
            customMessage = instance;
        }
        return customMessage;
    }

    public void clear() {
        this.mListener = null;
    }

    public void addListener(OnMessageListener onMessageListener) {
        this.mListener = onMessageListener;
        if (this.mCache == null || onMessageListener == null) {
            return;
        }
        onMessageListener.onMessage(this.mCache.body, this.mCache.json);
        this.mCache = null;
    }

    public void send(Body body, String str) {
        if (this.mListener != null) {
            this.mListener.onMessage(body, str);
        } else {
            cacheMessage(body, str);
        }
    }

    private void cacheMessage(Body body, String str) {
        if (body == null || !TextUtils.equals(body.command, Command.lineup_waitUserInfo)) {
            return;
        }
        this.mCache = new CacheMessage(body, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CacheMessage {
        Body body;
        String json;

        CacheMessage(Body body, String str) {
            this.body = body;
            this.json = str;
        }
    }
}
