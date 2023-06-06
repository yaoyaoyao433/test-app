package com.meituan.msc.modules.api.msi.interceptor;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.view.CustomNavigationBar;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.f;
import com.meituan.msi.api.systeminfo.SystemInfoApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements SystemInfoApi.a {
    public static ChangeQuickRedirect a;
    private static int d;
    private static int e;
    private DisplayMetrics b;
    private final h c;

    public c(@NonNull h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98dfb22358bea4e430c5425f4f447981", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98dfb22358bea4e430c5425f4f447981");
        } else {
            this.c = hVar;
        }
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9dcbf7a10e2af27e99c8b823fd3d51", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9dcbf7a10e2af27e99c8b823fd3d51")).intValue() : a(this.c.b().e());
    }

    private DisplayMetrics c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da3adca5acef3563841dd694603c32ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (DisplayMetrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da3adca5acef3563841dd694603c32ce");
        }
        if (this.b == null) {
            this.b = MSCEnvHelper.getContext().getResources().getDisplayMetrics();
        }
        return this.b;
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250aa6f10d9087643a15c49e11ce2dba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250aa6f10d9087643a15c49e11ce2dba")).intValue() : b(this.c.b().e());
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea49dcfa209ac3ac002403b6e3d4147", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea49dcfa209ac3ac002403b6e3d4147")).intValue() : a(this.c.b().f(i));
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664441f8f7b2ab9a76598cbf2a213774", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664441f8f7b2ab9a76598cbf2a213774")).intValue() : b(this.c.b().f(i));
    }

    private int a(p pVar) {
        View g;
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb2915da7b3a64dcd92938ffbfda8e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb2915da7b3a64dcd92938ffbfda8e0")).intValue();
        }
        if (pVar == null) {
            g.b("SystemInfoModule", "[MSI] use default screen width as window width size when activity not attached ", Integer.valueOf(c().widthPixels));
            return c().widthPixels;
        } else if (pVar.G() != null && pVar.A() && (g = pVar.G().g()) != null) {
            return g.getWidth();
        } else {
            Activity C = pVar.C();
            if (C == null) {
                return c().widthPixels;
            }
            Rect rect = new Rect();
            try {
                C.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            } catch (Exception unused) {
            }
            int width = rect.width();
            if (width != 0) {
                d = width;
                return width;
            } else if (d != 0) {
                return d;
            } else {
                g.a("MSCSystemInfoWindowImpl", "getContainerWidth screenWidth is 0");
                return width;
            }
        }
    }

    private int b(@Nullable p pVar) {
        int height;
        int[] j;
        View g;
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06dfbb92385e79f902e8e3ed2ab16df9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06dfbb92385e79f902e8e3ed2ab16df9")).intValue();
        }
        if (pVar == null) {
            g.a("SystemInfoModule", "[MSI] use default screen height as window height size when activity not attached " + c().heightPixels);
            return c().heightPixels;
        } else if (pVar.G() != null && pVar.A() && (g = pVar.G().g()) != null) {
            return g.getHeight();
        } else {
            com.meituan.msc.modules.page.c t = pVar.t();
            e b = t != null ? t.b() : null;
            if (b != null && (j = b.j()) != null) {
                return j[1];
            }
            Activity C = pVar.C();
            if (C == null) {
                height = c().heightPixels;
            } else {
                Rect rect = new Rect();
                try {
                    C.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                } catch (Exception unused) {
                }
                height = rect.height();
                if (height != 0) {
                    e = height;
                } else if (e != 0) {
                    height = e;
                } else {
                    g.a("MSCSystemInfoWindowImpl", "getContainerHeight srcWindowHeight is 0");
                }
            }
            f fVar = this.c.r;
            return (b == null || fVar == null || fVar.l(b.f())) ? height : height - CustomNavigationBar.getFixedHeight();
        }
    }
}
