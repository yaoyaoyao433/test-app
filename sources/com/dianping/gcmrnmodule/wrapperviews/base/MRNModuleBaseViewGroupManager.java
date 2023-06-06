package com.dianping.gcmrnmodule.wrapperviews.base;

import android.view.View;
import android.view.ViewGroup;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.c;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "T", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "()V", "enableShadow", "", "addView", "", "parent", "child", "Landroid/view/View;", "index", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;Landroid/view/View;I)V", "checkChildren", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getChildAt", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;I)Landroid/view/View;", "getChildCount", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;)I", "removeViewAt", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;I)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class MRNModuleBaseViewGroupManager<T extends com.dianping.gcmrnmodule.wrapperviews.b<?>> extends ViewGroupManager<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean enableShadow;

    public void checkChildren(@NotNull T t, @Nullable View view, int i) {
        Object[] objArr = {t, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d208d28d4e5b6edbb83e8f2786329d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d208d28d4e5b6edbb83e8f2786329d1a");
        } else {
            h.b(t, "parent");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i) {
        addView((MRNModuleBaseViewGroupManager<T>) ((com.dianping.gcmrnmodule.wrapperviews.b) viewGroup), view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(ViewGroup viewGroup, int i) {
        return getChildAt((MRNModuleBaseViewGroupManager<T>) ((com.dianping.gcmrnmodule.wrapperviews.b) viewGroup), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(ViewGroup viewGroup) {
        return getChildCount((MRNModuleBaseViewGroupManager<T>) ((com.dianping.gcmrnmodule.wrapperviews.b) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i) {
        removeViewAt((MRNModuleBaseViewGroupManager<T>) ((com.dianping.gcmrnmodule.wrapperviews.b) viewGroup), i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b89776de505d8682b26e20750f6024e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b89776de505d8682b26e20750f6024e4");
        }
        if (this.enableShadow) {
            return createMRNModuleShadowNode();
        }
        LayoutShadowNode createShadowNodeInstance = super.createShadowNodeInstance();
        h.a((Object) createShadowNodeInstance, "super.createShadowNodeInstance()");
        return createShadowNodeInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final LayoutShadowNode createShadowNodeInstance(@NotNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3748db772f5d017af6d3e9c723b8190", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3748db772f5d017af6d3e9c723b8190");
        }
        h.b(reactApplicationContext, "context");
        return createShadowNodeInstance();
    }

    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80f1427059fbba4746451fe28af1601c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80f1427059fbba4746451fe28af1601c");
        }
        LayoutShadowNode createShadowNodeInstance = super.createShadowNodeInstance();
        h.a((Object) createShadowNodeInstance, "super.createShadowNodeInstance()");
        return createShadowNodeInstance;
    }

    public void addView(@NotNull T t, @Nullable View view, int i) {
        Object[] objArr = {t, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b73470f2d8b1960e26f90236b9979fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b73470f2d8b1960e26f90236b9979fe");
            return;
        }
        h.b(t, "parent");
        super.addView((MRNModuleBaseViewGroupManager<T>) t, view, i);
        if (view instanceof com.dianping.gcmrnmodule.wrapperviews.b) {
            t.a((com.dianping.gcmrnmodule.wrapperviews.b) view, i);
        }
        if ((t instanceof com.dianping.gcmrnmodule.protocols.b) && (view instanceof c)) {
            ((com.dianping.gcmrnmodule.protocols.b) t).setMRNView((c) view);
        }
        if (com.meituan.android.mrn.debug.a.a()) {
            checkChildren(t, view, i);
        }
        com.dianping.gcmrnmodule.b.a().a(t.getHostWrapperView());
    }

    public void removeViewAt(@NotNull T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a8f72345daa6b38e7f44f25f69d79d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a8f72345daa6b38e7f44f25f69d79d3");
            return;
        }
        h.b(t, "parent");
        if ((t.a(i) instanceof c) && (t instanceof com.dianping.gcmrnmodule.protocols.b)) {
            ((com.dianping.gcmrnmodule.protocols.b) t).setMRNView(null);
            if (t != null && t.getChildCount() == 0) {
                com.dianping.gcmrnmodule.b.a().a(t.getHostWrapperView());
                return;
            }
        }
        com.dianping.gcmrnmodule.b.a().a(t.getHostWrapperView());
        super.removeViewAt((MRNModuleBaseViewGroupManager<T>) t, i);
    }

    public int getChildCount(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47a0047e7e776f48214d8aa3f59666fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47a0047e7e776f48214d8aa3f59666fa")).intValue();
        }
        h.b(t, "parent");
        if (t instanceof com.dianping.gcmrnmodule.protocols.b) {
            return t.getChildWrapperViewCount();
        }
        return super.getChildCount((MRNModuleBaseViewGroupManager<T>) t);
    }

    @Nullable
    public View getChildAt(@NotNull T t, int i) {
        com.dianping.gcmrnmodule.wrapperviews.b<?> bVar;
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1ceab09ba141e71240002e05a185a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1ceab09ba141e71240002e05a185a6");
        }
        h.b(t, "parent");
        if (t instanceof com.dianping.gcmrnmodule.protocols.b) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.b.b;
            if (PatchProxy.isSupport(objArr2, t, changeQuickRedirect3, false, "8f11d7475875a20c8fda39c2448157ba", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (com.dianping.gcmrnmodule.wrapperviews.b) PatchProxy.accessDispatch(objArr2, t, changeQuickRedirect3, false, "8f11d7475875a20c8fda39c2448157ba");
            } else {
                bVar = (i < 0 || i >= t.d.size()) ? null : t.d.get(i);
            }
            return bVar;
        }
        return super.getChildAt((MRNModuleBaseViewGroupManager<T>) t, i);
    }
}
