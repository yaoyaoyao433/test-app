package com.meituan.android.pay.widget.bankinfoitem;

import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements EditTextWithClearAndHelpButton.c {
    public static ChangeQuickRedirect a;
    private final c b;

    private e(c cVar) {
        this.b = cVar;
    }

    public static EditTextWithClearAndHelpButton.c a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32395c274114eee6e69e0a3d043e5cb0", RobustBitConfig.DEFAULT_VALUE) ? (EditTextWithClearAndHelpButton.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32395c274114eee6e69e0a3d043e5cb0") : new e(cVar);
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b1c5a5865f2fd2355e0e1f50bcae2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b1c5a5865f2fd2355e0e1f50bcae2f");
        } else {
            c.d(this.b);
        }
    }
}
