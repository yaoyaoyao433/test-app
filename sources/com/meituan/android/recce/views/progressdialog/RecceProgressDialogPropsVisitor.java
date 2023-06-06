package com.meituan.android.recce.views.progressdialog;

import com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager;
import com.meituan.android.recce.mrn.uimanager.c;
import com.meituan.android.recce.views.progressdialog.RecceProgressDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceProgressDialogPropsVisitor<T extends RecceProgressDialog, V extends ReactBaseViewGroupManager<T>> extends c<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceProgressDialogPropsVisitor(T t, V v) {
        super(t, v);
        Object[] objArr = {t, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b150be82cb8a7e3e76d041f4501d903", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b150be82cb8a7e3e76d041f4501d903");
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitIsShow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c279286b766593410aaafafb19b0332", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c279286b766593410aaafafb19b0332");
        }
        ((RecceProgressDialog) this.view).show(z);
        return null;
    }
}
