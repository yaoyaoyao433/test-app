package com.meituan.android.singleton;

import android.content.Context;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.singleton.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile e<FingerprintManager> b = new e<FingerprintManager>() { // from class: com.meituan.android.singleton.c.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ FingerprintManager a() {
            HttpClient httpClient;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472a4c61b975f5d31080ca833fff49db", RobustBitConfig.DEFAULT_VALUE)) {
                return (FingerprintManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472a4c61b975f5d31080ca833fff49db");
            }
            Context context = b.a;
            com.sankuai.meituan.fingerprint.b bVar = new com.sankuai.meituan.fingerprint.b();
            Object[] objArr2 = {"default"};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba8b0b01de5210560e25255c72502eab", RobustBitConfig.DEFAULT_VALUE)) {
                httpClient = (HttpClient) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba8b0b01de5210560e25255c72502eab");
            } else if ("default".equals("default")) {
                httpClient = d.a.b;
            } else if ("default".equals("uuid")) {
                httpClient = d.b.b;
            } else {
                throw new IllegalArgumentException("key:defaultnot supported");
            }
            return new FingerprintManager(context, bVar, httpClient);
        }
    };

    public static FingerprintManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1953a0d6b26ceb032005f0b8ad1ff08e", RobustBitConfig.DEFAULT_VALUE) ? (FingerprintManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1953a0d6b26ceb032005f0b8ad1ff08e") : b.b();
    }
}
