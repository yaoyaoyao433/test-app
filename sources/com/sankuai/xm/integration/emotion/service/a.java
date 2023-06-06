package com.sankuai.xm.integration.emotion.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.service.a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.im.message.c
    public final boolean a(IMMessage iMMessage) {
        return iMMessage instanceof CustomEmotionMessage;
    }

    @Override // com.sankuai.xm.im.message.c
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ce590369ddd7cd18895b3cbd3abf51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ce590369ddd7cd18895b3cbd3abf51");
        } else if (iMMessage instanceof CustomEmotionMessage) {
            CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) iMMessage;
            com.sankuai.xm.ui.service.b bVar = (com.sankuai.xm.ui.service.b) m.a(com.sankuai.xm.ui.service.b.class);
            if (bVar == null) {
                return;
            }
            String a2 = bVar.a(customEmotionMessage.getPackageId(), customEmotionMessage.getId(), 4);
            if (k.f(a2)) {
                return;
            }
            bVar.a(customEmotionMessage.getPackageId(), customEmotionMessage.getId(), 4, a2, null);
        }
    }
}
