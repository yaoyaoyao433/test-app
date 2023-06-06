package com.meituan.android.paybase.config;

import android.content.Context;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b {
    public abstract Context a();

    public void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
    }

    public String b() {
        return "https://pay.meituan.com";
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract MtLocation f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract int m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract com.meituan.android.paybase.imageloader.a r();

    public abstract com.meituan.android.paybase.login.a s();

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public String v() {
        return "";
    }

    public Map<a, Integer> w() {
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        THEME,
        WALLET__AVATAR_LOADING,
        CASHIER__CBOX_CREDIT,
        CASHIER__CBOX_PAYTYPE,
        CASHIER__SUBBTN_BG,
        CASHIER__SUBBTN_TEXT_COLOR,
        WALLET__HEAD_CONTAINER_BG,
        CASHIER__MAIN_COLOR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df664007527f7edcfbd443ac441e5e47", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df664007527f7edcfbd443ac441e5e47");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8817416a12c03500646141bd4f48a872", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8817416a12c03500646141bd4f48a872") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5169b3df0c470b1ce04c5dfc5cadf44c", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5169b3df0c470b1ce04c5dfc5cadf44c") : (a[]) values().clone();
        }
    }
}
