package com.meituan.msc.modules.reporter.memory;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.meituan.msc.modules.engine.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static int b;
    private static long c;
    private static int d;
    private static long e;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa619d451cf795f1fc1eb93449c524de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa619d451cf795f1fc1eb93449c524de");
        } else if (context == null) {
        } else {
            context.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.meituan.msc.modules.reporter.memory.c.1
                public static ChangeQuickRedirect a;

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e92a884aef8d0221bb3655240c40c8f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e92a884aef8d0221bb3655240c40c8f3");
                    } else if (i == 40 || i == 20) {
                    } else {
                        if (i >= 10 && i != 80) {
                            com.meituan.msc.modules.reporter.g.e("MemoryManager", "onTrimMemory:" + i);
                            q.d();
                            com.meituan.msc.modules.preload.g gVar = com.meituan.msc.modules.preload.g.b;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.preload.g.a;
                            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "6675b02b58ffa9a747eecc7c095312fe", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "6675b02b58ffa9a747eecc7c095312fe");
                            } else {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.preload.g.a;
                                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "2e6620bf7efc6151021396914f0afdad", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "2e6620bf7efc6151021396914f0afdad");
                                } else if (gVar.c != null) {
                                    gVar.c.a();
                                }
                            }
                        }
                        if (i < 20) {
                            int unused = c.b = i;
                            long unused2 = c.c = SystemClock.elapsedRealtime();
                        } else if (i > 40) {
                            int unused3 = c.d = i;
                            long unused4 = c.e = SystemClock.elapsedRealtime();
                        }
                    }
                }
            });
        }
    }
}
