package com.meituan.msi.module;

import android.content.Context;
import com.meituan.msi.api.systeminfo.SystemInfoApi;
import com.meituan.msi.api.systeminfo.WindowInfoChangeResponse;
import com.meituan.msi.api.systeminfo.WindowInfoMtParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.IContainerEvent;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OnWindowInfoChangedEvent implements IContainerEvent, com.meituan.msi.lifecycle.a, ApiModule {
    public static ChangeQuickRedirect a;
    private com.meituan.msi.context.a b;
    private e c;
    private SystemInfoApi.a d;
    private WindowInfoChangeResponse e;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73db18ce034c8a7d40a3566c6401fb95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73db18ce034c8a7d40a3566c6401fb95");
        }
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context) {
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec0e5ec5c500d41b11c065050ae1a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec0e5ec5c500d41b11c065050ae1a4b");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbf275a6e2b6797cb0ca80583fe1fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbf275a6e2b6797cb0ca80583fe1fff");
        }
    }

    public final void a(SystemInfoApi.a aVar) {
        this.d = aVar;
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb36c7a114a7a3796a3e4a8accb4305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb36c7a114a7a3796a3e4a8accb4305");
        } else {
            this.b = msiContext.getActivityContext();
        }
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context, e eVar) {
        this.c = eVar;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2be65d050af85f060ba7cec42801fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2be65d050af85f060ba7cec42801fb4");
        } else {
            e();
        }
    }

    @Override // com.meituan.msi.dispather.IContainerEvent
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e629797209d83761ca47099024185ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e629797209d83761ca47099024185ef5");
        } else if ("onConfigurationChanged".equals(str)) {
            e();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca661d9cdc64b9db543d60f9b80757f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca661d9cdc64b9db543d60f9b80757f");
        } else if (this.c == null || this.b == null) {
        } else {
            WindowInfoChangeResponse a2 = SystemInfoApi.a(this.b.a(), this.d, -1);
            if (a(a2)) {
                this.c.a("onWindowInfoChange", a2);
            }
            this.e = a2;
        }
    }

    private boolean a(WindowInfoChangeResponse windowInfoChangeResponse) {
        Object[] objArr = {windowInfoChangeResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615d466b71e8e0cd3caeeaf5044dc9ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615d466b71e8e0cd3caeeaf5044dc9ce")).booleanValue();
        }
        if (windowInfoChangeResponse == null) {
            return false;
        }
        if (this.e != null && this.e.pixelRatio == windowInfoChangeResponse.pixelRatio && this.e.screenHeight == windowInfoChangeResponse.screenHeight && this.e.screenWidth == windowInfoChangeResponse.screenWidth && this.e.windowWidth == windowInfoChangeResponse.windowWidth && this.e.windowHeight == windowInfoChangeResponse.windowHeight) {
            WindowInfoMtParam windowInfoMtParam = this.e._mt;
            WindowInfoMtParam windowInfoMtParam2 = windowInfoChangeResponse._mt;
            return (windowInfoMtParam == windowInfoMtParam2 || (windowInfoMtParam != null && windowInfoMtParam2 != null && windowInfoMtParam.softMenuBarEnabled == windowInfoMtParam2.softMenuBarEnabled && windowInfoMtParam.realWindowHeight == windowInfoMtParam2.realWindowHeight && windowInfoMtParam.screenFontScale == windowInfoMtParam2.screenFontScale && windowInfoMtParam.softMenuBarHeight == windowInfoMtParam2.softMenuBarHeight && windowInfoMtParam.windowFontScale == windowInfoMtParam2.windowFontScale && windowInfoMtParam.windowPixelRatio == windowInfoMtParam2.windowPixelRatio)) ? false : true;
        }
        return true;
    }
}
