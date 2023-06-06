package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static int a() {
        String str;
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baf2851fb5fcc9310eeff00a340ab50c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baf2851fb5fcc9310eeff00a340ab50c")).intValue();
        }
        try {
            str = com.sankuai.waimai.foundation.utils.p.b(com.meituan.android.singleton.b.a.getApplicationContext());
        } catch (Exception unused) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode == 1621) {
            if (str.equals("2G")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 1652) {
            if (str.equals("3G")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1683) {
            if (hashCode == 2694997 && str.equals("WiFi")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("4G")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return -1;
        }
    }
}
