package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTCookieManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract boolean acceptCookie();

    public abstract boolean acceptThirdPartyCookies(MTWebView mTWebView);

    public abstract boolean allowFileSchemeCookiesImpl();

    public abstract void flush();

    public abstract String getCookie(String str);

    public abstract String getCookie(String str, boolean z);

    public abstract boolean hasCookies();

    public abstract boolean hasCookies(boolean z);

    @Deprecated
    public abstract void removeAllCookie();

    public abstract void removeAllCookies(MTValueCallback<Boolean> mTValueCallback);

    @Deprecated
    public abstract void removeExpiredCookie();

    @Deprecated
    public abstract void removeSessionCookie();

    public abstract void removeSessionCookies(MTValueCallback<Boolean> mTValueCallback);

    public abstract void setAcceptCookie(boolean z);

    public abstract void setAcceptFileSchemeCookiesImpl(boolean z);

    public abstract void setAcceptThirdPartyCookies(MTWebView mTWebView, boolean z);

    public abstract void setCookie(String str, String str2);

    public abstract void setCookie(String str, String str2, MTValueCallback<Boolean> mTValueCallback);

    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8fb68c59f8c7449f962c7af43d23fab", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8fb68c59f8c7449f962c7af43d23fab");
        }
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public static MTCookieManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd6705d1d9c19974e7541e6905e4b58a", RobustBitConfig.DEFAULT_VALUE) ? (MTCookieManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd6705d1d9c19974e7541e6905e4b58a") : MTWebViewFactory.getProvider().getCookieManager();
    }

    public synchronized String getCookie(MTWebAddress mTWebAddress) {
        Object[] objArr = {mTWebAddress};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0de9276546203e2558959d6ff1e5e07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0de9276546203e2558959d6ff1e5e07");
        }
        return getCookie(mTWebAddress.toString());
    }

    public static boolean allowFileSchemeCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d162cb4242a83e0fb6968501c8e0f3dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d162cb4242a83e0fb6968501c8e0f3dd")).booleanValue() : getInstance().allowFileSchemeCookiesImpl();
    }

    public static void setAcceptFileSchemeCookies(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a30f7a81cd22d1c379939ad8b61d18f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a30f7a81cd22d1c379939ad8b61d18f7");
        } else {
            getInstance().setAcceptFileSchemeCookiesImpl(z);
        }
    }
}
