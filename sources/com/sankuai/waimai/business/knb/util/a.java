package com.sankuai.waimai.business.knb.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.d;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ed5fd11852976537e57149d1156a770", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ed5fd11852976537e57149d1156a770")).intValue();
        }
        if (i == 8) {
            return 4;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        return i == 4 ? 1 : 0;
    }

    public static com.sankuai.waimai.kit.share.b a(Activity activity, com.sankuai.waimai.foundation.core.service.share.listener.a aVar, d dVar) {
        short s;
        int i;
        Object[] objArr = {activity, null, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c10190fc16c63714d039f96c67aaa88", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.kit.share.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c10190fc16c63714d039f96c67aaa88");
        }
        if (com.sankuai.waimai.kit.share.a.b) {
            return null;
        }
        com.sankuai.waimai.kit.share.a.b = true;
        com.sankuai.waimai.kit.share.b bVar = new com.sankuai.waimai.kit.share.b(activity);
        int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "h5_share_channel", 0);
        if (com.sankuai.waimai.business.knb.webview.b.b(b)) {
            s = 8;
            i = 1;
        } else {
            s = 0;
            i = 0;
        }
        if (com.sankuai.waimai.business.knb.webview.b.a(b)) {
            s = (short) (s | 1);
            i++;
        }
        if (com.sankuai.waimai.business.knb.webview.b.c(b)) {
            s = (short) (s | 4);
            i++;
        }
        if (com.sankuai.waimai.business.knb.webview.b.d(b)) {
            s = (short) (s | 2);
            i++;
        }
        if (s == 0) {
            s = 15;
            i = 4;
        }
        String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_description", (String) null);
        String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_description_icon", (String) null);
        ShareTip shareTip = new ShareTip();
        shareTip.setTitle(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_title", ""));
        shareTip.setUrl(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_url", ""));
        shareTip.setContent(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_content", ""));
        shareTip.setIcon(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_icon_url", ""));
        shareTip.setMiniProgramId(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_miniprogram_id", (String) null));
        shareTip.setMiniProgramPath(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_miniprogram_path", (String) null));
        shareTip.setMiniProgramImage(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "h5_share_miniprogram_icon", (String) null));
        shareTip.setMiniprogramType(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "h5_share_miniprogram_type", 0));
        shareTip.setDescription(b2);
        shareTip.setShareButtonDes(b3);
        shareTip.setChannelFlag(s);
        if (s == 2 && !aa.a(shareTip.getMiniProgramPath()) && !aa.a(shareTip.getMiniProgramId())) {
            com.sankuai.waimai.share.b.a(activity, shareTip, 2, dVar, (Bundle) null);
            com.sankuai.waimai.kit.share.a.b = false;
        } else if (i == 1) {
            com.sankuai.waimai.share.b.a(activity, shareTip, a(s), dVar, (Bundle) null);
            com.sankuai.waimai.kit.share.a.b = false;
        } else {
            com.sankuai.waimai.share.b.a(activity, shareTip, (com.sankuai.waimai.foundation.core.service.share.listener.a) null, dVar, (Bundle) null);
        }
        return bVar;
    }

    public static void a(com.sankuai.waimai.business.knb.webview.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fd1e8927a5f91a4623190386ede3d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fd1e8927a5f91a4623190386ede3d65");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_title", bVar.b);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_content", bVar.c);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_url", bVar.e);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_icon_url", bVar.d);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_channel", bVar.f);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_description", bVar.h);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_description_icon", bVar.g);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_miniprogram_id", bVar.i);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_miniprogram_path", bVar.j);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_miniprogram_icon", bVar.k);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_miniprogram_type", bVar.l);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("sourcelevel");
        String queryParameter2 = Uri.parse(str).getQueryParameter("ys_id");
        if (!TextUtils.isEmpty(queryParameter2)) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_block_banner_id", "bannerId" + CommonConstant.Symbol.COLON + queryParameter2);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_bloack_banner_source_level", queryParameter);
        } else {
            queryParameter2 = Uri.parse(str).getQueryParameter("block_id");
            if (!TextUtils.isEmpty(queryParameter2)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_block_banner_id", "block_id" + CommonConstant.Symbol.COLON + queryParameter2);
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_bloack_banner_source_level", queryParameter);
            } else {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_share_block_banner_id", "");
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "h5_bloack_banner_source_level", "");
            }
        }
        com.sankuai.waimai.foundation.utils.log.a.b("log-info-out", "[serialize] itemId: " + queryParameter2 + " source_level: " + queryParameter, new Object[0]);
    }
}
