package com.meituan.android.common.sniffer;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.sniffer.bean.Constants;
import com.meituan.android.common.sniffer.bear.Bear;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Sniffer {
    private static boolean debugMode = false;
    private static IEnvGetter iEnvGetter = null;
    private static SnifferConfig iSnifferConfig = null;
    private static volatile boolean isInit = false;
    private static volatile boolean isSnifferConfigReady = false;
    private Context context;

    @WorkerThread
    @Deprecated
    public static void init(Context context, IEnvGetter iEnvGetter2) {
    }

    private Sniffer() {
    }

    @Deprecated
    public static IEnvGetter getIEnvGetter() {
        return iEnvGetter;
    }

    public static SnifferConfig getSnifferConfig() {
        if (!isInit || iSnifferConfig == null) {
            return new SnifferConfig() { // from class: com.meituan.android.common.sniffer.Sniffer.1
            };
        }
        return iSnifferConfig;
    }

    public static Context getContext() {
        return ContextHolder.getInstance().getContext();
    }

    public static boolean isDebugMode() {
        return debugMode;
    }

    public static void setDebugMode(boolean z) {
        debugMode = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasInited() {
        return isInit;
    }

    @WorkerThread
    public static void init(Context context, SnifferConfig snifferConfig) {
        if (context == null || isSnifferConfigReady) {
            return;
        }
        synchronized (Sniffer.class) {
            if (isInit) {
                if (!isSnifferConfigReady) {
                    iSnifferConfig = snifferConfig;
                    isSnifferConfigReady = true;
                }
                return;
            }
            isInit = true;
            Bear bear = new Bear();
            if (bear.init(context)) {
                iSnifferConfig = snifferConfig;
                SnifferProxy.sniffer = bear;
            } else {
                ContextHolder.getInstance().updateContext(context);
                AppBus.getInstance().init((Application) context.getApplicationContext());
                iSnifferConfig = snifferConfig;
                Reporter.init(context);
                ConfigManager.init(context);
                SnifferProxy.sniffer = new SnifferImpl(ContextHolder.getInstance().getContext());
            }
            isSnifferConfigReady = true;
        }
    }

    @Deprecated
    public static void normal(@NonNull String str, String str2) {
        normal(str, str2, 1L);
    }

    @Deprecated
    public static void normal(@NonNull String str, String str2, long j) {
        if (SnifferProxy.sniffer != null) {
            SnifferProxy.sniffer.normal(Constants.DEFAULT_BUSINESS, str, str2, j);
        }
    }

    @Deprecated
    public static void smell(@NonNull String str, String str2) {
        smell(str, str2, null);
    }

    @Deprecated
    public static void smell(@NonNull String str, String str2, String str3) {
        smell(str, str2, str3, (String) null, new Object[0]);
    }

    @Deprecated
    public static void smell(@NonNull String str, String str2, String str3, String str4, Object... objArr) {
        if (SnifferProxy.sniffer != null) {
            SnifferProxy.sniffer.smell(Constants.DEFAULT_BUSINESS, str, str2, str3, str4);
        }
    }

    public static void normal(@NonNull String str, @NonNull String str2, String str3) {
        normal(str, str2, str3, null);
    }

    public static void normal(@NonNull String str, @NonNull String str2, String str3, String str4) {
        normal(str, str2, str3, str4, 1L, null);
    }

    public static void normal(@NonNull String str, @NonNull String str2, String str3, String str4, Map<String, String> map) {
        normal(str, str2, str3, str4, 1L, map);
    }

    public static void normal(@NonNull String str, @NonNull String str2, String str3, String str4, long j, Map<String, String> map) {
        normal(str, str2, "", str3, str4, j, map);
    }

    public static void normal(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        if (SnifferProxy.sniffer != null) {
            SnifferProxy.sniffer.normal(str, str2, str3, str4, str5, j, map);
        }
    }

    public static void smell(@NonNull String str, @NonNull String str2, String str3, String str4, String str5) {
        smell(str, str2, str3, str4, str5, 1L);
    }

    public static void smell(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, long j) {
        smell(str, str2, str3, str4, str5, j, null);
    }

    public static void smell(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, Map<String, String> map) {
        smell(str, str2, str3, str4, str5, 1L, map);
    }

    public static void smell(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        smell(str, str2, "", str3, str4, str5, j, map);
    }

    public static void smell(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, long j, Map<String, String> map) {
        if (SnifferProxy.sniffer != null) {
            SnifferProxy.sniffer.smell(str, str2, str3, str4, str5, str6, j, map);
        }
    }
}
