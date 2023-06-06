package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoginProtoACK implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int defaultTimeout;
    private String deviceId;
    private int maxConnectInterval;
    private int maxConnectRetry;
    private int maxMessageRetry;
    private int maxTimeout;
    private int minTimeout;
    private long serverTime;
    private byte status;
    private String token;

    public String getToken() {
        return this.token;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public int getMinTimeout() {
        return this.minTimeout;
    }

    public int getMaxTimeout() {
        return this.maxTimeout;
    }

    public int getDefaultTimeout() {
        return this.defaultTimeout;
    }

    public int getMaxMessageRetry() {
        return this.maxMessageRetry;
    }

    public int getMaxConnectRetry() {
        return this.maxConnectRetry;
    }

    public int getMaxConnectInterval() {
        return this.maxConnectInterval;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public byte getStatus() {
        return this.status;
    }
}
