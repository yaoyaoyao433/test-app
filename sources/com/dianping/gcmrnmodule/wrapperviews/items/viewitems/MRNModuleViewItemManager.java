package com.dianping.gcmrnmodule.wrapperviews.items.viewitems;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleViewItemWrapperShadowView;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
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
@ReactModule(name = MRNModuleViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0017\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\nH\u0014J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J%\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J%\u0010\u0019\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0007J\u001e\u0010\u001f\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010 \u001a\u00020\u0014H\u0007J\u001e\u0010!\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\"\u001a\u00020\u0014H\u0007J\u001e\u0010#\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010$\u001a\u00020\u0014H\u0007J\u001e\u0010%\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010&\u001a\u00020\u0014H\u0007J \u0010'\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0007¨\u0006*"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "T", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setCanRepeatExpose", "", Constants.EventType.VIEW, DMKeys.KEY_CAN_REPEAT_EXPOSE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;Ljava/lang/Boolean;)V", "setClickMgeInfo", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setExposeDelay", DMKeys.KEY_EXPOSE_DELAY, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;Ljava/lang/Integer;)V", "setJumpUrl", DMKeys.KEY_JUMP_URL, "setOnAppear", "onAppear", "setOnDisappear", "onDisappear", "setOnExpose", "onExpose", "setOnSelect", "onSelect", "setViewMgeInfo", DMKeys.KEY_VIEW_MGE_INFO, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNModuleViewItemManager<T extends ViewInfo> extends MRNModuleBaseViewGroupManager<c<T>> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public c<T> createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56abf1d0c12524f597c396ad6ccd4a37", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56abf1d0c12524f597c396ad6ccd4a37");
        }
        h.b(aoVar, "context");
        return new c<>(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37c8d24ce0972e5fcbf4d49722df26a6", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37c8d24ce0972e5fcbf4d49722df26a6") : new MRNModuleViewItemWrapperShadowView();
    }

    @ReactProp(name = DMKeys.KEY_JUMP_URL)
    public final void setJumpUrl(@NotNull c<ViewInfo> cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "154dd3280f1b267affc4d1a4e217bd35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "154dd3280f1b267affc4d1a4e217bd35");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        ((ViewInfo) cVar.getInfo()).setJumpUrl(str);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "onSelect")
    public final void setOnSelect(@NotNull c<ViewInfo> cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f8edd07db9aa0737371e05825c501d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f8edd07db9aa0737371e05825c501d1");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_didSelectCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(cVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ViewInfo) cVar.getInfo()).setDidSelectCallback(format);
        } else {
            ((ViewInfo) cVar.getInfo()).setDidSelectCallback(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "onExpose")
    public final void setOnExpose(@NotNull c<ViewInfo> cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11f28eea4a146cf771ef4d4b571d5940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11f28eea4a146cf771ef4d4b571d5940");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_exposeCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(cVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ViewInfo) cVar.getInfo()).setExposeCallback(format);
        } else {
            ((ViewInfo) cVar.getInfo()).setExposeCallback(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "onAppear")
    public final void setOnAppear(@NotNull c<ViewInfo> cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2c67a9e691004633e0776e3d03d244e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2c67a9e691004633e0776e3d03d244e");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_appearCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(cVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ViewInfo) cVar.getInfo()).setAppearOnScreenCallback(format);
        } else {
            ((ViewInfo) cVar.getInfo()).setAppearOnScreenCallback(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "onDisappear")
    public final void setOnDisappear(@NotNull c<ViewInfo> cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3c2567b71326cb3ae13785eeee8217f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3c2567b71326cb3ae13785eeee8217f");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_disappearCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(cVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ViewInfo) cVar.getInfo()).setDisappearFromScreenCallback(format);
        } else {
            ((ViewInfo) cVar.getInfo()).setDisappearFromScreenCallback(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CLICK_MGE_INFO)
    public final void setClickMgeInfo(@NotNull c<ViewInfo> cVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e9af4e015e269921c16cabe6fe0f289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e9af4e015e269921c16cabe6fe0f289");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        ((ViewInfo) cVar.getInfo()).setClickMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VIEW_MGE_INFO)
    public final void setViewMgeInfo(@NotNull c<ViewInfo> cVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34fa7edf0673fc6c2b7084c40051a25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34fa7edf0673fc6c2b7084c40051a25d");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        ((ViewInfo) cVar.getInfo()).setViewMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_EXPOSE_DELAY)
    public final void setExposeDelay(@NotNull c<ViewInfo> cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cde0bfc20d3a20e6ba82f1a20ed33e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cde0bfc20d3a20e6ba82f1a20ed33e66");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        ((ViewInfo) cVar.getInfo()).setExposeDelay(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CAN_REPEAT_EXPOSE)
    public final void setCanRepeatExpose(@NotNull c<ViewInfo> cVar, @Nullable Boolean bool) {
        Object[] objArr = {cVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31261e906a6b599c2ffd4d10ac0e5dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31261e906a6b599c2ffd4d10ac0e5dc9");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        ((ViewInfo) cVar.getInfo()).setCanRepeatExpose(bool);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2981c8ea0cef1513e8507b0e3d04eed5", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2981c8ea0cef1513e8507b0e3d04eed5") : com.facebook.react.common.c.b().a("onSelect", com.facebook.react.common.c.a("registrationName", "onSelect")).a("onExpose", com.facebook.react.common.c.a("registrationName", "onExpose")).a("onAppear", com.facebook.react.common.c.a("registrationName", "onAppear")).a("onDisappear", com.facebook.react.common.c.a("registrationName", "onDisappear")).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
