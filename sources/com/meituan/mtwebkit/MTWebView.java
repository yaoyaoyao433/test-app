package com.meituan.mtwebkit;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import android.os.SystemClock;
import android.print.PrintDocumentAdapter;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.FrameLayout;
import com.meituan.mtwebkit.internal.e;
import com.meituan.mtwebkit.internal.f;
import com.meituan.mtwebkit.internal.l;
import com.meituan.mtwebkit.internal.m;
import com.meituan.mtwebkit.internal.process.MultiProcessManager;
import com.meituan.mtwebkit.internal.reporter.c;
import com.meituan.mtwebkit.internal.reporter.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebView extends FrameLayout implements ViewGroup.OnHierarchyChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final String LOGTAG = "MTWebView";
    public static final int RENDERER_PRIORITY_BOUND = 1;
    public static final int RENDERER_PRIORITY_IMPORTANT = 2;
    public static final int RENDERER_PRIORITY_WAIVED = 0;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean sEnforceThreadChecking = false;
    private FindListenerDistributor mFindListener;
    private MTWebViewProvider mProvider;
    private final Looper mWebViewThread;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface FindListener {
        void onFindResultReceived(int i, int i2, boolean z);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface PictureListener {
        @Deprecated
        void onNewPicture(MTWebView mTWebView, Picture picture);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class VisualStateCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract void onComplete(long j);
    }

    @Deprecated
    public static void disablePlatformNotifications() {
    }

    @Deprecated
    public static void enablePlatformNotifications() {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    @Deprecated
    public void onChildViewAdded(View view, View view2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    @Deprecated
    public void onChildViewRemoved(View view, View view2) {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    @Deprecated
    public void onGlobalFocusChanged(View view, View view2) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Deprecated
    public boolean overlayHorizontalScrollbar() {
        return true;
    }

    @Deprecated
    public boolean overlayVerticalScrollbar() {
        return false;
    }

    @Deprecated
    public void setHorizontalScrollbarOverlay(boolean z) {
    }

    @Deprecated
    public void setVerticalScrollbarOverlay(boolean z) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class WebViewTransport {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MTWebView mWebview;

        public WebViewTransport() {
        }

        public synchronized void setWebView(MTWebView mTWebView) {
            this.mWebview = mTWebView;
        }

        public synchronized MTWebView getWebView() {
            return this.mWebview;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class HitTestResult {
        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;
        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mExtra;
        private int mType;

        public HitTestResult() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4881538cd469594b1dd90eb3e13b9298", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4881538cd469594b1dd90eb3e13b9298");
            } else {
                this.mType = 0;
            }
        }

        public void setType(int i) {
            this.mType = i;
        }

        public void setExtra(String str) {
            this.mExtra = str;
        }

        public int getType() {
            return this.mType;
        }

        public String getExtra() {
            return this.mExtra;
        }
    }

    @Deprecated
    public MTWebView(Context context) {
        this(context, (AttributeSet) null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "494b155eb02acfb535a73b5410154415", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "494b155eb02acfb535a73b5410154415");
        }
    }

    public MTWebView(@NonNull String str, Context context) {
        this(context, null, Resources.getSystem().getIdentifier("webViewStyle", "attr", "android"), 0, null, false, str);
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b82879175549e8762057e77fcb39509d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b82879175549e8762057e77fcb39509d");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Resources.getSystem().getIdentifier("webViewStyle", "attr", "android"));
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6908435315ffa3a3815e0774da9c2c2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6908435315ffa3a3815e0774da9c2c2d");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1184e7f5a5c504dd2ec0e23d723f594e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1184e7f5a5c504dd2ec0e23d723f594e");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null, false);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adff63bfa02edc8fca8169134ac71a05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adff63bfa02edc8fca8169134ac71a05");
        }
    }

    @Deprecated
    public MTWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, 0, null, z);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc08c4acdc72ab053404c3aa5d6512a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc08c4acdc72ab053404c3aa5d6512a");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet, int i, Map<String, Object> map, boolean z) {
        this(context, attributeSet, i, 0, map, z);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b86700990cecd09a7bb9057bddea52b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b86700990cecd09a7bb9057bddea52b");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet, int i, int i2, Map<String, Object> map, boolean z) {
        this(context, attributeSet, i, i2, map, z, "default");
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2), map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b550f6afe11830d921499d306042c791", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b550f6afe11830d921499d306042c791");
        }
    }

    public MTWebView(Context context, AttributeSet attributeSet, int i, int i2, Map<String, Object> map, boolean z, @NonNull String str) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2), map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "989ccbcdb2eb26345f84c45a42342683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "989ccbcdb2eb26345f84c45a42342683");
            return;
        }
        this.mWebViewThread = Looper.myLooper();
        if (Build.VERSION.SDK_INT >= 26 && getImportantForAutofill() == 0) {
            setImportantForAutofill(1);
        }
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (this.mWebViewThread == null) {
            throw new RuntimeException("WebView cannot be initialized on a thread that has no Looper.");
        }
        sEnforceThreadChecking = context.getApplicationInfo().targetSdkVersion >= 18;
        checkThread();
        ensureProviderCreated();
        d a = d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "4f8c7f7f7d3d318165f89fd7613b56a4", RobustBitConfig.DEFAULT_VALUE)) {
            d dVar = (d) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "4f8c7f7f7d3d318165f89fd7613b56a4");
        } else {
            a.d.g = SystemClock.elapsedRealtime();
        }
        this.mProvider.init(map, z);
        d a2 = d.a();
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "2e6ae305b3155502e5c5621566e4e0f7", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (d) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "2e6ae305b3155502e5c5621566e4e0f7");
        } else {
            a2.d.d = SystemClock.elapsedRealtime();
            PackageInfo e = l.e();
            if (e != null) {
                a2.d.j = e.versionCode;
            }
            a2.d.k = l.c();
            a2.d.m = str;
            e.c("MTWebViewStartUpInstance", "MTWebView完成初始化, status: " + a2.d.k + ", businessName: " + a2.d.m);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = d.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "fd9407379b8ac5e4d4b8f21e755d2558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "fd9407379b8ac5e4d4b8f21e755d2558");
        } else {
            synchronized (d.class) {
                d.b = false;
                d.c = null;
            }
            c.a(a2.d);
            a2.d = null;
        }
        MultiProcessManager.a(this);
    }

    @Deprecated
    public int getVisibleTitleHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39aeed89a683dcfc2efd1c2e89a03d77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39aeed89a683dcfc2efd1c2e89a03d77")).intValue();
        }
        checkThread();
        return this.mProvider.getVisibleTitleHeight();
    }

    public SslCertificate getCertificate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4059c0d8541aa353f46651494cbc2470", RobustBitConfig.DEFAULT_VALUE)) {
            return (SslCertificate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4059c0d8541aa353f46651494cbc2470");
        }
        checkThread();
        return this.mProvider.getCertificate();
    }

    @Deprecated
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60596c2fcc31d3a6a49c2fc69c1132c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60596c2fcc31d3a6a49c2fc69c1132c5");
            return;
        }
        checkThread();
        this.mProvider.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    @Deprecated
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daccd911c05424764680184e86ed4901", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daccd911c05424764680184e86ed4901");
        }
        checkThread();
        return this.mProvider.getHttpAuthUsernamePassword(str, str2);
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af286629895f95cfb8beaf0bd8d1a43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af286629895f95cfb8beaf0bd8d1a43d");
            return;
        }
        MultiProcessManager.b(this);
        checkThread();
        this.mProvider.destroy();
    }

    public static void freeMemoryForTests() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0304ffafe62083e9b1ea287262f7e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0304ffafe62083e9b1ea287262f7e05");
        } else {
            getFactory().getStatics().freeMemoryForTests();
        }
    }

    public void setNetworkAvailable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed6fa64c9f2a4dbe19b9fa1e125eb533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed6fa64c9f2a4dbe19b9fa1e125eb533");
            return;
        }
        checkThread();
        this.mProvider.setNetworkAvailable(z);
    }

    public MTWebBackForwardList saveState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1fd2a97076e132f4e3fe34ec35ae11", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1fd2a97076e132f4e3fe34ec35ae11");
        }
        checkThread();
        return this.mProvider.saveState(bundle);
    }

    public MTWebBackForwardList restoreState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97026d4fc1a735d22a16cf7672e4fb01", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97026d4fc1a735d22a16cf7672e4fb01");
        }
        checkThread();
        return this.mProvider.restoreState(bundle);
    }

    public void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2869efbb3365643c39e9476c106616c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2869efbb3365643c39e9476c106616c3");
            return;
        }
        checkThread();
        this.mProvider.loadUrl(str, map);
    }

    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aa615f71fd81dd7bc6bc9f26d2e1852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aa615f71fd81dd7bc6bc9f26d2e1852");
            return;
        }
        checkThread();
        this.mProvider.loadUrl(str);
    }

    public void postUrl(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad44d6ed8639911d6127c59904e21b09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad44d6ed8639911d6127c59904e21b09");
            return;
        }
        checkThread();
        if (MTURLUtil.isNetworkUrl(str)) {
            this.mProvider.postUrl(str, bArr);
        } else {
            this.mProvider.loadUrl(str);
        }
    }

    public void loadData(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e28c5c70afd85c962babb24e486eacdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e28c5c70afd85c962babb24e486eacdc");
            return;
        }
        checkThread();
        this.mProvider.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae28970884bf2d604fd31e051a2f567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae28970884bf2d604fd31e051a2f567");
            return;
        }
        checkThread();
        this.mProvider.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void evaluateJavascript(String str, MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c780063758362d256ef0687388803805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c780063758362d256ef0687388803805");
            return;
        }
        checkThread();
        this.mProvider.evaluateJavaScript(str, mTValueCallback);
    }

    public void saveWebArchive(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a398a9ddc20b02b0df573120948205a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a398a9ddc20b02b0df573120948205a0");
            return;
        }
        checkThread();
        this.mProvider.saveWebArchive(str);
    }

    public void saveWebArchive(String str, boolean z, MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b318c94d74b8f05646dc8703d7ebcab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b318c94d74b8f05646dc8703d7ebcab5");
            return;
        }
        checkThread();
        this.mProvider.saveWebArchive(str, z, mTValueCallback);
    }

    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c53e32e73d5de18c9851092349a0e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c53e32e73d5de18c9851092349a0e88");
            return;
        }
        checkThread();
        this.mProvider.stopLoading();
    }

    public void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "293fdf0188495376e9e2870ba51a25cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "293fdf0188495376e9e2870ba51a25cd");
            return;
        }
        checkThread();
        this.mProvider.reload();
    }

    public boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e4b6f74096cb99c9c7851a79c339de8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e4b6f74096cb99c9c7851a79c339de8")).booleanValue();
        }
        checkThread();
        return this.mProvider.canGoBack();
    }

    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94bf6cf2d088832a11f6d3189d2d196e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94bf6cf2d088832a11f6d3189d2d196e");
            return;
        }
        checkThread();
        this.mProvider.goBack();
    }

    public boolean canGoForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cba31634d26be43839b4799f89d9139", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cba31634d26be43839b4799f89d9139")).booleanValue();
        }
        checkThread();
        return this.mProvider.canGoForward();
    }

    public void goForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fc600fb2dbeab2597e0bc096a128c1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fc600fb2dbeab2597e0bc096a128c1b");
            return;
        }
        checkThread();
        this.mProvider.goForward();
    }

    public boolean canGoBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dc5d4c885660039ce63d9f1ac9d9d78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dc5d4c885660039ce63d9f1ac9d9d78")).booleanValue();
        }
        checkThread();
        return this.mProvider.canGoBackOrForward(i);
    }

    public void goBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "308eb9ec1475f64317de2caf54c734c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "308eb9ec1475f64317de2caf54c734c2");
            return;
        }
        checkThread();
        this.mProvider.goBackOrForward(i);
    }

    public boolean isPrivateBrowsingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1aec6837f4427693973c82d9e2bb7f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1aec6837f4427693973c82d9e2bb7f0")).booleanValue();
        }
        checkThread();
        return this.mProvider.isPrivateBrowsingEnabled();
    }

    public boolean pageUp(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba58e3f3a9aa53fea0bad5d3229916bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba58e3f3a9aa53fea0bad5d3229916bc")).booleanValue();
        }
        checkThread();
        return this.mProvider.pageUp(z);
    }

    public boolean pageDown(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6dfe48b0cad63ad3bef975559f0dd95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6dfe48b0cad63ad3bef975559f0dd95")).booleanValue();
        }
        checkThread();
        return this.mProvider.pageDown(z);
    }

    public void postVisualStateCallback(long j, VisualStateCallback visualStateCallback) {
        Object[] objArr = {new Long(j), visualStateCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a9ddd2ceaca7bddabc20c68fd62b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a9ddd2ceaca7bddabc20c68fd62b65");
            return;
        }
        checkThread();
        this.mProvider.insertVisualStateCallback(j, visualStateCallback);
    }

    @Deprecated
    public void clearView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c36544b65a0af68ae090454f3ddc05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c36544b65a0af68ae090454f3ddc05");
            return;
        }
        checkThread();
        this.mProvider.clearView();
    }

    @Deprecated
    public Picture capturePicture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2760f0cf7cfe11a2a9e6bcacd0988ed9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Picture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2760f0cf7cfe11a2a9e6bcacd0988ed9");
        }
        checkThread();
        return this.mProvider.capturePicture();
    }

    @Deprecated
    public PrintDocumentAdapter createPrintDocumentAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aa89758b5acf59df651585ab9a1b676", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrintDocumentAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aa89758b5acf59df651585ab9a1b676");
        }
        checkThread();
        return this.mProvider.createPrintDocumentAdapter("default");
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "522f62f9f8691eedc55bbb25e9aa59a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrintDocumentAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "522f62f9f8691eedc55bbb25e9aa59a0");
        }
        checkThread();
        return this.mProvider.createPrintDocumentAdapter(str);
    }

    @ViewDebug.ExportedProperty(category = "webview")
    @Deprecated
    public float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09c2d8b86200ccac2ae930123f748bea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09c2d8b86200ccac2ae930123f748bea")).floatValue();
        }
        checkThread();
        return this.mProvider.getScale();
    }

    public void setInitialScale(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e01855cef32fe0586ad092f35969fc72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e01855cef32fe0586ad092f35969fc72");
            return;
        }
        checkThread();
        this.mProvider.setInitialScale(i);
    }

    public void invokeZoomPicker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d30c5fb6a253809584507dcbc3111955", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d30c5fb6a253809584507dcbc3111955");
            return;
        }
        checkThread();
        this.mProvider.invokeZoomPicker();
    }

    public HitTestResult getHitTestResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb62c192eac79ba3580d32103e424cad", RobustBitConfig.DEFAULT_VALUE)) {
            return (HitTestResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb62c192eac79ba3580d32103e424cad");
        }
        checkThread();
        return this.mProvider.getHitTestResult();
    }

    public void requestFocusNodeHref(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8831e86dad6453d9e1bc05dd11fd2d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8831e86dad6453d9e1bc05dd11fd2d35");
            return;
        }
        checkThread();
        this.mProvider.requestFocusNodeHref(message);
    }

    public void requestImageRef(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bb74f9bebb88770f3a0482e339b932b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bb74f9bebb88770f3a0482e339b932b");
            return;
        }
        checkThread();
        this.mProvider.requestImageRef(message);
    }

    @ViewDebug.ExportedProperty(category = "webview")
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da171d8b77296dab8584128c7000cc45", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da171d8b77296dab8584128c7000cc45");
        }
        checkThread();
        return this.mProvider.getUrl();
    }

    @ViewDebug.ExportedProperty(category = "webview")
    public String getOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ec640799e616d765a29b5e788a1d3ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ec640799e616d765a29b5e788a1d3ea");
        }
        checkThread();
        return this.mProvider.getOriginalUrl();
    }

    @ViewDebug.ExportedProperty(category = "webview")
    public String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "592a43885ce392ec7cfd3539e10306c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "592a43885ce392ec7cfd3539e10306c1");
        }
        checkThread();
        return this.mProvider.getTitle();
    }

    public Bitmap getFavicon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "294269e84e64a8ba55fa7713a607fab6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "294269e84e64a8ba55fa7713a607fab6");
        }
        checkThread();
        return this.mProvider.getFavicon();
    }

    public String getTouchIconUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36b1e48bff0daad2fb9342cd834db180", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36b1e48bff0daad2fb9342cd834db180") : this.mProvider.getTouchIconUrl();
    }

    public int getProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f21ff05f3907e82008eb0751b80dfea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f21ff05f3907e82008eb0751b80dfea")).intValue();
        }
        checkThread();
        return this.mProvider.getProgress();
    }

    @ViewDebug.ExportedProperty(category = "webview")
    public int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "369d96a9b3db9d4b8e76e9a7db91735c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "369d96a9b3db9d4b8e76e9a7db91735c")).intValue();
        }
        checkThread();
        return this.mProvider.getContentHeight();
    }

    @ViewDebug.ExportedProperty(category = "webview")
    public int getContentWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e84724c6dc72bc916ac3313d5a31c0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e84724c6dc72bc916ac3313d5a31c0")).intValue() : this.mProvider.getContentWidth();
    }

    public void pauseTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "094b33adbb7254b24485b2c7ee98232a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "094b33adbb7254b24485b2c7ee98232a");
            return;
        }
        checkThread();
        this.mProvider.pauseTimers();
    }

    public void resumeTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab18a0337cfab3191eb5818382cf5c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab18a0337cfab3191eb5818382cf5c58");
            return;
        }
        checkThread();
        this.mProvider.resumeTimers();
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b07c7e6fa55774eeb0d7fdbcb559fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b07c7e6fa55774eeb0d7fdbcb559fa4");
            return;
        }
        checkThread();
        this.mProvider.onPause();
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b60c38a40d02b144f1a2ab4ccbbfb6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b60c38a40d02b144f1a2ab4ccbbfb6e");
            return;
        }
        checkThread();
        this.mProvider.onResume();
    }

    public boolean isPaused() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40c4acf4ba012c22f11125df3ab78acc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40c4acf4ba012c22f11125df3ab78acc")).booleanValue() : this.mProvider.isPaused();
    }

    public void clearCache(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da07c779d54902bcb23565680c898d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da07c779d54902bcb23565680c898d71");
            return;
        }
        checkThread();
        this.mProvider.clearCache(z);
    }

    public void clearFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eb508b3639649b2864d1b30e91daf30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eb508b3639649b2864d1b30e91daf30");
            return;
        }
        checkThread();
        this.mProvider.clearFormData();
    }

    public void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dec25a23c851db2475a3e59435dae97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dec25a23c851db2475a3e59435dae97");
            return;
        }
        checkThread();
        this.mProvider.clearHistory();
    }

    public void clearSslPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0987a26447662ab26aa5b1741f633601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0987a26447662ab26aa5b1741f633601");
            return;
        }
        checkThread();
        this.mProvider.clearSslPreferences();
    }

    public static void clearClientCertPreferences(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6acef1a3b12217c90fcf21f2bdb11ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6acef1a3b12217c90fcf21f2bdb11ace");
        } else {
            getFactory().getStatics().clearClientCertPreferences(runnable);
        }
    }

    public static void startSafeBrowsing(Context context, MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {context, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7da0b2dd8fe834157dcad878fe3cba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7da0b2dd8fe834157dcad878fe3cba3");
        } else {
            getFactory().getStatics().initSafeBrowsing(context, mTValueCallback);
        }
    }

    public static void setSafeBrowsingWhitelist(List<String> list, MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {list, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2decd11e61f568eeb662320b68f82397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2decd11e61f568eeb662320b68f82397");
        } else {
            getFactory().getStatics().setSafeBrowsingWhitelist(list, mTValueCallback);
        }
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59c74d62d0f4cd187faee29e477e2ec5", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59c74d62d0f4cd187faee29e477e2ec5") : getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
    }

    public MTWebBackForwardList copyBackForwardList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a385741b76118cec7d0820900a20a7a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a385741b76118cec7d0820900a20a7a6");
        }
        checkThread();
        return this.mProvider.copyBackForwardList();
    }

    public void setFindListener(FindListener findListener) {
        Object[] objArr = {findListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d3ee4e4641915253daa7c7f01570a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d3ee4e4641915253daa7c7f01570a6");
            return;
        }
        checkThread();
        setupFindListenerIfNeeded();
        this.mFindListener.mUserFindListener = findListener;
    }

    public void findNext(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35bfa793c1b245c5e86cd575e1b1e0ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35bfa793c1b245c5e86cd575e1b1e0ac");
            return;
        }
        checkThread();
        this.mProvider.findNext(z);
    }

    @Deprecated
    public int findAll(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5aac04c55ffcfdd79fa773d2a53e3164", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5aac04c55ffcfdd79fa773d2a53e3164")).intValue();
        }
        checkThread();
        StrictMode.noteSlowCall("findAll blocks UI: prefer findAllAsync");
        return this.mProvider.findAll(str);
    }

    public void findAllAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c40923343fbecd7a79d60c1013660f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c40923343fbecd7a79d60c1013660f4");
            return;
        }
        checkThread();
        this.mProvider.findAllAsync(str);
    }

    @Deprecated
    public boolean showFindDialog(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cacec70df08af95cd33a19c5b7696d4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cacec70df08af95cd33a19c5b7696d4d")).booleanValue();
        }
        checkThread();
        return this.mProvider.showFindDialog(str, z);
    }

    public static String findAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0843ca6efe5916d2b1ec8ea68cc4b9d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0843ca6efe5916d2b1ec8ea68cc4b9d9") : getFactory().getStatics().findAddress(str);
    }

    public static void enableSlowWholeDocumentDraw() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b31850ee07629ae80867a6e7a2998be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b31850ee07629ae80867a6e7a2998be");
        } else {
            getFactory().getStatics().enableSlowWholeDocumentDraw();
        }
    }

    public void clearMatches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91794048ad09f6d1df709f4fc72d1667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91794048ad09f6d1df709f4fc72d1667");
            return;
        }
        checkThread();
        this.mProvider.clearMatches();
    }

    public void documentHasImages(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7bf5cd0692bb5df6be4b1d4f9460eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7bf5cd0692bb5df6be4b1d4f9460eb0");
            return;
        }
        checkThread();
        this.mProvider.documentHasImages(message);
    }

    public void setWebViewClient(MTWebViewClient mTWebViewClient) {
        Object[] objArr = {mTWebViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41a951ccc25595dc4a3dab39700c4a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41a951ccc25595dc4a3dab39700c4a2d");
            return;
        }
        checkThread();
        this.mProvider.setWebViewClient(mTWebViewClient);
    }

    public MTWebViewClient getWebViewClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cd7428bf8136dee22d12028e73131c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cd7428bf8136dee22d12028e73131c");
        }
        checkThread();
        return this.mProvider.getWebViewClient();
    }

    public MTWebViewRenderProcess getWebViewRenderProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038e919f8d5f1500a941c2945c9401fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewRenderProcess) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038e919f8d5f1500a941c2945c9401fd");
        }
        checkThread();
        return this.mProvider.getWebViewRenderProcess();
    }

    public void setWebViewRenderProcessClient(Executor executor, MTWebViewRenderProcessClient mTWebViewRenderProcessClient) {
        Object[] objArr = {executor, mTWebViewRenderProcessClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de73bd26d27003dd380022db1f7dfc75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de73bd26d27003dd380022db1f7dfc75");
            return;
        }
        checkThread();
        this.mProvider.setWebViewRenderProcessClient(executor, mTWebViewRenderProcessClient);
    }

    public void setWebViewRenderProcessClient(MTWebViewRenderProcessClient mTWebViewRenderProcessClient) {
        Object[] objArr = {mTWebViewRenderProcessClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db71f4f543691dea11edebd4a39fecba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db71f4f543691dea11edebd4a39fecba");
            return;
        }
        checkThread();
        this.mProvider.setWebViewRenderProcessClient(null, mTWebViewRenderProcessClient);
    }

    public MTWebViewRenderProcessClient getWebViewRenderProcessClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fb31456abd87c3aeb98597614a1211a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewRenderProcessClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fb31456abd87c3aeb98597614a1211a");
        }
        checkThread();
        return this.mProvider.getWebViewRenderProcessClient();
    }

    public void setDownloadListener(MTDownloadListener mTDownloadListener) {
        Object[] objArr = {mTDownloadListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f167e360384ce839a427debc4ac761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f167e360384ce839a427debc4ac761");
            return;
        }
        checkThread();
        this.mProvider.setDownloadListener(mTDownloadListener);
    }

    public void setWebChromeClient(MTWebChromeClient mTWebChromeClient) {
        Object[] objArr = {mTWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0ace99e290173d587b981ac426f4982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0ace99e290173d587b981ac426f4982");
            return;
        }
        checkThread();
        this.mProvider.setWebChromeClient(mTWebChromeClient);
    }

    public MTWebChromeClient getWebChromeClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0d63f5bacb708b48cc32a40ad14e38", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebChromeClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0d63f5bacb708b48cc32a40ad14e38");
        }
        checkThread();
        return this.mProvider.getWebChromeClient();
    }

    @Deprecated
    public void setPictureListener(PictureListener pictureListener) {
        Object[] objArr = {pictureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c879f3a787bd56dc46dabe5923234a8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c879f3a787bd56dc46dabe5923234a8c");
            return;
        }
        checkThread();
        this.mProvider.setPictureListener(pictureListener);
    }

    public void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "633d07e52c1ab3e44f84e6e6bbcc1107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "633d07e52c1ab3e44f84e6e6bbcc1107");
            return;
        }
        checkThread();
        this.mProvider.addJavascriptInterface(obj, str);
    }

    public void removeJavascriptInterface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39d86df8af1057cd1d6ffa2282c62081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39d86df8af1057cd1d6ffa2282c62081");
            return;
        }
        checkThread();
        this.mProvider.removeJavascriptInterface(str);
    }

    public MTWebSettings getSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eee04d48d8b1f7319554fb49fe002d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eee04d48d8b1f7319554fb49fe002d2");
        }
        checkThread();
        return this.mProvider.getSettings();
    }

    public static void setWebContentsDebuggingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5af70e1f720abdc0857590f1c0745b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5af70e1f720abdc0857590f1c0745b11");
        } else {
            getFactory().getStatics().setWebContentsDebuggingEnabled(z);
        }
    }

    public static void setDataDirectorySuffix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5038c0f108563bb110a13ca7d3253683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5038c0f108563bb110a13ca7d3253683");
        } else {
            MTWebViewFactory.setDataDirectorySuffix(str);
        }
    }

    public static void disableWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "695d4edb237c1ef75f56617cd492d5e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "695d4edb237c1ef75f56617cd492d5e1");
        } else {
            MTWebViewFactory.disableWebView();
        }
    }

    @Deprecated
    public void emulateShiftHeld() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af2150dd1987c9d2f9fa38e2dd1aa4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af2150dd1987c9d2f9fa38e2dd1aa4db");
        } else {
            checkThread();
        }
    }

    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d16967f36a5b8b3bef647740448e739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d16967f36a5b8b3bef647740448e739");
            return;
        }
        checkThread();
        this.mProvider.setMapTrackballToArrowKeys(z);
    }

    public void flingScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5dbbb54d44db9baaa6bbb456af3640a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5dbbb54d44db9baaa6bbb456af3640a");
            return;
        }
        checkThread();
        this.mProvider.flingScroll(i, i2);
    }

    @Deprecated
    public View getZoomControls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9c5c89ba541ae20e44917f75119e7a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9c5c89ba541ae20e44917f75119e7a5");
        }
        checkThread();
        return this.mProvider.getZoomControls();
    }

    @Deprecated
    public boolean canZoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ce09ef52462f114920a14fad884ca2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ce09ef52462f114920a14fad884ca2")).booleanValue();
        }
        checkThread();
        return this.mProvider.canZoomIn();
    }

    @Deprecated
    public boolean canZoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "637ff2fa510d13219d3ce37fe538f534", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "637ff2fa510d13219d3ce37fe538f534")).booleanValue();
        }
        checkThread();
        return this.mProvider.canZoomOut();
    }

    public void zoomBy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec2538a8257b3dd43c95a39d208b8e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec2538a8257b3dd43c95a39d208b8e93");
            return;
        }
        checkThread();
        double d = f;
        if (d < 0.01d) {
            throw new IllegalArgumentException("zoomFactor must be greater than 0.01.");
        }
        if (d > 100.0d) {
            throw new IllegalArgumentException("zoomFactor must be less than 100.");
        }
        this.mProvider.zoomBy(f);
    }

    public boolean zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "655d7549c2871a10cf0e27eb7eccd8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "655d7549c2871a10cf0e27eb7eccd8b8")).booleanValue();
        }
        checkThread();
        return this.mProvider.zoomIn();
    }

    public boolean zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde058611a61552eb293d55e6e8ab08e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde058611a61552eb293d55e6e8ab08e")).booleanValue();
        }
        checkThread();
        return this.mProvider.zoomOut();
    }

    @Deprecated
    public void debugDump() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7fd4c18fedfba3f09e20b3710099b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7fd4c18fedfba3f09e20b3710099b2a");
        } else {
            checkThread();
        }
    }

    public View findHierarchyView(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e6d962b360516bafb28bbcec2305a96", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e6d962b360516bafb28bbcec2305a96") : this.mProvider.findHierarchyView(str, i);
    }

    public void setRendererPriorityPolicy(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "548117567b7c689e1e6e51814a69027e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "548117567b7c689e1e6e51814a69027e");
        } else {
            this.mProvider.setRendererPriorityPolicy(i, z);
        }
    }

    public int getRendererRequestedPriority() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5c5548ca55cfa2170a8ec47ccda8307", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5c5548ca55cfa2170a8ec47ccda8307")).intValue() : this.mProvider.getRendererRequestedPriority();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f69cfbca119f6dc221bcb3689d71d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f69cfbca119f6dc221bcb3689d71d8")).booleanValue() : this.mProvider.getRendererPriorityWaivedWhenNotVisible();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        Object[] objArr = {textClassifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83cce97d8dbfc391160c97c7a75f69bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83cce97d8dbfc391160c97c7a75f69bc");
        } else {
            this.mProvider.setTextClassifier(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "855b0b86369ccb4aa0c32950e08bbcc6", RobustBitConfig.DEFAULT_VALUE) ? (TextClassifier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "855b0b86369ccb4aa0c32950e08bbcc6") : (TextClassifier) this.mProvider.getTextClassifier();
    }

    public static ClassLoader getWebViewClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e11f0081fd12eb0a00d5eaf7e8c7ef5d", RobustBitConfig.DEFAULT_VALUE) ? (ClassLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e11f0081fd12eb0a00d5eaf7e8c7ef5d") : getFactory().getWebViewClassLoader();
    }

    public Looper getWebViewLooper() {
        return this.mWebViewThread;
    }

    public MTWebViewProvider getWebViewProvider() {
        return this.mProvider;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class PrivateAccess {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PrivateAccess() {
            Object[] objArr = {MTWebView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77d590141e7a9dfa3c9fb51087a5f6fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77d590141e7a9dfa3c9fb51087a5f6fe");
            }
        }

        public int super_getScrollBarStyle() {
            return MTWebView.super.getScrollBarStyle();
        }

        public void super_scrollTo(int i, int i2) {
            MTWebView.super.scrollTo(i, i2);
        }

        public void super_computeScroll() {
            MTWebView.super.computeScroll();
        }

        public boolean super_onHoverEvent(MotionEvent motionEvent) {
            return MTWebView.super.onHoverEvent(motionEvent);
        }

        public boolean super_performLongClick() {
            return MTWebView.super.performLongClick();
        }

        public boolean super_dispatchKeyEvent(KeyEvent keyEvent) {
            return MTWebView.super.dispatchKeyEvent(keyEvent);
        }

        public boolean super_onGenericMotionEvent(MotionEvent motionEvent) {
            return MTWebView.super.onGenericMotionEvent(motionEvent);
        }

        public boolean super_requestFocus(int i, Rect rect) {
            return MTWebView.super.requestFocus(i, rect);
        }

        public void super_setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            MTWebView.super.setLayoutParams(layoutParams);
        }

        public void overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "759a469da51b9e839819b45a7b93bafe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "759a469da51b9e839819b45a7b93bafe");
            } else {
                MTWebView.this.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        }

        public void awakenScrollBars(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5a4f5a27e24834067fa4b0f790d0771", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5a4f5a27e24834067fa4b0f790d0771");
            } else {
                MTWebView.this.awakenScrollBars(i);
            }
        }

        public void awakenScrollBars(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be81215ea99e3c54c3067c85fa05c5b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be81215ea99e3c54c3067c85fa05c5b8");
            } else {
                MTWebView.this.awakenScrollBars(i, z);
            }
        }

        public void setMeasuredDimension(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cbb823378278a386f0945d2e093836d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cbb823378278a386f0945d2e093836d");
            } else {
                MTWebView.this.setMeasuredDimension(i, i2);
            }
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ba7ea0caead5466fa63b6fd0446423e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ba7ea0caead5466fa63b6fd0446423e");
            } else {
                MTWebView.this.onScrollChanged(i, i2, i3, i4);
            }
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7debdd5042b64fe801017407db2150c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7debdd5042b64fe801017407db2150c2");
            } else {
                MTWebView.this.onOverScrolled(i, i2, z, z2);
            }
        }

        public int getHorizontalScrollbarHeight() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec0925840de0efb7ee7e82d13155c85f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec0925840de0efb7ee7e82d13155c85f")).intValue() : MTWebView.this.getHorizontalScrollbarHeight();
        }

        public void super_onProvideVirtualStructure(Object obj) {
            if (Build.VERSION.SDK_INT >= 23) {
                MTWebView.super.onProvideVirtualStructure((ViewStructure) obj);
            }
        }

        public void super_onProvideAutofillVirtualStructure(Object obj, int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                MTWebView.super.onProvideAutofillVirtualStructure((ViewStructure) obj, i);
            }
        }

        public void super_autofill(SparseArray<AutofillValue> sparseArray) {
            if (Build.VERSION.SDK_INT >= 26) {
                MTWebView.super.autofill(sparseArray);
            }
        }

        public boolean super_isVisibleToUserForAutofill(int i) {
            if (Build.VERSION.SDK_INT >= 28) {
                return MTWebView.super.isVisibleToUserForAutofill(i);
            }
            return false;
        }

        public boolean super_onKeyDown(int i, KeyEvent keyEvent) {
            return MTWebView.super.onKeyDown(i, keyEvent);
        }

        public boolean super_onKeyUp(int i, KeyEvent keyEvent) {
            return MTWebView.super.onKeyUp(i, keyEvent);
        }

        public boolean super_onTouchEvent(MotionEvent motionEvent) {
            return MTWebView.super.onTouchEvent(motionEvent);
        }

        public int super_computeHorizontalScrollOffset() {
            return MTWebView.super.computeHorizontalScrollOffset();
        }

        public int super_computeVerticalScrollOffset() {
            return MTWebView.super.computeVerticalScrollOffset();
        }
    }

    public void setFindDialogFindListener(FindListener findListener) {
        Object[] objArr = {findListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "293800c2d9ebd05c4f1a9d7b9ff32998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "293800c2d9ebd05c4f1a9d7b9ff32998");
            return;
        }
        checkThread();
        setupFindListenerIfNeeded();
        this.mFindListener.mFindDialogFindListener = findListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class FindListenerDistributor implements FindListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private FindListener mFindDialogFindListener;
        private FindListener mUserFindListener;

        public FindListenerDistributor() {
            Object[] objArr = {MTWebView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e18a2e22ebdf71600b0f4dddc4a02e51", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e18a2e22ebdf71600b0f4dddc4a02e51");
            }
        }

        @Override // com.meituan.mtwebkit.MTWebView.FindListener
        public void onFindResultReceived(int i, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8fc76825648e29bcbbaa771a9123e48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8fc76825648e29bcbbaa771a9123e48");
                return;
            }
            if (this.mFindDialogFindListener != null) {
                this.mFindDialogFindListener.onFindResultReceived(i, i2, z);
            }
            if (this.mUserFindListener != null) {
                this.mUserFindListener.onFindResultReceived(i, i2, z);
            }
        }
    }

    private void setupFindListenerIfNeeded() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c7842511c21b09c411d3580f744ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c7842511c21b09c411d3580f744ef4");
        } else if (this.mFindListener == null) {
            this.mFindListener = new FindListenerDistributor();
            this.mProvider.setFindListener(this.mFindListener);
        }
    }

    private void ensureProviderCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53e180cc271e1575aa99da495e7de067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53e180cc271e1575aa99da495e7de067");
            return;
        }
        checkThread();
        if (this.mProvider == null) {
            d a = d.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "8e720c1bcfed3c65cef14e29e3621a0e", RobustBitConfig.DEFAULT_VALUE)) {
                d dVar = (d) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "8e720c1bcfed3c65cef14e29e3621a0e");
            } else {
                a.d.c = SystemClock.elapsedRealtime();
                a.d.a = d.b;
                a.d.b = m.a().g();
                a.d.l = f.a.a.b;
                e.c("MTWebViewStartUpInstance", "MTWebView开始初始化, firstFlag: " + d.b + ", isPreload: " + a.d.b);
            }
            MTWebViewFactoryProvider factory = getFactory();
            d a2 = d.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "fa5f2f102746bc4cd75fb06a32503b75", RobustBitConfig.DEFAULT_VALUE)) {
                d dVar2 = (d) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "fa5f2f102746bc4cd75fb06a32503b75");
            } else {
                a2.d.e = SystemClock.elapsedRealtime();
            }
            this.mProvider = factory.createWebView(this, new PrivateAccess());
            d a3 = d.a();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = d.a;
            if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect5, false, "7d3e7a619dc1a49c0592a988664083d7", RobustBitConfig.DEFAULT_VALUE)) {
                d dVar3 = (d) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect5, false, "7d3e7a619dc1a49c0592a988664083d7");
                return;
            }
            a3.d.f = SystemClock.elapsedRealtime();
        }
    }

    private static MTWebViewFactoryProvider getFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93ea1f0e8301c71fdbd29982494d9122", RobustBitConfig.DEFAULT_VALUE) ? (MTWebViewFactoryProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93ea1f0e8301c71fdbd29982494d9122") : MTWebViewFactory.getProvider();
    }

    private void checkThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c39c4573a9f3442eed3aa18e0f2773a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c39c4573a9f3442eed3aa18e0f2773a2");
        } else if (this.mWebViewThread == null || Looper.myLooper() == this.mWebViewThread) {
        } else {
            Throwable th = new Throwable("A MTWebView method was called on thread '" + Thread.currentThread().getName() + "'. All MTWebView methods must be called on the same thread. (Expected Looper " + this.mWebViewThread + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + CommonConstant.Symbol.BRACKET_RIGHT);
            Log.getStackTraceString(th);
            if (sEnforceThreadChecking) {
                throw new RuntimeException(th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26d73f9a5f3a9d0cef1c524421b09e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26d73f9a5f3a9d0cef1c524421b09e3");
            return;
        }
        super.onAttachedToWindow();
        this.mProvider.getViewDelegate().onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b060306866f5ee5ded432820ed573c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b060306866f5ee5ded432820ed573c48");
            return;
        }
        super.onDetachedFromWindow();
        this.mProvider.getViewDelegate().onDetachedFromWindow();
    }

    public void onMovedToDisplay(int i, Configuration configuration) {
        Object[] objArr = {Integer.valueOf(i), configuration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f26dd71c3a2661eeb2d0b2e45db6112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f26dd71c3a2661eeb2d0b2e45db6112");
        } else {
            this.mProvider.getViewDelegate().onMovedToDisplay(i, configuration);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d635125d59a9c91b08bc94e8e3ef031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d635125d59a9c91b08bc94e8e3ef031");
        } else {
            this.mProvider.getViewDelegate().setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b694256522cbcc62e3a2ecdb5b6aefbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b694256522cbcc62e3a2ecdb5b6aefbe");
            return;
        }
        super.setOverScrollMode(i);
        ensureProviderCreated();
        this.mProvider.getViewDelegate().setOverScrollMode(i);
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07f0e91784569e1ca214c33e97f96fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07f0e91784569e1ca214c33e97f96fa1");
            return;
        }
        this.mProvider.getViewDelegate().setScrollBarStyle(i);
        super.setScrollBarStyle(i);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce83ad48a1ca4aeb464b2d7fadef0480", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce83ad48a1ca4aeb464b2d7fadef0480")).intValue() : this.mProvider.getScrollDelegate().computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e011447962cbf939f280fd46fdb46307", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e011447962cbf939f280fd46fdb46307")).intValue() : this.mProvider.getScrollDelegate().computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a13d61d5910e44a1175242d3f5207585", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a13d61d5910e44a1175242d3f5207585")).intValue() : this.mProvider.getScrollDelegate().computeVerticalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eb741d992cb410b8e573fc811e6b05f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eb741d992cb410b8e573fc811e6b05f")).intValue() : this.mProvider.getScrollDelegate().computeVerticalScrollOffset();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8516cb03f29bf2fe4fd4d100297cd032", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8516cb03f29bf2fe4fd4d100297cd032")).intValue() : this.mProvider.getScrollDelegate().computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3faed457ad825dabb65e7afb546f6f3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3faed457ad825dabb65e7afb546f6f3a");
        } else {
            this.mProvider.getScrollDelegate().computeScroll();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c5bffd5a10933aaa97029f5dce534a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c5bffd5a10933aaa97029f5dce534a4")).booleanValue() : this.mProvider.getViewDelegate().onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19fc09b2d8b07fc78997a0eafde4083d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19fc09b2d8b07fc78997a0eafde4083d")).booleanValue() : this.mProvider.getViewDelegate().onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "277a36d5e46cd705452ffd8f8c1057ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "277a36d5e46cd705452ffd8f8c1057ca")).booleanValue() : this.mProvider.getViewDelegate().onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2530927d45eebf68e673fa40aa1590c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2530927d45eebf68e673fa40aa1590c9")).booleanValue() : this.mProvider.getViewDelegate().onTrackballEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5624d6a0da7d12d14d6c9da70b02e76e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5624d6a0da7d12d14d6c9da70b02e76e")).booleanValue() : this.mProvider.getViewDelegate().onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7533f5564ca78ad56cb992f3edfb67a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7533f5564ca78ad56cb992f3edfb67a1")).booleanValue() : this.mProvider.getViewDelegate().onKeyUp(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62f00ca90797e7e5f23d897a3cb9d075", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62f00ca90797e7e5f23d897a3cb9d075")).booleanValue() : this.mProvider.getViewDelegate().onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2f8f8cf53674e182dd943da5af4ee3", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccessibilityNodeProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2f8f8cf53674e182dd943da5af4ee3");
        }
        AccessibilityNodeProvider accessibilityNodeProvider = this.mProvider.getViewDelegate().getAccessibilityNodeProvider();
        return accessibilityNodeProvider == null ? super.getAccessibilityNodeProvider() : accessibilityNodeProvider;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @Deprecated
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f916f31e5d03bbaf9cd4c2f96abc6f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f916f31e5d03bbaf9cd4c2f96abc6f4")).booleanValue() : this.mProvider.getViewDelegate().shouldDelayChildPressedState();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993dd5a760008a5a53ba60e3bca528b8", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993dd5a760008a5a53ba60e3bca528b8") : MTWebView.class.getName();
    }

    @Override // android.view.View
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d95b0a8f383bccc02cbcafb922643c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d95b0a8f383bccc02cbcafb922643c");
        } else {
            this.mProvider.getViewDelegate().onProvideVirtualStructure(viewStructure);
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Object[] objArr = {viewStructure, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "640c6be4a8b991a746062eb94d27cfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "640c6be4a8b991a746062eb94d27cfef");
        } else {
            this.mProvider.getViewDelegate().onProvideAutofillVirtualStructure(viewStructure, i);
        }
    }

    @Override // android.view.View
    public void onProvideContentCaptureStructure(ViewStructure viewStructure, int i) {
        Object[] objArr = {viewStructure, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4ef346085e3a93c1329d90969786a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4ef346085e3a93c1329d90969786a2");
        } else {
            this.mProvider.getViewDelegate().onProvideContentCaptureStructure(viewStructure, i);
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cedc48b234ab3c58a0e1b8f8bc796b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cedc48b234ab3c58a0e1b8f8bc796b36");
        } else {
            this.mProvider.getViewDelegate().autofill(sparseArray);
        }
    }

    @Override // android.view.View
    public boolean isVisibleToUserForAutofill(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86b205aafcd4d6ba930a8d20b4fcb29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86b205aafcd4d6ba930a8d20b4fcb29")).booleanValue() : this.mProvider.getViewDelegate().isVisibleToUserForAutofill(i);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb5b08164c37f2cf99571ede55b8c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb5b08164c37f2cf99571ede55b8c2d");
        } else {
            this.mProvider.getViewDelegate().onOverScrolled(i, i2, z, z2);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5273ca7da9abe9e07e559abb4b3d2586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5273ca7da9abe9e07e559abb4b3d2586");
            return;
        }
        super.onWindowVisibilityChanged(i);
        this.mProvider.getViewDelegate().onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e974232fa2cbbd8bfee46749e87b1700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e974232fa2cbbd8bfee46749e87b1700");
        } else {
            this.mProvider.getViewDelegate().onDraw(canvas);
        }
    }

    @Override // android.view.View
    public boolean performLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95af1bfab26a895520ead8f73a0e1319", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95af1bfab26a895520ead8f73a0e1319")).booleanValue() : this.mProvider.getViewDelegate().performLongClick();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15a925928142c3a8b928b9aaf8e0c682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15a925928142c3a8b928b9aaf8e0c682");
        } else {
            this.mProvider.getViewDelegate().onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object[] objArr = {editorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eb4554fe742ad9a7eef25eab90ac1b7", RobustBitConfig.DEFAULT_VALUE) ? (InputConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eb4554fe742ad9a7eef25eab90ac1b7") : this.mProvider.getViewDelegate().onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Object[] objArr = {dragEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3c6b48c9840a4fa8459d9da81787c27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3c6b48c9840a4fa8459d9da81787c27")).booleanValue() : this.mProvider.getViewDelegate().onDragEvent(dragEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "490d7cf4eb163cdf534bdb1186fb2bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "490d7cf4eb163cdf534bdb1186fb2bcd");
            return;
        }
        super.onVisibilityChanged(view, i);
        ensureProviderCreated();
        this.mProvider.getViewDelegate().onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4426908f6465d2689cbeb7782d3c8460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4426908f6465d2689cbeb7782d3c8460");
            return;
        }
        this.mProvider.getViewDelegate().onWindowFocusChanged(z);
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b898a088f3a206c87ef56917aa5cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b898a088f3a206c87ef56917aa5cf5");
            return;
        }
        this.mProvider.getViewDelegate().onFocusChanged(z, i, rect);
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed930f129dde1c0793bc51023b2fc61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed930f129dde1c0793bc51023b2fc61");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mProvider.getViewDelegate().onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ce641aacb7f1aa5b72e72a03efdccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ce641aacb7f1aa5b72e72a03efdccf");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.mProvider.getViewDelegate().onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9394f3742aed92bfe3348e1cd8332ad1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9394f3742aed92bfe3348e1cd8332ad1")).booleanValue() : this.mProvider.getViewDelegate().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190e092c95573e2fda8b97eb1961c949", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190e092c95573e2fda8b97eb1961c949")).booleanValue() : this.mProvider.getViewDelegate().requestFocus(i, rect);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ff8659368294ae6a52e750d8c745aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ff8659368294ae6a52e750d8c745aa6");
            return;
        }
        super.onMeasure(i, i2);
        this.mProvider.getViewDelegate().onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa42414fa4eeff76cf8d47021e8aeb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa42414fa4eeff76cf8d47021e8aeb6")).booleanValue() : this.mProvider.getViewDelegate().requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "508ac4e26ca736456384551d8d47f059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "508ac4e26ca736456384551d8d47f059");
        } else {
            this.mProvider.getViewDelegate().setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        Object[] objArr = {Integer.valueOf(i), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e67395891fb5bc5a5544608fc0415b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e67395891fb5bc5a5544608fc0415b5");
            return;
        }
        super.setLayerType(i, paint);
        this.mProvider.getViewDelegate().setLayerType(i, paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e70721c7b037608d8d8f8d4286f7ab40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e70721c7b037608d8d8f8d4286f7ab40");
            return;
        }
        this.mProvider.getViewDelegate().preDispatchDraw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60830d123acb0d8a691291b994e696da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60830d123acb0d8a691291b994e696da");
            return;
        }
        super.onStartTemporaryDetach();
        this.mProvider.getViewDelegate().onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bed115d74a257772efc3f38b9fd1e8c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bed115d74a257772efc3f38b9fd1e8c1");
            return;
        }
        super.onFinishTemporaryDetach();
        this.mProvider.getViewDelegate().onFinishTemporaryDetach();
    }

    @Override // android.view.View
    public Handler getHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1373c99702bbec1c2b918792e8a3f2dd", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1373c99702bbec1c2b918792e8a3f2dd") : this.mProvider.getViewDelegate().getHandler(super.getHandler());
    }

    @Override // android.view.ViewGroup, android.view.View
    public View findFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af0024634ba70992da39ad358e6feb06", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af0024634ba70992da39ad358e6feb06") : this.mProvider.getViewDelegate().findFocus(super.findFocus());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f3b8bd0e22b262359829ac6a06ad95f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f3b8bd0e22b262359829ac6a06ad95f");
        } else {
            this.mProvider.getViewDelegate().onActivityResult(i, i2, intent);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0148510f0b47062f8eace7b4f05e95c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0148510f0b47062f8eace7b4f05e95c")).booleanValue() : this.mProvider.getViewDelegate().onCheckIsTextEditor();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "055ea0b5451763ebd3fa2aac8b3884ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "055ea0b5451763ebd3fa2aac8b3884ae");
            return;
        }
        super.scrollTo(i, i2);
        this.mProvider.getViewDelegate().scrollTo(i, i2);
    }
}
