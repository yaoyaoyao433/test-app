package com.meituan.mtwebkit.internal.system;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.meituan.mtwebkit.MTCookieManager;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebAddress;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends MTCookieManager {
    public static ChangeQuickRedirect a;
    private CookieManager b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f07731f32b6180e22b651647b2d8bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f07731f32b6180e22b651647b2d8bc");
        } else {
            this.b = CookieManager.getInstance();
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void setAcceptCookie(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7bdd1d29fd80c4423f7eb23f1c214d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7bdd1d29fd80c4423f7eb23f1c214d1");
        } else {
            this.b.setAcceptCookie(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final boolean acceptCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974b723789500d179aed27b175084454", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974b723789500d179aed27b175084454")).booleanValue() : this.b.acceptCookie();
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void setAcceptThirdPartyCookies(MTWebView mTWebView, boolean z) {
        Object[] objArr = {mTWebView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e20be9e6378bf5381c6a375d116d33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e20be9e6378bf5381c6a375d116d33f");
        } else {
            this.b.setAcceptThirdPartyCookies(((z) mTWebView.getWebViewProvider()).b, z);
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final boolean acceptThirdPartyCookies(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3328758b37dd6a305a1b608b551a7393", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3328758b37dd6a305a1b608b551a7393")).booleanValue() : this.b.acceptThirdPartyCookies(((z) mTWebView.getWebViewProvider()).b);
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void setCookie(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a078171d09a20d3713d9ca5967bc579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a078171d09a20d3713d9ca5967bc579");
        } else {
            this.b.setCookie(str, str2);
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void setCookie(String str, String str2, final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {str, str2, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b2e7762ef63b987e8d63ab0b679cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b2e7762ef63b987e8d63ab0b679cc2");
        } else {
            this.b.setCookie(str, str2, mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.b.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e3557283c8d5d1c314e40ebd9c09d94", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e3557283c8d5d1c314e40ebd9c09d94");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final String getCookie(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129c4bb65ba1a25e03789ca40a31f225", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129c4bb65ba1a25e03789ca40a31f225") : this.b.getCookie(str);
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final String getCookie(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21b66a8bb042543c24b32709466d037", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21b66a8bb042543c24b32709466d037") : this.b.getCookie(str);
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final synchronized String getCookie(MTWebAddress mTWebAddress) {
        Object[] objArr = {mTWebAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620a7e04d86614725061f788521c8abf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620a7e04d86614725061f788521c8abf");
        }
        return this.b.getCookie(mTWebAddress.toString());
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void removeSessionCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7d2b97e872c3b48e95a97adc519bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7d2b97e872c3b48e95a97adc519bf8");
        } else {
            this.b.removeSessionCookie();
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void removeSessionCookies(final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d7473e2bbe583d12031c0b4784fee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d7473e2bbe583d12031c0b4784fee2");
        } else {
            this.b.removeSessionCookies(mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.b.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fda4fd384b5b70db3e8477895a7e86df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fda4fd384b5b70db3e8477895a7e86df");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void removeAllCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e958b6f893b1d41bf65b749744d28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e958b6f893b1d41bf65b749744d28c");
        } else {
            this.b.removeAllCookie();
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void removeAllCookies(final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19d346e6acfe09a64b518d22e0d5757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19d346e6acfe09a64b518d22e0d5757");
        } else {
            this.b.removeAllCookies(mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.b.3
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3ecea2d61f6c3d158537568d2c14c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3ecea2d61f6c3d158537568d2c14c9");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final boolean hasCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262a43e186531bd6e1721a24f2b9396d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262a43e186531bd6e1721a24f2b9396d")).booleanValue() : this.b.hasCookies();
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final boolean hasCookies(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec63c63406e84a6e9f85481a4db46173", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec63c63406e84a6e9f85481a4db46173")).booleanValue() : this.b.hasCookies();
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void removeExpiredCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04e882131236a7c633adc30afc026f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04e882131236a7c633adc30afc026f5");
        } else {
            this.b.removeExpiredCookie();
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void flush() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1b5666fd15690c032bd24da8c3a0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1b5666fd15690c032bd24da8c3a0d1");
        } else {
            this.b.flush();
        }
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final boolean allowFileSchemeCookiesImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f1c63fb29484e785a9539659632d7d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f1c63fb29484e785a9539659632d7d")).booleanValue() : CookieManager.allowFileSchemeCookies();
    }

    @Override // com.meituan.mtwebkit.MTCookieManager
    public final void setAcceptFileSchemeCookiesImpl(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc78869c9ad12299718346668d5bb13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc78869c9ad12299718346668d5bb13");
        } else {
            CookieManager.setAcceptFileSchemeCookies(z);
        }
    }
}
