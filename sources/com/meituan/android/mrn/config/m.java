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
public final class m {
    public static ChangeQuickRedirect a;
    public static m b = new m();

    public static m a() {
        return b;
    }

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e05e0e3a4b8a0cc55314862e0e96ff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e05e0e3a4b8a0cc55314862e0e96ff8");
            return;
        }
        a("RNCCameraRoll-getPhotos", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.m.1
        }.getType(), Arrays.asList("rn_test_mrnproject3", "rn_group_liuyx-mrn-test"), "业务隐私权限getPhotos桥白名单及 bundle 白名单");
        a("RNCCameraRoll-saveToCameraRoll", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.m.2
        }.getType(), Arrays.asList("rn_test_mrnproject3", "rn_group_liuyx-mrn-test", "rn_overseahotel_overseahotel-poi-albumgrid", "rn_travel_travelticket", "rn_movie_moviechannel-photoalbumbigpic", "rn_movie_moviechannel-avatardetail", "rn_hotel_hotelchannel-album"), "业务隐私权限saveToCameraRoll桥白名单及 bundle 白名单");
        a("RNCCameraRoll-deletePhotos", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.m.3
        }.getType(), Arrays.asList("rn_movie_moviechannel-commentshare", "rn_movie_moviechannel-starshare", "rn_movie_may-answer-share", "rn_movie_moviechannel-showoffshareview", "rn_movie_may-movie-celebrity", "rn_zhenguo_mrn-zhenguo-im", "rn_zhenguo_mrn-zhenguo-chatlist"), "业务隐私权限deletePhotos桥白名单及 bundle 白名单");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f85ba74077ce59b4b519d898fd88c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f85ba74077ce59b4b519d898fd88c97");
        } else {
            t.a(str, type, obj, "mrn_bridge_control_config_map_android", str2);
        }
    }
}
