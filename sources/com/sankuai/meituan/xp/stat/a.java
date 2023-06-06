package com.sankuai.meituan.xp.stat;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.d;
import com.sankuai.meituan.mtliveqos.utils.a;
import com.sankuai.meituan.xp.core.XPlayer;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.meituan.xp.core.bean.XPMediaInfo;
import com.sankuai.meituan.xp.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private ScheduledExecutorService F;
    private c.EnumC0620c G;
    private boolean H;
    private XPlayer I;
    private String J;
    private boolean K;
    private com.sankuai.meituan.mtliveqos.utils.a L;
    private int M;
    private a.InterfaceC0621a N;
    AtomicInteger b;
    public final Context c;
    public String d;
    public String e;
    public long f;
    protected boolean g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    volatile int m;
    long n;
    public AtomicBoolean o;
    public long p;
    public long q;
    c.f r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    public void e() {
    }

    public boolean g() {
        return true;
    }

    public a(Context context, XPlayer xPlayer, com.sankuai.meituan.mtliveqos.utils.a aVar) {
        Object[] objArr = {context, xPlayer, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3afc254289d72bbb444d30992a1e62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3afc254289d72bbb444d30992a1e62");
            return;
        }
        this.b = new AtomicInteger(-1);
        this.o = new AtomicBoolean(false);
        this.N = new a.InterfaceC0621a() { // from class: com.sankuai.meituan.xp.stat.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.utils.a.InterfaceC0621a
            public final void a(double d, double d2) {
                Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2c82e1aba2b184068e05246b8bffd21", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2c82e1aba2b184068e05246b8bffd21");
                } else {
                    a.this.a(false, d, d2);
                }
            }
        };
        this.c = context;
        this.I = xPlayer;
        this.L = aVar;
    }

    public com.sankuai.meituan.mtliveqos.statistic.b a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3955ff6b70bcd3dc9c937498d1eb2342", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3955ff6b70bcd3dc9c937498d1eb2342");
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.b = this.k + Constants.GestureMoveEvent.KEY_X + this.l;
        bVar.d = this.r == null ? c.f.PLAY : this.r;
        bVar.e = c.g.RIVER_RUN;
        bVar.i = this.j;
        bVar.k = this.i;
        bVar.m = k();
        bVar.h = this.d;
        bVar.f = false;
        bVar.c = this.h;
        bVar.q = this.J;
        bVar.s = this.e;
        bVar.t = e.a().b;
        long currentTimeMillis = System.currentTimeMillis();
        if (z && this.s > 0) {
            long o = (currentTimeMillis - this.s) - o();
            if (o > 0) {
                bVar.o = o / 1000;
            }
        }
        bVar.p = currentTimeMillis;
        return bVar;
    }

    private void a(c.b bVar, long j) {
        Object[] objArr = {bVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6c7571a089f863e7d68a2207b71c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6c7571a089f863e7d68a2207b71c10");
            return;
        }
        Context context = this.c;
        com.sankuai.meituan.mtliveqos.statistic.b a2 = a(false);
        Object[] objArr2 = {context, a2, bVar, new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3fcf427db944614a2d1e8cc59ee11eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3fcf427db944614a2d1e8cc59ee11eb7");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_LIVE_TYPE", String.valueOf(a2.d.l));
        hashMap.put("MTLIVE_METRIC_SOURCE", String.valueOf(a2.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, a2, bVar, j, hashMap);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c36ff37c6fc50c3947033774690ff2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c36ff37c6fc50c3947033774690ff2a");
            return;
        }
        if (this.L != null) {
            this.L.a(this.N);
        }
        if (this.E) {
            h();
            return;
        }
        this.b.set(0);
        this.H = false;
        this.E = false;
        if (g()) {
            m();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bb5c287bd3e42bc5639867a86448a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bb5c287bd3e42bc5639867a86448a1");
            return;
        }
        this.E = true;
        a("", "", "livePause");
        a("livePause");
        this.b.set(1);
        a(c.b.MTLIVE_EVENT_APP_DID_ENTER_BACKGROUND, System.currentTimeMillis());
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c111a4b02982cb98b42581c966ccd319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c111a4b02982cb98b42581c966ccd319");
            return;
        }
        a("", "", "liveResume");
        a("liveResume");
        this.b.set(2);
        this.E = false;
        a(c.b.MTLIVE_EVENT_APP_WILL_ENTER_FOREGROUND, System.currentTimeMillis());
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb75bdccdc6ce718debfc94602ae1cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb75bdccdc6ce718debfc94602ae1cb9");
            return;
        }
        a("", "", "liveStop");
        a("liveStop");
        this.b.set(3);
        this.E = false;
        i();
        this.q = 0L;
        this.p = 0L;
        j();
        if (!g() || this.M <= 0 || this.o.get()) {
            return;
        }
        c(true);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a403d58372eb8cbf4926d706286eb563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a403d58372eb8cbf4926d706286eb563");
        } else if (g() && !this.H && this.s > 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            long currentTimeMillis = (System.currentTimeMillis() - this.s) - o();
            if (currentTimeMillis > 0) {
                hashMap.put("MTLIVE_LIVE_DURATION", Float.valueOf((float) (currentTimeMillis / 1000)));
            }
            a(hashMap, hashMap2);
            this.H = true;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c93522d3e13795b9ca53deb2b99fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c93522d3e13795b9ca53deb2b99fdc");
            return;
        }
        a("", "", "liveRelease");
        a("liveRelease");
        this.b.set(4);
        i();
        j();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "120ad9b7fe34c65ea018ca5d5ff27f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "120ad9b7fe34c65ea018ca5d5ff27f24");
            return;
        }
        this.M = 0;
        this.G = null;
        this.m = 0;
        this.q = 0L;
        this.p = 0L;
        a("", "", "liveReleaseReset shutdown ScheduledExecutorService");
        a("liveReleaseReset shutdown ScheduledExecutorService");
        if (this.F != null) {
            this.F.shutdownNow();
            this.F = null;
        }
        if (this.L != null) {
            this.L.d();
            this.L.b(this.N);
        }
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e53c8f765b299b33eb92f5ba0a65e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e53c8f765b299b33eb92f5ba0a65e5");
            return;
        }
        String string = bundle.getString("file");
        String string2 = bundle.getString("func");
        String string3 = bundle.getString("description");
        try {
            string = TextUtils.isEmpty(string) ? "" : string.substring(string.lastIndexOf("/"), string.length());
        } catch (Exception unused) {
        }
        a(string, string2, string3);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8c3c719a661d0cd7cd6881e866fb61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8c3c719a661d0cd7cd6881e866fb61");
        } else if (g()) {
            new StringBuilder("reportJavaEvent2Es: ").append(str);
            Context context = this.c;
            com.sankuai.meituan.mtliveqos.statistic.b a2 = a(false);
            com.sankuai.meituan.mtliveqos.c.a(context, a2, hashCode() + "_xplayer_java_event", str);
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b607d2966c727f00ab13d608579b5c33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b607d2966c727f00ab13d608579b5c33");
            return;
        }
        com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
        cVar.b = str;
        cVar.c = str2;
        cVar.d = str3;
        d.a(this.c, a(false), cVar, (Map<String, String>) null);
    }

    private c.EnumC0620c k() {
        if (this.G == null) {
            return c.EnumC0620c.UNKNOWN;
        }
        return this.G;
    }

    public void a(int i, int i2, int i3, Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a52afab52cbc852ecaf79fa295bef04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a52afab52cbc852ecaf79fa295bef04");
        } else if (i != 200) {
            if (i == 435) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "754541a047c6be9189b7a992acd8204d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "754541a047c6be9189b7a992acd8204d");
                } else {
                    this.z = System.currentTimeMillis();
                }
            } else if (i == 434) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5dc65bc46b79dd24d4b19e70ba57387", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5dc65bc46b79dd24d4b19e70ba57387");
                } else {
                    this.t = System.currentTimeMillis();
                }
            } else if (i == 436) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ec48c65299f7165e0c04262f4a20f813", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ec48c65299f7165e0c04262f4a20f813");
                } else {
                    this.x = System.currentTimeMillis();
                }
            } else if (i == 437) {
                Object[] objArr5 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4e7773653c940f9891b143cbefc96c16", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4e7773653c940f9891b143cbefc96c16");
                } else {
                    new StringBuilder("recordVideoComponentOpen: ").append(i2);
                    this.y = System.currentTimeMillis();
                    long j5 = i2;
                    Object[] objArr6 = {new Long(j5)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e1504a60afba3b110fb073ea9f8d7e62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e1504a60afba3b110fb073ea9f8d7e62");
                    } else {
                        this.G = c.EnumC0620c.UNKNOWN;
                        if (j5 == c.EnumC0620c.HARDWARE.f) {
                            this.G = c.EnumC0620c.HARDWARE;
                        } else if (j5 == c.EnumC0620c.SOFTWARE.f) {
                            this.G = c.EnumC0620c.SOFTWARE;
                        }
                    }
                }
                new StringBuilder("postEventFromNative: FFP_MSG_VIDEO_COMPONENT_OPEN = ").append(i2);
            } else if (i == 438) {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4d680cffdb7a6f8cdacf39bcdae690b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4d680cffdb7a6f8cdacf39bcdae690b2");
                } else {
                    this.A = System.currentTimeMillis();
                }
            } else if (i == 439) {
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2a90f324a47bd12d783f18cd8f3e7cdc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2a90f324a47bd12d783f18cd8f3e7cdc");
                } else {
                    this.B = System.currentTimeMillis();
                }
            } else if (i == 440) {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "1e935112f6202507e0709fbc6e2f1e6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "1e935112f6202507e0709fbc6e2f1e6b");
                } else {
                    this.C = System.currentTimeMillis();
                }
            } else if (i != 441) {
                if (i == 2103) {
                    this.J = (String) obj;
                }
            } else {
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "7ea352001c398406b83aee2de9d7f587", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "7ea352001c398406b83aee2de9d7f587");
                } else {
                    this.D = System.currentTimeMillis();
                }
            }
        } else if (i2 == 10005) {
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "2afc659a3e6ebe22d27d8877cc2894b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "2afc659a3e6ebe22d27d8877cc2894b4");
            } else {
                this.u = System.currentTimeMillis();
            }
        } else if (i2 == 10006) {
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "3657ee0a339abec6b012e4e1e74a0dae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "3657ee0a339abec6b012e4e1e74a0dae");
            } else {
                this.v = System.currentTimeMillis();
            }
        } else if (i2 == 10007) {
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "2d69c0080b1402d9715d4f97bb9067b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "2d69c0080b1402d9715d4f97bb9067b2");
            } else {
                this.w = System.currentTimeMillis();
            }
        } else if (i2 == 3) {
            Object[] objArr14 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "5b3ff7ebe5b0c5d4f74d01569a3e8259", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "5b3ff7ebe5b0c5d4f74d01569a3e8259");
            } else if ((g() || !TextUtils.isEmpty(this.h)) && !this.g && this.s > 0) {
                this.g = true;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = currentTimeMillis - this.s;
                long j7 = this.t - this.s;
                long j8 = this.u - this.t;
                long j9 = this.v - this.u;
                long j10 = this.x - this.v;
                long j11 = this.y - this.x;
                long j12 = this.w - this.v;
                long j13 = this.z - this.w;
                long j14 = this.D - this.z;
                long j15 = this.C - this.D;
                long j16 = this.A - this.C;
                long j17 = this.B - this.A;
                long j18 = currentTimeMillis - this.B;
                hashMap.put("MTLIVE_FIRST_VIDEO_FRAME", Float.valueOf((float) j6));
                hashMap.put("MTLIVE_INIT", Float.valueOf((float) j7));
                hashMap.put("MTLIVE_FIRST_FRAME_DNS_COST", Float.valueOf((float) this.f));
                hashMap.put("MTLIVE_OPEN_INPUT", Float.valueOf((float) j8));
                hashMap.put("MTLIVE_FIND_STREAM_INFO", Float.valueOf((float) j9));
                hashMap.put("MTLIVE_AUDIO_COMPONENT_OPEN", Float.valueOf((float) j10));
                hashMap.put("MTLIVE_VIDEO_COMPONENT_OPEN", Float.valueOf((float) j11));
                hashMap.put("MTLIVE_COMPONENT_OPEN", Float.valueOf((float) j12));
                hashMap.put("MTLIVE_WAIT_START", Float.valueOf((float) j13));
                hashMap.put("MTLIVE_FIRST_FRAME_READ", Float.valueOf((float) j14));
                if (j15 > 0) {
                    j = j14;
                    j2 = j15;
                    hashMap.put("MTLIVE_FIRST_FRAME_BEFORE_DECODE", Float.valueOf((float) j2));
                } else {
                    j = j14;
                    j2 = j15;
                }
                if (j16 > 0) {
                    j3 = j2;
                    j4 = j16;
                    hashMap.put("MTLIVE_FIRST_FRAME_DECODE", Float.valueOf((float) j4));
                } else {
                    j3 = j2;
                    j4 = j16;
                }
                hashMap.put("MTLIVE_FIRST_FRAME_BEFORE_RENDER", Float.valueOf((float) j17));
                hashMap.put("MTLIVE_PROCESS_FIRST_VIDEO", Float.valueOf((float) j18));
                a("", "", String.format("\nFirstFrame: %dms\nInit: %dms \nDNSCost: %dms\nopenInputDuration: %dms\nFindStreamInfo: %dms\naudioComponentOpenDuration: %dms\nvideoComponentOpenDuration: %dms\nComponentOpen: %dms\nWaitStart: %dms\nFirstFrameReadDuration: %dms\nDecoderBeforeDuration: %dms\nFirstDecoderDuration: %dms\nRenderingBeforeDuration: %dms\nfirstRenderTimeDuration: %dms", Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(this.f), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j17), Long.valueOf(j18)));
                a(c.b.MTLIVE_EVENT_FIRST_VIDEO_FRAME_SHOW, System.currentTimeMillis());
                a(hashMap, hashMap2);
            }
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba3e9fc422128fb54335ac6fbc7c38f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba3e9fc422128fb54335ac6fbc7c38f");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("MTLIVE_PLAY_FAILED_COUNT", Float.valueOf(1.0f));
        hashMap2.put("MTLIVE_ERROR_CODE", String.valueOf(f));
        a(hashMap, hashMap2);
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02204e8a03a72ad6f8dee19c3acd9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02204e8a03a72ad6f8dee19c3acd9d2");
            return;
        }
        a("startFirstFrame");
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.K) {
            this.K = true;
            a(c.b.MTLIVE_EVENT_PREPARE_TO_PLAY, currentTimeMillis);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("MTLIVE_PLAY_TOTAL_COUNT", Float.valueOf(1.0f));
        a(hashMap, hashMap2);
        this.s = currentTimeMillis;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b066ec66708441dbf2f37248ba7fc866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b066ec66708441dbf2f37248ba7fc866");
        } else if (z) {
        } else {
            l();
        }
    }

    void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2cd269eb46452ec4e5717f4625db12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2cd269eb46452ec4e5717f4625db12");
        } else if (!z) {
            if (this.L != null) {
                this.L.d();
                this.L.c();
            }
        } else {
            a(true, 0.0d, 0.0d);
        }
    }

    void a(boolean z, double d, double d2) {
        long j;
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06d6e73ee2662a70146b9da5be65bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06d6e73ee2662a70146b9da5be65bb6");
        } else if ((this.b.get() == 2 || this.b.get() == 0) && d >= 0.0d && d2 >= 0.0d) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            StringBuilder sb = new StringBuilder("onStatistics avgFps: ");
            sb.append(d);
            sb.append(", minFps:");
            sb.append(d2);
            hashMap.put("MTLIVE_NATIVE_MIN_FPS", Float.valueOf((float) d2));
            hashMap.put("MTLIVE_NATIVE_AVG_FPS", Float.valueOf((float) d));
            long b = com.meituan.android.time.c.b();
            XPMediaInfo mediaInfo = this.I.getMediaInfo();
            if (mediaInfo.mMeta == null || mediaInfo.mMeta.mAudioStream == null) {
                j = 0;
            } else {
                i = mediaInfo.mMeta.mAudioStream.mSampleRate;
                j = mediaInfo.mMeta.mAudioStream.mChannelLayout;
            }
            hashMap2.put("MTLIVE_AUDIO_SAMPLE_RATE", String.valueOf(i));
            hashMap2.put("MTLIVE_STREAM_URL", this.j);
            hashMap2.put("MTLIVE_NUM_OF_CHANNELS", String.valueOf(j));
            hashMap2.put("MTLIVE_SERVER_IP", this.i);
            hashMap2.put("MTLIVE_DECODE_TYPE", String.valueOf(k().f));
            long b2 = com.meituan.android.time.c.b() - b;
            long b3 = com.meituan.android.time.c.b();
            hashMap.put("MTLIVE_VIDEO_BITRATE", Float.valueOf((((float) this.I.getPropertyLong(XPlayerConstants.FFP_PROP_INT64_VIDEO_BIT_RATE, 0L)) * 8.0f) / 1024.0f));
            hashMap.put("MTLIVE_AUDIO_BITRATE", Float.valueOf((((float) this.I.getPropertyLong(XPlayerConstants.FFP_PROP_INT64_AUDIO_BIT_RATE, 0L)) * 8.0f) / 1024.0f));
            hashMap.put("MTLIVE_FPS", Float.valueOf(this.I.getPropertyFloat(10002, 0.0f)));
            hashMap.put("MTLIVE_GOP", Float.valueOf(this.I.getPropertyFloat(10100, 0.0f)));
            hashMap.put("MTLIVE_GOP_FRAME", Float.valueOf((float) this.I.getPropertyLong(XPlayerConstants.FFP_PROP_FLOAT_GOP_FRAME, 0L)));
            hashMap.put("MTLIVE_VIDEO_DROP", Float.valueOf((float) this.I.getPropertyLong(XPlayerConstants.FFP_PROP_INT64_DROP_FRAME_COUNT, 0L)));
            hashMap.put("MTLIVE_VIDEO_CACHE", Float.valueOf((float) this.I.getPropertyLong(20009, 0L)));
            hashMap.put("MTLIVE_AUDIO_CACHE", Float.valueOf((float) this.I.getPropertyLong(20010, 0L)));
            hashMap.put("MTLIVE_AV_SPEED", Float.valueOf((((float) this.I.getPropertyLong(20200, 0L)) * 8.0f) / 1024.0f));
            hashMap.put("MTLIVE_VIDEO_CACHE_DURATION", Float.valueOf((float) this.I.getPropertyLong(20005, 0L)));
            hashMap.put("MTLIVE_AUDIO_CACHE_DURATION", Float.valueOf((float) this.I.getPropertyLong(20006, 0L)));
            StringBuilder sb2 = new StringBuilder("audio_cache: ");
            sb2.append(this.I.getPropertyLong(20006, 0L));
            sb2.append(" , video_cache: ");
            sb2.append(this.I.getPropertyLong(20005, 0L));
            sb2.append(", av_speed: ");
            sb2.append((this.I.getPropertyLong(20200, 0L) * 8) / 1024);
            hashMap.put("MTLIVE_VIDEO_CACHE_BYTES", Float.valueOf((float) this.I.getPropertyLong(20007, 0L)));
            hashMap.put("MTLIVE_AUDIO_CACHE_BYTES", Float.valueOf((float) this.I.getPropertyLong(20008, 0L)));
            hashMap.put("MTLIVE_DECODE_FPS", Float.valueOf(this.I.getPropertyFloat(10001, 0.0f)));
            hashMap.put("MTLIVE_DROP_FRAME_RATE", Float.valueOf(this.I.getPropertyFloat(10007, 0.0f)));
            hashMap.put("MTLIVE_AVDIFF", Float.valueOf(this.I.getPropertyFloat(10005, 0.0f)));
            hashMap.put("MTLIVE_AUDIO_DROP_IN_DEMUX", Float.valueOf((float) this.I.getPropertyLong(XPlayerConstants.FFP_PROP_INT64_DROP_AUDIO_DURATION, 0L)));
            long b4 = com.meituan.android.time.c.b() - b3;
            long b5 = com.meituan.android.time.c.b();
            long videoFrozenDuration = this.I.getVideoFrozenDuration();
            this.M = (int) (this.M + videoFrozenDuration);
            new StringBuilder("videoFrozenDurationByRender:").append(videoFrozenDuration);
            long b6 = com.meituan.android.time.c.b() - b5;
            hashMap.put("MTLIVE_VIDEO_FROZEN", Float.valueOf((float) videoFrozenDuration));
            hashMap.put("MTLIVE_IS_FROZEN", Float.valueOf(videoFrozenDuration > 0 ? 1.0f : 0.0f));
            if (z) {
                hashMap.put("MTLIVE_TOTAL_VIDEO_FROZEN", Float.valueOf(this.M));
            }
            StringBuilder sb3 = new StringBuilder("onstatistic 距离上次上报间隔:");
            sb3.append(com.meituan.android.time.c.b() - this.n);
            sb3.append(" ,currentTimeMillis： ");
            sb3.append(com.meituan.android.time.c.b());
            sb3.append(", mLastReportTime: ");
            sb3.append(this.n);
            long b7 = com.meituan.android.time.c.b();
            a(hashMap, hashMap2);
            String str = "onStatistic getMediaInfoCost: " + b2 + " ,getBaseStreamInfoCost: " + b4 + ",getVideoFrozenCost: " + b6 + ", sendKVCost: " + (com.meituan.android.time.c.b() - b7) + ",videoFrozenDurationByRender: " + videoFrozenDuration;
            new StringBuilder("onStatistic invalidInfo: ").append(str);
            a(str);
            a("", "", str);
            this.n = com.meituan.android.time.c.b();
        }
    }

    public final void a(Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d00d67f10a901dfd811c0e8553ab36d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d00d67f10a901dfd811c0e8553ab36d6");
            return;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("MTLIVE_CONFIG_RESOLUTON", e.a().c);
        map2.put("MTLIVE_OPTIMIZE_OPEN_FORCE", "1");
        d.a(this.c, a(true), map, map2, null);
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74decf7a1752ad2965766a3034a81d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74decf7a1752ad2965766a3034a81d8");
        } else if (this.b.get() == 4) {
        } else {
            this.n = com.meituan.android.time.c.b();
            a("", "", "taskScheduledRun shutdown ScheduledExecutorService");
            a("taskScheduledRun shutdown ScheduledExecutorService");
            if (this.F != null) {
                this.F.shutdownNow();
                this.F = null;
            }
            n();
            if (this.L != null) {
                this.L.c();
            }
            this.F.scheduleAtFixedRate(new Runnable() { // from class: com.sankuai.meituan.xp.stat.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "346d28791fb1b5dd28937387ab4c0fc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "346d28791fb1b5dd28937387ab4c0fc2");
                        return;
                    }
                    if (a.this.m < Integer.MAX_VALUE) {
                        a.this.m++;
                    } else {
                        a.this.m = 0;
                    }
                    StringBuilder sb = new StringBuilder("before onStatistics currentTimeMillis:");
                    sb.append(com.meituan.android.time.c.b());
                    sb.append(" ,mLastReportTime: ");
                    sb.append(a.this.n);
                    sb.append(", mIsInBackground: ");
                    sb.append(a.this.o.get());
                    a.this.a("call onStatistics when mPlayerStatus: " + a.this.b.get() + " ,mLastReportTime: " + a.this.n + ",reportTimes: " + a.this.m + ", mIsInBackground: " + a.this.o.get());
                    a.this.a("", "", "call onStatistics when mPlayerStatus: " + a.this.b.get() + " ,mLastReportTime: " + a.this.n + ",reportTimes: " + a.this.m + ", mIsInBackground: " + a.this.o.get());
                    if (a.this.o.get()) {
                        return;
                    }
                    a.this.c(false);
                }
            }, com.sankuai.meituan.mtliveqos.b.a(), com.sankuai.meituan.mtliveqos.b.a(), TimeUnit.MILLISECONDS);
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5668fed1de8f843378e3c3d571c64334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5668fed1de8f843378e3c3d571c64334");
        } else if (this.F == null) {
            this.F = com.sankuai.android.jarvis.c.c("riverrun_palyer");
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203e501778977a06ade57cf791ddcfc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203e501778977a06ade57cf791ddcfc9");
        } else {
            a(i);
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd33451ca9b1a76400de41bd7667234", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd33451ca9b1a76400de41bd7667234")).booleanValue() : this.o.get();
    }

    private long o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835ec9faf760c30cdd7626bbb58bf841", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835ec9faf760c30cdd7626bbb58bf841")).longValue();
        }
        if (!this.o.get()) {
            return this.q;
        }
        if (this.p > 0) {
            return this.q + (com.meituan.android.time.c.b() - this.p);
        }
        return 0L;
    }
}
