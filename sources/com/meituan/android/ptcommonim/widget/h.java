package com.meituan.android.ptcommonim.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements rx.functions.c {
    public static ChangeQuickRedirect a;
    private final PTFeedbackView b;

    public h(PTFeedbackView pTFeedbackView) {
        this.b = pTFeedbackView;
    }

    @Override // rx.functions.c
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91da16b52d88f3827734ab1ad065a756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91da16b52d88f3827734ab1ad065a756");
        } else {
            PTFeedbackView.a(this.b, (String) obj, obj2);
        }
    }
}
