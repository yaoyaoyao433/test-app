package com.meituan.android.common.badge.log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface Logger {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_NONE = Integer.MAX_VALUE;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARN = 2;

    void debug(String str, String str2);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void verbose(String str, String str2);

    void warn(String str, String str2);
}
