package com.meituan.android.cashier.common;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.meituan.android.cashier.bean.CashierScopeBean> a(com.meituan.android.cashier.bean.CashierParams r18, @com.meituan.android.cashier.common.ProductTypeConstant.ProductType java.lang.String r19) {
        /*
            r1 = r19
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = 0
            r0[r9] = r18
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.cashier.common.d.a
            java.lang.String r12 = "1fbc35140e709ca15f96c231cde8b801"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r0
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r3, r11, r10, r12)
            java.util.List r0 = (java.util.List) r0
            return r0
        L23:
            java.util.Map r0 = a(r18)
            if (r0 == 0) goto L4b
            com.google.gson.Gson r2 = com.meituan.android.paybase.utils.n.a()
            java.lang.String r0 = r2.toJson(r0)
            com.google.gson.Gson r2 = com.meituan.android.paybase.utils.n.a()     // Catch: java.lang.Exception -> L45
            com.meituan.android.cashier.common.d$1 r4 = new com.meituan.android.cashier.common.d$1     // Catch: java.lang.Exception -> L45
            r4.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Type r4 = r4.getType()     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r2.fromJson(r0, r4)     // Catch: java.lang.Exception -> L45
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L45
            goto L4c
        L45:
            r0 = move-exception
            java.lang.String r2 = "CashierArrangeManager_getCashierScopeBean"
            com.meituan.android.paybase.common.analyse.a.a(r0, r2, r3)
        L4b:
            r0 = r3
        L4c:
            if (r0 != 0) goto L4f
            return r3
        L4f:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r4 = com.meituan.android.cashier.common.d.a
            java.lang.String r5 = "889c6194962d75032a7c90f1cc184c5b"
            r12 = 0
            r14 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = r2
            r13 = r4
            r15 = r5
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L6b
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r10, r5)
            java.lang.String r1 = (java.lang.String) r1
            goto L7c
        L6b:
            java.lang.String r2 = "standard-cashier"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 == 0) goto L7c
            boolean r2 = com.meituan.android.cashier.common.r.b()
            if (r2 == 0) goto L7c
            java.lang.String r1 = "elderly-cashier"
        L7c:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.common.d.a(com.meituan.android.cashier.bean.CashierParams, java.lang.String):java.util.List");
    }

    public static String[] a(List<CashierScopeBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d97c5939a5bb37bc69c924331b1d1ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d97c5939a5bb37bc69c924331b1d1ee2");
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i).getDestCashier();
        }
        return strArr;
    }

    public static Map<String, List<CashierScopeBean>> a(CashierParams cashierParams) {
        Object[] objArr = {cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b42e366e55bd18bfab30a56e5d0543b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b42e366e55bd18bfab30a56e5d0543b");
        }
        Map<String, List<CashierScopeBean>> preDispatcherArrange = cashierParams != null ? cashierParams.getPreDispatcherArrange() : null;
        if (com.meituan.android.paybase.utils.i.a(preDispatcherArrange)) {
            preDispatcherArrange = b.a().b;
        }
        if (com.meituan.android.paybase.utils.i.a(preDispatcherArrange)) {
            try {
                return (Map) com.meituan.android.paybase.utils.n.a().fromJson("{\n    \"paydefer-cashier\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_pre_guide_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"meituanpay_component\": [\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"meituanpay_component\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"weekpay\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"weekpay\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"pay_defer_sign\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"pay_defer_sign\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"elderly-cashier\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_elderly_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"web_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"oneclickpay\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"oneclickpay\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"web_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"standard-cashier\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"web_cashier\",\n            \"downgrade_available\":false\n        }\n    ],\n    \"preposed-mtcashier\":[\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_preposed_mtcashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"hybrid_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"native_standard_cashier\",\n            \"downgrade_available\":true\n        },\n        {\n            \"minVersion\":\"\",\n            \"maxVersion\":\"\",\n            \"blackList\":[\n\n            ],\n            \"dest_cashier\":\"web_cashier\",\n            \"downgrade_available\":false\n        }\n    ]\n}", new TypeToken<Map<String, List<CashierScopeBean>>>() { // from class: com.meituan.android.cashier.common.d.2
                }.getType());
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierArrangeManager_getCashierArrangeBean", (Map<String, Object>) null);
                return preDispatcherArrange;
            }
        }
        return preDispatcherArrange;
    }
}
