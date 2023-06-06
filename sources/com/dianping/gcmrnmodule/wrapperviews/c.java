package com.dianping.gcmrnmodule.wrapperviews;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.d;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u0000H\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\"\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010!J0\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0014J(\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0014J\u0012\u00103\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R:\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "context", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "delayInput", "Lcom/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput;", "getDelayInput", "()Lcom/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput;", "setDelayInput", "(Lcom/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput;)V", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "kotlin.jvm.PlatformType", "needBubbling", "", "getNeedBubbling", "()Z", "setNeedBubbling", "(Z)V", "onSizeChangedListener", "Lkotlin/Function4;", "", "", "getOnSizeChangedListener", "()Lkotlin/jvm/functions/Function4;", "setOnSizeChangedListener", "(Lkotlin/jvm/functions/Function4;)V", "touchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "createInfoInstance", "dispatchJSTouchEvent", "ev", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "handleException", "t", "", "onChildStartedNativeGesture", "androidEvent", "onLayout", "changed", "left", "top", "right", "bottom", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "requestDisallowInterceptTouchEvent", "disallowIntercept", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class c extends b<c> {
    public static ChangeQuickRedirect a;
    public final j g;
    public final com.facebook.react.uimanager.events.c h;
    public final ReactContext i;
    private boolean j;
    @Nullable
    private com.dianping.gcmrnmodule.objects.a k;
    @Nullable
    private d<? super Integer, ? super Integer, ? super Integer, ? super Integer, r> l;

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* bridge */ /* synthetic */ c g() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "context");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf642e01ed1d3d9ce877e8cf35501f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf642e01ed1d3d9ce877e8cf35501f7");
            return;
        }
        this.i = reactContext;
        this.g = new j(this);
        NativeModule nativeModule = this.i.getNativeModule(UIManagerModule.class);
        h.a((Object) nativeModule, "context.getNativeModule(…anagerModule::class.java)");
        this.h = ((UIManagerModule) nativeModule).getEventDispatcher();
        this.j = true;
    }

    public final boolean getNeedBubbling() {
        return this.j;
    }

    public final void setNeedBubbling(boolean z) {
        this.j = z;
    }

    @Nullable
    public final com.dianping.gcmrnmodule.objects.a getDelayInput() {
        return this.k;
    }

    public final void setDelayInput(@Nullable com.dianping.gcmrnmodule.objects.a aVar) {
        this.k = aVar;
    }

    @Nullable
    public final d<Integer, Integer, Integer, Integer, r> getOnSizeChangedListener() {
        return this.l;
    }

    public final void setOnSizeChangedListener(@Nullable d<? super Integer, ? super Integer, ? super Integer, ? super Integer, r> dVar) {
        this.l = dVar;
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf871f2f55293cba763a55cf9c655cbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf871f2f55293cba763a55cf9c655cbf");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (i != 0 || i2 != 0) {
            setLeft(0);
            setTop(0);
            setRight(i3 - i);
            setBottom(i4 - i2);
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            setLayoutParams(layoutParams);
            c cVar = this;
            while (cVar.getParent() != null && (cVar.getParent() instanceof View)) {
                ViewParent parent = cVar.getParent();
                if (parent == null) {
                    throw new o("null cannot be cast to non-null type android.view.View");
                }
                cVar = (View) parent;
                cVar.requestLayout();
            }
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67121f64512090f3477c5c1e383e1ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67121f64512090f3477c5c1e383e1ff5");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        d<? super Integer, ? super Integer, ? super Integer, ? super Integer, r> dVar = this.l;
        if (dVar != null) {
            dVar.a(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if ((com.facebook.react.uimanager.ak.a(r15) instanceof com.dianping.gcmrnmodule.objects.MRNRootFrameLayout) == false) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.wrapperviews.c.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff90826856cbcbdf8f5b4611783a2bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff90826856cbcbdf8f5b4611783a2bf")).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae0055e87a8b8a7d9271c0e547bc360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae0055e87a8b8a7d9271c0e547bc360");
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }
}
