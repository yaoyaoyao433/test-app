package com.meituan.android.nom;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.util.Pair;
import android.util.SparseArray;
import com.meituan.android.nom.base.a;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.bean.PasswordCallbackBean;
import com.sankuai.android.share.common.bean.QQCallbackBean;
import com.sankuai.android.share.common.bean.RedirectCallbackBean;
import com.sankuai.android.share.common.bean.ShortUrlCallbackBean;
import com.sankuai.android.share.common.bean.WeixinCallbackBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.e;
import com.sankuai.android.share.keymodule.shareChannel.service.b;
import com.sankuai.android.share.keymodule.shareChannel.service.c;
import com.sankuai.android.share.keymodule.shareChannel.service.d;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public final class LyingkitKernel_share implements a {
    private static final String SHARE_COPYSERVICE = "share_copyService";
    public static final String SHARE_COPYSERVICE_COPY = "share_copyService_copy";
    private static final String SHARE_PANELSERVICE = "share_panelService";
    public static final String SHARE_PANELSERVICE_SHOW = "share_panelService_show";
    private static final String SHARE_PASSWORDSERVICE = "share_passwordService";
    public static final String SHARE_PASSWORDSERVICE_GETALERTINFO = "share_passwordService_getAlertInfo";
    public static final String SHARE_PASSWORDSERVICE_GETPASSWORDCALLBACK = "share_passwordService_getPasswordCallBack";
    public static final String SHARE_PASSWORDSERVICE_PASSWORD = "share_passwordService_password";
    public static final String SHARE_PASSWORDSERVICE_SHOW = "share_passwordService_show";
    private static final String SHARE_PROCESSURLSERVICE = "share_processURLService";
    public static final String SHARE_PROCESSURLSERVICE_PROCESSCALLBACK = "share_processURLService_processCallBack";
    public static final String SHARE_PROCESSURLSERVICE_PROCESSURL = "share_processURLService_processURL";
    private static final String SHARE_QQSHARESERVICE = "share_qqShareService";
    public static final String SHARE_QQSHARESERVICE_QQ = "share_qqShareService_qq";
    public static final String SHARE_QQSHARESERVICE_SHARECALLBACK = "share_qqShareService_shareCallBack";
    private static final String SHARE_REDIRECTURLSERVICE = "share_redirectURLService";
    public static final String SHARE_REDIRECTURLSERVICE_REDIRECTCALLBACK = "share_redirectURLService_redirectCallBack";
    public static final String SHARE_REDIRECTURLSERVICE_REDIRECTURL = "share_redirectURLService_redirectURL";
    private static final String SHARE_SHORTURLSERVICE = "share_shortURLService";
    public static final String SHARE_SHORTURLSERVICE_SHORTURL = "share_shortURLService_shortURL";
    public static final String SHARE_SHORTURLSERVICE_SHORTURLCALLBACK = "share_shortURLService_shortURLCallBack";
    private static final String SHARE_SINGLECHANNELSERVICE = "share_singleChannelService";
    public static final String SHARE_SINGLECHANNELSERVICE_CALLBACK = "share_singleChannelService_callBack";
    public static final String SHARE_SINGLECHANNELSERVICE_SINGLE = "share_singleChannelService_single";
    private static final String SHARE_SMSSERVICE = "share_smsService";
    public static final String SHARE_SMSSERVICE_SMS = "share_smsService_sms";
    private static final String SHARE_SYSTEMSERVICE = "share_systemService";
    public static final String SHARE_SYSTEMSERVICE_SYSTEM = "share_systemService_system";
    private static final String SHARE_UTILSERVICE = "share_utilService";
    public static final String SHARE_UTILSERVICE_GETLOCALIMAGEURL = "share_utilService_getLocalImageUrl";
    public static final String SHARE_UTILSERVICE_GETSHARECHANNELNAME = "share_utilService_getShareChannelName";
    public static final String SHARE_UTILSERVICE_ISAPPINSTALL = "share_utilService_isAppInstall";
    public static final String SHARE_UTILSERVICE_ISQQINSTALL = "share_utilService_isQQInstall";
    public static final String SHARE_UTILSERVICE_ISWEIXININSTALL = "share_utilService_isWeixinInstall";
    private static final String SHARE_WEIXINSERVICE = "share_weixinService";
    public static final String SHARE_WEIXINSERVICE_SHARECALLBACK = "share_weixinService_shareCallBack";
    public static final String SHARE_WEIXINSERVICE_WEIXIN = "share_weixinService_weixin";
    private static final Map<String, Pair<String, Class[]>> apiMap;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, Class> serviceMap;

    static {
        HashMap hashMap = new HashMap(32);
        serviceMap = hashMap;
        hashMap.put(SHARE_SINGLECHANNELSERVICE, b.class);
        serviceMap.put(SHARE_REDIRECTURLSERVICE, com.sankuai.android.share.keymodule.redirectURL.a.class);
        serviceMap.put(SHARE_WEIXINSERVICE, com.sankuai.android.share.keymodule.shareChannel.weixin.a.class);
        serviceMap.put(SHARE_SYSTEMSERVICE, d.class);
        serviceMap.put(SHARE_SHORTURLSERVICE, com.sankuai.android.share.keymodule.shortURL.a.class);
        serviceMap.put(SHARE_SMSSERVICE, c.class);
        serviceMap.put(SHARE_COPYSERVICE, com.sankuai.android.share.keymodule.shareChannel.service.a.class);
        serviceMap.put(SHARE_QQSHARESERVICE, com.sankuai.android.share.keymodule.shareChannel.qq.b.class);
        serviceMap.put(SHARE_UTILSERVICE, com.sankuai.android.share.keymodule.util.a.class);
        serviceMap.put(SHARE_PASSWORDSERVICE, com.sankuai.android.share.keymodule.shareChannel.password.a.class);
        serviceMap.put(SHARE_PROCESSURLSERVICE, com.sankuai.android.share.keymodule.processURL.a.class);
        serviceMap.put(SHARE_PANELSERVICE, com.sankuai.android.share.keymodule.SharePanel.c.class);
        HashMap hashMap2 = new HashMap(64);
        apiMap = hashMap2;
        hashMap2.put(SHARE_QQSHARESERVICE_SHARECALLBACK, new Pair("shareCallBack", new Class[]{LyingkitTraceBody.class, QQCallbackBean.class}));
        apiMap.put(SHARE_WEIXINSERVICE_WEIXIN, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_SINGLECHANNELSERVICE_SINGLE, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_COPYSERVICE_COPY, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_SMSSERVICE_SMS, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_QQSHARESERVICE_QQ, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_UTILSERVICE_GETSHARECHANNELNAME, new Pair<>("getShareChannelName", new Class[]{LyingkitTraceBody.class, Context.class, Integer.TYPE}));
        apiMap.put(SHARE_WEIXINSERVICE_SHARECALLBACK, new Pair<>("shareCallBack", new Class[]{LyingkitTraceBody.class, WeixinCallbackBean.class}));
        apiMap.put(SHARE_UTILSERVICE_ISWEIXININSTALL, new Pair<>("isWeixinInstall", new Class[]{LyingkitTraceBody.class, Context.class}));
        apiMap.put(SHARE_UTILSERVICE_GETLOCALIMAGEURL, new Pair<>("getLocalImageUrl", new Class[]{LyingkitTraceBody.class, Context.class, Bitmap.class}));
        apiMap.put(SHARE_REDIRECTURLSERVICE_REDIRECTCALLBACK, new Pair<>("redirectCallBack", new Class[]{LyingkitTraceBody.class, Boolean.TYPE, RedirectCallbackBean.class}));
        apiMap.put(SHARE_SINGLECHANNELSERVICE_CALLBACK, new Pair<>("callBack", new Class[]{LyingkitTraceBody.class, Boolean.TYPE, b.a.class}));
        apiMap.put(SHARE_PROCESSURLSERVICE_PROCESSCALLBACK, new Pair<>("processCallBack", new Class[]{LyingkitTraceBody.class, Boolean.TYPE, String.class}));
        apiMap.put(SHARE_PROCESSURLSERVICE_PROCESSURL, new Pair<>("processURL", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_PASSWORDSERVICE_PASSWORD, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_PANELSERVICE_SHOW, new Pair<>("show", new Class[]{LyingkitTraceBody.class, Activity.class, SparseArray.class, ShareBaseBean.class, e.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}));
        apiMap.put(SHARE_SYSTEMSERVICE_SYSTEM, new Pair<>("share", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_PASSWORDSERVICE_SHOW, new Pair<>("showPasswordAlert", new Class[]{LyingkitTraceBody.class, com.sankuai.android.share.password.a.class}));
        apiMap.put(SHARE_SHORTURLSERVICE_SHORTURLCALLBACK, new Pair<>("shortURLCallBack", new Class[]{LyingkitTraceBody.class, Boolean.TYPE, ShortUrlCallbackBean.class}));
        apiMap.put(SHARE_REDIRECTURLSERVICE_REDIRECTURL, new Pair<>("redirectURL", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_SHORTURLSERVICE_SHORTURL, new Pair<>("shortURL", new Class[]{LyingkitTraceBody.class, Context.class, b.a.class, ShareBaseBean.class, com.sankuai.android.share.interfaces.c.class}));
        apiMap.put(SHARE_UTILSERVICE_ISQQINSTALL, new Pair<>("isQQInstall", new Class[]{LyingkitTraceBody.class, Context.class}));
        apiMap.put(SHARE_PASSWORDSERVICE_GETPASSWORDCALLBACK, new Pair<>("getPasswordCallBack", new Class[]{LyingkitTraceBody.class, Boolean.TYPE, PasswordCallbackBean.class, ShareBaseBean.class}));
        apiMap.put(SHARE_UTILSERVICE_ISAPPINSTALL, new Pair<>("isAppInstall", new Class[]{LyingkitTraceBody.class, Context.class, String.class}));
        apiMap.put(SHARE_PASSWORDSERVICE_GETALERTINFO, new Pair<>("getAlertInfo", new Class[]{LyingkitTraceBody.class, com.sankuai.android.share.password.a.class}));
    }

    @Override // com.meituan.android.nom.base.a
    public final Class getRealServiceClass(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84ab47413b0c2863163c642d5b59ca4e", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84ab47413b0c2863163c642d5b59ca4e") : serviceMap.get(str);
    }

    @Override // com.meituan.android.nom.base.a
    public final String getRealApiName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6e13691fa4bffc8ef6a5da877639995", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6e13691fa4bffc8ef6a5da877639995");
        }
        Pair<String, Class[]> pair = apiMap.get(str);
        return pair != null ? (String) pair.first : "";
    }

    @Override // com.meituan.android.nom.base.a
    public final Class[] getApiParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b30c07a12d600a5c7ff553be586e58ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b30c07a12d600a5c7ff553be586e58ed");
        }
        Pair<String, Class[]> pair = apiMap.get(str);
        if (pair != null) {
            return (Class[]) pair.second;
        }
        return null;
    }
}
