package com.meituan.android.mrn.config.horn;

import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static i b = new i();

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4cee81193ec041b70a9f564f4e5b0b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4cee81193ec041b70a9f564f4e5b0b3");
            return;
        }
        a("enableLog", Boolean.TYPE, Boolean.FALSE, "美团预下载打印log");
        a("enableMtPreload", Boolean.TYPE, Boolean.FALSE, "允许使用美团预下载");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a62f960b22e600039dcfaa9f6acd23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a62f960b22e600039dcfaa9f6acd23");
        } else {
            t.a(str, type, obj, "mrn_bundle_mt_pre_download_config_android", str2);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451b8ca9268ca1303dca2032fc46b43e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451b8ca9268ca1303dca2032fc46b43e")).booleanValue() : ((Boolean) t.b.a("enableMtPreload")).booleanValue();
    }
}
