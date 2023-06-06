package com.sankuai.titans.adapter.base;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.IJsBridgeManager;
import com.sankuai.titans.protocol.services.ICookieService;
import com.sankuai.titans.protocol.services.ILoggerManager;
import com.sankuai.titans.protocol.services.IServiceManager;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.IStorageService;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.services.IToastService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class TitansServiceManager implements IServiceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IJsBridgeManager jsBridgeVerificationService;
    private final ILoggerManager loggerManager;
    private final IStatisticsService statisticsService;
    private final IStorageService storageService;

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    public abstract ICookieService getCookieService();

    public TitansServiceManager(Context context, IServiceManagerConfig iServiceManagerConfig) {
        Object[] objArr = {context, iServiceManagerConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7cba91793a81740c58cc2ecfb0780b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7cba91793a81740c58cc2ecfb0780b");
            return;
        }
        this.loggerManager = new TitansLoggerManagerService(iServiceManagerConfig.isDebugMode());
        this.statisticsService = new TitansStatisticsService(context, iServiceManagerConfig);
        TitansStorageService titansStorageService = new TitansStorageService(context);
        titansStorageService.canStorageReport(iServiceManagerConfig.isDebugMode());
        this.storageService = titansStorageService;
        this.jsBridgeVerificationService = new JsBridgeManagerImpl(this.statisticsService);
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    @NonNull
    public IThreadPoolService getThreadPoolService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6bbdb00bc63fcf0a487fef54cb0fad7", RobustBitConfig.DEFAULT_VALUE) ? (IThreadPoolService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6bbdb00bc63fcf0a487fef54cb0fad7") : new ThreadPoolService();
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    @NonNull
    public IToastService getToastService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d307fdc6383508079bbd5570f9ddf55", RobustBitConfig.DEFAULT_VALUE) ? (IToastService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d307fdc6383508079bbd5570f9ddf55") : new ToastService(getThreadPoolService());
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    @NonNull
    public ILoggerManager getLoggerManager() {
        return this.loggerManager;
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    @NonNull
    public IStatisticsService getStatisticsService() {
        return this.statisticsService;
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    public IStorageService getStorageService() {
        return this.storageService;
    }

    @Override // com.sankuai.titans.protocol.services.IServiceManager
    public IJsBridgeManager getJsBridgeVerificationService() {
        return this.jsBridgeVerificationService;
    }
}
