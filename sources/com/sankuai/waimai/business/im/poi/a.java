package com.sankuai.waimai.business.im.poi;

import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.IWmChannelInitService;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(IWmChannelInitService iWmChannelInitService, String str) {
        Object[] objArr = {iWmChannelInitService, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f48537ebb9a1ff4f18654bab4585ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f48537ebb9a1ff4f18654bab4585ba3");
            return;
        }
        if (iWmChannelInitService == null) {
            try {
                Sniffer.smell(DefaultHeaderService.KEY_STORE, "store_im", "sg_im_channel_service_init", "找不到本地模板 iWmImInitService为null", "bizType = " + str);
            } catch (Throwable unused) {
                return;
            }
        }
        if (str == null || TextUtils.equals(str, "1") || TextUtils.equals(str, "2")) {
            return;
        }
        Sniffer.smell(DefaultHeaderService.KEY_STORE, "store_im", "sg_im_channel_service_init", "模板加载错误", "bizType = " + str);
    }
}
