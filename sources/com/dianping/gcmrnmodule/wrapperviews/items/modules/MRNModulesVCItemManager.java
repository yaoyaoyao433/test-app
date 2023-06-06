package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.shield.dynamic.model.vc.ModulesVCInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModulesVCItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001a\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\tH\u0007J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0018J\u001a\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0007J\u001a\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001fH\u0007J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001bH\u0007J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u001bH\u0007J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001bH\u0007J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u001bH\u0007J\u0018\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u001bH\u0007J\u0018\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0010H\u0007J\u0018\u00106\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u001bH\u0007J\u001f\u00108\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u0018\u0010:\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0010H\u0007J\u001a\u0010<\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u001fH\u0007J\u001a\u0010>\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u001fH\u0007J\u001a\u0010@\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u001fH\u0007¨\u0006C"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setBackgroundColor", "", Constants.EventType.VIEW, "backgroundColor", "", "setConfigKey", DMKeys.KEY_CONFIG_KEY, "setConfigKeys", "configKeys", "Lcom/facebook/react/bridge/ReadableArray;", "setDelayForAutoExpose", "delayForAutoExpose", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;Ljava/lang/Integer;)V", "setDisableFling", "disableFling", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;Ljava/lang/Boolean;)V", "setDragRefreshInfo", DMKeys.KEY_VC_INFO_DRAG_REFRESH_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setFrozenEnable", "enableFrozen", "setFrozenModuleKey", "frozenModuleKey", "setLoadingStatus", "loadingStatus", "setModuleKeys", DMKeys.KEY_MODULE_KEYS, "setMptInfo", DMKeys.KEY_VC_INFO_MPT_INFO, "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnMomentumScrollbegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setPageBackgroundColor", "pageBackgroundColor", "setRefreshNeedToWait", "waitRefresh", "setScrollEnabled", "scrollEnabled", "setScrollEventThrottle", "throttle", "setSeparatorLineInfo", "separatorLineInfo", "setSettingInfo", DMKeys.KEY_VC_INFO_SETTING_INFO, "setTitleBarInfo", DMKeys.KEY_VC_INFO_TITLE_BAR_INFO, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModulesVCItemManager extends MRNModuleBaseViewGroupManager<d> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModulesVCItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final d createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cb14680dc6f6d7cd0bf486c74f75d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cb14680dc6f6d7cd0bf486c74f75d5");
        }
        kotlin.jvm.internal.h.b(aoVar, "context");
        return new d(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_CONFIG_KEY)
    public final void setConfigKey(@NotNull d dVar, @Nullable String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de131b5afc97500dc74102caca9b60a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de131b5afc97500dc74102caca9b60a3");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setConfigKey(str);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @ReactProp(name = "configKeys")
    public final void setConfigKeys(@NotNull d dVar, @Nullable ReadableArray readableArray) {
        String[] strArr;
        Object[] objArr = {dVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "556ca66eb419f007bd22c55425d980b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "556ca66eb419f007bd22c55425d980b1");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ModulesVCInfo modulesVCInfo = (ModulesVCInfo) dVar.getInfo();
        String[] strArr2 = null;
        if (readableArray != null) {
            Object[] objArr2 = {readableArray};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.base.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "79c2421c9290ecfab02ea12357999acb", RobustBitConfig.DEFAULT_VALUE)) {
                strArr = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "79c2421c9290ecfab02ea12357999acb");
            } else {
                kotlin.jvm.internal.h.b(readableArray, "$this$toConfigKeys");
                ArrayList arrayList = new ArrayList();
                int size = readableArray.size();
                for (int i = 0; i < size; i++) {
                    String string = readableArray.getString(i);
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                ?? array = arrayList.toArray(new String[0]);
                strArr = array;
                if (array == 0) {
                    throw new o("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            strArr2 = strArr;
        }
        modulesVCInfo.setConfigKeys(strArr2);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MODULE_KEYS)
    public final void setModuleKeys(@NotNull d dVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {dVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccbc47969a2c0daeed1ff074f05ede0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccbc47969a2c0daeed1ff074f05ede0c");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setModuleKeys(readableArray != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableArray) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "separatorLineInfo")
    public final void setSeparatorLineInfo(@NotNull d dVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36cf315e5c1d084104f76d8e79f2c26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36cf315e5c1d084104f76d8e79f2c26e");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setSeparatorLineInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VC_INFO_SETTING_INFO)
    public final void setSettingInfo(@NotNull d dVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82b525d5365047d0cfcd143f0a123460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82b525d5365047d0cfcd143f0a123460");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setSettingInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.b(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VC_INFO_DRAG_REFRESH_INFO)
    public final void setDragRefreshInfo(@NotNull d dVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6bef20d40b59caef6d66edd1b44d499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6bef20d40b59caef6d66edd1b44d499");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setDragRefreshInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.c(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "enableFrozen")
    public final void setFrozenEnable(@NotNull d dVar, @Nullable Boolean bool) {
        Object[] objArr = {dVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b0eb4b73efee8c16edc37d7986a16a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b0eb4b73efee8c16edc37d7986a16a4");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setEnableFrozen(bool);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "frozenModuleKey")
    public final void setFrozenModuleKey(@NotNull d dVar, @Nullable String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdd5489fe423e7aa17132cc604b767a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdd5489fe423e7aa17132cc604b767a4");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setFrozenModuleKey(str);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VC_INFO_TITLE_BAR_INFO)
    public final void setTitleBarInfo(@NotNull d dVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7994eb0797a1bfe4bc74482d2e50516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7994eb0797a1bfe4bc74482d2e50516");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setTitleBarInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.d(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "loadingStatus")
    public final void setLoadingStatus(@NotNull d dVar, @Nullable Integer num) {
        Object[] objArr = {dVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99d090eef047dc02feb68ff974cf68b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99d090eef047dc02feb68ff974cf68b2");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setLoadingStatus(num);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = "backgroundColor")
    public final void setBackgroundColor(@NotNull d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "930123114da1cf77f27c47d4a778634c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "930123114da1cf77f27c47d4a778634c");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setBackgroundColor(com.dianping.gcmrnmodule.wrapperviews.base.a.a(i));
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "pageBackgroundColor")
    public final void setPageBackgroundColor(@NotNull d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6f274d2ca06b1ca465d9d896629eb19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6f274d2ca06b1ca465d9d896629eb19");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setPageBackgroundColor(com.dianping.gcmrnmodule.wrapperviews.base.a.a(i));
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VC_INFO_MPT_INFO)
    public final void setMptInfo(@NotNull d dVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4650b62eb04c800b13fac60c0d5e4d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4650b62eb04c800b13fac60c0d5e4d74");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setMptInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.e(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onRefreshNeedToWait")
    public final void setRefreshNeedToWait(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8666c518f7d5fe6b8bcc558f6567281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8666c518f7d5fe6b8bcc558f6567281");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setWaitRefresh(z);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d11d6ae6f621ee5a6d417f68a52875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d11d6ae6f621ee5a6d417f68a52875");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setNeedScroll(z);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollbegin(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c8f69037b0ed7e6aada7e2aa4e50abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c8f69037b0ed7e6aada7e2aa4e50abe");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setNeedMomentumScrollBegin(z);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5172901aa9d7cb658ddc36c66eea68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5172901aa9d7cb658ddc36c66eea68c");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setNeedMomentumScrollEnd(z);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad2daee558c047a5ef39f46115930067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad2daee558c047a5ef39f46115930067");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setNeedBeginDrag(z);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "841bc499f28571e0b18ef6a6a16e23ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "841bc499f28571e0b18ef6a6a16e23ae");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setNeedEndDrag(z);
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottle(@NotNull d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68dc2fc5293ac5c6c709f2260a00243d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68dc2fc5293ac5c6c709f2260a00243d");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        dVar.setScrollEventThrottle(i);
    }

    @ReactProp(name = "scrollEnabled")
    public final void setScrollEnabled(@NotNull d dVar, @Nullable Boolean bool) {
        Object[] objArr = {dVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9bc042caa6aaa641fc135e89457c126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9bc042caa6aaa641fc135e89457c126");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setScrollEnabled(bool);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "delayForAutoExpose")
    public final void setDelayForAutoExpose(@NotNull d dVar, @Nullable Integer num) {
        Object[] objArr = {dVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75439acc5ac8dacc541bf68ea144f351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75439acc5ac8dacc541bf68ea144f351");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setDelayForAutoExpose(num);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @ReactProp(name = "disableFling")
    public final void setDisableFling(@NotNull d dVar, @Nullable Boolean bool) {
        Object[] objArr = {dVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57288c6a925fa47fd3ef6a64dfce9a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57288c6a925fa47fd3ef6a64dfce9a7");
            return;
        }
        kotlin.jvm.internal.h.b(dVar, Constants.EventType.VIEW);
        ((ModulesVCInfo) dVar.getInfo()).setDisableFling(bool);
        com.dianping.gcmrnmodule.b.a().a(dVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cfbece31fc34b592b971761c0e107ad", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cfbece31fc34b592b971761c0e107ad") : com.facebook.react.common.c.b().a("onAppear", com.facebook.react.common.c.a("registrationName", "onAppear")).a("onDisappear", com.facebook.react.common.c.a("registrationName", "onDisappear")).a(com.alipay.sdk.widget.d.p, com.facebook.react.common.c.a("registrationName", com.alipay.sdk.widget.d.p)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_BEGIN), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_END), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.BEGIN_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.END_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onRefreshNeedToWait", com.facebook.react.common.c.a("registrationName", "onRefreshNeedToWait")).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
