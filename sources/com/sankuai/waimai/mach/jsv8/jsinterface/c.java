package com.sankuai.waimai.mach.jsv8.jsinterface;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect b;

    public c(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5303949b8aaf352d27036447ece9027e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5303949b8aaf352d27036447ece9027e");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[Catch: Exception -> 0x00d9, TRY_ENTER, TryCatch #2 {Exception -> 0x00d9, blocks: (B:43:0x0092, B:49:0x00b0, B:51:0x00b7, B:53:0x00c1, B:55:0x00c9), top: B:77:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:8:0x0029, B:11:0x0032, B:13:0x0038, B:15:0x003e, B:17:0x0044, B:19:0x004a, B:21:0x0050, B:23:0x0056, B:25:0x005c, B:27:0x0061, B:29:0x0067, B:31:0x006d, B:33:0x0073, B:38:0x007f, B:40:0x0085, B:42:0x008b, B:58:0x00da, B:60:0x00f1, B:65:0x0104, B:61:0x00f8, B:63:0x00fe), top: B:73:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8 A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:8:0x0029, B:11:0x0032, B:13:0x0038, B:15:0x003e, B:17:0x0044, B:19:0x004a, B:21:0x0050, B:23:0x0056, B:25:0x005c, B:27:0x0061, B:29:0x0067, B:31:0x006d, B:33:0x0073, B:38:0x007f, B:40:0x0085, B:42:0x008b, B:58:0x00da, B:60:0x00f1, B:65:0x0104, B:61:0x00f8, B:63:0x00fe), top: B:73:0x0029 }] */
    @Override // com.meituan.v8jse.JavaCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.v8jse.JSValue invoke(com.meituan.v8jse.JSObject r19, com.meituan.v8jse.JSArray r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.jsv8.jsinterface.c.invoke(com.meituan.v8jse.JSObject, com.meituan.v8jse.JSArray):com.meituan.v8jse.JSValue");
    }
}
