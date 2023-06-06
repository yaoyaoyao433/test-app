package com.meituan.msc.common.config;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCMultiProcessConfig extends a<Config> {
    public static ChangeQuickRedirect c;
    private static volatile MSCMultiProcessConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean disableMultiProcess = false;
        public String[] appIdWhiteList = new String[0];
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2144f0111b189fd3c63d9ab8500251b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2144f0111b189fd3c63d9ab8500251b")).booleanValue();
        }
        if (c().disableMultiProcess || c().appIdWhiteList == null) {
            return false;
        }
        for (String str2 : c().appIdWhiteList) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static MSCMultiProcessConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9b94a58aaed5cdc8b862f370b975949", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCMultiProcessConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9b94a58aaed5cdc8b862f370b975949");
        }
        if (d == null) {
            synchronized (MSCMultiProcessConfig.class) {
                if (d == null) {
                    d = new MSCMultiProcessConfig();
                }
            }
        }
        return d;
    }

    public MSCMultiProcessConfig() {
        super("msc_multi_process_config", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda8fa9ec8330e479aeb4485e38d0e08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda8fa9ec8330e479aeb4485e38d0e08");
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [Config, java.lang.Object] */
    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9180652735f3a77dd6b296bdd7cc30e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9180652735f3a77dd6b296bdd7cc30e");
            return;
        }
        super.b(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = a(str);
    }
}
