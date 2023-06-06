package com.sankuai.android.share.keymodule.redirectURL;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.common.bean.RedirectCallbackBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.keymodule.redirectURL.redirect.ShareRedirectBean;
import com.sankuai.android.share.keymodule.redirectURL.redirect.ShareRedirectRetrofitService;
import com.sankuai.android.share.util.j;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.skyeye.library.core.e;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "redirectURLService")
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "redirectURL")
    public void redirectURL(final LyingkitTraceBody lyingkitTraceBody, final Context context, final b.a aVar, final ShareBaseBean shareBaseBean, final c cVar) {
        Call<ShareRedirectBean> shareRedirectUrl;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330a1d8125b944af95fe819d198d5de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330a1d8125b944af95fe819d198d5de8");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用重定向 Service 接口成功");
        if (context == null || shareBaseBean == null) {
            return;
        }
        ArrayList<String> a2 = com.sankuai.android.share.common.util.a.a();
        if (a2 != null && a2.contains(com.meituan.android.base.share.b.a()) && aVar != b.a.COPY && aVar != b.a.MORE_SHARE) {
            ShareDialog.a(context);
            final HashMap hashMap = new HashMap();
            hashMap.put("belong", com.meituan.android.base.share.b.a());
            com.sankuai.android.share.keymodule.redirectURL.redirect.a a3 = com.sankuai.android.share.keymodule.redirectURL.redirect.a.a();
            String appshare = shareBaseBean.getAppshare();
            String url = shareBaseBean.getUrl();
            String a4 = com.sankuai.android.share.keymodule.a.a(aVar);
            Object[] objArr2 = {appshare, url, a4};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.keymodule.redirectURL.redirect.a.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "7eb59efd6e99bb6f978cb44e3c825c86", RobustBitConfig.DEFAULT_VALUE)) {
                shareRedirectUrl = (Call) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "7eb59efd6e99bb6f978cb44e3c825c86");
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("mtShareId", appshare);
                hashMap2.put("url", url);
                hashMap2.put("channel", a4);
                shareRedirectUrl = ((ShareRedirectRetrofitService) a3.b.a(ShareRedirectRetrofitService.class)).getShareRedirectUrl(hashMap2);
            }
            shareRedirectUrl.a(new f<ShareRedirectBean>() { // from class: com.sankuai.android.share.keymodule.redirectURL.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ShareRedirectBean> call, Response<ShareRedirectBean> response) {
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c852d988f96bd639a89c205ab79ffc8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c852d988f96bd639a89c205ab79ffc8e");
                        return;
                    }
                    RedirectCallbackBean redirectCallbackBean = new RedirectCallbackBean(response, null);
                    redirectCallbackBean.channelType = aVar;
                    redirectCallbackBean.context = context;
                    redirectCallbackBean.data = shareBaseBean;
                    redirectCallbackBean.listener = cVar;
                    redirectCallbackBean.map = hashMap;
                    com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_REDIRECTURLSERVICE_REDIRECTCALLBACK, Boolean.TRUE, redirectCallbackBean);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ShareRedirectBean> call, Throwable th) {
                    Object[] objArr3 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "643c8f86b32fb7cfbe69ba7307e582de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "643c8f86b32fb7cfbe69ba7307e582de");
                        return;
                    }
                    RedirectCallbackBean redirectCallbackBean = new RedirectCallbackBean(null, th);
                    redirectCallbackBean.channelType = aVar;
                    redirectCallbackBean.context = context;
                    redirectCallbackBean.data = shareBaseBean;
                    redirectCallbackBean.listener = cVar;
                    redirectCallbackBean.map = hashMap;
                    com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_REDIRECTURLSERVICE_REDIRECTCALLBACK, Boolean.FALSE, redirectCallbackBean);
                }
            });
            return;
        }
        a(lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
    }

    private void a(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96519767266171e012c913b51f3bb38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96519767266171e012c913b51f3bb38");
        } else {
            com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_SHORTURLSERVICE_SHORTURL, context, aVar, shareBaseBean, cVar);
        }
    }

    @NomApiInterface(alias = "redirectCallBack")
    private void redirectCallBack(LyingkitTraceBody lyingkitTraceBody, boolean z, RedirectCallbackBean redirectCallbackBean) {
        Object[] objArr = {lyingkitTraceBody, Byte.valueOf(z ? (byte) 1 : (byte) 0), redirectCallbackBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6505466de5d8c8de0bcb79f90c6ca9c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6505466de5d8c8de0bcb79f90c6ca9c2");
        } else if (redirectCallbackBean == null) {
        } else {
            if (z) {
                if (redirectCallbackBean.response == null) {
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "重定向 URL 异常 --- originalURL:" + redirectCallbackBean.data.getUrl() + "error:网络请求返回为空");
                    a(lyingkitTraceBody, redirectCallbackBean.context, redirectCallbackBean.channelType, redirectCallbackBean.data, redirectCallbackBean.listener);
                    a(redirectCallbackBean, "网络错误");
                    return;
                }
                ShareRedirectBean shareRedirectBean = (ShareRedirectBean) redirectCallbackBean.response.e;
                if (shareRedirectBean != null && shareRedirectBean.data != null && !TextUtils.isEmpty(shareRedirectBean.data.shareUrl)) {
                    if (shareRedirectBean.data.shareUrl.contains("mt_share_id") && shareRedirectBean.data.shareUrl.contains("url")) {
                        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "重定向 URL 成功 redirectURL :" + shareRedirectBean.data.shareUrl);
                    } else {
                        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "重定向 URL 异常 --- originalURL:" + redirectCallbackBean.data.getUrl() + "error:网络请求链接被封");
                    }
                    redirectCallbackBean.data.setUrl(shareRedirectBean.data.shareUrl);
                    j.a(redirectCallbackBean.context, redirectCallbackBean.data, redirectCallbackBean.channelType);
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, redirectCallbackBean.context, redirectCallbackBean.channelType, redirectCallbackBean.data, redirectCallbackBean.listener);
                    e.a().a("biz_share", "share_flow_redict_url", "share_flow_redict_url_success", null);
                    return;
                }
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "重定向 URL 异常 --- originalURL:" + redirectCallbackBean.data.getUrl() + "error:网络请求shareUrl异常");
                a(lyingkitTraceBody, redirectCallbackBean.context, redirectCallbackBean.channelType, redirectCallbackBean.data, redirectCallbackBean.listener);
                a(redirectCallbackBean, shareRedirectBean.code + CommonConstant.Symbol.COLON + shareRedirectBean.msg);
                return;
            }
            if (redirectCallbackBean.t != null) {
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "重定向 URL 失败 --- originalURL:" + redirectCallbackBean.data.getUrl() + "error:" + redirectCallbackBean.t.getMessage());
            }
            a(lyingkitTraceBody, redirectCallbackBean.context, redirectCallbackBean.channelType, redirectCallbackBean.data, redirectCallbackBean.listener);
            a(redirectCallbackBean, "网络错误");
        }
    }

    private void a(RedirectCallbackBean redirectCallbackBean, String str) {
        Object[] objArr = {redirectCallbackBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601d6a1dfc128dbd94caba7bb91e9aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601d6a1dfc128dbd94caba7bb91e9aa6");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str);
        hashMap.put("url", redirectCallbackBean.data != null ? redirectCallbackBean.data.getUrl() : "");
        hashMap.put("belong", com.meituan.android.base.share.b.a());
        e.a().a("biz_share", "share_flow_redict_url", "share_flow_redict_url_error", "重定向url失败", hashMap);
    }
}
