package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModulesVCPageManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0016"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;", "()V", "addView", "", "parent", "child", "Landroid/view/View;", "index", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "onDropViewInstance", Constants.EventType.VIEW, "removeViewAt", "setLayoutManagerMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModulesVCPageManager extends ViewGroupManager<e> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModulesVCPage";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final e createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85b9bf27512c6975e8643fe0c73a170", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85b9bf27512c6975e8643fe0c73a170");
        }
        kotlin.jvm.internal.h.b(aoVar, "context");
        return new e(aoVar);
    }

    @ReactProp(name = "layoutManagerMode")
    public final void setLayoutManagerMode(@NotNull e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "308a023b1d843b7b4f8dab48da60d18c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "308a023b1d843b7b4f8dab48da60d18c");
            return;
        }
        kotlin.jvm.internal.h.b(eVar, Constants.EventType.VIEW);
        eVar.setLayoutManagerMode(str);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public final void addView(@NotNull e eVar, @NotNull View view, int i) {
        Object[] objArr = {eVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dba2854c52cf489792971fe983cdeb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dba2854c52cf489792971fe983cdeb2");
            return;
        }
        kotlin.jvm.internal.h.b(eVar, "parent");
        kotlin.jvm.internal.h.b(view, "child");
        super.addView((MRNModulesVCPageManager) eVar, view, i);
        if (view instanceof d) {
            eVar.setVCItem((d) view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public final void removeViewAt(@NotNull e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7df61201884e35ce263ce3d3b356f7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7df61201884e35ce263ce3d3b356f7e0");
            return;
        }
        kotlin.jvm.internal.h.b(eVar, "parent");
        if (eVar.getChildAt(i) instanceof d) {
            eVar.setVCItem(null);
        }
        super.removeViewAt((MRNModulesVCPageManager) eVar, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public final void onDropViewInstance(@NotNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a6f25556363f88ea63fd399fcc0280e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a6f25556363f88ea63fd399fcc0280e");
            return;
        }
        kotlin.jvm.internal.h.b(eVar, Constants.EventType.VIEW);
        super.onDropViewInstance((MRNModulesVCPageManager) eVar);
        eVar.b();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
