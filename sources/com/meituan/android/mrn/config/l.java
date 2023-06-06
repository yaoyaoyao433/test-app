package com.meituan.android.mrn.config;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public static l b = new l();

    public static l a() {
        return b;
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624b6d33ca93888d3a33f1c742d1c6bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624b6d33ca93888d3a33f1c742d1c6bd");
            return;
        }
        a("controlList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.l.1
        }.getType(), Arrays.asList("RNCCameraRoll-saveToCameraRoll", "RNCCameraRoll-getPhotos", "RNCCameraRoll-deletePhotos", "RNCCameraRoll-getAlbums"), "业务隐私权限桥白名单及 bundle 白名单");
        a("controlEnabled", Boolean.TYPE, Boolean.FALSE, "是否开启隐私桥管控");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d880fc2e75bdb54eb595dad3122766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d880fc2e75bdb54eb595dad3122766");
        } else {
            t.a(str, type, obj, "mrn_bridge_control_config_android", str2);
        }
    }
}
