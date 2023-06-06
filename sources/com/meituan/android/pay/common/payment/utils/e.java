package com.meituan.android.pay.common.payment.utils;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return 1 == i;
    }

    public static Period a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9698a611613903f45921788c99a43f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Period) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9698a611613903f45921788c99a43f4");
        }
        if (mTPayment == null) {
            return null;
        }
        Installment installment = mTPayment.getInstallment();
        if ((c.e(mTPayment.getPayType()) || a((com.meituan.android.pay.common.payment.data.d) mTPayment)) && installment != null) {
            List<Period> periodList = installment.getPeriodList();
            if (i.a((Collection) periodList)) {
                return null;
            }
            for (Period period : periodList) {
                if (period.isSelected()) {
                    return period;
                }
            }
        }
        return null;
    }

    public static boolean a(com.meituan.android.pay.common.payment.data.d dVar, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        boolean z;
        Object[] objArr = {dVar, bigDecimal, bigDecimal2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3ffd75254f2526f30dc67aa3bffba18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3ffd75254f2526f30dc67aa3bffba18")).booleanValue();
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            if (mTPayment.getInstallment() != null && !TextUtils.isEmpty(mTPayment.getInstallment().getAllPeriods())) {
                z = true;
                return !z && (c.e(dVar.getPayType()) || a(dVar)) && com.meituan.android.paybase.utils.d.c(bigDecimal, bigDecimal2) != 0;
            }
        }
        z = false;
        if (z) {
        }
    }

    public static boolean b(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e5e35a50e92c0de2cd80b9a1e1e367", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e5e35a50e92c0de2cd80b9a1e1e367")).booleanValue() : mTPayment != null && a(mTPayment.getIsSupportInstallment());
    }

    public static Period a(List<Period> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304bdd1b6dbea8ed5d97d0127a6839ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Period) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304bdd1b6dbea8ed5d97d0127a6839ef");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        for (Period period : list) {
            if (period.isSelected()) {
                return period;
            }
        }
        return list.get(0);
    }

    public static int c(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dba65b13d625bfa9370a24d6f8ba2ee4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dba65b13d625bfa9370a24d6f8ba2ee4")).intValue();
        }
        Period a2 = a(mTPayment);
        if (a2 != null) {
            return a2.getPeriod();
        }
        return -1;
    }

    public static boolean a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ffd96665863e6d28b4a450d831de5dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ffd96665863e6d28b4a450d831de5dd")).booleanValue();
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            return c.a(mTPayment) && b(mTPayment);
        }
        return false;
    }

    public static void a(TextView textView, String str, String str2, int i, int i2) {
        Object[] objArr = {textView, str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a69beaadeef6b9a7017f8216972d7fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a69beaadeef6b9a7017f8216972d7fcc");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            SpannableString spannableString = new SpannableString(str + str2);
            int length = str.length();
            int length2 = str2.length();
            spannableString.setSpan(new ForegroundColorSpan(i), 0, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(i2), length, length2 + length, 33);
            textView.setText(spannableString);
            textView.setSingleLine(false);
        }
    }
}
