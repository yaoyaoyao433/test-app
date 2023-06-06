package com.meituan.android.elderly.utils;

import com.meituan.android.cashier.common.q;
import com.meituan.android.elderly.bean.CashierPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.ReduceInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static long b;

    public static Map<String, Object> a(d dVar) {
        ReduceInfo noBalanceReduceInfo;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "334355e175a034f27baffcb976a27250", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "334355e175a034f27baffcb976a27250");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        hashMap.put("platform", "android");
        hashMap.put("pay_type", dVar.getPayType());
        hashMap.put("is_select", Boolean.valueOf(dVar.isSelected()));
        if (dVar.getPaymentReduce() != null && (noBalanceReduceInfo = dVar.getPaymentReduce().getNoBalanceReduceInfo()) != null) {
            hashMap.put("activity_id", noBalanceReduceInfo.getCampaignId());
        }
        ArrayList arrayList = new ArrayList();
        List<CombineLabel> rightLabels = dVar.getRightLabels();
        if (!i.a((Collection) rightLabels)) {
            for (CombineLabel combineLabel : rightLabels) {
                arrayList.add(combineLabel.getContent());
            }
        }
        List<CombineLabel> bottomLabels = dVar.getBottomLabels();
        if (!i.a((Collection) bottomLabels)) {
            for (CombineLabel combineLabel2 : bottomLabels) {
                arrayList.add(combineLabel2.getContent());
            }
        }
        if (!i.a((Collection) arrayList)) {
            hashMap.put("activity_tip", arrayList);
        }
        if (dVar instanceof CashierPayment) {
            hashMap.put("is_folded", Boolean.FALSE);
        }
        return hashMap;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f29779612908a0ae08e326a319ccf49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f29779612908a0ae08e326a319ccf49");
        } else {
            q.a("c_PJmoK", "b_pay_p3cw2gqv_mv", "", new a.c().a("sub_type", "1").b, str);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4abd5b5ed6e0167a19e8ac7e7174407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4abd5b5ed6e0167a19e8ac7e7174407");
        } else {
            q.a("native_elderlycashier_start", (Map<String, Object>) null, (List<Float>) null, str);
        }
    }

    public static void a(long j) {
        b = j;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaf998fc0b36453417d7b7381a4645cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaf998fc0b36453417d7b7381a4645cb");
        } else {
            q.a("c_PJmoK", "b_ti8debp1", "", new a.c().a("duration", Long.valueOf(System.currentTimeMillis() - b)).a("lastResumedPage", str2).a("sub_type", "1").b, str);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d856a169b76c032b144b1b5dad9c0855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d856a169b76c032b144b1b5dad9c0855");
        } else {
            q.a("native_elderlycashier_start_succ", (Map<String, Object>) null, (List<Float>) null, str);
        }
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b1c07abd355892449e0b514220e6519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b1c07abd355892449e0b514220e6519");
            return;
        }
        a.c cVar = new a.c();
        q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", str + str2).a("sub_type", "1").b, str3);
    }
}
