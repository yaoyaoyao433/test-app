package com.dianping.gcmrnmodule.wrapperviews.items.viewitems;

import com.dianping.shield.dynamic.model.view.ReusableViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class b<T extends ReusableViewInfo> extends c<T> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1d5d736ba59f5d57b9a73783573aa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1d5d736ba59f5d57b9a73783573aa0");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97b42742da8c288717724ebeae490e4", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97b42742da8c288717724ebeae490e4") : new ReusableViewInfo();
    }
}
