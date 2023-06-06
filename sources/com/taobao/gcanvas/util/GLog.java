package com.taobao.gcanvas.util;

import android.util.Log;
import com.taobao.gcanvas.GCanvasJNI;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GLog {
    public static final int LEVEL_ASSERT = 7;
    public static final int LEVEL_DEBUG = 3;
    public static final int LEVEL_ERROR = 6;
    public static final int LEVEL_FORCE = 0;
    public static final int LEVEL_INFO = 4;
    public static final int LEVEL_NULL = 9;
    public static final int LEVEL_VERBOSE = 2;
    public static final int LEVEL_WARN = 5;
    public static final String TAG = "CANVAS";
    public static int logLevel = 3;
    private static GCanvasTracer sGcanvasTracerClz;

    private static native void registerJavaTracer(GCanvasTracer gCanvasTracer);

    public static void bindGCanvasTracer(GCanvasTracer gCanvasTracer) {
        sGcanvasTracerClz = gCanvasTracer;
        registerJavaTracer(gCanvasTracer);
    }

    public static void setLevel(String str) {
        if (str == null) {
            return;
        }
        if (str.equals("force")) {
            logLevel = 0;
        } else if (str.equals("debug")) {
            logLevel = 3;
        } else if (str.equals("info")) {
            logLevel = 4;
        } else if (str.equals("warn")) {
            logLevel = 5;
        } else if (str.equals("error")) {
            logLevel = 6;
        } else if (str.equals("fatal")) {
            logLevel = 7;
        }
        GCanvasJNI.setLogLevel(str);
    }

    public static int getLevel() {
        return logLevel;
    }

    public static void force(String str, String str2) {
        Log.e(str, str2);
    }

    public static void i(String str) {
        i(TAG, str);
    }

    public static void i(String str, String str2) {
        if (logLevel == 0) {
            force(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (logLevel <= 4) {
            Log.i(str, str2, th);
        }
    }

    public static void d(String str) {
        d(TAG, str);
    }

    public static void d(String str, String str2) {
        if (logLevel == 0) {
            force(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (logLevel <= 3) {
            Log.i(str, str2, th);
        }
    }

    public static void e(String str) {
        e(TAG, str);
    }

    public static void e(String str, String str2) {
        if (logLevel <= 6) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (logLevel <= 6) {
            Log.e(str, str2, th);
        }
    }

    public static void w(String str) {
        w(TAG, str);
    }

    public static void w(String str, String str2) {
        if (logLevel == 0) {
            force(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (logLevel <= 5) {
            Log.w(str, str2, th);
        }
    }

    public static void v(String str) {
        v(TAG, str);
    }

    public static void v(String str, String str2) {
        if (logLevel == 0) {
            force(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (logLevel <= 2) {
            Log.v(str, str2, th);
        }
    }
}
