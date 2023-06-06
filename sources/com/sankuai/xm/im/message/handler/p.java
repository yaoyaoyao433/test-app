package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p extends a {
    public static ChangeQuickRedirect a;

    public p(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6df248a6ace20e6d7ae04f80c2f046", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6df248a6ace20e6d7ae04f80c2f046");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626d28073a3627dc0b538922736eced2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626d28073a3627dc0b538922736eced2")).intValue();
        }
        if (iMMessage instanceof MultiLinkMessage) {
            MultiLinkMessage multiLinkMessage = (MultiLinkMessage) iMMessage;
            int a2 = super.a(multiLinkMessage);
            if (a2 == 0 && com.sankuai.xm.base.proto.protobase.e.d(multiLinkMessage.getContent())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
