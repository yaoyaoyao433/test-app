package com.sankuai.waimai.platform.net.weaknetwork;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.net.weaknetwork.strategy.a;
import com.sankuai.waimai.platform.net.weaknetwork.strategy.e;
import com.sankuai.waimai.platform.net.weaknetwork.strategy.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    Context b;
    public com.sankuai.waimai.platform.net.weaknetwork.a c;
    e d;
    public boolean e;
    public Handler f;
    String g;
    boolean h;
    com.sankuai.waimai.platform.net.a i;
    public a j;
    private f k;
    private com.sankuai.waimai.platform.net.weaknetwork.strategy.b l;
    private com.sankuai.waimai.platform.net.weaknetwork.strategy.d m;
    private com.sankuai.waimai.platform.net.weaknetwork.strategy.c n;
    private com.sankuai.waimai.platform.net.weaknetwork.strategy.a o;
    private HandlerThread p;
    private ABStrategy q;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z, com.sankuai.waimai.platform.net.a aVar);
    }

    public static /* synthetic */ void a(d dVar, boolean z, String str, int i) {
        boolean z2;
        Integer num;
        boolean z3;
        Integer num2;
        boolean z4;
        Integer num3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "3c5673b1b2a44d269b973fc38fd9bac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "3c5673b1b2a44d269b973fc38fd9bac7");
            return;
        }
        dVar.a().c();
        if (!z) {
            if (dVar.h) {
                return;
            }
            if (dVar.n == null) {
                dVar.n = new com.sankuai.waimai.platform.net.weaknetwork.strategy.c(dVar.c);
            }
            com.sankuai.waimai.platform.net.weaknetwork.strategy.c cVar = dVar.n;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.weaknetwork.strategy.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c77ee18290e41fc47a8148c38e0e241c", RobustBitConfig.DEFAULT_VALUE)) {
                z11 = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c77ee18290e41fc47a8148c38e0e241c")).booleanValue();
            } else {
                cVar.b++;
                boolean z12 = cVar.b < cVar.d && cVar.b % cVar.c == 0;
                com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "FailStrategy doStrategy result : %b, failCount : %d, failCountLimit : %d, failCountConfig  %d", Boolean.valueOf(z12), Long.valueOf(cVar.b), Long.valueOf(cVar.d), Long.valueOf(cVar.c));
                z11 = z12;
            }
            if (z11) {
                dVar.a("waimai_network_api_fail_detection", 0L);
                return;
            }
            return;
        }
        if (dVar.n != null) {
            dVar.n.a();
        }
        Object[] objArr3 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "6eb7daeffa59ad5cfca77f674fd337c0", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "6eb7daeffa59ad5cfca77f674fd337c0")).booleanValue();
        } else {
            z2 = dVar.c != null && (dVar.c.i == null || (num = dVar.c.i.get(str)) == null || num.intValue() <= 0 ? !(dVar.c.j <= 0 || i < dVar.c.j) : i >= num.intValue());
        }
        if (z2) {
            if (dVar.h) {
                return;
            }
            if (dVar.k == null) {
                dVar.k = new f(dVar.c);
            }
            f fVar = dVar.k;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "8200d88af924fbe90b6ec25c004e66b8", RobustBitConfig.DEFAULT_VALUE)) {
                z10 = ((Boolean) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "8200d88af924fbe90b6ec25c004e66b8")).booleanValue();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - fVar.c;
                if (j > fVar.b) {
                    fVar.c = elapsedRealtime;
                    z9 = true;
                } else {
                    z9 = false;
                }
                com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakRttStrategy doStrategy result : %b, offset : %d, intervalTime  %d", Boolean.valueOf(z9), Long.valueOf(j), Integer.valueOf(fVar.b));
                z10 = z9;
            }
            if (z10) {
                dVar.a("waimai_network_weak_rtt_detection", i);
                return;
            }
            return;
        }
        Object[] objArr5 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "950811d7b18a4fb26bbbcd6d54b2923f", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "950811d7b18a4fb26bbbcd6d54b2923f")).booleanValue();
        } else {
            z3 = dVar.c != null && (dVar.c.d == null || (num2 = dVar.c.d.get(str)) == null || num2.intValue() <= 0 ? !(dVar.c.e <= 0 || i <= dVar.c.e) : i > num2.intValue());
        }
        if (z3) {
            if (dVar.h) {
                return;
            }
            if (dVar.l == null) {
                dVar.l = new com.sankuai.waimai.platform.net.weaknetwork.strategy.b(dVar.c);
            }
            com.sankuai.waimai.platform.net.weaknetwork.strategy.b bVar = dVar.l;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.platform.net.weaknetwork.strategy.b.a;
            if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "ab68f11a3f518097382ededfe1bbc4c6", RobustBitConfig.DEFAULT_VALUE)) {
                z8 = ((Boolean) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "ab68f11a3f518097382ededfe1bbc4c6")).booleanValue();
            } else {
                bVar.e++;
                int i2 = bVar.e % bVar.c;
                if (i2 != 0) {
                    com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "AverageRttStrategy doStrategy result : %b, hitCount : %d, countConfig : %d, factor  %d", Boolean.FALSE, Integer.valueOf(bVar.e), Integer.valueOf(bVar.c), Integer.valueOf(i2));
                    z8 = false;
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime2 - bVar.d;
                    long j3 = bVar.b * (bVar.e / bVar.c);
                    if (j2 > j3) {
                        bVar.d = elapsedRealtime2;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "AverageRttStrategy doStrategy result : %b, hitCount : %d, countConfig : %d, offset  %d, currentIntervalTime %d", Boolean.valueOf(z7), Integer.valueOf(bVar.e), Integer.valueOf(bVar.c), Long.valueOf(j2), Long.valueOf(j3));
                    z8 = z7;
                }
            }
            if (z8) {
                dVar.a("waimai_network_average_rtt_detection", i);
                return;
            }
            return;
        }
        Object[] objArr7 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, dVar, changeQuickRedirect7, false, "c0b18e941bf0ea2d21bbf565601eb6d1", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr7, dVar, changeQuickRedirect7, false, "c0b18e941bf0ea2d21bbf565601eb6d1")).booleanValue();
        } else {
            z4 = dVar.c == null || (dVar.c.d == null || (num3 = dVar.c.d.get(str)) == null || num3.intValue() <= 0 ? i <= dVar.c.e : i <= num3.intValue());
        }
        if (z4) {
            if (dVar.l != null) {
                dVar.l.e = 0;
            }
            if (dVar.h) {
                com.sankuai.waimai.platform.net.a a2 = dVar.a(dVar.g);
                if (a2.f > com.sankuai.waimai.platform.net.a.POOR.f) {
                    if (dVar.m == null) {
                        dVar.m = new com.sankuai.waimai.platform.net.weaknetwork.strategy.d(dVar.c);
                    }
                    com.sankuai.waimai.platform.net.weaknetwork.strategy.d dVar2 = dVar.m;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.platform.net.weaknetwork.strategy.d.a;
                    if (PatchProxy.isSupport(objArr8, dVar2, changeQuickRedirect8, false, "e16c78236b1e8209cda481d19c421266", RobustBitConfig.DEFAULT_VALUE)) {
                        z6 = ((Boolean) PatchProxy.accessDispatch(objArr8, dVar2, changeQuickRedirect8, false, "e16c78236b1e8209cda481d19c421266")).booleanValue();
                    } else {
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j4 = elapsedRealtime3 - dVar2.c;
                        if (j4 > dVar2.b) {
                            dVar2.c = elapsedRealtime3;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "GoodRttStrategy doStrategy result : %b, offset : %d, intervalTime  %d", Boolean.valueOf(z5), Long.valueOf(j4), Integer.valueOf(dVar2.b));
                        z6 = z5;
                    }
                    if (z6) {
                        dVar.c(null);
                        dVar.b(a2);
                        dVar.a("waimai_network_good_rtt_detection", true, i);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SuppressLint({"StaticFieldLeak"})
        private static d a = new d();
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f65171a6236b9eb79c012129296ec628", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f65171a6236b9eb79c012129296ec628");
            return;
        }
        this.e = false;
        this.g = "invalid";
        this.h = false;
        this.i = com.sankuai.waimai.platform.net.a.EXCELLENT;
        this.q = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("weak_network_config", null);
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f4213d2fc2556780f34363799daae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f4213d2fc2556780f34363799daae4");
        } else if (this.e) {
        } else {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.b = context.getApplicationContext();
                this.g = p.b(this.b);
                this.c = new com.sankuai.waimai.platform.net.weaknetwork.a();
                if (this.q != null) {
                    com.sankuai.waimai.platform.net.weaknetwork.a aVar = this.c;
                    String paramWithKey = this.q.getParamWithKey("config");
                    Object[] objArr2 = {paramWithKey};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.weaknetwork.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "78b9e5d28b14dbfe2f2f49bf5afaa4f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "78b9e5d28b14dbfe2f2f49bf5afaa4f4");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ConfigInfo parseData config : %s ", paramWithKey);
                        if (!TextUtils.isEmpty(paramWithKey)) {
                            try {
                                JSONObject jSONObject = new JSONObject(paramWithKey);
                                aVar.b = jSONObject.optBoolean("weak_net_switch", false);
                                aVar.c = jSONObject.optBoolean("use_shark_ping", true);
                                aVar.e = jSONObject.optInt("common_good_rtt", aVar.e);
                                aVar.f = jSONObject.optInt("good_rtt_interval_time", aVar.f);
                                aVar.g = jSONObject.optInt("average_rtt_count_config", aVar.g);
                                aVar.h = jSONObject.optInt("average_rtt_interval_time", aVar.h);
                                aVar.j = jSONObject.optInt("common_weak_time", aVar.j);
                                aVar.k = jSONObject.optInt("weak_rtt_interval_time", aVar.k);
                                aVar.l = jSONObject.optInt("fail_count_config", aVar.l);
                                aVar.m = jSONObject.optInt("fail_count_limit", aVar.m);
                                aVar.n = jSONObject.optDouble("weak_ping_rtt", aVar.n);
                                aVar.n = jSONObject.optDouble("weak_shark_ping_rtt", aVar.o);
                                aVar.p = jSONObject.optDouble("average_ping_rtt", aVar.p);
                                aVar.q = jSONObject.optDouble("average_shark_ping_rtt", aVar.q);
                                aVar.d = aVar.a(jSONObject.getJSONObject("good_rtt_config_list"));
                                aVar.i = aVar.a(jSONObject.getJSONObject("weak_rtt_config_list"));
                                aVar.r = jSONObject.optBoolean("active_switch", aVar.r);
                                aVar.s = jSONObject.optInt("active_interval_time", aVar.s);
                                aVar.t = jSONObject.optInt("active_min_interval_time", aVar.t);
                                aVar.u = jSONObject.optInt("active_max_interval_time", aVar.u);
                            } catch (Exception e) {
                                aVar.b = false;
                                com.sankuai.waimai.foundation.utils.log.a.a(e);
                            }
                        }
                    }
                }
                com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel innerInit configInfo : %s ", this.c.toString());
                if (this.c != null && this.c.b) {
                    this.p = new HandlerThread("WeakNetworkKernelThread");
                    this.p.start();
                    this.f = new Handler(this.p.getLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.net.weaknetwork.d.1
                        public static ChangeQuickRedirect a;

                        @Override // android.os.Handler.Callback
                        public final boolean handleMessage(Message message) {
                            boolean z;
                            Object[] objArr3 = {message};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "01b746c8115fd5e8e496f1d22ff94d18", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "01b746c8115fd5e8e496f1d22ff94d18")).booleanValue();
                            }
                            if (message.what == 1) {
                                d.a(d.this, false, null, 10000);
                            } else if (message.what == 0) {
                                if (message.obj == null) {
                                    return true;
                                }
                                String obj = message.obj.toString();
                                if (TextUtils.isEmpty(obj)) {
                                    return true;
                                }
                                String path = Uri.parse(obj).getPath();
                                if (TextUtils.isEmpty(path)) {
                                    return true;
                                }
                                d.a(d.this, true, path, message.arg1);
                            } else if (message.what == 2) {
                                d dVar = d.this;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "e5754b7e3598b215d344e9138ac293e1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "e5754b7e3598b215d344e9138ac293e1");
                                } else {
                                    dVar.g = p.b(dVar.b);
                                    dVar.a().c();
                                    com.sankuai.waimai.platform.net.a a2 = dVar.a(dVar.g);
                                    Object[] objArr5 = {a2};
                                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                    if (!PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "392bf3810ed5cd152e67e5558d11ce08", RobustBitConfig.DEFAULT_VALUE)) {
                                        switch (AnonymousClass4.a[a2.ordinal()]) {
                                            case 1:
                                            case 2:
                                                z = false;
                                                break;
                                            default:
                                                z = true;
                                                break;
                                        }
                                    } else {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "392bf3810ed5cd152e67e5558d11ce08")).booleanValue();
                                    }
                                    if (z) {
                                        dVar.c("waimai_network_state_onchange");
                                    } else {
                                        dVar.b("waimai_network_state_onchange");
                                    }
                                    dVar.b(a2);
                                }
                            }
                            return true;
                        }
                    });
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(new BroadcastReceiver() { // from class: com.sankuai.waimai.platform.net.weaknetwork.WeakNetworkKernel$2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            Object[] objArr3 = {context2, intent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec738f17d23f81bf5e7148bcc6d644ec", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec738f17d23f81bf5e7148bcc6d644ec");
                                return;
                            }
                            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel broadcast onReceive done !!! ", new Object[0]);
                            d.this.f.removeCallbacksAndMessages(null);
                            d.this.f.sendMessage(d.this.f.obtainMessage(2));
                        }
                    }, intentFilter);
                    this.e = true;
                    return;
                }
                this.e = true;
            }
        }
    }

    com.sankuai.waimai.platform.net.weaknetwork.strategy.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d140804212568e5bb1230ef1ad46e299", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.net.weaknetwork.strategy.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d140804212568e5bb1230ef1ad46e299");
        }
        if (this.o == null) {
            this.o = new com.sankuai.waimai.platform.net.weaknetwork.strategy.a(this.c, this.p.getLooper(), new a.InterfaceC1072a() { // from class: com.sankuai.waimai.platform.net.weaknetwork.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.net.weaknetwork.strategy.a.InterfaceC1072a
                public final com.sankuai.waimai.platform.net.a a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f34cb993c907fa6c06dcba018caa4a8e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.sankuai.waimai.platform.net.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f34cb993c907fa6c06dcba018caa4a8e");
                    }
                    if (d.this.d == null) {
                        d.this.d = new e(d.this.c);
                    }
                    if (d.this.i.equals(com.sankuai.waimai.platform.net.a.OFFLINE)) {
                        return d.this.i;
                    }
                    com.sankuai.waimai.platform.net.a a2 = d.this.a(d.this.g);
                    if (a2.f <= com.sankuai.waimai.platform.net.a.POOR.f) {
                        return a2;
                    }
                    com.sankuai.waimai.platform.net.a a3 = d.this.d.a();
                    return a2.f > a3.f ? a3 : a2;
                }

                @Override // com.sankuai.waimai.platform.net.weaknetwork.strategy.a.InterfaceC1072a
                public final void a(com.sankuai.waimai.platform.net.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ea48d4e5c1881de5304088f9b86e7e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ea48d4e5c1881de5304088f9b86e7e8");
                        return;
                    }
                    d.this.c("waimai_network_active_detection");
                    d.this.b(aVar);
                }
            });
        }
        return this.o;
    }

    public static boolean a(com.sankuai.waimai.platform.net.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b8232d1e843adda7a196514c80783e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b8232d1e843adda7a196514c80783e8")).booleanValue() : aVar.equals(com.sankuai.waimai.platform.net.a.GOOD) || aVar.equals(com.sankuai.waimai.platform.net.a.EXCELLENT);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.weaknetwork.d$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a = new int[com.sankuai.waimai.platform.net.a.valuesCustom().length];

        static {
            try {
                a[com.sankuai.waimai.platform.net.a.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.sankuai.waimai.platform.net.a.POOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r13.equals("2G") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.sankuai.waimai.platform.net.a a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.net.weaknetwork.d.a
            java.lang.String r11 = "73747a2bc564a2167312cfc046430788"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.sankuai.waimai.platform.net.a r13 = (com.sankuai.waimai.platform.net.a) r13
            return r13
        L1e:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = 1621(0x655, float:2.272E-42)
            if (r2 == r3) goto L45
            r0 = 1652(0x674, float:2.315E-42)
            if (r2 == r0) goto L3b
            r0 = 1002405936(0x3bbf8030, float:0.0058441386)
            if (r2 == r0) goto L31
            goto L4e
        L31:
            java.lang.String r0 = "Unavailable"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L4e
            r0 = 0
            goto L4f
        L3b:
            java.lang.String r0 = "3G"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L4e
            r0 = 2
            goto L4f
        L45:
            java.lang.String r2 = "2G"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L4e
            goto L4f
        L4e:
            r0 = -1
        L4f:
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L58;
                case 2: goto L55;
                default: goto L52;
            }
        L52:
            com.sankuai.waimai.platform.net.a r13 = com.sankuai.waimai.platform.net.a.EXCELLENT
            return r13
        L55:
            com.sankuai.waimai.platform.net.a r13 = com.sankuai.waimai.platform.net.a.GOOD
            return r13
        L58:
            com.sankuai.waimai.platform.net.a r13 = com.sankuai.waimai.platform.net.a.POOR
            return r13
        L5b:
            com.sankuai.waimai.platform.net.a r13 = com.sankuai.waimai.platform.net.a.OFFLINE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.weaknetwork.d.a(java.lang.String):com.sankuai.waimai.platform.net.a");
    }

    private void a(String str, long j) {
        com.sankuai.waimai.platform.net.a aVar;
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c508f037b9b9004b81ed66ed927e0ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c508f037b9b9004b81ed66ed927e0ddf");
            return;
        }
        if (!this.i.equals(com.sankuai.waimai.platform.net.a.OFFLINE)) {
            if (this.d == null) {
                this.d = new e(this.c);
            }
            aVar = a(this.g);
            if (aVar.f > com.sankuai.waimai.platform.net.a.POOR.f) {
                com.sankuai.waimai.platform.net.a a2 = this.d.a();
                if (aVar.f > a2.f) {
                    aVar = a2;
                }
            }
        } else {
            aVar = this.i;
        }
        boolean a3 = a(aVar);
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel detectNetState netState : %b, tag : %s", Boolean.valueOf(a3), str);
        if (!a3) {
            b((String) null);
        }
        b(aVar);
        a(str, !a3, j);
    }

    void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c8bc3b7b987400306740feee2f29ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c8bc3b7b987400306740feee2f29ef");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel enterWeakNet done !!! ", new Object[0]);
        if (this.l != null) {
            this.l.e = 0;
        }
        if (this.n != null) {
            this.n.a();
        }
        if (this.h) {
            return;
        }
        this.h = true;
        if (!TextUtils.isEmpty(str)) {
            a(str, false, 0L);
        }
        if (a(this.g).f > com.sankuai.waimai.platform.net.a.POOR.f) {
            a().b();
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel enterWeakNet success !!! ", new Object[0]);
    }

    void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f549cd3c836a808b01f7a829472c0f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f549cd3c836a808b01f7a829472c0f5");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel quitWeakNet done !!! ", new Object[0]);
        if (this.l != null) {
            this.l.e = 0;
        }
        if (this.n != null) {
            this.n.a();
        }
        if (this.h) {
            this.h = false;
            a().cancel("waimai_network_active_detection".equals(str));
            if (!TextUtils.isEmpty(str)) {
                a(str, true, 0L);
            }
            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel quitWeakNet success !!! ", new Object[0]);
        }
    }

    void b(com.sankuai.waimai.platform.net.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db9cfc4336eb14b20d794a86165546f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db9cfc4336eb14b20d794a86165546f");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel notifyNetStateChanged done !!! ", new Object[0]);
        if (this.i.equals(aVar)) {
            return;
        }
        this.i = aVar;
        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.net.weaknetwork.d.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "496daf17be0d0b4b66d0596337e21784", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "496daf17be0d0b4b66d0596337e21784");
                } else if (d.this.j != null) {
                    d.this.j.a(d.this.h, d.this.i);
                    com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "WeakNetworkKernel weakNetWork : %b, previousQuality : %s", Boolean.valueOf(d.this.h), d.this.i);
                    if (com.sankuai.waimai.foundation.utils.log.a.b) {
                        Context context = d.this.b;
                        ae.a(context, "网络状态更变:" + d.this.i.name());
                    }
                }
            }
        });
    }

    public static d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b40bc4af58da84b2249eabf241e0ee1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b40bc4af58da84b2249eabf241e0ee1") : b.a;
    }

    private void a(String str, boolean z, long j) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ddfb89ff8536ba66c393a094d5b5482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ddfb89ff8536ba66c393a094d5b5482");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(z ? "_success" : "_failed");
            com.sankuai.waimai.platform.capacity.log.c.a().a(1000, (int) j, sb.toString());
        }
    }
}
