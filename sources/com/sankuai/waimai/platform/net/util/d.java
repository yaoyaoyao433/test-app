package com.sankuai.waimai.platform.net.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Set<String> b;
    private static boolean c;
    private static boolean d;

    public static synchronized boolean a(String str) {
        synchronized (d.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74fed76a094975d311cad2c4cf34aa75", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74fed76a094975d311cad2c4cf34aa75")).booleanValue();
            }
            if (!c && !d) {
                Set<String> c2 = com.sankuai.waimai.platform.utils.sharedpreference.a.c();
                if (c2 == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4ad9ca8fdf0556c025ff4719459bd78f", RobustBitConfig.DEFAULT_VALUE)) {
                        c2 = (Set) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4ad9ca8fdf0556c025ff4719459bd78f");
                    } else {
                        c2 = new HashSet<>();
                        c2.add("/comment/mycommentlist");
                        c2.add("/poi/coupon");
                        c2.add("/user/coupons/list");
                        c2.add("/home/rcmdboard");
                        c2.add("/home/dynamic/tabs");
                        c2.add("apimobile.meituan.com/group/v1/city/latlng/");
                        c2.add("v10/user/functions/list");
                        c2.add("v6/ab/exp/strategy");
                        c2.add("v6/order/lastorderstatus");
                        c2.add("v6/set/info");
                        c2.add("v6/task/mvpcoupon/valid");
                        c2.add("v7/loadInfo");
                        c2.add("v7/poi/homepage");
                        c2.add("v7/user/address/getaddr");
                        c2.add("wmlog.meituan.com/api/v6/app/userinfo");
                    }
                }
                b = c2;
                d = true;
            }
            for (String str2 : b) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized void a(List<String> list) {
        HashSet hashSet;
        synchronized (d.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21ff5786d7da9ddf0b23613dadfb1b5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21ff5786d7da9ddf0b23613dadfb1b5d");
                return;
            }
            if (list != null) {
                hashSet = new HashSet(list);
            } else {
                hashSet = new HashSet();
            }
            hashSet.remove("");
            b = hashSet;
            c = true;
            com.sankuai.waimai.platform.utils.sharedpreference.a.a(hashSet);
        }
    }
}
