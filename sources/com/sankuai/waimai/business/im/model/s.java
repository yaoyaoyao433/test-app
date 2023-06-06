package com.sankuai.waimai.business.im.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s {
    public static ChangeQuickRedirect a;
    public IMMessage b;
    public WMCommonDataInfo.IMDynamicCard c;
    public q d;

    public s(IMMessage iMMessage, WMCommonDataInfo.IMDynamicCard iMDynamicCard) {
        Object[] objArr = {iMMessage, iMDynamicCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951b840ca14a3ce92f00712ce61c7aeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951b840ca14a3ce92f00712ce61c7aeb");
            return;
        }
        this.b = iMMessage;
        this.c = iMDynamicCard;
    }
}
