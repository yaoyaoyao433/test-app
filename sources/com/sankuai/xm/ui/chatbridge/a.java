package com.sankuai.xm.ui.chatbridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.MessageUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7fb1cad9237ac4a5766e29bafd4228d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7fb1cad9237ac4a5766e29bafd4228d")).intValue() : MessageUtils.pushChatTypeToCategory(str);
    }
}
