package com.sankuai.xm.im.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.Message;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;
    public IMClient.m c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        Message a(Message message);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1066ea92c3291fbf504c7bfafb3b9e58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1066ea92c3291fbf504c7bfafb3b9e58");
            return;
        }
        this.b = null;
        this.c = null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1383a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15826eb7557ddc500c997acde4743368", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15826eb7557ddc500c997acde4743368") : C1383a.a;
    }
}
