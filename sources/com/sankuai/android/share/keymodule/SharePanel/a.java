package com.sankuai.android.share.keymodule.SharePanel;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.bean.ShareExtraInfo;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.util.g;
import com.sankuai.android.share.util.h;
import com.sankuai.android.share.util.j;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final LyingkitTraceBody lyingkitTraceBody, final Context context, final b.a aVar, final ShareBaseBean shareBaseBean, final com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a658cae30ed2090750e7017eead94281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a658cae30ed2090750e7017eead94281");
            return;
        }
        a(context);
        if (shareBaseBean != null) {
            j.a(context, new g.b() { // from class: com.sankuai.android.share.keymodule.SharePanel.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.android.share.util.g.b
                public final void a() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38bdd2a60edefd155fbba42e7d1a9b8b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38bdd2a60edefd155fbba42e7d1a9b8b");
                        return;
                    }
                    if (TextUtils.isEmpty(ShareBaseBean.this.getAppshare())) {
                        ShareBaseBean.this.setAppshare(j.a());
                    }
                    b.a aVar2 = aVar;
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "48c9e883fb2b4fce5f2003eb7dc23c2c", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "48c9e883fb2b4fce5f2003eb7dc23c2c");
                    } else if (aVar2 == b.a.QQ) {
                        str = "qq";
                    } else if (aVar2 == b.a.WEIXIN_FRIEDN) {
                        str = MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX;
                    } else if (aVar2 == b.a.WEIXIN_CIRCLE) {
                        str = "pyq";
                    } else if (aVar2 == b.a.SINA_WEIBO) {
                        str = "weibo";
                    } else if (aVar2 == b.a.QZONE) {
                        str = "qqzone";
                    } else if (aVar2 == b.a.COPY) {
                        str = "copy";
                    } else {
                        str = aVar2 == b.a.MORE_SHARE ? "more" : "";
                    }
                    Sniffer.smell("biz_share", "share_data_onChannel", str, "分享渠道传入data", ShareBaseBean.this.toString());
                    LyingkitZone lyingkitZone = new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0");
                    if (lyingkitTraceBody == null) {
                        lyingkitZone.a(new ShareExtraInfo("share", "share"));
                    }
                    com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_PROCESSURLSERVICE_PROCESSURL, context, aVar, ShareBaseBean.this, cVar);
                }
            });
        }
    }

    private static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07fdce2edfa5864f1e6476e24b5d2e08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07fdce2edfa5864f1e6476e24b5d2e08");
            return;
        }
        SDKInfoManager.a("share-sdk").a(context, "5.23.49", 1 ^ (h.b ? 1 : 0), new com.sankuai.android.share.common.a(context, h.b));
    }
}
