package com.meituan.msc.uimanager;

import android.view.View;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RNSimpleViewManager<T extends View> extends RNBaseViewManager<T, RNLayoutShadowNode> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msc.uimanager.as
    public final void a(T t, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb8f20ea197b6c544f49abdca31f770", RobustBitConfig.DEFAULT_VALUE) ? (RNLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb8f20ea197b6c544f49abdca31f770") : new RNLayoutShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<RNLayoutShadowNode> c() {
        return RNLayoutShadowNode.class;
    }
}
