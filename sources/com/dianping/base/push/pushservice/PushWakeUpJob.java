package com.dianping.base.push.pushservice;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes.dex */
public class PushWakeUpJob extends JobService {
    public static ChangeQuickRedirect a;

    public static void a(Context context) {
        int schedule;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e7343b0996bbf21f353485ff2b41f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e7343b0996bbf21f353485ff2b41f8");
        } else if (context == null) {
        } else {
            try {
                JobInfo.Builder builder = new JobInfo.Builder(101, new ComponentName(context.getApplicationContext(), PushWakeUpJob.class));
                long j = 120000;
                try {
                    long a2 = e.a(context).a("wakeUpInterval", 0) * 1000;
                    if (a2 > 0) {
                        j = a2;
                    }
                } catch (Exception e) {
                    c.d("PushWakeUpJob", e.toString());
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    if (j < JobInfo.getMinPeriodMillis()) {
                        c.c("PushWakeUpJob", "Requested interval " + j + "ms for job(JobId=101) is too small; raising to " + JobInfo.getMinPeriodMillis() + "ms");
                    }
                    if (j < JobInfo.getMinFlexMillis()) {
                        c.c("PushWakeUpJob", "Requested flex " + j + "ms for job(JobId=101) is too small; raising to " + JobInfo.getMinFlexMillis() + "ms");
                    }
                }
                builder.setPeriodic(j);
                builder.setRequiredNetworkType(1);
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler == null || (schedule = jobScheduler.schedule(builder.build())) > 0) {
                    return;
                }
                c.d("PushWakeUpJob", "schedule PushWakeUpJob failed, code: " + schedule);
            } catch (Throwable th) {
                c.d("PushWakeUpJob", th.toString());
            }
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9cd825969898f022ac5567a9e74b15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9cd825969898f022ac5567a9e74b15c");
        } else if (context == null) {
        } else {
            try {
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    jobScheduler.cancel(101);
                }
            } catch (Throwable th) {
                c.d("PushWakeUpJob", th.toString());
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438b32ce413e795579d02178edf2f2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438b32ce413e795579d02178edf2f2c3");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        c.b("PushWakeUpJob", "onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a028f951428ae3f6cc6cd95ef46e85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a028f951428ae3f6cc6cd95ef46e85")).booleanValue();
        }
        c.b("PushWakeUpJob", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0345de6dd1768f991110251d4dbe46a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0345de6dd1768f991110251d4dbe46a5");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        c.b("PushWakeUpJob", "onDestroy");
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Object[] objArr = {jobParameters};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00712c3d5f5eb50064f7644a4a7789c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00712c3d5f5eb50064f7644a4a7789c6")).booleanValue();
        }
        c.b("PushWakeUpJob", "onStartJob");
        f.a(getApplicationContext(), "PushWakeUpJob");
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Object[] objArr = {jobParameters};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6340e6a72154db0c9613b9476256aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6340e6a72154db0c9613b9476256aa")).booleanValue();
        }
        c.b("PushWakeUpJob", "onStopJob");
        return false;
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        JobInfo jobInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "391d536420335589a1371379a1b561dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "391d536420335589a1371379a1b561dc")).booleanValue();
        }
        if (context == null) {
            c.d("PushWakeUpJob", "context should not be null!");
            return false;
        } else if (Build.VERSION.SDK_INT < 21) {
            return false;
        } else {
            try {
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        jobInfo = jobScheduler.getPendingJob(101);
                    } else {
                        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                        int i = 0;
                        while (true) {
                            if (i < allPendingJobs.size()) {
                                JobInfo jobInfo2 = allPendingJobs.get(i);
                                if (jobInfo2 != null && jobInfo2.getId() == 101) {
                                    jobInfo = jobInfo2;
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (jobInfo != null && jobInfo.getId() == 101) {
                    if (new ComponentName(context.getApplicationContext(), PushWakeUpJob.class).equals(jobInfo.getService())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                c.d("PushWakeUpJob", th.toString());
                return false;
            }
        }
    }
}
