package com.meituan.msi.addapter.location;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IOpenLocation implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, OpenLocationParam openLocationParam, i iVar);

    @MsiApiMethod(name = "openLocation", request = OpenLocationParam.class)
    public void msiOpenLocation(OpenLocationParam openLocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {openLocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6845b5c59454a07f44c5ef48150a5d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6845b5c59454a07f44c5ef48150a5d3");
        } else {
            a(msiCustomContext, openLocationParam, new i() { // from class: com.meituan.msi.addapter.location.IOpenLocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "673c1b6641c4587a234b5aebd2986edf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "673c1b6641c4587a234b5aebd2986edf");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f46532399a7395046aa0147fbfd505", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f46532399a7395046aa0147fbfd505");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
