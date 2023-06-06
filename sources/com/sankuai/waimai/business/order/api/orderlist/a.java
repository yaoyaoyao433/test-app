package com.sankuai.waimai.business.order.api.orderlist;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.service.OrderCommentService;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.router.core.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(final Activity activity, String str, final String str2, final String str3, String str4, final Dialog dialog, final String str5, final g gVar) {
        Object[] objArr = {activity, str, str2, str3, str4, dialog, str5, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e9b4c8e13fa4ada95925807f38e9236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e9b4c8e13fa4ada95925807f38e9236");
            return;
        }
        String str6 = "";
        List<AdminInfo> o = h.o();
        if (o != null && o.size() > 0) {
            for (AdminInfo adminInfo : o) {
                if (adminInfo.adminLevel == 5) {
                    str6 = adminInfo.adminCode;
                }
            }
        }
        b.a(((OrderCommentService) b.a((Class<Object>) OrderCommentService.class)).goCommentRequest(str2, str3, str4, str6), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.order.api.orderlist.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a7c7504de9788adb08ca0edc8755ae5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a7c7504de9788adb08ca0edc8755ae5");
                } else if (activity.isFinishing()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(dialog);
                    if (baseResponse == null || baseResponse.code != 0 || baseResponse.data == 0) {
                        ae.a(activity, (baseResponse == null || TextUtils.isEmpty(baseResponse.msg)) ? activity.getString(R.string.takeout_loading_fail_try_afterwhile) : baseResponse.msg);
                        if (gVar != null) {
                            gVar.a(200);
                            return;
                        }
                        return;
                    }
                    String a2 = ab.a(com.meituan.android.singleton.b.a, (int) R.string.wm_order_comment_mrn_uri);
                    String str7 = com.sankuai.waimai.foundation.router.interfaces.b.c;
                    if (com.sankuai.waimai.foundation.core.a.e()) {
                        str7 = "imeituan://www.meituan.com";
                    } else if (com.sankuai.waimai.foundation.core.a.f()) {
                        str7 = "dianping://waimai.dianping.com";
                    }
                    String format = TextUtils.isEmpty(str5) ? String.format(a2, str7, str2, str3) : str5;
                    if (com.sankuai.waimai.foundation.core.a.f()) {
                        format = format + "&mrn_min_version=2.0.106";
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("go_comment_data", (String) baseResponse.data);
                    bundle.putBoolean("is_online", c.a().b());
                    com.sankuai.waimai.foundation.router.a.a(activity, format, bundle);
                    if (gVar != null) {
                        gVar.a(200);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "199e87c51601887c050076d70a26e6d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "199e87c51601887c050076d70a26e6d8");
                } else if (activity.isFinishing()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(dialog);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(activity, (Throwable) null);
                    if (gVar != null) {
                        gVar.a(200);
                    }
                }
            }
        }, str);
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4, g gVar, String str5) {
        Object[] objArr = {activity, str, str2, str3, str4, gVar, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18417ebf51af1baa03cd4fa5571b8a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18417ebf51af1baa03cd4fa5571b8a91");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            b(activity, str, str2, str3, str4, gVar, str5);
        }
    }

    public static void b(final Activity activity, final String str, final String str2, final String str3, String str4, final g gVar, final String str5) {
        String str6 = str4;
        Object[] objArr = {activity, str, str2, str3, str6, gVar, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a4f8b1b68e1d17395c412faa7a7567d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a4f8b1b68e1d17395c412faa7a7567d");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        final String str7 = (TextUtils.isEmpty(str4) || TextUtils.equals(str6, StringUtil.NULL)) ? "" : "";
        b.a(((OrderCommentService) b.a((Class<Object>) OrderCommentService.class)).getCommentScheme(str2, aa.a(str3) ? "0" : str3, str7), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.a>>() { // from class: com.sankuai.waimai.business.order.api.orderlist.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0e78b175703ef97d2c4a3eedfa55fc5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0e78b175703ef97d2c4a3eedfa55fc5");
                } else if (activity.isFinishing()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    if (baseResponse == null || baseResponse.code != 0 || baseResponse.data == 0) {
                        ae.a(activity, (baseResponse == null || TextUtils.isEmpty(baseResponse.msg)) ? activity.getString(R.string.takeout_loading_fail_try_afterwhile) : baseResponse.msg);
                        if (gVar != null) {
                            gVar.a(200);
                            return;
                        }
                        return;
                    }
                    String str8 = ((com.sankuai.waimai.business.order.api.model.a) baseResponse.data).a + "&source_page_type=" + str5;
                    if (((com.sankuai.waimai.business.order.api.model.a) baseResponse.data).b == 1) {
                        com.sankuai.waimai.foundation.router.a.a(activity, str8);
                        if (gVar != null) {
                            gVar.a(200);
                            return;
                        }
                        return;
                    }
                    a.a(activity, str, str2, str3, str7, a2, str8, gVar);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eafd859a4d6359bda29f23cb485a579", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eafd859a4d6359bda29f23cb485a579");
                } else if (activity.isFinishing()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(activity, (Throwable) null);
                    if (gVar != null) {
                        gVar.a(200);
                    }
                }
            }
        }, str);
    }
}
