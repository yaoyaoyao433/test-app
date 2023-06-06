package com.meituan.android.customerservice.cscallsdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.customerservice.callbase.avengine.b;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.android.customerservice.callbase.utils.CallBaseUtil;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callbase.utils.Publisher;
import com.meituan.android.customerservice.callbase.utils.SharedPreferenceUtils;
import com.meituan.android.customerservice.callbase.utils.Timer;
import com.meituan.android.customerservice.callbase.utils.WeakPublisher;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.cscallsdk.e;
import com.meituan.android.customerservice.cscallsdk.f;
import com.meituan.android.customerservice.cscallsdk.inner.b;
import com.meituan.android.customerservice.cscallsdk.state.CallStateMachine;
import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.bean.PikeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.xm.im.message.bean.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends d implements b.e, b.f, b, e.a, f, b.InterfaceC0245b, PikeClient.b {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static c p = new c();
    private a A;
    private long B;
    private long C;
    Context b;
    CopyOnWriteArraySet<Object> c;
    CopyOnWriteArraySet<d.c> d;
    com.meituan.android.customerservice.callbase.base.c e;
    CallStateMachine f;
    com.meituan.android.customerservice.callbase.avengine.b g;
    AtomicInteger h;
    boolean i;
    Timer j;
    com.meituan.android.customerservice.cscallsdk.controllor.a k;
    com.meituan.android.customerservice.callbase.protohelper.a l;
    com.meituan.android.customerservice.callbase.base.b m;
    BroadcastReceiver n;
    private final int q;
    private final int r;
    private final int s;
    private com.meituan.android.customerservice.callbase.inner.a t;
    private Publisher<b> u;
    private Publisher<f> v;
    private Handler w;
    private TelephonyManager x;
    private int y;
    private int z;

    public static /* synthetic */ com.meituan.android.customerservice.callbase.base.b a(c cVar, com.meituan.android.customerservice.callbase.base.b bVar) {
        cVar.m = null;
        return null;
    }

    public static /* synthetic */ Timer a(c cVar, Timer timer) {
        cVar.j = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5f73b24ecf4ad5fc5a789c98572909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5f73b24ecf4ad5fc5a789c98572909");
            return;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || k() || l()) {
            return;
        }
        PikeClient.c.a.a();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.inner.b.InterfaceC0245b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27415fe85d6180b24f57a04ff779929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27415fe85d6180b24f57a04ff779929");
            return;
        }
        CallLog.debug(getClass(), "onForeground");
        if (this.b != null) {
            a(this.b);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.inner.b.InterfaceC0245b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0cfff93a677a0654b3e9fe0644d9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0cfff93a677a0654b3e9fe0644d9d7");
        } else {
            CallLog.debug(getClass(), "onBackground");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a extends PhoneStateListener {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4744700001a60164c5b61ddc7be62b27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4744700001a60164c5b61ddc7be62b27");
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70edbbdb6f7702fbc69945bdad449ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70edbbdb6f7702fbc69945bdad449ba");
                return;
            }
            super.onCallStateChanged(i, str);
            CallLog.log("CallManager", "PhoneStateListener " + i);
            if (i != 2 || c.this.g().d() == 0) {
                return;
            }
            c.this.f.handleError(1, "accept tele call");
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(final Context context, com.meituan.android.customerservice.callbase.base.c cVar, byte b, String str, com.meituan.android.pike.a aVar, HashMap<String, Object> hashMap) {
        HashMap<String, String> hashMap2;
        String str2;
        char c;
        com.meituan.android.customerservice.callbase.avengine.b a2;
        Object[] objArr = {context, cVar, (byte) 0, str, aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178dddd80f771947d3ec4dc6d53e9108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178dddd80f771947d3ec4dc6d53e9108");
            return;
        }
        c cVar2 = p;
        if (cVar2.h.compareAndSet(0, 1)) {
            cVar2.t = com.meituan.android.customerservice.callbase.inner.a.a();
            cVar2.t.b = str;
            cVar2.t.c = (byte) 0;
            cVar2.t.d = aVar;
            CallLog.log("CallManager", "init:" + cVar2.t.toString());
            cVar2.b = context;
            cVar2.e = cVar;
            com.meituan.android.customerservice.callbase.csmonitor.a a3 = com.meituan.android.customerservice.callbase.csmonitor.a.a();
            Context context2 = cVar2.b;
            String e = cVar.e();
            short b2 = cVar.b();
            short c2 = cVar.c();
            Object[] objArr2 = {context2, e, Integer.valueOf(b2), Short.valueOf(c2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.callbase.csmonitor.a.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "a429a3e91c6a279829f4bdb4734f9bc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "a429a3e91c6a279829f4bdb4734f9bc0");
            } else {
                a3.e = context2;
                a3.f = c2;
                a3.d = e;
                if (a3.b == null) {
                    a3.b = new com.meituan.android.customerservice.callbase.csmonitor.b(context2, b2);
                }
                if (a3.c == null) {
                    a3.c = new m(b2, context2);
                }
            }
            String str3 = (hashMap == null || hashMap.get("appName") == null) ? null : (String) hashMap.get("appName");
            short b3 = cVar.b();
            Object[] objArr3 = {aVar, str3, Short.valueOf(b3)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "9af1c9dd8991bd2a1887ca775743979a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "9af1c9dd8991bd2a1887ca775743979a");
            } else {
                PikeClient.a aVar2 = new PikeClient.a();
                aVar2.d = str3;
                aVar2.c = b3;
                aVar2.b = 15000;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "ec3d66ec5c4e65757f653733822aa46e", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap2 = (HashMap) PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "ec3d66ec5c4e65757f653733822aa46e");
                } else {
                    hashMap2 = new HashMap<>();
                    hashMap2.put("appid", String.valueOf((int) cVar2.e.b()));
                    hashMap2.put("uid", cVar2.e.e());
                    hashMap2.put("dType", String.valueOf((int) cVar2.e.d()));
                    String uuid = GetUUID.getInstance().getUUID(cVar2.b);
                    if (TextUtils.isEmpty(uuid)) {
                        uuid = GetUUID.getInstance().getUUID(cVar2.b);
                    }
                    hashMap2.put("uuid", uuid);
                    hashMap2.put("vendor", String.valueOf((int) cVar2.t.c));
                    Class<?> cls = cVar2.getClass();
                    CallLog.log(cls, "uuid = " + uuid);
                }
                aVar2.j = hashMap2;
                PikeClient pikeClient = PikeClient.c.a;
                Object[] objArr5 = {aVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (!PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "fe431ab021d731d68bec05eb98415986", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (aVar) {
                        case ENV_PROD:
                            str2 = "CwCUcabTHYeUicJj";
                            break;
                        case ENV_STAGING:
                            str2 = "RRlVSluSetAQhwst";
                            break;
                        case ENV_BETA:
                            str2 = "dyMQFhrPgiFhpwDj";
                            break;
                        case ENV_TEST:
                            str2 = "jzYzaEJsviijxCPn";
                            break;
                        default:
                            str2 = "CwCUcabTHYeUicJj";
                            break;
                    }
                } else {
                    str2 = (String) PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "fe431ab021d731d68bec05eb98415986");
                }
                pikeClient.a(str2, aVar2, cVar2.b, aVar);
                PikeClient.c.a.a(cVar2);
                cVar2.B = System.currentTimeMillis();
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.customerservice.callbase.avengine.b.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "993b1b66b3e1211787fd9e09a9997b15", RobustBitConfig.DEFAULT_VALUE)) {
                c = 1;
                a2 = (com.meituan.android.customerservice.callbase.avengine.b) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "993b1b66b3e1211787fd9e09a9997b15");
            } else {
                c = 1;
                a2 = b.a.a();
            }
            cVar2.g = a2;
            com.meituan.android.customerservice.callbase.avengine.b bVar = cVar2.g;
            Object[] objArr7 = new Object[2];
            objArr7[0] = str;
            objArr7[c] = context;
            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.customerservice.callbase.avengine.b.a;
            if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "469c8f3ea1a3b28f019dc92d43d69326", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "469c8f3ea1a3b28f019dc92d43d69326");
            } else {
                bVar.m = str;
                bVar.c = context.getApplicationContext();
            }
            com.meituan.android.customerservice.callbase.avengine.b bVar2 = cVar2.g;
            Object[] objArr8 = {cVar2};
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.customerservice.callbase.avengine.b.a;
            if (PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "da8fe39b4d8edccabe2665f32e55f53e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "da8fe39b4d8edccabe2665f32e55f53e");
            } else {
                bVar2.a(cVar2);
                bVar2.f.add(cVar2);
            }
            cVar2.g.i = cVar2;
            com.meituan.android.customerservice.callbase.protohelper.b bVar3 = new com.meituan.android.customerservice.callbase.protohelper.b(cVar);
            cVar2.f = new CallStateMachine(cVar2.b, cVar2.g, cVar, bVar3);
            cVar2.f.setListener(cVar2);
            cVar2.g().a(cVar2);
            cVar2.k = new com.meituan.android.customerservice.cscallsdk.controllor.a(cVar2, bVar3);
            cVar2.l = new com.meituan.android.customerservice.callbase.protohelper.a(new com.meituan.android.customerservice.cscallsdk.inner.d(cVar2.f, cVar2.k), PikeClient.c.a);
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                cVar2.b.registerReceiver(cVar2.n, intentFilter);
                LocalBroadcastManager.getInstance(cVar2.b).registerReceiver(cVar2.n, new IntentFilter("voip_login_out_action"));
                cVar2.i = true;
            } catch (Exception e2) {
                CallLog.error("CallManager", "registerReceiver:" + CallBaseUtil.getStackTraceMessage(e2));
            }
            if (cVar2.b instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(com.meituan.android.customerservice.cscallsdk.inner.b.a());
                com.meituan.android.customerservice.cscallsdk.inner.b.a().a(cVar2);
            }
            Object[] objArr9 = {context};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, cVar2, changeQuickRedirect9, false, "e1ebf4b998f213ed2793035573c7d4f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, cVar2, changeQuickRedirect9, false, "e1ebf4b998f213ed2793035573c7d4f7");
            } else {
                cVar2.a(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "98beb48270f97389ba2626ed5612ed87", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "98beb48270f97389ba2626ed5612ed87");
                            return;
                        }
                        c.this.A = new a();
                        c.this.x = (TelephonyManager) context.getSystemService("phone");
                        c.this.x.listen(c.this.A, 32);
                    }
                });
            }
            cVar2.h.set(2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("uid", cVar.e());
            hashMap3.put("net", Integer.valueOf(PikeUtil.getNetworkState(context)));
            Statistics.getChannel("cs").writeModelView(AppUtil.generatePageInfoKey(context), "b_cs_t1yir0yj_mv", hashMap3, "c_cs_siuxluej");
            CallLog.log("CallManager", "init: complete " + cVar2.h.get());
        }
    }

    public static c c() {
        return p;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca3a6448bc8cac1fedbe0f450e16ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca3a6448bc8cac1fedbe0f450e16ce1");
            return;
        }
        this.q = 0;
        this.r = 1;
        this.s = 2;
        this.u = new WeakPublisher();
        this.v = new WeakPublisher();
        this.c = new CopyOnWriteArraySet<>();
        this.d = new CopyOnWriteArraySet<>();
        this.w = new Handler(Looper.getMainLooper());
        this.h = new AtomicInteger(0);
        this.i = false;
        this.y = -1;
        this.z = -1;
        this.B = 0L;
        this.C = 0L;
        this.n = new BroadcastReceiver() { // from class: com.meituan.android.customerservice.cscallsdk.CallManager$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3fa4889282eff0469de05198d55ac8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3fa4889282eff0469de05198d55ac8e");
                    return;
                }
                String action = intent.getAction();
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1172645946) {
                    if (hashCode != -133433444) {
                        if (hashCode == 1901012141 && action.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                            c = 0;
                        }
                    } else if (action.equals("voip_login_out_action")) {
                        c = 2;
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    c = 1;
                }
                switch (c) {
                    case 0:
                        CallLog.log("CallManager", "broadreceiver is  ACTION_NEW_OUTGOING_CALL");
                        if (c.this.g().d() != 0) {
                            c.this.f.handleError(1, "phone coming");
                            return;
                        }
                        return;
                    case 1:
                        c cVar = c.this;
                        Object[] objArr3 = {context};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "5ad02f93b647db0d97e153a2f7ce2459", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "5ad02f93b647db0d97e153a2f7ce2459");
                            return;
                        } else {
                            cVar.a(context);
                            return;
                        }
                    case 2:
                        CallLog.log("CallManager", "releaseCallSDK with action");
                        if (c.this.g().d() != 0) {
                            c.this.d();
                        }
                        b.d dVar = new b.d();
                        dVar.f = 12002;
                        dVar.g = "logout";
                        dVar.a = c.this.g().c();
                        dVar.b = c.this.g().b();
                        c.this.a("onCallEnd", dVar);
                        final c cVar2 = c.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "4ec1bccff528365dcc57c66ae13d9c52", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "4ec1bccff528365dcc57c66ae13d9c52");
                            return;
                        } else if (cVar2.h.get() != 2) {
                            CallLog.log("CallManager", "releaseCallSDK with no init ");
                            return;
                        } else {
                            CallLog.log("CallManager", "releaseCallSDK by ueser");
                            try {
                                if (cVar2.i) {
                                    cVar2.i = false;
                                    cVar2.b.unregisterReceiver(cVar2.n);
                                    LocalBroadcastManager.getInstance(cVar2.b).unregisterReceiver(cVar2.n);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            cVar2.a(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.c.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6fd194dcff52ce272cc7ccb8b790a834", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6fd194dcff52ce272cc7ccb8b790a834");
                                    } else if (c.this.A != null) {
                                        c.this.x.listen(c.this.A, 0);
                                    }
                                }
                            });
                            cVar2.c.clear();
                            cVar2.d.clear();
                            if (cVar2.k != null) {
                                com.meituan.android.customerservice.cscallsdk.controllor.a aVar = cVar2.k;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.customerservice.cscallsdk.controllor.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "f4bdd85c7c8f2f5959bdc46665b691b8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "f4bdd85c7c8f2f5959bdc46665b691b8");
                                } else {
                                    aVar.b.clear();
                                }
                            }
                            if (cVar2.g() != null) {
                                cVar2.g().b(cVar2);
                            }
                            if (cVar2.g != null) {
                                cVar2.g.a(cVar2);
                                cVar2.g.i = null;
                                cVar2.g.e();
                            }
                            if (cVar2.f != null) {
                                cVar2.f.destroy();
                                cVar2.f = null;
                            }
                            if (cVar2.l != null) {
                                com.meituan.android.customerservice.callbase.protohelper.a aVar2 = cVar2.l;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.customerservice.callbase.protohelper.a.a;
                                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "dd1dc5209006e171fc6f3aa1f3379b12", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "dd1dc5209006e171fc6f3aa1f3379b12");
                                } else {
                                    aVar2.c.b(aVar2);
                                }
                                cVar2.l = null;
                            }
                            if (cVar2.j != null) {
                                cVar2.j.cancel(10001);
                                cVar2.j = null;
                                cVar2.m = null;
                            }
                            if (cVar2.b != null && (cVar2.b instanceof Application)) {
                                com.meituan.android.customerservice.cscallsdk.inner.b.a().b(cVar2);
                                ((Application) cVar2.b).unregisterActivityLifecycleCallbacks(com.meituan.android.customerservice.cscallsdk.inner.b.a());
                            }
                            PikeClient.c.a.b();
                            PikeClient.c.a.b(cVar2);
                            CallHandleWorker.getInstance().release();
                            cVar2.e = null;
                            cVar2.h.set(0);
                            return;
                        }
                    default:
                        return;
                }
            }
        };
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5331b58490237ac9ab55b4beab38ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5331b58490237ac9ab55b4beab38ac");
        } else {
            this.u.addSubscriber(bVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc1c6437197a72859f3f40653c1edbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc1c6437197a72859f3f40653c1edbf");
        } else {
            this.u.removeSubscriber(bVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(String str, short s, HashMap<String, String> hashMap, com.meituan.android.customerservice.callbase.base.b bVar) {
        long j;
        int i;
        boolean z;
        Object[] objArr = {str, Short.valueOf(s), hashMap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d07e63d5c7824a944da12da49ef675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d07e63d5c7824a944da12da49ef675");
            return;
        }
        Object[] objArr2 = {bVar, 0L};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fb4f1570d6fdb740640e31e63fe6c5e", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fb4f1570d6fdb740640e31e63fe6c5e")).booleanValue();
        } else {
            this.C = System.currentTimeMillis();
            if (this.h.get() != 2 || this.f == null) {
                j = 0;
                CallLog.error("CallManager", "make call fail:not init Sdk");
                i = 12001;
            } else if (!CallBaseUtil.isNetworkAvailable(this.b)) {
                CallLog.error("CallManager", "make call fail:network disable");
                i = 10004;
                j = 0;
            } else if (!k()) {
                CallLog.error("CallManager", "make call fail:unlogin");
                if (!l()) {
                    PikeClient.c.a.a();
                }
                if (this.j != null) {
                    this.j.cancel(10001);
                }
                j = 0;
                this.j = new Timer(new Timer.TimeoutCallback() { // from class: com.meituan.android.customerservice.cscallsdk.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.customerservice.callbase.utils.Timer.TimeoutCallback
                    public final void onTimeout(int i2) {
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5db2b8e60e0545853a3f308cab9f655e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5db2b8e60e0545853a3f308cab9f655e");
                            return;
                        }
                        if (c.this.m != null) {
                            c.this.m.a(10004);
                            c.a(c.this, (com.meituan.android.customerservice.callbase.base.b) null);
                        }
                        b.d dVar = new b.d();
                        dVar.f = 10004;
                        c.this.a("onError", dVar);
                        if (c.this.j != null) {
                            c.this.j.cancel(i2);
                            c.a(c.this, (Timer) null);
                        }
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("gid", Long.valueOf(r2));
                        com.meituan.android.customerservice.callbase.csmonitor.a.a().a(10004, (int) (System.currentTimeMillis() - c.this.C), hashMap2, "cs_voip_invite_success", "cs_voip_callertalking_success");
                    }
                });
                this.j.schedule(10001, 30000);
                this.m = bVar;
                i = 12002;
            } else {
                j = 0;
                if (CallBaseUtil.isPhoneCalling(this.b)) {
                    CallLog.error("CallManager", "make call fail: on telephone calling");
                    i = 1;
                } else {
                    i = -1;
                }
            }
            if (i != -1 && i != 12002 && bVar != null) {
                bVar.a(i);
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("gid", Long.valueOf(j));
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(i, (int) (System.currentTimeMillis() - this.C), hashMap2, "cs_voip_invite_success", "cs_voip_callertalking_success");
            }
            z = i == -1;
        }
        if (z) {
            HashMap<String, String> hashMap3 = hashMap == null ? new HashMap<>() : hashMap;
            hashMap3.put("callStyle", "10");
            SharedPreferenceUtils.putInt(this.b, "callStyle", 10);
            MeetingStatusItems meetingStatusItems = new MeetingStatusItems();
            meetingStatusItems.setMber(str);
            meetingStatusItems.setType(s);
            meetingStatusItems.setRole((byte) 2);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            MeetingStatusItems meetingStatusItems2 = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67128f407a5def357b8a026834c2a0ef", RobustBitConfig.DEFAULT_VALUE) ? (MeetingStatusItems) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67128f407a5def357b8a026834c2a0ef") : new MeetingStatusItems(String.valueOf(this.e.e()), (byte) 1, (short) 1, this.e.b(), this.e.c(), null);
            CallStateMachine callStateMachine = this.f;
            MeetingStatusItems[] meetingStatusItemsArr = {meetingStatusItems2, meetingStatusItems};
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            callStateMachine.makeCall(meetingStatusItemsArr, 0L, PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4897bb4d2053e42b225c29436d691809", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4897bb4d2053e42b225c29436d691809") : String.format("%s_%s_%s", Short.valueOf(this.e.b()), this.e.e(), UUID.randomUUID().toString()), hashMap3, bVar, this.t.b, (short) 0);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a05397d9034c376aeb8a0f95113aff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a05397d9034c376aeb8a0f95113aff8");
        } else if (this.h.get() != 2) {
        } else {
            this.f.sendDTMFWithKey(str);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d7c594d8c7017c95eb1b4234b869b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d7c594d8c7017c95eb1b4234b869b4")).intValue();
        }
        if (this.h.get() != 2) {
            return 12001;
        }
        return this.f.endCall();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0224b9c27ec5d981c822f8134c59eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0224b9c27ec5d981c822f8134c59eaa");
        } else if (this.h.get() != 2) {
        } else {
            this.g.a(z);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81528e409735f678090b0876a25660e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81528e409735f678090b0876a25660e6")).booleanValue();
        }
        if (this.h.get() != 2) {
            return false;
        }
        return this.g.b();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b641901d433552afc971a746340381a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b641901d433552afc971a746340381a5");
        } else if (this.h.get() != 2) {
        } else {
            this.g.b(z);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55de0956540ec28c689d4b9ba6beb2f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55de0956540ec28c689d4b9ba6beb2f8")).booleanValue();
        }
        if (this.h.get() != 2) {
            return false;
        }
        return this.g.c();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final e g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babce4c5433ab1e9aa7b1397213d781f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babce4c5433ab1e9aa7b1397213d781f") : this.f != null ? this.f.getCallSession() : new com.meituan.android.customerservice.cscallsdk.inner.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b8fa9ad686f7390cb52edf895f579e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b8fa9ad686f7390cb52edf895f579e");
            return;
        }
        CallLog.log("CallManager", str);
        b(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ae2fb8a30dcc8d937ccb01a97e57db6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ae2fb8a30dcc8d937ccb01a97e57db6");
                } else {
                    c.this.u.notify(str, obj);
                }
            }
        });
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e.a
    public final void a(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eac9c4c6877f9449778049510b359e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eac9c4c6877f9449778049510b359e9");
            return;
        }
        CallLog.log("CallManager", "onStateChanged:===" + i + ", " + i2 + " sid" + g().c());
        int i4 = 3;
        if (i == 3) {
            com.meituan.android.customerservice.callbase.avengine.b bVar = this.g;
            String c = g().c();
            String a2 = g().a();
            Object[] objArr2 = {c, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.callbase.avengine.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "bbb1c39b8611496350952210363b81d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "bbb1c39b8611496350952210363b81d8");
                return;
            }
            if (!bVar.q.isEmpty()) {
                if (bVar.t < 5) {
                    i3 = 0;
                } else if (bVar.t >= 5 && bVar.t < 20) {
                    i3 = 1;
                } else if (bVar.t < 20 || bVar.t >= 40) {
                    i3 = (bVar.t < 40 || bVar.t >= 70) ? 4 : 3;
                } else {
                    i3 = 2;
                }
                CallLog.i("AVEngine", "sendMediaMonitor mMaxFrozen " + i3);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(i3, 0, bVar.a(c, a2, bVar.q), "cs_voip_media_frozenrate");
            } else {
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, 0, bVar.a(c, a2, null), "cs_voip_media_frozenrate");
            }
            bVar.q.clear();
            bVar.t = 0;
            if (!bVar.r.isEmpty()) {
                if (bVar.u < 150) {
                    i4 = 0;
                } else if (bVar.u >= 150 && bVar.u < 400) {
                    i4 = 1;
                } else if (bVar.u >= 400 && bVar.u < 800) {
                    i4 = 2;
                } else if (bVar.u < 800 || bVar.u >= 1500) {
                    i4 = 4;
                }
                CallLog.i("AVEngine", "sendMediaMonitor mMaxNetWorkDelay " + i4);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(i4, 0, bVar.a(c, a2, bVar.r), "cs_voip_media_networktransportdelay");
            } else {
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, 0, bVar.a(c, a2, null), "cs_voip_media_networktransportdelay");
            }
            bVar.r.clear();
            bVar.u = 0;
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final com.meituan.android.customerservice.callbase.base.c h() {
        return this.e;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final int i() {
        return this.y;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbeb3c8ae390903ed973850cd68248f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbeb3c8ae390903ed973850cd68248f2");
        } else if (this.h.get() != 2) {
        } else {
            this.f.addCallRingPhoneListener(aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void b(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b01cb7b9280cb1ae9f92b51d056f38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b01cb7b9280cb1ae9f92b51d056f38");
        } else if (this.h.get() != 2) {
        } else {
            this.f.removeCallRingPhoneListener(aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void a(d.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94b3dfd2bc39f3a3d4433a9a9b4dee80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94b3dfd2bc39f3a3d4433a9a9b4dee80");
        } else if (this.h.get() != 2) {
        } else {
            this.d.add(cVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d
    public final void b(d.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a356aba54b7f71de59e2a8b9b415b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a356aba54b7f71de59e2a8b9b415b0");
        } else if (this.h.get() != 2) {
        } else {
            this.d.remove(cVar);
        }
    }

    private synchronized boolean k() {
        boolean z;
        if (this.e != null) {
            z = this.y == 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r3.y == 11) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean l() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.meituan.android.customerservice.callbase.base.c r0 = r3.e     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            int r0 = r3.y     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == r1) goto L10
            int r0 = r3.y     // Catch: java.lang.Throwable -> L15
            r2 = 11
            if (r0 != r2) goto L12
        L10:
            monitor-exit(r3)
            return r1
        L12:
            r0 = 0
            monitor-exit(r3)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.cscallsdk.c.l():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9d3dda1a56372c6fb48694b82a8b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9d3dda1a56372c6fb48694b82a8b51");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.w.post(runnable);
        }
    }

    private void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac98787b2b8df0f2b71fa98c4f861d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac98787b2b8df0f2b71fa98c4f861d4");
        } else {
            CallHandleWorker.getInstance().runOnWorkerThread(runnable);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onMakeCallSuccess(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbb77422622e790987250269b34eaa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbb77422622e790987250269b34eaa9");
        } else {
            a("onMakeCallSuccess", aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onMakeCallTimeout(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631f0fbf805fc40b7eff3808591f3e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631f0fbf805fc40b7eff3808591f3e4c");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, aVar.a);
        hashMap.put("legid", aVar.b);
        com.meituan.android.customerservice.callbase.csmonitor.a.a().a(3, (int) (System.currentTimeMillis() - this.C), hashMap, "cs_voip_callertalking_success");
        a("onMakeCallTimeout", aVar);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onAcceptInviteTimeout(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed005d5ce0e007b86a1624f8e10bed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed005d5ce0e007b86a1624f8e10bed8");
        } else {
            a("onAcceptInviteTimeout", aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onJoinCallRes(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f38e4aa702650c135c098ee5b0c2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f38e4aa702650c135c098ee5b0c2cb");
        } else {
            a("onJoinCallRes", dVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onInvited(b.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531ce2a3905faae2e32dcf10e4524f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531ce2a3905faae2e32dcf10e4524f34");
        } else {
            a("onInvited", fVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onCallEstablishing(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f06cde9b797649abf42a9db1a362e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f06cde9b797649abf42a9db1a362e8e");
        } else {
            a("onCallEstablishing", aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onRejoinSuccess(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583e7e2f58b06e9e180382603b1638a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583e7e2f58b06e9e180382603b1638a3");
        } else {
            a("onRejoinSuccess", aVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onTalking() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64075a425f5ddb9dbab1f5e3f686796a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64075a425f5ddb9dbab1f5e3f686796a");
            return;
        }
        com.meituan.android.customerservice.callbase.avengine.b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.callbase.avengine.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2bbca210d405ad6d85cdd4bdd74153ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2bbca210d405ad6d85cdd4bdd74153ba");
        } else {
            CallLog.log("AVEngine", "todo init audio" + bVar.o);
            bVar.a();
            bVar.b.enableAudio();
            bVar.b.muteLocalAudioStream(bVar.o);
            bVar.b.muteAllRemoteAudioStreams(false);
        }
        a("onTalking", (Object) null);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onOtherDeviceAccept(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf6dc6f91d88f0daf800a2de7e8ec47d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf6dc6f91d88f0daf800a2de7e8ec47d");
        } else {
            a("onOtherDeviceAccept", Integer.valueOf(i));
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onOtherDeviceReject(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c23100c6c6b857e04b01d7d36822f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c23100c6c6b857e04b01d7d36822f7");
        } else {
            a("onOtherDeviceReject", Integer.valueOf(i));
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onNetQualityChange(b.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77799bde1d99d1c6457f75e995062855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77799bde1d99d1c6457f75e995062855");
        } else {
            a("onNetQualityChange", gVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onError(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6d66bffd093dd088fedc57bd04e9b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6d66bffd093dd088fedc57bd04e9b9");
            return;
        }
        if (g().d() == 1) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, dVar.a);
            hashMap.put("legid", dVar.b);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(dVar.f, (int) (System.currentTimeMillis() - this.C), hashMap, "cs_voip_callertalking_success");
        }
        a("onError", dVar);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onCallEnd(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d3ca276b7d004f71121fc90f44fbc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d3ca276b7d004f71121fc90f44fbc1");
            return;
        }
        if (g().d() == 1 || g().d() == 0) {
            int i = dVar.f;
            int i2 = dVar.f;
            if (i2 == 9) {
                i = 3;
            } else if (i2 == 12005) {
                i = 8;
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, dVar.a);
            hashMap.put("legid", dVar.b);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(i, (int) (System.currentTimeMillis() - this.C), hashMap, "cs_voip_callertalking_success");
        }
        a("onCallEnd", dVar);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onApp2PhoneChange(b.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d3351113868a1f25ba60f89ca6c2d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d3351113868a1f25ba60f89ca6c2d8");
        } else {
            a("onApp2PhoneChange", cVar);
        }
    }

    @Override // com.meituan.android.customerservice.callbase.avengine.b.e
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f1e434a69cc8c2a3f4934f6bc326f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f1e434a69cc8c2a3f4934f6bc326f81");
        } else if (i == 112) {
            this.f.handleError(10004, "offline");
        } else {
            this.f.handleError(4, "AVError");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    @Override // com.meituan.android.pike.PikeClient.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.cscallsdk.c.a(int):void");
    }

    @Override // com.meituan.android.customerservice.cscallsdk.f
    public final void a(f.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593bf0f71a9a0930322a6ad8212ae19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593bf0f71a9a0930322a6ad8212ae19b");
        } else {
            b("onMeetingEnd", cVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.f
    public final void a(f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1de0b78169cef69328c109e7268cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1de0b78169cef69328c109e7268cc3");
        } else {
            b("onMeetingMemberAdd", bVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.f
    public final void b(f.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad85de9bcaa99919e0f289e2fe0dd76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad85de9bcaa99919e0f289e2fe0dd76");
        } else {
            b("onMeetingMemberLeave", cVar);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.f
    public final void b(f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1abeaee5a7893eff6010f0fbb1552b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1abeaee5a7893eff6010f0fbb1552b48");
        } else {
            b("onMeetingMemberInvited", bVar);
        }
    }

    private void b(final String str, final Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91eff28243673e0fef32988a01561db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91eff28243673e0fef32988a01561db5");
            return;
        }
        CallLog.log("CallManager", str);
        b(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.c.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8518cbbca72d18b4d4a64e90ffea1f36", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8518cbbca72d18b4d4a64e90ffea1f36");
                } else {
                    c.this.v.notify(str, obj);
                }
            }
        });
    }

    @Override // com.meituan.android.customerservice.callbase.avengine.b.f
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca129842173f83d0d4957f754f600cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca129842173f83d0d4957f754f600cc");
        } else if (this.d.isEmpty()) {
        } else {
            Iterator<d.c> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().a(i, i2, i3);
            }
        }
    }
}
