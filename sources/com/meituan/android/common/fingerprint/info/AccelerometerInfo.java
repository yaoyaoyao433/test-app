package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AccelerometerInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float x;
    private float y;
    private float z;

    public AccelerometerInfo(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d961bf145dbf54903a38e3f6120b916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d961bf145dbf54903a38e3f6120b916");
            return;
        }
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float f) {
        this.x = f;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float f) {
        this.y = f;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float f) {
        this.z = f;
    }
}
