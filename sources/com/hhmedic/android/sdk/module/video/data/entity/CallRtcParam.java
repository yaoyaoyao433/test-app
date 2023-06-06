package com.hhmedic.android.sdk.module.video.data.entity;

import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallRtcParam implements Serializable {
    public String orderId;
    public long uuid;

    public CallRtcParam(long j, String str) {
        this.uuid = j;
        this.orderId = str;
    }
}
