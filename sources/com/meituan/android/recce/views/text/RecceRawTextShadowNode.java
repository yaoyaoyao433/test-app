package com.meituan.android.recce.views.text;

import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.meituan.android.recce.mrn.uimanager.e;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceRawTextShadowNode extends ReactRawTextShadowNode implements e {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.recce.mrn.uimanager.e
    public PropVisitor<Void> getVisitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7e5be30cf22345f3e57c71c3372c7a6", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7e5be30cf22345f3e57c71c3372c7a6") : new RecceRawTextShadowNodeVisitor(this);
    }
}
