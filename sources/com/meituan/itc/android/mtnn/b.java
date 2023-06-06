package com.meituan.itc.android.mtnn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    NO_ERROR(0),
    OUT_OF_MEMORY(1),
    NOT_SUPPORT(2),
    COMPUTE_SIZE_ERROR(3),
    NO_EXECUTION(4),
    INPUT_DATA_ERROR(10),
    CALL_BACK_STOP(11),
    TENSOR_NOT_SUPPORT(20),
    TENSOR_NEED_DIVIDE(21);
    
    public static ChangeQuickRedirect a;
    private int k;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a85850a02baf5652430035ef6e98edd", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a85850a02baf5652430035ef6e98edd") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00419c6befe2ae9c00292a73be8e8ca4", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00419c6befe2ae9c00292a73be8e8ca4") : (b[]) values().clone();
    }

    b(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d3a383efe23f1211295a294ef1a3fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d3a383efe23f1211295a294ef1a3fa");
        } else {
            this.k = i;
        }
    }

    public static b a(int i) {
        b[] valuesCustom;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "598103e5abd4cdfd0639e0346fc4b958", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "598103e5abd4cdfd0639e0346fc4b958");
        }
        for (b bVar : valuesCustom()) {
            if (bVar.k == i) {
                return bVar;
            }
        }
        return null;
    }
}
