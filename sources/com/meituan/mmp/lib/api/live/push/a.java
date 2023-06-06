package com.meituan.mmp.lib.api.live.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.d;
import com.sankuai.meituan.mtlive.pusher.library.i;
import com.tencent.mapsdk.internal.jw;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.sankuai.meituan.mtlive.pusher.library.c, i.c {
    public static ChangeQuickRedirect a;
    private int A;
    private boolean B;
    private boolean C;
    private float D;
    private float E;
    private String F;
    private int G;
    private d H;
    private boolean I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private String N;
    private Context O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private Handler T;
    private int U;
    private int V;
    private int W;
    private float X;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    protected String f;
    protected String g;
    public int h;
    public b i;
    public com.sankuai.meituan.mtlive.pusher.library.c j;
    public String k;
    public i.b l;
    public i.c m;
    public boolean n;
    public c o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private String y;
    private int z;

    public a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9a6401e45c59ae69170f934c1bb383", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9a6401e45c59ae69170f934c1bb383");
            return;
        }
        this.b = "vertical";
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.c = false;
        this.t = 2;
        this.u = -1;
        this.v = -1;
        this.w = false;
        this.x = 0;
        this.d = true;
        this.e = true;
        this.y = "high";
        this.z = 5;
        this.A = 3;
        this.f = "";
        this.B = false;
        this.C = false;
        this.D = 0.0f;
        this.E = 0.0f;
        this.g = "";
        this.F = "voicecall";
        this.G = 0;
        this.h = 0;
        this.I = false;
        this.J = "front";
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = FpsEvent.TYPE_SCROLL_AUTO;
        this.P = false;
        this.Q = false;
        this.R = true;
        this.S = true;
        this.n = false;
        this.U = 1;
        this.V = jw.h;
        this.W = 368;
        this.X = 0.1f;
        this.O = context;
        this.T = new Handler(this.O.getMainLooper());
        this.H = new d(i);
        this.i = new b(context, i);
        this.i.a(this.H.b);
        this.i.a((com.sankuai.meituan.mtlive.pusher.library.c) this);
        this.i.a((i.c) this);
        this.i.d(300);
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c3d5697329ada523a7717849c46b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c3d5697329ada523a7717849c46b43");
        } else {
            this.T.post(new Runnable() { // from class: com.meituan.mmp.lib.api.live.push.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26171e452260719e1dcc2c40b25749e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26171e452260719e1dcc2c40b25749e2");
                        return;
                    }
                    a.this.h = i;
                    a.this.a(i, a.this.b);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r15.equals("horizontal") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(int r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 0
            r8[r9] = r1
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.mmp.lib.api.live.push.a.a
            java.lang.String r12 = "16c2e90c2935219ff152366e27c0fce5"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L22:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 3
            if (r14 == r10) goto L4e
            if (r14 != r2) goto L35
            java.lang.String r14 = "horizontal"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L33
            goto L40
        L33:
            r9 = 2
            goto L4e
        L35:
            if (r14 != 0) goto L42
            java.lang.String r14 = "horizontal"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L4e
        L40:
            r9 = 1
            goto L4e
        L42:
            if (r14 != r0) goto L4c
            java.lang.String r14 = "horizontal"
            r15.equals(r14)
            r9 = 3
            goto L4e
        L4c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L4e:
            if (r9 == r1) goto L5e
            com.sankuai.meituan.mtlive.pusher.library.d r14 = r13.H
            r14.a(r9)
            com.meituan.mmp.lib.api.live.push.b r14 = r13.i
            com.sankuai.meituan.mtlive.pusher.library.d r15 = r13.H
            com.sankuai.meituan.mtlive.pusher.library.f r15 = r15.b
            r14.a(r15)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.live.push.a.a(int, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r17.equals("pause") != false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.live.push.a.a(java.lang.String, org.json.JSONObject):int");
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5d501bb15aee5c34e9f4322de372ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5d501bb15aee5c34e9f4322de372ea");
        } else if (this.I || !z) {
        } else {
            this.o.setVisibility(0);
            this.i.a(this.o);
            this.I = true;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d1778599d557b5ed156ca2d472fe30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d1778599d557b5ed156ca2d472fe30");
            return;
        }
        this.i.a(true);
        this.I = false;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1143db9890981b45a9c08410f8b64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1143db9890981b45a9c08410f8b64d");
        } else if (z) {
            this.i.a();
        }
    }

    public final int c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233537b694b3a9b0bb8b939218d47e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233537b694b3a9b0bb8b939218d47e2e")).intValue();
        }
        this.K = this.i.e();
        if (this.K) {
            if (z) {
                this.L = z;
                if (this.p && this.j != null) {
                    this.j.a(5000, new Bundle());
                }
                return a("stop", (JSONObject) null);
            }
            return a("pause", (JSONObject) null);
        }
        return 0;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d7081c7fc48abf21579a5e3cbfbfa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d7081c7fc48abf21579a5e3cbfbfa4")).intValue();
        }
        if (this.K) {
            if (this.L) {
                return a("start", (JSONObject) null);
            }
            return a("resume", (JSONObject) null);
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.c
    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948dce6d1f2eb9f142cfc60142b9f0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948dce6d1f2eb9f142cfc60142b9f0bf");
            return;
        }
        if (i == -1307 || i == -1313) {
            a("stop", (JSONObject) null);
        } else if (i == 1003 && this.B) {
            this.i.d(this.B);
        }
        if (!this.p || this.j == null) {
            return;
        }
        this.j.a(i, bundle);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.c
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb6154972ce68679149c2956c1795c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb6154972ce68679149c2956c1795c0");
        } else if (this.j != null) {
            this.j.a(bundle);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5993bd0031a18ce2f758052cda7fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5993bd0031a18ce2f758052cda7fd8");
            return;
        }
        this.r = true;
        if (!this.C || this.m == null) {
            return;
        }
        this.m.c();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15079b21c1be9eb88f947b04009003b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15079b21c1be9eb88f947b04009003b8");
        } else if (!this.C || this.m == null) {
        } else {
            this.m.a(j, j2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924b80db50dfc3396cd75287aae7cc30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924b80db50dfc3396cd75287aae7cc30");
            return;
        }
        this.r = false;
        if (!this.C || this.m == null) {
            return;
        }
        this.m.b(i);
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99dc54635d8f219687dd0aee75b65eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99dc54635d8f219687dd0aee75b65eb4");
            return;
        }
        if (z) {
            this.g = null;
            this.H.a(null, (int) this.D, (int) this.E);
        } else {
            this.f = null;
            this.H.a((Bitmap) null);
        }
        this.i.a(this.H.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.live.push.a.a(android.os.Bundle, boolean):void");
    }
}
