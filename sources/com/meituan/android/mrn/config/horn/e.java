package com.meituan.android.mrn.config.horn;

import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static e b = new e();

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e08f07cb078573358e139e1f6d2be7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e08f07cb078573358e139e1f6d2be7a");
            return;
        }
        a("enableBundleSequence", Boolean.TYPE, Boolean.TRUE, "是否支持排序");
        a("enableLimit", Boolean.TYPE, Boolean.FALSE, "是否支持个数限制");
        a("downloadLimit", Integer.TYPE, 25, "下载个数限制，默认25");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9bf3f47352ae8b37b5737013b543e9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9bf3f47352ae8b37b5737013b543e9c");
        } else {
            t.a(str, type, obj, "mrn_bundle_download_config_android", str2);
        }
    }
}
