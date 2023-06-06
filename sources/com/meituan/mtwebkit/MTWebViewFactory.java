package com.meituan.mtwebkit;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.mtwebkit.internal.a;
import com.meituan.mtwebkit.internal.b;
import com.meituan.mtwebkit.internal.e;
import com.meituan.mtwebkit.internal.h;
import com.meituan.mtwebkit.internal.i;
import com.meituan.mtwebkit.internal.l;
import com.meituan.mtwebkit.internal.m;
import com.meituan.mtwebkit.internal.process.MultiProcessManager;
import com.meituan.mtwebkit.internal.reporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MTWebViewFactory {
    public static final String DIRECTORY_SUFFIX_FOR_MTWEBVIEW = "mt_webview";
    private static final String TAG = "MTWebViewFactory";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String sDataDirectorySuffix;
    private static volatile Boolean sMultiProcessEnabled;
    private static MTWebViewFactoryProvider sProviderInstance;
    private static boolean sWebViewDisabled;
    private static Boolean sWebViewSupported;
    private static final Object sProviderLock = new Object();
    private static AtomicBoolean sIsRealPreload = new AtomicBoolean(false);

    private static boolean isWebViewSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6691075dd0971d24e62450fa32467917", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6691075dd0971d24e62450fa32467917")).booleanValue();
        }
        if (sWebViewSupported == null) {
            sWebViewSupported = Boolean.TRUE;
        }
        return sWebViewSupported.booleanValue();
    }

    public static void disableWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f3f78732afe01f563d81321200238b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f3f78732afe01f563d81321200238b5");
            return;
        }
        synchronized (sProviderLock) {
            if (sProviderInstance != null) {
                throw new IllegalStateException("Can't disable WebView: WebView already initialized");
            }
            sWebViewDisabled = true;
        }
    }

    public static void setDataDirectorySuffix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d8644f777a4d13f629feefaf49cb4ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d8644f777a4d13f629feefaf49cb4ef");
            return;
        }
        synchronized (sProviderLock) {
            if (sProviderInstance != null) {
                throw new IllegalStateException("Can't set data directory suffix: WebView already initialized");
            }
            if (str.indexOf(File.separatorChar) >= 0) {
                throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
            }
            sDataDirectorySuffix = str;
        }
    }

    public static String getDataDirectorySuffix() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d574a0a234e925c3199562773f1bc5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d574a0a234e925c3199562773f1bc5d");
        }
        synchronized (sProviderLock) {
            str = sDataDirectorySuffix;
        }
        return str;
    }

    public static String getMTWebViewDataDirectorySuffix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbb121f61fa9360f1525b7792990c7bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbb121f61fa9360f1525b7792990c7bd");
        }
        synchronized (sProviderLock) {
            if (TextUtils.isEmpty(sDataDirectorySuffix)) {
                return DIRECTORY_SUFFIX_FOR_MTWEBVIEW;
            }
            return "mt_webview_" + sDataDirectorySuffix;
        }
    }

    public static PackageInfo getLoadedPackageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3ad20274dc82b9eec74f16eab97ebc5", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3ad20274dc82b9eec74f16eab97ebc5") : m.a().b();
    }

    public static Context getWebViewContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4424a468c5fd735b0625909c25e7c9f", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4424a468c5fd735b0625909c25e7c9f") : m.a().c();
    }

    public static MTWebViewFactoryProvider getProvider() {
        MTWebViewFactoryProvider mTWebViewFactoryProvider;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b41cb6bfdc695380a42edd5598669314", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewFactoryProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b41cb6bfdc695380a42edd5598669314");
        }
        synchronized (sProviderLock) {
            if (sWebViewDisabled) {
                throw new IllegalStateException("WebView.disableWebView() was called: WebView is disabled");
            }
        }
        MTWebViewFactoryProvider e = m.a().e();
        synchronized (sProviderLock) {
            if (sProviderInstance != e) {
                StringBuilder sb = new StringBuilder("sProviderInstance");
                sb.append(sProviderInstance == null ? "为null" : "不为null");
                sb.append(", provider赋值给sProviderInstance");
                e.c(TAG, sb.toString());
                sProviderInstance = e;
            }
            mTWebViewFactoryProvider = sProviderInstance;
        }
        return mTWebViewFactoryProvider;
    }

    public static void preload(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "346369321ee583ec79f035badb7ef599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "346369321ee583ec79f035badb7ef599");
        } else if (sIsRealPreload.compareAndSet(false, true)) {
            synchronized (sProviderLock) {
                if (sWebViewDisabled) {
                    throw new IllegalStateException("WebView.disableWebView() was called: WebView is disabled");
                }
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m.a().f();
                e.c(TAG, "预加载完成, status: " + l.c());
                c.a(l.c(), SystemClock.elapsedRealtime() - elapsedRealtime, i);
            } catch (Throwable th) {
                i.a(th);
            }
        }
    }

    public static boolean isMultiProcessEnabled() {
        boolean booleanValue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e2dcf7c9f237985fd542273da074b22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e2dcf7c9f237985fd542273da074b22")).booleanValue();
        }
        synchronized (sProviderLock) {
            if (sMultiProcessEnabled == null) {
                sMultiProcessEnabled = Boolean.valueOf(getMultiProcessEnableStatus());
                e.c(TAG, "渲染进程状态：" + sMultiProcessEnabled);
            }
            booleanValue = sMultiProcessEnabled.booleanValue();
        }
        return booleanValue;
    }

    private static boolean getMultiProcessEnableStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c67bfd7dc760cbf191d1692a572358c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c67bfd7dc760cbf191d1692a572358c9")).booleanValue();
        }
        if (h.C() && b.a() && !h.i()) {
            return MultiProcessManager.a(getWebViewContext().getClassLoader());
        }
        return false;
    }

    public static void downgradeToInProcessRender() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65e34aa4a93c3238cd15d25804c07874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65e34aa4a93c3238cd15d25804c07874");
            return;
        }
        synchronized (sProviderLock) {
            MTCookieManager.getInstance().flush();
            sMultiProcessEnabled = Boolean.FALSE;
            Application a = a.a();
            boolean delete = new File(a.getDir("webview_" + getMTWebViewDataDirectorySuffix(), 0), "webview_data.lock").delete();
            StringBuilder sb = new StringBuilder("渲染进程状态关闭，MTWebView文件锁删除");
            sb.append(delete ? "成功" : "失败");
            e.c(TAG, sb.toString());
            m.a().h();
        }
    }
}
