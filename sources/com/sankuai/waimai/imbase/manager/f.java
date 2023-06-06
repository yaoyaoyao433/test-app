package com.sankuai.waimai.imbase.manager;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.constant.a;
import com.sankuai.waimai.imbase.utils.h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;
    public static int d = -1;
    public SharedPreferences e;
    public SharedPreferences.Editor f;
    public com.sankuai.waimai.foundation.utils.e g;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad62c3e426edec0d7e9a5b1d997a1138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad62c3e426edec0d7e9a5b1d997a1138");
            return;
        }
        this.e = com.meituan.android.singleton.b.a.getSharedPreferences("wm_group_im", 0);
        this.f = this.e.edit();
        this.g = new com.sankuai.waimai.foundation.utils.e("im_notity_configure_file_name");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final f a = new f();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23c9af6aacbf5728ca735553229c5c11", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23c9af6aacbf5728ca735553229c5c11") : a.a;
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb54e529cc2a6c70104d9f13c086c729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb54e529cc2a6c70104d9f13c086c729");
        } else {
            this.f.putInt(str, i == 1 ? c : b).commit();
        }
    }

    public final boolean b(String str, int i) {
        int i2;
        boolean z;
        boolean z2 = false;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1542ec6f7234d15bf6dd2fc4566e5ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1542ec6f7234d15bf6dd2fc4566e5ac")).booleanValue();
        }
        String b2 = this.g.b((com.sankuai.waimai.foundation.utils.e) a.EnumC0958a.IM_NOTIFY_CONFIGURE, "");
        String str2 = "";
        if (!TextUtils.isEmpty(b2)) {
            Map<String, String> a2 = com.sankuai.waimai.imbase.utils.a.a(b2);
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr2 = {new Long(currentTimeMillis), Utils.SHORT_DATE_FORMAT};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            String format = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8c738e86014ddc7afb7ed96f3acbe18e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8c738e86014ddc7afb7ed96f3acbe18e") : new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.getDefault()).format(new Date(currentTimeMillis));
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                if (h.a(format, entry.getKey())) {
                    str2 = entry.getKey();
                    i2 = r.a(entry.getValue(), 0);
                    break;
                }
            }
        }
        i2 = 0;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String str3 = str2 + CommonConstant.Symbol.MINUS + i;
        String string = this.e.getString(str, "");
        if (!TextUtils.isEmpty(string)) {
            Map a3 = com.sankuai.waimai.imbase.utils.a.a(string);
            if (a3 != null) {
                long a4 = r.a((String) a3.get("time"), 0L);
                Object[] objArr3 = {new Long(a4)};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f67ea13ee22b46754a123c94fa44cf40", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f67ea13ee22b46754a123c94fa44cf40")).booleanValue();
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Object[] objArr4 = {new Long(a4), new Long(currentTimeMillis2)};
                    ChangeQuickRedirect changeQuickRedirect4 = h.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "88fc51559f5a3ad210129aada329a39b", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "88fc51559f5a3ad210129aada329a39b")).booleanValue();
                    } else {
                        z = currentTimeMillis2 / 86400000 == a4 / 86400000;
                    }
                }
                if (!z) {
                    a3.clear();
                }
                int a5 = a3.containsKey(str3) ? r.a((String) a3.get(str3), 0) : 0;
                if (a5 >= i2) {
                    z2 = true;
                } else {
                    a3.put(str3, String.valueOf(a5 + 1));
                }
            } else {
                a3 = new HashMap();
                a3.put(str3, "1");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            a3.put("time", sb.toString());
            this.f.putString(str, com.sankuai.waimai.imbase.utils.a.b(a3)).commit();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(str3, "1");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            hashMap.put("time", sb2.toString());
            this.f.putString(str, com.sankuai.waimai.imbase.utils.a.b(hashMap)).commit();
        }
        return z2;
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee45289e48f7e53a702d9ce67c4c349b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee45289e48f7e53a702d9ce67c4c349b")).longValue();
        }
        SharedPreferences sharedPreferences = this.e;
        return sharedPreferences.getLong("cancel_time_" + j, 0L);
    }
}
