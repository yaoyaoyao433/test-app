package com.sankuai.ehcore.horn;

import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements HornCallback {
    public static ChangeQuickRedirect a;
    private static final j b = new j();

    public static HornCallback a() {
        return b;
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933818f25af221301aa9143cc708db75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933818f25af221301aa9143cc708db75");
        } else {
            e.a(z, str);
        }
    }
}
