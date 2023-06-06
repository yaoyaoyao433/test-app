package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach;

import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c;
import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/attach/MRNModuleScrollCellAttachViewItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "onAttachStatusChanged", "", "params", "Lorg/json/JSONObject;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends c<ScrollCellAttachViewInfo> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359e7929e020908d2679051b60230d19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359e7929e020908d2679051b60230d19");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public final ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c324a8d7316fb9db4effe374be406a63", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c324a8d7316fb9db4effe374be406a63") : new ScrollCellAttachViewInfo();
    }
}
