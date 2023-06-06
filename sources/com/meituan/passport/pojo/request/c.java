package com.meituan.passport.pojo.request;

import android.os.Build;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.PassportConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends b {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.passport.pojo.request.b
    public void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cabe87900156d12be04bc1bb4dacea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cabe87900156d12be04bc1bb4dacea");
            return;
        }
        a(map, "unionid", OneIdHandler.getInstance(com.meituan.android.singleton.b.a()).getLocalOneId());
        a(map, "device_name", Build.MANUFACTURER + StringUtil.SPACE + Build.MODEL);
        a(map, "device_type", Build.MODEL);
        a(map, "device_os", "Android");
        a(map, "notify_unionid", com.dianping.nvnetwork.g.j());
        StringBuilder sb = new StringBuilder();
        sb.append(com.dianping.nvnetwork.g.a());
        a(map, "notify_appid", sb.toString());
        a(map, "sdkType", "android");
        a(map, "token_id", PassportConfig.h());
        a(map, "sim_mask_mobile", StorageUtil.getSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.SIMMaskMobile"));
    }
}
