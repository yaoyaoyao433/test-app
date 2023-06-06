package com.tencent.liteav.basic.log;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.g;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCLog {
    public static final int LOG_ASYNC = 0;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 4;
    public static final int LOG_FATAL = 5;
    public static final int LOG_INFO = 2;
    public static final int LOG_NONE = 6;
    public static final int LOG_SYNC = 1;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARNING = 3;
    private static boolean mEnableCompress = true;
    private static String mLogCacheDir = "";
    public static String mLogDir = "";
    private static final Object mLogLock = new Object();
    private static boolean mHasInit = false;
    private static a mListener = null;
    private static int mLogLevel = 0;
    private static boolean mEnableConsole = true;
    private static boolean mEnableCallback = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, String str, String str2);
    }

    private static native void nativeEnableCallback(boolean z);

    private static native void nativeLog(int i, String str, String str2, int i2, String str3, String str4);

    private static native void nativeLogClose();

    private static native void nativeLogInit();

    private static native void nativeLogOpen(int i, String str, String str2, String str3, boolean z);

    private static native void nativeLogSetConsole(boolean z);

    private static native void nativeLogSetLevel(int i);

    public static boolean init() {
        File externalFilesDir;
        if (mHasInit) {
            return true;
        }
        synchronized (mLogLock) {
            if (mHasInit) {
                return true;
            }
            boolean f = g.f();
            Context appContext = TXCCommonUtil.getAppContext();
            if (f && appContext != null) {
                if (TextUtils.isEmpty(mLogDir) && (externalFilesDir = appContext.getExternalFilesDir(null)) != null) {
                    mLogDir = externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
                }
                mLogCacheDir = appContext.getFilesDir().getAbsolutePath() + "/log/tencent/liteav";
                StringBuilder sb = new StringBuilder("TXCLog init log file path : ");
                sb.append(mLogDir);
                sb.append(", cache : ");
                sb.append(mLogCacheDir);
                nativeLogInit();
                nativeLogSetLevel(mLogLevel);
                nativeLogSetConsole(mEnableConsole);
                nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
                nativeEnableCallback(mEnableCallback);
                mHasInit = true;
            }
            return mHasInit;
        }
    }

    public static void log(int i, String str, String str2) {
        if (init()) {
            nativeLog(i, str, "", 0, "", str2);
        }
        log_callback(i, str, str2);
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        if (mHasInit) {
            nativeLogSetLevel(mLogLevel);
        }
    }

    public static void setLogDirPath(String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(mLogDir)) {
            return;
        }
        mLogDir = str;
        if (mHasInit) {
            new StringBuilder("TXCLog setLogDirPath ").append(str);
            nativeLogClose();
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    public static void sliceLogFile() {
        if (mHasInit) {
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    public static void setLogCompressEnabled(boolean z) {
        if (mEnableCompress != z) {
            mEnableCompress = z;
            if (mHasInit) {
                nativeLogClose();
                nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
            }
        }
    }

    public static void setConsoleEnabled(boolean z) {
        mEnableConsole = z;
        if (mHasInit) {
            nativeLogSetConsole(mEnableConsole);
        }
    }

    public static void setListener(a aVar) {
        mListener = aVar;
        mEnableCallback = aVar != null;
        if (mHasInit) {
            nativeEnableCallback(mEnableCallback);
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        log(0, str, String.format(str2, objArr));
    }

    public static void d(String str, String str2, Object... objArr) {
        log(1, str, String.format(str2, objArr));
    }

    public static void i(String str, String str2, Object... objArr) {
        log(2, str, String.format(str2, objArr));
    }

    public static void w(String str, String str2, Object... objArr) {
        log(3, str, String.format(str2, objArr));
    }

    public static void e(String str, String str2, Object... objArr) {
        log(4, str, String.format(str2, objArr));
    }

    public static void v(String str, String str2) {
        log(0, str, str2);
    }

    public static void d(String str, String str2) {
        log(1, str, str2);
    }

    public static void i(String str, String str2) {
        log(2, str, str2);
    }

    public static void w(String str, String str2) {
        log(3, str, str2);
    }

    public static void e(String str, String str2) {
        log(4, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        e(str, str2 + "\n" + stringWriter.toString());
    }

    private static void log_callback(int i, String str, String str2) {
        if (mListener != null) {
            mListener.a(i, str, str2);
        }
    }
}
