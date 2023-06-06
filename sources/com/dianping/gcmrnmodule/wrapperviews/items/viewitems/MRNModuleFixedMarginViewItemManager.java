package com.dianping.gcmrnmodule.wrapperviews.items.viewitems;

import com.dianping.shield.dynamic.model.view.FixedMarginViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleFixedMarginViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u0010*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemManager;", "T", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setFixedMarginInfo", "", Constants.EventType.VIEW, DMKeys.KEY_FIXED_MARGIN_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNModuleFixedMarginViewItemManager<T extends FixedMarginViewInfo> extends MRNModuleViewItemManager<T> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleFixedMarginViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a<T> createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8bb1438702216d4a736d0df941c5bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8bb1438702216d4a736d0df941c5bb");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a<>(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_FIXED_MARGIN_INFO)
    public final void setFixedMarginInfo(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a<FixedMarginViewInfo> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05a1c8b5ab61080c5b18c0d32190141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05a1c8b5ab61080c5b18c0d32190141");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((FixedMarginViewInfo) aVar.getInfo()).setFixedMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
