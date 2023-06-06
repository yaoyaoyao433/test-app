package com.sankuai.waimai.business.ugc.machpro.components;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import uk.co.senab.photoview.PhotoView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPPhotoView extends PhotoView {
    public static ChangeQuickRedirect a;
    WeakReference<MPZoomImageComponent> b;

    public MPPhotoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07f122a82e9af4a4b758a710e01e394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07f122a82e9af4a4b758a710e01e394");
        }
    }

    public MPPhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b73711ac527569ce6e356efdd45631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b73711ac527569ce6e356efdd45631");
        }
    }

    public MPZoomImageComponent getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02090d55f0404d48c47535fd1f1fa102", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPZoomImageComponent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02090d55f0404d48c47535fd1f1fa102");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0b1ed4b25077f02d6ecf932b363774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0b1ed4b25077f02d6ecf932b363774");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        final MPZoomImageComponent component = getComponent();
        if (component != null) {
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = MPZoomImageComponent.a;
            if (PatchProxy.isSupport(objArr2, component, changeQuickRedirect2, false, "a6b7ed8f018a8d3d53e2a1c6210e24a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, component, changeQuickRedirect2, false, "a6b7ed8f018a8d3d53e2a1c6210e24a5");
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (component.d != i5) {
                component.d = i5;
                component.b = true;
            }
            if (component.e != i6) {
                component.e = i6;
                component.b = true;
            }
            if (component.b) {
                component.b = false;
                component.c.post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.machpro.components.MPZoomImageComponent.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d308a4f042bc22a96c0a15923d8c94b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d308a4f042bc22a96c0a15923d8c94b");
                        } else {
                            component.c();
                        }
                    }
                });
            }
        }
    }
}
