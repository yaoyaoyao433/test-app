package com.meituan.snare;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.h;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final i b = new i();
    private h.a c;

    public static i a() {
        return b;
    }

    public final void a(final Context context, n nVar) {
        Object[] objArr = {context, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a60cc07e0ecb2fa9a602e33b196585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a60cc07e0ecb2fa9a602e33b196585");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac7259e1cb46ee73068bb59716f49e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac7259e1cb46ee73068bb59716f49e11");
        } else {
            f a2 = f.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            File[] f = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "325c027439f7d861e3b2592e4bca2f2b", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "325c027439f7d861e3b2592e4bca2f2b") : a2.f(".hprof");
            if (f != null && f.length > 0) {
                for (File file : f) {
                    if (file != null) {
                        f.a().e(file.getAbsolutePath());
                    }
                }
            }
        }
        if (this.c == null) {
            this.c = new h.a() { // from class: com.meituan.snare.i.1
                public static ChangeQuickRedirect a;
                public int b = 0;

                @Override // com.meituan.snare.h.a
                public final boolean a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4bc13d1204d8e328921ac17c102f987e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4bc13d1204d8e328921ac17c102f987e")).booleanValue();
                    }
                    boolean z = Runtime.getRuntime().totalMemory() / 1048576 > (Runtime.getRuntime().maxMemory() / 1048576) - 50;
                    if (this.b == 0) {
                        if (DeviceUtil.getAbiList().contains("64")) {
                            this.b = 3900000;
                        } else {
                            this.b = 2900000;
                        }
                    }
                    boolean z2 = com.meituan.crashreporter.util.a.a() > this.b;
                    if ((z || z2) && i.this.a(context)) {
                        i.this.b();
                        return false;
                    }
                    return true;
                }
            };
        }
        h.a().a(20000L, this.c);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void b() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.i.b():void");
    }

    public final void a(s[] sVarArr) {
        int i = 1;
        Object[] objArr = {sVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d7467f0366f745727d58ae565b7e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d7467f0366f745727d58ae565b7e46");
            return;
        }
        f a2 = f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        File[] f = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ef335215d192c189309f9a4c4049f24f", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ef335215d192c189309f9a4c4049f24f") : a2.f(".memory");
        if (f == null || f.length <= 0) {
            return;
        }
        int length = sVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            s sVar = sVarArr[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= f.length) {
                    break;
                }
                File file = f[i3];
                if (file == null || !f.a().a(sVar.c, file.getAbsolutePath())) {
                    i3++;
                    i = 1;
                } else {
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = file;
                    ChangeQuickRedirect changeQuickRedirect3 = s.a;
                    if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "2c4b3597656053ef9a52daa8790614b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "2c4b3597656053ef9a52daa8790614b6");
                    } else {
                        sVar.f.put("Memory Watchdog Info", file);
                    }
                    f[i3] = null;
                }
            }
            i2++;
            i = 1;
        }
        for (File file2 : f) {
            if (file2 != null) {
                f.a().e(file2.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5189cd711c92004e78f7df5c412fa1b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5189cd711c92004e78f7df5c412fa1b0")).booleanValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
