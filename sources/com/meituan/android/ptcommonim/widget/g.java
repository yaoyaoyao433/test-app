package com.meituan.android.ptcommonim.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements rx.functions.c {
    public static ChangeQuickRedirect a;
    private final PTFeedbackView b;

    public g(PTFeedbackView pTFeedbackView) {
        this.b = pTFeedbackView;
    }

    @Override // rx.functions.c
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116354d1099569b5e5b15e68c64dbcbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116354d1099569b5e5b15e68c64dbcbf");
        } else {
            PTFeedbackView.a(this.b, (String) obj, obj2);
        }
    }
}
