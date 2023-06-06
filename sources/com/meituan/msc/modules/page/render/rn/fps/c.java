package com.meituan.msc.modules.page.render.rn.fps;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.modules.page.render.rn.MSCFpsHornConfig;
import com.meituan.msc.modules.page.render.rn.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements f.a {
    public static ChangeQuickRedirect a;
    public final d[] b;
    public final com.meituan.msc.modules.page.render.rn.lag.b[] c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5a1fca8d90c877b93829664a05e94c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5a1fca8d90c877b93829664a05e94c");
            return;
        }
        this.b = new d[3];
        this.c = new com.meituan.msc.modules.page.render.rn.lag.b[3];
    }

    public final synchronized void a(Context context, com.meituan.msc.modules.page.render.rn.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2772d79339ae37473e05e8d53ee6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2772d79339ae37473e05e8d53ee6fe");
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        a(context, mainLooper, aVar, 0);
        a(mainLooper, aVar, 0);
    }

    public final synchronized void a(ReactContext reactContext, com.meituan.msc.modules.page.render.rn.a aVar) {
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1edaa69f953e9b20f7a7b0a6220c5051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1edaa69f953e9b20f7a7b0a6220c5051");
            return;
        }
        Looper jSLooper = reactContext.getJSLooper();
        if (jSLooper != null) {
            a(reactContext, jSLooper, aVar, 1);
            a(jSLooper, aVar, 1);
        }
    }

    public final synchronized void b(ReactContext reactContext, com.meituan.msc.modules.page.render.rn.a aVar) {
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbeea7d73b6aee978a851971757884e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbeea7d73b6aee978a851971757884e9");
            return;
        }
        Looper nativeModulesLooper = reactContext.getNativeModulesLooper();
        if (nativeModulesLooper != null) {
            a(reactContext, nativeModulesLooper, aVar, 2);
            a(nativeModulesLooper, aVar, 2);
        }
    }

    private synchronized void a(Context context, Looper looper, a aVar, int i) {
        Object[] objArr = {context, looper, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a554036fc21a7174a3ba11299d27d7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a554036fc21a7174a3ba11299d27d7cd");
        } else {
            this.b[i] = new d(context, new Handler(looper), aVar);
        }
    }

    private synchronized void a(Looper looper, final com.meituan.msc.modules.page.render.rn.lag.c cVar, final int i) {
        Object[] objArr = {looper, cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e27c94c6960fbb2eb62d7718643d568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e27c94c6960fbb2eb62d7718643d568");
            return;
        }
        final int m = MSCFpsHornConfig.d().m();
        this.c[i] = new com.meituan.msc.modules.page.render.rn.lag.b(MSCFpsHornConfig.d().l(), MSCFpsHornConfig.d().k(), MSCFpsHornConfig.d().f(), looper, new com.meituan.msc.modules.page.render.rn.lag.a() { // from class: com.meituan.msc.modules.page.render.rn.fps.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.rn.lag.a
            public final void a(long j, String str, List<com.meituan.msc.modules.page.render.rn.lag.e> list) {
                Object[] objArr2 = {new Long(j), str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32661be2e1468239627a34c0cd6f38d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32661be2e1468239627a34c0cd6f38d5");
                } else {
                    cVar.a(c.this.b[i].k, str, com.meituan.msc.modules.page.render.rn.lag.d.a(list, m));
                }
            }
        });
    }

    public final void a(View view) {
        com.meituan.msc.modules.page.render.rn.lag.b[] bVarArr;
        double d;
        double d2;
        int i = 1;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519fc79cfb238e580170a242aecd9d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519fc79cfb238e580170a242aecd9d55");
            return;
        }
        d[] dVarArr = this.b;
        int length = dVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            d dVar = dVarArr[i2];
            if (dVar != null) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = view;
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "9a7ff481e50b654a239c7afc39178ce6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "9a7ff481e50b654a239c7afc39178ce6");
                } else {
                    dVar.n = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "496471b693147350a6f27152a3f26965", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "496471b693147350a6f27152a3f26965");
                    } else {
                        if (dVar.e != null) {
                            b bVar = dVar.e;
                            long j = dVar.c;
                            int i3 = dVar.d;
                            Object[] objArr4 = new Object[2];
                            objArr4[0] = new Long(j);
                            objArr4[i] = Integer.valueOf(i3);
                            ChangeQuickRedirect changeQuickRedirect4 = b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "3abe12236956748d85f19a88af5b4d31", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "3abe12236956748d85f19a88af5b4d31");
                            } else {
                                long j2 = j - bVar.d;
                                int i4 = i3 - bVar.c;
                                if (j2 > 0 && i4 > 0) {
                                    bVar.f = (i4 * 1.0E9f) / ((float) j2);
                                }
                            }
                            dVar.e.e = false;
                            d = dVar.e.a() ? dVar.e.b() : -1.0d;
                            dVar.e = null;
                        } else {
                            d = -1.0d;
                        }
                        if (dVar.f == null || !dVar.g) {
                            d2 = -1.0d;
                        } else {
                            b bVar2 = dVar.f;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "dfb06fe660e003300a4bb6dbe1f8c049", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "dfb06fe660e003300a4bb6dbe1f8c049");
                            } else if (bVar2.g > 0 && bVar2.h > 0) {
                                bVar2.f = (bVar2.h * 1.0E9f) / ((float) bVar2.g);
                            }
                            dVar.f.e = false;
                            d2 = dVar.f.a() ? dVar.f.b() : -1.0d;
                            dVar.g = false;
                        }
                        dVar.l.a(d, d2);
                    }
                    dVar.b(view);
                    dVar.h = false;
                    e.a().b(dVar.m);
                }
            }
            i2++;
            i = 1;
        }
        for (com.meituan.msc.modules.page.render.rn.lag.b bVar3 : this.c) {
            if (bVar3 != null) {
                bVar3.a();
            }
        }
    }

    @Override // com.meituan.msc.modules.page.render.rn.f.a
    public final void a(MotionEvent motionEvent) {
        d[] dVarArr;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be1656a97e69499660f72a73949dafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be1656a97e69499660f72a73949dafb");
            return;
        }
        for (d dVar : this.b) {
            if (dVar != null) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "1196d9628cc7e3e9a850fffd31dbf822", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "1196d9628cc7e3e9a850fffd31dbf822");
                } else if (motionEvent.getAction() == 2) {
                    dVar.n = true;
                }
            }
        }
    }
}
