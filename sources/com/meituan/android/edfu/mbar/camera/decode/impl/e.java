package com.meituan.android.edfu.mbar.camera.decode.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.android.edfu.mbar.camera.decode.MBarResult;
import com.meituan.android.edfu.mbar.jni.JNIMbarDetect;
import com.meituan.android.edfu.mbar.netservice.b;
import com.meituan.android.edfu.mbar.netservice.bean.BaseResult;
import com.meituan.android.edfu.mbar.netservice.bean.CodeResult;
import com.meituan.android.edfu.mbar.util.j;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e implements Handler.Callback {
    public static ChangeQuickRedirect a = null;
    private static String h = "e";
    public com.meituan.android.edfu.mbar.camera.decode.f c;
    final Handler d;
    float f;
    com.meituan.android.edfu.mbar.netservice.c g;
    private ExecutorService k;
    private Context l;
    private final Handler m;
    private float n;
    private long o;
    private int p;
    private int q;
    private long r;
    private long s;
    private boolean t;
    private c u;
    private h v;
    private com.meituan.android.edfu.edfucamera.argorithm.e w;
    private b.a x;
    private static SoftReference<e> i = new SoftReference<>(null);
    public static float b = 1.0f;
    private static boolean j = true;
    public static boolean e = false;

    public static synchronized e a(Context context) {
        synchronized (e.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfd9d994bd3cc024faa8821a49eae5fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfd9d994bd3cc024faa8821a49eae5fa");
            }
            if (i.get() == null) {
                i = new SoftReference<>(new e(context));
            }
            return i.get();
        }
    }

    private e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d846a8968f6c60f6af496309cd3b361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d846a8968f6c60f6af496309cd3b361");
            return;
        }
        this.c = new com.meituan.android.edfu.mbar.camera.decode.f();
        this.m = new Handler(Looper.getMainLooper(), this);
        this.n = 0.0f;
        this.o = 0L;
        this.p = 0;
        this.q = 0;
        this.r = 0L;
        this.s = 0L;
        this.t = true;
        this.u = new c();
        this.x = new b.a() { // from class: com.meituan.android.edfu.mbar.camera.decode.impl.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.netservice.b.a
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ae62c0af667c7b73978ab050d77040e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ae62c0af667c7b73978ab050d77040e");
                } else if (obj != null) {
                    CodeResult.Res res = ((CodeResult) ((BaseResult) obj).getResult()).getCodeReaderCards().getResult().getRes().get(0);
                    e.this.v.i = j.a(res.getCodeType());
                    e.this.v.h = j.a(e.this.v.i, res.getDecodeRes());
                    String unused = e.h;
                    new StringBuilder("onGetResult: ").append(res.getDecodeRes());
                    Message.obtain(e.this.m, 0, e.this.v).sendToTarget();
                }
            }

            @Override // com.meituan.android.edfu.mbar.netservice.b.a
            public final void a(int i2, String str, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), str, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac6cc4fb2bb28015ed84b80870cf59ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac6cc4fb2bb28015ed84b80870cf59ee");
                    return;
                }
                String unused = e.h;
                new StringBuilder("onDetectFailed: ").append(str);
                boolean unused2 = e.j = true;
            }
        };
        this.l = context;
        HandlerThread handlerThread = new HandlerThread("mbar", 2);
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper(), this);
        this.k = com.sankuai.android.jarvis.c.a(com.meituan.android.edfu.utils.a.a(h), n.PRIORITY_DEFAULT);
        this.g = new com.meituan.android.edfu.mbar.netservice.c(context);
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1907368a17c6bbe7117411f80b9a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1907368a17c6bbe7117411f80b9a97");
            return;
        }
        super.finalize();
        this.d.getLooper().quit();
        j.b();
        this.v = null;
        this.k.shutdown();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        float[] g;
        float[] g2;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6213fde6d9e62c02ad8a99d3f495d9e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6213fde6d9e62c02ad8a99d3f495d9e9")).booleanValue();
        }
        if (com.meituan.android.edfu.mbar.util.g.c && !this.c.h && this.p < 3) {
            new StringBuilder("init code is: ").append(this.c.a());
            this.p++;
        } else if (com.meituan.android.edfu.mbar.util.g.d && !this.c.i && this.q < 3) {
            com.meituan.android.edfu.mbar.camera.decode.f fVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.mbar.camera.decode.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "0e18442167dec1b1696da4b3cdb7a75b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "0e18442167dec1b1696da4b3cdb7a75b");
            } else {
                try {
                    fVar.g = JNIMbarDetect.objInit();
                    new StringBuilder("~~init scanFormat ").append(com.meituan.android.edfu.mbar.util.b.g);
                    JNIMbarDetect.setScanFormat(fVar.g, com.meituan.android.edfu.mbar.util.b.g);
                    fVar.k = com.meituan.android.edfu.mbar.util.b.g;
                    fVar.i = true;
                } catch (Throwable th) {
                    m.a().a("detector", th.getMessage());
                    th.printStackTrace();
                }
            }
            this.q++;
        }
        if (message == null) {
            return false;
        }
        List<MBarResult> list = null;
        switch (message.what) {
            case 0:
                if (message.obj instanceof h) {
                    h hVar = (h) message.obj;
                    m.a().d(System.currentTimeMillis());
                    if (hVar.g != null) {
                        a aVar = new a();
                        aVar.a = com.meituan.android.edfu.mbar.util.b.f;
                        aVar.c = hVar.h;
                        aVar.b = hVar.j;
                        aVar.f = hVar.d;
                        aVar.e = hVar.c;
                        aVar.d = hVar.i;
                        hVar.g.a(aVar);
                    }
                    if (e) {
                        return true;
                    }
                    m.a().a(hVar.k, hVar.h);
                    return true;
                }
                break;
            case 1:
                h hVar2 = (h) message.obj;
                if (!e) {
                    m.a().a(hVar2.k, hVar2.h);
                }
                if (com.meituan.android.edfu.mbar.util.b.d && com.meituan.android.edfu.mbar.util.b.e) {
                    float b2 = this.c.b();
                    if (b2 > 1.0d && hVar2.g != null) {
                        b *= b2;
                        hVar2.g.a(b2);
                    }
                }
                if (hVar2.g != null && m.s) {
                    this.u.c = this.c.i();
                    this.u.d = this.c.g();
                    this.u.e = hVar2.c;
                    this.u.f = hVar2.d;
                    if (this.u.d != null && this.u.d.length > 5 && (this.u.d[1] > 1300.0f || this.u.d[2] > 700.0f || this.u.d[3] < 700.0f || this.u.d[4] < 400.0f)) {
                        this.u.g = 0;
                        this.u.h = this.c.c();
                        hVar2.g.a(this.u);
                    }
                }
                if (com.meituan.android.edfu.mbar.util.e.b && com.meituan.android.edfu.mbar.util.h.b && m.r && this.u.b > 0.0f && hVar2.g != null) {
                    this.u.g = 1;
                    hVar2.g.a(this.u);
                }
                if (message.obj instanceof h) {
                    h hVar3 = (h) message.obj;
                    if (hVar3.g != null) {
                        hVar3.g.a();
                        return true;
                    }
                    return true;
                }
                break;
            case 2:
                this.o++;
                if (this.o == 1) {
                    this.r = System.currentTimeMillis();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (message.obj instanceof h) {
                    final h hVar4 = (h) message.obj;
                    String str = "";
                    if (!com.meituan.android.edfu.mbar.util.b.f) {
                        str = this.c.a(hVar4.k);
                    } else {
                        list = this.c.b(hVar4.k);
                    }
                    String str2 = str;
                    if (this.t && (g2 = this.c.g()) != null && g2[0] > 0.0f) {
                        m.a().c(System.currentTimeMillis() - ((!this.c.d() || this.c.f() <= 0) ? 0 : this.c.f()));
                        j.c = System.currentTimeMillis();
                        this.t = false;
                        e = true;
                    }
                    if (m.k || m.l) {
                        float[] g3 = this.c.g();
                        if (g3 != null && g3[0] > 0.0f) {
                            m.a().a((float) this.o, g3[1], g3[2], g3[3], g3[4]);
                            float i2 = this.c.i();
                            if (i2 > this.f) {
                                this.f = i2;
                                m.a().a(hVar4.k, str2);
                            }
                        } else {
                            m.a().a((float) this.o, -1.0f, -1.0f, -1.0f, -1.0f);
                        }
                    }
                    if ((TextUtils.isEmpty(str2) || str2.equals("")) && m.v && j.a(this.c, com.meituan.android.edfu.mbar.util.g.d, j, this.c.c())) {
                        Object[] objArr3 = {hVar4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab3883c1f160320624f32ac9e76b6873", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab3883c1f160320624f32ac9e76b6873");
                        } else {
                            Object[] objArr4 = {hVar4};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ba538bd8c8847fb768f211dc15d590b9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ba538bd8c8847fb768f211dc15d590b9");
                            } else {
                                if (this.w == null && hVar4.k != null) {
                                    this.w = new com.meituan.android.edfu.edfucamera.argorithm.e();
                                    this.w.e = hVar4.k.e;
                                    this.w.f = new byte[hVar4.k.f.length];
                                    this.w.b = hVar4.k.b;
                                    this.w.c = hVar4.k.c;
                                    this.w.d = hVar4.k.d;
                                    this.w.i = hVar4.k.i;
                                }
                                if (this.w.b != hVar4.k.b || this.w.c != hVar4.k.c) {
                                    this.w.a();
                                    this.w.e = hVar4.k.e;
                                    this.w.f = new byte[hVar4.k.f.length];
                                    this.w.b = hVar4.k.b;
                                    this.w.c = hVar4.k.c;
                                    this.w.d = hVar4.k.d;
                                    this.w.i = hVar4.k.i;
                                }
                                System.arraycopy(hVar4.k.f, 0, this.w.f, 0, hVar4.k.f.length);
                            }
                            this.k.execute(new Runnable() { // from class: com.meituan.android.edfu.mbar.camera.decode.impl.e.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cb5c914d30ef092bf3ac38dc49e743ac", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cb5c914d30ef092bf3ac38dc49e743ac");
                                    } else if (j.a()) {
                                    } else {
                                        if (!j.a(e.this.l)) {
                                            String unused = e.h;
                                            j.a(System.currentTimeMillis());
                                            boolean unused2 = e.j = true;
                                            return;
                                        }
                                        e.this.v = new h(null, hVar4.c, hVar4.d, false, null, null, hVar4.g);
                                        boolean unused3 = e.j = false;
                                        j.a(e.this.g, e.this.w, e.this.x);
                                    }
                                }
                            });
                        }
                    }
                    new StringBuilder(" result is:").append(str2);
                    if (!TextUtils.isEmpty(str2) && m.v && (g = this.c.g()) != null && g.length > 5 && ((int) g[6]) == 57) {
                        str2 = "";
                    }
                    if ((!TextUtils.isEmpty(str2) && !str2.equals("")) || (list != null && list.size() > 0)) {
                        a(System.currentTimeMillis() - currentTimeMillis);
                        this.s = System.currentTimeMillis() - this.r;
                        if (!com.meituan.android.edfu.mbar.util.b.f) {
                            j.a(true);
                            hVar4.h = str2;
                            float[] g4 = this.c.g();
                            if (g4 != null && g4.length > 5) {
                                int i3 = (int) g4[6];
                                hVar4.i = i3;
                                new StringBuilder(" format value is:").append(i3);
                            }
                        } else {
                            hVar4.j = list;
                        }
                        Message.obtain(this.m, 0, hVar4).sendToTarget();
                        if (this.c.d() && this.c.f() > 0) {
                            m.a().a("mbar_frame_decode", this.c.f());
                        }
                        if (this.c.d() && this.c.e() > 0) {
                            m.a().a("mbar_frame_detect", this.c.e());
                        }
                        m.a().a("mbar_frame_process", this.n);
                        m.a().a("mbar_frame_count", (float) this.o);
                        m.a().a("mbar_decode_alltime", (float) this.s);
                        m.a().a("detector", "result: " + str2);
                        return true;
                    }
                    if (com.meituan.android.edfu.mbar.util.e.b && com.meituan.android.edfu.mbar.util.h.b && m.r) {
                        if (this.c.g() != null) {
                            this.u.b = this.c.h();
                        }
                    } else {
                        this.u.b = -1.0f;
                    }
                    a(System.currentTimeMillis() - currentTimeMillis);
                    Message.obtain(this.m, 1, hVar4).sendToTarget();
                    return true;
                }
                return false;
            case 3:
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2b3b6738df1b0bf29ebe37f63ae8558c", RobustBitConfig.DEFAULT_VALUE)) {
                    this.o = 0L;
                    this.p = 0;
                    this.q = 0;
                    this.n = 0.0f;
                    this.t = true;
                    this.v = null;
                    j = true;
                    j.b();
                    com.meituan.android.edfu.mbar.netservice.c cVar = this.g;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.edfu.mbar.netservice.c.a;
                    if (!PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "9987fd63823415d95153dee68daa3f8b", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar.d = true;
                        if (cVar.c != null && !cVar.c.isUnsubscribed()) {
                            cVar.c.unsubscribe();
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "9987fd63823415d95153dee68daa3f8b");
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2b3b6738df1b0bf29ebe37f63ae8558c");
                    break;
                }
                break;
        }
        return false;
    }

    private void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926ee39ab0d8ff8b33fb2f4a75f13aa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926ee39ab0d8ff8b33fb2f4a75f13aa2");
            return;
        }
        if (this.o == Long.MAX_VALUE) {
            this.o = 0L;
            this.n = 0.0f;
        }
        this.n = ((this.n * ((float) (this.o - 1))) + ((float) j2)) / ((float) this.o);
    }

    public final String a(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68cbaea419833dc216d0f7721db7bba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68cbaea419833dc216d0f7721db7bba9");
        }
        if (this.c != null) {
            return this.c.c(eVar);
        }
        return null;
    }

    public final float[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0485073989737c9cf8dd58f1d9aaa830", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0485073989737c9cf8dd58f1d9aaa830");
        }
        if (this.c != null) {
            return this.c.g();
        }
        return null;
    }
}
