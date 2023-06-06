package com.dianping.live.live.livefloat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import com.dianping.live.lifecycle.a;
import com.dianping.live.live.utils.i;
import com.dianping.live.live.utils.j;
import com.dianping.live.live.utils.l;
import com.dianping.util.h;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.Lifecycle.d;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveFloatPlayerService extends Service {
    public static ChangeQuickRedirect a;
    private a b;
    private a.InterfaceC0085a c;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public MLiveFloatPlayerService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363655f3bf4aa6166c0ad23cdcbe2c51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363655f3bf4aa6166c0ad23cdcbe2c51");
        } else {
            this.c = new a.InterfaceC0085a() { // from class: com.dianping.live.live.livefloat.MLiveFloatPlayerService.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.live.lifecycle.a.InterfaceC0085a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6fe64809cef83d5e0122e5690950962", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6fe64809cef83d5e0122e5690950962");
                        return;
                    }
                    i.a(i.b, "enter foreground");
                    j.a("MLive_Logan: Float enter foreground");
                    MLiveFloatPlayerService.this.b.a(MLiveFloatPlayerService.this.getApplicationContext());
                }

                @Override // com.dianping.live.lifecycle.a.InterfaceC0085a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bf83c47c454fb4d433464153ed1950e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bf83c47c454fb4d433464153ed1950e");
                        return;
                    }
                    i.a(i.b, "enter background");
                    j.a("MLive_Logan: Float enter background");
                    MLiveFloatPlayerService.this.b.b(MLiveFloatPlayerService.this.getApplicationContext(), false);
                }
            };
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        NotificationManager notificationManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cc481b941b736bcdd8b77e52372e52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cc481b941b736bcdd8b77e52372e52");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "646be1f3e2d3310bebcf3c6ad9a3a1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "646be1f3e2d3310bebcf3c6ad9a3a1b3");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                String str = "default_dp_" + getClass().getSimpleName();
                Object[] objArr3 = {this, str, str};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "40ae0dedf7bb846f11a8da5081fc841d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "40ae0dedf7bb846f11a8da5081fc841d");
                } else if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION)) != null && notificationManager.getNotificationChannel(str) == null) {
                    NotificationChannel notificationChannel = new NotificationChannel(str, str, 0);
                    notificationChannel.setSound(null, null);
                    notificationChannel.setName("悬浮窗通知");
                    notificationManager.createNotificationChannel(notificationChannel);
                    h.b("ServiceForegroundHelper", "createNotificationChannel,channelId = " + str);
                }
                startForeground(-37201, new NotificationCompat.Builder(this, str).setContentTitle("").setContentText("悬浮窗已开启").setSmallIcon(17301659).build());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Object[] objArr = {intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f9195e7486de9752145496c0fdac20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f9195e7486de9752145496c0fdac20")).intValue();
        }
        if (intent == null) {
            return super.onStartCommand(null, i, i2);
        }
        String a2 = f.a(intent, "floatplayeraction");
        if ("floatplayershow".equals(a2)) {
            MLiveFloatPlayerModel mLiveFloatPlayerModel = (MLiveFloatPlayerModel) intent.getParcelableExtra("floatplayermodel");
            if (mLiveFloatPlayerModel == null) {
                return super.onStartCommand(intent, i, i2);
            }
            if (this.b == null) {
                this.b = new a(this, mLiveFloatPlayerModel);
            }
            com.dianping.live.lifecycle.a aVar = com.dianping.live.lifecycle.a.b;
            a.InterfaceC0085a interfaceC0085a = this.c;
            Object[] objArr2 = {interfaceC0085a};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.lifecycle.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e27c579eec46cdff36d9f5c2a41bcb39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e27c579eec46cdff36d9f5c2a41bcb39");
            } else {
                if (aVar.c.size() == 0) {
                    com.sankuai.meituan.Lifecycle.b.a().a(aVar.d);
                }
                aVar.c.add(interfaceC0085a);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.livefloat.MLiveFloatPlayerService.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc381c46d1660d4fc09326ac9a6af667", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc381c46d1660d4fc09326ac9a6af667");
                    } else {
                        MLiveFloatPlayerService.this.b.a(MLiveFloatPlayerService.this.getApplicationContext());
                    }
                }
            }, 500L);
        } else if ("floatplayerhide".equals(a2)) {
            if (this.b != null) {
                this.b.a(getApplicationContext(), f.a(intent, "needmute", false));
            } else {
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f43341050adbd1ade7661f8a456d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f43341050adbd1ade7661f8a456d06");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
        if (this.b != null) {
            this.b.a(getApplicationContext(), true);
        }
        if (this.c != null) {
            com.dianping.live.lifecycle.a aVar = com.dianping.live.lifecycle.a.b;
            a.InterfaceC0085a interfaceC0085a = this.c;
            Object[] objArr2 = {interfaceC0085a};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.lifecycle.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5a32645cf6f0ee7a70697b7743422750", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5a32645cf6f0ee7a70697b7743422750");
                return;
            }
            aVar.c.remove(interfaceC0085a);
            if (aVar.c.size() == 0) {
                com.sankuai.meituan.Lifecycle.b a2 = com.sankuai.meituan.Lifecycle.b.a();
                d dVar = aVar.d;
                Object[] objArr3 = {dVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.Lifecycle.c.c;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f36673afc273a7a0fe22659a4d4a2752", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f36673afc273a7a0fe22659a4d4a2752");
                } else if (dVar == null) {
                } else {
                    a2.d.remove(dVar);
                }
            }
        }
    }
}
