package com.sankuai.waimai.store.im.poi.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public IMMessage b;
    public SGCommonDataInfo.IMDynamicCard c;
    public a d;

    public c(IMMessage iMMessage, SGCommonDataInfo.IMDynamicCard iMDynamicCard) {
        Object[] objArr = {iMMessage, iMDynamicCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6a215f887e1f2c27eb7b86a46e0e7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6a215f887e1f2c27eb7b86a46e0e7d");
            return;
        }
        this.b = iMMessage;
        this.c = iMDynamicCard;
    }
}
