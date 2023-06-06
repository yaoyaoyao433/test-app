package com.dianping.video.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static short a(byte b, byte b2, boolean z) {
        Object[] objArr = {Byte.valueOf(b), Byte.valueOf(b2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6814a776ce8be3149ba3d474b09b21c7", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6814a776ce8be3149ba3d474b09b21c7")).shortValue() : z ? (short) (((short) (((short) ((b & 255) | 0)) << 8)) | (b2 & 255)) : (short) ((b & 255) | ((short) (((short) ((b2 & 255) | 0)) << 8)));
    }
}
