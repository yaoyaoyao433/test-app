package com.sankuai.meituan.riverrunplayer.player;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f g;
    String b;
    boolean c;
    int d;
    boolean e;
    int f;
    private final List<a> h;
    private Handler i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z);

        void a(boolean z, boolean z2);
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2a5c8ea6adf6de58ec5b379768d371", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2a5c8ea6adf6de58ec5b379768d371");
            return;
        }
        this.h = new ArrayList();
        this.i = new Handler();
        this.d = 1;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "807bc884d7891199e5adbf056bfb5add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "807bc884d7891199e5adbf056bfb5add");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c9f0e4c147462481624ccd51a4c8a112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c9f0e4c147462481624ccd51a4c8a112");
            return;
        }
        com.sankuai.meituan.mtliveqos.b.a("MTLive_ABTest", new com.sankuai.meituan.mtliveqos.common.d() { // from class: com.sankuai.meituan.riverrunplayer.player.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(final boolean z, final String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c10960ce3fdd2df9641728e5f51d595b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c10960ce3fdd2df9641728e5f51d595b");
                } else {
                    f.this.i.post(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.f.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fe620660da6a6137dfc705500a55f56c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fe620660da6a6137dfc705500a55f56c");
                                return;
                            }
                            new StringBuilder("onChanged: HORN_RESOLUTION_SERVER = ").append(str);
                            if (!z) {
                                f.this.m = false;
                                f.this.b = null;
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                String string = jSONObject.getString("config_resolution");
                                int i = jSONObject.getInt("config_resolution_force");
                                f.this.j = i > 0;
                                if (TextUtils.equals(f.this.b, string) && f.this.j == f.this.m) {
                                    return;
                                }
                                f.this.b = string;
                                f.this.a(f.this.j);
                                f.this.m = f.this.j;
                            } catch (Exception e) {
                                Log.e("ResolutionSingTon", "ERROR = ", e);
                            }
                        }
                    });
                }
            }
        });
        com.sankuai.meituan.mtliveqos.b.a("MTLive_Rollback", new com.sankuai.meituan.mtliveqos.common.d() { // from class: com.sankuai.meituan.riverrunplayer.player.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(final boolean z, final String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b89fd74022d84f40658befb5d115fb3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b89fd74022d84f40658befb5d115fb3b");
                } else {
                    f.this.i.post(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.f.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8c1094733687159284d6be578af2eb17", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8c1094733687159284d6be578af2eb17");
                                return;
                            }
                            new StringBuilder("onChanged: HORN_OPTIMIZE_VIDEO_SERVER = ").append(str);
                            if (!z) {
                                f.this.n = false;
                                f.this.o = false;
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                int i = jSONObject.getInt("config_optimize_open_force");
                                int i2 = jSONObject.getInt("config_optimize_dropframe_force");
                                f.this.k = i2 > 0;
                                f.this.l = i > 0;
                                if (f.this.k == f.this.n && f.this.l == f.this.o) {
                                    return;
                                }
                                f.this.a(f.this.k, f.this.l);
                                f.this.n = f.this.k;
                                f.this.o = f.this.l;
                            } catch (Exception e) {
                                Log.e("ResolutionSingTon", "ERROR = ", e);
                            }
                        }
                    });
                }
            }
        });
        com.sankuai.meituan.mtliveqos.b.a("MTLive_Jitter_Optimize", new com.sankuai.meituan.mtliveqos.common.d() { // from class: com.sankuai.meituan.riverrunplayer.player.f.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(final boolean z, final String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e9c560b74ec9f9bd197bba312c93d5f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e9c560b74ec9f9bd197bba312c93d5f1");
                } else {
                    f.this.i.post(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.f.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c53be751e10b76aa8239584196310d6e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c53be751e10b76aa8239584196310d6e");
                                return;
                            }
                            new StringBuilder("onChanged: HORN_JITTER_OPTIMIZE = ").append(str);
                            if (!z) {
                                f.this.c = false;
                                f.this.e = false;
                                f.this.f = 0;
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                int i = jSONObject.getInt("config_jitter_control");
                                boolean z2 = true;
                                f.this.c = i != 0;
                                f fVar = f.this;
                                if (jSONObject.optInt("config_optimize_pause_latency", 1) != 1) {
                                    z2 = false;
                                }
                                fVar.e = z2;
                                f.this.f = jSONObject.optInt("config_decode_type", 0);
                            } catch (Exception e) {
                                Log.e("ResolutionSingTon", "ERROR = ", e);
                            }
                        }
                    });
                }
            }
        });
        com.sankuai.meituan.mtliveqos.b.a("MTLive_FirstFrame_Optimize", new com.sankuai.meituan.mtliveqos.common.d() { // from class: com.sankuai.meituan.riverrunplayer.player.f.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(boolean z, String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "59b40921c2087c5e6acc59f623e01c26", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "59b40921c2087c5e6acc59f623e01c26");
                    return;
                }
                new StringBuilder("onChanged: HORN_FIRSTFRAME_OPTIMIZE = ").append(str);
                if (z) {
                    try {
                        f.this.d = new JSONObject(str).optInt("config_first_frame", 1);
                    } catch (Exception e) {
                        Log.e("ResolutionSingTon", "ERROR = ", e);
                    }
                }
            }
        });
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6c419c84f0f9483b49ffc3f73edb7c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6c419c84f0f9483b49ffc3f73edb7c9");
        }
        if (g == null) {
            synchronized (f.class) {
                if (g == null) {
                    g = new f();
                }
            }
        }
        return g;
    }

    public final synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c9782eb1b68acaf8c67de55d121d2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c9782eb1b68acaf8c67de55d121d2d");
        } else {
            this.h.add(aVar);
        }
    }

    public final synchronized void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100e9da0ab599a999c999ea01df615a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100e9da0ab599a999c999ea01df615a9");
            return;
        }
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next() == aVar) {
                it.remove();
            }
        }
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f0bd4eb9974f185c3a044c6358dd42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f0bd4eb9974f185c3a044c6358dd42");
            return;
        }
        for (a aVar : this.h) {
            aVar.a(z);
        }
    }

    public final synchronized void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a43b9b3c28d8907aaa0ce3dbeaebfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a43b9b3c28d8907aaa0ce3dbeaebfb");
            return;
        }
        for (a aVar : this.h) {
            aVar.a(z, z2);
        }
    }
}
