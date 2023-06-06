package com.meituan.android.neohybrid.neo.bridge;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.JavascriptInterface;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.bridge.presenter.e;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.android.neohybrid.neo.bridge.presenter.i;
import com.meituan.android.neohybrid.neo.bridge.presenter.j;
import com.meituan.android.neohybrid.neo.bridge.presenter.l;
import com.meituan.android.neohybrid.neo.bridge.presenter.m;
import com.meituan.android.neohybrid.neo.bridge.presenter.o;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class NeoBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, NeoBridgeCustomizeInterface> customizeHandlers;
    public com.meituan.android.neohybrid.core.a mNeoCompat;

    public NeoBridge(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ab650e6dc290ecef6d246f09aa1553", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ab650e6dc290ecef6d246f09aa1553");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ea84b8c94c2fca213c6c7e9d36d818", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ea84b8c94c2fca213c6c7e9d36d818");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            return new o(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult("tunnel" + checkSecure);
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String notify(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "384889ad5c485fd15a40990d65448155", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "384889ad5c485fd15a40990d65448155");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            d.a(this.mNeoCompat, "b_pay_1tpd4rr8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("action", str).b);
            return new j(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult("notify" + checkSecure);
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String nsf(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fbe6b6ac125c9f8f42c926d89760b84", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fbe6b6ac125c9f8f42c926d89760b84");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            return new i(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult(NSFConfig.NEO_NSF + checkSecure);
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String request(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25dd7c62400743240e4c6ea4b70e6d07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25dd7c62400743240e4c6ea4b70e6d07");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            if (!this.mNeoCompat.f().isNeoRequestBridge()) {
                return failResult("neo request bridge is close");
            }
            return new l(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult(SocialConstants.TYPE_REQUEST + checkSecure);
    }

    public void setNeoBridgeCustomizeHandlers(Map<String, NeoBridgeCustomizeInterface> map) {
        this.customizeHandlers = map;
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String customize(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b413237820f94ef6b3e6c2fea505f63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b413237820f94ef6b3e6c2fea505f63");
        }
        String checkSecure = checkSecure();
        if (!Boolean.TRUE.toString().equals(checkSecure)) {
            return failResult("customize" + checkSecure);
        }
        if (this.customizeHandlers == null || this.customizeHandlers.isEmpty()) {
            this.customizeHandlers = c.a(this.mNeoCompat.f().getScene());
        }
        return new e(this.mNeoCompat, str, str2, str3, this.customizeHandlers).c();
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String kit(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36319fbcca744d32bdd9809aa08846fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36319fbcca744d32bdd9809aa08846fd");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            return new g(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult("kit" + checkSecure);
    }

    @Keep
    @JavascriptInterface
    @SuppressLint({"JavascriptInterface"})
    public String ssr(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eed92e96767b318c65538d0a3cf346d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eed92e96767b318c65538d0a3cf346d");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            return new m(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult("ssr" + checkSecure);
    }

    public String checkSecure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc53081fe609e354d202f55c3768e491", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc53081fe609e354d202f55c3768e491") : this.mNeoCompat == null ? ": mNeoCompat is null." : this.mNeoCompat.e() == null ? ": WebView is null." : this.mNeoCompat.c() == null ? ": Context is null." : Boolean.TRUE.toString();
    }

    public String failResult(@Nullable String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8810cfef8d3a19cab11cb0695bb519a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8810cfef8d3a19cab11cb0695bb519a1");
        }
        return new NeoBridgeBean(-1, (strArr == null || strArr.length <= 0) ? "" : strArr[0]).toString();
    }

    public static void registerNeoBridgeCustomize(com.meituan.android.neohybrid.core.a aVar, String... strArr) {
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2abea762da341394356264b0d518dd48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2abea762da341394356264b0d518dd48");
            return;
        }
        c.a(aVar.f().getScene(), strArr);
        c.a(aVar, strArr);
    }
}
