package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class BitmapDescriptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String a;
    private int b;
    private int c;
    private Bitmap d;
    private Object e;

    @Deprecated
    public BitmapDescriptor(@NonNull String str, @NonNull Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f731a67045fbe7a6cc01a8e059a09ddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f731a67045fbe7a6cc01a8e059a09ddc");
            return;
        }
        this.a = str;
        this.d = bitmap;
        this.b = this.d.getWidth();
        this.c = this.d.getHeight();
    }

    @Deprecated
    public BitmapDescriptor(Bitmap bitmap) {
        this("mapsdk" + bitmap.toString() + CommonConstant.Symbol.UNDERLINE + System.nanoTime(), bitmap);
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41689de64622af7d6e92e43a06e0a931", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41689de64622af7d6e92e43a06e0a931");
        }
    }

    public final String getId() {
        return this.a;
    }

    public final Bitmap getBitmap() {
        return this.d;
    }

    public final int getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f452e9ea5012ad82cfe347ce7453386c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f452e9ea5012ad82cfe347ce7453386c")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getWidth();
    }

    public final int getHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7692caa74dc502b4929f86122c1440b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7692caa74dc502b4929f86122c1440b")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getHeight();
    }

    public final Object getBitmapDescriptor() {
        return this.e;
    }

    public final void setBitmapDescriptor(Object obj) {
        this.e = obj;
    }
}
