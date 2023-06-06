package com.meituan.android.recce.mrn.uimanager;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceLayoutShadowNode extends LayoutShadowNode implements e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.recce.mrn.uimanager.e
    public PropVisitor<Void> getVisitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a703d1bc568cbf6fcd381e897ec8681", RobustBitConfig.DEFAULT_VALUE)) {
            return (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a703d1bc568cbf6fcd381e897ec8681");
        }
        a aVar = new a();
        aVar.shadowNode = this;
        return aVar;
    }
}
