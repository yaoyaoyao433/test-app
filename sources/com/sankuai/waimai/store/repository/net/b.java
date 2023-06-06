package com.sankuai.waimai.store.repository.net;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.exception.c;
import com.sankuai.waimai.store.config.i;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RuntimeException {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public Throwable g;
    public boolean h;
    private int i;

    public b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc649973e9dde85a679922d431e07c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc649973e9dde85a679922d431e07c61");
            return;
        }
        this.i = 0;
        if (th instanceof IOException) {
            this.i = 1;
            if ((th.getCause() instanceof com.sankuai.waimai.platform.modular.network.error.a) && i.h().a("store_search_fsp/use_error_code", true)) {
                this.c = ((com.sankuai.waimai.platform.modular.network.error.a) th.getCause()).b();
            }
        } else if (th instanceof com.sankuai.meituan.retrofit2.exception.b) {
            this.i = 2;
        } else {
            this.i = 0;
        }
        if (th instanceof c) {
            this.d = ((c) th).a();
        }
        this.g = th;
    }

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e07a385801c2879be058b4c1c2c65b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e07a385801c2879be058b4c1c2c65b");
            return;
        }
        this.i = 0;
        this.b = str;
    }

    public b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16e79dc57ae604b097bb1c975358992", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16e79dc57ae604b097bb1c975358992");
            return;
        }
        this.i = 0;
        this.c = i;
        this.b = str;
    }

    public b(int i, String str, Object obj, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf5171c1bedafe8d9cae508d4a204c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf5171c1bedafe8d9cae508d4a204c2");
            return;
        }
        this.i = 0;
        this.c = i;
        this.b = str;
        this.e = obj;
        this.f = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    public final boolean a() {
        return this.i == 1;
    }

    public final boolean b() {
        return this.i == 2;
    }

    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1610e3456d17638257da3953fe3b225a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1610e3456d17638257da3953fe3b225a");
        }
        String str = this.b;
        if (context != null) {
            if (a()) {
                return context.getString(R.string.wm_sc_common_net_error_0);
            }
            if (this.d == 403 || this.d == 502 || this.d == 702 || this.d == 417 || this.c == 1 || this.c == -1 || this.c == 804 || this.c == 9999) {
                return context.getString(R.string.wm_sc_common_net_error_info_2);
            }
            if (this.d == 504 || this.c == 1000013 || this.c == 806 || this.c == 801 || this.c == 803) {
                return context.getString(R.string.wm_sc_common_net_error_info_3);
            }
            if (this.c == 1000012) {
                return context.getString(R.string.wm_sc_common_net_error_info_4);
            }
            if (this.c == 1000011) {
                return context.getString(R.string.wm_sc_common_net_error_info_5);
            }
            if (this.c == 1000014) {
                return context.getString(R.string.wm_sc_common_net_error_info_6);
            }
            if (this.c == 410 || this.c == 411) {
                return context.getString(R.string.wm_sc_common_net_error_info_7);
            }
            return this.c == -10000 ? "定位失败，请手动输入地址" : str;
        }
        return str;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e2d8d22a7e642b7fd02f8a6080c616", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e2d8d22a7e642b7fd02f8a6080c616")).intValue() : a() ? R.drawable.wm_sc_home_def_empty_net : this.c == 1000012 ? R.drawable.wm_sc_home_def_empty_4 : R.drawable.wm_sc_home_filter_empty;
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33983a7ee5316186cb47b249a5d6aa92", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33983a7ee5316186cb47b249a5d6aa92")).booleanValue() : this.d == 504 || this.c == 1000013 || a() || this.c == 806 || this.c == 801 || this.c == 803 || this.c == 1000014 || this.c == 410 || this.c == 411 || this.c == -10000 || this.c == 1 || this.c == -1 || e();
    }

    public final boolean e() {
        return this.d != 0 && this.c == 0;
    }
}
