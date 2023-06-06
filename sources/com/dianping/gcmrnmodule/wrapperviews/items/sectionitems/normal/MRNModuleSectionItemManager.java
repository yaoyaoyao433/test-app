package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.MRNModuleBaseSectionItemManager;
import com.dianping.shield.dynamic.model.section.NormalSectionInfo;
import com.dianping.shield.node.adapter.animator.AnimationType;
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
@ReactModule(name = MRNModuleSectionItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setDeleteAnimationType", "", Constants.EventType.VIEW, "type", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemWrapperView;Ljava/lang/Integer;)V", "setEnableLayoutAnimation", "enableLayoutAnimation", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemWrapperView;Ljava/lang/Boolean;)V", "setInsertAnimationType", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleSectionItemManager extends MRNModuleBaseSectionItemManager<com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleSectionItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cc66772fa96a1a74473f7f0da71c2c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cc66772fa96a1a74473f7f0da71c2c9");
        }
        h.b(aoVar, "reactContext");
        return new com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a(aoVar);
    }

    @ReactProp(name = "enableLayoutAnimation")
    public final void setEnableLayoutAnimation(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8c86fd8e372e92d0e3ee884207bbe94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8c86fd8e372e92d0e3ee884207bbe94");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalSectionInfo) aVar.getInfo()).setEnableLayoutAnimation(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "insertAnimationType")
    public final void setInsertAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef859468d5bfb6c429d0f5de61f3d839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef859468d5bfb6c429d0f5de61f3d839");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (num != null) {
            ((NormalSectionInfo) aVar.getInfo()).setInsertAnimationType(AnimationType.fromType(num.intValue()));
        } else {
            ((NormalSectionInfo) aVar.getInfo()).setInsertAnimationType(AnimationType.NONE);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "deleteAnimationType")
    public final void setDeleteAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "203f9d9815209d28857c2b252b3716bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "203f9d9815209d28857c2b252b3716bf");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (num != null) {
            ((NormalSectionInfo) aVar.getInfo()).setDeleteAnimationType(AnimationType.fromType(num.intValue()));
        } else {
            ((NormalSectionInfo) aVar.getInfo()).setDeleteAnimationType(AnimationType.NONE);
        }
        b.a().a(aVar.getHostWrapperView());
    }
}
