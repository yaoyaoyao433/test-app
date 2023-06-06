package com.sankuai.xm.im.transfer.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.MediaMessage;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a d;
    public final Object b;
    public HashMap<Short, IMClient.c> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532b4a5305b44f94cd7278344afcadae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532b4a5305b44f94cd7278344afcadae");
            return;
        }
        this.b = new Object();
        this.c = new HashMap<>();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "541f1996158a8207eec9a35cf752d580", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "541f1996158a8207eec9a35cf752d580");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public final IMClient.c a(MediaMessage mediaMessage) {
        IMClient.c cVar;
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9b1e267c8eeb0d9c28112355098979", 6917529027641081856L)) {
            return (IMClient.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9b1e267c8eeb0d9c28112355098979");
        }
        synchronized (this.b) {
            cVar = this.c.containsKey(Short.valueOf(mediaMessage.getChannel())) ? this.c.get(Short.valueOf(mediaMessage.getChannel())) : null;
            if (cVar == null) {
                cVar = this.c.get((short) -1);
            }
        }
        return cVar;
    }
}
