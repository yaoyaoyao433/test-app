package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class SizeReportingShadowNode extends LayoutShadowNode {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onBeforeLayout(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a748f5032c4c45a492294a62679cdcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a748f5032c4c45a492294a62679cdcc");
            return;
        }
        super.onBeforeLayout(tVar);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95fb0eac7f6ccf24985bf05098cb324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95fb0eac7f6ccf24985bf05098cb324");
            return;
        }
        super.onCollectExtraUpdates(uIViewOperationQueue);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(getLayoutWidth()));
        hashMap.put("height", Float.valueOf(getLayoutHeight()));
        uIViewOperationQueue.a(getReactTag(), hashMap);
    }
}
