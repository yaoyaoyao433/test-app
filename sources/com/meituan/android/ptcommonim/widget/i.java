package com.meituan.android.ptcommonim.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements rx.functions.c {
    public static ChangeQuickRedirect a;
    private final PTFeedbackView b;

    public i(PTFeedbackView pTFeedbackView) {
        this.b = pTFeedbackView;
    }

    @Override // rx.functions.c
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c104861d86f74c6735a815e3b3672b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c104861d86f74c6735a815e3b3672b80");
        } else {
            PTFeedbackView.a(this.b, (String) obj, obj2);
        }
    }
}
