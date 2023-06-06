package com.dianping.video.videofilter.gpuimage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum u {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;
    
    public static ChangeQuickRedirect a;

    u() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc6625006e127320c19818a61b61f8db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc6625006e127320c19818a61b61f8db");
        }
    }

    public static u valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51c45a3344916ede3556d8e5eb79ef59", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51c45a3344916ede3556d8e5eb79ef59") : (u) Enum.valueOf(u.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static u[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2c8f9575d1a7a0a50b3682de953b2b2", RobustBitConfig.DEFAULT_VALUE) ? (u[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2c8f9575d1a7a0a50b3682de953b2b2") : (u[]) values().clone();
    }

    public static u a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b19b972a8bbdc069f5e531e1cb04d187", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b19b972a8bbdc069f5e531e1cb04d187");
        }
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        if (i == 360) {
                            return NORMAL;
                        }
                        throw new IllegalStateException(i + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
                    }
                    return ROTATION_270;
                }
                return ROTATION_180;
            }
            return ROTATION_90;
        }
        return NORMAL;
    }
}
