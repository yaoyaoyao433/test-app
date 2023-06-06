package com.meituan.android.customerservice.callkefuuisdk.callkf;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callbase.utils.Ring;
import com.meituan.android.customerservice.callbase.utils.RingPlayer;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.cscallsdk.e;
import com.meituan.android.customerservice.kit.utils.HeadSetChangedManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallKFRingService extends Service implements com.meituan.android.customerservice.cscallsdk.b, d.a, e.a, HeadSetChangedManager.a {
    public static ChangeQuickRedirect a;
    public final String b;
    private AudioManager c;
    private RingPlayer d;
    private Handler e;
    private a f;
    private b g;
    private String h;
    private short i;
    private HashMap<String, String> j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onAcceptInviteTimeout(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onApp2PhoneChange(b.c cVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onCallEstablishing(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onInvited(b.f fVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onJoinCallRes(b.d dVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onMakeCallSuccess(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onMakeCallTimeout(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onNetQualityChange(b.g gVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onOtherDeviceAccept(int i) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onOtherDeviceReject(int i) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onRejoinSuccess(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onTalking() {
    }

    public CallKFRingService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800e0a46965a964cfd032476b826253f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800e0a46965a964cfd032476b826253f");
            return;
        }
        this.b = "voip_kf";
        this.e = new Handler(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2963287e88134d47ea6be1b432589849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2963287e88134d47ea6be1b432589849");
            return;
        }
        c.a(this);
        super.onCreate();
        CallLog.log(getClass(), "CallKFRingService onCreate");
        HeadSetChangedManager.a().a(getApplicationContext());
        HeadSetChangedManager.a().a((HeadSetChangedManager.a) this);
        d.j().a((com.meituan.android.customerservice.cscallsdk.b) this);
        d.j().a((d.a) this);
        this.c = (AudioManager) getSystemService("audio");
        d.j().g().a(this);
        if (d.j().g().d() != 3) {
            a();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PendingIntent activity;
        Notification build;
        Object[] objArr = {intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40325b968314f70b14a54412567b095a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40325b968314f70b14a54412567b095a")).intValue();
        }
        if (intent != null) {
            if (f.a(intent, "show_call_kf_notification", true)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d78569eb688af13985c40f89374b7613", RobustBitConfig.DEFAULT_VALUE)) {
                    build = (Notification) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d78569eb688af13985c40f89374b7613");
                } else {
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "voip_kf");
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30e0e63fc591ef731a7b5467d0d9fc80", RobustBitConfig.DEFAULT_VALUE)) {
                        activity = (PendingIntent) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30e0e63fc591ef731a7b5467d0d9fc80");
                    } else {
                        Intent intent2 = new Intent(this, CallKFActivity.class);
                        intent2.setFlags(y.a);
                        intent2.putExtra("form_tip", true);
                        activity = PendingIntent.getActivity(this, 0, intent2, 134217728);
                    }
                    builder.setContentIntent(activity).setContentText("语音通话中").setSmallIcon(R.drawable.cs_voip_call_kf_notification_icon).setWhen(System.currentTimeMillis());
                    if (Build.VERSION.SDK_INT >= 26) {
                        ((NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION)).createNotificationChannel(new NotificationChannel("voip_kf", "客服电话", 3));
                    }
                    build = builder.build();
                }
                startForeground(1, build);
            } else {
                stopForeground(true);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f94b0e4821f37d6ed440aaa3d1c5c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f94b0e4821f37d6ed440aaa3d1c5c7");
        }
        CallLog.log(getClass(), "onBind");
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    public final void a(String str, short s, HashMap<String, String> hashMap) {
        Object[] objArr = {str, Short.valueOf(s), hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33fe3191ae2bfac2a98ce66aa4412e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33fe3191ae2bfac2a98ce66aa4412e8");
            return;
        }
        this.h = str;
        this.i = s;
        this.j = hashMap;
        d.j().a(str, s, hashMap, new com.meituan.android.customerservice.callbase.base.b() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFRingService.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.callbase.base.b
            public final void a(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5625aa2e7bf91c405ef07b6c14370cb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5625aa2e7bf91c405ef07b6c14370cb1");
                    return;
                }
                Class<?> cls = getClass();
                CallLog.log(cls, "Make call success" + i);
                if (i == 12004) {
                    CallKFRingService.this.a(CallKFRingService.this.h, CallKFRingService.this.i, CallKFRingService.this.j);
                }
            }

            @Override // com.meituan.android.customerservice.callbase.base.b
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aad9a22e7d507abe37b4ac7cdf53fee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aad9a22e7d507abe37b4ac7cdf53fee");
                } else {
                    CallKFRingService.this.e.post(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFRingService.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8213e438fac96f2cd56dcadd71d37939", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8213e438fac96f2cd56dcadd71d37939");
                                return;
                            }
                            CallKFRingService.a((Context) CallKFRingService.this);
                            com.meituan.android.customerservice.kit.floating.b.a().a("call_kf");
                            if (CallKFRingService.this.g != null) {
                                CallKFRingService.this.g.a(i);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11092e84c5ded8eb708b1fdf3a698f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11092e84c5ded8eb708b1fdf3a698f4");
            return;
        }
        c.b(this);
        super.onDestroy();
        CallLog.log(getClass(), "CallKFRingService onDestroy");
        this.e.post(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFRingService.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c6183d9f7424a705d6f15190dbce75b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c6183d9f7424a705d6f15190dbce75b");
                } else {
                    CallKFRingService.this.c.abandonAudioFocus(null);
                }
            }
        });
        b();
        this.g = null;
        d.j().g().b(this);
        d.j().b((com.meituan.android.customerservice.cscallsdk.b) this);
        d.j().b((d.a) this);
        HeadSetChangedManager.a().b((HeadSetChangedManager.a) this);
        HeadSetChangedManager.a().b(getApplicationContext());
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c527b8d04b46331054d8c3351a677ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c527b8d04b46331054d8c3351a677ac5");
        } else if (context == null) {
        } else {
            context.stopService(new Intent(context, CallKFRingService.class));
        }
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835847f68ff7faaeab091bb5345a5122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835847f68ff7faaeab091bb5345a5122");
            return;
        }
        CallLog.d(getClass(), " startRing ");
        this.d = new RingPlayer.Builder().setAudioResid(new Ring(R.raw.cs_voip_make_call_ring)).setAudioStreamType(0).setLooping(true).create(this);
        this.e.post(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFRingService.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "845ed6b38216c63853a3566a06634e87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "845ed6b38216c63853a3566a06634e87");
                } else {
                    CallKFRingService.this.c.requestAudioFocus(null, 0, 2);
                }
            }
        });
        this.d.startPlay();
    }

    private synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f803472b289847ae477bc0b4f42ccfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f803472b289847ae477bc0b4f42ccfa");
            return;
        }
        if (this.d != null) {
            this.d.stopPlay();
            this.d = null;
        }
    }

    @Override // com.meituan.android.customerservice.kit.utils.HeadSetChangedManager.a
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71695b5a27db4898fbf96b5f35030f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71695b5a27db4898fbf96b5f35030f5");
        } else if ((str == "bluetooth" && i == 2) || (str == "wired" && i == 1)) {
            d.j().a(false);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e.a
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa27bbffd979e657784fd9b177dd81c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa27bbffd979e657784fd9b177dd81c");
            return;
        }
        if (i2 == 3) {
            b();
        }
        if (i2 == 0) {
            a((Context) this);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onError(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de482e01f7ebbe0dfeb522f113a4a235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de482e01f7ebbe0dfeb522f113a4a235");
        } else {
            a((Context) this);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public void onCallEnd(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2946c06b091eef254ccc6e97aedc1b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2946c06b091eef254ccc6e97aedc1b03");
        } else {
            a((Context) this);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a16063d9d0b331e593b8aa7ddb3207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a16063d9d0b331e593b8aa7ddb3207");
            return;
        }
        CallLog.log(getClass(), "ongRing phone call");
        b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends Binder {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {CallKFRingService.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc165718ae6cdfc77420b3b47ca2d57", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc165718ae6cdfc77420b3b47ca2d57");
            }
        }

        public final void a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a469a0206df1ee5edbe90851286313", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a469a0206df1ee5edbe90851286313");
            } else {
                CallKFRingService.this.g = bVar;
            }
        }
    }
}
