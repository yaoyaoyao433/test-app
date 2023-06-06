package com.meituan.android.ptcommonim.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTFeedbackTagView b;

    private f(PTFeedbackTagView pTFeedbackTagView) {
        this.b = pTFeedbackTagView;
    }

    public static View.OnClickListener a(PTFeedbackTagView pTFeedbackTagView) {
        Object[] objArr = {pTFeedbackTagView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60b870663133e29cd791c2442b9db48", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60b870663133e29cd791c2442b9db48") : new f(pTFeedbackTagView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3abd578291a53101f00e115247c97691", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3abd578291a53101f00e115247c97691");
        } else {
            PTFeedbackTagView.a(this.b, view);
        }
    }
}
