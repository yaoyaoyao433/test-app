package com.meituan.android.recce.views.progressdialog;

import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.uimanager.ao;
import com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.android.recce.views.annotation.BaseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@BaseView
/* loaded from: classes3.dex */
public class RecceProgressDialogManager extends ReactBaseViewGroupManager<RecceProgressDialog> implements b {
    public static final String REACT_CLASS = "RCTProgressDialog";
    private static final String TAG = "RecceProgressDialog";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public RecceProgressDialog createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e8620ea2fe8b30a6cb7dee6ce843733", RobustBitConfig.DEFAULT_VALUE) ? (RecceProgressDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e8620ea2fe8b30a6cb7dee6ce843733") : new RecceProgressDialog(aoVar);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public RecceProgressDialogPropsVisitor getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d850271464099b22b89da0e88c8a26ff", RobustBitConfig.DEFAULT_VALUE) ? (RecceProgressDialogPropsVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d850271464099b22b89da0e88c8a26ff") : new RecceProgressDialogPropsVisitor((RecceProgressDialog) view, this);
    }
}
