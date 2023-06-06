package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.bean.CashierRouterInfo;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;
    public CashierRouterInfo b;
    private Map<String, List<CashierScopeBean>> c;

    public o(CashierRouterInfo cashierRouterInfo) {
        Object[] objArr = {cashierRouterInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4618809250f56e01a122f1934b7bff86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4618809250f56e01a122f1934b7bff86");
        } else {
            this.b = cashierRouterInfo;
        }
    }

    public final Map<String, List<CashierScopeBean>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8841fa28b5556a0384073244acef92b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8841fa28b5556a0384073244acef92b");
        }
        if (this.c != null) {
            return this.c;
        }
        try {
            Object a2 = a("arrange");
            if (a2 == null) {
                return null;
            }
            this.c = (Map) com.meituan.android.paybase.utils.n.a().fromJson(a2.toString(), new TypeToken<Map<String, List<CashierScopeBean>>>() { // from class: com.meituan.android.cashier.common.o.1
            }.getType());
            return this.c;
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierRouterInfoParse_getArrange", (Map<String, Object>) null);
            return null;
        }
    }

    public Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87feb396e2bb870f98d9972f9773864e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87feb396e2bb870f98d9972f9773864e");
        }
        if (this.b == null) {
            return null;
        }
        String clientRouterInfo = this.b.getClientRouterInfo();
        if (TextUtils.isEmpty(clientRouterInfo)) {
            return null;
        }
        try {
            return new JSONObject(clientRouterInfo).opt(str);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierRouterInfoParse_opt", (Map<String, Object>) null);
            return null;
        }
    }
}
