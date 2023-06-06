package com.sankuai.android.share.keymodule;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.util.d;
import com.sankuai.android.share.util.i;
import com.sankuai.android.share.util.j;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, c cVar) {
        String str;
        String str2;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ee57b96da24ae0a8cf608a838f04479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ee57b96da24ae0a8cf608a838f04479");
            return;
        }
        ShareDialog.b(context);
        if (cVar instanceof com.sankuai.android.share.common.b) {
            ((com.sankuai.android.share.common.b) cVar).a();
        }
        if (!TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) && !TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) {
            if (shareBaseBean.getMiniProgramPath().contains(CommonConstant.Symbol.QUESTION_MARK)) {
                str2 = shareBaseBean.getMiniProgramPath() + "&mt_share_id=" + shareBaseBean.getAppshare();
            } else {
                str2 = shareBaseBean.getMiniProgramPath() + "?mt_share_id=" + shareBaseBean.getAppshare();
            }
            shareBaseBean.setMiniProgramPath(str2);
        }
        Object[] objArr2 = {context, aVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b06ae667a9d975bb0af2cee12810d6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b06ae667a9d975bb0af2cee12810d6cf");
        } else if (Statistics.isInitialized()) {
            int a2 = d.a(aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("title", d.a(a2));
            hashMap.put("title_name", d.a(context, a2));
            hashMap.put("share_id", j.a(context, aVar, shareBaseBean));
            hashMap.put("bg_name", d.a(shareBaseBean));
            hashMap.put("bu_name", j.a(context) ? "game" : j.a(shareBaseBean));
            hashMap.put("url", d.b(shareBaseBean));
            String a3 = d.a(aVar, shareBaseBean);
            hashMap.put("type", a3);
            if (TextUtils.equals(a3, "小程序")) {
                hashMap.put("wxapp", d.c(shareBaseBean));
            } else {
                hashMap.put("wxapp", "");
            }
            hashMap.put("cid", j.b(shareBaseBean));
            hashMap.put("pagenm", com.meituan.android.base.share.b.a());
            hashMap.put("appshare", d.d(shareBaseBean));
            hashMap.put("share_source", d.e(shareBaseBean));
            if (TextUtils.equals(d.a(aVar, shareBaseBean), "小程序")) {
                hashMap.put("main_title", "-999");
                hashMap.put("sub_title", "-999");
                if (shareBaseBean != null && shareBaseBean.getMiniProgramInfo() != null) {
                    hashMap.put("image_url", shareBaseBean.getMiniProgramInfo().imageUrl != null ? shareBaseBean.getMiniProgramInfo().imageUrl : "-999");
                } else {
                    hashMap.put("image_url", "");
                }
            } else {
                hashMap.put("main_title", shareBaseBean != null ? shareBaseBean.getTitle() : "");
                hashMap.put("sub_title", shareBaseBean != null ? shareBaseBean.getContent() : "");
                hashMap.put("image_url", shareBaseBean != null ? shareBaseBean.getImgUrl() : "");
            }
            hashMap.put("share_status", Integer.valueOf(context instanceof ShareActivity ? 1 : 0));
            i.d("b_group_yr1pinr8_mc", hashMap).a("c_sxr976a").a();
        }
        LyingkitZone lyingkitZone = new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0");
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "52227e45df915f9a23c7907068f69996", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "52227e45df915f9a23c7907068f69996");
        } else if (aVar == b.a.QQ || aVar == b.a.QZONE) {
            str = LyingkitKernel_share.SHARE_QQSHARESERVICE_QQ;
        } else if (aVar == b.a.WEIXIN_FRIEDN || aVar == b.a.WEIXIN_CIRCLE) {
            str = LyingkitKernel_share.SHARE_WEIXINSERVICE_WEIXIN;
        } else if (aVar == b.a.SINA_WEIBO) {
            str = "share_weiboService_weibo";
        } else if (aVar == b.a.COPY) {
            str = LyingkitKernel_share.SHARE_COPYSERVICE_COPY;
        } else if (aVar == b.a.MORE_SHARE) {
            str = LyingkitKernel_share.SHARE_SYSTEMSERVICE_SYSTEM;
        } else if (aVar == b.a.PASSWORD) {
            str = LyingkitKernel_share.SHARE_PASSWORDSERVICE_PASSWORD;
        } else {
            str = aVar == b.a.SMS ? LyingkitKernel_share.SHARE_SMSSERVICE_SMS : "";
        }
        com.meituan.android.nom.lyingkit.b.a(lyingkitZone, str, context, aVar, shareBaseBean, cVar);
    }

    public static String a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03174e13199cfac51cb9eb55ed87b42c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03174e13199cfac51cb9eb55ed87b42c") : aVar == b.a.QQ ? "qq" : aVar == b.a.WEIXIN_FRIEDN ? MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX : aVar == b.a.WEIXIN_CIRCLE ? "pyq" : aVar == b.a.SINA_WEIBO ? "weibo" : aVar == b.a.QZONE ? "qqzone" : aVar == b.a.COPY ? "copy" : aVar == b.a.MORE_SHARE ? "more" : "";
    }

    public static void a(LyingkitTraceBody lyingkitTraceBody, String str, String str2) {
        Object[] objArr = {lyingkitTraceBody, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed4e45130f7bc90e5146fe7e686a142b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed4e45130f7bc90e5146fe7e686a142b");
        } else if (lyingkitTraceBody != null) {
            lyingkitTraceBody.g = str;
            lyingkitTraceBody.h = str2;
        }
    }
}
