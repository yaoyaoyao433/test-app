package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.MainThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Window;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityCustomDialog;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void b(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void P();

        void a(Window window);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void N();

        void O();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface e {
        void a(boolean z, EnvelopeShareTip envelopeShareTip, String str);

        void a(int[] iArr, String str);
    }

    public static void a(Activity activity, String str, EnvelopeShareTip envelopeShareTip, String str2, com.sankuai.waimai.foundation.core.service.share.listener.b bVar) {
        Object[] objArr = {activity, str, envelopeShareTip, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b4d18ee1eb162a94a4c8354323b7984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b4d18ee1eb162a94a4c8354323b7984");
        } else if (envelopeShareTip != null) {
            if (TextUtils.isEmpty(envelopeShareTip.shareInfo != null ? envelopeShareTip.shareInfo.d : "")) {
                return;
            }
            int[] iArr = envelopeShareTip.channels;
            int length = iArr == null ? 0 : iArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                switch (iArr[i2]) {
                    case 1:
                        i |= 4;
                        break;
                    case 2:
                        i |= 2;
                        break;
                    case 3:
                        i |= 1;
                        break;
                    case 4:
                        i |= 8;
                        break;
                }
            }
            String str3 = "";
            String str4 = "";
            ShareTip shareTip = new ShareTip();
            shareTip.setTitle(envelopeShareTip.shareInfo != null ? envelopeShareTip.shareInfo.e : "");
            shareTip.setContent(envelopeShareTip.shareInfo != null ? envelopeShareTip.shareInfo.b : "");
            shareTip.setUrl(envelopeShareTip.shareInfo != null ? envelopeShareTip.shareInfo.d : "");
            shareTip.setIcon(envelopeShareTip.shareInfo != null ? envelopeShareTip.shareInfo.c : "");
            shareTip.setChannelFlag((short) i);
            shareTip.setCid(str2);
            if (envelopeShareTip.shareInfo != null && envelopeShareTip.shareInfo.h != null && !TextUtils.isEmpty(envelopeShareTip.shareInfo.h.c)) {
                shareTip.setWeixinUrl(envelopeShareTip.shareInfo.h.h);
                shareTip.setMiniProgramId(envelopeShareTip.shareInfo.h.b);
                shareTip.setMiniProgramImage(envelopeShareTip.shareInfo.h.d);
                shareTip.setMiniProgramPath(envelopeShareTip.shareInfo.h.c);
                shareTip.setMiniprogramType(com.sankuai.waimai.mach.utils.g.c(envelopeShareTip.shareInfo.h.e));
                str3 = envelopeShareTip.shareInfo.h.f;
                str4 = envelopeShareTip.shareInfo.h.g;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("source", 2);
            bundle.putString(Constants.EventConstants.KEY_ORDER_ID, str);
            bundle.putString("miniProgramTitle", str3);
            bundle.putString("miniProgramDesc", str4);
            com.sankuai.waimai.share.b.a(activity, shareTip, 2, bVar, bundle);
        }
    }

    @MainThread
    public static void a(final Context context, final EnvelopeShareTip envelopeShareTip, final Handler handler, final String str, boolean z, final e eVar, final a aVar) {
        Object[] objArr = {context, envelopeShareTip, handler, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35985e8f39059117f877e57a062bfab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35985e8f39059117f877e57a062bfab4");
        } else if (envelopeShareTip == null || context == null) {
        } else {
            String str2 = envelopeShareTip.buttonName;
            if (TextUtils.isEmpty(str2)) {
                str2 = context.getString(R.string.wm_order_detail_share_to_friends);
            }
            new PriorityCustomDialog.a(context).a(envelopeShareTip.icon).a(R.drawable.wm_order_detail_ic_coupon).a((CharSequence) envelopeShareTip.title).b((CharSequence) envelopeShareTip.desc).a(false).b(-1).a((Object) "RedPacketDialog").b("containerFlag_orderdetail").a(com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a.NORMAL).a(str2, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.util.l.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "046e1d1e788f18aa7bf0164ee732a890", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "046e1d1e788f18aa7bf0164ee732a890");
                    } else if (e.this != null) {
                        e.this.a(true, envelopeShareTip, str);
                        e.this.a(envelopeShareTip.channels, str);
                        JudasManualManager.a("b_4hn5A").a("orderid", str).a("page_type", l.a(envelopeShareTip)).a("c_hgowsqb").a(context).a();
                    }
                }
            }).a(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.util.l.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1321e02745d63d821dd8f5f194e66050", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1321e02745d63d821dd8f5f194e66050");
                        return;
                    }
                    if (e.this != null) {
                        e.this.a(false, envelopeShareTip, str);
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.util.l.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8c625fb490f7671c297fc5ba2f43c9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8c625fb490f7671c297fc5ba2f43c9a");
                    } else if (handler != null) {
                        handler.obtainMessage(32631).sendToTarget();
                    }
                }
            }).a().show();
            JudasManualManager.b("b_x82rg").a("orderid", str).a("page_type", a(envelopeShareTip)).a("c_hgowsqb").a(context).a();
        }
    }

    public static String a(EnvelopeShareTip envelopeShareTip) {
        Object[] objArr = {envelopeShareTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6a8556afe415eb9e54c15093bead18", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6a8556afe415eb9e54c15093bead18") : (envelopeShareTip == null || envelopeShareTip.shareInfo == null || envelopeShareTip.shareInfo.h == null || envelopeShareTip.shareInfo.h.i == null) ? "1" : "2";
    }
}
