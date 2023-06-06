package com.dianping.gcmrnmodule.wrapperviews.items.viewitems;

import com.dianping.shield.dynamic.model.view.ReusableViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
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
@ReactModule(name = MRNModuleReusableViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J%\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J \u0010\u0013\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0016"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemManager;", "T", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setEstimateHeight", "", Constants.EventType.VIEW, DMKeys.KEY_ESTIMATED_HEIGHT, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemWrapperView;Ljava/lang/Integer;)V", "setGdmReuseId", "reuseId", "setReuseIdentifier", DMKeys.KEY_REUSE_IDENTIFIER, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNModuleReusableViewItemManager<T extends ReusableViewInfo> extends MRNModuleViewItemManager<T> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleReusableViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
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
    public b<T> createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c899a63c7fda906e249e611410483fc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c899a63c7fda906e249e611410483fc3");
        }
        h.b(aoVar, "context");
        return new b<>(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_REUSE_IDENTIFIER)
    public final void setReuseIdentifier(@NotNull b<ReusableViewInfo> bVar, @Nullable String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b466c1a959439aa25833357f28639512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b466c1a959439aa25833357f28639512");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        ((ReusableViewInfo) bVar.getInfo()).setReuseIdentifier(str);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GDM_REUSEID)
    public final void setGdmReuseId(@NotNull b<ReusableViewInfo> bVar, @Nullable Integer num) {
        Object[] objArr = {bVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d53757c590d27ec8c68eb7b57a54d6d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d53757c590d27ec8c68eb7b57a54d6d3");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        ((ReusableViewInfo) bVar.getInfo()).setReuseid(num != null ? String.valueOf(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ESTIMATED_HEIGHT)
    public final void setEstimateHeight(@NotNull b<ReusableViewInfo> bVar, @Nullable Integer num) {
        Object[] objArr = {bVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c36f454caa6d23b8c0b759aff44d26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c36f454caa6d23b8c0b759aff44d26b");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        ((ReusableViewInfo) bVar.getInfo()).setEstimatedHeight(num);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }
}
