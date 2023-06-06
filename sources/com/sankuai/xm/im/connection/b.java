package com.sankuai.xm.im.connection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum b {
    NONE_NET,
    AUTH_FAILURE,
    CONNECTED,
    CONNECTING,
    DISCONNECTED,
    KICKOFF,
    LOGOFF;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200348bd13f484a4f73b23a4b3d073dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200348bd13f484a4f73b23a4b3d073dc");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de46b21116859ee8ea7c443c118cb9a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de46b21116859ee8ea7c443c118cb9a") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11a096587e0a8ecdb6bb785131726051", 6917529027641081856L) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11a096587e0a8ecdb6bb785131726051") : (b[]) values().clone();
    }
}
