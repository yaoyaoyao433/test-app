package com.meituan.android.screenshot.retrofit2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static i.a b;

    public static i.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6581f79efb4e6c6525ee1c0dd6c83ad5", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6581f79efb4e6c6525ee1c0dd6c83ad5");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = com.sankuai.meituan.retrofit2.converter.gson.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5dec02780143fcefd91e563b51505a42", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5dec02780143fcefd91e563b51505a42") : new GsonBuilder().create());
                }
            }
        }
        return b;
    }
}
