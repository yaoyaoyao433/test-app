package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class r {
    public static String e = "com.mdid.msa";
    public s a;
    public ServiceConnection b;
    public Context c;
    public q d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements ServiceConnection {
        public s a;

        public a(r rVar, s sVar) {
            this.a = sVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                r.this.d = q.a.a(iBinder);
                com.sankuai.waimai.launcher.util.aop.b.a(new t(r.this.d, this.a), AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            r.this.d = null;
            r.this.d = null;
        }
    }

    public r(Context context, s sVar) {
        if (context != null) {
            this.c = context;
            this.a = sVar;
            this.b = new a(this, sVar);
            return;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public String b() {
        try {
            return this.d == null ? "" : this.d.a();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public boolean c() {
        try {
            if (this.d == null) {
                return false;
            }
            return this.d.g();
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        q qVar = this.d;
        if (qVar != null) {
            try {
                qVar.f();
                if (this.b != null) {
                    this.c.unbindService(this.b);
                }
            } catch (Exception unused) {
            }
            this.b = null;
            this.d = null;
        }
    }

    public void a(String str) {
        s sVar;
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (this.c.bindService(intent, this.b, 1) || (sVar = this.a) == null) {
            return;
        }
        sVar.b();
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(e, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            if (context.startService(intent) != null) {
            }
        } catch (Exception unused) {
        }
    }

    public String a() {
        try {
            return this.d == null ? "" : this.d.d();
        } catch (Exception unused) {
            return "";
        }
    }
}
