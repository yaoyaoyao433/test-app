package com.meituan.android.common.statistics.ipc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LeaderService extends Service {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a69547cdbc6440192e291703d9957365", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a69547cdbc6440192e291703d9957365");
            return;
        }
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3daa24d11185188594d14be902d843f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3daa24d11185188594d14be902d843f");
            return;
        }
        c.b(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public static void start(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "815b049d9ac87ee3b0d6d01f22efb0db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "815b049d9ac87ee3b0d6d01f22efb0db");
        } else {
            context.startService(new Intent(context, LeaderService.class));
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da3b634af70471873d42dcc1334bdc4f", 6917529027641081856L) ? (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da3b634af70471873d42dcc1334bdc4f") : new LeaderServiceBinder(this);
    }
}
