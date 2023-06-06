package com.meituan.mtwebkit.internal.system;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import com.meituan.mtwebkit.MTRenderProcessGoneDetail;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends MTRenderProcessGoneDetail {
    public static ChangeQuickRedirect a;
    private RenderProcessGoneDetail b;

    public h(RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5699e6122c9654a1f6330f43fc4dfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5699e6122c9654a1f6330f43fc4dfc");
        } else {
            this.b = renderProcessGoneDetail;
        }
    }

    @Override // com.meituan.mtwebkit.MTRenderProcessGoneDetail
    public final boolean didCrash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9471d72c34ece419cc672818eb838428", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9471d72c34ece419cc672818eb838428")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.didCrash();
        }
        return false;
    }

    @Override // com.meituan.mtwebkit.MTRenderProcessGoneDetail
    public final int rendererPriorityAtExit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f419aa142a11fa7ab0bb4e32ab8ce487", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f419aa142a11fa7ab0bb4e32ab8ce487")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.rendererPriorityAtExit();
        }
        return 0;
    }
}
