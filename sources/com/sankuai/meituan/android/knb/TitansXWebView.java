package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.listener.AbsOnWebChromeClientListener;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnFilterTouchListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansXWebView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Args mArgs;
    private KNBWebCompat mKnbWebCompat;
    private int type;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Args {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Bundle extras;
        public boolean enableSlowDraw = false;
        public boolean autoSetCookiesAfterViewCreated = true;
        public boolean autoInflateTitleBar = true;
    }

    public TitansXWebView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d9b47c3af272ff4a7ecc07c7ede005", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d9b47c3af272ff4a7ecc07c7ede005");
        } else {
            init(context, null);
        }
    }

    public TitansXWebView(Context context, Args args) {
        super(context);
        Object[] objArr = {context, args};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15957040f5ec3d59537d3863e7c46070", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15957040f5ec3d59537d3863e7c46070");
            return;
        }
        this.mArgs = args;
        init(context, null);
    }

    public TitansXWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33303d7bd4bd4580d35b240104d562d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33303d7bd4bd4580d35b240104d562d");
        } else {
            init(context, attributeSet);
        }
    }

    public TitansXWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68f596270c2d79353a1e57115cf7a654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68f596270c2d79353a1e57115cf7a654");
        } else {
            init(context, attributeSet);
        }
    }

    private void init(@NonNull Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9546674792f478309e87725683ba0ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9546674792f478309e87725683ba0ad1");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.noTitleBar, R.attr.delegateType, R.attr.loadUrl});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        int i = obtainStyledAttributes.getInt(1, 0);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        this.type = i;
        this.mKnbWebCompat = KNBWebCompactFactory.getKNBCompact(this.type);
        if (this.mArgs == null) {
            this.mArgs = new Args();
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", string);
        this.mKnbWebCompat.setEnableSlowDraw(this.mArgs.enableSlowDraw);
        if (this.mArgs.extras != null) {
            bundle.putAll(this.mArgs.extras);
        }
        this.mKnbWebCompat.onCreate(context, bundle);
        this.mKnbWebCompat.setAutoSetCookiesAfterViewCreated(this.mArgs.autoSetCookiesAfterViewCreated);
        this.mKnbWebCompat.setAutoInflateTitleBar(this.mArgs.autoInflateTitleBar);
        addView(this.mKnbWebCompat.onCreateView(LayoutInflater.from(context), this));
        if (z) {
            this.mKnbWebCompat.getWebSettings().invisibleTitleBar();
        } else {
            this.mKnbWebCompat.getWebSettings().visibleTitleBar();
        }
        this.mKnbWebCompat.getWebSettings().setLoadUrl(string);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.mKnbWebCompat.onActivityCreated(null);
    }

    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b9058e798e26e5fd82d478d9b056eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b9058e798e26e5fd82d478d9b056eb");
        } else {
            this.mKnbWebCompat.onStart();
        }
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995a629fac2d3d28bbef9dedab21d051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995a629fac2d3d28bbef9dedab21d051");
        } else {
            this.mKnbWebCompat.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "652970004ea46dca7a656cac7e5d4d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "652970004ea46dca7a656cac7e5d4d6d");
        } else {
            this.mKnbWebCompat.onSaveInstanceState(bundle);
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c31b6b5120a1202c3aa2d8933127b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c31b6b5120a1202c3aa2d8933127b6");
        } else {
            this.mKnbWebCompat.onPause();
        }
    }

    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4df563394f0624bf74c5435087103633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4df563394f0624bf74c5435087103633");
        } else {
            this.mKnbWebCompat.onStop();
        }
    }

    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "916ff9dc2850e241c16abc2d1d222894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "916ff9dc2850e241c16abc2d1d222894");
        } else {
            this.mKnbWebCompat.getWebHandler().loadUrl(str);
        }
    }

    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e865a09d45c5cf22e159c0109fcf394", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e865a09d45c5cf22e159c0109fcf394") : this.mKnbWebCompat.getWebHandler().getUrl();
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0c3423c99c5b23d8546e775294fed81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0c3423c99c5b23d8546e775294fed81");
        } else {
            this.mKnbWebCompat.getWebHandler().loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e8ec26050f30c1f8c05fd9d1b415ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e8ec26050f30c1f8c05fd9d1b415ac8");
        } else {
            this.mKnbWebCompat.getWebHandler().reload();
        }
    }

    public void postUrl(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "475d92294b647eaeab09813dda2c721d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "475d92294b647eaeab09813dda2c721d");
        } else {
            this.mKnbWebCompat.getWebHandler().postUrl(str, bArr);
        }
    }

    public boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87261230fd2bf2a40bfa30c4782d9005", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87261230fd2bf2a40bfa30c4782d9005")).booleanValue() : this.mKnbWebCompat.getWebHandler().canGoBack();
    }

    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2630ef479769be9e254eb233534d7802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2630ef479769be9e254eb233534d7802");
        } else {
            this.mKnbWebCompat.getWebHandler().goBack();
        }
    }

    public void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db6c4636b5c5de10cb1cfcb2d1839346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db6c4636b5c5de10cb1cfcb2d1839346");
        } else {
            this.mKnbWebCompat.getWebHandler().clearHistory();
        }
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1542c0d43bc2c4e0d60c4c7f2604c9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1542c0d43bc2c4e0d60c4c7f2604c9ac");
        } else {
            this.mKnbWebCompat.onDestroy();
        }
    }

    public void setOnWebViewClientListener(OnWebClientListener onWebClientListener) {
        Object[] objArr = {onWebClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de630e4206339caf7a01af1028d9ff84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de630e4206339caf7a01af1028d9ff84");
        } else {
            this.mKnbWebCompat.setOnWebViewClientListener(onWebClientListener);
        }
    }

    public void setOnWebChromeClientListener(AbsOnWebChromeClientListener absOnWebChromeClientListener) {
        Object[] objArr = {absOnWebChromeClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c007a48f7e576b323efe9c44f5e3a39f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c007a48f7e576b323efe9c44f5e3a39f");
        } else {
            this.mKnbWebCompat.setOnWebChromeClientListener(absOnWebChromeClientListener);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        Object[] objArr = {webViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c39bfbe149329e8c9249abcbf4defb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c39bfbe149329e8c9249abcbf4defb");
        } else {
            this.mKnbWebCompat.getWebHandler().setWebViewClient(webViewClient);
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        Object[] objArr = {downloadListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7acddb18619b1f9b9c542f02a024bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7acddb18619b1f9b9c542f02a024bfd");
        } else {
            this.mKnbWebCompat.getWebHandler().setDownloadListener(downloadListener);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        Object[] objArr = {webChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4257444e84c93b07faa942afb5fe5a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4257444e84c93b07faa942afb5fe5a6");
        } else {
            this.mKnbWebCompat.getWebHandler().setWebChromeClient(webChromeClient);
        }
    }

    @Nullable
    public WebSettings getSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b77300721adb496a02d50c4a4ac9a09", RobustBitConfig.DEFAULT_VALUE) ? (WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b77300721adb496a02d50c4a4ac9a09") : this.mKnbWebCompat.getWebHandler().getSettings();
    }

    public void setOnAppendAnalyzeListener(OnAnalyzeParamsListener onAnalyzeParamsListener) {
        Object[] objArr = {onAnalyzeParamsListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a92a766055a32a012f156312603a3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a92a766055a32a012f156312603a3ed");
        } else {
            this.mKnbWebCompat.setOnAnalyzeParamsListener(onAnalyzeParamsListener);
        }
    }

    public float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c50c42163c61989ab5048432c09d6e1", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c50c42163c61989ab5048432c09d6e1")).floatValue() : this.mKnbWebCompat.getWebHandler().getScale();
    }

    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72272c5d426e60ed59218a7921dfe8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72272c5d426e60ed59218a7921dfe8db");
        } else {
            this.mKnbWebCompat.getWebHandler().stopLoading();
        }
    }

    public void setOnFilterTouchListener(OnFilterTouchListener onFilterTouchListener) {
        Object[] objArr = {onFilterTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be97ee65077eab9917f47a7f24c87ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be97ee65077eab9917f47a7f24c87ca0");
        } else {
            this.mKnbWebCompat.setOnFilterTouchListener(onFilterTouchListener);
        }
    }

    public void setHorizontalScrollBarEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76fd993088470b4e7b6fa1fc61c4a8fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76fd993088470b4e7b6fa1fc61c4a8fa");
        } else {
            this.mKnbWebCompat.getWebHandler().setHorizontalScrollBarEnable(z);
        }
    }

    public void setVerticalScrollBarEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e7a314e443b912b9011d73a29df6783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e7a314e443b912b9011d73a29df6783");
        } else {
            this.mKnbWebCompat.getWebHandler().setVerticalScrollBarEnable(z);
        }
    }

    public KNBWebCompat getmKnbWebCompat() {
        return this.mKnbWebCompat;
    }
}
