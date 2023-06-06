package com.sankuai.titans.protocol.utils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface HttpAuthHandler {
    void cancel();

    void proceed(String str, String str2);

    boolean useHttpAuthUsernamePassword();
}
