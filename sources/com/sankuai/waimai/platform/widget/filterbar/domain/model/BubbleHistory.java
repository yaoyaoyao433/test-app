package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class BubbleHistory {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public a d;
    public long e;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Type {
    }

    private static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21885a94f0ad459bb57abcf582280be6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21885a94f0ad459bb57abcf582280be6")).booleanValue() : i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61470a3d0da7caf4339c1cbe08c74834", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61470a3d0da7caf4339c1cbe08c74834")).booleanValue() : (!a(this.b) || TextUtils.isEmpty(this.c) || this.d == null) ? false : true;
    }

    public final boolean a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20bd4ed4d77bf0428bf65fb3d4f1e2db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20bd4ed4d77bf0428bf65fb3d4f1e2db")).booleanValue() : a() && this.b == i && this.c.equals(str);
    }

    public final boolean a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9895193272b9aa94d63a6544ed432f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9895193272b9aa94d63a6544ed432f")).booleanValue() : a() && this.b == i && this.c.equals(str) && this.d.b == i2;
    }
}
