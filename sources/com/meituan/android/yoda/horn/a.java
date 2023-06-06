package com.meituan.android.yoda.horn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;
    @Nullable
    private YodaHornConfig c;
    private List<String> d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c05cccfa3dbf9fe79efe8288c0a165f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c05cccfa3dbf9fe79efe8288c0a165f6");
            return;
        }
        this.c = null;
        Horn.register("yoda_horn_config_android", new HornCallback() { // from class: com.meituan.android.yoda.horn.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c6707281966db5c2cdffbcc630305cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c6707281966db5c2cdffbcc630305cd");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "onChanged, result = " + str, true);
                a.this.a(null, str);
            }
        });
    }

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e06a9fc56cbd4d8aa6556fc7349ea9cf", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e06a9fc56cbd4d8aa6556fc7349ea9cf");
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    synchronized void a(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f34b61bdbc6cb11d6c01cc6ce7028a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f34b61bdbc6cb11d6c01cc6ce7028a");
            return;
        }
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "updateHornConfig, yoda horn config is empty.", true);
            return;
        }
        try {
            this.c = (YodaHornConfig) new Gson().fromJson(str, new TypeToken<YodaHornConfig>() { // from class: com.meituan.android.yoda.horn.a.2
            }.getType());
            this.d = a(this.c);
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "updateHornConfig, updated. interceptIgnoreVersion = " + this.c.yoda_mtsi_intercept_ignore, true);
        } catch (Exception e) {
            this.c = null;
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "updateHornConfig, parse exception = " + e.getMessage(), true);
        }
    }

    public final synchronized boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420db605348806aae6775ad483b3b389", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420db605348806aae6775ad483b3b389")).booleanValue();
        }
        if (this.d != null && this.d.size() > 0) {
            String i = x.i();
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "isInterceptReady, yodaSDKVersion = " + i, true);
            if (this.d.contains(i)) {
                return false;
            }
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "isInterceptReady, ignoreVersions = null", true);
        }
        return true;
    }

    private synchronized List<String> a(YodaHornConfig yodaHornConfig) {
        Object[] objArr = {yodaHornConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb067b5b2a67cc0e35289a718eafe51d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb067b5b2a67cc0e35289a718eafe51d");
        }
        if (yodaHornConfig != null && !TextUtils.isEmpty(yodaHornConfig.yoda_mtsi_intercept_ignore)) {
            String[] split = yodaHornConfig.yoda_mtsi_intercept_ignore.split(CommonConstant.Symbol.COMMA);
            if (split != null && split.length > 0) {
                List<String> asList = Arrays.asList(split);
                com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "getInterceptIgnoreVersions, ignore versions = " + asList.toString(), true);
                return asList;
            }
            com.meituan.android.yoda.monitor.log.a.a("YodaHornConfigManager", "getInterceptIgnoreVersions, yoda_mtsi_intercept_ignore = " + yodaHornConfig.yoda_mtsi_intercept_ignore, true);
        }
        return null;
    }
}
