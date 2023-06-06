package com.meituan.android.legwork.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FakeTabLayout extends LinearLayout {
    public static ChangeQuickRedirect a;

    public FakeTabLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f357162c2097ad3a8060eb44b98e8e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f357162c2097ad3a8060eb44b98e8e3");
        }
    }

    public FakeTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b04928d13e493280d1fae2f5004700", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b04928d13e493280d1fae2f5004700");
        }
    }

    public FakeTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f3a3308f723927c5ac3b4be7db5f8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f3a3308f723927c5ac3b4be7db5f8c");
            return;
        }
        setOrientation(0);
        setFocusableInTouchMode(false);
        setClickable(false);
    }
}
