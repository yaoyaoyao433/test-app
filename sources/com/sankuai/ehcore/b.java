package com.sankuai.ehcore;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.ehcore.horn.e;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static Context b = null;
    private static a c = null;
    private static boolean d = false;
    private static long e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public static void a(@NonNull Context context, a aVar) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80d3d8e9142dd31cd990ceacf97e15ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80d3d8e9142dd31cd990ceacf97e15ec");
            return;
        }
        try {
            d = true;
            b = context;
            c = null;
            e = System.currentTimeMillis();
            Horn.init(context);
            e.a(context);
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "892bb1422dbd6197945e0428f4906cd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "892bb1422dbd6197945e0428f4906cd9");
            } else {
                com.sankuai.eh.component.service.a.a(context, new com.sankuai.eh.component.service.env.b() { // from class: com.sankuai.ehcore.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String g() {
                        return null;
                    }

                    private KNBWebManager.IEnvironment l() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb2f3d4c2f08b164dd5b07d8a0c140c2", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebManager.IEnvironment) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb2f3d4c2f08b164dd5b07d8a0c140c2") : KNBWebManager.getEnvironment();
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb5ea14a23bcb26fe05e6f05c4deda2a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb5ea14a23bcb26fe05e6f05c4deda2a") : l() != null ? l().getCityId() : "0";
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fcc3c59c499bcf45ac32ab9568d7ece", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fcc3c59c499bcf45ac32ab9568d7ece") : l() != null ? l().getLat() : "0";
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33f0272e2848e023e47b907fd4e915b6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33f0272e2848e023e47b907fd4e915b6") : l() != null ? l().getLng() : "0";
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String d() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "712d870295b49126457a960127cbe752", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "712d870295b49126457a960127cbe752") : l() != null ? l().getUserId() : "";
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String e() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d47c3e770bca3acfa7dabd919fe98c85", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d47c3e770bca3acfa7dabd919fe98c85") : l() != null ? l().getUserToken() : "";
                    }

                    @Override // com.sankuai.eh.component.service.env.b
                    public final String f() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9222ebbbbbbf8b59dad5072ab4bff850", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9222ebbbbbbf8b59dad5072ab4bff850") : l() != null ? l().getUUID() : "";
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public static Context a() {
        return b;
    }

    public static boolean b() {
        return d;
    }

    public static long c() {
        return e;
    }
}
