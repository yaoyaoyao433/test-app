package com.sankuai.xm.base.util;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f<T> {
    public static ChangeQuickRedirect a;
    private String b;
    private volatile T c;
    private volatile long d;
    private SharedPreferences e;
    private T f;

    public f(SharedPreferences sharedPreferences, @NonNull String str, T t) {
        Object[] objArr = {sharedPreferences, str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6bd410a763c2f2863960941f455dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6bd410a763c2f2863960941f455dc7");
            return;
        }
        this.e = sharedPreferences;
        this.b = "daily_" + str;
        this.c = t;
        this.f = t;
    }

    public final T a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f6462abf44775e8a03878595fbf4c8", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f6462abf44775e8a03878595fbf4c8");
        }
        b();
        c();
        b(t);
        return this.c;
    }

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508b68bc48f4ca2bc6899021913563be", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508b68bc48f4ca2bc6899021913563be");
        }
        b();
        c();
        return this.c == null ? this.f : this.c;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40a00267f906155edc3ff8d9ee0a061", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40a00267f906155edc3ff8d9ee0a061");
        } else if (this.d > 0) {
        } else {
            synchronized (this) {
                if (this.d > 0) {
                    return;
                }
                if (this.e == null) {
                    this.d = System.currentTimeMillis();
                } else {
                    Map<String, ?> all = this.e.getAll();
                    if (all != null && !(all.get(this.b) instanceof String)) {
                        this.d = System.currentTimeMillis();
                        return;
                    }
                    String string = this.e.getString(this.b, "");
                    if (ac.a(string)) {
                        this.d = System.currentTimeMillis();
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        this.d = jSONObject.optLong("t", System.currentTimeMillis());
                        this.c = (T) jSONObject.opt(com.huawei.hms.opendevice.c.a);
                    } catch (Exception e) {
                        this.d = System.currentTimeMillis();
                        com.sankuai.xm.log.c.d("DailyCache", "obtain, e = " + e, new Object[0]);
                    }
                }
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9a73fd68012a3006a8acc925df60fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9a73fd68012a3006a8acc925df60fb");
        } else if (this.d <= 0 || this.d >= d()) {
        } else {
            b(null);
        }
    }

    private void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb92b3cbe3779ef45db54df73e05dc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb92b3cbe3779ef45db54df73e05dc0");
            return;
        }
        this.c = t;
        this.d = System.currentTimeMillis();
        if (t == null && this.e != null) {
            this.e.edit().remove(this.b).apply();
        } else if (this.e != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("t", this.d);
                jSONObject.put(com.huawei.hms.opendevice.c.a, t);
                this.e.edit().putString(this.b, jSONObject.toString()).apply();
            } catch (Exception e) {
                com.sankuai.xm.log.c.d("DailyCache", "put, e = " + e, new Object[0]);
            }
        }
    }

    private long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26215436b05493b7958c1d5b175b3a55", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26215436b05493b7958c1d5b175b3a55")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }
}
