package com.sankuai.android.share.keymodule.shortURL;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.common.bean.ShortUrlCallbackBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.keymodule.shortURL.request.ShareShortUrlBean;
import com.sankuai.android.share.keymodule.shortURL.request.ShareShortUrlRetrofitService;
import com.sankuai.android.share.util.j;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.skyeye.library.core.e;
import java.util.HashMap;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "shortURLService")
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "shortURL")
    public void shortURL(final LyingkitTraceBody lyingkitTraceBody, final Context context, final b.a aVar, final ShareBaseBean shareBaseBean, final c cVar) {
        Call<ShareShortUrlBean> shareShortUrl;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178c7d30fb1018d2c8626e18fa019fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178c7d30fb1018d2c8626e18fa019fef");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用长链转短链 Service 接口成功");
        if (context == null || shareBaseBean == null) {
            return;
        }
        j.a(context, shareBaseBean, aVar);
        if (aVar == b.a.WEIXIN_FRIEDN || aVar == b.a.WEIXIN_CIRCLE) {
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
        } else if (TextUtils.isEmpty(shareBaseBean.getUrl()) || shareBaseBean.hasShortUrl()) {
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
        } else if (com.sankuai.android.share.common.util.a.b()) {
            ShareDialog.a(context);
            com.sankuai.android.share.keymodule.shortURL.request.c a2 = com.sankuai.android.share.keymodule.shortURL.request.c.a(context.getApplicationContext());
            String url = shareBaseBean.getUrl();
            Object[] objArr2 = {url};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.keymodule.shortURL.request.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "74f579bd0d2f3613f2eeeaf7c67c2c4d", RobustBitConfig.DEFAULT_VALUE)) {
                shareShortUrl = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "74f579bd0d2f3613f2eeeaf7c67c2c4d");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("requestId", j.a(6));
                hashMap.put("longUrl", url);
                shareShortUrl = ((ShareShortUrlRetrofitService) a2.b.a(ShareShortUrlRetrofitService.class)).getShareShortUrl(hashMap);
            }
            shareShortUrl.a(new f<ShareShortUrlBean>() { // from class: com.sankuai.android.share.keymodule.shortURL.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ShareShortUrlBean> call, Response<ShareShortUrlBean> response) {
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c0c7d8c0d59374426249401c79d19c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c0c7d8c0d59374426249401c79d19c5");
                        return;
                    }
                    ShortUrlCallbackBean shortUrlCallbackBean = new ShortUrlCallbackBean(response, null);
                    shortUrlCallbackBean.channelType = aVar;
                    shortUrlCallbackBean.data = shareBaseBean;
                    shortUrlCallbackBean.context = context;
                    shortUrlCallbackBean.listener = cVar;
                    com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_SHORTURLSERVICE_SHORTURLCALLBACK, Boolean.TRUE, shortUrlCallbackBean);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ShareShortUrlBean> call, Throwable th) {
                    Object[] objArr3 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7a19f3ce096aecfbbd0b8e58dbfdb6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7a19f3ce096aecfbbd0b8e58dbfdb6e");
                        return;
                    }
                    ShortUrlCallbackBean shortUrlCallbackBean = new ShortUrlCallbackBean(null, th);
                    shortUrlCallbackBean.channelType = aVar;
                    shortUrlCallbackBean.data = shareBaseBean;
                    shortUrlCallbackBean.context = context;
                    shortUrlCallbackBean.listener = cVar;
                    com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_SHORTURLSERVICE_SHORTURLCALLBACK, Boolean.FALSE, shortUrlCallbackBean);
                }
            });
        } else {
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
        }
    }

    @NomApiInterface(alias = "shortURLCallBack")
    private void shortURLCallBack(LyingkitTraceBody lyingkitTraceBody, boolean z, ShortUrlCallbackBean shortUrlCallbackBean) {
        Object[] objArr = {lyingkitTraceBody, Byte.valueOf(z ? (byte) 1 : (byte) 0), shortUrlCallbackBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c695cce64fc9cccf164b5c6c20a7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c695cce64fc9cccf164b5c6c20a7da");
        } else if (z) {
            Response<T> response = shortUrlCallbackBean.response;
            if (response != 0 && response.e != 0) {
                String str = ((ShareShortUrlBean) response.e).shortUrl;
                if (!TextUtils.isEmpty(str)) {
                    shortUrlCallbackBean.data.setShortUrl(str);
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "长链转短链成功 shortURL:" + str);
                    e.a().a("biz_share", "share_flow_short", "share_flow_short_url_success", null);
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, shortUrlCallbackBean.context, shortUrlCallbackBean.channelType, shortUrlCallbackBean.data, shortUrlCallbackBean.listener);
                }
            }
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "长链转短链异常 --- originalURL:" + shortUrlCallbackBean.data.getUrl() + " error:网络请求返回为空");
            a(shortUrlCallbackBean.data, "网络请求返回为空");
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, shortUrlCallbackBean.context, shortUrlCallbackBean.channelType, shortUrlCallbackBean.data, shortUrlCallbackBean.listener);
        } else {
            if (shortUrlCallbackBean.t != null) {
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "长链转短链异常 --- originalURL:" + shortUrlCallbackBean.data.getUrl() + " error:网络请求失败");
            }
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, shortUrlCallbackBean.context, shortUrlCallbackBean.channelType, shortUrlCallbackBean.data, shortUrlCallbackBean.listener);
            a(shortUrlCallbackBean.data, "网络异常");
        }
    }

    private void a(ShareBaseBean shareBaseBean, String str) {
        Object[] objArr = {shareBaseBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52303b44db1bcf091cc179d2a4d59cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52303b44db1bcf091cc179d2a4d59cf7");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", shareBaseBean != null ? shareBaseBean.getUrl() : "");
        hashMap.put("msg", str);
        hashMap.put("belong", com.meituan.android.base.share.b.a());
        e.a().a("biz_share", "share_flow_short", "share_flow_short_url_error", "长链转短链失败", hashMap);
    }
}
