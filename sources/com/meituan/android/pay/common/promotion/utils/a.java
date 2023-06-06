package com.meituan.android.pay.common.promotion.utils;

import android.text.TextUtils;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.paybase.utils.d;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return (i == 2 || i == 3) ? false : true;
    }

    public static boolean a(PayLabel payLabel) {
        boolean z;
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fe6f801a95f10854ac457b5c396e957", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fe6f801a95f10854ac457b5c396e957")).booleanValue();
        }
        if (payLabel != null && payLabel.getLabelSwitch() != null) {
            Object[] objArr2 = {payLabel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0b6163aa83c4569f1db9642b1efd6315", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0b6163aa83c4569f1db9642b1efd6315")).booleanValue();
            } else {
                z = payLabel != null && (1 == payLabel.getLabelSwitch().getCheck() || 2 == payLabel.getLabelSwitch().getCheck());
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4da511a3c34583dd1021ae3a1f81474", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4da511a3c34583dd1021ae3a1f81474")).booleanValue() : (payLabel == null || b(payLabel) || !TextUtils.equals(payLabel.getItemType(), PayLabel.ITEM_TYPE_DISCOUNT)) ? false : true;
    }

    private static boolean f(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3627c4fbed05b8e89b304151d65dd84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3627c4fbed05b8e89b304151d65dd84")).booleanValue() : (payLabel == null || b(payLabel) || !TextUtils.equals(payLabel.getItemType(), PayLabel.ITEM_TYPE_REWARD)) ? false : true;
    }

    public static boolean b(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0cb700b9a785dbce47b45cc32535992", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0cb700b9a785dbce47b45cc32535992")).booleanValue() : payLabel != null && TextUtils.equals(payLabel.getLabelType(), "total");
    }

    public static boolean c(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1474d6cf2fb080e3c0d157b4036aa887", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1474d6cf2fb080e3c0d157b4036aa887")).booleanValue() : payLabel != null && TextUtils.equals(payLabel.getLabelType(), "coupon");
    }

    public static boolean a(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1ca8b517bfe3fa2cdb1be6b4c938d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1ca8b517bfe3fa2cdb1be6b4c938d0a")).booleanValue();
        }
        if (!i.a((Collection) list)) {
            for (CombineLabel combineLabel : list) {
                if (combineLabel != null && !i.a((Collection) combineLabel.getChildrenLabel())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d24bdd188aaff579ad5d600c1f48fafd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d24bdd188aaff579ad5d600c1f48fafd")).booleanValue() : payLabel != null && e(payLabel);
    }

    public static ArrayList<CombineLabel> b(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "721d947c3781d8e05943ae000c03c12d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "721d947c3781d8e05943ae000c03c12d");
        }
        ArrayList<CombineLabel> arrayList = new ArrayList<>();
        if (i.a((Collection) list)) {
            return null;
        }
        for (CombineLabel combineLabel : list) {
            if (!i.a((Collection) combineLabel.getChildrenLabel())) {
                arrayList.add(combineLabel);
            }
        }
        return arrayList;
    }

    public static List<CombineLabel> c(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c02d891c0ac67bb2262f901d5f55729", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c02d891c0ac67bb2262f901d5f55729");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        Iterator<CombineLabel> it = list.iterator();
        while (it.hasNext()) {
            if (!i.a((Collection) it.next().getChildrenLabel())) {
                it.remove();
            }
        }
        return list;
    }

    public static BigDecimal d(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09d72c741553f9eca29d9bc83c3cd953", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09d72c741553f9eca29d9bc83c3cd953");
        }
        BigDecimal a2 = d.a("0.00");
        if (!i.a((Collection) list)) {
            for (CombineLabel combineLabel : list) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (!i.a((Collection) childrenLabel)) {
                    for (PayLabel payLabel : childrenLabel) {
                        if (a(payLabel) && e(payLabel)) {
                            a2 = d.a(Float.valueOf(payLabel.getDiscount()), a2);
                        }
                    }
                }
            }
        }
        return a2;
    }

    public static BigDecimal a(List<CombineLabel> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d75257080efbc28e6a401c9dfd7684c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d75257080efbc28e6a401c9dfd7684c6");
        }
        BigDecimal a2 = d.a("0.00");
        if (!i.a((Collection) list)) {
            for (CombineLabel combineLabel : list) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (!i.a((Collection) childrenLabel)) {
                    for (PayLabel payLabel : childrenLabel) {
                        if (a(payLabel) && e(payLabel)) {
                            a2 = d.a(Float.valueOf(z ? payLabel.getRealDiscount() : payLabel.getDiscount()), a2);
                        }
                    }
                }
            }
        }
        return a2;
    }

    public static BigDecimal e(List<PayLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6590cab7963a3a23f2e843b3730e42c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6590cab7963a3a23f2e843b3730e42c5");
        }
        BigDecimal a2 = d.a("0.00");
        for (PayLabel payLabel : list) {
            if (a(payLabel) && e(payLabel)) {
                a2 = d.a(Float.valueOf(payLabel.getRealDiscount()), a2);
            }
        }
        return a2;
    }

    public static int f(List<CombineLabel> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3f1adb69677d8253f559f0b3c76acba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3f1adb69677d8253f559f0b3c76acba")).intValue();
        }
        if (!i.a((Collection) list)) {
            for (CombineLabel combineLabel : list) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (!i.a((Collection) childrenLabel)) {
                    for (PayLabel payLabel : childrenLabel) {
                        if (a(payLabel) && f(payLabel)) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static int g(List<CombineLabel> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cdf7567da0a99e42e92f1c0fc1e503b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cdf7567da0a99e42e92f1c0fc1e503b")).intValue();
        }
        if (i.a((Collection) list)) {
            return 0;
        }
        int i2 = 0;
        for (CombineLabel combineLabel : list) {
            List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
            if (!i.a((Collection) childrenLabel)) {
                for (PayLabel payLabel : childrenLabel) {
                    if (f(payLabel)) {
                        i = 2;
                    }
                    if (e(payLabel)) {
                        i2 = 1;
                    }
                }
            }
        }
        return i + i2;
    }
}
