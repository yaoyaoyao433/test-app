package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.order.api.model.DynamicDialogInfoWrapper;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfdc1f57b3a4bb2a7123b902844d1b8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfdc1f57b3a4bb2a7123b902844d1b8e")).booleanValue() : !TextUtils.isEmpty(str);
    }

    public static EnvelopeShareTip a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cf3fe46b510672804de936c6d0ff856", RobustBitConfig.DEFAULT_VALUE) ? (EnvelopeShareTip) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cf3fe46b510672804de936c6d0ff856") : (EnvelopeShareTip) com.sankuai.waimai.foundation.utils.k.a().fromJson(com.sankuai.waimai.foundation.utils.k.a().toJson(obj), (Class<Object>) EnvelopeShareTip.class);
    }

    public static boolean b(@NonNull String str) {
        DynamicDialogInfoWrapper a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "146a78175432a84ec405ada430243383", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "146a78175432a84ec405ada430243383")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        AlertInfo alertInfo = (AlertInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(str, (Class<Object>) AlertInfo.class);
        try {
            if (alertInfo.modules != null && alertInfo.modules.size() > 0) {
                for (AlertInfo.Module module : alertInfo.modules) {
                    if (module != null && (a2 = a(module)) != null && com.sankuai.waimai.foundation.utils.b.a(a2.pos_datas, 0) != null && a2.pos_datas.get(0).pos_data != null) {
                        if (a2.pos_datas.size() == 1) {
                            if (a2.pos_datas.get(0).pos_code.equals("position_APPdingdanwanchengyedanchuang_fenxiangA_ps_code")) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return false;
        }
    }

    public static DynamicDialogInfoWrapper a(@NonNull AlertInfo.Module module) {
        String str;
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1feb05a9eff018fde37c385c6f8e03f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDialogInfoWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1feb05a9eff018fde37c385c6f8e03f7");
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
