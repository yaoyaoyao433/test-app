package com.sankuai.waimai.business.page.home.list;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final Integer b;
    public static final Integer c;
    public static final Integer d;
    private static a j;
    public int e;
    public int f;
    public int g;
    public String h;
    private int i;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b456ddcaf010671faa236e55dd712db8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b456ddcaf010671faa236e55dd712db8");
        } else {
            this.h = "";
        }
    }

    static {
        Integer num = 0;
        b = num;
        Integer valueOf = Integer.valueOf(num.intValue() + 1);
        c = valueOf;
        d = Integer.valueOf(valueOf.intValue() + 1);
        j = null;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81a39fae227f92bff5f564cc9f861425", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81a39fae227f92bff5f564cc9f861425");
        }
        if (j == null) {
            j = new a();
        }
        return j;
    }

    public final int a(int i, View view) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260ee3116adb35149def2699eaa2dba3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260ee3116adb35149def2699eaa2dba3")).intValue();
        }
        if (view == null || this.e == 0) {
            return -1;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (i == b.intValue()) {
            i2 = this.i;
        } else if (i == d.intValue()) {
            i2 = this.g;
        }
        return (((this.f + i2) + iArr[1]) / this.e) + 1;
    }
}
