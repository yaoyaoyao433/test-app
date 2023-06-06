package com.meituan.android.yoda;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.android.yoda.model.behavior.tool.h;
import com.meituan.android.yoda.util.o;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static Context c = null;
    private static com.meituan.android.yoda.config.verify.b d = null;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7cda2aa055385f41cd147c9531b6dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7cda2aa055385f41cd147c9531b6dec");
        } else if (b.get()) {
        } else {
            b.compareAndSet(false, true);
            x.a(context);
            com.meituan.android.yoda.network.a.a().a(context);
            c = context.getApplicationContext();
        }
    }

    public static void a(@Nullable com.meituan.android.yoda.config.launch.a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "351c545bdbccd8d368b41701a5755250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "351c545bdbccd8d368b41701a5755250");
        } else {
            com.meituan.android.yoda.config.launch.b.a(null);
        }
    }

    public static void a(Context context, @Nullable com.meituan.android.yoda.config.ui.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e941c7bc6b567c9d2b4e6a7087138585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e941c7bc6b567c9d2b4e6a7087138585");
        } else {
            com.meituan.android.yoda.config.ui.d.a(context, bVar);
        }
    }

    public static void a(Context context, @Nullable com.meituan.android.yoda.config.verify.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ed5d6b5214f9936b6e360b1e9d14f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ed5d6b5214f9936b6e360b1e9d14f2a");
        } else {
            com.meituan.android.yoda.config.verify.c.a(context, bVar);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de8108c0bc9e07d4724b7e4631ad8d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de8108c0bc9e07d4724b7e4631ad8d55");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("Entrance", "recycle", true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96480c5e59f25e764fd2f50ba6e48a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96480c5e59f25e764fd2f50ba6e48a4d");
        } else {
            com.meituan.android.yoda.config.ui.d.b();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "871549e34a6ff9857d4baad4dbf43951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "871549e34a6ff9857d4baad4dbf43951");
        } else {
            com.meituan.android.yoda.config.launch.b.b();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "491ffdfb4d360a24ed9247ca2dad47ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "491ffdfb4d360a24ed9247ca2dad47ad");
        } else {
            com.meituan.android.yoda.config.verify.c.b();
        }
        o a2 = o.a();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = o.a;
        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "fadec914db8f2a947cddddba98e3d787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "fadec914db8f2a947cddddba98e3d787");
        } else {
            o.a.b();
        }
        com.meituan.android.yoda.model.b.a();
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.yoda.model.behavior.d.a;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "d507ec31208f9a0cee473fd5c44dc032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "d507ec31208f9a0cee473fd5c44dc032");
        } else {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.yoda.model.behavior.e.a;
            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "45cadfc21629d1f688191415da983e63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "45cadfc21629d1f688191415da983e63");
            } else {
                com.meituan.android.yoda.model.behavior.collection.b a3 = com.meituan.android.yoda.model.behavior.collection.b.a();
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.yoda.model.behavior.collection.b.a;
                if (PatchProxy.isSupport(objArr8, a3, changeQuickRedirect8, false, "b0cf004ccd9af400ab3a4b45fcc4d161", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, a3, changeQuickRedirect8, false, "b0cf004ccd9af400ab3a4b45fcc4d161");
                } else {
                    a3.c = false;
                    a3.e.a();
                    a3.f.a();
                    a3.g.a();
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.yoda.model.behavior.collection.b.a;
                    if (PatchProxy.isSupport(objArr9, a3, changeQuickRedirect9, false, "7eb24c2d1b2fca2659fce90810c36f9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, a3, changeQuickRedirect9, false, "7eb24c2d1b2fca2659fce90810c36f9f");
                    } else {
                        a3.d = 0L;
                    }
                    com.meituan.android.yoda.model.behavior.collection.b.b = null;
                }
                com.meituan.android.yoda.model.behavior.tool.b.b = null;
                com.meituan.android.yoda.model.behavior.tool.b.c = null;
                h.a();
                com.meituan.android.yoda.model.behavior.tool.a.c();
                com.meituan.android.yoda.model.behavior.entry.b.b();
                com.meituan.android.yoda.model.behavior.entry.c.b();
                com.meituan.android.yoda.model.behavior.entry.d.b();
                com.meituan.android.yoda.model.behavior.entry.a.b();
            }
        }
        com.meituan.android.yoda.data.b.a();
        com.meituan.android.yoda.plugins.d a4 = com.meituan.android.yoda.plugins.d.a();
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.yoda.plugins.d.a;
        if (PatchProxy.isSupport(objArr10, a4, changeQuickRedirect10, false, "8b6474322c389f2606205c85385ff8b1", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.android.yoda.plugins.d dVar = (com.meituan.android.yoda.plugins.d) PatchProxy.accessDispatch(objArr10, a4, changeQuickRedirect10, false, "8b6474322c389f2606205c85385ff8b1");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "unRegisterNetEnvHook.", true);
        a4.b.set(null);
    }
}
