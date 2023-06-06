package com.sankuai.waimai.platform.popup;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static WMBasePopup a(@NonNull Activity activity, List<String> list) {
        Object[] objArr = {activity, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c53f0f63449c0f432008a50e344bc50d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMBasePopup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c53f0f63449c0f432008a50e344bc50d");
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return null;
        }
        WMBasePopup wMBasePopup = new WMBasePopup();
        for (int size = list.size() - 1; size >= 0; size--) {
            String str = list.get(size);
            WMBasePopup wMBasePopup2 = (WMBasePopup) com.sankuai.waimai.router.a.a(WMBasePopup.class, str);
            if (wMBasePopup2 != null) {
                wMBasePopup2.setContext(new WMBasePopup.a(activity, str));
                wMBasePopup2.setNext(wMBasePopup.getNext());
                wMBasePopup.setNext(wMBasePopup2);
                com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "build: " + wMBasePopup2, new Object[0]);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.e("WMPopup", "please check annotation!", new Object[0]);
            }
        }
        return wMBasePopup;
    }
}
