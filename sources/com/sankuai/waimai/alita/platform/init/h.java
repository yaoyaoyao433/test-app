package com.sankuai.waimai.alita.platform.init;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface h {
    String a();

    int b();

    String c();

    String d();

    int e();

    String f();

    String g();

    String h();

    String i();

    String j();

    String k();

    a l();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        DEVELOP,
        RELEASE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6841b20747662567c6103894230afe9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6841b20747662567c6103894230afe9");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a88e92595178e4a0a84bd834b86659ce", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a88e92595178e4a0a84bd834b86659ce") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8dafa8d139571a883b499ad2b63f5d50", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8dafa8d139571a883b499ad2b63f5d50") : (a[]) values().clone();
        }
    }
}
