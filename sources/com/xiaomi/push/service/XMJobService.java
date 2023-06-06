package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.em;
/* loaded from: classes6.dex */
public class XMJobService extends Service {
    static Service a;
    private IBinder b = null;

    @TargetApi(21)
    /* loaded from: classes6.dex */
    public static class a extends JobService {
        Binder a;
        private Handler b;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static class HandlerC1518a extends Handler {
            JobService a;

            HandlerC1518a(JobService jobService) {
                super(jobService.getMainLooper());
                this.a = jobService;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                com.xiaomi.channel.commonutils.logger.c.a("Job finished " + jobParameters.getJobId());
                this.a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    em.a(false);
                }
            }
        }

        a(Service service) {
            this.a = null;
            this.a = (Binder) com.xiaomi.push.am.a((Object) this, "onBind", new Intent());
            com.xiaomi.push.am.a((Object) this, "attachBaseContext", service);
        }

        @Override // android.app.Service
        public void onCreate() {
            com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
            super.onCreate();
        }

        @Override // android.app.Service
        public void onDestroy() {
            com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
            super.onDestroy();
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.c.a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.b == null) {
                this.b = new HandlerC1518a(this);
            }
            this.b.sendMessage(Message.obtain(this.b, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.c.a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.b != null ? this.b : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.b = new a(this).a;
        }
        a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
        a = null;
    }
}
