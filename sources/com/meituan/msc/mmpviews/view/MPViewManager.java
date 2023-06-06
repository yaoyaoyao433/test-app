package com.meituan.msc.mmpviews.view;

import android.view.View;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.views.precreate.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCView")
/* loaded from: classes3.dex */
public class MPViewManager extends MPShellDelegateViewGroupManager<MPViewGroup> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCView";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feceab8a3c97eddb8da05b0163d0a6d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feceab8a3c97eddb8da05b0163d0a6d0");
        }
        long nanoTime = System.nanoTime();
        MPViewGroup tryGetMPView = themedReactContext.getRuntimeDelegate().tryGetMPView(themedReactContext);
        c.b++;
        c.z += System.nanoTime() - nanoTime;
        return tryGetMPView;
    }
}
