package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
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
@ReactModule(name = MRNModulePopViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/pop/MRNModulePopViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/PopViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/pop/MRNModulePopViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setDismissAnimationType", "", Constants.EventType.VIEW, DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/pop/MRNModulePopViewItemWrapperView;Ljava/lang/Integer;)V", "setOnDismiss", "onDismiss", "", "setOnTapMask", "onTapMask", "setShowAnimationType", DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModulePopViewItemManager extends MRNModuleFixedMarginViewItemManager<PopViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModulePopViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e38749df5ef01fe18e15d76defd1019", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e38749df5ef01fe18e15d76defd1019");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE)
    public final void setShowAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f8ce2835b85753a3ef8558284f683ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f8ce2835b85753a3ef8558284f683ab");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((PopViewInfo) aVar.getInfo()).setShowAnimationType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE)
    public final void setDismissAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "785b692f520dce14557f1c4005a1eba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "785b692f520dce14557f1c4005a1eba5");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((PopViewInfo) aVar.getInfo()).setDismissAnimationType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onTapMask")
    public final void setOnTapMask(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17481bd146e7207be1a399eb0432be53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17481bd146e7207be1a399eb0432be53");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_tapMaskCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((PopViewInfo) aVar.getInfo()).setOnTapMask(format);
        } else {
            ((PopViewInfo) aVar.getInfo()).setOnTapMask(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onDismiss")
    public final void setOnDismiss(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f555e4f22ef20355cb6ad304b796bfbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f555e4f22ef20355cb6ad304b796bfbc");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_dismissCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((PopViewInfo) aVar.getInfo()).setOnDismiss(format);
        } else {
            ((PopViewInfo) aVar.getInfo()).setOnDismiss(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "234d594df2e8f2fb70f34fbc4dff06de", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "234d594df2e8f2fb70f34fbc4dff06de") : c.b().a("onTapMask", c.a("registrationName", "onTapMask")).a("onDismiss", c.a("registrationName", "onDismiss")).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/pop/MRNModulePopViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
