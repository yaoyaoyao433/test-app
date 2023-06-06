package com.sankuai.android.share.keymodule.processURL;

import android.content.Context;
import android.net.Uri;
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
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.meituan.skyeye.library.core.e;
import java.util.HashMap;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "processURLService")
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "processURL")
    private void processURL(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, c cVar) {
        char c;
        int i;
        String builder;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff116b96bdfc17b586a0875aa03ebbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff116b96bdfc17b586a0875aa03ebbbd");
        } else if (context == null || shareBaseBean == null) {
        } else {
            if (TextUtils.isEmpty(shareBaseBean.getUrl())) {
                c = 3;
                i = 2;
            } else {
                String url = shareBaseBean.getUrl();
                String platform = shareBaseBean.getPlatform();
                String source = shareBaseBean.getSource();
                c = 3;
                i = 2;
                Object[] objArr2 = {url, platform, source};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.base.share.c.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "42bfbebf222a82b38a98b73a6bea9040", RobustBitConfig.DEFAULT_VALUE)) {
                    builder = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "42bfbebf222a82b38a98b73a6bea9040");
                } else {
                    Uri.Builder buildUpon = Uri.parse(url).buildUpon();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Aandroid");
                    sb.append("Bgroup");
                    sb.append("C" + com.meituan.android.base.a.d);
                    sb.append("D" + platform);
                    sb.append("E" + source);
                    sb.append("G" + com.meituan.android.base.share.c.a());
                    if (!url.contains("utm_term")) {
                        buildUpon.appendQueryParameter("utm_term", sb.toString());
                    }
                    if (!url.contains("utm_source")) {
                        buildUpon.appendQueryParameter("utm_source", "appshare");
                    }
                    if (!url.contains("utm_medium")) {
                        buildUpon.appendQueryParameter("utm_medium", "androidweb");
                    }
                    builder = buildUpon.toString();
                }
                shareBaseBean.setUrl(builder);
                com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_PROCESSURLSERVICE_PROCESSCALLBACK, Boolean.TRUE, builder);
            }
            if (TextUtils.isEmpty(shareBaseBean.getUrl()) || aVar == b.a.PASSWORD || !TextUtils.equals("com.sankuai.meituan", context.getPackageName())) {
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
            } else {
                LyingkitZone lyingkitZone = new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0");
                Object[] objArr3 = new Object[4];
                objArr3[0] = context;
                objArr3[1] = aVar;
                objArr3[i] = shareBaseBean;
                objArr3[c] = cVar;
                com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_REDIRECTURLSERVICE_REDIRECTURL, objArr3);
            }
            if (!shareBaseBean.isLocalImage() || TextUtils.isEmpty(shareBaseBean.getImgUrl())) {
                return;
            }
            String imgUrl = shareBaseBean.getImgUrl();
            Object[] objArr4 = new Object[i];
            objArr4[0] = context;
            objArr4[1] = imgUrl;
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "f346fec084cf08c587cd13647fd34f2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "f346fec084cf08c587cd13647fd34f2e");
            } else if (imgUrl.startsWith("/data/user/") || imgUrl.startsWith("/storage/emulated/0/Android/data")) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("localImg", imgUrl);
                hashMap.put("page", com.meituan.android.base.share.b.a());
                e.a().a("biz_share", "share_flow_img", "share_external", "分享外部存储路径", hashMap);
            }
        }
    }

    @NomApiInterface(alias = "processCallBack")
    public void processCallBack(LyingkitTraceBody lyingkitTraceBody, boolean z, String str) {
        Object[] objArr = {lyingkitTraceBody, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8d2c95087727edbaadecf0bf6048dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8d2c95087727edbaadecf0bf6048dc");
        } else if (z) {
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "处理 URL 成功 processedURL:" + str);
        }
    }
}
