package com.sankuai.meituan.android.knb.proxy;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.proxy.util.HttpResponseUtil;
import com.sankuai.meituan.android.knb.proxy.util.WebResponseMimeAndHeader;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import javax.net.ssl.SSLException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NativeRetryManager {
    private static final String DELETE_RETRY_QUERY = "?titans_retry=1";
    private static final String KEY_HEADER_DNS = "Titans-Request-DNS";
    private static final String KEY_HEADER_ERROR_CODE = "Titans-Request-Error-Code";
    private static final String KEY_HEADER_ERROR_REASON = "Titans-Request-Error-Reason";
    private static final String KEY_HEADER_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    private static final String KEY_HEADER_NETWORK = "Titans-Network";
    private static final String KEY_HEADER_RETRY = "Titans-Retry";
    private static final String KEY_HEADER_SSL_ERROR = "Titans-Request-SSL-Error";
    private static final String KEY_RETRY_QUERY = "titans_retry";
    private static final String VALUE_RETRY_QUERY = "1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile NativeRetryManager sInstance;
    private final Context mContext;

    public NativeRetryManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95be89bd5b3b5db275db75a5eba0ea67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95be89bd5b3b5db275db75a5eba0ea67");
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    public static NativeRetryManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75fed8c1b9114da8edb990a5529268fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeRetryManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75fed8c1b9114da8edb990a5529268fc");
        }
        if (sInstance == null) {
            synchronized (NativeRetryManager.class) {
                if (sInstance == null) {
                    sInstance = new NativeRetryManager(context);
                }
            }
        }
        return sInstance;
    }

    @RequiresApi(api = 21)
    public WebResourceResponse getRetryResponse(WebResourceRequest webResourceRequest) throws IOException {
        z zVar;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba585d3bb236df2d23e25c848a1e00b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba585d3bb236df2d23e25c848a1e00b9");
        }
        if ("GET".equals(webResourceRequest.getMethod())) {
            Uri url = webResourceRequest.getUrl();
            String queryParameter = url.getQueryParameter(KEY_RETRY_QUERY);
            if (TextUtils.isEmpty(queryParameter) || !"1".equals(queryParameter)) {
                return null;
            }
            String replace = url.toString().replace(DELETE_RETRY_QUERY, "");
            HashMap hashMap = new HashMap();
            hashMap.put(KEY_HEADER_EXPOSE_HEADERS, "Titans-Retry,Titans-Network,Titans-Request-DNS,Titans-Request-SSL-Error,Titans-Request-Error-Code,Titans-Request-Error-Reason");
            hashMap.put(KEY_HEADER_RETRY, "true");
            hashMap.put(KEY_HEADER_NETWORK, NetworkUtil.getNetworkTypeString(this.mContext, "pt-f80fb8336a87b895"));
            StringBuilder sb = new StringBuilder();
            InetAddress[] allByName = InetAddress.getAllByName(url.getHost());
            for (int i = 0; i < allByName.length; i++) {
                String hostAddress = allByName[i].getHostAddress();
                if (!TextUtils.isEmpty(hostAddress)) {
                    sb.append(hostAddress);
                    if (i != allByName.length - 1) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
            hashMap.put(KEY_HEADER_DNS, sb.toString());
            try {
                zVar = HttpResponseUtil.executeHttp(null, replace, webResourceRequest.getMethod(), null, null);
            } catch (Exception e) {
                if (e instanceof SSLException) {
                    hashMap.put(KEY_HEADER_SSL_ERROR, "true");
                } else {
                    hashMap.put(KEY_HEADER_ERROR_REASON, e.getMessage());
                }
                zVar = null;
            }
            if (zVar == null) {
                return new WebResourceResponse("text/plain", "UTF-8", 588, "response is null", hashMap, null);
            }
            WebResponseMimeAndHeader buildWebResponseMimeAndHeader = HttpResponseUtil.buildWebResponseMimeAndHeader(zVar);
            String str = !TextUtils.isEmpty(zVar.d) ? zVar.d : "response message is empty";
            if (!zVar.c()) {
                hashMap.put(KEY_HEADER_ERROR_CODE, String.valueOf(zVar.c));
                hashMap.put(KEY_HEADER_ERROR_REASON, str);
                buildWebResponseMimeAndHeader.getHeadersMap().putAll(hashMap);
            }
            return new WebResourceResponse(buildWebResponseMimeAndHeader.getMime(), "UTF-8", zVar.c, str, buildWebResponseMimeAndHeader.getHeadersMap(), zVar.g.d());
        }
        return null;
    }
}
