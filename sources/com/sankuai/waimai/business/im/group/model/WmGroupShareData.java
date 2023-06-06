package com.sankuai.waimai.business.im.group.model;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.modular.eventbus.sharedata.SharedData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupShareData extends SharedData {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public long d;
    public c e;
    public d f;

    public static WmGroupShareData a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d295148b82c1717b69088e71845212", RobustBitConfig.DEFAULT_VALUE) ? (WmGroupShareData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d295148b82c1717b69088e71845212") : (WmGroupShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(context, WmGroupShareData.class);
    }
}
