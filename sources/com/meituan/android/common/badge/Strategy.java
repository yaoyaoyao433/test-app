package com.meituan.android.common.badge;

import com.meituan.android.common.badge.log.DefaultLogger;
import com.meituan.android.common.badge.log.Logger;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Strategy {
    public static final int DEFAULT_AUTO_SYNC_LIMIT = 3;
    public static final int DEFAULT_BASE_AUTO_SYNC_INTERVAL = 60000;
    public static final int DEFAULT_MAX_AUTO_SYNC_INTERVAL = 480000;
    public static final int DEFAULT_UPDATE_CHECK_INTERVAL = 30000;
    private static final String TAG = "badge_strategy";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int autoSyncLimit;
    public long baseAutoSyncInterval;
    public boolean forceLifeCycleCheck;
    public int logLevel;
    public Logger logger;
    public long maxAutoSyncInterval;
    public boolean reallySynchronize;
    public boolean strictMode;
    public long updateCheckInterval;

    public Strategy() {
        this.updateCheckInterval = 30000L;
        this.baseAutoSyncInterval = LocationStrategy.LOCATION_TIMEOUT;
        this.maxAutoSyncInterval = 480000L;
        this.autoSyncLimit = 3;
        this.logLevel = 2;
        this.strictMode = false;
        this.reallySynchronize = true;
        this.forceLifeCycleCheck = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Strategy strategy;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fe06f3127decce80160379de985a825", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fe06f3127decce80160379de985a825");
            } else {
                this.strategy = new Strategy();
            }
        }

        public Builder baseAutoSynchronizeInterval(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ab90395af090939bf2f3ce5f953a5b5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ab90395af090939bf2f3ce5f953a5b5");
            }
            if (j > 0) {
                this.strategy.baseAutoSyncInterval = j;
            }
            return this;
        }

        public Builder maxAutoSynchronizeInterval(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d8688042292c11a82a75e520885f393", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d8688042292c11a82a75e520885f393");
            }
            if (i < 0) {
                if (BadgeEngine.shouldLog(3)) {
                    BadgeEngine.error(Strategy.TAG, "inappropriate interval appeared: " + i);
                }
            } else {
                this.strategy.maxAutoSyncInterval = i;
            }
            return this;
        }

        public Builder autoSynchronizeLimit(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe5d1df59b8006d98002a5a5d22fcef", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe5d1df59b8006d98002a5a5d22fcef");
            }
            if (i < 0) {
                if (BadgeEngine.shouldLog(3)) {
                    BadgeEngine.error(Strategy.TAG, "inappropriate limit appeared: " + i);
                }
            } else {
                this.strategy.autoSyncLimit = i;
            }
            return this;
        }

        public Builder updateCheckInterval(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ac766b5a9037ce1333b019e283f02b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ac766b5a9037ce1333b019e283f02b");
            }
            if (j > 0) {
                this.strategy.updateCheckInterval = j;
            }
            return this;
        }

        public Builder logger(Logger logger) {
            this.strategy.logger = logger;
            return this;
        }

        public Builder logLevel(int i) {
            this.strategy.logLevel = i;
            return this;
        }

        public Builder strictMode(boolean z) {
            this.strategy.strictMode = z;
            return this;
        }

        public Builder reallySynchronize(boolean z) {
            this.strategy.reallySynchronize = z;
            return this;
        }

        public Builder forceLifeCycleCheck(boolean z) {
            this.strategy.forceLifeCycleCheck = z;
            return this;
        }

        public Strategy build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef7d531155d110b3670d12e018b52c19", RobustBitConfig.DEFAULT_VALUE)) {
                return (Strategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef7d531155d110b3670d12e018b52c19");
            }
            if (this.strategy.logger == null) {
                this.strategy.logger = new DefaultLogger();
            }
            return this.strategy;
        }
    }
}
