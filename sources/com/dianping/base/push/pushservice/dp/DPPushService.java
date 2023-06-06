package com.dianping.base.push.pushservice.dp;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.dp.impl3v8.d;
import com.dianping.base.push.pushservice.e;
import com.dianping.base.push.pushservice.friends.b;
import com.dianping.base.push.pushservice.m;
import com.dianping.base.push.pushservice.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DPPushService extends Service {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(0);
    private a c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public DPPushService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da8979cf42c2a27c41b37c2c80dae1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da8979cf42c2a27c41b37c2c80dae1f");
        } else {
            this.c = new d();
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d868be48806a123bef23674a8153c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d868be48806a123bef23674a8153c9d");
            return;
        }
        c.a("DPPushService", "DPPushService source = " + str);
        Intent intent = new Intent();
        intent.setClass(context, DPPushService.class);
        intent.setAction("com.dianping.push.START");
        intent.putExtra("source", str);
        f.a(context, intent);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3f7678a746f437a64afa0489dee546c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3f7678a746f437a64afa0489dee546c");
            return;
        }
        c.a("DPPushService", "stop");
        if (Build.VERSION.SDK_INT >= 26 && com.dianping.base.push.pushservice.f.i && com.dianping.base.push.pushservice.f.d >= 26) {
            if (com.dianping.base.push.pushservice.util.d.a(context, DPPushService.class.getName())) {
                Intent intent = new Intent(context, DPPushService.class);
                intent.setAction("com.dianping.push.STOP");
                intent.putExtra("notRequireForeground", true);
                try {
                    context.startService(intent);
                    return;
                } catch (Exception e) {
                    a(e.toString());
                    return;
                }
            }
            return;
        }
        try {
            context.stopService(new Intent(context, DPPushService.class));
        } catch (Exception e2) {
            a(e2.toString());
        }
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3da762cb15fcae9913558963dce6d8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3da762cb15fcae9913558963dce6d8f0");
            return;
        }
        c.a("DPPushService", "reconnect source = " + str);
        Intent intent = new Intent();
        intent.setClass(context, DPPushService.class);
        intent.setAction("com.dianping.push.RECONNECT");
        intent.putExtra("source", str);
        f.a(context, intent);
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f2c146bd7d3f6cd4dafe926a34e4257", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f2c146bd7d3f6cd4dafe926a34e4257")).intValue() : b.get();
    }

    public static boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34dec79d38e289ac58e3b5681cff8c92", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34dec79d38e289ac58e3b5681cff8c92")).booleanValue() : b.compareAndSet(i, i2);
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4d84a3777675c97d34fa57b6b6cb8d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4d84a3777675c97d34fa57b6b6cb8d9")).booleanValue() : (i & b.get()) > 0;
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637d2eadfc06bcf24e3ac8b59f093261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637d2eadfc06bcf24e3ac8b59f093261");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        if (com.dianping.base.push.pushservice.f.b() == null || com.dianping.base.push.pushservice.f.e == null) {
            Log.e("DPPushService", "onCreate: Push SDK has not been initialized!");
            c.b("onCreate: Push SDK has not been initialized!");
            com.dianping.base.push.pushservice.f.d = getApplicationContext().getApplicationInfo().targetSdkVersion;
            f.a((Service) this, (Intent) null);
            stopSelf();
            return;
        }
        m.a("task_start_service_completely");
        m.a("task_start_service_completely", "step_service_on_create");
        b.set(1);
        try {
            e.a(this).b("service_alive", 1);
        } catch (Exception e) {
            a(e.toString());
        }
        super.onCreate();
        if (com.dianping.base.push.pushservice.f.a() != null) {
            com.dianping.base.push.pushservice.f.a().a(0L, "push_service_create_successful", 0, 0, 200, 0, 0, 0, null, com.dianping.base.push.pushservice.f.d(this));
        }
        a("DPPushService onCreate,local token:" + com.dianping.base.push.pushservice.f.d(this));
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e50ac202d769c56e29f7dbd8d6ecfb53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e50ac202d769c56e29f7dbd8d6ecfb53");
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 26 && com.dianping.base.push.pushservice.f.d >= 26 && !com.dianping.base.push.pushservice.f.i) {
                    f.a(this);
                }
            } catch (Throwable th) {
                c.d("ServiceForegroundHelper", "startForeground error:" + th);
            }
        }
        this.c.a(this);
        b.a(getApplicationContext());
        m.a("task_start_service_completely", "step_service_on_create_finish");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        Intent intent2;
        Object[] objArr = {intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4ea557be894b5e33934d7addf9b1c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4ea557be894b5e33934d7addf9b1c0")).intValue();
        }
        if (com.dianping.base.push.pushservice.f.b() == null || com.dianping.base.push.pushservice.f.e == null) {
            Log.e("DPPushService", "onStartCommand: Push SDK has not been initialized!");
            c.b("onStartCommand: Push SDK has not been initialized!");
            stopSelf();
            return 1;
        }
        m.a("task_start_service_completely", "step_service_on_start_command");
        f.a((Service) this, intent);
        StringBuilder sb = new StringBuilder("DPPushService onStartCommand with ");
        if (intent == null) {
            str = "null intent";
        } else {
            str = "action(" + intent.getAction() + "), source(" + com.sankuai.waimai.platform.utils.f.a(intent, "source") + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        sb.append(str);
        a(sb.toString());
        if (intent == null) {
            intent2 = new Intent();
            intent2.setAction("com.dianping.push.START");
            try {
                intent2.putExtra("source", "unknown");
            } catch (Exception e) {
                if (com.dianping.base.push.pushservice.f.a() != null) {
                    com.dianping.base.push.pushservice.f.a().pv4(0L, "service reject", 0, 1, -999, 0, 0, 0, null, e.getMessage(), 1);
                }
                a(e.toString());
            }
        } else {
            if (intent.getAction() == null) {
                intent.setAction("com.dianping.push.START");
                try {
                    intent.putExtra("source", "daemon");
                } catch (Exception e2) {
                    if (com.dianping.base.push.pushservice.f.a() != null) {
                        com.dianping.base.push.pushservice.f.a().pv4(0L, "service reject", 0, 1, -999, 0, 0, 0, null, e2.getMessage(), 1);
                    }
                }
            }
            intent2 = intent;
        }
        b.a(getApplicationContext(), intent2);
        int a2 = this.c.a(this, intent2, i, i2);
        m.a("task_start_service_completely", "step_service_on_start_command_finish");
        m.b("task_start_service_completely");
        return a2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fcaf48da263068bff4d2f40d1377f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fcaf48da263068bff4d2f40d1377f53");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        if (Build.VERSION.SDK_INT >= 26) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "122ea17bd7f4b4e117a936c9a9d07619", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "122ea17bd7f4b4e117a936c9a9d07619");
            } else {
                stopForeground(true);
            }
        }
        super.onDestroy();
        this.c.b(this);
        c.b("DPPushService", "DPPushService destroyed");
        try {
            e.a(this).b("service_alive", 0);
        } catch (Exception e) {
            a(e.toString());
        }
        b.set(0);
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5037da31ea7b6e639bceb255f72990a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5037da31ea7b6e639bceb255f72990a1");
        } else {
            c.b("DPPushService", str);
        }
    }
}
