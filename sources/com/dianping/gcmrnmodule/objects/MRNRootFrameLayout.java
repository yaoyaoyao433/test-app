package com.dianping.gcmrnmodule.objects;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/objects/MRNRootFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/RootView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getChildMRNModuleView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "handleException", "", "t", "", "onChildStartedNativeGesture", "androidEvent", "Landroid/view/MotionEvent;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNRootFrameLayout extends FrameLayout implements aj {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.aj
    public void handleException(@Nullable Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8f5e827df4d718f08455029062b1f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8f5e827df4d718f08455029062b1f6");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.c childMRNModuleView = getChildMRNModuleView();
        if (childMRNModuleView != null) {
            Object[] objArr2 = {th};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.c.a;
            if (PatchProxy.isSupport(objArr2, childMRNModuleView, changeQuickRedirect2, false, "8adc59cb43bbc481c5d86f7609742b63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, childMRNModuleView, changeQuickRedirect2, false, "8adc59cb43bbc481c5d86f7609742b63");
            } else {
                childMRNModuleView.i.handleException(new RuntimeException(th));
            }
        }
    }

    @Override // com.facebook.react.uimanager.aj
    public void onChildStartedNativeGesture(@Nullable MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4700c023a5c155fc92de87787da3250a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4700c023a5c155fc92de87787da3250a");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.c childMRNModuleView = getChildMRNModuleView();
        if (childMRNModuleView != null) {
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.c.a;
            if (PatchProxy.isSupport(objArr2, childMRNModuleView, changeQuickRedirect2, false, "331da6ddc7addc1557286579167cb3bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, childMRNModuleView, changeQuickRedirect2, false, "331da6ddc7addc1557286579167cb3bd");
            } else {
                childMRNModuleView.g.a(motionEvent, childMRNModuleView.h);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRNRootFrameLayout(@NotNull Context context) {
        super(context);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f12d039f6bfad176939bad19b2624d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f12d039f6bfad176939bad19b2624d3");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRNRootFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.b(context, "context");
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a75437b85cdd495e8cef562eae74667d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a75437b85cdd495e8cef562eae74667d");
        }
    }

    private final com.dianping.gcmrnmodule.wrapperviews.c getChildMRNModuleView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31798d5053e291bbb3e41162b7e92909", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31798d5053e291bbb3e41162b7e92909");
        }
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof com.dianping.gcmrnmodule.wrapperviews.c) {
                    return (com.dianping.gcmrnmodule.wrapperviews.c) childAt;
                }
            }
            return null;
        }
        return null;
    }
}
