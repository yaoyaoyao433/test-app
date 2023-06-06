package com.sankuai.titans.protocol.services;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ILogger {
    void debug(String str, String str2);

    void error(String str, String str2, Exception exc);

    void info(String str, String str2);

    void warn(String str, Exception exc);

    void warn(String str, String str2);
}
