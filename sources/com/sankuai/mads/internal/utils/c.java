package com.sankuai.mads.internal.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/sankuai/mads/internal/utils/NetworkUtil;", "", "()V", "NETWORKTYPE_2G", "", "NETWORKTYPE_3G", "NETWORKTYPE_4G", "NETWORKTYPE_5G", "NETWORKTYPE_INVALID", "NETWORKTYPE_UNAVAILABLE", "NETWORKTYPE_WIFI", "NETWORK_MOBILE_TYPE_NAME", "NETWORK_TYPE_LTE_CA", "", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "context", "Landroid/content/Context;", "getMobileNetworkType", "getNetWorkType", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final c b = new c();

    @JvmStatic
    @NotNull
    public static final String a(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91d014c416e57da5cad19080f92204bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91d014c416e57da5cad19080f92204bc");
        }
        h.b(context, "context");
        String str = "invalid";
        NetworkInfo b2 = b(context);
        if (b2 == null || !b2.isConnected()) {
            return "Unavailable";
        }
        String typeName = b2.getTypeName();
        if (g.a(typeName, "WiFi", true)) {
            return "WiFi";
        }
        if (g.a(typeName, "mobile", true)) {
            str = c(context);
            if (h.a((Object) str, (Object) "invalid")) {
                str = b2.getSubtypeName();
                h.a((Object) str, "networkInfo.subtypeName");
                if (g.a(MTCellInfo.TYPE_TDSCDMA, str, true) || g.a(MTCellInfo.TYPE_WCDMA, str, true) || g.a("CDMA2000", str, true)) {
                    str = "3G";
                }
            }
        }
        return str;
    }

    @JvmStatic
    private static final NetworkInfo b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "563957b5f8c9a4f4f378a59bbf3687e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "563957b5f8c9a4f4f378a59bbf3687e1");
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new o("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    private static final String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c611ce8ebaa24fd3f70790ff0e58fa83", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c611ce8ebaa24fd3f70790ff0e58fa83");
        }
        try {
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(context, "dj-cfdc7b9dfb4da1d3");
            Integer valueOf = createTelephonyManager != null ? Integer.valueOf(createTelephonyManager.getNetworkType()) : null;
            if (valueOf != null && valueOf.intValue() == 16) {
                return "2G";
            }
            if (valueOf.intValue() == 1) {
                return "2G";
            }
            if (valueOf != null && valueOf.intValue() == 2) {
                return "2G";
            }
            if (valueOf.intValue() == 4) {
                return "2G";
            }
            if (valueOf != null && valueOf.intValue() == 7) {
                return "2G";
            }
            if (valueOf.intValue() == 11) {
                return "2G";
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                return "3G";
            }
            if (valueOf.intValue() == 5) {
                return "3G";
            }
            if (valueOf != null && valueOf.intValue() == 6) {
                return "3G";
            }
            if (valueOf.intValue() == 8) {
                return "3G";
            }
            if (valueOf != null && valueOf.intValue() == 10) {
                return "3G";
            }
            if (valueOf.intValue() == 9) {
                return "3G";
            }
            if (valueOf != null && valueOf.intValue() == 14) {
                return "3G";
            }
            if (valueOf.intValue() == 12) {
                return "3G";
            }
            if (valueOf != null && valueOf.intValue() == 15) {
                return "3G";
            }
            if (valueOf.intValue() == 17) {
                return "3G";
            }
            if (valueOf != null && valueOf.intValue() == 13) {
                return "4G";
            }
            if (valueOf.intValue() == 18) {
                return "4G";
            }
            if (valueOf != null && valueOf.intValue() == 19) {
                return "4G";
            }
            if (valueOf.intValue() == 20) {
                return "5G";
            }
            if (valueOf == null) {
                return "invalid";
            }
            valueOf.intValue();
            return "invalid";
        } catch (Exception unused) {
            return "invalid";
        }
    }
}
