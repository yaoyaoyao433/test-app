package com.meituan.android.legwork.mrn.view;

import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeMeasureShadowNode extends LayoutShadowNode {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038c7c18323be566bec1a5dff123f377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038c7c18323be566bec1a5dff123f377");
        } else if (getParent() == null) {
        } else {
            uIViewOperationQueue.a(new a(getParent().getReactTag(), getReactTag()));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements ar {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        public a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1b778997318dcd38c1286bfe33fd11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1b778997318dcd38c1286bfe33fd11");
                return;
            }
            this.b = i2;
            this.c = i;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033e41d8940078656dec6a38762aa2b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033e41d8940078656dec6a38762aa2b5");
                return;
            }
            ViewManager e = nativeViewHierarchyManager.e(this.c);
            com.facebook.react.uimanager.h hVar = e instanceof com.facebook.react.uimanager.h ? (com.facebook.react.uimanager.h) e : null;
            if (hVar == null || !hVar.needsCustomLayoutForChildren()) {
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b);
            if (d.getMeasuredHeight() == d.getHeight() && d.getMeasuredWidth() == d.getWidth()) {
                return;
            }
            View d2 = nativeViewHierarchyManager.d(this.c);
            Object[] objArr2 = {d2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6046a837729fa6bab86edfde1c8b24d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6046a837729fa6bab86edfde1c8b24d");
                return;
            }
            int width = d2.getWidth();
            int height = d2.getHeight();
            d2.forceLayout();
            d2.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            d2.layout(d2.getLeft(), d2.getTop(), d2.getRight(), d2.getBottom());
        }
    }
}
