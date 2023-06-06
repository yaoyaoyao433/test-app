package com.meituan.android.yoda.fragment.face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements com.meituan.android.yoda.interfaces.e {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static com.meituan.android.yoda.interfaces.e b() {
        return b;
    }

    @Override // com.meituan.android.yoda.interfaces.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fd854b068778c755d0b5cfc04a91aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fd854b068778c755d0b5cfc04a91aa");
        } else {
            FaceDetectionSubFragment1.a();
        }
    }
}
