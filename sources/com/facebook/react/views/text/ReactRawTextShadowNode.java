package com.facebook.react.views.text;

import android.support.annotation.Nullable;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    @VisibleForTesting
    public static final String PROP_TEXT = "text";
    @Nullable
    private String mText = "";

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        markUpdated();
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public String toString() {
        return getViewClass() + " [text: " + this.mText + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
