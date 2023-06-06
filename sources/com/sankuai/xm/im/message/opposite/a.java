package com.sankuai.xm.im.message.opposite;

import android.support.annotation.CallSuper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private static volatile IMClient.i b;
    private static Set<a> c = Collections.synchronizedSet(new HashSet(3));

    public abstract void a(List<IMMessage> list, boolean z);

    @CallSuper
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9725515185d11598708623f68d426a75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9725515185d11598708623f68d426a75");
            return;
        }
        c.add(this);
        if (b != null) {
            return;
        }
        synchronized (a.class) {
            if (b != null) {
                return;
            }
            b = new IMClient.i() { // from class: com.sankuai.xm.im.message.opposite.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.i
                public final void a(List<IMMessage> list, boolean z) {
                    Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea71352beb75643c7860c7e176395e7b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea71352beb75643c7860c7e176395e7b");
                        return;
                    }
                    for (a aVar : a.c) {
                        aVar.a(list, z);
                    }
                }
            };
            IMClient.a().a((short) -1, b);
        }
    }
}
