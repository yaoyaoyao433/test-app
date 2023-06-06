package com.meituan.android.common.weaver.impl.natives.matchers;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TextViewMatcher extends AbstractViewMatcher {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher
    public boolean match(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31a3d57c9a08c74c95925e60b0dfaa89", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31a3d57c9a08c74c95925e60b0dfaa89")).booleanValue() : (view instanceof TextView) && !TextUtils.isEmpty(((TextView) view).getText()) && view.getVisibility() == 0;
    }
}
