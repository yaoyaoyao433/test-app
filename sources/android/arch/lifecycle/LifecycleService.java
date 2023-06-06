package android.arch.lifecycle;

import android.app.Service;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LifecycleService extends Service implements f {
    private final n a = new n(this);

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        this.a.a(d.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    @Nullable
    public IBinder onBind(Intent intent) {
        this.a.a(d.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onStart(Intent intent, int i) {
        this.a.a(d.a.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        n nVar = this.a;
        nVar.a(d.a.ON_STOP);
        nVar.a(d.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.arch.lifecycle.f
    public d getLifecycle() {
        return this.a.a;
    }
}
