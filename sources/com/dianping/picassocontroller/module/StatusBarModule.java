package com.dianping.picassocontroller.module;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.Keep;
import android.view.View;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.module.NavigatorModule;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "statusBar")
/* loaded from: classes.dex */
public class StatusBarModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    @PCSBMethod(name = "setHidden")
    public void setHidden(final b bVar, final NavigatorModule.HiddenArgument hiddenArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, hiddenArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c50e34d696a97e607f257688ec7768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c50e34d696a97e607f257688ec7768");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.StatusBarModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ca5fbe8f890e7334c49506222cb2f83", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ca5fbe8f890e7334c49506222cb2f83");
                        return;
                    }
                    View decorView = ((Activity) bVar.b()).getWindow().getDecorView();
                    if (decorView == null) {
                        bVar2.b(null);
                        return;
                    }
                    if (hiddenArgument.hidden) {
                        decorView.setSystemUiVisibility(4);
                    } else {
                        decorView.setSystemUiVisibility(0);
                    }
                    bVar2.a(null);
                }
            });
        } else {
            bVar2.b(null);
        }
    }

    @Keep
    @PCSBMethod(name = "setStatusBarStyle")
    public static void setStatusBarStyle(final b bVar, final NavigatorModule.StatusBarStyleArgument statusBarStyleArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, statusBarStyleArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef74fde18b222e174235b4d1a10ac2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef74fde18b222e174235b4d1a10ac2f2");
        } else if (Build.VERSION.SDK_INT >= 23 && (bVar instanceof g)) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.StatusBarModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3862b1cb5ce09cc3eccdca24198f44a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3862b1cb5ce09cc3eccdca24198f44a7");
                        return;
                    }
                    View decorView = ((Activity) b.this.b()).getWindow().getDecorView();
                    if (decorView == null) {
                        bVar2.b(null);
                        return;
                    }
                    if (statusBarStyleArgument.style == 0) {
                        decorView.setSystemUiVisibility(8192);
                    } else if (statusBarStyleArgument.style == 2) {
                        decorView.setSystemUiVisibility(Integer.MIN_VALUE);
                        if (((Activity) b.this.b()).getWindow() != null) {
                            ((Activity) b.this.b()).getWindow().setStatusBarColor(-16777216);
                        }
                    } else {
                        decorView.setSystemUiVisibility(0);
                    }
                    bVar2.a(null);
                }
            });
        } else {
            bVar2.b(null);
        }
    }
}
