package com.meituan.android.pay.widget.bankinfoitem;

import android.view.View;
import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements EditTextWithClearAndHelpButton.a {
    public static ChangeQuickRedirect a;
    private final j b;
    private final String c;

    private l(j jVar, String str) {
        this.b = jVar;
        this.c = str;
    }

    public static EditTextWithClearAndHelpButton.a a(j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0327a6b1a137bc7aabed7effb69d10", RobustBitConfig.DEFAULT_VALUE) ? (EditTextWithClearAndHelpButton.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0327a6b1a137bc7aabed7effb69d10") : new l(jVar, str);
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.a
    public final void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a8b0f75ee8221e7ec2bb352982baea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a8b0f75ee8221e7ec2bb352982baea");
        } else {
            j.a(this.b, this.c, view, z);
        }
    }
}
