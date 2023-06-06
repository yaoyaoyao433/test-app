package com.meituan.android.legwork.common.share;

import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements PtBaseShare.OnShareListener {
    public static ChangeQuickRedirect a;
    private final H5ShareReceiver b;

    public a(H5ShareReceiver h5ShareReceiver) {
        this.b = h5ShareReceiver;
    }

    @Override // com.meituan.android.legwork.common.share.PtBaseShare.OnShareListener
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2150ff85c6e25720feec8b4a2e94e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2150ff85c6e25720feec8b4a2e94e6");
        } else {
            H5ShareReceiver.b(this.b, i, i2);
        }
    }
}
