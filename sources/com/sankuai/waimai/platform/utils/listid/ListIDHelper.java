package com.sankuai.waimai.platform.utils.listid;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ListIDHelper {
    public static ChangeQuickRedirect a;
    private HashMap<String, String> b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Repo {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ListIDHelper a = new ListIDHelper();
    }

    public ListIDHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f8dfee4a0a5df9aa1ee5dff859443a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f8dfee4a0a5df9aa1ee5dff859443a");
        } else {
            this.b = new HashMap<>();
        }
    }

    @NonNull
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d69d6887e3e028c9741d29d180f5ed0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d69d6887e3e028c9741d29d180f5ed0") : b();
    }

    public final void a(String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0354b1c6ac13d32098ebcc8fd151d60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0354b1c6ac13d32098ebcc8fd151d60e");
            return;
        }
        this.b.put(str + CommonConstant.Symbol.UNDERLINE + str2, str3);
    }

    @Nullable
    public final String a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c1d3d0becef6cd9b6710699d0b5b74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c1d3d0becef6cd9b6710699d0b5b74");
        }
        return this.b.get(str + CommonConstant.Symbol.UNDERLINE + str2);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff2661330810478b77511cc97bf2186", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff2661330810478b77511cc97bf2186") : UUID.randomUUID().toString().replaceAll(CommonConstant.Symbol.MINUS, "");
    }
}
