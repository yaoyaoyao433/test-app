package com.meituan.mmp.lib.msi;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.api.systeminfo.SystemInfoApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l implements SystemInfoApi.a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private DisplayMetrics d;
    private int e;
    private com.meituan.mmp.lib.engine.m f;

    public l(@NonNull com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3bfdf59d7387b357f112b0ae13c7881", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3bfdf59d7387b357f112b0ae13c7881");
        } else {
            this.f = mVar;
        }
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f182a11c9d6f7a949431091e10e68034", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f182a11c9d6f7a949431091e10e68034")).intValue();
            }
            try {
                if (this.d == null) {
                    this.d = MMPEnvHelper.getContext().getResources().getDisplayMetrics();
                }
                Rect rect = new Rect();
                com.meituan.mmp.lib.a aVar = this.f.r;
                Activity activity = aVar != null ? aVar.f : null;
                if (activity == null) {
                    this.e = this.d.widthPixels;
                } else {
                    activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    this.e = rect.width();
                }
                if (aVar != null && aVar.e != null && aVar.a()) {
                    this.b = ((MMPWidgetFragment) aVar.e).g().getWidth();
                } else if (this.f.q != null) {
                    this.b = this.e;
                } else {
                    com.meituan.mmp.lib.trace.b.b("SystemInfoModule", "[MSI] use last window size when activity not attached");
                }
                return this.b;
            } catch (Exception e) {
                e.printStackTrace();
                return this.b;
            }
        } catch (Throwable unused) {
            return this.b;
        }
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf2a905585b668a0e5470c664903c45", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf2a905585b668a0e5470c664903c45")).intValue() : c(-1);
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6843407ffa75404f7157ac603ca4fd17", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6843407ffa75404f7157ac603ca4fd17")).intValue() : a();
    }

    @Override // com.meituan.msi.api.systeminfo.SystemInfoApi.a
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d47f70f3cf0dd440aea4eefbf757c4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d47f70f3cf0dd440aea4eefbf757c4")).intValue() : c(i);
    }

    private int c(int i) {
        com.meituan.mmp.lib.page.e d;
        int fixedHeight;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef892f06b7cab60c564758b5224a5ef", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef892f06b7cab60c564758b5224a5ef")).intValue();
            }
            try {
                Rect rect = new Rect();
                com.meituan.mmp.lib.a aVar = this.f.r;
                Activity activity = aVar != null ? aVar.f : null;
                if (activity != null) {
                    activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                }
                if (aVar != null && aVar.e != null && aVar.a()) {
                    this.c = ((MMPWidgetFragment) aVar.e).g().getHeight();
                } else {
                    ab abVar = this.f.q;
                    if (abVar != null) {
                        if (i == -1) {
                            d = abVar.e();
                        } else {
                            d = abVar.d(i);
                        }
                        if (d != null && d.getTabBar() != null && d.getTabBar().getTopBarHeight() > 0) {
                            fixedHeight = d.getPageAreaHeight();
                        } else {
                            int i2 = rect.bottom - rect.top;
                            com.meituan.mmp.lib.config.a aVar2 = this.f.d;
                            fixedHeight = (d == null || aVar2 == null || !aVar2.m(d.getPagePath())) ? i2 : i2 - CustomNavigationBar.getFixedHeight();
                        }
                        this.c = fixedHeight;
                    } else {
                        com.meituan.mmp.lib.trace.b.b("SystemInfoModule", "[MSI] use last window size when activity not attached");
                    }
                }
                return this.c;
            } catch (Exception e) {
                e.printStackTrace();
                return this.c;
            }
        } catch (Throwable unused) {
            return this.c;
        }
    }
}
