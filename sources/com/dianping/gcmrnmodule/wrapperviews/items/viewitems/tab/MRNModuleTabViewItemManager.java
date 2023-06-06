package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.IndexPath;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTabViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0016"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/tab/MRNModuleTabViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/tab/MRNModuleTabViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAnchorIndexPath", "", Constants.EventType.VIEW, DMKeys.KEY_TAB_ANCHOR_INDEX_PATH, "Lcom/facebook/react/bridge/ReadableMap;", "setOnTabSelectedStatusChanged", "onTabSelectedStatusChanged", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleTabViewItemManager extends MRNModuleViewItemManager<TabViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleTabViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b851ab9175a3099cafd7d1247c5a67e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b851ab9175a3099cafd7d1247c5a67e1");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_TAB_ANCHOR_INDEX_PATH)
    public final void setAnchorIndexPath(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7751f6491cf3d5e25fce6cf53463155a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7751f6491cf3d5e25fce6cf53463155a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        TabViewInfo tabViewInfo = (TabViewInfo) aVar.getInfo();
        IndexPath indexPath = null;
        if (readableMap != null) {
            Object[] objArr2 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.base.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5c020a330eb653c901960a72035c9390", RobustBitConfig.DEFAULT_VALUE)) {
                indexPath = (IndexPath) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5c020a330eb653c901960a72035c9390");
            } else {
                h.b(readableMap, "$this$toIndexPath");
                indexPath = new IndexPath();
                if (readableMap.hasKey("section") && !readableMap.isNull("section")) {
                    indexPath.section = readableMap.getInt("section");
                }
                if (readableMap.hasKey("row") && !readableMap.isNull("row")) {
                    indexPath.row = readableMap.getInt("row");
                }
                if (readableMap.hasKey("index") && !readableMap.isNull("index")) {
                    indexPath.index = readableMap.getInt("index");
                }
            }
        }
        tabViewInfo.setAnchorIndexPath(indexPath);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onTabSelectedStatusChanged")
    public final void setOnTabSelectedStatusChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96f16fe959e3fe0ade21b908d26b2499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96f16fe959e3fe0ade21b908d26b2499");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_tabSelectedStatusChangedCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((TabViewInfo) aVar.getInfo()).setOnTabSelectedStatusChanged(format);
        } else {
            ((TabViewInfo) aVar.getInfo()).setOnTabSelectedStatusChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c28ac4e48315ae69fde60fb534c4933d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c28ac4e48315ae69fde60fb534c4933d") : c.b().a("onTabSelectedStatusChanged", c.a("registrationName", "onTabSelectedStatusChanged")).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/tab/MRNModuleTabViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
