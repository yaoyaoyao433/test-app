package com.meituan.android.common.badge;

import android.annotation.SuppressLint;
import android.app.Application;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.badge.Strategy;
import com.meituan.android.common.badge.data.DBHelper;
import com.meituan.android.common.badge.log.DefaultLogger;
import com.meituan.android.common.badge.log.Logger;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BadgeEngine {
    private static final String SP_KEY_ID = "id";
    private static final String SP_KEY_LAST_SYNC_STAMP = "l_s_t_s";
    private static final String SP_NAME = "badge";
    private static final String TAG = "badge_engine";
    public static final String TAG_PREFIX = "badge_";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Application sAppCtx;
    private static String sId;
    private static volatile BadgeEngine sInstance;
    private int autoSyncCount;
    private q cipStorageCenter;
    private final DataOperator dataOperator;
    private final JobScheduler scheduler;
    private final Strategy strategy;

    @SuppressLint({"ApplySharedPref"})
    public BadgeEngine(Application application, BadgeProducer badgeProducer, Strategy strategy) {
        Object[] objArr = {application, badgeProducer, strategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93de614b361b7165b1e0589c7ef69e1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93de614b361b7165b1e0589c7ef69e1b");
            return;
        }
        this.cipStorageCenter = q.a(application, "mtplatform_badge", 1);
        this.strategy = strategy;
        this.scheduler = new JobScheduler();
        this.dataOperator = new DataOperator(badgeProducer);
        String b = this.cipStorageCenter.b("id", (String) null);
        if (b == null) {
            b = UUID.randomUUID().toString();
            this.cipStorageCenter.a("id", b);
            if (strategy.strictMode || strategy.logLevel > 0) {
                Logger logger = strategy.logger;
                logger.debug(TAG, "generate>>>> new badge id: " + b);
            }
        }
        sId = b;
        sAppCtx = application;
    }

    private static BadgeEngine create(Application application, BadgeProducer badgeProducer, Strategy strategy) {
        Object[] objArr = {application, badgeProducer, strategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bb997da7f19c2e8653182f52558711a", RobustBitConfig.DEFAULT_VALUE)) {
            return (BadgeEngine) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bb997da7f19c2e8653182f52558711a");
        }
        if (sInstance == null) {
            synchronized (BadgeEngine.class) {
                if (sInstance == null) {
                    BadgeEngine badgeEngine = new BadgeEngine(application, badgeProducer, strategy);
                    sInstance = badgeEngine;
                    badgeEngine.scheduler.start();
                    DBHelper.create(application);
                }
            }
        }
        return sInstance;
    }

    public static boolean register(Application application, BadgeProducer badgeProducer, Strategy strategy) {
        int i;
        Strategy strategy2 = strategy;
        Object[] objArr = {application, badgeProducer, strategy2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4751f0e896ccdafb648ca1d9cea855d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4751f0e896ccdafb648ca1d9cea855d")).booleanValue();
        }
        try {
            if (shouldLog(0)) {
                verbose(TAG, "register strategy: " + strategy2);
            }
            if (application != null && badgeProducer != null) {
                if (sInstance != null) {
                    if (shouldLog(2)) {
                        warn(TAG, "already registered");
                    }
                    return false;
                }
                if (strategy2 == null) {
                    strategy2 = new Strategy.Builder().build();
                    if (shouldLog(2)) {
                        warn(TAG, "use default strategy: " + strategy2);
                    }
                }
                BadgeConfig.pullConfig(application);
                if (!BadgeConfig.sBadgeOn) {
                    if (shouldLog(2)) {
                        warn(TAG, "badge off");
                    }
                    return false;
                }
                create(application, badgeProducer, strategy2).scheduler.putOnceJob(new Runnable() { // from class: com.meituan.android.common.badge.BadgeEngine.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d88175c2f78e8530f4e8ca1d8c387ec7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d88175c2f78e8530f4e8ca1d8c387ec7");
                            return;
                        }
                        BadgeEngine badgeEngine = BadgeEngine.sInstance;
                        DataOperator dataOperator = badgeEngine.dataOperator;
                        Strategy strategy3 = badgeEngine.strategy;
                        if (dataOperator.hasUrgentInfoUpdated()) {
                            if (BadgeEngine.shouldLog(2)) {
                                BadgeEngine.warn(BadgeEngine.TAG, "start synchronize after register");
                            }
                            BadgeEngine.synchronizeAndRecordStamp(dataOperator, badgeEngine.cipStorageCenter);
                        }
                        z = (strategy3.forceLifeCycleCheck || ProcessUtils.isMainProcess(BadgeEngine.sAppCtx)) ? true : true;
                        if (BadgeEngine.shouldLog(1)) {
                            BadgeEngine.debug(BadgeEngine.TAG, "use life cycle check: " + z);
                        }
                        if (z) {
                            badgeEngine.startLifeCycleCheckJob();
                        } else {
                            badgeEngine.startIntervalCheckJob();
                        }
                        badgeEngine.startIntervalSyncJob(strategy3.baseAutoSyncInterval);
                    }
                });
                return true;
            }
            i = 3;
            try {
                if (shouldLog(3)) {
                    error(TAG, new BadgeException("null context or null producer"));
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (shouldLog(i)) {
                    error(TAG, new BadgeException(th));
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startIntervalCheckJob() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a0e2c07a4e3c966a247d1107d993f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a0e2c07a4e3c966a247d1107d993f5a");
        } else {
            this.scheduler.putIntervalJob(new Runnable() { // from class: com.meituan.android.common.badge.BadgeEngine.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9717eccfecf4e6cb36df9484cf62ab6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9717eccfecf4e6cb36df9484cf62ab6");
                        return;
                    }
                    boolean hasUrgentInfoUpdated = BadgeEngine.this.dataOperator.hasUrgentInfoUpdated();
                    if (BadgeEngine.shouldLog(1)) {
                        BadgeEngine.debug(BadgeEngine.TAG, "interval check, has updated: " + hasUrgentInfoUpdated);
                    }
                    if (hasUrgentInfoUpdated) {
                        BadgeEngine.synchronizeAndRecordStamp(BadgeEngine.this.dataOperator, BadgeEngine.this.cipStorageCenter);
                    }
                }
            }, this.strategy.updateCheckInterval);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLifeCycleCheckJob() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f1ce17323df8fd80fb4b3d3e5a89c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f1ce17323df8fd80fb4b3d3e5a89c65");
        } else {
            AppBus.getInstance().register(new AppBus.OnBackgroundListener() { // from class: com.meituan.android.common.badge.BadgeEngine.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
                public void onBackground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b0f7442ff79afb111b6044317a04390e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b0f7442ff79afb111b6044317a04390e");
                    } else {
                        BadgeEngine.this.scheduler.putOnceJob(new Runnable() { // from class: com.meituan.android.common.badge.BadgeEngine.3.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "04ec1cc2ee5218ece1c97fb21304e696", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "04ec1cc2ee5218ece1c97fb21304e696");
                                    return;
                                }
                                boolean hasUrgentInfoUpdated = BadgeEngine.this.dataOperator.hasUrgentInfoUpdated();
                                if (BadgeEngine.shouldLog(1)) {
                                    BadgeEngine.debug(BadgeEngine.TAG, "lifecycle check, has updated: " + hasUrgentInfoUpdated);
                                }
                                if (hasUrgentInfoUpdated) {
                                    BadgeEngine.synchronizeAndRecordStamp(BadgeEngine.this.dataOperator, BadgeEngine.this.cipStorageCenter);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startIntervalSyncJob(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db6af1a37e6e06eecfee7e464be5c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db6af1a37e6e06eecfee7e464be5c6f");
        } else {
            this.scheduler.putOnceJob(new Runnable() { // from class: com.meituan.android.common.badge.BadgeEngine.4
                public static ChangeQuickRedirect changeQuickRedirect;
                public long minSyncElapse;

                {
                    this.minSyncElapse = BadgeEngine.this.strategy.baseAutoSyncInterval;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "44f8c1d293f01daf41b5b52bfb9a16b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "44f8c1d293f01daf41b5b52bfb9a16b3");
                        return;
                    }
                    int i = BadgeEngine.this.strategy.autoSyncLimit;
                    if (BadgeEngine.this.autoSyncCount < i) {
                        long abs = Math.abs(System.currentTimeMillis() - BadgeEngine.this.cipStorageCenter.b(BadgeEngine.SP_KEY_LAST_SYNC_STAMP, Long.MIN_VALUE));
                        if (abs >= this.minSyncElapse) {
                            if (BadgeEngine.shouldLog(2)) {
                                BadgeEngine.warn(BadgeEngine.TAG, "auto synchronize, count: " + BadgeEngine.this.autoSyncCount + " min elapse: " + this.minSyncElapse + " elapse: " + abs);
                            }
                            BadgeEngine.synchronizeAndRecordStamp(BadgeEngine.this.dataOperator, BadgeEngine.this.cipStorageCenter);
                            BadgeEngine.this.autoSyncCount++;
                            this.minSyncElapse = Math.min(BadgeEngine.this.strategy.maxAutoSyncInterval, (long) (Math.pow(2.0d, BadgeEngine.this.autoSyncCount) * BadgeEngine.this.strategy.baseAutoSyncInterval));
                        }
                    }
                    if (BadgeEngine.this.autoSyncCount < i) {
                        BadgeEngine.this.scheduler.putOnceJob(this, this.minSyncElapse);
                    }
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ApplySharedPref"})
    public static void synchronizeAndRecordStamp(DataOperator dataOperator, q qVar) {
        Object[] objArr = {dataOperator, qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87e7d3bb1e1216e1a580e497fae3b041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87e7d3bb1e1216e1a580e497fae3b041");
            return;
        }
        BadgeReporter.report(dataOperator.persistAndGet());
        qVar.a(SP_KEY_LAST_SYNC_STAMP, System.currentTimeMillis());
    }

    public static boolean shouldLog(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94957983832aba133a9336c0da91a9d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94957983832aba133a9336c0da91a9d8")).booleanValue();
        }
        if (strictMode()) {
            return true;
        }
        return i >= (sInstance == null ? 2 : sInstance.strategy.logLevel);
    }

    private static boolean strictMode() {
        return sInstance != null && sInstance.strategy.strictMode;
    }

    public static void verbose(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a8d31329472b5fa3db82dfd43a643ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a8d31329472b5fa3db82dfd43a643ca");
        } else {
            log(0, str, str2, null);
        }
    }

    public static void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acc4062093c551e3fdba22490e09f2b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acc4062093c551e3fdba22490e09f2b0");
        } else {
            log(1, str, str2, null);
        }
    }

    public static void warn(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e029122075df7731d6f2da7de010395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e029122075df7731d6f2da7de010395");
        } else {
            log(2, str, str2, null);
        }
    }

    public static void error(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e84e2d90c0b1802bbf35c7ee4b441b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e84e2d90c0b1802bbf35c7ee4b441b9");
        } else {
            log(3, str, str2, null);
        }
    }

    public static void error(String str, BadgeException badgeException) {
        Object[] objArr = {str, badgeException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0829a9ff981f0ff5cad7bb9f74628f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0829a9ff981f0ff5cad7bb9f74628f41");
        } else {
            log(3, str, null, badgeException);
        }
    }

    private static void log(int i, String str, String str2, BadgeException badgeException) {
        Object[] objArr = {Integer.valueOf(i), str, str2, badgeException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "547f8cc49616fce10d40edb98f92c318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "547f8cc49616fce10d40edb98f92c318");
            return;
        }
        Logger logger = sInstance != null ? sInstance.strategy.logger : null;
        if (logger == null) {
            logger = new DefaultLogger();
        }
        if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 0:
                    logger.verbose(str, str2);
                    return;
                case 1:
                    logger.debug(str, str2);
                    return;
                case 2:
                    if (strictMode()) {
                        logger.error(str, str2);
                        return;
                    } else {
                        logger.warn(str, str2);
                        return;
                    }
                case 3:
                    if (strictMode()) {
                        if (badgeException != null) {
                            throw badgeException;
                        }
                        throw new BadgeException(str2);
                    } else if (badgeException == null) {
                        logger.error(str, str2);
                        return;
                    } else {
                        logger.error(str, str2, badgeException);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public static String id() {
        return sId;
    }

    public static boolean reallySynchronize() {
        return sInstance != null && sInstance.strategy.reallySynchronize;
    }
}
