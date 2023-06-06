package com.meituan.msc.modules.api.msi.api;

import android.content.Intent;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.container.MSCWidgetFragment;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.s;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class UpdateManagerApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "applyUpdate", onUiThread = false)
    public void applyUpdate(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833a72542ec5f4ff6dc4eb21f4435e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833a72542ec5f4ff6dc4eb21f4435e31");
            return;
        }
        h hVar = this.c;
        if (hVar == null) {
            msiContext.onError("runtime is null");
            return;
        }
        g.d("UpdateManagerApi", "applyUpdate, appId = ", a());
        s sVar = (s) hVar.c(s.class);
        Object[] objArr2 = {msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "227d2f1cf6795c53efacf85e4fbfdaf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "227d2f1cf6795c53efacf85e4fbfdaf4");
            return;
        }
        h U_ = sVar.U_();
        g.d("UpdateManager", "applyUpdate, mStatus = ", sVar.b);
        if (sVar.b == s.a.STATUS_INIT) {
            msiContext.onError(-1, "background has not checked");
        } else if (sVar.b == s.a.STATUS_APP_NOT_HAS_UPDATE) {
            msiContext.onError(-1, "update is not ready");
        } else if (sVar.b == s.a.STATUS_APP_DOWNLOAD_FAIL) {
            msiContext.onError(-1, "update failed");
        } else if (U_.b().i() > 1) {
            msiContext.onError(-1, "applyUpdate failed: invoke this api ,activity should be only one");
        } else {
            p e = U_.b().e();
            if (e == null || e.C().isFinishing() || e.C().isDestroyed()) {
                msiContext.onError(-1, "applyUpdate failed");
                return;
            }
            U_.x = true;
            Intent H = e.H();
            if (e.A()) {
                ((MSCWidgetFragment) e.G()).q();
                g.d("UpdateManager", "UpdateManager widget applyUpdate, appId: ", U_.d.b);
            } else {
                e.C().finish();
                e.a(H, 0);
                g.d("UpdateManager", "UpdateManager page applyUpdate, appId: ", U_.d.b);
            }
            msiContext.onSuccess(null);
        }
    }
}
