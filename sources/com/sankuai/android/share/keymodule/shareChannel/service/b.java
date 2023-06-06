package com.sankuai.android.share.keymodule.shareChannel.service;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.util.g;
import com.sankuai.android.share.util.j;
import com.sankuai.meituan.skyeye.library.core.e;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "singleChannelService")
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(b bVar, LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9c944f9bb8560aea55966f0557a37b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9c944f9bb8560aea55966f0557a37b20");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用单渠道分享 Service 接口成功");
        if (context != null && shareBaseBean != null) {
            if (TextUtils.isEmpty(shareBaseBean.getAppshare())) {
                shareBaseBean.setAppshare(j.a());
            }
            Sniffer.smell("biz_share", "share_data_onChannel", com.sankuai.android.share.keymodule.a.a(aVar), "分享渠道传入data", shareBaseBean.toString());
            LyingkitZone lyingkitZone = new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0");
            com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_PROCESSURLSERVICE_PROCESSURL, context, aVar, shareBaseBean, cVar);
            com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_SINGLECHANNELSERVICE_CALLBACK, Boolean.TRUE, aVar);
            return;
        }
        com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_SINGLECHANNELSERVICE_CALLBACK, Boolean.FALSE, aVar);
        if (cVar != null) {
            cVar.a(aVar, c.a.FAILED);
        }
        com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
    }

    @NomApiInterface(alias = "single")
    public void share(final LyingkitTraceBody lyingkitTraceBody, final Context context, final b.a aVar, final ShareBaseBean shareBaseBean, final com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55e472e28ca79ed3fc56f1ed99d2d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55e472e28ca79ed3fc56f1ed99d2d7c");
        } else {
            j.a(context, new g.b() { // from class: com.sankuai.android.share.keymodule.shareChannel.service.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.android.share.util.g.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0932f472b67e2acdec6cb48428a99b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0932f472b67e2acdec6cb48428a99b5");
                    } else {
                        b.a(b.this, lyingkitTraceBody, context, aVar, shareBaseBean, cVar);
                    }
                }
            });
        }
    }

    @NomApiInterface(alias = "callBack")
    private void callBack(LyingkitTraceBody lyingkitTraceBody, boolean z, b.a aVar) {
        Object[] objArr = {lyingkitTraceBody, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b623661473c663271fa8ebb58b8018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b623661473c663271fa8ebb58b8018");
        } else if (z) {
            lyingkitTraceBody.g = "0";
            lyingkitTraceBody.h = com.sankuai.android.share.keymodule.a.a(aVar) + "回调接口调用成功";
            e.a().a("biz_share", "share_flow_Data", "share_flow_Data_success", null);
        } else {
            lyingkitTraceBody.g = "1";
            lyingkitTraceBody.h = com.sankuai.android.share.keymodule.a.a(aVar) + "分享异常---error:数据为空";
            e.a().a("biz_share", "share_flow_Data", "share_flow_Data_nil", "分享数据为空", null);
        }
    }
}
