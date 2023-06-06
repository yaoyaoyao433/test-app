package com.sankuai.waimai.foundation.location.utils;

import android.content.Context;
import android.provider.Settings;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b12e45dcf3a7a3020c652d7bd5905277", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b12e45dcf3a7a3020c652d7bd5905277");
        }
        try {
            if (context != null) {
                return Settings.Secure.getInt(context.getContentResolver(), LoadConfig.LOCATION_MODE, 0) != 0 ? a.OPEN : a.CLOSE;
            }
            return a.OPEN;
        } catch (Exception unused) {
            return a.ERROR;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        OPEN,
        CLOSE,
        ERROR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d037fd5215dcbc503ea57745b562a3c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d037fd5215dcbc503ea57745b562a3c");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04cebbb56524ad12d33e3504a9544ae1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04cebbb56524ad12d33e3504a9544ae1") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5241a30d47d4f81900dfa48b53537c98", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5241a30d47d4f81900dfa48b53537c98") : (a[]) values().clone();
        }
    }
}
