package com.sankuai.titans.base.webkit;

import android.graphics.Picture;
import android.support.annotation.RequiresApi;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.HitTestResult;
import com.sankuai.titans.protocol.utils.HttpAuthHandler;
import com.sankuai.titans.protocol.utils.IGet;
import com.sankuai.titans.protocol.utils.JsPromptResult;
import com.sankuai.titans.protocol.utils.JsResult;
import com.sankuai.titans.protocol.utils.PictureListener;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WeakQuoteUtils;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebChromeClient;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.IWebViewClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebKitAdapterUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static WebView.PictureListener from(final PictureListener<WebView> pictureListener) {
        Object[] objArr = {pictureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be9b4d9efcfeaebb14f4b6997f487c8b", RobustBitConfig.DEFAULT_VALUE) ? (WebView.PictureListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be9b4d9efcfeaebb14f4b6997f487c8b") : (WebView.PictureListener) WeakQuoteUtils.from(pictureListener, WebView.PictureListener.class, new IGet<WebView.PictureListener>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final WebView.PictureListener get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a683fd095267d8950e3594620293c4bf", RobustBitConfig.DEFAULT_VALUE) ? (WebView.PictureListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a683fd095267d8950e3594620293c4bf") : new WebView.PictureListener() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.webkit.WebView.PictureListener
                    public void onNewPicture(WebView webView, Picture picture) {
                        Object[] objArr3 = {webView, picture};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "11e240c76be1101323d09411585b174e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "11e240c76be1101323d09411585b174e");
                        } else {
                            PictureListener.this.onNewPicture(webView, picture);
                        }
                    }
                };
            }
        });
    }

    public static HitTestResult from(final WebView.HitTestResult hitTestResult) {
        Object[] objArr = {hitTestResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45672f70e5d5a292f89d2bf618a66a08", RobustBitConfig.DEFAULT_VALUE) ? (HitTestResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45672f70e5d5a292f89d2bf618a66a08") : (HitTestResult) WeakQuoteUtils.from(hitTestResult, HitTestResult.class, new IGet<HitTestResult>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final HitTestResult get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d44c206fbd14d5d6e10a7a26a3c31583", RobustBitConfig.DEFAULT_VALUE) ? (HitTestResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d44c206fbd14d5d6e10a7a26a3c31583") : new HitTestResult() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.HitTestResult
                    public int getType() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "351e777a962b28fd62bd076b860e1feb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "351e777a962b28fd62bd076b860e1feb")).intValue() : hitTestResult.getType();
                    }

                    @Override // com.sankuai.titans.protocol.utils.HitTestResult
                    public String getExtra() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "289416d6987c2a5edcaac73770a9ce39", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "289416d6987c2a5edcaac73770a9ce39") : hitTestResult.getExtra();
                    }
                };
            }
        });
    }

    public static SslErrorHandler from(final android.webkit.SslErrorHandler sslErrorHandler) {
        Object[] objArr = {sslErrorHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "088920efcd7c7ce3d6e4a473a3720385", RobustBitConfig.DEFAULT_VALUE) ? (SslErrorHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "088920efcd7c7ce3d6e4a473a3720385") : (SslErrorHandler) WeakQuoteUtils.from(sslErrorHandler, SslErrorHandler.class, new IGet<SslErrorHandler>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final SslErrorHandler get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b594c029c8d8872b8eb6d88b1058fa33", RobustBitConfig.DEFAULT_VALUE) ? (SslErrorHandler) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b594c029c8d8872b8eb6d88b1058fa33") : new SslErrorHandler() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.SslErrorHandler
                    public void proceed() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bc629f1093c63a7a778a000415e60705", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bc629f1093c63a7a778a000415e60705");
                        } else {
                            sslErrorHandler.proceed();
                        }
                    }

                    @Override // com.sankuai.titans.protocol.utils.SslErrorHandler
                    public void cancel() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5cfe816ea9568690affe0171176a74b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5cfe816ea9568690affe0171176a74b7");
                        } else {
                            sslErrorHandler.cancel();
                        }
                    }
                };
            }
        });
    }

    public static WebResourceError from(final android.webkit.WebResourceError webResourceError) {
        Object[] objArr = {webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b92dadcbb0f98249ee0d4b695ccacd52", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceError) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b92dadcbb0f98249ee0d4b695ccacd52") : (WebResourceError) WeakQuoteUtils.from(webResourceError, WebResourceError.class, new IGet<WebResourceError>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final WebResourceError get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e03b178fa42a2e81f128a312adeeb23", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceError) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e03b178fa42a2e81f128a312adeeb23") : new WebResourceError() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.4.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.WebResourceError
                    @RequiresApi(api = 23)
                    public int getErrorCode() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a128470cf2a59f2664cd1d19c62f417a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a128470cf2a59f2664cd1d19c62f417a")).intValue() : webResourceError.getErrorCode();
                    }

                    @Override // com.sankuai.titans.protocol.utils.WebResourceError
                    @RequiresApi(api = 23)
                    public CharSequence getDescription() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a1119fc5eda0c908c751cb7992521e9a", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a1119fc5eda0c908c751cb7992521e9a") : webResourceError.getDescription();
                    }
                };
            }
        });
    }

    public static HttpAuthHandler from(final android.webkit.HttpAuthHandler httpAuthHandler) {
        Object[] objArr = {httpAuthHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51f30204e76cc6af0558f4be74fbf519", RobustBitConfig.DEFAULT_VALUE) ? (HttpAuthHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51f30204e76cc6af0558f4be74fbf519") : (HttpAuthHandler) WeakQuoteUtils.from(httpAuthHandler, HttpAuthHandler.class, new IGet<HttpAuthHandler>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final HttpAuthHandler get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74a3512b807b4e42405647e196968d5e", RobustBitConfig.DEFAULT_VALUE) ? (HttpAuthHandler) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74a3512b807b4e42405647e196968d5e") : new HttpAuthHandler() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.5.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.HttpAuthHandler
                    public boolean useHttpAuthUsernamePassword() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "226c6a0767688ab11b6fefd4af956a20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "226c6a0767688ab11b6fefd4af956a20")).booleanValue() : httpAuthHandler.useHttpAuthUsernamePassword();
                    }

                    @Override // com.sankuai.titans.protocol.utils.HttpAuthHandler
                    public void cancel() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d29b20b840789ad35b669f0b9a2a1781", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d29b20b840789ad35b669f0b9a2a1781");
                        } else {
                            httpAuthHandler.cancel();
                        }
                    }

                    @Override // com.sankuai.titans.protocol.utils.HttpAuthHandler
                    public void proceed(String str, String str2) {
                        Object[] objArr3 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2641103076729d43e9b77a83568094d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2641103076729d43e9b77a83568094d9");
                        } else {
                            httpAuthHandler.proceed(str, str2);
                        }
                    }
                };
            }
        });
    }

    public static JsResult from(final android.webkit.JsResult jsResult) {
        Object[] objArr = {jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fa3357c31eabb24fdfb51fbd43c6ba7", RobustBitConfig.DEFAULT_VALUE) ? (JsResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fa3357c31eabb24fdfb51fbd43c6ba7") : (JsResult) WeakQuoteUtils.from(jsResult, JsResult.class, new IGet<JsResult>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.6
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final JsResult get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "260923f0ed6fbe904c4e5b145c6a0bc5", RobustBitConfig.DEFAULT_VALUE) ? (JsResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "260923f0ed6fbe904c4e5b145c6a0bc5") : new JsResult() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.6.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.JsResult
                    public void cancel() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6b81aa6174bba467320a5daf5db90eb4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6b81aa6174bba467320a5daf5db90eb4");
                        } else {
                            jsResult.cancel();
                        }
                    }

                    @Override // com.sankuai.titans.protocol.utils.JsResult
                    public void confirm() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "44d68253a371297fa0e8e3cd194bf686", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "44d68253a371297fa0e8e3cd194bf686");
                        } else {
                            jsResult.confirm();
                        }
                    }
                };
            }
        });
    }

    public static JsPromptResult from(final android.webkit.JsPromptResult jsPromptResult) {
        Object[] objArr = {jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d85fa538a56ac7cf4cf5681dd409825a", RobustBitConfig.DEFAULT_VALUE) ? (JsPromptResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d85fa538a56ac7cf4cf5681dd409825a") : (JsPromptResult) WeakQuoteUtils.from(jsPromptResult, JsPromptResult.class, new IGet<JsPromptResult>() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.7
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.titans.protocol.utils.IGet
            public final JsPromptResult get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c60c43f30e71699e8bdabfe5ed07ccfe", RobustBitConfig.DEFAULT_VALUE) ? (JsPromptResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c60c43f30e71699e8bdabfe5ed07ccfe") : new JsPromptResult() { // from class: com.sankuai.titans.base.webkit.WebKitAdapterUtils.7.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.utils.JsPromptResult
                    public void confirm(String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e86ac9b58cb7241bd911b5428dfda5fd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e86ac9b58cb7241bd911b5428dfda5fd");
                        } else {
                            jsPromptResult.confirm(str);
                        }
                    }

                    @Override // com.sankuai.titans.protocol.utils.JsResult
                    public void cancel() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ae7d377497a9e3a41d17945f117aa1c8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ae7d377497a9e3a41d17945f117aa1c8");
                        } else {
                            jsPromptResult.cancel();
                        }
                    }

                    @Override // com.sankuai.titans.protocol.utils.JsResult
                    public void confirm() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "028fea5dbd8947b0145f623677b56fd5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "028fea5dbd8947b0145f623677b56fd5");
                        } else {
                            jsPromptResult.confirm();
                        }
                    }
                };
            }
        });
    }

    public static WebViewClient from(IWebView<WebView> iWebView, IWebViewClient iWebViewClient) {
        Object[] objArr = {iWebView, iWebViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5421615ae8a5405cecc8512931e0ebc2", RobustBitConfig.DEFAULT_VALUE) ? (WebViewClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5421615ae8a5405cecc8512931e0ebc2") : (WebViewClient) WeakQuoteUtils.from(iWebViewClient, WebViewClientAdapter.class, iWebView, iWebViewClient);
    }

    public static WebChromeClient from(IWebView<WebView> iWebView, IWebChromeClient iWebChromeClient) {
        Object[] objArr = {iWebView, iWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "648b0487ad99a4e85d9ca37c801dcefa", RobustBitConfig.DEFAULT_VALUE) ? (WebChromeClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "648b0487ad99a4e85d9ca37c801dcefa") : (WebChromeClient) WeakQuoteUtils.from(iWebChromeClient, WebChromeClientAdapter.class, iWebView, iWebChromeClient);
    }
}
