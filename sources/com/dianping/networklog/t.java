package com.dianping.networklog;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.logreportswitcher.c;
import com.dianping.networklog.a.d;
import com.dianping.networklog.ac;
import com.dianping.networklog.ai;
import com.dianping.networklog.u;
import com.dianping.networklog.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class t {
    public static ChangeQuickRedirect a;
    private static volatile t f;
    aa b;
    final ConcurrentLinkedQueue<ac> c;
    final v d;
    volatile boolean e;
    private Context g;
    private final AtomicBoolean h;

    public t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e03f3fbfcd04b728fb840a8f35c904", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e03f3fbfcd04b728fb840a8f35c904");
            return;
        }
        this.c = new ConcurrentLinkedQueue<>();
        this.h = new AtomicBoolean();
        this.d = new v();
        this.e = true;
    }

    public static t a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c81903a20bd5d889640d8f82991995d", 6917529027641081856L)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c81903a20bd5d889640d8f82991995d");
        }
        if (f == null) {
            synchronized (t.class) {
                if (f == null) {
                    f = new t();
                }
            }
        }
        return f;
    }

    public final void a(String str, int i, String[] strArr, long j, long j2) {
        String str2 = str;
        Object[] objArr = {str2, Integer.valueOf(i), strArr, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92411e268d2cb755a66c4bcdbe4f10c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92411e268d2cb755a66c4bcdbe4f10c3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            aa aaVar = this.b;
            if (aaVar != null || this.e) {
                ac acVar = new ac();
                acVar.b = ac.a.WRITE;
                l lVar = new l();
                String name = Thread.currentThread().getName();
                long myTid = c.w ? Process.myTid() : Thread.currentThread().getId();
                boolean z = Looper.getMainLooper() == Looper.myLooper();
                int i2 = c.u;
                if (i2 > 0 && str.length() > i2) {
                    com.dianping.networklog.a.d.a().a(str.length());
                }
                int i3 = c.t;
                if (i3 > 0 && str.length() > i3) {
                    str2 = str2.substring(0, i3);
                }
                lVar.b = str2;
                lVar.f = j;
                lVar.g = j2;
                lVar.h = i;
                lVar.c = z;
                lVar.d = myTid;
                lVar.e = name;
                lVar.i = strArr;
                acVar.c = lVar;
                if (this.c.size() < c.i) {
                    this.c.add(acVar);
                    if (aaVar != null) {
                        aaVar.a();
                    }
                }
            }
        }
    }

    public final void a(String[] strArr, String str, int i, d dVar, String str2) {
        Object[] objArr = {strArr, str, Integer.valueOf(i), dVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad485976923325b844c85a2bd59597ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad485976923325b844c85a2bd59597ae");
        } else {
            a(strArr, str, true, 0, i, false, true, "", dVar, str2);
        }
    }

    public final void a(String[] strArr, String str, boolean z, int i, int i2, boolean z2, boolean z3, String str2, d dVar, String str3) {
        int i3;
        Object[] objArr = {strArr, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        int i4 = 2;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a89042c989853367b55e938de6bcf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a89042c989853367b55e938de6bcf7");
            return;
        }
        int i5 = 0;
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0 || !j.a(this.g)) {
            return;
        }
        aa aaVar = this.b;
        if (aaVar != null || this.e) {
            int length = strArr.length;
            while (i5 < length) {
                String str4 = strArr[i5];
                if (!TextUtils.isEmpty(str4)) {
                    long a2 = aj.a(str4);
                    if (a2 > 0) {
                        ac acVar = new ac();
                        af afVar = new af();
                        if (i2 == i4 && NVLinker.isLinkerInit()) {
                            afVar.l = NVLinker.getUnionID();
                        } else {
                            afVar.l = str;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        afVar.i = sb.toString();
                        afVar.c = str;
                        afVar.m = i2;
                        afVar.s = z2;
                        afVar.j = i;
                        afVar.n = z;
                        afVar.k = str4;
                        afVar.t = z3;
                        afVar.u = str2;
                        afVar.w = dVar;
                        afVar.v = str3;
                        i3 = length;
                        afVar.p = true;
                        afVar.o = c.n;
                        acVar.b = ac.a.SEND;
                        acVar.d = afVar;
                        this.c.add(acVar);
                        if (aaVar != null) {
                            aaVar.a();
                        }
                        i5++;
                        length = i3;
                        i4 = 2;
                    }
                }
                i3 = length;
                i5++;
                length = i3;
                i4 = 2;
            }
            if (c.v) {
                if (i2 == 1 || i2 == 3) {
                    if (c.e) {
                        Log.getStackTraceString(new Throwable());
                    }
                    c.a(Log.getStackTraceString(new Throwable()), 1);
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6de85d2ead09f3121ac5ee780a00bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6de85d2ead09f3121ac5ee780a00bc");
            return;
        }
        final Context a2 = c.a();
        if (a2 == null || !this.h.compareAndSet(false, true)) {
            return;
        }
        this.g = a2;
        com.sankuai.android.jarvis.c.a("LoganCenter.checkContext", new Runnable() { // from class: com.dianping.networklog.t.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4311d63c964f19322779ba96bd0e94b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4311d63c964f19322779ba96bd0e94b");
                    return;
                }
                try {
                    c.d();
                    c.c();
                    if (!t.a(t.this, a2)) {
                        t.this.c();
                        return;
                    }
                    c.b.a.a(a2, new com.dianping.logreportswitcher.b() { // from class: com.dianping.networklog.t.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.logreportswitcher.b
                        public final String a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c125f40d0b7990ea4dc9f89ef11bbd01", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c125f40d0b7990ea4dc9f89ef11bbd01") : String.valueOf(NVLinker.getAppID());
                        }

                        @Override // com.dianping.logreportswitcher.b
                        public final String b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4422dbff7afb626e94d7d59443b5ac3b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4422dbff7afb626e94d7d59443b5ac3b") : NVLinker.getUnionID();
                        }

                        @Override // com.dianping.logreportswitcher.b
                        public final boolean c() {
                            return c.e;
                        }
                    });
                    if (!c.b.a.a("logan")) {
                        t.this.c();
                        return;
                    }
                    Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.dianping.networklog.t.1.2
                        public static ChangeQuickRedirect a;

                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            Object[] objArr3 = {message};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b35523fbe8105f11b1bed66f3e12da7", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b35523fbe8105f11b1bed66f3e12da7");
                                return;
                            }
                            super.handleMessage(message);
                            if (message.what == 273) {
                                c.b((String) message.obj, message.arg1);
                            }
                        }
                    };
                    if (t.this.b == null) {
                        t.this.b = new aa(t.this.c, t.this.d, new h(a2), handler, z.a.a);
                        com.sankuai.android.jarvis.c.a("LoganLoop", "bfe_logan", 30L).execute(t.this.b);
                    }
                    final ai aiVar = ai.a.a;
                    aiVar.a(a2);
                    handler.post(new Runnable() { // from class: com.dianping.networklog.t.1.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "05664bc06de413ffc890d03238507137", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "05664bc06de413ffc890d03238507137");
                                return;
                            }
                            if (j.a(a2)) {
                                t.a(t.this, aiVar);
                                t.b(t.this, a2);
                            }
                            t.d(t.this);
                            t.e(t.this);
                            Context context = a2;
                            Object[] objArr4 = {context};
                            ChangeQuickRedirect changeQuickRedirect4 = u.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "24bcac73ed424a5fd48bdb48fc07a645", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "24bcac73ed424a5fd48bdb48fc07a645");
                            } else if (j.a(context)) {
                            } else {
                                try {
                                    context.getApplicationContext().registerReceiver(new u.a(), new IntentFilter("com.dianping.android.sdk.networklog.action.rollover"));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    });
                    c.c = true;
                } catch (Exception e) {
                    if (c.e) {
                        Log.w("LoganCenter", "checkContext", e);
                    }
                    t.this.c();
                }
            }
        }).start();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410fbde62b83de5077aa52ee791d7ef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410fbde62b83de5077aa52ee791d7ef9");
            return;
        }
        this.e = false;
        this.c.clear();
    }

    public static /* synthetic */ boolean a(t tVar, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "8a97d9ea50796d05acc89ed4e0fe8dd1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "8a97d9ea50796d05acc89ed4e0fe8dd1")).booleanValue() : j.a(context) || (c.s && c.b(j.b(context)));
    }

    public static /* synthetic */ void a(t tVar, ai aiVar) {
        Object[] objArr = {aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "60724cdfff49e83b7e7cb7a21271e21e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "60724cdfff49e83b7e7cb7a21271e21e");
            return;
        }
        for (ae aeVar : aiVar.a()) {
            c.a(aeVar.e, aeVar.c, aeVar.b, aeVar.d, aeVar.g, true, aeVar.f, aeVar.j);
        }
    }

    public static /* synthetic */ void b(t tVar, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "9d83265703eaf5157d5200f43274bb4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "9d83265703eaf5157d5200f43274bb4a");
            return;
        }
        try {
            context.registerReceiver(new p(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void d(t tVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "4e8a5eb859e705fa564cc661e990ed24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "4e8a5eb859e705fa564cc661e990ed24");
        } else {
            NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.networklog.t.3
                public static ChangeQuickRedirect a;

                @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
                public final void onBackgroundStateChanged(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00c98d08a5c3dd35caec22c912f4940a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00c98d08a5c3dd35caec22c912f4940a");
                    } else if (z) {
                        c.b();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void e(t tVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "3dfdae32a05fc18a2b56da83c2438c14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "3dfdae32a05fc18a2b56da83c2438c14");
            return;
        }
        final com.dianping.networklog.a.d a2 = com.dianping.networklog.a.d.a();
        final Context context = tVar.g;
        final d.a aVar = new d.a() { // from class: com.dianping.networklog.t.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.networklog.a.d.a
            public final long a(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98a21f60562defd5011fb9b1aa1eef71", 6917529027641081856L)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98a21f60562defd5011fb9b1aa1eef71")).longValue();
                }
                String valueOf = String.valueOf(j);
                v vVar = t.this.d;
                Object[] objArr3 = {valueOf};
                ChangeQuickRedirect changeQuickRedirect3 = v.a;
                if (PatchProxy.isSupport(objArr3, vVar, changeQuickRedirect3, false, "897ed0cd05bbcd18553e8a31a3f115ed", 6917529027641081856L)) {
                    return ((Long) PatchProxy.accessDispatch(objArr3, vVar, changeQuickRedirect3, false, "897ed0cd05bbcd18553e8a31a3f115ed")).longValue();
                }
                if (vVar.k) {
                    File file = vVar.c;
                    if (file == null) {
                        return 0L;
                    }
                    return vVar.b(valueOf) + new File(file, valueOf).length();
                }
                File file2 = vVar.h;
                if (file2 == null) {
                    return 0L;
                }
                return new File(file2, valueOf).length();
            }
        };
        Object[] objArr2 = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.networklog.a.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d4ded4468e28048ce8918fa94640f592", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d4ded4468e28048ce8918fa94640f592");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.networklog.a.d.b, new Runnable() { // from class: com.dianping.networklog.a.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4c841ef5b4b6c35cab1c71bf9e10e23", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4c841ef5b4b6c35cab1c71bf9e10e23");
                    } else {
                        d.a(d.this, context, aVar);
                    }
                }
            });
        }
    }
}
