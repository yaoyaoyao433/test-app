package com.meituan.android.pay.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.pay.common.payment.data.c a(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15d5a151dc2a062f2d094c8f1f66e80b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15d5a151dc2a062f2d094c8f1f66e80b");
        }
        if (bankInfo.getCashDesk() != null) {
            return bankInfo.getCashDesk();
        }
        return null;
    }

    public static DeskData a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "224f9d8b844bba99261f518fdad13525", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeskData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "224f9d8b844bba99261f518fdad13525");
        }
        if (TextUtils.equals("4", com.meituan.android.pay.common.payment.utils.b.b(activity, "verify_type"))) {
            return new DeskData.a().a(str).b;
        }
        return null;
    }

    public static DetainmentDialogInfo a(Activity activity, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad85578888bf7f16ca69ea29af3f2c35", RobustBitConfig.DEFAULT_VALUE)) {
            return (DetainmentDialogInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad85578888bf7f16ca69ea29af3f2c35");
        }
        if (cVar instanceof CashDesk) {
            DetainmentDialogInfo a2 = com.meituan.android.pay.desk.component.data.a.a(activity, cVar, new DetainmentDialogInfo());
            a2.setNbVersion(com.meituan.android.paybase.config.a.d().q());
            a2.setShowDialog(false);
            return a2;
        }
        return null;
    }

    public static boolean b(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81aad6182013db49da0c1cef36d42582", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81aad6182013db49da0c1cef36d42582")).booleanValue() : (bankInfo == null || bankInfo.getPasswordProcessInfo() == null || bankInfo.getPasswordProcessInfo().isShowAlready()) ? false : true;
    }

    public static boolean c(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91da5b86d7c2493b70c82658f38b42f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91da5b86d7c2493b70c82658f38b42f1")).booleanValue() : (bankInfo == null || bankInfo.getCheckPayPasswordInfo() == null) ? false : true;
    }

    public static boolean d(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32f5ffaddee6f0ec2c3c320b2d38b397", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32f5ffaddee6f0ec2c3c320b2d38b397")).booleanValue() : (bankInfo == null || com.meituan.android.paybase.utils.i.a((Collection) bankInfo.getFactors())) ? false : true;
    }

    public static boolean e(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50561801e0cceb8031997ddb93b76ec7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50561801e0cceb8031997ddb93b76ec7")).booleanValue() : d(bankInfo) && TextUtils.equals("/qdbpay/riskpay", bankInfo.getSubmitUrl());
    }

    public static boolean f(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0c1ed2e1d5518afc4b19dc08d3bd3d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0c1ed2e1d5518afc4b19dc08d3bd3d6")).booleanValue() : (bankInfo == null || bankInfo.getBanks() == null) ? false : true;
    }

    public static boolean g(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f11b8015b2ee9ed53f580665f44ab7f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f11b8015b2ee9ed53f580665f44ab7f5")).booleanValue() : (bankInfo == null || bankInfo.getPointDeductAlert() == null) ? false : true;
    }

    public static boolean h(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bfe3e4c0ff7e43dff4790fc39758cd5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bfe3e4c0ff7e43dff4790fc39758cd5")).booleanValue() : (bankInfo == null || bankInfo.getPayErrorGuide() == null) ? false : true;
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cefd44471284338f82216ef5a7694d85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cefd44471284338f82216ef5a7694d85")).booleanValue() : com.meituan.android.pay.process.ntv.a.b.equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "is_payed"));
    }
}
