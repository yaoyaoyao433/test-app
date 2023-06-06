package com.meituan.android.common.badge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class JobScheduler {
    private static final String TAG = "badge_js";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ScheduledExecutorService handler;

    public final void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fd0cc99606b9e21de1a3ee9f8e47fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fd0cc99606b9e21de1a3ee9f8e47fd5");
        } else {
            this.handler = c.c("badge");
        }
    }

    public final void putOnceJob(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53b513a02f782c1195447dbc52d0781d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53b513a02f782c1195447dbc52d0781d");
        } else {
            this.handler.execute(new Runnable() { // from class: com.meituan.android.common.badge.JobScheduler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0812ade7c5c608814074a690f0ecee8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0812ade7c5c608814074a690f0ecee8");
                    } else {
                        JobScheduler.this.executeRunnable(runnable);
                    }
                }
            });
        }
    }

    public final void putOnceJob(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a2c6f9e3f0a227560cd180a5f8b3d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a2c6f9e3f0a227560cd180a5f8b3d88");
        } else {
            this.handler.schedule(new Runnable() { // from class: com.meituan.android.common.badge.JobScheduler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "90252b58bcf0f15b9a8941795d1c9ed0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "90252b58bcf0f15b9a8941795d1c9ed0");
                    } else {
                        JobScheduler.this.executeRunnable(runnable);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeRunnable(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd9451a0bbb7b510dc9c66839aa83cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd9451a0bbb7b510dc9c66839aa83cc");
            return;
        }
        try {
            if (!BadgeConfig.sBadgeOn) {
                if (BadgeEngine.shouldLog(2)) {
                    BadgeEngine.warn(TAG, "badge off");
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            if (BadgeEngine.shouldLog(3)) {
                BadgeEngine.error(TAG, new BadgeException(th));
            }
        }
    }

    public final boolean putIntervalJob(final Runnable runnable, final long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b9a8cb34e566577aedc29845caf74ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b9a8cb34e566577aedc29845caf74ed")).booleanValue();
        }
        this.handler.execute(new Runnable() { // from class: com.meituan.android.common.badge.JobScheduler.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4de46817b476be9e26bc9d8088168f59", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4de46817b476be9e26bc9d8088168f59");
                    return;
                }
                try {
                    if (!BadgeConfig.sBadgeOn) {
                        if (BadgeEngine.shouldLog(2)) {
                            BadgeEngine.warn(JobScheduler.TAG, "badge off");
                            return;
                        }
                        return;
                    }
                    runnable.run();
                    JobScheduler.this.handler.schedule(this, j, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    if (BadgeEngine.shouldLog(3)) {
                        BadgeEngine.error(JobScheduler.TAG, new BadgeException(th));
                    }
                }
            }
        });
        return true;
    }
}
