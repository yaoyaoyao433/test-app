package com.meituan.android.neohybrid.neo.report;

import android.text.TextUtils;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Map<String, Object> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282a0e49ef2012c6c4be208444718e44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282a0e49ef2012c6c4be208444718e44");
        } else {
            this.b = new HashMap();
        }
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9d3d7afb704b0b4edda468a28ca993", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9d3d7afb704b0b4edda468a28ca993") : new HashMap(this.b);
    }

    public final void a(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f6a6591c7e7a8dec6efd516f195381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f6a6591c7e7a8dec6efd516f195381");
        } else if (i.a(map)) {
        } else {
            this.b.putAll(map);
        }
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cce7a6bad611b1f616c476357417b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cce7a6bad611b1f616c476357417b05");
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.b.put(str, obj);
        }
    }

    public final void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb083660385dfcdba0d9ece0f72cea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb083660385dfcdba0d9ece0f72cea9");
            return;
        }
        if (i.a(map)) {
            map = new HashMap<>();
        }
        Map<String, Object> a2 = a();
        a2.putAll(map);
        b.a(str, str2, a2);
    }

    public final void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9e0397e41d646adf18496f3ad1b124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9e0397e41d646adf18496f3ad1b124");
            return;
        }
        if (i.a(map)) {
            map = new HashMap<>();
        }
        Map<String, Object> a2 = a();
        a2.putAll(map);
        b.a(str, str2, str3, a2);
    }

    public final void b(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45aedf9c0fec991c317794fd9aed4505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45aedf9c0fec991c317794fd9aed4505");
            return;
        }
        if (i.a(map)) {
            map = new HashMap<>();
        }
        Map<String, Object> a2 = a();
        a2.putAll(map);
        b.b(str, str2, str3, a2);
    }

    public final void a(String str, Map<String, Object> map, List<Float> list) {
        Object[] objArr = {str, map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c75b8925cd61bb95867e5beb0e2e111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c75b8925cd61bb95867e5beb0e2e111");
            return;
        }
        if (i.a(map)) {
            map = new HashMap<>();
        }
        Map<String, Object> a2 = a();
        a2.putAll(map);
        c.a(str, a2, list);
    }
}
