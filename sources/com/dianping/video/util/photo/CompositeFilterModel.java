package com.dianping.video.util.photo;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class CompositeFilterModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Bitmap filterBitmap;
    public float intensity;

    public CompositeFilterModel(Bitmap bitmap, float f) {
        Object[] objArr = {bitmap, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2868a4c7bc37ca7dc94497059ae7b91e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2868a4c7bc37ca7dc94497059ae7b91e");
            return;
        }
        this.filterBitmap = bitmap;
        this.intensity = f;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d38d59c6621e5506fbe23c4bae11d46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d38d59c6621e5506fbe23c4bae11d46");
        }
        return "CompositeFilterModel{filterBitmap=" + this.filterBitmap + ", intensity=" + this.intensity + '}';
    }
}
