package com.meituan.android.mrn.components;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.config.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class MRNProgressManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "MRNProgressBar";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0986265a8e7e0d5ddd5533276c5003ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0986265a8e7e0d5ddd5533276c5003ee");
        }
        View a = z.a().a().a(aoVar, null, null);
        if (a != null) {
            a.setVisibility(0);
        }
        return a;
    }
}
