package com.sankuai.waimai.store.util;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class af {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2517e633e9b05f7a4c1124dd865e4c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2517e633e9b05f7a4c1124dd865e4c45");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("funnelName", a(str));
        com.sankuai.waimai.store.deeplink.a.a(activity, str, hashMap);
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "399c4f5d5157957f5066282418059ec9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "399c4f5d5157957f5066282418059ec9") : "sg.channel.ready.native".equals(str) ? "页面启动" : "sg.channel.locationstart.native".equals(str) ? "页面定位开始" : "sg.channel.locationend.native".equals(str) ? "页面定位结束" : "sg.channel.apistart.native".equals(str) ? "接口请求开始" : "sg.channel.apiend.native".equals(str) ? "瓦片接口请求完成" : "sg.channel.setdataend.native".equals(str) ? "瓦片接口数据设置完成" : "sg.channel.apiend2.native".equals(str) ? "列表接口2请求完成" : "sg.channel.setdataend2.native".equals(str) ? "列表接口数据2设置完成" : "";
    }
}
