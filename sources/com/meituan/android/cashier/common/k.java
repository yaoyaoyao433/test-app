package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public int b;
    public List<CashierScopeBean> c;
    @ProductTypeConstant.ProductType
    public String d;

    public final String[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ceea27eac35f0a247424f5bb98d454", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ceea27eac35f0a247424f5bb98d454");
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) this.c) || this.c.size() <= this.b) {
            return null;
        }
        String[] strArr = new String[(this.c.size() - 1) - this.b];
        int i = this.b;
        while (true) {
            i++;
            if (i >= this.c.size()) {
                return strArr;
            }
            strArr[(i - this.b) - 1] = this.c.get(i).getDestCashier();
        }
    }

    public final void a(@ProductTypeConstant.ProductType String str, List<CashierScopeBean> list, String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a13ae0391636057864bfbff185c5f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a13ae0391636057864bfbff185c5f2");
            return;
        }
        this.d = str;
        this.c = list;
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(list.get(i).getDestCashier(), str2)) {
                this.b = i;
                return;
            }
        }
    }
}
