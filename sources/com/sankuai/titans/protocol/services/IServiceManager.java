package com.sankuai.titans.protocol.services;

import android.support.annotation.NonNull;
import com.sankuai.titans.protocol.jsbridge.IJsBridgeManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IServiceManager {
    ICookieService getCookieService();

    IJsBridgeManager getJsBridgeVerificationService();

    @NonNull
    ILoggerManager getLoggerManager();

    @NonNull
    IStatisticsService getStatisticsService();

    IStorageService getStorageService();

    @NonNull
    IThreadPoolService getThreadPoolService();

    @NonNull
    IToastService getToastService();
}
