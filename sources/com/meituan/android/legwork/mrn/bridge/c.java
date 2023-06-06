package com.meituan.android.legwork.mrn.bridge;

import com.facebook.react.bridge.Promise;
import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements PtBaseShare.OnShareListener {
    public static ChangeQuickRedirect a;
    private final Promise b;

    public c(Promise promise) {
        this.b = promise;
    }

    @Override // com.meituan.android.legwork.common.share.PtBaseShare.OnShareListener
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127dc653a9564badf25baf316196b133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127dc653a9564badf25baf316196b133");
        } else {
            CommonBridgeModule.lambda$shareOperation$10(this.b, i, i2);
        }
    }
}
