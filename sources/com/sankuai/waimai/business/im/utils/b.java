package com.sankuai.waimai.business.im.utils;

import android.support.annotation.NonNull;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "nickname";
    public static String c = "user_avatar";
    public static String d = "is_new_user";
    public static String e = "binded_phone";
    public static String f = "uuid";
    public static String g = "finger_info";
    public static String h = "user_actual_longitude";
    public static String i = "user_actual_latitude";
    public static String j = "app_version";
    public static String k = "platform";
    public static String l = "is_copy";
    public static String m;

    public static void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deb13a377a077bec0db6cdd97d5d7220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deb13a377a077bec0db6cdd97d5d7220");
            return;
        }
        map.put(k, Integer.valueOf(Integer.parseInt(com.sankuai.waimai.platform.b.A().u())));
        map.put(j, com.sankuai.waimai.platform.b.A().i());
        map.put(f, com.sankuai.waimai.platform.b.A().c());
        WMLocation i2 = g.a().i();
        if (i2 != null) {
            double latitude = i2.getLatitude();
            double longitude = i2.getLongitude();
            map.put(i, Long.valueOf((long) (latitude * 1000000.0d)));
            map.put(h, Long.valueOf((long) (longitude * 1000000.0d)));
        } else {
            map.put(i, 0L);
            map.put(h, 0L);
        }
        if (m == null) {
            m = a();
        }
        map.put(g, m);
        User user = UserCenter.getInstance(com.meituan.android.singleton.b.a).getUser();
        if (user != null) {
            map.put(b, user.username);
            map.put(c, user.avatarurl == null ? "" : user.avatarurl);
            map.put(e, user.mobile);
            map.put(d, Boolean.valueOf(user.newreg == 1));
        }
    }

    public static synchronized String a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "349bc3d25cfa1d9e2cc1b4cca4830239", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "349bc3d25cfa1d9e2cc1b4cca4830239");
            }
            String E = com.sankuai.waimai.platform.b.A().E();
            m = E;
            return E;
        }
    }

    public static void a(@NonNull IMMessage iMMessage, @NonNull Map<String, Object> map) {
        Object[] objArr = {iMMessage, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04ba0adcfe6769127b4bef15454d1340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04ba0adcfe6769127b4bef15454d1340");
            return;
        }
        map.put(l, Boolean.FALSE);
        try {
            CharSequence a2 = com.meituan.android.clipboard.a.a("dj-b490da523971aa47", "waimai_im");
            if (iMMessage instanceof TextMessage) {
                map.put(l, Boolean.valueOf(((TextMessage) iMMessage).getText().equals(a2)));
            }
        } catch (Throwable unused) {
        }
    }
}
