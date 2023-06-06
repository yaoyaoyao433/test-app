package com.sankuai.titans.adapter.base.observers.tail;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.Utils;
import com.sankuai.titans.adapter.base.observers.SankuaiUrlUtil;
import com.sankuai.titans.adapter.base.observers.UrlTokenUtils;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.utils.UrlUtils;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.tencent.mapsdk.internal.y;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TailPageLifeCycle extends WebPageLifeCycleAdapter {
    private static final String ENCODING_UTF = "UTF-8";
    private static final String FORBIDDEN = "禁止访问";
    private static final String MIME_TYPE_PLAIN = "text/plain";
    public static final String URL_PARAM_NEW_TASK = "_new_task";
    public static final String URL_PARAM_NO_RESULT = "noresult";
    public static final String URL_PARAM_OPEN_IN_APP = "_knbopeninapp";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static List<String> sCacheList;
    private final Config config;

    public TailPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2868401d1c9a97061c19ff0d3c40ec2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2868401d1c9a97061c19ff0d3c40ec2");
        } else {
            this.config = ConfigManager.getConfig();
        }
    }

    private String removeToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b82ccebc340d29ccb8cfd9c04f48e04a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b82ccebc340d29ccb8cfd9c04f48e04a") : needRemoveToken(str, str) ? UrlTokenUtils.removeTokenInUrl(str) : str;
    }

    private String removeTokenInReferer(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "217b8673aa3f5c9677a58d8aada62a0f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "217b8673aa3f5c9677a58d8aada62a0f") : needRemoveToken(str, str2) ? UrlTokenUtils.removeTokenInUrl(str2) : str2;
    }

    private boolean needRemoveToken(String str, String str2) {
        List<String> accessInternalWhiteList;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dffee0b8442cdb02aa0624743e25df75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dffee0b8442cdb02aa0624743e25df75")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.config == null || this.config.access == null || !UrlTokenUtils.containTokenInUrlQuery(str2) || (accessInternalWhiteList = this.config.access.getAccessInternalWhiteList()) == null || accessInternalWhiteList.isEmpty()) {
            return false;
        }
        return !UrlUtils.hostEndWith(str, new HashSet(accessInternalWhiteList));
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
        Object[] objArr = {iTitansWebPageContext, webUrlLoadParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c6399dcde57a0f3fa5c011e0e4a2d38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c6399dcde57a0f3fa5c011e0e4a2d38")).booleanValue();
        }
        String url = webUrlLoadParam.getUrl();
        String referer = webUrlLoadParam.getReferer();
        webUrlLoadParam.setUrl(removeToken(url));
        webUrlLoadParam.setReferer(removeTokenInReferer(url, referer));
        if (SankuaiUrlUtil.isUrlInAccessWhite(webUrlLoadParam.getUrl(), this.config.access)) {
            return true;
        }
        IAppTitansInfo appInfo = iTitansWebPageContext.getContainerContext().getTitansContext().getAppInfo();
        webUrlLoadParam.setUrl(getUrlForWebSafe(webUrlLoadParam.getUrl(), AppUtils.getVersionName(iTitansWebPageContext.getContainerContext().getActivity()), appInfo.titansAppId(), appInfo.isDebugMode()));
        return true;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        Object[] objArr = {iTitansWebPageContext, webOverrideUrlLoadingParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed4e6dd2e1c2001200c811dff7e4edfc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed4e6dd2e1c2001200c811dff7e4edfc")).booleanValue();
        }
        String url = webOverrideUrlLoadingParam.getUrl();
        String referer = webOverrideUrlLoadingParam.getReferer();
        webOverrideUrlLoadingParam.setUrl(removeToken(url));
        webOverrideUrlLoadingParam.setReferer(removeTokenInReferer(url, referer));
        String url2 = webOverrideUrlLoadingParam.getUrl();
        if (TextUtils.isEmpty(url2)) {
            return false;
        }
        ITitansContainerContext containerContext = iTitansWebPageContext.getContainerContext();
        if (isNeedHandleUrl(iTitansWebPageContext, url2) && handleUri(containerContext, webOverrideUrlLoadingParam.getReferer(), Uri.parse(url2))) {
            webOverrideUrlLoadingParam.setUrl(null);
            return true;
        }
        try {
            Uri parse = Uri.parse(url2);
            if (!TextUtils.isEmpty(parse.getScheme()) && !SankuaiUrlUtil.isSchemeHTTPOrHTTPS(parse)) {
                containerContext.getTitansContext().getServiceManager().getToastService().showShortToast(iTitansWebPageContext.getContainerContext().getActivity(), String.format("不允许打开\"%s\"外部地址", parse.getScheme()));
                webOverrideUrlLoadingParam.setUrl(null);
                return true;
            }
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("page", url2);
            containerContext.getTitansContext().getServiceManager().getStatisticsService().reportClassError("TailPageLifeCycle", "onWebOverrideUrlLoading", th, hashMap);
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, String str) {
        Object[] objArr = {iTitansWebPageContext, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a8b7d42fd29718d847b7ae63211771c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a8b7d42fd29718d847b7ae63211771c");
        }
        try {
            return getForbiddenResponse(iTitansWebPageContext.getContainerContext().getActivity(), str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1904ec647fbc3f8af19d4428fd0734c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1904ec647fbc3f8af19d4428fd0734c2");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return getForbiddenResponse(iTitansWebPageContext.getContainerContext().getActivity(), webResourceRequest.getUrl() == null ? null : webResourceRequest.getUrl().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private WebResourceResponse getForbiddenResponse(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a42ed691a5ee9bc6eaf810081a2be20", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a42ed691a5ee9bc6eaf810081a2be20");
        }
        if (isForbiddenFileUri(context, Uri.parse(str))) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(FORBIDDEN.getBytes());
            if (Build.VERSION.SDK_INT < 21) {
                return new WebResourceResponse("text/plain", "UTF-8", byteArrayInputStream);
            }
            return new WebResourceResponse("text/plain", "UTF-8", 403, "forbidden", new HashMap(), byteArrayInputStream);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isForbiddenFileUri(android.content.Context r13, android.net.Uri r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.changeQuickRedirect
            java.lang.String r11 = "67ed671e3500abf63038f5e092c999e2"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L25:
            if (r14 != 0) goto L28
            return r8
        L28:
            java.lang.String r0 = r14.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb2
            java.lang.String r0 = r14.getPath()
            if (r0 == 0) goto L4d
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L49
            java.lang.String r14 = r14.getPath()     // Catch: java.io.IOException -> L49
            r1.<init>(r14)     // Catch: java.io.IOException -> L49
            java.lang.String r14 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L49
            goto L4e
        L49:
            r14 = move-exception
            r14.printStackTrace()
        L4d:
            r14 = r0
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L55
            return r9
        L55:
            java.util.List<java.lang.String> r0 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList
            if (r0 != 0) goto L97
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList = r0
            java.lang.String r0 = com.sankuai.titans.protocol.utils.CacheDirUtil.getCacheDirPath(r13)
            java.lang.String r13 = r13.getPackageName()
            int r1 = r0.indexOf(r13)
            java.util.List<java.lang.String> r2 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.substring(r8, r1)
            r3.append(r0)
            r3.append(r13)
            java.lang.String r13 = "/h5/"
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            r2.add(r13)
            java.util.List<java.lang.String> r13 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList
            java.lang.String r0 = "/android_asset/"
            r13.add(r0)
            java.util.List<java.lang.String> r13 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList
            java.lang.String r0 = "/android_res/"
            r13.add(r0)
        L97:
            java.util.List<java.lang.String> r13 = com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.sCacheList
            java.util.Iterator r13 = r13.iterator()
        L9d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L9d
            goto Lb1
        Lb0:
            r8 = 1
        Lb1:
            return r8
        Lb2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.adapter.base.observers.tail.TailPageLifeCycle.isForbiddenFileUri(android.content.Context, android.net.Uri):boolean");
    }

    private boolean isNeedHandleUrl(ITitansWebPageContext iTitansWebPageContext, String str) {
        Object[] objArr = {iTitansWebPageContext, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d0bba56135c0362d692f3ba0791652a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d0bba56135c0362d692f3ba0791652a")).booleanValue();
        }
        Uri parse = Uri.parse(str);
        return SankuaiUrlUtil.isSchemeInWhite(parse.getScheme(), iTitansWebPageContext.getContainerContext().getTitansContext().getAppInfo().getSchemeWhiteSet(), this.config.scheme) || isOpenInOtherApp(parse);
    }

    private boolean isOpenInOtherApp(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87f2a8c9c16955496b3380554c4e1e9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87f2a8c9c16955496b3380554c4e1e9b")).booleanValue();
        }
        return URLUtil.isNetworkUrl(uri.toString()) && "2".equals(uri.isHierarchical() ? uri.getQueryParameter("openInApp") : null);
    }

    private boolean handleUri(ITitansContainerContext iTitansContainerContext, String str, @NonNull Uri uri) {
        boolean z;
        Object[] objArr = {iTitansContainerContext, str, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba6ec3b2fc5d3bc04d62616516d8f63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba6ec3b2fc5d3bc04d62616516d8f63")).booleanValue();
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            String scheme = uri.getScheme();
            String packageName = AppUtils.getPackageName(iTitansContainerContext.getActivity());
            boolean isHierarchical = uri.isHierarchical();
            String queryParameter = isHierarchical ? uri.getQueryParameter("_knbopeninapp") : null;
            String queryParameter2 = isHierarchical ? uri.getQueryParameter("openInApp") : null;
            if (((Build.VERSION.SDK_INT < 25 || !(("imeituan".equals(scheme) && "com.sankuai.meituan".equals(packageName)) || "meituanpayment".equals(scheme))) && !(isHierarchical && ("1".equals(queryParameter) || "1".equals(queryParameter2)))) || TextUtils.isEmpty(packageName)) {
                z = true;
            } else {
                intent.setPackage(packageName);
                z = false;
            }
            if (z && uri.isHierarchical() && "1".equals(uri.getQueryParameter("_new_task"))) {
                intent.addFlags(y.a);
            }
            boolean equals = "tel".equals(scheme);
            if (equals) {
                intent.setAction("android.intent.action.DIAL");
            }
            intent.putExtra(Utils.EXTRA_NEED_EXCEPTION, true);
            intent.putExtra(Constants.TRAFFIC_REFERER, str);
            intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, "titans");
            if (!hasActivityHandleUri(iTitansContainerContext.getActivity(), uri) && !equals && !"geo".equals(scheme) && !"mailto".equals(scheme) && (!isHierarchical || !"1".equals(uri.getQueryParameter("noresult")))) {
                iTitansContainerContext.startActivityForResult(intent, 110);
                return true;
            }
            iTitansContainerContext.startActivity(intent);
            return true;
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("page", uri.toString());
            iTitansContainerContext.getTitansContext().getServiceManager().getStatisticsService().reportClassError("TailPageLifeCycle", "handleUri", th, hashMap);
            return false;
        }
    }

    private String getUrlForWebSafe(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "364a3b84fd57561a8ab0bfd2259d1825", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "364a3b84fd57561a8ab0bfd2259d1825");
        }
        Uri.Builder buildUpon = Uri.parse(com.sankuai.titans.adapter.base.Constants.WEBSAFE_HOST + "/websafe").buildUpon();
        buildUpon.appendQueryParameter("url", str);
        if (!TextUtils.isEmpty(str3)) {
            buildUpon.appendQueryParameter("appId", str3);
        }
        buildUpon.appendQueryParameter("appVersion", str2);
        Locale locale = Locale.getDefault();
        buildUpon.appendQueryParameter("language", locale.getLanguage());
        if (Build.VERSION.SDK_INT >= 21) {
            buildUpon.appendQueryParameter("script", locale.getScript());
        }
        buildUpon.appendQueryParameter(GearsLocator.COUNTRY, locale.getCountry());
        if (z) {
            buildUpon.appendQueryParameter("isKNBDebug", "true");
        }
        return buildUpon.toString();
    }

    private static boolean hasActivityHandleUri(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75905e74f8aa19b805ed20272b4a30ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75905e74f8aa19b805ed20272b4a30ff")).booleanValue();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
            if (resolveActivity != null) {
                if (resolveActivity.activityInfo.launchMode == 2) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
