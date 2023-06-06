package com.sankuai.waimai.touchmatrix.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private Object b;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmstatistics";
    }

    public d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8993314be41733aec9cf469604b0b894", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8993314be41733aec9cf469604b0b894");
        } else {
            this.b = obj;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76957beba601ad76721c697734404fe", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76957beba601ad76721c697734404fe") : new String[]{"clicklx", "viewlx", "clicksh", "viewsh"};
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[Catch: JSONException -> 0x011f, TryCatch #0 {JSONException -> 0x011f, blocks: (B:9:0x0035, B:11:0x0054, B:12:0x0068, B:34:0x00c4, B:36:0x00c8, B:37:0x00db, B:38:0x00ee, B:39:0x0106, B:21:0x009a, B:24:0x00a3, B:27:0x00ad, B:30:0x00b8), top: B:45:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[Catch: JSONException -> 0x011f, TryCatch #0 {JSONException -> 0x011f, blocks: (B:9:0x0035, B:11:0x0054, B:12:0x0068, B:34:0x00c4, B:36:0x00c8, B:37:0x00db, B:38:0x00ee, B:39:0x0106, B:21:0x009a, B:24:0x00a3, B:27:0x00ad, B:30:0x00b8), top: B:45:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[Catch: JSONException -> 0x011f, TryCatch #0 {JSONException -> 0x011f, blocks: (B:9:0x0035, B:11:0x0054, B:12:0x0068, B:34:0x00c4, B:36:0x00c8, B:37:0x00db, B:38:0x00ee, B:39:0x0106, B:21:0x009a, B:24:0x00a3, B:27:0x00ad, B:30:0x00b8), top: B:45:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[Catch: JSONException -> 0x011f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x011f, blocks: (B:9:0x0035, B:11:0x0054, B:12:0x0068, B:34:0x00c4, B:36:0x00c8, B:37:0x00db, B:38:0x00ee, B:39:0x0106, B:21:0x009a, B:24:0x00a3, B:27:0x00ad, B:30:0x00b8), top: B:45:0x0035 }] */
    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(java.lang.String r19, java.lang.String r20, java.lang.String r21, com.sankuai.waimai.mach.jsv8.a r22) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.dialog.d.invoke(java.lang.String, java.lang.String, java.lang.String, com.sankuai.waimai.mach.jsv8.a):void");
    }
}
