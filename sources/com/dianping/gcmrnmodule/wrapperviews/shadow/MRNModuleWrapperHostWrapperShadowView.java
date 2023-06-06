package com.dianping.gcmrnmodule.wrapperviews.shadow;

import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.as;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.v;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u001a\u0010\u0015\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\r\u0018\u00010\u0016H\u0016J,\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleWrapperHostWrapperShadowView;", "Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleBaseWrapperShadowView;", "()V", "hostPointer", "", "getHostPointer", "()Ljava/lang/Long;", "setHostPointer", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "applyUpdatesRecursive", "", "cssNode", "Lcom/facebook/react/uimanager/ReactShadowNode;", "absoluteX", "", "absoluteY", "uiViewOperationQueue", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "nativeViewHierarchyOptimizer", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "calculateLayoutOnChildren", "", "dispatchUpdates", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleWrapperHostWrapperShadowView extends MRNModuleBaseWrapperShadowView {
    public static ChangeQuickRedirect c;
    @Nullable
    Long d;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    @Nullable
    public final Iterable<af<af<?>>> calculateLayoutOnChildren() {
        return null;
    }

    public MRNModuleWrapperHostWrapperShadowView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a1ada6861da9c2531445123b73e7833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a1ada6861da9c2531445123b73e7833");
            return;
        }
        d a = a.b.a(this);
        if (a != null) {
            this.d = a.b.a(a);
        }
    }

    private final void a(af<?> afVar, float f, float f2, UIViewOperationQueue uIViewOperationQueue, t tVar) {
        Object[] objArr = {afVar, Float.valueOf(f), Float.valueOf(f2), uIViewOperationQueue, tVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0017fe249ffd31d6d893cc0252d5cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0017fe249ffd31d6d893cc0252d5cd");
        } else if (afVar.hasUpdates()) {
            Iterable<? extends af> calculateLayoutOnChildren = afVar.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                for (af afVar2 : calculateLayoutOnChildren) {
                    h.a((Object) afVar2, "cssChild");
                    a(afVar2, f + afVar.getLayoutX(), f2 + afVar.getLayoutY(), uIViewOperationQueue, tVar);
                }
            }
            if (afVar.dispatchUpdates(f, f2, uIViewOperationQueue, tVar) && afVar.shouldNotifyOnLayout()) {
                NativeModule nativeModule = getThemedContext().getNativeModule(UIManagerModule.class);
                h.a((Object) nativeModule, "themedContext.getNativeM…anagerModule::class.java)");
                ((UIManagerModule) nativeModule).getEventDispatcher().a(v.a(afVar.getReactTag(), afVar.getScreenX(), afVar.getScreenY(), afVar.getScreenWidth(), afVar.getScreenHeight()));
            }
            afVar.markUpdateSeen();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public final boolean dispatchUpdates(float f, float f2, @Nullable UIViewOperationQueue uIViewOperationQueue, @Nullable t tVar) {
        ao themedContext;
        CatalystInstance catalystInstance;
        UIManagerModule uIManagerModule;
        as uIImplementation;
        af d;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), uIViewOperationQueue, tVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f08832cf7bb880bb4083e85ff4d4ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f08832cf7bb880bb4083e85ff4d4ec")).booleanValue();
        }
        for (MRNModuleViewHostWrapperShadowView mRNModuleViewHostWrapperShadowView : this.b) {
            d dVar = mRNModuleViewHostWrapperShadowView.f;
            if (dVar != null && (themedContext = getThemedContext()) != null && (catalystInstance = themedContext.getCatalystInstance()) != null && (uIManagerModule = (UIManagerModule) catalystInstance.getNativeModule(UIManagerModule.class)) != null && (uIImplementation = uIManagerModule.getUIImplementation()) != null && (d = uIImplementation.d(getRootTag())) != null) {
                Integer widthMeasureSpec = d.getWidthMeasureSpec();
                h.a((Object) widthMeasureSpec, "rootNode.widthMeasureSpec");
                float size = View.MeasureSpec.getSize(widthMeasureSpec.intValue());
                if (size <= 0.0f) {
                    dVar.n();
                } else {
                    dVar.f(size);
                }
                dVar.p();
                dVar.a(Float.NaN, Float.NaN);
            }
            a(mRNModuleViewHostWrapperShadowView, 0.0f, 0.0f, uIViewOperationQueue, tVar);
        }
        return false;
    }
}
