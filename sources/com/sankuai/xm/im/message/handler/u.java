package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u implements m {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec283b056578fb32466e163ce65f0c58", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec283b056578fb32466e163ce65f0c58")).intValue();
        }
        if (iMMessage instanceof UNKnownMessage) {
            return com.sankuai.xm.base.proto.protobase.e.d(((UNKnownMessage) iMMessage).getStringData()) ? 10024 : 0;
        }
        return 10100;
    }
}
