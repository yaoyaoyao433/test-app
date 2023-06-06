package com.meituan.android.ptcommonim.pageadapter.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final SessionFragment b;

    private a(SessionFragment sessionFragment) {
        this.b = sessionFragment;
    }

    public static Runnable a(SessionFragment sessionFragment) {
        Object[] objArr = {sessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "577d16b4fb7c177bc5dab0301487b80a", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "577d16b4fb7c177bc5dab0301487b80a") : new a(sessionFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daefb4094139bbde120e69e49cf8761a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daefb4094139bbde120e69e49cf8761a");
        } else {
            PTMsgCommonAdapter.a(this.b);
        }
    }
}
