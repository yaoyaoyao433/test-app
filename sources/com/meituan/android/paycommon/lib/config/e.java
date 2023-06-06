package com.meituan.android.paycommon.lib.config;

import android.content.Context;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class e {
    public Context a;

    public String a() {
        return "https://pay.meituan.com";
    }

    public void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
    }

    public Map<a, Integer> b() {
        return null;
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
        CASHIER__MAIN_COLOR,
        BARCODE_BG_GRADIENT_START,
        BARCODE_BG_GRADIENT_END,
        BARCODE_RETURN_ICON,
        BARCODE_CONFIG_ICON,
        BARCODE_REFRESH_ICON,
        BARCODE_ALTER_COLOR,
        BARCODE_TITLE_COLOR,
        CASHIER__TOGGLE_BUTTON_BG;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee65c5f1b05843362e252ff8cacb63c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee65c5f1b05843362e252ff8cacb63c");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "611d65710f09972016f446df927fd263", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "611d65710f09972016f446df927fd263") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0791c95517eb6712315c65553f7c8a53", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0791c95517eb6712315c65553f7c8a53") : (a[]) values().clone();
        }
    }
}
