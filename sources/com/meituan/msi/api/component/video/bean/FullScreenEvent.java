package com.meituan.msi.api.component.video.bean;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class FullScreenEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String direction;
    public boolean fullScreen;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d65a931a2b7682e124c771d224d4858", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d65a931a2b7682e124c771d224d4858");
        }
        return "FullScreenEvent{fullScreen=" + this.fullScreen + ", direction='" + this.direction + "'}";
    }
}
