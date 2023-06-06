package com.meituan.android.legwork.mrn.view;

import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ReactTopHorizontalScrollContainerViewManager extends ReactHorizontalScrollContainerViewManager {
    protected static final String REACT_CLASS = "BMLWTopHorizontalScrollContentView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
