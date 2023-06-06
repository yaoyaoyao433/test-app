package com.meituan.mmp.lib.api.video;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends TextureView {
    public static ChangeQuickRedirect a;
    int b;
    int c;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8caf8a78fe735088284fe13c0317e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8caf8a78fe735088284fe13c0317e9f");
        }
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f9d5e0ff0ceb5bda49584daa0294e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f9d5e0ff0ceb5bda49584daa0294e");
        } else if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c63b1f73a1deed6ad1abbac189b6a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c63b1f73a1deed6ad1abbac189b6a8e");
            return;
        }
        float rotation = getRotation();
        if (rotation == 90.0f || rotation == 270.0f) {
            i2 = i;
            i = i2;
        }
        int defaultSize = getDefaultSize(this.c, i);
        int defaultSize2 = getDefaultSize(this.b, i2);
        if (this.c > 0 && this.b > 0) {
            int mode = View.MeasureSpec.getMode(i);
            i3 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            i4 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.c * i4 < this.b * i3) {
                    i6 = (this.c * i4) / this.b;
                    i3 = i6;
                } else if (this.c * i4 > this.b * i3) {
                    defaultSize2 = (this.b * i3) / this.c;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.b * i3) / this.c;
                if (mode2 != Integer.MIN_VALUE || i7 <= i4) {
                    i4 = i7;
                } else {
                    i6 = (this.c * i4) / this.b;
                    i3 = i6;
                }
            } else if (mode2 == 1073741824) {
                i5 = (this.c * i4) / this.b;
                if (mode == Integer.MIN_VALUE && i5 > i3) {
                    defaultSize2 = (this.b * i3) / this.c;
                }
                i3 = i5;
            } else {
                int i8 = this.c;
                int i9 = this.b;
                if (mode2 != Integer.MIN_VALUE || i9 <= i4) {
                    i5 = i8;
                    i4 = i9;
                } else {
                    i5 = (this.c * i4) / this.b;
                }
                if (mode == Integer.MIN_VALUE && i5 > i3) {
                    defaultSize2 = (this.b * i3) / this.c;
                }
                i3 = i5;
            }
            setMeasuredDimension(i3, i4);
        }
        i3 = defaultSize;
        i4 = defaultSize2;
        setMeasuredDimension(i3, i4);
    }
}
