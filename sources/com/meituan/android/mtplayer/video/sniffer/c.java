package com.meituan.android.mtplayer.video.sniffer;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e90c695c36a477ca095f89d23d9185fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e90c695c36a477ca095f89d23d9185fb");
        } else {
            Sniffer.smell("mt_mtplayer_video_sdk", str, str2, str3, "");
        }
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31f8dc7f2813231213b55d295f8d2d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31f8dc7f2813231213b55d295f8d2d63");
        } else {
            Babel.log("mtplayer", "mtplayer babel log", map);
        }
    }
}
