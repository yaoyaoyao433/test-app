package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.Context;
import com.heytap.openid.sdk.a;
import com.heytap.openid.sdk.b;
import com.heytap.openid.sdk.c;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OppoOaidProvider extends AbstractProvider {
    private static final String TAG = "OppoOaidProvider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile OppoOaidProvider singleton;

    public static OppoOaidProvider getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e50318d9062eea36a74ec879c3b14bdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (OppoOaidProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e50318d9062eea36a74ec879c3b14bdb");
        }
        if (singleton == null) {
            synchronized (OppoOaidProvider.class) {
                if (singleton == null) {
                    singleton = new OppoOaidProvider();
                }
            }
        }
        return singleton;
    }

    @Override // com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider
    public boolean isOaidSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "657bfa1cc75c1d33953db91c2da85b1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "657bfa1cc75c1d33953db91c2da85b1f")).booleanValue();
        }
        LogUtils.i(TAG, "oppo getAdvertisingIdInfo is Supported:" + AdvertisingIdClient.isAdvertisingIdAvailable(context));
        try {
            b.a("OpenIDHelper", "init");
            c cVar = c.b.a;
            a.b = c.a(a.a(context));
            a.a = true;
            b.a("OpenIDHelper", "isSupported");
            if (!a.a) {
                b.b("HeyTapID", "SDK Need Init First!");
            }
            return a.b;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: Throwable -> 0x00b0, TryCatch #0 {Throwable -> 0x00b0, blocks: (B:9:0x002a, B:11:0x0036, B:16:0x005a, B:18:0x0066, B:24:0x008d, B:26:0x0093, B:30:0x009a, B:31:0x00a0, B:35:0x00a9, B:20:0x006f, B:22:0x0073, B:23:0x007b, B:12:0x0040, B:14:0x0044, B:15:0x004e), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: Throwable -> 0x00b0, TryCatch #0 {Throwable -> 0x00b0, blocks: (B:9:0x002a, B:11:0x0036, B:16:0x005a, B:18:0x0066, B:24:0x008d, B:26:0x0093, B:30:0x009a, B:31:0x00a0, B:35:0x00a9, B:20:0x006f, B:22:0x0073, B:23:0x007b, B:12:0x0040, B:14:0x0044, B:15:0x004e), top: B:39:0x002a }] */
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.oaid.provider.OppoOaidProvider.changeQuickRedirect
            java.lang.String r11 = "2beecc2046b1a5cf4ebf1404c9884d0b"
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
            if (r13 != 0) goto L2a
            java.lang.String r13 = "OppoOaidProvider"
            java.lang.String r0 = "invalid input param"
            android.util.Log.e(r13, r0)
            r13 = 0
            return r13
        L2a:
            java.lang.String r1 = "OpenIDHelper"
            java.lang.String r2 = "getOUID"
            com.heytap.openid.sdk.b.a(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            boolean r1 = com.heytap.openid.sdk.a.a     // Catch: java.lang.Throwable -> Lb0
            if (r1 != 0) goto L40
            java.lang.String r1 = "HeyTapID"
            java.lang.String r2 = "SDK Need Init First!"
            com.heytap.openid.sdk.b.b(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = ""
            goto L5a
        L40:
            boolean r1 = com.heytap.openid.sdk.a.b     // Catch: java.lang.Throwable -> Lb0
            if (r1 != 0) goto L4e
            java.lang.String r1 = "HeyTapID"
            java.lang.String r2 = "NOT Supported"
            com.heytap.openid.sdk.b.b(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = ""
            goto L5a
        L4e:
            com.heytap.openid.sdk.c r1 = com.heytap.openid.sdk.c.b.a     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r2 = com.heytap.openid.sdk.a.a(r13)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "OUID"
            java.lang.String r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> Lb0
        L5a:
            java.lang.String r2 = "OpenIDHelper"
            java.lang.String r3 = "getOUIDStatus"
            com.heytap.openid.sdk.b.a(r2, r3)     // Catch: java.lang.Throwable -> Lb0
            boolean r2 = com.heytap.openid.sdk.a.a     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto L6f
            java.lang.String r13 = "HeyTapID"
            java.lang.String r2 = "SDK Need Init First!"
            com.heytap.openid.sdk.b.b(r13, r2)     // Catch: java.lang.Throwable -> Lb0
        L6d:
            r13 = 0
            goto L8d
        L6f:
            boolean r2 = com.heytap.openid.sdk.a.b     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto L7b
            java.lang.String r13 = "HeyTapID"
            java.lang.String r2 = "NOT Supported"
            com.heytap.openid.sdk.b.b(r13, r2)     // Catch: java.lang.Throwable -> Lb0
            goto L6d
        L7b:
            java.lang.String r2 = "TRUE"
            com.heytap.openid.sdk.c r3 = com.heytap.openid.sdk.c.b.a     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r13 = com.heytap.openid.sdk.a.a(r13)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "OUID_STATUS"
            java.lang.String r13 = r3.a(r13, r4)     // Catch: java.lang.Throwable -> Lb0
            boolean r13 = r2.equalsIgnoreCase(r13)     // Catch: java.lang.Throwable -> Lb0
        L8d:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto La0
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r2 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse     // Catch: java.lang.Throwable -> Lb0
            if (r13 != 0) goto L99
            r13 = 1
            goto L9a
        L99:
            r13 = 0
        L9a:
            java.lang.String r3 = ""
            r2.<init>(r0, r1, r13, r3)     // Catch: java.lang.Throwable -> Lb0
            goto Lc0
        La0:
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r2 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = ""
            if (r13 != 0) goto La8
            r13 = 1
            goto La9
        La8:
            r13 = 0
        La9:
            java.lang.String r3 = "oaid is null"
            r2.<init>(r0, r1, r13, r3)     // Catch: java.lang.Throwable -> Lb0
            goto Lc0
        Lb0:
            java.lang.String r13 = "OppoOaidProvider"
            java.lang.String r0 = "HeytapIDSDK.getOUID IOException"
            android.util.Log.e(r13, r0)
            com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse r2 = new com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse
            java.lang.String r13 = ""
            java.lang.String r0 = "getAdvertisingIdInfo IOException"
            r2.<init>(r9, r13, r9, r0)
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.provider.OppoOaidProvider.getOaid(android.content.Context):com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse");
    }
}
