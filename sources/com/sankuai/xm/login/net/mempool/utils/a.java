package com.sankuai.xm.login.net.mempool.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(byte b, byte b2, byte b3, byte b4) {
        Object[] objArr = {Byte.valueOf(b), Byte.valueOf(b2), Byte.valueOf(b3), Byte.valueOf(b4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efcf2d9ad3e19e279fbd9c572d9c94c8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efcf2d9ad3e19e279fbd9c572d9c94c8")).intValue() : (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }
}
