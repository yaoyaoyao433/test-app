package com.meituan.android.recce.views.text;

import com.meituan.android.recce.mrn.uimanager.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceRawTextShadowNodeVisitor extends d<RecceRawTextShadowNode> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceRawTextShadowNodeVisitor(RecceRawTextShadowNode recceRawTextShadowNode) {
        Object[] objArr = {recceRawTextShadowNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1375c4baf86a16d80df520ee0bf761dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1375c4baf86a16d80df520ee0bf761dd");
        } else {
            this.shadowNode = recceRawTextShadowNode;
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "546e40158511d1afa90e6673a781950d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "546e40158511d1afa90e6673a781950d");
        }
        ((RecceRawTextShadowNode) this.shadowNode).setText(str);
        return null;
    }
}
