package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.utils.a;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
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
import rx.k;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleDragRefreshViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0013H\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0007J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", Constants.EventType.VIEW, "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "setOnDragRefreshStatusChanged", "onDragRefreshStatusChanged", "", "setOnPull", "onPull", "setOnRefreshSuccess", "onRefreshSuccess", "setThreshold", com.meituan.metrics.common.Constants.LAG_THRESHOLD, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemWrapperView;Ljava/lang/Integer;)V", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleDragRefreshViewItemManager extends MRNModuleViewItemManager<DragRefreshViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleDragRefreshViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb3d7a2c593aa919ee047581835d2d54", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb3d7a2c593aa919ee047581835d2d54");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a(aoVar);
    }

    @ReactProp(name = com.meituan.metrics.common.Constants.LAG_THRESHOLD)
    public final void setThreshold(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ef9a5f91c6cdb6aba799455f48d67ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ef9a5f91c6cdb6aba799455f48d67ae");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((DragRefreshViewInfo) aVar.getInfo()).setThreshold(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onPull")
    public final void setOnPull(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7179a2d22441c022496e0aa77e57f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7179a2d22441c022496e0aa77e57f00");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((DragRefreshViewInfo) aVar.getInfo()).setOnPull(Boolean.valueOf(z));
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onDragRefreshStatusChanged")
    public final void setOnDragRefreshStatusChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e65a183c466b32c25f943ee7f125afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e65a183c466b32c25f943ee7f125afb");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_dragRefreshStatusChangedCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((DragRefreshViewInfo) aVar.getInfo()).setOnDragRefreshStatusChanged(format);
        } else {
            ((DragRefreshViewInfo) aVar.getInfo()).setOnDragRefreshStatusChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onRefreshSuccess")
    public final void setOnRefreshSuccess(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55b42c6b12cb87bfeb4b4cf06d66bce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55b42c6b12cb87bfeb4b4cf06d66bce4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_refreshSuccessCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((DragRefreshViewInfo) aVar.getInfo()).setOnRefreshSuccess(format);
        } else {
            ((DragRefreshViewInfo) aVar.getInfo()).setOnRefreshSuccess(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public final void onDropViewInstance(@NotNull c<DragRefreshViewInfo> cVar) {
        CommonPageContainer commonPageContainer;
        a.C0071a c0071a;
        CommonPageContainer commonPageContainer2;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26d8428c8b331b56d6d75fc2b2093558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26d8428c8b331b56d6d75fc2b2093558");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        super.onDropViewInstance((MRNModuleDragRefreshViewItemManager) cVar);
        if (cVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) {
            com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) cVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "b5a1939657eb8fdcadd339824be46147", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "b5a1939657eb8fdcadd339824be46147");
                return;
            }
            com.dianping.gcmrnmodule.wrapperviews.items.utils.a aVar2 = aVar.j;
            if (aVar2 != null && (c0071a = aVar2.f) != null && (commonPageContainer2 = aVar.i) != null) {
                commonPageContainer2.removeContentScrollOffsetListener(c0071a);
            }
            if (aVar.l != null && (commonPageContainer = aVar.i) != null) {
                commonPageContainer.setOnRefreshSuccessListener(null);
            }
            aVar.getRefreshSuccessDelegate().onDestroy();
            k kVar = aVar.k;
            if (kVar == null || !kVar.isUnsubscribed()) {
                return;
            }
            kVar.unsubscribe();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6716d22d1e271a41ba991bd26a5cdd1e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6716d22d1e271a41ba991bd26a5cdd1e") : com.facebook.react.common.c.b().a("onPull", com.facebook.react.common.c.a("registrationName", "onPull")).a("onDragRefreshStatusChanged", com.facebook.react.common.c.a("registrationName", "onDragRefreshStatusChanged")).a("onRefreshSuccess", com.facebook.react.common.c.a("registrationName", "onRefreshSuccess")).a();
    }
}
