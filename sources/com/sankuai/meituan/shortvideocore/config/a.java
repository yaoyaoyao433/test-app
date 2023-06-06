package com.sankuai.meituan.shortvideocore.config;

import android.content.Context;
import android.os.Handler;
import com.google.gson.Gson;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.d;
import com.sankuai.meituan.shortvideocore.config.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a l;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    private Handler j;
    private final Gson k;
    private Context m;
    private int n;

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1b38d0615a00c7253560f68514d0ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1b38d0615a00c7253560f68514d0ae");
            return;
        }
        this.j = new Handler();
        this.k = new Gson();
        this.b = true;
        this.c = 5;
        this.d = 800;
        this.e = true;
        this.f = 2;
        this.n = 0;
        this.i = 3145728;
        b(context);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d8a6977b8d7bc17b42921e38d4ad803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d8a6977b8d7bc17b42921e38d4ad803");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = com.sankuai.meituan.mtliveqos.b.a("MTLive_Vod_Config");
        a(a2);
        StringBuilder sb = new StringBuilder("registerHorn: ");
        sb.append(a2);
        sb.append("    \n duration = ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        com.sankuai.meituan.mtliveqos.b.a("MTLive_Vod_Config", new d() { // from class: com.sankuai.meituan.shortvideocore.config.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(final boolean z, final String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4684094108207e49e097265800ff6a4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4684094108207e49e097265800ff6a4c");
                    return;
                }
                new StringBuilder("onChanged: ").append(z);
                new StringBuilder("onChanged: ").append(str);
                a.this.j.post(new Runnable() { // from class: com.sankuai.meituan.shortvideocore.config.a.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cb2b9a92b7ea964973ea65906287e00c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cb2b9a92b7ea964973ea65906287e00c");
                        } else if (z) {
                            a.this.a(str);
                        } else {
                            a.this.b();
                        }
                    }
                });
            }
        });
    }

    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ee4614eedcc757c85b5a7845c689d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ee4614eedcc757c85b5a7845c689d0");
        } else if (context != null && this.m == null) {
            this.m = context.getApplicationContext();
        }
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ea00ab75b01306b301384e2602b3397", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ea00ab75b01306b301384e2602b3397");
        }
        if (l == null) {
            synchronized (a.class) {
                if (l == null) {
                    l = new a(context);
                }
            }
        }
        if (l != null) {
            l.b(context);
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca581d0da557ae0e5751f1b98cca0321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca581d0da557ae0e5751f1b98cca0321");
            return;
        }
        try {
            c cVar = (c) this.k.fromJson(str, (Class<Object>) c.class);
            d(cVar);
            b(cVar);
            a(cVar);
        } catch (Exception unused) {
            b();
        }
    }

    private void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea083f7ab7a7f2d757bd9c103e3c27c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea083f7ab7a7f2d757bd9c103e3c27c");
        } else {
            this.f = c(cVar);
        }
    }

    private int c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae32f712f4165feaeed352de6f03a51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae32f712f4165feaeed352de6f03a51")).intValue();
        }
        if (cVar == null) {
            return this.f;
        }
        c.i iVar = cVar.b;
        if (iVar == null) {
            return this.f;
        }
        c.g gVar = iVar.a;
        if (gVar == null) {
            return this.f;
        }
        return gVar.a;
    }

    private void d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954bd0883b66affff9f47fc2deb0315e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954bd0883b66affff9f47fc2deb0315e");
            return;
        }
        this.c = g(cVar);
        this.d = f(cVar);
        this.e = e(cVar);
        c.e h = h(cVar);
        if (h != null) {
            this.b = h.b == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11655d9265a72c94838786d24e745ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11655d9265a72c94838786d24e745ee");
            return;
        }
        this.b = true;
        this.c = 5;
        this.f = 2;
        this.n = 0;
        this.g = 0;
        this.h = 0;
    }

    private boolean e(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099c5ad71400472c03755b592166ff2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099c5ad71400472c03755b592166ff2c")).booleanValue();
        }
        if (cVar == null) {
            return this.e;
        }
        c.h hVar = cVar.a;
        if (hVar == null) {
            return this.e;
        }
        c.C0644c c0644c = hVar.a;
        if (c0644c == null) {
            return this.e;
        }
        return c0644c.c == 1;
    }

    private int f(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1a10de0714bdf1af200d2a72868798", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1a10de0714bdf1af200d2a72868798")).intValue();
        }
        if (cVar == null) {
            return this.d;
        }
        c.h hVar = cVar.a;
        if (hVar == null) {
            return this.d;
        }
        c.C0644c c0644c = hVar.a;
        if (c0644c == null) {
            return this.d;
        }
        return c0644c.b;
    }

    private int g(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9125e20487d7c8cc7a15e4565e1c80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9125e20487d7c8cc7a15e4565e1c80")).intValue();
        }
        if (cVar == null) {
            return this.c;
        }
        c.h hVar = cVar.a;
        if (hVar == null) {
            return this.c;
        }
        c.C0644c c0644c = hVar.a;
        if (c0644c == null) {
            return this.c;
        }
        return Math.max(c0644c.a, 0);
    }

    public final boolean a() {
        return this.n > 0;
    }

    private void a(c cVar) {
        c.a aVar;
        c.b bVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5165e2c4503f7d63f7f0d9fccb2f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5165e2c4503f7d63f7f0d9fccb2f4a");
        } else if (cVar == null || (aVar = cVar.c) == null || (bVar = aVar.a) == null) {
        } else {
            this.n = bVar.a;
            this.g = bVar.b * 1024;
            this.h = bVar.c;
            c.f fVar = aVar.b;
            if (fVar == null) {
                return;
            }
            this.i = Math.max(this.i, fVar.a);
        }
    }

    private c.e h(c cVar) {
        c.h hVar;
        c.d dVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f67b807d6468fd5c6ced1e0a879cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f67b807d6468fd5c6ced1e0a879cd3");
        }
        if (cVar == null || (hVar = cVar.a) == null || (dVar = hVar.b) == null) {
            return null;
        }
        DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(this.m);
        if (deviceLevel != DeviceUtil.LEVEL.HIGH) {
            if (deviceLevel != DeviceUtil.LEVEL.MIDDLE) {
                if (deviceLevel != DeviceUtil.LEVEL.LOW) {
                    if (deviceLevel == DeviceUtil.LEVEL.UN_KNOW) {
                        return dVar.d;
                    }
                    return null;
                }
                return dVar.c;
            }
            return dVar.b;
        }
        return dVar.a;
    }
}
