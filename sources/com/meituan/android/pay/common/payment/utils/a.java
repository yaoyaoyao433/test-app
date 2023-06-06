package com.meituan.android.pay.common.payment.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static EnumC0321a b = null;
    private static String c = "";
    private static String d = "";
    private static String[] e = new String[2];

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.common.payment.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0321a {
        TRADE_ID,
        TRANS_ID,
        UN_KNOWN;
        
        public static ChangeQuickRedirect a;

        EnumC0321a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b22f7448c4edb296d1783f0a1779ddc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b22f7448c4edb296d1783f0a1779ddc");
            }
        }

        public static EnumC0321a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1280d0b7b3f0e254dc6f540d75d8a15", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0321a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1280d0b7b3f0e254dc6f540d75d8a15") : (EnumC0321a) Enum.valueOf(EnumC0321a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0321a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a8f6c17daeae027f0a1e63d736a3a6b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0321a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a8f6c17daeae027f0a1e63d736a3a6b") : (EnumC0321a[]) values().clone();
        }
    }

    public static void a(EnumC0321a enumC0321a, String str) {
        Object[] objArr = {enumC0321a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af1d94fd49562e3c3bb2826cd74df14a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af1d94fd49562e3c3bb2826cd74df14a");
            return;
        }
        b = enumC0321a;
        if (enumC0321a == EnumC0321a.TRADE_ID) {
            c = str;
        } else if (enumC0321a == EnumC0321a.TRANS_ID) {
            d = str;
        }
    }

    public static void a() {
        b = EnumC0321a.UN_KNOWN;
        c = "";
        d = "";
    }

    public static String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc21a53b0809c5ec2a5e5226b10b34f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc21a53b0809c5ec2a5e5226b10b34f9");
        }
        if (b == EnumC0321a.TRADE_ID && !TextUtils.isEmpty(c)) {
            e[0] = "tradeno";
            e[1] = c;
            return (String[]) Arrays.copyOf(e, 2);
        } else if (b != EnumC0321a.TRANS_ID || TextUtils.isEmpty(d)) {
            return null;
        } else {
            e[0] = "transid";
            e[1] = d;
            return (String[]) Arrays.copyOf(e, 2);
        }
    }

    public static boolean a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b42c3fad9712ca65a7d726c07c31a8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b42c3fad9712ca65a7d726c07c31a8b")).booleanValue() : (strArr == null || strArr.length != 2 || TextUtils.isEmpty(strArr[0]) || TextUtils.isEmpty(strArr[1])) ? false : true;
    }
}
