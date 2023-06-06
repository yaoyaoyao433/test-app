package com.meituan.android.ptcommonim.protocol;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.UUIDListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements UUIDListener {
    public static ChangeQuickRedirect a;
    private final PTProtocolSessionFragment b;

    private c(PTProtocolSessionFragment pTProtocolSessionFragment) {
        this.b = pTProtocolSessionFragment;
    }

    public static UUIDListener a(PTProtocolSessionFragment pTProtocolSessionFragment) {
        Object[] objArr = {pTProtocolSessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa59cc97c15037c393aa26c24515a8c5", RobustBitConfig.DEFAULT_VALUE) ? (UUIDListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa59cc97c15037c393aa26c24515a8c5") : new c(pTProtocolSessionFragment);
    }

    @Override // com.meituan.uuid.UUIDListener
    public final void notify(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9883ee5dc0b17b438445d2ad9d2cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9883ee5dc0b17b438445d2ad9d2cfe");
        } else {
            PTProtocolSessionFragment.a(this.b, context, str);
        }
    }
}
