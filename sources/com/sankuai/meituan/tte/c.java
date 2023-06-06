package com.sankuai.meituan.tte;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends Exception {
    public static ChangeQuickRedirect a;
    public final int b;

    public c(String str, int i) {
        super(str);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0cafae1bf336a7394795889c21e5dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0cafae1bf336a7394795889c21e5dd");
        } else {
            this.b = i;
        }
    }

    public c(String str, Throwable th, int i) {
        super(str, th);
        Object[] objArr = {str, th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3be9b668a5d76088df0b6e23fc3f71c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3be9b668a5d76088df0b6e23fc3f71c");
        } else {
            this.b = i;
        }
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5f182c4f745c7f2c851178abb5e452", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5f182c4f745c7f2c851178abb5e452");
        }
        return super.getMessage() + "; code=" + this.b + "; 参考文档：https://km.sankuai.com/page/1331071454";
    }
}
