package com.dianping.gcmrnmodule.wrapperviews.shadow;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0005R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleBaseWrapperShadowView;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "()V", "viewHostShadowNodeList", "Ljava/util/HashSet;", "Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleViewHostWrapperShadowView;", "Lkotlin/collections/HashSet;", "getViewHostShadowNodeList", "()Ljava/util/HashSet;", "addChildAt", "", "child", "Lcom/facebook/react/uimanager/ReactShadowNodeImpl;", "i", "", "dispatchUpdates", "", "absoluteX", "", "absoluteY", "uiViewOperationQueue", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "nativeViewHierarchyOptimizer", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "dispose", "isWrapperLeafNode", "isYogaLeafNode", "propagateShadowNode", "viewHostShadowNode", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNModuleBaseWrapperShadowView extends LayoutShadowNode {
    public static ChangeQuickRedirect a;
    @NotNull
    final HashSet<MRNModuleViewHostWrapperShadowView> b;

    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isYogaLeafNode() {
        return true;
    }

    public MRNModuleBaseWrapperShadowView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0531d21e740684c9e0cbba6b5ee7f64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0531d21e740684c9e0cbba6b5ee7f64");
        } else {
            this.b = new HashSet<>();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void addChildAt(@Nullable ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Object[] objArr = {reactShadowNodeImpl, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f41d55bd75c4d71423fb59cf303285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f41d55bd75c4d71423fb59cf303285");
            return;
        }
        super.addChildAt(reactShadowNodeImpl, i);
        if (!(reactShadowNodeImpl instanceof MRNModuleBaseWrapperShadowView) || a()) {
            return;
        }
        MRNModuleBaseWrapperShadowView mRNModuleBaseWrapperShadowView = (MRNModuleBaseWrapperShadowView) reactShadowNodeImpl;
        for (MRNModuleViewHostWrapperShadowView mRNModuleViewHostWrapperShadowView : mRNModuleBaseWrapperShadowView.b) {
            a(mRNModuleViewHostWrapperShadowView);
        }
        mRNModuleBaseWrapperShadowView.b.clear();
    }

    public final void a(@NotNull MRNModuleViewHostWrapperShadowView mRNModuleViewHostWrapperShadowView) {
        Object[] objArr = {mRNModuleViewHostWrapperShadowView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8284dc41d794bf1588ec8eb0d5ca3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8284dc41d794bf1588ec8eb0d5ca3d1");
            return;
        }
        h.b(mRNModuleViewHostWrapperShadowView, "viewHostShadowNode");
        ReactShadowNodeImpl parent = getParent();
        if (!(parent instanceof MRNModuleBaseWrapperShadowView)) {
            parent = null;
        }
        MRNModuleBaseWrapperShadowView mRNModuleBaseWrapperShadowView = (MRNModuleBaseWrapperShadowView) parent;
        if (mRNModuleBaseWrapperShadowView != null) {
            mRNModuleBaseWrapperShadowView.a(mRNModuleViewHostWrapperShadowView);
            return;
        }
        this.b.add(mRNModuleViewHostWrapperShadowView);
        if (this instanceof MRNModuleWrapperHostWrapperShadowView) {
            MRNModuleWrapperHostWrapperShadowView mRNModuleWrapperHostWrapperShadowView = (MRNModuleWrapperHostWrapperShadowView) this;
            mRNModuleViewHostWrapperShadowView.d = mRNModuleWrapperHostWrapperShadowView;
            Long l = mRNModuleViewHostWrapperShadowView.e;
            if (l != null) {
                long longValue = l.longValue();
                Long l2 = mRNModuleWrapperHostWrapperShadowView.d;
                if (l2 != null) {
                    MRNModuleNative.mrnmoduleYogaMarkParent(longValue, l2.longValue());
                }
            }
            markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean dispatchUpdates(float f, float f2, @Nullable UIViewOperationQueue uIViewOperationQueue, @Nullable t tVar) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), uIViewOperationQueue, tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813335e9c5b61d6545460133cd104d08", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813335e9c5b61d6545460133cd104d08")).booleanValue() : a() && super.dispatchUpdates(f, f2, uIViewOperationQueue, tVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void dispose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd98ec03278b6bfca6ba383560020c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd98ec03278b6bfca6ba383560020c3");
            return;
        }
        this.b.clear();
        super.dispose();
    }
}
