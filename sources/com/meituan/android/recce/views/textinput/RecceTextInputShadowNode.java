package com.meituan.android.recce.views.textinput;

import android.support.annotation.Nullable;
import com.facebook.react.views.text.j;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.recce.mrn.uimanager.e;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceTextInputShadowNode extends ReactTextInputShadowNode implements e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceTextInputShadowNode() {
    }

    public RecceTextInputShadowNode(@Nullable j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e981d5ee268abed4cfc37668562d3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e981d5ee268abed4cfc37668562d3a");
        }
    }

    @Override // com.meituan.android.recce.mrn.uimanager.e
    public PropVisitor<Void> getVisitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf04a6ae2a75c24357eccd6995eadbcc", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf04a6ae2a75c24357eccd6995eadbcc") : new RecceTextInputShadowNodeVisitor(this);
    }
}
