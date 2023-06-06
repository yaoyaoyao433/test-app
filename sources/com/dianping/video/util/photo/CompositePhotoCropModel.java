package com.dianping.video.util.photo;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class CompositePhotoCropModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float degree;
    public int height;
    public int width;
    public int x;
    public int y;

    public CompositePhotoCropModel(int i, int i2, int i3, int i4, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6909477bda4fa38778f6d39a71fc148a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6909477bda4fa38778f6d39a71fc148a");
            return;
        }
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
        this.degree = f;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "002e83a5be6bd4692c5cb38f57be0ca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "002e83a5be6bd4692c5cb38f57be0ca4");
        }
        return "CompositePhotoCropModel{x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", degree=" + this.degree + '}';
    }
}
