package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;
    private final List c;
    private final String d;
    private final a.c e;

    public z(VerifyBankInfoFragment verifyBankInfoFragment, List list, String str, a.c cVar) {
        this.b = verifyBankInfoFragment;
        this.c = list;
        this.d = str;
        this.e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1de3c9f3ee39526063356a16b7c4737", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1de3c9f3ee39526063356a16b7c4737");
        } else {
            VerifyBankInfoFragment.a(this.b, this.c, this.d, this.e, view);
        }
    }
}
