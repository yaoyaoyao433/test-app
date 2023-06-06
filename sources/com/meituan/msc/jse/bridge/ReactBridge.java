package com.meituan.msc.jse.bridge;

import android.os.SystemClock;
import com.meituan.android.soloader.k;
import com.meituan.msc.systrace.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactBridge {
    private static final String[] RN_SO_FILES = {"libc++_shared.so", "libfb.so", "libfolly_json.so", "libglog_init.so", "libglog.so", "libj2v8.so", "libmscexecutor.so", "libmtv8.so", "libv8.mt.so", "libmsc.so", "libmscjni.so", "libv8.so", "libyoga.so"};
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da1851e16bb14c89358c559159176033", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da1851e16bb14c89358c559159176033");
            } else if (sDidInit) {
            } else {
                sLoadStartTime = SystemClock.uptimeMillis();
                a.a(0L, "ReactBridge.staticInit::load:reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
                k.a("mscexecutor", new ArrayList(Arrays.asList(RN_SO_FILES)));
                k.b("mscjni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
                a.a(0L);
                sLoadEndTime = SystemClock.uptimeMillis();
                sDidInit = true;
            }
        }
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }
}
