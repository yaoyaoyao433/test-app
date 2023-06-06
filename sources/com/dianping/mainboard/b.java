package com.dianping.mainboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import rx.subjects.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b d;
    protected Bundle b;
    protected HashMap<String, e> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368e97905be2f378dea5589274fff909", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368e97905be2f378dea5589274fff909");
            return;
        }
        this.b = new Bundle();
        this.c = new HashMap<>();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37d4322b6395396b15a6b9abcbdbaeb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37d4322b6395396b15a6b9abcbdbaeb6");
        }
        if (d == null) {
            synchronized (b.class) {
                d = new b();
            }
        }
        return d;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37600eb6c870f543c5659b90de91b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37600eb6c870f543c5659b90de91b71");
        } else if (this.c.containsKey(str)) {
            this.c.get(str).onNext(this.b.get(str));
        }
    }

    public final void a(@Nullable String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0caced9b4eef8b935da067746bf318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0caced9b4eef8b935da067746bf318");
            return;
        }
        this.b.putBoolean(str, z);
        a(str);
    }

    public final void a(@Nullable String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837d989c69adc086d96320f930e1dff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837d989c69adc086d96320f930e1dff0");
        } else if (this.b.containsKey(str)) {
            if (!(this.b.get(str) instanceof Long) || j == ((Long) this.b.get(str)).longValue()) {
                return;
            }
            this.b.putLong(str, j);
            a(str);
        } else {
            this.b.putLong(str, j);
            a(str);
        }
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76a7d917d2ec39087a06b9baf505f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76a7d917d2ec39087a06b9baf505f75");
        } else if (this.b.containsKey(str)) {
            if ((this.b.get(str) instanceof String) || this.b.get(str) == null) {
                String str3 = (String) this.b.get(str);
                if ((str2 == null || str2.equals(str3)) && (str3 == null || str3.equals(str2))) {
                    return;
                }
                this.b.putString(str, str2);
                a(str);
            }
        } else {
            this.b.putString(str, str2);
            a(str);
        }
    }
}
