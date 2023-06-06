package com.sankuai.waimai.business.page.homepage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestartAppService extends Service {
    public static ChangeQuickRedirect a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0b698d941d5b53264c383056eb8d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0b698d941d5b53264c383056eb8d83");
            return;
        }
        c.b(this);
        super.onDestroy();
    }

    public static void a(Context context, boolean z, long j) {
        Object[] objArr = {context, (byte) 1, 500L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78d93cd74f89a5c2dcd4eab2fbbb9b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78d93cd74f89a5c2dcd4eab2fbbb9b0d");
            return;
        }
        Intent intent = new Intent(context, RestartAppService.class);
        intent.putExtra("package_name", context.getPackageName());
        intent.putExtra("delay", 500L);
        k.b(Process.myPid());
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59759a21a4d4d3f84db1f8aff047a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59759a21a4d4d3f84db1f8aff047a9f");
            return;
        }
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Object[] objArr = {intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9989799e74b4658ed49f1da687d9718", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9989799e74b4658ed49f1da687d9718")).intValue();
        }
        final String a2 = f.a(intent, "package_name", getPackageName());
        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.RestartAppService.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdd65cd6f596e393ecbf0cba20e44211", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdd65cd6f596e393ecbf0cba20e44211");
                    return;
                }
                RestartAppService.this.startActivity(RestartAppService.this.getPackageManager().getLaunchIntentForPackage(a2));
                RestartAppService.this.stopSelf();
            }
        }, f.a(intent, "delay", 500L));
        return super.onStartCommand(intent, i, i2);
    }
}
