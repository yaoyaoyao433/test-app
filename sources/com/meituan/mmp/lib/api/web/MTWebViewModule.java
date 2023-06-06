package com.meituan.mmp.lib.api.web;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.api.web.f;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.page.view.m;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mtwebkit.MTConsoleMessage;
import com.meituan.mtwebkit.MTRenderProcessGoneDetail;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.mtwebkit.MTWebResourceRequest;
import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.mtwebkit.MTWebSettings;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebViewModule extends BaseWebViewModule {
    public static ChangeQuickRedirect n;
    public MTValueCallback<Uri[]> o;
    private r q;

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final /* bridge */ /* synthetic */ void a(b bVar) {
        super.a(bVar);
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule, com.meituan.mmp.lib.api.InternalApi
    public final /* bridge */ /* synthetic */ String[] b() {
        return super.b();
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule, com.meituan.mmp.lib.api.AbsApi
    public /* bridge */ /* synthetic */ void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        super.invoke(str, jSONObject, iApiCallback);
    }

    public MTWebViewModule(com.meituan.mmp.lib.api.h hVar, r rVar) {
        super(hVar);
        Object[] objArr = {hVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a5eccbb35e1a475a2f47b37d3398b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a5eccbb35e1a475a2f47b37d3398b9");
        } else {
            this.q = rVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final h c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31c45a0edb23afbc405040d62129a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31c45a0edb23afbc405040d62129a92");
        }
        final h hVar = new h(getContext());
        c cVar = new c(getContext(), getAppConfig(), getPageByPageId(this.k));
        super.a((b) cVar);
        MTWebSettings settings = cVar.getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(com.meituan.mmp.lib.utils.f.a(getContext(), "databases").getAbsolutePath());
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(getContext(), "webviewcache").getAbsolutePath());
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused) {
        }
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused2) {
        }
        settings.setUserAgentString(d(jSONObject.optString("mmp_ua_append", null)));
        cVar.addJavascriptInterface(new WebJSBridge(this.i, cVar, jSONObject, this.d), "__wx");
        cVar.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.mmp.lib.api.web.MTWebViewModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr2 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0062899e6a440e49d1ba439debfa86fd", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0062899e6a440e49d1ba439debfa86fd")).booleanValue();
                }
                if (mTConsoleMessage.messageLevel() == MTConsoleMessage.MessageLevel.ERROR) {
                    Log.e("web-view", "[error] " + mTConsoleMessage.message());
                    Log.e("web-view", "[error] sourceId = " + mTConsoleMessage.sourceId());
                    Log.e("web-view", "[error] lineNumber = " + mTConsoleMessage.lineNumber());
                } else {
                    Log.e("web-view", mTConsoleMessage.message());
                }
                return super.onConsoleMessage(mTConsoleMessage);
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public void onReceivedTitle(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d41329196ca6230417d44677e987070", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d41329196ca6230417d44677e987070");
                    return;
                }
                super.onReceivedTitle(mTWebView, str);
                if (!mTWebView.isAttachedToWindow() || TextUtils.isEmpty(str) || TextUtils.isEmpty(mTWebView.getUrl()) || mTWebView.getUrl().contains(str)) {
                    return;
                }
                MTWebViewModule.this.i.a(new Event("setNavigationBarTitle", "{title:'" + str + "'}", null), (com.meituan.mmp.lib.interfaces.a) null);
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public boolean onShowFileChooser(MTWebView mTWebView, MTValueCallback<Uri[]> mTValueCallback, MTWebChromeClient.FileChooserParams fileChooserParams) {
                Object[] objArr2 = {mTWebView, mTValueCallback, fileChooserParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5c29c2a479e648fa4b76630333336de", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5c29c2a479e648fa4b76630333336de")).booleanValue();
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    MTWebViewModule.this.startActivityForResult(fileChooserParams.createIntent(), null);
                    MTWebViewModule.this.o = mTValueCallback;
                    return true;
                }
                return super.onShowFileChooser(mTWebView, mTValueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(final MTValueCallback<Uri> mTValueCallback, String str) {
                Object[] objArr2 = {mTValueCallback, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf0c30381ec6dbaea7e517908602bc5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf0c30381ec6dbaea7e517908602bc5d");
                    return;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (TextUtils.isEmpty(str)) {
                    intent.setType("*/*");
                } else {
                    intent.setType(str);
                }
                MTWebViewModule.this.startActivityForResult(intent, null);
                MTWebViewModule.this.o = new MTValueCallback<Uri[]>() { // from class: com.meituan.mmp.lib.api.web.MTWebViewModule.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mtwebkit.MTValueCallback
                    public final /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                        Uri[] uriArr2 = uriArr;
                        Object[] objArr3 = {uriArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a218b4ef2c2527e701ec94b5a861c3de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a218b4ef2c2527e701ec94b5a861c3de");
                        } else if (uriArr2 == null || uriArr2.length <= 0) {
                        } else {
                            mTValueCallback.onReceiveValue(uriArr2[0]);
                        }
                    }
                };
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public void onProgressChanged(MTWebView mTWebView, int i) {
                final f progressBar;
                Object[] objArr2 = {mTWebView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d7093c637ae559ea53d2e0dd41a1f48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d7093c637ae559ea53d2e0dd41a1f48");
                } else if (MTWebViewModule.this.m || (progressBar = hVar.getProgressBar()) == null || i <= progressBar.getCurProgress()) {
                } else {
                    if (8 == progressBar.getVisibility()) {
                        progressBar.setVisibility(0);
                    }
                    progressBar.a(i, new f.a() { // from class: com.meituan.mmp.lib.api.web.MTWebViewModule.1.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.api.web.f.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66eb6d11b9fa7c8060aafd44cb2d652b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66eb6d11b9fa7c8060aafd44cb2d652b");
                            } else if (progressBar.getVisibility() == 0 && progressBar.getCurProgress() == 100) {
                                progressBar.a();
                            }
                        }
                    });
                    super.onProgressChanged(mTWebView, i);
                }
            }
        });
        cVar.setWebViewClient(new MTWebViewClient() { // from class: com.meituan.mmp.lib.api.web.MTWebViewModule.2
            public static ChangeQuickRedirect a;
            private com.meituan.mmp.lib.resource.c c = new com.meituan.mmp.lib.resource.c();
            private boolean d = false;

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
                Object[] objArr2 = {mTWebView, mTRenderProcessGoneDetail};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba20e7464f6f741969b7868bbee7b034", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba20e7464f6f741969b7868bbee7b034")).booleanValue();
                }
                r rVar = MTWebViewModule.this.q;
                boolean didCrash = mTRenderProcessGoneDetail.didCrash();
                int rendererPriorityAtExit = mTRenderProcessGoneDetail.rendererPriorityAtExit();
                rVar.a(mTWebView, didCrash, rendererPriorityAtExit, "MTWebViewModule" + mTWebView.getUrl(), (com.meituan.mmp.lib.web.h) null);
                return true;
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
                Object[] objArr2 = {mTWebView, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6841ad6172cf6a0f48e5879c65e3d776", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6841ad6172cf6a0f48e5879c65e3d776");
                    return;
                }
                this.d = false;
                if (Build.VERSION.SDK_INT >= 19) {
                    mTWebView.evaluateJavascript(BaseWebViewModule.l, null);
                } else {
                    mTWebView.loadUrl(BaseWebViewModule.l);
                }
                super.onPageStarted(mTWebView, str, bitmap);
                MTWebViewModule.this.e(str);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onPageFinished(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07d6ab23be2f4023671a03c33399436f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07d6ab23be2f4023671a03c33399436f");
                    return;
                }
                super.onPageFinished(mTWebView, str);
                MTWebViewModule.this.m = true;
                if (Build.VERSION.SDK_INT >= 19) {
                    mTWebView.evaluateJavascript(BaseWebViewModule.l, null);
                } else {
                    mTWebView.loadUrl(BaseWebViewModule.l);
                }
                MTWebViewModule.this.a(mTWebView);
                if (!this.d) {
                    MTWebViewModule.this.f(str);
                }
                MTWebViewModule.this.g();
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onReceivedError(MTWebView mTWebView, int i, String str, String str2) {
                Object[] objArr2 = {mTWebView, Integer.valueOf(i), str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5205104e8eba921e41155648cda84b5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5205104e8eba921e41155648cda84b5e");
                    return;
                }
                super.onReceivedError(mTWebView, i, str, str2);
                this.d = true;
                MTWebViewModule.this.a(i, str, str2);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final boolean shouldOverrideUrlLoading(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58b7a0949e70a7f56a31739c3eeefa42", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58b7a0949e70a7f56a31739c3eeefa42")).booleanValue();
                }
                if (MTWebViewModule.this.g(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(mTWebView, str);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            @TargetApi(21)
            public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
                Object[] objArr2 = {mTWebView, mTWebResourceRequest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aedf2763fffda8fd0f1edbcc7d856042", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aedf2763fffda8fd0f1edbcc7d856042");
                }
                MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) m.a(mTWebView.getContext(), MTWebViewModule.this.getAppConfig(), mTWebResourceRequest.getUrl().toString(), this.c);
                return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad173359dd632c203fe283b03291263f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad173359dd632c203fe283b03291263f");
                }
                MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) m.a(mTWebView.getContext(), MTWebViewModule.this.getAppConfig(), str, this.c);
                return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, str);
            }
        });
        cVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.meituan.mmp.lib.api.web.MTWebViewModule.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df6adf28377a95c214a725bb7936ada6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df6adf28377a95c214a725bb7936ada6")).booleanValue();
                }
                MTWebView.HitTestResult hitTestResult = ((MTWebView) view).getHitTestResult();
                if (hitTestResult != null) {
                    MTWebViewModule.this.getActivity();
                    MTWebViewModule.this.getAppConfig();
                    hitTestResult.getType();
                    hitTestResult.getExtra();
                    return false;
                }
                return false;
            }
        });
        hVar.a(cVar, cVar);
        return hVar;
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final boolean a(h hVar, String str) {
        MTWebView mTWebView;
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a158ccfbb80dd1ac86068eacdd551ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a158ccfbb80dd1ac86068eacdd551ac")).booleanValue();
        }
        if (hVar == null || (mTWebView = (MTWebView) hVar.getWebView()) == null) {
            return false;
        }
        mTWebView.loadUrl(str);
        return true;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a564524428cc2df6e542507ca4ab6b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a564524428cc2df6e542507ca4ab6b2");
        } else if (Build.VERSION.SDK_INT < 21 || this.o == null) {
        } else {
            this.o.onReceiveValue(MTWebChromeClient.FileChooserParams.parseResult(i, intent));
        }
    }
}
