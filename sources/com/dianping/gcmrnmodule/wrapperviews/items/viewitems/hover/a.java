package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover;

import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/hover/MRNModuleHoverViewItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemWrapperView;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a<HoverViewInfo> {
    public static ChangeQuickRedirect h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3f2787818e115d4956587c341fb28c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3f2787818e115d4956587c341fb28c");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public final ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e11e49e562faf67c1a0c766737b275", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e11e49e562faf67c1a0c766737b275") : new HoverViewInfo();
    }
}
