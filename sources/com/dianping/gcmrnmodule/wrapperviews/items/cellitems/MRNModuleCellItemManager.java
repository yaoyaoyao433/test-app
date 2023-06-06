package com.dianping.gcmrnmodule.wrapperviews.items.cellitems;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
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
@ReactModule(name = MRNModuleCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b'\u0018\u0000 9*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00019B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001d\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010,J\u001d\u0010-\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010,J\u001d\u0010/\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010,J\u001f\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u00102\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001f\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u00105\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u00106\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001f\u00107\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\b\u00108\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b¨\u0006:"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "T", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAutoMargin", "", Constants.EventType.VIEW, DMKeys.KEY_AUTO_MARGIN, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;Ljava/lang/Boolean;)V", "setBackgroundColor", "backgroundColor", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;Ljava/lang/Integer;)V", "setCanRepeatExpose", DMKeys.KEY_CAN_REPEAT_EXPOSE, "setCardStyle", "cardStyle", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;Lcom/facebook/react/bridge/ReadableMap;)V", "setCardType", "cardType", "setClickMgeInfo", DMKeys.KEY_CLICK_MGE_INFO, "setExposeDelay", DMKeys.KEY_EXPOSE_DELAY, "setFrozenExclude", "frozenExclude", "setGradientBackgroundColor", DMKeys.KEY_GRADIENT_BACKGROUND_COLOR, "setMarginInfo", DMKeys.KEY_MARGIN_INFO, "setMidasInfo", DMKeys.KEY_MIDAS_INFO, "setOnAppear", "onAppear", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;Z)V", "setOnDisappear", "onDisappear", "setOnExpose", "onExpose", "setSelectionStyle", DMKeys.KEY_SELECTION_STYLE, "setSeparatorLineInfo", "separatorLineInfo", "setSeparatorLineStyle", DMKeys.KEY_SEPARATOR_LINE_STYLE, "setViewMgeInfo", DMKeys.KEY_VIEW_MGE_INFO, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class MRNModuleCellItemManager<T extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<?>> extends MRNModuleBaseViewGroupManager<T> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "489859649128aa2019f81a427de12f95", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "489859649128aa2019f81a427de12f95") : new MRNModuleBaseWrapperShadowView();
    }

    @ReactProp(name = "backgroundColor")
    public final void setBackgroundColor(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9805bf45c08570c493db02967c4ad01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9805bf45c08570c493db02967c4ad01e");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setBackgroundColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRADIENT_BACKGROUND_COLOR)
    public final void setGradientBackgroundColor(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "008980171a34b08bebdaf843b75a8e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "008980171a34b08bebdaf843b75a8e57");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setGradientBackgroundColor(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.k(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SELECTION_STYLE)
    public final void setSelectionStyle(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f44316e6d5b94937690c8051511d2b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f44316e6d5b94937690c8051511d2b50");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setSelectionStyle(num);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_AUTO_MARGIN)
    public final void setAutoMargin(@NotNull T t, @Nullable Boolean bool) {
        Object[] objArr = {t, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da3ef8f889c5ed9bfe9f8990e426a694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da3ef8f889c5ed9bfe9f8990e426a694");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setAutoMargin(bool);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MARGIN_INFO)
    public final void setMarginInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe94330ac58b3caf510dce25670e584b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe94330ac58b3caf510dce25670e584b");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SEPARATOR_LINE_STYLE)
    public final void setSeparatorLineStyle(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ce5c3533bc287406764033aa33e5408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ce5c3533bc287406764033aa33e5408");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setSeparatorLineStyle(num);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "separatorLineInfo")
    public final void setSeparatorLineInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f14674203322209f77eaed9e7f83f96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f14674203322209f77eaed9e7f83f96");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setSeparatorLineInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CLICK_MGE_INFO)
    public final void setClickMgeInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53b09084ecfe055d8c5b20a3dd323429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53b09084ecfe055d8c5b20a3dd323429");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setClickMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VIEW_MGE_INFO)
    public final void setViewMgeInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db8ab69bc0f9d64a84da4b80377f2fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db8ab69bc0f9d64a84da4b80377f2fe3");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setViewMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "onExpose")
    public final void setOnExpose(@NotNull T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0685bafff6ea626753b8f264357889d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0685bafff6ea626753b8f264357889d5");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        Object info = t.getInfo();
        String str = null;
        if (!(info instanceof ExposeInfo)) {
            info = null;
        }
        ExposeInfo exposeInfo = (ExposeInfo) info;
        if (exposeInfo != null) {
            if (z) {
                w wVar = w.a;
                str = String.format("gdm_exposeCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(t.getId())}, 1));
                h.a((Object) str, "java.lang.String.format(format, *args)");
            }
            exposeInfo.setExposeCallback(str);
        }
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "onAppear")
    public final void setOnAppear(@NotNull T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0da07e23248880279873bd11d57d7cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0da07e23248880279873bd11d57d7cb");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        Object info = t.getInfo();
        String str = null;
        if (!(info instanceof ExposeInfo)) {
            info = null;
        }
        ExposeInfo exposeInfo = (ExposeInfo) info;
        if (exposeInfo != null) {
            if (z) {
                w wVar = w.a;
                str = String.format("gdm_appearCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(t.getId())}, 1));
                h.a((Object) str, "java.lang.String.format(format, *args)");
            }
            exposeInfo.setAppearOnScreenCallback(str);
        }
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "onDisappear")
    public final void setOnDisappear(@NotNull T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fd8602bb4934707bd559941c7e2778c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fd8602bb4934707bd559941c7e2778c");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        Object info = t.getInfo();
        String str = null;
        if (!(info instanceof ExposeInfo)) {
            info = null;
        }
        ExposeInfo exposeInfo = (ExposeInfo) info;
        if (exposeInfo != null) {
            if (z) {
                w wVar = w.a;
                str = String.format("gdm_disappearCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(t.getId())}, 1));
                h.a((Object) str, "java.lang.String.format(format, *args)");
            }
            exposeInfo.setDisappearFromScreenCallback(str);
        }
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_EXPOSE_DELAY)
    public final void setExposeDelay(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85398374883dd504bd3c1d1486a2aeee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85398374883dd504bd3c1d1486a2aeee");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        Object info = t.getInfo();
        if (!(info instanceof ExposeInfo)) {
            info = null;
        }
        ExposeInfo exposeInfo = (ExposeInfo) info;
        if (exposeInfo != null) {
            exposeInfo.setExposeDelay(num);
        }
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CAN_REPEAT_EXPOSE)
    public final void setCanRepeatExpose(@NotNull T t, @Nullable Boolean bool) {
        Object[] objArr = {t, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8419056a60e578a572eb1926d1f38a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8419056a60e578a572eb1926d1f38a1");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        Object info = t.getInfo();
        if (!(info instanceof ExposeInfo)) {
            info = null;
        }
        ExposeInfo exposeInfo = (ExposeInfo) info;
        if (exposeInfo != null) {
            exposeInfo.setCanRepeatExpose(bool);
        }
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MIDAS_INFO)
    public final void setMidasInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bc5c21980b125c1565dfd17b1da9b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bc5c21980b125c1565dfd17b1da9b4b");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setMidasInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.h(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "cardStyle")
    public final void setCardStyle(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3c41d7f1eac7015f0f199902f50f5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3c41d7f1eac7015f0f199902f50f5b2");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setCardStyle(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.i(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "cardType")
    public final void setCardType(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03043790d41261fc18434163fe254522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03043790d41261fc18434163fe254522");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setCardType(num != null ? num.intValue() : 0);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "frozenExclude")
    public final void setFrozenExclude(@NotNull T t, @Nullable Boolean bool) {
        Object[] objArr = {t, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "915851f5bf615d8c49372c9a55cc440b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "915851f5bf615d8c49372c9a55cc440b");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((CellInfo.BaseCellInfo) t.getInfo()).setFrozenExclude(bool);
        b.a().a(t.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92300a3ff65d1dd3af386b809d7a9c52", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92300a3ff65d1dd3af386b809d7a9c52") : c.b().a("onExpose", c.a("registrationName", "onExpose")).a("onAppear", c.a("registrationName", "onAppear")).a("onDisappear", c.a("registrationName", "onDisappear")).a();
    }
}
