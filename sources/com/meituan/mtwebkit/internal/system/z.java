package com.meituan.mtwebkit.internal.system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.print.PrintDocumentAdapter;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.meituan.mtwebkit.MTDownloadListener;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebBackForwardList;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.mtwebkit.MTWebSettings;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewClient;
import com.meituan.mtwebkit.MTWebViewProvider;
import com.meituan.mtwebkit.MTWebViewRenderProcess;
import com.meituan.mtwebkit.MTWebViewRenderProcessClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z implements MTWebViewProvider, MTWebViewProvider.ScrollDelegate, MTWebViewProvider.ViewDelegate {
    public static ChangeQuickRedirect a;
    private static final MTWebViewClient f = new MTWebViewClient();
    public WebView b;
    public MTWebView c;
    private MTWebView.PrivateAccess d;
    private MTWebViewClient e;
    private MTWebViewRenderProcessClient g;
    private MTWebChromeClient h;
    private WeakHashMap<WebViewRenderProcess, MTWebViewRenderProcess> i;

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final View findFocus(View view) {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final View findHierarchyView(String str, int i) {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int getContentWidth() {
        return 0;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final Handler getHandler(Handler handler) {
        return handler;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebViewProvider.ScrollDelegate getScrollDelegate() {
        return this;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final String getTouchIconUrl() {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebViewProvider.ViewDelegate getViewDelegate() {
        return this;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int getVisibleTitleHeight() {
        return 0;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean isPaused() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void notifyFindDialogDismissed() {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onAttachedToWindow() {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onCheckIsTextEditor() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onDetachedFromWindow() {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onDragEvent(DragEvent dragEvent) {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onDraw(Canvas canvas) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onFinishTemporaryDetach() {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onMeasure(int i, int i2) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onMovedToDisplay(int i, Configuration configuration) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onProvideContentCaptureStructure(Object obj, int i) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onStartTemporaryDetach() {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onVisibilityChanged(View view, int i) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onWindowVisibilityChanged(int i) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void preDispatchDraw(Canvas canvas) {
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean restorePicture(Bundle bundle, File file) {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean savePicture(Bundle bundle, File file) {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final /* synthetic */ Object getTextClassifier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197096df5efda796e6c5dc0c3db7068c", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextClassifier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197096df5efda796e6c5dc0c3db7068c");
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return this.b.getTextClassifier();
        }
        return null;
    }

    public z(MTWebView mTWebView, MTWebView.PrivateAccess privateAccess) {
        Object[] objArr = {mTWebView, privateAccess};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9232b8152801aac0deea9cec88e043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9232b8152801aac0deea9cec88e043");
            return;
        }
        this.i = new WeakHashMap<>();
        this.c = mTWebView;
        this.d = privateAccess;
        com.meituan.mtwebkit.internal.reporter.d a2 = com.meituan.mtwebkit.internal.reporter.d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mtwebkit.internal.reporter.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a74fc6f243d5cef81c07461451eb88c7", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.mtwebkit.internal.reporter.d dVar = (com.meituan.mtwebkit.internal.reporter.d) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a74fc6f243d5cef81c07461451eb88c7");
        } else {
            a2.d.h = SystemClock.elapsedRealtime();
        }
        this.b = new q(mTWebView, privateAccess);
        com.meituan.mtwebkit.internal.reporter.d a3 = com.meituan.mtwebkit.internal.reporter.d.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mtwebkit.internal.reporter.d.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "5690f4db8672587aeae0a9d0a82e8014", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.mtwebkit.internal.reporter.d dVar2 = (com.meituan.mtwebkit.internal.reporter.d) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "5690f4db8672587aeae0a9d0a82e8014");
        } else {
            a3.d.i = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void init(Map<String, Object> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ca970c78b4f48d71977123223603de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ca970c78b4f48d71977123223603de");
        } else {
            this.c.addView(this.b);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setHorizontalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5202a239840f93ca261ba5952d16680f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5202a239840f93ca261ba5952d16680f");
        } else {
            this.b.setHorizontalScrollbarOverlay(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setVerticalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3d2d4e8f936ce619a98da9051e6c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3d2d4e8f936ce619a98da9051e6c72");
        } else {
            this.b.setVerticalScrollbarOverlay(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean overlayHorizontalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4a4bcb99153cae5b749cef374633ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4a4bcb99153cae5b749cef374633ff")).booleanValue() : this.b.overlayHorizontalScrollbar();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean overlayVerticalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73db1d97120ca6733282bf6c4dc1712f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73db1d97120ca6733282bf6c4dc1712f")).booleanValue() : this.b.overlayVerticalScrollbar();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final SslCertificate getCertificate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc568cb74ded5cf1ebff55620db41fc", RobustBitConfig.DEFAULT_VALUE) ? (SslCertificate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc568cb74ded5cf1ebff55620db41fc") : this.b.getCertificate();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setCertificate(SslCertificate sslCertificate) {
        Object[] objArr = {sslCertificate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be1800af8b71948337336b64f87fc97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be1800af8b71948337336b64f87fc97");
        } else {
            this.b.setCertificate(sslCertificate);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void savePassword(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a441693c67b00713980983450665d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a441693c67b00713980983450665d5");
        } else {
            this.b.savePassword(str, str2, str3);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd78ae31e284a7a4177dc7f3e99a81f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd78ae31e284a7a4177dc7f3e99a81f7");
        } else {
            this.b.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final String[] getHttpAuthUsernamePassword(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccaf5b1c4067d43167afa1fc166dc030", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccaf5b1c4067d43167afa1fc166dc030") : this.b.getHttpAuthUsernamePassword(str, str2);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b6454df5364d72d73d79969378331a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b6454df5364d72d73d79969378331a");
        } else {
            this.b.destroy();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setNetworkAvailable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdea10778e3003d8b8b2778d7a1530cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdea10778e3003d8b8b2778d7a1530cd");
        } else {
            this.b.setNetworkAvailable(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebBackForwardList saveState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19326b62dcc4a42b50ecdfee58522009", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19326b62dcc4a42b50ecdfee58522009");
        }
        WebBackForwardList saveState = this.b.saveState(bundle);
        if (saveState == null) {
            return null;
        }
        return new j(saveState);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebBackForwardList restoreState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207613a7031da94fd68a89e12e076542", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207613a7031da94fd68a89e12e076542");
        }
        WebBackForwardList restoreState = this.b.restoreState(bundle);
        if (restoreState == null) {
            return null;
        }
        return new j(restoreState);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c17e21289a364bab4094143dc378c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c17e21289a364bab4094143dc378c1");
        } else {
            this.b.loadUrl(str, map);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b75d9b57a16b9aecbf9e03c57390458b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b75d9b57a16b9aecbf9e03c57390458b");
        } else {
            this.b.loadUrl(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void postUrl(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d8bb36ea1ac78c3320b8bb2e11a045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d8bb36ea1ac78c3320b8bb2e11a045");
        } else {
            this.b.postUrl(str, bArr);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void loadData(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e051be795b2215672cfbbeb9574c4a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e051be795b2215672cfbbeb9574c4a0e");
        } else {
            this.b.loadData(str, str2, str3);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9790a072c4da3dd1bb030549cb904e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9790a072c4da3dd1bb030549cb904e5d");
        } else {
            this.b.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void evaluateJavaScript(String str, final MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12dbc41c56829ca89370032ae350895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12dbc41c56829ca89370032ae350895");
        } else {
            this.b.evaluateJavascript(str, mTValueCallback == null ? null : new ValueCallback<String>() { // from class: com.meituan.mtwebkit.internal.system.z.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "336eeba8c57a7ce2a5e3505c13bfec99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "336eeba8c57a7ce2a5e3505c13bfec99");
                    } else {
                        mTValueCallback.onReceiveValue(str3);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void saveWebArchive(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6c4329b5b6ecaefb474ebba614aec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6c4329b5b6ecaefb474ebba614aec8");
        } else {
            this.b.saveWebArchive(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void saveWebArchive(String str, boolean z, final MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418ab4f7610474c78be04da13229b45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418ab4f7610474c78be04da13229b45f");
        } else {
            this.b.saveWebArchive(str, z, mTValueCallback == null ? null : new ValueCallback<String>() { // from class: com.meituan.mtwebkit.internal.system.z.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ee996f8c47d93ebe590d4e8c5b8b30e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ee996f8c47d93ebe590d4e8c5b8b30e");
                    } else {
                        mTValueCallback.onReceiveValue(str3);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3516c7498d6210e4745bf9ad8e75629f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3516c7498d6210e4745bf9ad8e75629f");
        } else {
            this.b.stopLoading();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54103838a3fb6fa4f930f3c48d9ce9bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54103838a3fb6fa4f930f3c48d9ce9bb");
        } else {
            this.b.reload();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfadd59df3dd5ed22b1803119c36fe3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfadd59df3dd5ed22b1803119c36fe3c")).booleanValue() : this.b.canGoBack();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba9c2f93c76ddf51516eca9cb7231c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba9c2f93c76ddf51516eca9cb7231c5");
        } else {
            this.b.goBack();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean canGoForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f22ef6715d945d1700b50b1761d541a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f22ef6715d945d1700b50b1761d541a")).booleanValue() : this.b.canGoForward();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void goForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f83b1287440ba0229b7117e3b9989bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f83b1287440ba0229b7117e3b9989bce");
        } else {
            this.b.goForward();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean canGoBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73f8ff2bee8fca4419fce841599584a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73f8ff2bee8fca4419fce841599584a")).booleanValue() : this.b.canGoBackOrForward(i);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void goBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f1e84ac17314274698c05f1e7967ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f1e84ac17314274698c05f1e7967ee");
        } else {
            this.b.goBackOrForward(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean isPrivateBrowsingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a93f2fe4cc70b153da0aa93f7c456f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a93f2fe4cc70b153da0aa93f7c456f8")).booleanValue() : this.b.isPrivateBrowsingEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean pageUp(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed14072be2e1b3f881a1b8ce21962b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed14072be2e1b3f881a1b8ce21962b3")).booleanValue() : this.b.pageUp(z);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean pageDown(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f68613c06da2169704deb0d02513f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f68613c06da2169704deb0d02513f2")).booleanValue() : this.b.pageDown(z);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void insertVisualStateCallback(long j, final MTWebView.VisualStateCallback visualStateCallback) {
        Object[] objArr = {new Long(j), visualStateCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3116d0d21da5b5e5dd277e7fb7e331d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3116d0d21da5b5e5dd277e7fb7e331d7");
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.b.postVisualStateCallback(j, visualStateCallback == null ? null : new WebView.VisualStateCallback() { // from class: com.meituan.mtwebkit.internal.system.z.3
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebView.VisualStateCallback
                public final void onComplete(long j2) {
                    Object[] objArr2 = {new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8062c59e62f9fbb0292cff36134f6801", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8062c59e62f9fbb0292cff36134f6801");
                    } else if (visualStateCallback != null) {
                        visualStateCallback.onComplete(j2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921261aef9665add5ec625cab70c8877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921261aef9665add5ec625cab70c8877");
        } else {
            this.b.clearView();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final Picture capturePicture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a007e7cd5339af6aae0890f0e189626c", RobustBitConfig.DEFAULT_VALUE) ? (Picture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a007e7cd5339af6aae0890f0e189626c") : this.b.capturePicture();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aa171b320777d05a0f80d2a698bbb3", RobustBitConfig.DEFAULT_VALUE) ? (PrintDocumentAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aa171b320777d05a0f80d2a698bbb3") : this.b.createPrintDocumentAdapter(str);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1574dc468d43ea812217f499dbeddc", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1574dc468d43ea812217f499dbeddc")).floatValue() : this.b.getScale();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setInitialScale(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66537211c9465150f4dee3d9c2a3f233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66537211c9465150f4dee3d9c2a3f233");
        } else {
            this.b.setInitialScale(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void invokeZoomPicker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be64b6197c29df7d5106978aae895f95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be64b6197c29df7d5106978aae895f95");
        } else {
            this.b.invokeZoomPicker();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebView.HitTestResult getHitTestResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90fc93697e661246ba630136416a7f63", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebView.HitTestResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90fc93697e661246ba630136416a7f63");
        }
        WebView.HitTestResult hitTestResult = this.b.getHitTestResult();
        MTWebView.HitTestResult hitTestResult2 = new MTWebView.HitTestResult();
        hitTestResult2.setType(hitTestResult.getType());
        hitTestResult2.setExtra(hitTestResult.getExtra());
        return hitTestResult2;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void requestFocusNodeHref(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dac23403b2b00a2535d025e9460365b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dac23403b2b00a2535d025e9460365b");
        } else {
            this.b.requestFocusNodeHref(message);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void requestImageRef(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030747aad03b72b9c9894b11b6f1209b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030747aad03b72b9c9894b11b6f1209b");
        } else {
            this.b.requestImageRef(message);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11483f9dc84b994f9f28baef96a8d490", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11483f9dc84b994f9f28baef96a8d490") : this.b.getUrl();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final String getOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e3c8dcf12585db1e00aec826f9b7b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e3c8dcf12585db1e00aec826f9b7b5") : this.b.getOriginalUrl();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc9728cd25a151a83ae3897b0b9fb9e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc9728cd25a151a83ae3897b0b9fb9e") : this.b.getTitle();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final Bitmap getFavicon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaa38359eb569eaf73e5edb8fab7e8d", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaa38359eb569eaf73e5edb8fab7e8d") : this.b.getFavicon();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int getProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad334e9749525a480dabcd58731abe42", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad334e9749525a480dabcd58731abe42")).intValue() : this.b.getProgress();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957ed26081900d98160f3dfddcaeef6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957ed26081900d98160f3dfddcaeef6d")).intValue() : this.b.getContentHeight();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void pauseTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbed2dbf9528f003f3483a8207d88fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbed2dbf9528f003f3483a8207d88fac");
        } else {
            this.b.pauseTimers();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void resumeTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357c7bb57806b798a30288b520abc42d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357c7bb57806b798a30288b520abc42d");
        } else {
            this.b.resumeTimers();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909be796376774124dcd09f4964dbe34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909be796376774124dcd09f4964dbe34");
        } else {
            this.b.onPause();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e6e0a90ea16c95ed225ae0fbd4c453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e6e0a90ea16c95ed225ae0fbd4c453");
        } else {
            this.b.onResume();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void freeMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07c0d2ab50607350fce1219943151ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07c0d2ab50607350fce1219943151ad");
        } else {
            this.b.freeMemory();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearCache(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66871b07023ae478a5ac5d75bde5503e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66871b07023ae478a5ac5d75bde5503e");
        } else {
            this.b.clearCache(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f55207bc1891d10cc2badfebc4d55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f55207bc1891d10cc2badfebc4d55c");
        } else {
            this.b.clearFormData();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6796a5299ab75e9b58ad123b4c7a40f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6796a5299ab75e9b58ad123b4c7a40f2");
        } else {
            this.b.clearHistory();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearSslPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390c23f5c154282851aaa5921e1d6190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390c23f5c154282851aaa5921e1d6190");
        } else {
            this.b.clearSslPreferences();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebBackForwardList copyBackForwardList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014ea3040b3da0395944eb4d0bdc7467", RobustBitConfig.DEFAULT_VALUE) ? (MTWebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014ea3040b3da0395944eb4d0bdc7467") : new j(this.b.copyBackForwardList());
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setFindListener(final MTWebView.FindListener findListener) {
        Object[] objArr = {findListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29376fe9d76d72ddbf6a6d593f20b164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29376fe9d76d72ddbf6a6d593f20b164");
        } else {
            this.b.setFindListener(new WebView.FindListener() { // from class: com.meituan.mtwebkit.internal.system.z.4
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebView.FindListener
                public final void onFindResultReceived(int i, int i2, boolean z) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00aa7a7f90b436672f11db3f95fc4b4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00aa7a7f90b436672f11db3f95fc4b4a");
                    } else {
                        findListener.onFindResultReceived(i, i2, z);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void findNext(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a92ba16646d7cedb4563c1ddcbcb7de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a92ba16646d7cedb4563c1ddcbcb7de");
        } else {
            this.b.findNext(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int findAll(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92226ac9361c684d3c992d68902c41e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92226ac9361c684d3c992d68902c41e6")).intValue() : this.b.findAll(str);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void findAllAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a17845102b13f630f5f44a7fffa0a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a17845102b13f630f5f44a7fffa0a1e");
        } else {
            this.b.findAllAsync(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean showFindDialog(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5558031a4d5e846211342a45932eb24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5558031a4d5e846211342a45932eb24")).booleanValue() : this.b.showFindDialog(str, z);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void clearMatches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dab4bcdf036847f1035cb41f3b1cbaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dab4bcdf036847f1035cb41f3b1cbaa");
        } else {
            this.b.clearMatches();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void documentHasImages(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c09f2b308a5051fb5bec1981e0791e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c09f2b308a5051fb5bec1981e0791e");
        } else {
            this.b.documentHasImages(message);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setWebViewClient(MTWebViewClient mTWebViewClient) {
        Object[] objArr = {mTWebViewClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de965d47e601826412ddb2b68062fff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de965d47e601826412ddb2b68062fff5");
            return;
        }
        this.e = mTWebViewClient;
        this.b.setWebViewClient(mTWebViewClient == null ? null : new w(this.c, mTWebViewClient));
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebViewClient getWebViewClient() {
        return this.e == null ? f : this.e;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebViewRenderProcess getWebViewRenderProcess() {
        WebViewRenderProcess webViewRenderProcess;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36528d075a483cc562d5744bc857ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewRenderProcess) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36528d075a483cc562d5744bc857ce2");
        }
        if (Build.VERSION.SDK_INT < 29 || (webViewRenderProcess = this.b.getWebViewRenderProcess()) == null) {
            return null;
        }
        MTWebViewRenderProcess mTWebViewRenderProcess = this.i.get(webViewRenderProcess);
        if (mTWebViewRenderProcess == null) {
            s sVar = new s(this.b.getWebViewRenderProcess());
            this.i.put(webViewRenderProcess, sVar);
            return sVar;
        }
        return mTWebViewRenderProcess;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setWebViewRenderProcessClient(Executor executor, MTWebViewRenderProcessClient mTWebViewRenderProcessClient) {
        Object[] objArr = {executor, mTWebViewRenderProcessClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5c654a1c6528e66bda26a02f9fe59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5c654a1c6528e66bda26a02f9fe59d");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.g = mTWebViewRenderProcessClient;
            this.b.setWebViewRenderProcessClient(executor, mTWebViewRenderProcessClient == null ? null : new x(this.c, mTWebViewRenderProcessClient));
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.g;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setDownloadListener(final MTDownloadListener mTDownloadListener) {
        Object[] objArr = {mTDownloadListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c23d5e76b33d957a862b19d8616f6e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c23d5e76b33d957a862b19d8616f6e0");
        } else {
            this.b.setDownloadListener(mTDownloadListener == null ? null : new DownloadListener() { // from class: com.meituan.mtwebkit.internal.system.z.5
                public static ChangeQuickRedirect a;

                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    Object[] objArr2 = {str, str2, str3, str4, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "739420b67c24ec2a2c4e9066e693003e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "739420b67c24ec2a2c4e9066e693003e");
                    } else {
                        mTDownloadListener.onDownloadStart(str, str2, str3, str4, j);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setWebChromeClient(MTWebChromeClient mTWebChromeClient) {
        Object[] objArr = {mTWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba305a89b0aabea7329054a0689d4ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba305a89b0aabea7329054a0689d4ab9");
            return;
        }
        this.h = mTWebChromeClient;
        this.b.setWebChromeClient(mTWebChromeClient == null ? null : new u(this.c, mTWebChromeClient));
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebChromeClient getWebChromeClient() {
        return this.h;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setPictureListener(final MTWebView.PictureListener pictureListener) {
        Object[] objArr = {pictureListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6d920cc30d5985f2667dfb9413788b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6d920cc30d5985f2667dfb9413788b");
        } else {
            this.b.setPictureListener(pictureListener == null ? null : new WebView.PictureListener() { // from class: com.meituan.mtwebkit.internal.system.z.6
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebView.PictureListener
                public final void onNewPicture(WebView webView, Picture picture) {
                    Object[] objArr2 = {webView, picture};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9970a081426a1e364262dceadb8c22f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9970a081426a1e364262dceadb8c22f");
                    } else {
                        pictureListener.onNewPicture(z.this.c, picture);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    @SuppressLint({"JavascriptInterface"})
    public final void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aabcd3657ea32ca651469e1024214b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aabcd3657ea32ca651469e1024214b1");
        } else {
            this.b.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void removeJavascriptInterface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a153c76b63cbd49a9a2e1a61b34baa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a153c76b63cbd49a9a2e1a61b34baa6");
        } else {
            this.b.removeJavascriptInterface(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final MTWebSettings getSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c523609b233a7e55cc1cf75cbb8ca9de", RobustBitConfig.DEFAULT_VALUE) ? (MTWebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c523609b233a7e55cc1cf75cbb8ca9de") : new o(this.b);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setMapTrackballToArrowKeys(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0de991708bcc86b697031402e7dd08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0de991708bcc86b697031402e7dd08");
        } else {
            this.b.setMapTrackballToArrowKeys(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void flingScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d95e967472e38ffb1667549e055a3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d95e967472e38ffb1667549e055a3b4");
        } else {
            this.b.flingScroll(i, i2);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final View getZoomControls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306b5ab9ac3876f32830691a94aa30cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306b5ab9ac3876f32830691a94aa30cc");
        }
        if (this.b.getSettings().supportZoom()) {
            return new View(this.b.getContext());
        }
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean canZoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a8c729b72bbebd342b8cce96476932", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a8c729b72bbebd342b8cce96476932")).booleanValue() : this.b.canZoomIn();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean canZoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1848af7ede189e5952c291d8cfe86fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1848af7ede189e5952c291d8cfe86fb")).booleanValue() : this.b.canZoomOut();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean zoomBy(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6333d11e6e24c1fb5f1355a5b198bb8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6333d11e6e24c1fb5f1355a5b198bb8f")).booleanValue();
        }
        this.b.zoomBy(f2);
        return true;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ec7a06a12f77c3b02d23b899ddc314", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ec7a06a12f77c3b02d23b899ddc314")).booleanValue() : this.b.zoomIn();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc437c59a4764d782486f964417a25c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc437c59a4764d782486f964417a25c")).booleanValue() : this.b.zoomOut();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setRendererPriorityPolicy(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992ff12962a7fb2a7049e05dce34fa40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992ff12962a7fb2a7049e05dce34fa40");
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.b.setRendererPriorityPolicy(i, z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final int getRendererRequestedPriority() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a4636d2ce187259c6c784fc6606fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a4636d2ce187259c6c784fc6606fb8")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.getRendererRequestedPriority();
        }
        return 0;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final boolean getRendererPriorityWaivedWhenNotVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c38c815ffb024f3e463951d2fc836e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c38c815ffb024f3e463951d2fc836e6")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.getRendererPriorityWaivedWhenNotVisible();
        }
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider
    public final void setTextClassifier(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b74597f2c3179d8e11da9512c069b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b74597f2c3179d8e11da9512c069b7");
        } else if (Build.VERSION.SDK_INT >= 27) {
            this.b.setTextClassifier((TextClassifier) obj);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onProvideVirtualStructure(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b0f7e29618efcf90aa63337cc5d315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b0f7e29618efcf90aa63337cc5d315");
        } else {
            this.d.super_onProvideVirtualStructure(obj);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void onProvideAutofillVirtualStructure(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52471de3956e143373ef4dc8fafdcab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52471de3956e143373ef4dc8fafdcab");
        } else {
            this.d.super_onProvideAutofillVirtualStructure(obj, i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54de901e0d05eb53d80aeea4682e995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54de901e0d05eb53d80aeea4682e995");
        } else {
            this.d.super_autofill(sparseArray);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean isVisibleToUserForAutofill(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8962d9328d3e49db36018afcf53de19", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8962d9328d3e49db36018afcf53de19")).booleanValue() : this.d.super_isVisibleToUserForAutofill(i);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void setOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8920b21543db7535832abdf19f1dcf51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8920b21543db7535832abdf19f1dcf51");
        } else {
            this.b.setOverScrollMode(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void setScrollBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eae4fae37e126fdbec9f15f34258ae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eae4fae37e126fdbec9f15f34258ae8");
        } else {
            this.b.setScrollBarStyle(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7e4e02d56e82b4d18ae441dc6bab72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7e4e02d56e82b4d18ae441dc6bab72");
            return;
        }
        this.d.super_setLayoutParams(layoutParams);
        this.b.setLayoutParams(this.b.getLayoutParams());
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean performLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36754c6e1dbb16a9eddabb05e3fc814c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36754c6e1dbb16a9eddabb05e3fc814c")).booleanValue() : this.d.super_performLongClick();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9436172b0c82e03cad71803fa2478603", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9436172b0c82e03cad71803fa2478603")).booleanValue() : this.d.super_onKeyDown(i, keyEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c616f24d34d67939546ada2f679d64a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c616f24d34d67939546ada2f679d64a")).booleanValue() : this.d.super_onKeyUp(i, keyEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22dc6f3c5e0f11718b10f1f3acbb25d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22dc6f3c5e0f11718b10f1f3acbb25d6")).booleanValue() : this.d.super_dispatchKeyEvent(keyEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd30b07de2afed78c12726afd8426062", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd30b07de2afed78c12726afd8426062")).booleanValue() : this.b.onTouchEvent(motionEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd32fca0b0baaaa2067c9eb27141132e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd32fca0b0baaaa2067c9eb27141132e")).booleanValue() : this.d.super_onHoverEvent(motionEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9948d4aaf7ba74e8d00a80749133bc60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9948d4aaf7ba74e8d00a80749133bc60")).booleanValue() : this.d.super_onGenericMotionEvent(motionEvent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean requestFocus(int i, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdee65158b8b0b54e4a498d331258a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdee65158b8b0b54e4a498d331258a2")).booleanValue() : this.b.requestFocus(i, rect);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a5e6c2a6e5fe4228257ee23fbc4c9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a5e6c2a6e5fe4228257ee23fbc4c9c")).booleanValue() : this.b.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff86854277ae787c8b2568fb72a3ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff86854277ae787c8b2568fb72a3ca4");
        } else {
            this.b.setBackgroundColor(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void setLayerType(int i, Paint paint) {
        Object[] objArr = {Integer.valueOf(i), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c281c92fb8814e386d66df5cd5916ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c281c92fb8814e386d66df5cd5916ad");
        } else {
            this.b.setLayerType(i, paint);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ViewDelegate
    public final void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5be8e66bd85a5a26a691c710090d50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5be8e66bd85a5a26a691c710090d50");
        } else {
            this.b.scrollTo(i, i2);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final int computeHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a91deb8aef1b9c036803a94c4056e2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a91deb8aef1b9c036803a94c4056e2")).intValue() : ((Integer) com.meituan.mtwebkit.internal.d.a(this.b).a("computeHorizontalScrollRange", new Object[0]).b).intValue();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final int computeHorizontalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8a90f199e83ad13ba5c3f80cc7074b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8a90f199e83ad13ba5c3f80cc7074b")).intValue() : ((Integer) com.meituan.mtwebkit.internal.d.a(this.b).a("computeHorizontalScrollOffset", new Object[0]).b).intValue();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final int computeVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b44285f9f4c6be66e0d8f64c5b80081", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b44285f9f4c6be66e0d8f64c5b80081")).intValue() : ((Integer) com.meituan.mtwebkit.internal.d.a(this.b).a("computeVerticalScrollRange", new Object[0]).b).intValue();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final int computeVerticalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68e1814140e73d12ca0241f85c1b307", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68e1814140e73d12ca0241f85c1b307")).intValue() : ((Integer) com.meituan.mtwebkit.internal.d.a(this.b).a("computeVerticalScrollOffset", new Object[0]).b).intValue();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final int computeVerticalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cd7257a7dcfeaf04167d07915a0743", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cd7257a7dcfeaf04167d07915a0743")).intValue() : ((Integer) com.meituan.mtwebkit.internal.d.a(this.b).a("computeVerticalScrollExtent", new Object[0]).b).intValue();
    }

    @Override // com.meituan.mtwebkit.MTWebViewProvider.ScrollDelegate
    public final void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b4bb6a47807f99b0402c8be703003b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b4bb6a47807f99b0402c8be703003b");
        } else {
            this.d.super_computeScroll();
        }
    }
}
