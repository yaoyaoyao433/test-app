package com.sankuai.titans.base.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.utils.HitTestResult;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.utils.PictureListener;
import com.sankuai.titans.protocol.webcompat.IWebChromeClient;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.IWebViewClient;
import java.util.List;
import java.util.Map;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebKitWebView implements IWebView<WebView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IWebChromeClient chromeClient;
    private IWebViewClient client;
    private ActionMode.Callback mActionModeCallback;
    private final List<OnWebEventListener> onWebEventListeners;
    private final WebView webView;

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getKernel() {
        return TitansConstants.WebKernel.KERNEL_WEBKIT;
    }

    public WebKitWebView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1130bcbfde01d1e8de51e4e8b1d64fb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1130bcbfde01d1e8de51e4e8b1d64fb5");
        }
    }

    public WebKitWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Resources.getSystem().getIdentifier("webViewStyle", "attr", "android"));
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c085e00b924a6da6ca490b1bf55bceea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c085e00b924a6da6ca490b1bf55bceea");
        }
    }

    public WebKitWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9537a0fd1e06413c07d84ac45971eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9537a0fd1e06413c07d84ac45971eaa");
            return;
        }
        this.onWebEventListeners = new Vector();
        this.webView = new WebView(context, attributeSet, i) { // from class: com.sankuai.titans.base.webkit.WebKitWebView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.webkit.WebView, android.view.View
            public void onScrollChanged(int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a0ba08951a5a0b5ddbf026ee68c24cb8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a0ba08951a5a0b5ddbf026ee68c24cb8");
                    return;
                }
                super.onScrollChanged(i2, i3, i4, i5);
                WebKitWebView.this.notifyOnScrollChanged(i2, i3, i4, i5);
            }

            @Override // android.webkit.WebView, android.view.View
            public void onSizeChanged(int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "590f660fff610ca7f0375dd943c38755", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "590f660fff610ca7f0375dd943c38755");
                    return;
                }
                super.onSizeChanged(i2, i3, i4, i5);
                WebKitWebView.this.notifyOnSizeChanged(i2, i3, i4, i5);
            }

            @Override // android.view.View
            public ActionMode startActionMode(ActionMode.Callback callback) {
                Object[] objArr2 = {callback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d317bda5e05dc64806907c6319a3fa74", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ActionMode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d317bda5e05dc64806907c6319a3fa74");
                }
                if (WebKitWebView.this.mActionModeCallback != null) {
                    callback = WebKitWebView.this.mActionModeCallback;
                }
                return super.startActionMode(callback);
            }

            @Override // android.view.View
            public ActionMode startActionMode(ActionMode.Callback callback, int i2) {
                Object[] objArr2 = {callback, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b0f1d6e06fc939ad576dd00425794a9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ActionMode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b0f1d6e06fc939ad576dd00425794a9");
                }
                if (WebKitWebView.this.mActionModeCallback != null) {
                    callback = WebKitWebView.this.mActionModeCallback;
                }
                return super.startActionMode(callback, i2);
            }
        };
    }

    @RequiresApi(api = 21)
    public WebKitWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdd468674eea84a82c4005203da2a02f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdd468674eea84a82c4005203da2a02f");
            return;
        }
        this.onWebEventListeners = new Vector();
        this.webView = new WebView(context, attributeSet, i, i2) { // from class: com.sankuai.titans.base.webkit.WebKitWebView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.webkit.WebView, android.view.View
            public void onScrollChanged(int i3, int i4, int i5, int i6) {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ee0bfe062dd0caca99dee74e1ac694b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ee0bfe062dd0caca99dee74e1ac694b8");
                    return;
                }
                super.onScrollChanged(i3, i4, i5, i6);
                WebKitWebView.this.notifyOnScrollChanged(i3, i4, i5, i6);
            }

            @Override // android.webkit.WebView, android.view.View
            public void onSizeChanged(int i3, int i4, int i5, int i6) {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38453faa8eb7c1dcee0193a3daab34eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38453faa8eb7c1dcee0193a3daab34eb");
                    return;
                }
                super.onSizeChanged(i3, i4, i5, i6);
                WebKitWebView.this.notifyOnSizeChanged(i3, i4, i5, i6);
            }

            @Override // android.view.View
            public ActionMode startActionMode(ActionMode.Callback callback) {
                Object[] objArr2 = {callback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c06ccefd8f528bddac36d7225de292e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ActionMode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c06ccefd8f528bddac36d7225de292e");
                }
                if (WebKitWebView.this.mActionModeCallback != null) {
                    callback = WebKitWebView.this.mActionModeCallback;
                }
                return super.startActionMode(callback);
            }

            @Override // android.view.View
            public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
                Object[] objArr2 = {callback, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "347c9d10625cc78b3955279301789a35", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ActionMode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "347c9d10625cc78b3955279301789a35");
                }
                if (WebKitWebView.this.mActionModeCallback != null) {
                    callback = WebKitWebView.this.mActionModeCallback;
                }
                return super.startActionMode(callback, i3);
            }
        };
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebView get() {
        return this.webView;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setActionModeCallback(ActionMode.Callback callback) {
        this.mActionModeCallback = callback;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setAcceptThirdPartyCookies(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27cfda7bc0334d2e89b691951a47c652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27cfda7bc0334d2e89b691951a47c652");
        } else if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOnScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c23ce8d12da9af81ab63462976de87f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c23ce8d12da9af81ab63462976de87f");
            return;
        }
        List<OnWebEventListener> onWebEventListeners = getOnWebEventListeners();
        if (onWebEventListeners == null || onWebEventListeners.size() == 0) {
            return;
        }
        for (OnWebEventListener onWebEventListener : onWebEventListeners) {
            onWebEventListener.onWebViewScrollChanged(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOnSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f632e6b4001e5647637ece302c701b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f632e6b4001e5647637ece302c701b1");
            return;
        }
        List<OnWebEventListener> onWebEventListeners = getOnWebEventListeners();
        if (onWebEventListeners == null || onWebEventListeners.size() == 0) {
            return;
        }
        for (OnWebEventListener onWebEventListener : onWebEventListeners) {
            onWebEventListener.onWebViewSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public List<OnWebEventListener> getOnWebEventListeners() {
        return this.onWebEventListeners;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void registerWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0a9373fb5c20ee62b2aeb6bb6ff1c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0a9373fb5c20ee62b2aeb6bb6ff1c7");
        } else if (onWebEventListener == null || this.onWebEventListeners.contains(onWebEventListener)) {
        } else {
            this.onWebEventListeners.add(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void unregisterWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fe03d2b724d909f29231db736e28c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fe03d2b724d909f29231db736e28c84");
        } else if (onWebEventListener == null || !this.onWebEventListeners.contains(onWebEventListener)) {
        } else {
            this.onWebEventListeners.remove(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setHorizontalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4873e40286598edb87560e990b854203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4873e40286598edb87560e990b854203");
        } else {
            this.webView.setHorizontalScrollbarOverlay(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setVerticalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60a57c2f3d8f842db4753c8a7361b0a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60a57c2f3d8f842db4753c8a7361b0a0");
        } else {
            this.webView.setVerticalScrollbarOverlay(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean overlayHorizontalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "550ba775317cdeb402982653cca0549d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "550ba775317cdeb402982653cca0549d")).booleanValue() : this.webView.overlayHorizontalScrollbar();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean overlayVerticalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbbee264ccf287dfb9609daaed6b9f84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbbee264ccf287dfb9609daaed6b9f84")).booleanValue() : this.webView.overlayVerticalScrollbar();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public SslCertificate getCertificate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bb84bd7ca21e04ecf0e6852ec6ada95", RobustBitConfig.DEFAULT_VALUE) ? (SslCertificate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bb84bd7ca21e04ecf0e6852ec6ada95") : this.webView.getCertificate();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setCertificate(SslCertificate sslCertificate) {
        Object[] objArr = {sslCertificate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b9b697984f24a35b5f0fdc8723e680c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b9b697984f24a35b5f0fdc8723e680c");
        } else {
            this.webView.setCertificate(sslCertificate);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void savePassword(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa98161e143ba42e97e47f8c6b5e78a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa98161e143ba42e97e47f8c6b5e78a0");
        } else {
            this.webView.savePassword(str, str2, str3);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c4cf2f97bdeb6a77105aad6981f4afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c4cf2f97bdeb6a77105aad6981f4afd");
        } else {
            this.webView.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79c32a7684c72dac235bc16c241ad749", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79c32a7684c72dac235bc16c241ad749") : this.webView.getHttpAuthUsernamePassword(str, str2);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6605d2534406cc7ebfa13ea1d8db554a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6605d2534406cc7ebfa13ea1d8db554a");
        } else {
            this.webView.destroy();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setNetworkAvailable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7949d5554bb2430c22bf34247cbd03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7949d5554bb2430c22bf34247cbd03");
        } else {
            this.webView.setNetworkAvailable(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList saveState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7a756d4d63ecf1212c7e3f6addabde", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7a756d4d63ecf1212c7e3f6addabde") : this.webView.saveState(bundle);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList restoreState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5988fc9355af9d8a4e70831f49bb000", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5988fc9355af9d8a4e70831f49bb000") : this.webView.restoreState(bundle);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadUrl(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ee7f6a6ac3f5c8b787693349ec781b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ee7f6a6ac3f5c8b787693349ec781b4");
        } else {
            this.webView.loadUrl(str, map);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e61844ac6af1ffb540edb9180cf4a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e61844ac6af1ffb540edb9180cf4a65");
        } else {
            this.webView.loadUrl(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void postUrl(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d38345e9e85790d9bcccdbf772c6c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d38345e9e85790d9bcccdbf772c6c5f");
        } else {
            this.webView.postUrl(str, bArr);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadData(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73456b61a5836ba4fb6ba5c7c37cc4a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73456b61a5836ba4fb6ba5c7c37cc4a2");
        } else {
            this.webView.loadData(str, str2, str3);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82751735cdb3a7af784bf9b9a956c7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82751735cdb3a7af784bf9b9a956c7dc");
        } else {
            this.webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void evaluateJavascript(String str, ValueCallback valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed7c36e2af2a18e0bb33f5ed089653aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed7c36e2af2a18e0bb33f5ed089653aa");
        } else {
            this.webView.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void saveWebArchive(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "625c9a3f9d7ecbc53270e25f89ab6be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "625c9a3f9d7ecbc53270e25f89ab6be4");
        } else {
            this.webView.saveWebArchive(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void saveWebArchive(String str, boolean z, ValueCallback valueCallback) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "537b67d26b6cf14043f049d98ee6dfd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "537b67d26b6cf14043f049d98ee6dfd6");
        } else {
            this.webView.saveWebArchive(str, z, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82d40ac59d4be881abcbe59569b8d456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82d40ac59d4be881abcbe59569b8d456");
        } else {
            this.webView.stopLoading();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21b580eb365f7fd075df13421c1366f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21b580eb365f7fd075df13421c1366f0");
        } else {
            this.webView.reload();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60b39824b4c67ca5717eda076b3ec40", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60b39824b4c67ca5717eda076b3ec40")).booleanValue() : this.webView.canGoBack();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "384059cb3ee071b71016ef9f9e4a78fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "384059cb3ee071b71016ef9f9e4a78fc");
        } else {
            this.webView.goBack();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1d406b9b3517dead1dcb7616b7eff4c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1d406b9b3517dead1dcb7616b7eff4c")).booleanValue() : this.webView.canGoForward();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d652d4eebfb7c1490bee1bf83fe4a70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d652d4eebfb7c1490bee1bf83fe4a70c");
        } else {
            this.webView.goForward();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cbcc1a3b09b3e029f3484605250ed8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cbcc1a3b09b3e029f3484605250ed8b")).booleanValue() : this.webView.canGoBackOrForward(i);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d40160a255658086d2d908e5b046373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d40160a255658086d2d908e5b046373");
        } else {
            this.webView.goBackOrForward(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean isPrivateBrowsingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d74df562395b28fd571a9fe947a406", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d74df562395b28fd571a9fe947a406")).booleanValue() : this.webView.isPrivateBrowsingEnabled();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean pageUp(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f02ca08b8b3323a7f7a8517b296ee7f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f02ca08b8b3323a7f7a8517b296ee7f3")).booleanValue() : this.webView.pageUp(z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean pageDown(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc1cdbe72d838c73e86c7bb246015148", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc1cdbe72d838c73e86c7bb246015148")).booleanValue() : this.webView.pageDown(z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback) {
        Object[] objArr = {new Long(j), visualStateCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d7d2642a69b73be9e9a74269791d74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d7d2642a69b73be9e9a74269791d74d");
        } else {
            this.webView.postVisualStateCallback(j, visualStateCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fafb214fe6134180a4a8707a3d1c0c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fafb214fe6134180a4a8707a3d1c0c89");
        } else {
            this.webView.clearView();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Picture capturePicture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b49b90c4a510871a9f8f170c10332de1", RobustBitConfig.DEFAULT_VALUE) ? (Picture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b49b90c4a510871a9f8f170c10332de1") : this.webView.capturePicture();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public Object createPrintDocumentAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c115481e47381b18a68c3c8a72ffccb9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c115481e47381b18a68c3c8a72ffccb9") : createPrintDocumentAdapter();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public Object createPrintDocumentAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b0b05f12309ecf02b89ab6d3d83e78", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b0b05f12309ecf02b89ab6d3d83e78") : this.webView.createPrintDocumentAdapter(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1b394a9d5ec6d7b25c2a458f2e46d04", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1b394a9d5ec6d7b25c2a458f2e46d04")).floatValue() : this.webView.getScale();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setInitialScale(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb9397be38de4212c423f28fe6cc807c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb9397be38de4212c423f28fe6cc807c");
        } else {
            this.webView.setInitialScale(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void invokeZoomPicker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad69e1e7301eb2f8a719498e7f18217f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad69e1e7301eb2f8a719498e7f18217f");
        } else {
            this.webView.invokeZoomPicker();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public HitTestResult getHitTestResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84cd7c3e1e9f8d35c5242203ac0370c9", RobustBitConfig.DEFAULT_VALUE) ? (HitTestResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84cd7c3e1e9f8d35c5242203ac0370c9") : WebKitAdapterUtils.from(this.webView.getHitTestResult());
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void requestFocusNodeHref(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8ae6e6215586b76832cd6e8a7d6da83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8ae6e6215586b76832cd6e8a7d6da83");
        } else {
            this.webView.requestFocusNodeHref(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void requestImageRef(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e147e6964a2b6092c4387806a3c4beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e147e6964a2b6092c4387806a3c4beb");
        } else {
            this.webView.requestImageRef(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7160e00ac64012aae6a92f3bef68a22", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7160e00ac64012aae6a92f3bef68a22") : this.webView.getUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "148d42882106c2573e82f7bb23fdec6d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "148d42882106c2573e82f7bb23fdec6d") : this.webView.getOriginalUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9198f13f6e5be1f2fe4cac9fd793dd15", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9198f13f6e5be1f2fe4cac9fd793dd15") : this.webView.getTitle();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Bitmap getFavicon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcf1156096ee2db8ac99b4379a72603e", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcf1156096ee2db8ac99b4379a72603e") : this.webView.getFavicon();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int getProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba2648ec009598204af747fcbf74f56c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba2648ec009598204af747fcbf74f56c")).intValue() : this.webView.getProgress();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdf7fd399b14144221605f8e4889487c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdf7fd399b14144221605f8e4889487c")).intValue() : this.webView.getContentHeight();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void pauseTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9a1e26d9051e5cc5624800528567d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9a1e26d9051e5cc5624800528567d2c");
        } else {
            this.webView.pauseTimers();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void resumeTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6448010a68e3c464be5e25f30a30dcec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6448010a68e3c464be5e25f30a30dcec");
        } else {
            this.webView.resumeTimers();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d54c91eae97dec941b35645d8c498ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d54c91eae97dec941b35645d8c498ca");
        } else {
            this.webView.onPause();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a36b214b2a6d58ac8d6a5aa353f66c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a36b214b2a6d58ac8d6a5aa353f66c");
        } else {
            this.webView.onResume();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void freeMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d99496765105a0d85b27de08ee5373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d99496765105a0d85b27de08ee5373");
        } else {
            this.webView.freeMemory();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearCache(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee3bc786e5825475b07fd852423e204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee3bc786e5825475b07fd852423e204");
        } else {
            this.webView.clearCache(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d17de1b3ed39260a53e99a8be033b2b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d17de1b3ed39260a53e99a8be033b2b8");
        } else {
            this.webView.clearFormData();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4512f486e43415658fd6b2273f1ab680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4512f486e43415658fd6b2273f1ab680");
        } else {
            this.webView.clearHistory();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearSslPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57ac56141ed5e042a8b5429226e859ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57ac56141ed5e042a8b5429226e859ae");
        } else {
            this.webView.clearSslPreferences();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList copyBackForwardList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71efacf6660182d911521181d609b58d", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71efacf6660182d911521181d609b58d") : this.webView.copyBackForwardList();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setFindListener(WebView.FindListener findListener) {
        Object[] objArr = {findListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3af8dacb01b60ebf8054d0676870d66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3af8dacb01b60ebf8054d0676870d66b");
        } else {
            this.webView.setFindListener(findListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void findNext(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa8d66fd5324608301f56eb17f589259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa8d66fd5324608301f56eb17f589259");
        } else {
            this.webView.findNext(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int findAll(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad663cfa4a21abf150252cb8da979e2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad663cfa4a21abf150252cb8da979e2")).intValue() : this.webView.findAll(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void findAllAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3350a0c364c8781183538313bff38ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3350a0c364c8781183538313bff38ef4");
        } else {
            this.webView.findAllAsync(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean showFindDialog(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd90220cd96654aacbaa19d81564d3d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd90220cd96654aacbaa19d81564d3d")).booleanValue() : this.webView.showFindDialog(str, z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearMatches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7eccd4a977d9008da8bf41c58938b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7eccd4a977d9008da8bf41c58938b76");
        } else {
            this.webView.clearMatches();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void documentHasImages(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9e22cb455b72beb1ea85ccf77d553ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9e22cb455b72beb1ea85ccf77d553ef");
        } else {
            this.webView.documentHasImages(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebViewClient(IWebViewClient iWebViewClient) {
        Object[] objArr = {iWebViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e4af1e5e00a0a071634655059755150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e4af1e5e00a0a071634655059755150");
            return;
        }
        this.client = iWebViewClient;
        this.webView.setWebViewClient(WebKitAdapterUtils.from(this, iWebViewClient));
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public IWebViewClient getWebViewClient() {
        return this.client;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abf66951145aa225e1ca37de1d8fbfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abf66951145aa225e1ca37de1d8fbfe3");
        } else {
            this.webView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        Object[] objArr = {onLongClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d07accfe276a35ce065c2c2e9cdf9a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d07accfe276a35ce065c2c2e9cdf9a9");
        } else {
            this.webView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef140589e3768a8fb79cc200ae32b690", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef140589e3768a8fb79cc200ae32b690") : this.webView.startActionMode(callback);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1cc7ab5a9be4cfec6cfaefa6fbe513c", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1cc7ab5a9be4cfec6cfaefa6fbe513c") : this.webView.startActionMode(callback, i);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setDownloadListener(DownloadListener downloadListener) {
        Object[] objArr = {downloadListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05a5e2753dc1aaa724f4f9caa59d5088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05a5e2753dc1aaa724f4f9caa59d5088");
        } else {
            this.webView.setDownloadListener(downloadListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebChromeClient(IWebChromeClient iWebChromeClient) {
        Object[] objArr = {iWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7efa7f3588d22c57ef66b23b398dff52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7efa7f3588d22c57ef66b23b398dff52");
            return;
        }
        this.chromeClient = iWebChromeClient;
        this.webView.setWebChromeClient(WebKitAdapterUtils.from(this, iWebChromeClient));
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public IWebChromeClient getWebChromeClient() {
        return this.chromeClient;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setPictureListener(PictureListener pictureListener) {
        Object[] objArr = {pictureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44717ac39ebe42e23b51627e78ccfb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44717ac39ebe42e23b51627e78ccfb28");
        } else {
            this.webView.setPictureListener(WebKitAdapterUtils.from(pictureListener));
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ae16cf75ff99ef21a0ed6aeb35b6b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ae16cf75ff99ef21a0ed6aeb35b6b8");
        } else {
            this.webView.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void removeJavascriptInterface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1240fc57a528a5ad011bf919f24cb76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1240fc57a528a5ad011bf919f24cb76");
        } else {
            this.webView.removeJavascriptInterface(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public WebMessagePort[] createWebMessageChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8a13e126e04395a07df81dda715f484", RobustBitConfig.DEFAULT_VALUE) ? (WebMessagePort[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8a13e126e04395a07df81dda715f484") : this.webView.createWebMessageChannel();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void postWebMessage(WebMessage webMessage, Uri uri) {
        Object[] objArr = {webMessage, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19fb657be0471c2523530a3372a44cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19fb657be0471c2523530a3372a44cb8");
        } else {
            this.webView.postWebMessage(webMessage, uri);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebSettings getSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb0df8f70102ceb8f9d57aaa8d0791b2", RobustBitConfig.DEFAULT_VALUE) ? (WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb0df8f70102ceb8f9d57aaa8d0791b2") : this.webView.getSettings();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac56ee4aff4e040ca4e6946752193358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac56ee4aff4e040ca4e6946752193358");
        } else {
            this.webView.onChildViewAdded(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90205e9c1f97b3800d458b784d61a7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90205e9c1f97b3800d458b784d61a7b4");
        } else {
            this.webView.onChildViewRemoved(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onGlobalFocusChanged(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2451518bc26923b87acbabd58c55156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2451518bc26923b87acbabd58c55156");
        } else {
            this.webView.onGlobalFocusChanged(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setMapTrackballToArrowKeys(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23bcf2f9ef350d9678654d75efd16a42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23bcf2f9ef350d9678654d75efd16a42");
        } else {
            this.webView.setMapTrackballToArrowKeys(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void flingScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a728bd2ae25bef23292a5d966b3184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a728bd2ae25bef23292a5d966b3184");
        } else {
            this.webView.flingScroll(i, i2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canZoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe41a79e17ca16fe2d0a027d823289a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe41a79e17ca16fe2d0a027d823289a0")).booleanValue() : this.webView.canZoomIn();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canZoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78045d36deef80fac0b977fe75d3ac46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78045d36deef80fac0b977fe75d3ac46")).booleanValue() : this.webView.canZoomOut();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void zoomBy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd33f5e961d30a9ad6c52b25fc345a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd33f5e961d30a9ad6c52b25fc345a7");
        } else {
            this.webView.zoomBy(f);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0060e6d9ec53977d6589128d42b7413", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0060e6d9ec53977d6589128d42b7413")).booleanValue() : this.webView.zoomIn();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66a1a64157461582cb1d173fe0c3a925", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66a1a64157461582cb1d173fe0c3a925")).booleanValue() : this.webView.zoomOut();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void setRendererPriorityPolicy(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e01b79680fe6bec1f218ce84ae73e778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e01b79680fe6bec1f218ce84ae73e778");
        } else {
            this.webView.setRendererPriorityPolicy(i, z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public int getRendererRequestedPriority() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61238c82ec3cdfe32dfca67326b44880", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61238c82ec3cdfe32dfca67326b44880")).intValue() : this.webView.getRendererRequestedPriority();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8411041783c47a9f7ec6b40cda99847c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8411041783c47a9f7ec6b40cda99847c")).booleanValue() : this.webView.getRendererPriorityWaivedWhenNotVisible();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 27)
    public void setTextClassifier(TextClassifier textClassifier) {
        Object[] objArr = {textClassifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fc9cee519522cc835cc5da1e16b2763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fc9cee519522cc835cc5da1e16b2763");
        } else {
            this.webView.setTextClassifier(textClassifier);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 27)
    public TextClassifier getTextClassifier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae4ec47a7bc31591619a9a01c119b26", RobustBitConfig.DEFAULT_VALUE) ? (TextClassifier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae4ec47a7bc31591619a9a01c119b26") : this.webView.getTextClassifier();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 28)
    public Looper getWebViewLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00f2b55032ea9bfa308182c191a3aaef", RobustBitConfig.DEFAULT_VALUE) ? (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00f2b55032ea9bfa308182c191a3aaef") : this.webView.getWebViewLooper();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04b7e61ad0f754f5352c19b020de87d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04b7e61ad0f754f5352c19b020de87d7");
        } else {
            this.webView.setOverScrollMode(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setScrollBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cdf574180d226700cf9b806bd84a0c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cdf574180d226700cf9b806bd84a0c1");
        } else {
            this.webView.setScrollBarStyle(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e416b788832b5496f68f374661a7d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e416b788832b5496f68f374661a7d20");
        } else {
            this.webView.computeScroll();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onHoverEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "317c596986f571cc92eb859ebb842375", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "317c596986f571cc92eb859ebb842375")).booleanValue() : this.webView.onHoverEvent(motionEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c727f8a13c8ee1664780483b6df204", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c727f8a13c8ee1664780483b6df204")).booleanValue() : this.webView.onTouchEvent(motionEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94c82b09b5ba3d931c29d436bd73bce6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94c82b09b5ba3d931c29d436bd73bce6")).booleanValue() : this.webView.onGenericMotionEvent(motionEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a827f678b96e7322c33e23da74a76f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a827f678b96e7322c33e23da74a76f")).booleanValue() : this.webView.onTrackballEvent(motionEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15808897a708e38c94801b381635e9f7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15808897a708e38c94801b381635e9f7")).booleanValue() : this.webView.onKeyDown(i, keyEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61213cf631856caac480cf41c7d0535", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61213cf631856caac480cf41c7d0535")).booleanValue() : this.webView.onKeyUp(i, keyEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ab4516ac106744af723c4ee164b25d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ab4516ac106744af723c4ee164b25d4")).booleanValue() : this.webView.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828b33d80ea6f7dc9fd1da3e5bb0e9b2", RobustBitConfig.DEFAULT_VALUE) ? (AccessibilityNodeProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828b33d80ea6f7dc9fd1da3e5bb0e9b2") : this.webView.getAccessibilityNodeProvider();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5bf88d0697c30f95e6e4cf79d7fc4ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5bf88d0697c30f95e6e4cf79d7fc4ad")).booleanValue() : this.webView.shouldDelayChildPressedState();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.ViewGroup, android.view.View
    @RequiresApi(api = 23)
    public CharSequence getAccessibilityClassName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d975e16d800c92aab0ac11b5ca67b00b", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d975e16d800c92aab0ac11b5ca67b00b") : this.webView.getAccessibilityClassName();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99a9167082e083ca10449ad5088e28e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99a9167082e083ca10449ad5088e28e2");
        } else {
            this.webView.onProvideVirtualStructure(viewStructure);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Object[] objArr = {viewStructure, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c68f70285cbc68f70331098c2a43387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c68f70285cbc68f70331098c2a43387");
        } else {
            this.webView.onProvideAutofillVirtualStructure(viewStructure, i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void autofill(SparseArray sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e38e45bce461c0b985a6dc9649b4c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e38e45bce461c0b985a6dc9649b4c0a");
        } else {
            this.webView.autofill(sparseArray);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 28)
    public boolean isVisibleToUserForAutofill(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d842e600496b3b87c8906d5d9c1e4a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d842e600496b3b87c8906d5d9c1e4a5")).booleanValue() : this.webView.isVisibleToUserForAutofill(i);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean performLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5fefe33e01c7f8341a1a200f8f36f00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5fefe33e01c7f8341a1a200f8f36f00")).booleanValue() : this.webView.performLongClick();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object[] objArr = {editorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46ee8825a000c7763434efdc8c897061", RobustBitConfig.DEFAULT_VALUE) ? (InputConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46ee8825a000c7763434efdc8c897061") : this.webView.onCreateInputConnection(editorInfo);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onDragEvent(DragEvent dragEvent) {
        Object[] objArr = {dragEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235d17718a77812a1793e22698a3c775", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235d17718a77812a1793e22698a3c775")).booleanValue() : this.webView.onDragEvent(dragEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24b5023beaf7ae4fdf7ef22219cef9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24b5023beaf7ae4fdf7ef22219cef9c1");
        } else {
            this.webView.onWindowFocusChanged(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deff08fb587d0b0de4d7cd2bf2357be9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deff08fb587d0b0de4d7cd2bf2357be9")).booleanValue() : this.webView.dispatchKeyEvent(keyEvent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41036a18bc3bae4c2d3450b70fcf466a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41036a18bc3bae4c2d3450b70fcf466a")).booleanValue() : this.webView.requestFocus(i, rect);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2ffa72d40c26080d5a5f37e3db5ecf2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2ffa72d40c26080d5a5f37e3db5ecf2")).booleanValue() : this.webView.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ec6aabf5c37ec62972709a693473872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ec6aabf5c37ec62972709a693473872");
        } else {
            this.webView.setBackgroundColor(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setLayerType(int i, Paint paint) {
        Object[] objArr = {Integer.valueOf(i), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bfce5b74ee71194e4dd0d40260de76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bfce5b74ee71194e4dd0d40260de76");
        } else {
            this.webView.setLayerType(i, paint);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ea6a609175cce5ef9849aa36c03710c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ea6a609175cce5ef9849aa36c03710c");
        } else {
            this.webView.onStartTemporaryDetach();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afdd34b259652b6d59ce18366f6d6199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afdd34b259652b6d59ce18366f6d6199");
        } else {
            this.webView.onFinishTemporaryDetach();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Handler getHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec78279390d52a53571cd1a36344f46", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec78279390d52a53571cd1a36344f46") : this.webView.getHandler();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView, android.view.View
    public View findFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "898be25ecb3123cf40bee2151e67a3cb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "898be25ecb3123cf40bee2151e67a3cb") : this.webView.findFocus();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onCheckIsTextEditor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ccdc192b2d8d202a5641c9db056e285", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ccdc192b2d8d202a5641c9db056e285")).booleanValue() : this.webView.onCheckIsTextEditor();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d48bb78e2e5d61bec33231b958049b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d48bb78e2e5d61bec33231b958049b");
        } else {
            this.webView.removeAllViews();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void clearClientCertPreferences(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2732d876319bdae56ae71a7e35a7ba18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2732d876319bdae56ae71a7e35a7ba18");
        } else {
            WebView.clearClientCertPreferences(runnable);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        Object[] objArr = {context, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aef9a6fd94b52067b68e14505b9cbcf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aef9a6fd94b52067b68e14505b9cbcf3");
        } else {
            WebView.startSafeBrowsing(context, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        Object[] objArr = {list, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6be84c4cadedd831866a566f0e74be5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6be84c4cadedd831866a566f0e74be5f");
        } else {
            WebView.setSafeBrowsingWhitelist(list, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Uri getSafeBrowsingPrivacyPolicyUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c896ee6db9c4e9b8702754e99201cd81", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c896ee6db9c4e9b8702754e99201cd81") : WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String findAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a1837d26efc78cc4e5333a76a674e29", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a1837d26efc78cc4e5333a76a674e29") : WebView.findAddress(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void enableSlowWholeDocumentDraw() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23dd599d157465d6cb6c64137c909c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23dd599d157465d6cb6c64137c909c2e");
        } else {
            WebView.enableSlowWholeDocumentDraw();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebContentsDebuggingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a64e753cfbab1386d002b1947195b728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a64e753cfbab1386d002b1947195b728");
        } else {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setDataDirectorySuffix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d830430ae8a243b9a21a1b5d8d25ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d830430ae8a243b9a21a1b5d8d25ce0");
        } else {
            WebView.setDataDirectorySuffix(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void disableWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f62fc6555d5288e5bd960c8fbe89c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f62fc6555d5288e5bd960c8fbe89c54");
        } else {
            WebView.disableWebView();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public ClassLoader getWebViewClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9ea0deceae8abea8cbce3a656930a9", RobustBitConfig.DEFAULT_VALUE) ? (ClassLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9ea0deceae8abea8cbce3a656930a9") : WebView.getWebViewClassLoader();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public PackageInfo getCurrentWebViewPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce3793811c420734d82052f624f6587", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce3793811c420734d82052f624f6587") : WebView.getCurrentWebViewPackage();
    }
}
