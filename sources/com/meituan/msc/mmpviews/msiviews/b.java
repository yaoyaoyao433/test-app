package com.meituan.msc.mmpviews.msiviews;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.msc.mmpviews.shell.d implements LifecycleEventListener, com.meituan.msc.mmpviews.shell.a {
    public static ChangeQuickRedirect a;
    View b;

    @Override // com.meituan.msc.mmpviews.shell.a
    public final /* bridge */ /* synthetic */ e getDelegate() {
        return super.getDelegate();
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d3a5f95b4f91677e2459cbf5603541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d3a5f95b4f91677e2459cbf5603541");
        } else if (context instanceof ReactContext) {
            ((ReactContext) context).addLifecycleEventListener(this);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230380d9b129d75518fa35acd7f7da08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230380d9b129d75518fa35acd7f7da08");
            return;
        }
        super.requestLayout();
        if (this.b != null) {
            final View view = this.b;
            final int width = getWidth();
            final int height = getHeight();
            Object[] objArr2 = {view, Integer.valueOf(width), Integer.valueOf(height)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e06dae90cf7288a81eb5c093c5b1720", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e06dae90cf7288a81eb5c093c5b1720");
            } else {
                view.post(new Runnable() { // from class: com.meituan.msc.mmpviews.msiviews.b.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "366b2ba0919f3b02b6e4fcb3e1ad51fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "366b2ba0919f3b02b6e4fcb3e1ad51fa");
                            return;
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                });
            }
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da3c2e412bff4b82893a1901c621ef0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da3c2e412bff4b82893a1901c621ef0d");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.b != null) {
            if (a(this.b)) {
                throw new com.meituan.msc.common.a("MSI视图不能包含MSC子视图!");
            }
            this.b.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222ebcd651a342dd80f6f15e25b3f8ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222ebcd651a342dd80f6f15e25b3f8ac")).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (((ReactContext) getContext()).getUIImplementation().g(viewGroup.getChildAt(i).getId()) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fc59a8cde8c9488af4e72324df7974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fc59a8cde8c9488af4e72324df7974");
        } else if (this.b instanceof com.meituan.msi.lifecycle.b) {
            ((com.meituan.msi.lifecycle.b) this.b).a(a.a(getContext()));
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc9f0628a12c050f5e9c316d78921cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc9f0628a12c050f5e9c316d78921cc");
        } else if (this.b instanceof com.meituan.msi.lifecycle.b) {
            ((com.meituan.msi.lifecycle.b) this.b).b(a.a(getContext()));
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1797496d2c2d9be04a7a62650ad253b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1797496d2c2d9be04a7a62650ad253b1");
            return;
        }
        Context context = getContext();
        if (context instanceof ReactContext) {
            ((ReactContext) context).removeLifecycleEventListener(this);
        }
    }
}
