package com.sankuai.waimai.business.page.home.log;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(boolean z, BaseResponse baseResponse, BaseResponse baseResponse2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), baseResponse, baseResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "893d0afca3f434c4905acf40f66cfafb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "893d0afca3f434c4905acf40f66cfafb");
        }
        return com.sankuai.waimai.monitor.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), (baseResponse2 == null || !z) ? baseResponse != null ? baseResponse.code : -1 : baseResponse2.code).b("10324").a();
    }

    public static String a(Throwable th, Throwable th2, boolean z) {
        Object[] objArr = {th, th2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50a10392d4e6d9e4ec704a0eed1e47d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50a10392d4e6d9e4ec704a0eed1e47d5");
        }
        Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        if (th2 != null) {
            th = th2;
        }
        return com.sankuai.waimai.monitor.a.a(b, th).b("10324").a();
    }
}
