package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.identifier.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VivoOaidProvider extends AbstractProvider {
    private static final String TAG = "VivoOaidProvider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile VivoOaidProvider singleton;

    public static VivoOaidProvider getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28e81092bb9de9f3cd2588a6b50c799e", RobustBitConfig.DEFAULT_VALUE)) {
            return (VivoOaidProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28e81092bb9de9f3cd2588a6b50c799e");
        }
        if (singleton == null) {
            synchronized (VivoOaidProvider.class) {
                if (singleton == null) {
                    singleton = new VivoOaidProvider();
                }
            }
        }
        return singleton;
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public boolean isOaidSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32474c426d3b703ba1ba8207821c4724", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32474c426d3b703ba1ba8207821c4724")).booleanValue();
        }
        LogUtils.i(TAG, "vivo isOaidSupported is Supported:" + d.a(AppUtil.getAppContext(context)));
        try {
            return d.a(AppUtil.getAppContext(context));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: Throwable -> 0x0087, TryCatch #1 {Throwable -> 0x0087, blocks: (B:29:0x006d, B:31:0x0073, B:32:0x007b), top: B:42:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: Throwable -> 0x0087, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0087, blocks: (B:29:0x006d, B:31:0x0073, B:32:0x007b), top: B:42:0x006d }] */
    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse getOaid(android.content.Context r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.oaid.provider.VivoOaidProvider.changeQuickRedirect
            java.lang.String r11 = "508765a65b5d3e21eef5770fba2e421a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r13 = (com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse) r13
            return r13
        L1e:
            r1 = 0
            if (r13 != 0) goto L2a
            java.lang.String r13 = "VivoOaidProvider"
            java.lang.String r0 = "invalid input param"
            android.util.Log.e(r13, r0)
            return r1
        L2a:
            android.content.Context r2 = com.meituan.android.common.unionid.oneid.util.AppUtil.getAppContext(r13)     // Catch: java.lang.Throwable -> L86
            com.vivo.identifier.b r2 = com.vivo.identifier.b.a(r2)     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L36
            r2 = r1
            goto L4d
        L36:
            java.lang.String r3 = com.vivo.identifier.b.c     // Catch: java.lang.Throwable -> L86
            if (r3 != 0) goto L46
            r2.b(r9, r1)     // Catch: java.lang.Throwable -> L86
            com.vivo.identifier.c r2 = com.vivo.identifier.b.b     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L46
            android.content.Context r2 = com.vivo.identifier.b.a     // Catch: java.lang.Throwable -> L86
            com.vivo.identifier.b.a(r2, r9, r1)     // Catch: java.lang.Throwable -> L86
        L46:
            java.lang.String r2 = com.vivo.identifier.b.c     // Catch: java.lang.Throwable -> L86
            com.vivo.identifier.b.a(r9, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = com.vivo.identifier.b.c     // Catch: java.lang.Throwable -> L86
        L4d:
            android.content.Context r13 = com.meituan.android.common.unionid.oneid.util.AppUtil.getAppContext(r13)     // Catch: java.lang.Throwable -> L86
            com.vivo.identifier.b r13 = com.vivo.identifier.b.a(r13)     // Catch: java.lang.Throwable -> L86
            if (r13 != 0) goto L58
            goto L5e
        L58:
            r3 = 4
            r13.b(r3, r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = com.vivo.identifier.b.d     // Catch: java.lang.Throwable -> L86
        L5e:
            boolean r13 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L86
            if (r13 != 0) goto L6c
            int r13 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L86
            if (r13 != 0) goto L6c
            r13 = 1
            goto L6d
        L6c:
            r13 = 0
        L6d:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L87
            if (r1 != 0) goto L7b
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r1 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = ""
            r1.<init>(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L87
            goto L98
        L7b:
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r1 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = ""
            java.lang.String r3 = "oaid is null"
            r1.<init>(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L87
            goto L98
        L86:
            r13 = 0
        L87:
            java.lang.String r0 = "VivoOaidProvider"
            java.lang.String r1 = "vivo IdentifierManager IOException"
            android.util.Log.e(r0, r1)
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r1 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse
            java.lang.String r0 = ""
            java.lang.String r2 = "getAdvertisingIdInfo IOException"
            r1.<init>(r9, r0, r13, r2)
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.provider.VivoOaidProvider.getOaid(android.content.Context):com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse");
    }
}
