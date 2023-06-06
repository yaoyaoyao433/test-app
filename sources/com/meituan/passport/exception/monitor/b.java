package com.meituan.passport.exception.monitor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.SnifferConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static volatile b b = null;
    private static boolean d = false;
    private int c;
    private AtomicReference<com.meituan.passport.exception.monitor.listener.b> e;
    private AtomicReference<com.meituan.passport.exception.monitor.listener.a> f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d7f2980a7b918c318ffca8484eae10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d7f2980a7b918c318ffca8484eae10");
            return;
        }
        this.c = 1;
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47ba7c5b15bdb7e69fc78113be2a117f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47ba7c5b15bdb7e69fc78113be2a117f");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c77a6682af6797413ab0ebda1676669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c77a6682af6797413ab0ebda1676669");
        } else {
            Sniffer.smell(c(), str, str2, "", "");
        }
    }

    public final void a(String str, String str2, Map<String, String> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa91b0f33e3ca187c62b3ad5f45f5e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa91b0f33e3ca187c62b3ad5f45f5e35");
        } else {
            Sniffer.smell(c(), str, str2, "", "", map);
        }
    }

    public com.meituan.passport.exception.monitor.listener.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1234f76a95e677f667a69a2ba06b3e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.exception.monitor.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1234f76a95e677f667a69a2ba06b3e") : this.f.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb95717f0b90629b776a4be77820c201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb95717f0b90629b776a4be77820c201");
            return;
        }
        if (th != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", th.getMessage());
            hashMap.put("type", th.getClass().getSimpleName());
            a("passport_exception", "unknown_exception", hashMap);
        } else {
            Object[] objArr2 = {"passport_exception", "unknown_exception", "no throwable message"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55ccd2debe08a829d7a7bc956b608149", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55ccd2debe08a829d7a7bc956b608149");
            } else {
                Sniffer.smell(c(), "passport_exception", "unknown_exception", "no throwable message", "");
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d524af692dfabbfa45ef064bfb3f6b4", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.passport.exception.monitor.listener.b bVar = (com.meituan.passport.exception.monitor.listener.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d524af692dfabbfa45ef064bfb3f6b4");
        } else {
            this.e.get();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d414099aa850989001699059a0bbe80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d414099aa850989001699059a0bbe80");
            return;
        }
        if (apiException != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", String.valueOf(apiException.code));
            hashMap.put("message", apiException.getMessage());
            hashMap.put("type", apiException.type);
            a("passport_exception", "api_exception", hashMap);
        } else {
            Sniffer.smell(c(), "passport_exception", "api_exception", "", "no exception message");
        }
        if (this.c == 0) {
            b();
        }
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b367953a429b7a8fc8f234f66a08a3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b367953a429b7a8fc8f234f66a08a3a2");
        } else if (d || context == null) {
        } else {
            Sniffer.init(context, new SnifferConfig() { // from class: com.meituan.passport.exception.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                public final String getApkHash() {
                    return "";
                }

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                @NonNull
                public final String getCityId() {
                    return "";
                }

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                public final String getUserId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb38d792db031fb7057599a74204da9e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb38d792db031fb7057599a74204da9e") : String.valueOf(UserCenter.getInstance(context).getUserId());
                }
            });
            d = true;
        }
    }

    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46923ef7426380ad854a0f0368711431", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46923ef7426380ad854a0f0368711431");
        }
        return "passport_" + com.meituan.passport.service.e.a().d;
    }
}
