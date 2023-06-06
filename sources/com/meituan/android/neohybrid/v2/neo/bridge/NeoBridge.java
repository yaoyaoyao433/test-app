package com.meituan.android.neohybrid.v2.neo.bridge;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.JavascriptInterface;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.d;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.f;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.i;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.m;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.o;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.p;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class NeoBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> customizeHandlers;
    public com.meituan.android.neohybrid.v2.core.a mNeoCompat;

    public NeoBridge(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08504211cd74e69cdfb9cad72d5691ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08504211cd74e69cdfb9cad72d5691ae");
            return;
        }
        this.customizeHandlers = new HashMap();
        this.mNeoCompat = aVar;
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String tunnel(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27741d459f2606179b38de7e47d9021c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27741d459f2606179b38de7e47d9021c");
        }
        if (isInsecure()) {
            return failResult("tunnel: context error.");
        }
        return new r(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String notify(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1338ae0f2c5bb0c152f061362b72407e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1338ae0f2c5bb0c152f061362b72407e");
        }
        if (isInsecure()) {
            return failResult("notify: context error.");
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.mNeoCompat, "b_pay_1tpd4rr8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("action", str).b);
        return new m(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String nsf(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d0cc40c383626248eb1a0508bdd0bf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d0cc40c383626248eb1a0508bdd0bf0");
        }
        if (isInsecure()) {
            return failResult("nsf: context error.");
        }
        return new i(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String request(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "641b7e385b587cf78a2763a5b0811ce8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "641b7e385b587cf78a2763a5b0811ce8");
        }
        if (isInsecure()) {
            return failResult("request: context error.");
        }
        if (!this.mNeoCompat.f().isNeoRequestBridge()) {
            return failResult("neo request bridge is close");
        }
        return new o(this.mNeoCompat, str, str2, str3).c();
    }

    public void setNeoBridgeCustomizeHandlers(Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> map) {
        this.customizeHandlers = map;
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String customize(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "595065d370676506c5b17b2d0ece2d38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "595065d370676506c5b17b2d0ece2d38");
        }
        if (isInsecure()) {
            return failResult("customize: context error.");
        }
        return new d(this.mNeoCompat, str, str2, str3, this.customizeHandlers).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String kit(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "776fc5c1ca865a86a9998bc0b7b678ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "776fc5c1ca865a86a9998bc0b7b678ef");
        }
        if (isInsecure()) {
            return failResult("kit: context error.");
        }
        return new f(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String ssr(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fef097ff826791bf37c6e3f39733d8d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fef097ff826791bf37c6e3f39733d8d8");
        }
        if (isInsecure()) {
            return failResult("kit: context error.");
        }
        return new p(this.mNeoCompat, str, str2, str3).c();
    }

    public boolean isInsecure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31aaa2cb165f39cbd7daa10b0f45a97e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31aaa2cb165f39cbd7daa10b0f45a97e")).booleanValue() : this.mNeoCompat == null || this.mNeoCompat.b() == null || this.mNeoCompat.a() == null;
    }

    public String failResult(@Nullable String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff93324f9dff7dacfbef1e81273b33e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff93324f9dff7dacfbef1e81273b33e0");
        }
        return new NeoBridgeBean(-1, (strArr == null || strArr.length <= 0) ? "" : strArr[0]).toString();
    }

    public static void registerNeoBridgeCustomize(com.meituan.android.neohybrid.v2.core.a aVar, String... strArr) {
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6091c27a8792336386e7dd569631db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6091c27a8792336386e7dd569631db0");
        } else {
            b.a(aVar, strArr);
        }
    }
}
