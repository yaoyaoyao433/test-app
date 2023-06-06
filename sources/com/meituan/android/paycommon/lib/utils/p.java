package com.meituan.android.paycommon.lib.utils;

import android.widget.CheckBox;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;

    private static boolean a(CommonGuide commonGuide) {
        Object[] objArr = {commonGuide};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efc8e537515a78af197af1af20a62b92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efc8e537515a78af197af1af20a62b92")).booleanValue();
        }
        if (commonGuide == null) {
            return false;
        }
        return CommonGuide.OPEN_MOBIKE_NP_PAY.equals(commonGuide.getGuideAction());
    }

    public static void a(CheckBox checkBox, CommonGuide commonGuide) {
        Object[] objArr = {checkBox, commonGuide};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcf36cdffb1306cac40d8acaaf7b0448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcf36cdffb1306cac40d8acaaf7b0448");
        } else if (a(commonGuide)) {
            com.meituan.android.paybase.common.analyse.a.a("c_sjk32ngz", "b_pay_bjvq8l2y_mv", "开通自动扣款", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("title", commonGuide.getTitle()).b, a.EnumC0329a.VIEW, -1);
            checkBox.setOnCheckedChangeListener(q.a(commonGuide));
        }
    }
}
