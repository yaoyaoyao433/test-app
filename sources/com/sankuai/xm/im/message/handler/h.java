package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends a {
    public static ChangeQuickRedirect a;

    public h(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0444de03464e46ba2883b7343902a0f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0444de03464e46ba2883b7343902a0f6");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ebf6bc9331ad618baf60b9ada66247", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ebf6bc9331ad618baf60b9ada66247")).intValue();
        }
        if (iMMessage instanceof EmotionMessage) {
            EmotionMessage emotionMessage = (EmotionMessage) iMMessage;
            int a2 = super.a(emotionMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(emotionMessage.getGroup()) || com.sankuai.xm.base.proto.protobase.e.d(emotionMessage.getType()) || com.sankuai.xm.base.proto.protobase.e.d(emotionMessage.getName())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
