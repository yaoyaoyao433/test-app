package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.network.response.ActivityDialogInfo;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.order.api.model.DynamicDialogInfoWrapper;
import com.sankuai.waimai.business.order.api.store.model.SCActivityDialogInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a = null;
    private static String b = "wm_orderdetail_shangoo_new_customer";

    public static boolean a(OrderFollowAreaInfo orderFollowAreaInfo) {
        Object[] objArr = {orderFollowAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe0e1563731013a8abf41e6a00175430", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe0e1563731013a8abf41e6a00175430")).booleanValue();
        }
        if (orderFollowAreaInfo == null) {
            return false;
        }
        ActivityDialogInfo a2 = a(b(orderFollowAreaInfo));
        if (a2 == null) {
            com.sankuai.waimai.bussiness.order.detailnew.network.response.h navigateBarInfo = orderFollowAreaInfo.getNavigateBarInfo(4);
            if (navigateBarInfo == null || navigateBarInfo.f == null) {
                return false;
            }
            a2 = navigateBarInfo.f;
        }
        return (a2 != null) && (a2.activityType == 3) && a2.couponCollectionTip != null;
    }

    public static AlertInfo b(OrderFollowAreaInfo orderFollowAreaInfo) {
        Object[] objArr = {orderFollowAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "381a13816604474eba07440c7a5bca00", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "381a13816604474eba07440c7a5bca00");
        }
        try {
            if (TextUtils.isEmpty(orderFollowAreaInfo.couponShareInfo)) {
                return null;
            }
            return (AlertInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(orderFollowAreaInfo.couponShareInfo, (Class<Object>) AlertInfo.class);
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    public static ActivityDialogInfo a(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50a02443bdbad9f721719371744ff36a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActivityDialogInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50a02443bdbad9f721719371744ff36a");
        }
        if (alertInfo != null) {
            try {
                if (!com.sankuai.waimai.foundation.utils.b.b(alertInfo.modules)) {
                    for (AlertInfo.Module module : alertInfo.modules) {
                        if (module != null) {
                            DynamicDialogInfoWrapper a2 = a(module);
                            if (com.sankuai.waimai.foundation.utils.b.a(a2.pos_datas, 0) != null && b.equals(module.moduleId)) {
                                return (ActivityDialogInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(com.sankuai.waimai.foundation.utils.k.a().toJson(a2.pos_datas.get(0).pos_data), (Class<Object>) ActivityDialogInfo.class);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
        return null;
    }

    private static EnvelopeShareTip c(AlertInfo alertInfo) {
        DynamicDialogInfoWrapper a2;
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b5946e9429c1241948e8fd168155241", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnvelopeShareTip) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b5946e9429c1241948e8fd168155241");
        }
        if (alertInfo != null) {
            try {
                if (!com.sankuai.waimai.foundation.utils.b.b(alertInfo.modules)) {
                    for (AlertInfo.Module module : alertInfo.modules) {
                        if (module != null && (a2 = a(module)) != null && com.sankuai.waimai.foundation.utils.b.a(a2.pos_datas, 0) != null && a2.pos_datas.get(0).pos_data != null && b.equals(module.moduleId)) {
                            Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.foundation.utils.k.a().toJson(a2.pos_datas.get(0).pos_data));
                            EnvelopeShareTip envelopeShareTip = new EnvelopeShareTip();
                            if (a3.get("share_tip_icon") != null) {
                                envelopeShareTip.shareIcon = a3.get("share_tip_icon").toString();
                            }
                            return envelopeShareTip;
                        }
                    }
                }
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
        return null;
    }

    public static SCActivityDialogInfo b(AlertInfo alertInfo) {
        DynamicDialogInfoWrapper a2;
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c081aad312bacc49bc70bea7af47323e", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCActivityDialogInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c081aad312bacc49bc70bea7af47323e");
        }
        if (alertInfo != null) {
            try {
                if (!com.sankuai.waimai.foundation.utils.b.b(alertInfo.modules)) {
                    for (AlertInfo.Module module : alertInfo.modules) {
                        if (module != null && (a2 = a(module)) != null && com.sankuai.waimai.foundation.utils.b.a(a2.pos_datas, 0) != null && a2.pos_datas.get(0).pos_data != null && "wm_orderdetail_shangou_floating_layer".equals(module.moduleId)) {
                            return (SCActivityDialogInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(com.sankuai.waimai.foundation.utils.k.a().toJson(a2.pos_datas.get(0).pos_data), (Class<Object>) SCActivityDialogInfo.class);
                        }
                    }
                }
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
        return null;
    }

    public static EnvelopeShareTip c(OrderFollowAreaInfo orderFollowAreaInfo) {
        Object[] objArr = {orderFollowAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ed29f141ad811e2e5ffc0ff1b8ab09c", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnvelopeShareTip) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ed29f141ad811e2e5ffc0ff1b8ab09c");
        }
        EnvelopeShareTip c = c(b(orderFollowAreaInfo));
        if (c == null) {
            com.sankuai.waimai.bussiness.order.detailnew.network.response.h navigateBarInfo = orderFollowAreaInfo.getNavigateBarInfo(4);
            return navigateBarInfo != null ? navigateBarInfo.e : null;
        }
        return c;
    }

    private static DynamicDialogInfoWrapper a(@NonNull AlertInfo.Module module) {
        String str;
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c84edb49dcbb2b263714ca214e8d6456", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDialogInfoWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c84edb49dcbb2b263714ca214e8d6456");
        }
        if (module.dataType == 0) {
            str = module.jsonData == null ? "" : module.jsonData.toString();
        } else {
            str = module.dataType == 1 ? module.stringData : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (DynamicDialogInfoWrapper) com.sankuai.waimai.foundation.utils.k.a().fromJson(str, (Class<Object>) DynamicDialogInfoWrapper.class);
    }
}
