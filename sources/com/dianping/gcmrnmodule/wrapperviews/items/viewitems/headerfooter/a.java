package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.headerfooter;

import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.b;
import com.dianping.shield.dynamic.model.view.HeaderFooterViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/headerfooter/MRNModuleHeaderFooterViewItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemWrapperView;", "Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends b<HeaderFooterViewInfo> {
    public static ChangeQuickRedirect h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb92c294bbde0b43899c69d26434bfe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb92c294bbde0b43899c69d26434bfe6");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.b, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public final ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9aa024d597c19b57234c2db4c1e309", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9aa024d597c19b57234c2db4c1e309") : new HeaderFooterViewInfo();
    }
}
