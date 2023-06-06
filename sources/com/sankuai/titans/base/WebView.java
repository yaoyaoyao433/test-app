package com.sankuai.titans.base;

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
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
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
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebView extends FrameLayout implements IWebView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IWebView impl;

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getKernel() {
        return TitansConstants.WebKernel.KERNEL_WEBKIT;
    }

    public WebView(@NonNull Context context, @Nullable IWebView iWebView) {
        this(context, iWebView, null);
        Object[] objArr = {context, iWebView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "918a4a50bc0abefd294ca6740b8b2cfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "918a4a50bc0abefd294ca6740b8b2cfa");
        }
    }

    public WebView(@NonNull Context context, @Nullable IWebView iWebView, @Nullable AttributeSet attributeSet) {
        this(context, iWebView, attributeSet, Resources.getSystem().getIdentifier("webViewStyle", "attr", "android"));
        Object[] objArr = {context, iWebView, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6be5816a90da9eaff9c6b06b2e2f139", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6be5816a90da9eaff9c6b06b2e2f139");
        }
    }

    public WebView(@NonNull Context context, @Nullable IWebView iWebView, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, iWebView, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b00bbf37e7998b705962eeacd5a96991", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b00bbf37e7998b705962eeacd5a96991");
            return;
        }
        this.impl = iWebView;
        addView(this.impl.get(), new FrameLayout.LayoutParams(-1, -1));
    }

    @RequiresApi(api = 21)
    public WebView(@NonNull Context context, @Nullable IWebView iWebView, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, iWebView, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd75ba095bddb2eb2596e7460ddf858a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd75ba095bddb2eb2596e7460ddf858a");
            return;
        }
        this.impl = iWebView;
        addView(this.impl.get(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public ViewGroup get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ad5426156952fd36dcd0ffa22cad7d2", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ad5426156952fd36dcd0ffa22cad7d2") : this.impl.get();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setActionModeCallback(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "630e5bdf822f9fc883d0aa4790ddf853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "630e5bdf822f9fc883d0aa4790ddf853");
        } else {
            this.impl.setActionModeCallback(callback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setAcceptThirdPartyCookies(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a706f4464ba08ccbad651dda1b571ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a706f4464ba08ccbad651dda1b571ad2");
        } else {
            this.impl.setAcceptThirdPartyCookies(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public List<OnWebEventListener> getOnWebEventListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9cc20094580dae249d628eabb4aee9d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9cc20094580dae249d628eabb4aee9d") : this.impl.getOnWebEventListeners();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void registerWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44c8be42b2d2a42470d7e81752c56222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44c8be42b2d2a42470d7e81752c56222");
        } else {
            this.impl.registerWebEventListener(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void unregisterWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb915cd9e3c4ade8678481e019e77db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb915cd9e3c4ade8678481e019e77db8");
        } else {
            this.impl.unregisterWebEventListener(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setHorizontalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e78d98c7fffcb0ac82ac8253249e589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e78d98c7fffcb0ac82ac8253249e589");
        } else {
            this.impl.setHorizontalScrollbarOverlay(z);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        Object[] objArr = {onLongClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87e70d41aa4b0603fe85d90ce47e518d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87e70d41aa4b0603fe85d90ce47e518d");
        } else {
            this.impl.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a506dcc5d74cb181dda6a96da8e277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a506dcc5d74cb181dda6a96da8e277");
        } else {
            this.impl.setOnClickListener(onClickListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setVerticalScrollbarOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d03c3661043d00a604c2589780fdd661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d03c3661043d00a604c2589780fdd661");
        } else {
            this.impl.setVerticalScrollbarOverlay(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean overlayHorizontalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf21b8b26c8fcb06ec4064d47769740", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf21b8b26c8fcb06ec4064d47769740")).booleanValue() : this.impl.overlayHorizontalScrollbar();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean overlayVerticalScrollbar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9511b5b60fcf87004d73cf6aade6f189", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9511b5b60fcf87004d73cf6aade6f189")).booleanValue() : this.impl.overlayVerticalScrollbar();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public SslCertificate getCertificate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3b6947e1471f765d6e4b6d5e4958788", RobustBitConfig.DEFAULT_VALUE) ? (SslCertificate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3b6947e1471f765d6e4b6d5e4958788") : this.impl.getCertificate();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setCertificate(SslCertificate sslCertificate) {
        Object[] objArr = {sslCertificate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5a1f4fe790b4c2bccfbee455c7f78eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5a1f4fe790b4c2bccfbee455c7f78eb");
        } else {
            this.impl.setCertificate(sslCertificate);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void savePassword(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8858c965a6866b39588285fe37824ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8858c965a6866b39588285fe37824ebd");
        } else {
            this.impl.savePassword(str, str2, str3);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "354506256adc80fa9a75d5d1a66e1fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "354506256adc80fa9a75d5d1a66e1fa5");
        } else {
            this.impl.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d58d66c04a404e111ace95f61ddf112", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d58d66c04a404e111ace95f61ddf112") : this.impl.getHttpAuthUsernamePassword(str, str2);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd7948f2fbc9c0b6c59ed21c29cb013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd7948f2fbc9c0b6c59ed21c29cb013");
        } else {
            this.impl.destroy();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setNetworkAvailable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "384bf1defad57d1410b0ae1dff36b98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "384bf1defad57d1410b0ae1dff36b98b");
        } else {
            this.impl.setNetworkAvailable(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList saveState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f8138a79a933233b15391c75a1c86ec", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f8138a79a933233b15391c75a1c86ec") : this.impl.saveState(bundle);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList restoreState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4270f4e01c271dd2feeec917a0ec9bc9", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4270f4e01c271dd2feeec917a0ec9bc9") : this.impl.restoreState(bundle);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadUrl(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bf668a4596882b403f7962977ff3a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bf668a4596882b403f7962977ff3a12");
        } else {
            this.impl.loadUrl(str, map);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f70e299e3699f9fb733e042ce519625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f70e299e3699f9fb733e042ce519625");
        } else {
            this.impl.loadUrl(str, null);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void postUrl(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3efd336f83666a6e519c14bbbeea8ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3efd336f83666a6e519c14bbbeea8ec9");
        } else {
            this.impl.postUrl(str, bArr);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadData(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f3b460c29a1200c63f7021b7787e4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f3b460c29a1200c63f7021b7787e4b2");
        } else {
            this.impl.loadData(str, str2, str3);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f501cfa05eb03d8e3a978c855887a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f501cfa05eb03d8e3a978c855887a3");
        } else {
            this.impl.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void evaluateJavascript(String str, ValueCallback valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57d2397c779bb4dbc9de338396dd855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57d2397c779bb4dbc9de338396dd855");
        } else {
            this.impl.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void saveWebArchive(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37850cb160ff1a47e5ddb093151b87e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37850cb160ff1a47e5ddb093151b87e8");
        } else {
            this.impl.saveWebArchive(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void saveWebArchive(String str, boolean z, ValueCallback valueCallback) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad81a3fcd824df8bd85cd66d46d5fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad81a3fcd824df8bd85cd66d46d5fb3");
        } else {
            this.impl.saveWebArchive(str, z, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2de3c1d3706c4dfd585e5fb3729b8850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2de3c1d3706c4dfd585e5fb3729b8850");
        } else {
            this.impl.stopLoading();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "837d5d0d1546f2e4199c44cfc0644e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "837d5d0d1546f2e4199c44cfc0644e3f");
        } else {
            this.impl.reload();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64d87fe9393abd3e3248f8466751182e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64d87fe9393abd3e3248f8466751182e")).booleanValue() : this.impl.canGoBack();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d1409bf45f1ae132edfbfa35b3a9cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d1409bf45f1ae132edfbfa35b3a9cdc");
        } else {
            this.impl.goBack();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34fa238a824d57f552104f6dcdb560f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34fa238a824d57f552104f6dcdb560f4")).booleanValue() : this.impl.canGoForward();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "699bc9f6151554e8368fadd1375930c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "699bc9f6151554e8368fadd1375930c6");
        } else {
            this.impl.goForward();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canGoBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9ec5ff6e6e8394641b0adc465a6924b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9ec5ff6e6e8394641b0adc465a6924b")).booleanValue() : this.impl.canGoBackOrForward(i);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void goBackOrForward(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6b726ee457a5b6346bd0d1232ba645a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6b726ee457a5b6346bd0d1232ba645a");
        } else {
            this.impl.goBackOrForward(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean isPrivateBrowsingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7163cc2e0c051301cd6a1e1d7e93cb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7163cc2e0c051301cd6a1e1d7e93cb7")).booleanValue() : this.impl.isPrivateBrowsingEnabled();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean pageUp(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "267fc13be4501f364ef3a301f4e15cb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "267fc13be4501f364ef3a301f4e15cb7")).booleanValue() : this.impl.pageUp(z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean pageDown(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b913273f82b815afe5f5e9c6e013b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b913273f82b815afe5f5e9c6e013b4")).booleanValue() : this.impl.pageDown(z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback) {
        Object[] objArr = {new Long(j), visualStateCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "443786bd336450e979bd1e90e242776a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "443786bd336450e979bd1e90e242776a");
        } else {
            this.impl.postVisualStateCallback(j, visualStateCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "567c7ef07d48e8a90d8bfdf8b8670ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "567c7ef07d48e8a90d8bfdf8b8670ca6");
        } else {
            this.impl.clearView();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Picture capturePicture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ec345bcda1e804e9119729f6945f579", RobustBitConfig.DEFAULT_VALUE) ? (Picture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ec345bcda1e804e9119729f6945f579") : this.impl.capturePicture();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public Object createPrintDocumentAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3141e56172b4a599e6c5409452b64e61", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3141e56172b4a599e6c5409452b64e61") : createPrintDocumentAdapter();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public Object createPrintDocumentAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae0d066ecd0c63d488a76d127e6b873", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae0d066ecd0c63d488a76d127e6b873") : this.impl.createPrintDocumentAdapter(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb64d190ce195d9de682baf68a053252", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb64d190ce195d9de682baf68a053252")).floatValue() : this.impl.getScale();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setInitialScale(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432fc76bea72657407b785dd7930da3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432fc76bea72657407b785dd7930da3a");
        } else {
            this.impl.setInitialScale(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void invokeZoomPicker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70d638d5f94d5bb2ab61a439e39d947a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70d638d5f94d5bb2ab61a439e39d947a");
        } else {
            this.impl.invokeZoomPicker();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public HitTestResult getHitTestResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9518a8a7a72dd86eaf594e6135524d49", RobustBitConfig.DEFAULT_VALUE) ? (HitTestResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9518a8a7a72dd86eaf594e6135524d49") : this.impl.getHitTestResult();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void requestFocusNodeHref(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d62c6eadd00780e5d9e0b5a5c2eafe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d62c6eadd00780e5d9e0b5a5c2eafe4");
        } else {
            this.impl.requestFocusNodeHref(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void requestImageRef(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0223301354a556fb64f226a7ee3a7470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0223301354a556fb64f226a7ee3a7470");
        } else {
            this.impl.requestImageRef(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d794c616cca78c91e4f73f7cf120cd22", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d794c616cca78c91e4f73f7cf120cd22") : this.impl.getUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63e6b0763901f4e2c798faf49ed983bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63e6b0763901f4e2c798faf49ed983bc") : this.impl.getOriginalUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dea1940a1dc21e112058f1075e382fc2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dea1940a1dc21e112058f1075e382fc2") : this.impl.getTitle();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Bitmap getFavicon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18268da544f60b5f0699cad604af21e2", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18268da544f60b5f0699cad604af21e2") : this.impl.getFavicon();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int getProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5277932e6148273164d6e0ee47b774", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5277932e6148273164d6e0ee47b774")).intValue() : this.impl.getProgress();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8778ebd6db3de3541238026b5cdf6542", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8778ebd6db3de3541238026b5cdf6542")).intValue() : this.impl.getContentHeight();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void pauseTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87d8dd536194f2b22deac1c2b5b7b036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87d8dd536194f2b22deac1c2b5b7b036");
        } else {
            this.impl.pauseTimers();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void resumeTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18f1be73b5c24d611c28eca6aef4aa9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18f1be73b5c24d611c28eca6aef4aa9e");
        } else {
            this.impl.resumeTimers();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7962907bfaebf7cd1efd66fd9b46bfd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7962907bfaebf7cd1efd66fd9b46bfd3");
        } else {
            this.impl.onPause();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7744c79ef15a185c85fecee084d8f730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7744c79ef15a185c85fecee084d8f730");
        } else {
            this.impl.onResume();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void freeMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28b721a79b313a56b386cb2fa7d035ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28b721a79b313a56b386cb2fa7d035ed");
        } else {
            this.impl.freeMemory();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearCache(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ab6c6e990a281f792e849acb0a527fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ab6c6e990a281f792e849acb0a527fc");
        } else {
            this.impl.clearCache(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ef86e437e4daf7580569d3e105597e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ef86e437e4daf7580569d3e105597e");
        } else {
            this.impl.clearFormData();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "667827b31c5ce4c80237282d83cca58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "667827b31c5ce4c80237282d83cca58c");
        } else {
            this.impl.clearHistory();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearSslPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f485ce08a5ea5c2cace101deb4fa9a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f485ce08a5ea5c2cace101deb4fa9a5");
        } else {
            this.impl.clearSslPreferences();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebBackForwardList copyBackForwardList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56efe7e572338fe25ebfa12e4097a796", RobustBitConfig.DEFAULT_VALUE) ? (WebBackForwardList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56efe7e572338fe25ebfa12e4097a796") : this.impl.copyBackForwardList();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setFindListener(WebView.FindListener findListener) {
        Object[] objArr = {findListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f7726d33b67e2d8e36e56143121e300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f7726d33b67e2d8e36e56143121e300");
        } else {
            this.impl.setFindListener(findListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void findNext(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc97a6e64ed891b174ae47c014ea284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc97a6e64ed891b174ae47c014ea284");
        } else {
            this.impl.findNext(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public int findAll(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7364334e7fe4d5f0876a8f0c5ede4b57", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7364334e7fe4d5f0876a8f0c5ede4b57")).intValue() : this.impl.findAll(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void findAllAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4423477e64c199e35cf1aa542b63fd7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4423477e64c199e35cf1aa542b63fd7c");
        } else {
            this.impl.findAllAsync(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean showFindDialog(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "967233f818e9a675d37b140e74bd956b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "967233f818e9a675d37b140e74bd956b")).booleanValue() : this.impl.showFindDialog(str, z);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void clearMatches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c001fea18a274c04c02422d7938eabba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c001fea18a274c04c02422d7938eabba");
        } else {
            this.impl.clearMatches();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void documentHasImages(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72dec845bf44e97d277e1bc0eba078f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72dec845bf44e97d277e1bc0eba078f3");
        } else {
            this.impl.documentHasImages(message);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebViewClient(IWebViewClient iWebViewClient) {
        Object[] objArr = {iWebViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caf5f9d53f209d96682517d17aeabac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caf5f9d53f209d96682517d17aeabac2");
        } else {
            this.impl.setWebViewClient(iWebViewClient);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public IWebViewClient getWebViewClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5100d4c6d3dc8dc61ce0b03855c6bc92", RobustBitConfig.DEFAULT_VALUE) ? (IWebViewClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5100d4c6d3dc8dc61ce0b03855c6bc92") : this.impl.getWebViewClient();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setDownloadListener(DownloadListener downloadListener) {
        Object[] objArr = {downloadListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c35ae47af419bf558fa0d016f0a804a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c35ae47af419bf558fa0d016f0a804a");
        } else {
            this.impl.setDownloadListener(downloadListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebChromeClient(IWebChromeClient iWebChromeClient) {
        Object[] objArr = {iWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ec99398fb6e4f39ad2223b86e8bc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ec99398fb6e4f39ad2223b86e8bc81");
        } else {
            this.impl.setWebChromeClient(iWebChromeClient);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public IWebChromeClient getWebChromeClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45883b53e3c22a34556371ab027e0a17", RobustBitConfig.DEFAULT_VALUE) ? (IWebChromeClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45883b53e3c22a34556371ab027e0a17") : this.impl.getWebChromeClient();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setPictureListener(PictureListener pictureListener) {
        Object[] objArr = {pictureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da47a7c639a0653f4124883702e43d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da47a7c639a0653f4124883702e43d35");
        } else {
            this.impl.setPictureListener(pictureListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "524ed02736bf92c77b1bfa1a6b265f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "524ed02736bf92c77b1bfa1a6b265f31");
        } else if (Build.VERSION.SDK_INT < 17) {
        } else {
            this.impl.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void removeJavascriptInterface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c56d75b7f5350c8d2ee687872aa60856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c56d75b7f5350c8d2ee687872aa60856");
        } else {
            this.impl.removeJavascriptInterface(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public WebMessagePort[] createWebMessageChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77b0145fa78b148871b4f76b12c3274", RobustBitConfig.DEFAULT_VALUE) ? (WebMessagePort[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77b0145fa78b148871b4f76b12c3274") : this.impl.createWebMessageChannel();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void postWebMessage(WebMessage webMessage, Uri uri) {
        Object[] objArr = {webMessage, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82d9d8b5485c2a7d9b5e0b79cedc3cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82d9d8b5485c2a7d9b5e0b79cedc3cdf");
        } else {
            this.impl.postWebMessage(webMessage, uri);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public WebSettings getSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b722553bce38937be4ccc4cea88c3852", RobustBitConfig.DEFAULT_VALUE) ? (WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b722553bce38937be4ccc4cea88c3852") : this.impl.getSettings();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24640d89b8caee182ef530cc4ef34688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24640d89b8caee182ef530cc4ef34688");
        } else {
            this.impl.onChildViewAdded(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92b94494f797e0a7da0f6cfcb9913f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92b94494f797e0a7da0f6cfcb9913f87");
        } else {
            this.impl.onChildViewRemoved(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void onGlobalFocusChanged(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c050e087fb28ac068afd1f84ea0e0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c050e087fb28ac068afd1f84ea0e0f9");
        } else {
            this.impl.onGlobalFocusChanged(view, view2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setMapTrackballToArrowKeys(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c439d0053f5f30c25f48e6af3464042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c439d0053f5f30c25f48e6af3464042");
        } else {
            this.impl.setMapTrackballToArrowKeys(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void flingScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5be99ea94b2cc6873b75aa50814e50d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5be99ea94b2cc6873b75aa50814e50d");
        } else {
            this.impl.flingScroll(i, i2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canZoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82d13be97eaf925d8e208e7b6f52c7f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82d13be97eaf925d8e208e7b6f52c7f1")).booleanValue() : this.impl.canZoomIn();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean canZoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7743548f3bfd04ce2d5bd00cefd039f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7743548f3bfd04ce2d5bd00cefd039f1")).booleanValue() : this.impl.canZoomOut();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void zoomBy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73b28d9fe77a06fa2824c8845eb986a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73b28d9fe77a06fa2824c8845eb986a");
        } else {
            this.impl.zoomBy(f);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a10508d586741195c3129ce76a7f158", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a10508d586741195c3129ce76a7f158")).booleanValue() : this.impl.zoomIn();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public boolean zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5cce7940ad02865b3414921ef6030ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5cce7940ad02865b3414921ef6030ad")).booleanValue() : this.impl.zoomOut();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void setRendererPriorityPolicy(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70db367be234b7cb1f82af1e5f299d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70db367be234b7cb1f82af1e5f299d2");
        } else {
            this.impl.setRendererPriorityPolicy(i, z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public int getRendererRequestedPriority() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86e6ad077311aadec0274b8fa2b3b970", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86e6ad077311aadec0274b8fa2b3b970")).intValue() : this.impl.getRendererRequestedPriority();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37bf96dcb67728676aefd43e147ec42", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37bf96dcb67728676aefd43e147ec42")).booleanValue() : this.impl.getRendererPriorityWaivedWhenNotVisible();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 27)
    public void setTextClassifier(TextClassifier textClassifier) {
        Object[] objArr = {textClassifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d318a1ecb236429e5245d007612a8f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d318a1ecb236429e5245d007612a8f89");
        } else {
            this.impl.setTextClassifier(textClassifier);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 27)
    public TextClassifier getTextClassifier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9030a9726e492c43f9aa84e2576addce", RobustBitConfig.DEFAULT_VALUE) ? (TextClassifier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9030a9726e492c43f9aa84e2576addce") : this.impl.getTextClassifier();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 28)
    public Looper getWebViewLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd637fb3dbe72a9c157388ac2d56ece3", RobustBitConfig.DEFAULT_VALUE) ? (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd637fb3dbe72a9c157388ac2d56ece3") : this.impl.getWebViewLooper();
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void setScrollBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c40039bd2efaa818e8cadd5fe3b6b214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c40039bd2efaa818e8cadd5fe3b6b214");
        } else {
            this.impl.setScrollBarStyle(i);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onHoverEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52c6a871e05b7f1184cb9145ddc51ecd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52c6a871e05b7f1184cb9145ddc51ecd")).booleanValue() : this.impl.onHoverEvent(motionEvent);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "978ed01cf1e75ad4d60ec780cca51a9a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "978ed01cf1e75ad4d60ec780cca51a9a")).booleanValue() : this.impl.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "888c6662ce441dd9a8c606a0c23e7f66", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "888c6662ce441dd9a8c606a0c23e7f66")).booleanValue() : this.impl.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e5a0e90f3b4f6a6769238a31b562233", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e5a0e90f3b4f6a6769238a31b562233")).booleanValue() : this.impl.onTrackballEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4840f9c086a92988d6a49929b3b8cc76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4840f9c086a92988d6a49929b3b8cc76")).booleanValue() : this.impl.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d68cc55ad5c521bb6b381303bab74daf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d68cc55ad5c521bb6b381303bab74daf")).booleanValue() : this.impl.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c61384d0b900d7b1ee87b545c7240ead", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c61384d0b900d7b1ee87b545c7240ead")).booleanValue() : this.impl.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b66b54d727092bc97830a004caced548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b66b54d727092bc97830a004caced548");
            return;
        }
        boolean z = getVisibility() == 0;
        super.setVisibility(i);
        boolean z2 = getVisibility() == 0;
        List<OnWebEventListener> onWebEventListeners = getOnWebEventListeners();
        if (z == z2 || onWebEventListeners == null) {
            return;
        }
        for (OnWebEventListener onWebEventListener : onWebEventListeners) {
            onWebEventListener.onVisibleChanged(z2);
        }
    }

    @Override // android.view.ViewGroup, com.sankuai.titans.protocol.webcompat.IWebView
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88d20226d98458b89fac13a59d7effbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88d20226d98458b89fac13a59d7effbc");
            return;
        }
        super.removeAllViews();
        this.impl.removeAllViews();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ba250de2f19468aedeee07c37857c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ba250de2f19468aedeee07c37857c99");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e74c649851b002a12b07eb43af88eeca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e74c649851b002a12b07eb43af88eeca")).booleanValue() : this.impl.shouldDelayChildPressedState();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public CharSequence getAccessibilityClassName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf8064560241224723b5216ce3806d46", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf8064560241224723b5216ce3806d46") : this.impl.getAccessibilityClassName();
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e383e9d3dcce747650d9a643d769489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e383e9d3dcce747650d9a643d769489");
        } else {
            this.impl.onProvideVirtualStructure(viewStructure);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Object[] objArr = {viewStructure, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3564898182ea6e2021c29750ce69621a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3564898182ea6e2021c29750ce69621a");
        } else {
            this.impl.onProvideAutofillVirtualStructure(viewStructure, i);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public void autofill(SparseArray sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e59b0321cf4712d5fef132d464d04e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e59b0321cf4712d5fef132d464d04e7");
        } else {
            this.impl.autofill(sparseArray);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 28)
    public boolean isVisibleToUserForAutofill(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e459a60d2896840c33cfcd5a387f0778", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e459a60d2896840c33cfcd5a387f0778")).booleanValue() : this.impl.isVisibleToUserForAutofill(i);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean performLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "352c95095d69f7838a054724c22b2a73", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "352c95095d69f7838a054724c22b2a73")).booleanValue() : this.impl.performLongClick();
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object[] objArr = {editorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cfe7edfcd19b6753bc915d114f0de4c", RobustBitConfig.DEFAULT_VALUE) ? (InputConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cfe7edfcd19b6753bc915d114f0de4c") : this.impl.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onDragEvent(DragEvent dragEvent) {
        Object[] objArr = {dragEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7239c905d18b2d3dd0bbd20fdee07c12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7239c905d18b2d3dd0bbd20fdee07c12")).booleanValue() : this.impl.onDragEvent(dragEvent);
    }

    @Override // android.view.ViewGroup, android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0968d9b26f0f71e6084fe60a2405ba28", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0968d9b26f0f71e6084fe60a2405ba28")).booleanValue() : this.impl.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean requestFocus(int i, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0472c7c1e1436d45230c02b163ad0524", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0472c7c1e1436d45230c02b163ad0524")).booleanValue() : this.impl.requestFocus(i, rect);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84bfd7e30edc9e7509819702af7d2f3c", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84bfd7e30edc9e7509819702af7d2f3c") : this.impl.startActionMode(callback);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 23)
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87bc7a5baf0b2a3ff9553de75e6ff3cc", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87bc7a5baf0b2a3ff9553de75e6ff3cc") : this.impl.startActionMode(callback, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e102d8d24f4a943b21809c6099819942", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e102d8d24f4a943b21809c6099819942")).booleanValue() : this.impl.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9028f22367b5825ca75796b72dbcd105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9028f22367b5825ca75796b72dbcd105");
            return;
        }
        this.impl.setBackgroundColor(i);
        super.setBackgroundColor(i);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void setLayerType(int i, Paint paint) {
        Object[] objArr = {Integer.valueOf(i), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d7e321c6877c8507811ff9d28131535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d7e321c6877c8507811ff9d28131535");
        } else {
            this.impl.setLayerType(i, paint);
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3402ea77e836990c555c2523ac22b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3402ea77e836990c555c2523ac22b40");
        } else {
            this.impl.onStartTemporaryDetach();
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1629744afcb4534c45f1ef57c6fe672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1629744afcb4534c45f1ef57c6fe672");
        } else {
            this.impl.onFinishTemporaryDetach();
        }
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public Handler getHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca420cc01295f8bfc8cf4092b95457e6", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca420cc01295f8bfc8cf4092b95457e6") : this.impl.getHandler();
    }

    @Override // android.view.ViewGroup, android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public View findFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a5193332b76f5cf888b85a21ac817a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a5193332b76f5cf888b85a21ac817a") : this.impl.findFocus();
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.IWebView
    public boolean onCheckIsTextEditor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6753d6c5796ca8ffbd72a08e5e324aba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6753d6c5796ca8ffbd72a08e5e324aba")).booleanValue() : this.impl.onCheckIsTextEditor();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void clearClientCertPreferences(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d3475c30ae78b78db7d910e3c092838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d3475c30ae78b78db7d910e3c092838");
        } else {
            this.impl.clearClientCertPreferences(runnable);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public Uri getSafeBrowsingPrivacyPolicyUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cda891dc84f6e2841cc5ab612207289", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cda891dc84f6e2841cc5ab612207289") : this.impl.getSafeBrowsingPrivacyPolicyUrl();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public String findAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e5d8c843cb6a8b189bda5227216bd31", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e5d8c843cb6a8b189bda5227216bd31") : this.impl.findAddress(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 21)
    public void enableSlowWholeDocumentDraw() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68b64db743f416fdcfd5cb93a83ec6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68b64db743f416fdcfd5cb93a83ec6de");
        } else {
            this.impl.enableSlowWholeDocumentDraw();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setWebContentsDebuggingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39ea190251e165bd4406a2b572f86409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39ea190251e165bd4406a2b572f86409");
        } else {
            this.impl.setWebContentsDebuggingEnabled(z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setDataDirectorySuffix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400fb14c8694bc344ff22eff47c979b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400fb14c8694bc344ff22eff47c979b6");
        } else {
            this.impl.setDataDirectorySuffix(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void disableWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "612e84bedc6bc11adea3d412d1231b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "612e84bedc6bc11adea3d412d1231b3a");
        } else {
            this.impl.disableWebView();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public ClassLoader getWebViewClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a655f812e104037e4b5527a5c62fbd06", RobustBitConfig.DEFAULT_VALUE) ? (ClassLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a655f812e104037e4b5527a5c62fbd06") : this.impl.getWebViewClassLoader();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    @RequiresApi(api = 26)
    public PackageInfo getCurrentWebViewPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f94c835eba34e7e14ef404c4a6baa64", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f94c835eba34e7e14ef404c4a6baa64") : this.impl.getCurrentWebViewPackage();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void setSafeBrowsingWhitelist(List list, ValueCallback valueCallback) {
        Object[] objArr = {list, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9ee49e3f19e4e536379191f0207f482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9ee49e3f19e4e536379191f0207f482");
        } else {
            this.impl.setSafeBrowsingWhitelist(list, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebView
    public void startSafeBrowsing(Context context, ValueCallback valueCallback) {
        Object[] objArr = {context, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85735516c5a8546dc4eae3770d473f1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85735516c5a8546dc4eae3770d473f1c");
        } else {
            this.impl.startSafeBrowsing(context, valueCallback);
        }
    }
}
