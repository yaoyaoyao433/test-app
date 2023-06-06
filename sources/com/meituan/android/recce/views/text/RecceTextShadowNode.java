package com.meituan.android.recce.views.text;

import android.support.annotation.Nullable;
import com.facebook.react.views.text.ReactTextShadowNode;
import com.facebook.react.views.text.j;
import com.facebook.react.views.text.n;
import com.meituan.android.recce.mrn.uimanager.e;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceTextShadowNode extends ReactTextShadowNode implements e, GetTextAttributesable {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceTextShadowNode() {
    }

    public RecceTextShadowNode(@Nullable j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2821d0c97901e75e43a6d2fe1dcc5ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2821d0c97901e75e43a6d2fe1dcc5ec");
        }
    }

    @Override // com.meituan.android.recce.views.text.GetTextAttributesable
    public n getTextAttributes() {
        return this.mTextAttributes;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.e
    public PropVisitor<Void> getVisitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75904608d7e54b7f17ceb856f91ac6c", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75904608d7e54b7f17ceb856f91ac6c") : new RecceTextShadowNodeVisitor(this);
    }
}
