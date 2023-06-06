package com.sankuai.titans.adapter.base.observers.top;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.adapter.base.TitansCrashReporter;
import com.sankuai.titans.adapter.base.observers.SankuaiUrlUtil;
import com.sankuai.titans.config.Certificate;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TopPageLifeCycle extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Config config;

    public TopPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f106d3b7b2dd5041a6ed101fc08493b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f106d3b7b2dd5041a6ed101fc08493b0");
        } else {
            this.config = ConfigManager.getConfig();
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
        Object[] objArr = {iTitansWebPageContext, webUrlLoadParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15bdef91ebedeb50481899cea725e3c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15bdef91ebedeb50481899cea725e3c1")).booleanValue();
        }
        webUrlLoadParam.setUrl(fixURLHost(iTitansWebPageContext.getOriginalUrl()));
        if (SankuaiUrlUtil.isUrlInAccessBlack(webUrlLoadParam.getUrl(), this.config.access)) {
            webUrlLoadParam.setUrl(getUrlForBlack(webUrlLoadParam.getUrl()));
            return true;
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        Object[] objArr = {iTitansWebPageContext, webOverrideUrlLoadingParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45ae4e1cec017ef075b99370aefa8a3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45ae4e1cec017ef075b99370aefa8a3c")).booleanValue();
        }
        if (webOverrideUrlLoadingParam.getUrl().startsWith("//")) {
            webOverrideUrlLoadingParam.setUrl("https:" + webOverrideUrlLoadingParam.getUrl());
        }
        if (SankuaiUrlUtil.isUrlInAccessBlack(webOverrideUrlLoadingParam.getUrl(), this.config.access)) {
            webOverrideUrlLoadingParam.setUrl(getUrlForBlack(webOverrideUrlLoadingParam.getUrl()));
            return true;
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext) {
        Object[] objArr = {iTitansWebPageContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "509ac6cecf9f2d15447ac5318665767c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "509ac6cecf9f2d15447ac5318665767c");
            return;
        }
        super.onWebPageFinish(iTitansWebPageContext);
        TitansCrashReporter.putUrlInMap(iTitansWebPageContext.getContainerContext().toString(), iTitansWebPageContext.getUrl());
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebReceivedSslError(ITitansWebPageContext iTitansWebPageContext, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {iTitansWebPageContext, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7b9c4f3fb4c2436af06581fef1f9a33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7b9c4f3fb4c2436af06581fef1f9a33")).booleanValue();
        }
        boolean z = this.config.switcher.checkSSLError;
        ITitansContext titansContext = iTitansWebPageContext.getContainerContext().getTitansContext();
        return titansContext.getAppInfo().isDebugMode() || !z || isCompanyCDN(sslError.getUrl(), titansContext.getAppInfo().CDNDomain()) || isInCerWhiteList(sslError);
    }

    private String fixURLHost(String str) {
        String sb;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cae53dd70ae03e13706e1a182cce905e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cae53dd70ae03e13706e1a182cce905e");
        }
        String replace = str.replace(CommonConstant.Symbol.SLASH_RIGHT, "/");
        Matcher matcher = Pattern.compile("//(([^/?#]+)@)?[a-z0-9A-Z\\-\\.]+").matcher(replace);
        if (matcher.find() && matcher.groupCount() > 1) {
            String group = matcher.group(2);
            if (!TextUtils.isEmpty(group)) {
                StringBuilder sb2 = new StringBuilder(replace.substring(0, matcher.start() + 2));
                int indexOf = group.indexOf(CommonConstant.Symbol.COLON);
                if (indexOf <= 0) {
                    sb = URLEncoder.encode(group);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        sb3.append(URLEncoder.encode(group.substring(0, indexOf), "utf-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                    sb3.append(CommonConstant.Symbol.COLON);
                    int i = indexOf + 1;
                    if (i < group.length()) {
                        try {
                            sb3.append(URLEncoder.encode(group.substring(i), "utf-8"));
                        } catch (UnsupportedEncodingException unused2) {
                        }
                    }
                    sb = sb3.toString();
                }
                sb2.append(sb);
                sb2.append(replace.substring(matcher.start() + 2 + group.length()));
                return sb2.toString();
            }
        }
        return replace;
    }

    private String getUrlForBlack(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44038f2393a472464693b93fc604fa81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44038f2393a472464693b93fc604fa81");
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
        String country = locale.getCountry();
        return "https://static.meituan.net/bs/mbs-pages/master/error-url.html?language=" + language + "&script=" + script + "&country=" + country + "&oriUrl=" + URLEncoder.encode(str);
    }

    private boolean isCompanyCDN(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71598f7921c42c2aa574a3641ea9813", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71598f7921c42c2aa574a3641ea9813")).booleanValue();
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UrlUtils.hostEndWith(str, set);
    }

    private boolean isInCerWhiteList(SslError sslError) {
        List<Certificate> certificate;
        Object[] objArr = {sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "669da15e262360afc98df4789f765fca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "669da15e262360afc98df4789f765fca")).booleanValue();
        }
        if (sslError.getPrimaryError() != 3) {
            return false;
        }
        String url = sslError.getUrl();
        if (TextUtils.isEmpty(url) || (certificate = this.config.access.getCertificate()) == null) {
            return false;
        }
        String host = Uri.parse(url).getHost();
        Date date = new Date();
        for (int i = 0; i < certificate.size(); i++) {
            try {
                Certificate certificate2 = certificate.get(i);
                if (certificate2 != null) {
                    String str = certificate2.domain;
                    String str2 = certificate2.expires;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        simpleDateFormat.setLenient(false);
                        if (simpleDateFormat.parse(str2).after(date) && UrlUtils.isHostBelongToDomain(host, str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
