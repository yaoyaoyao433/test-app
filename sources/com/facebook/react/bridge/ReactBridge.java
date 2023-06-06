package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.systrace.a;
import com.meituan.android.soloader.k;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactBridge {
    private static final String[] RN_SO_FILES = {"libc++_shared.so", "libfb.so", "libfolly_json.so", "libglog_init.so", "libglog.so", "libj2v8.so", "libjscexecutor.so", "libjsinspector.so", "libmtv8.so", "libv8.mt.so", "libreactnative.so", "libreactnativeblob.so", "libreactnativejni.so", "libv8.so", "libyoga.so", "libmrnjscexecutor.so"};
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (sDidInit) {
                return;
            }
            sLoadStartTime = SystemClock.uptimeMillis();
            a.a(0L, "ReactBridge.staticInit::load:reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            k.a("jscexecutor", new ArrayList(Arrays.asList(RN_SO_FILES)));
            k.b("reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            a.a(0L);
            sLoadEndTime = SystemClock.uptimeMillis();
            sDidInit = true;
        }
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }
}
