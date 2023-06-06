package com.meituan.msi.api.extension.sgc.im;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IMessage implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, j<UnreadCountResponse> jVar);

    @MsiApiMethod(isCallback = true, name = "onImUnreadCountChange", response = UnreadCountResponse.class, scope = "sgc")
    public void onImUnreadCountChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "addImUnreadCountChangeListener", response = UnreadCountResponse.class, scope = "sgc")
    public void msiAddImUnreadCountChangeListener(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb77c515b33a9050be1d872071027404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb77c515b33a9050be1d872071027404");
        } else {
            a(msiCustomContext, new j<UnreadCountResponse>() { // from class: com.meituan.msi.api.extension.sgc.im.IMessage.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.j
                public final /* synthetic */ void a(UnreadCountResponse unreadCountResponse) {
                    UnreadCountResponse unreadCountResponse2 = unreadCountResponse;
                    Object[] objArr2 = {unreadCountResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5857d30ebb6f3a21b454db62de893534", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5857d30ebb6f3a21b454db62de893534");
                    } else {
                        msiCustomContext.dispatchEvent("sgc", "onImUnreadCountChange", unreadCountResponse2);
                    }
                }
            });
        }
    }
}
