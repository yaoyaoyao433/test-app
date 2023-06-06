package com.sankuai.meituan.bundle.service.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private static Context b;
    private static int c;
    private static AtomicBoolean d = new AtomicBoolean(false);

    public b() {
        super(b, c);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e5d6e7ce722a97fa7bf469cae7eb19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e5d6e7ce722a97fa7bf469cae7eb19");
        }
    }

    public static synchronized void a(Context context, int i) {
        synchronized (b.class) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e80772634a42d39af8b68f9a1510cda4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e80772634a42d39af8b68f9a1510cda4");
            } else if (d.getAndSet(true)) {
            } else {
                b = context.getApplicationContext();
                c = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d06f94427d3ce8729ba2d7a14aa63598", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d06f94427d3ce8729ba2d7a14aa63598") : a.a;
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703adb85d13c51549b2989e21ec9b3e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703adb85d13c51549b2989e21ec9b3e3") : GetUUID.getInstance().getUUID(b);
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c56479bd03beac5b4cbd110252d7f406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c56479bd03beac5b4cbd110252d7f406");
        } else {
            a(str, i, 0, 0);
        }
    }

    public final void a(String str, int i, int i2, int i3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549042590aa6eb741db2dc5de30273b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549042590aa6eb741db2dc5de30273b8");
        } else {
            pv4(0L, str, 0, 8, i, 0, i2, i3, "", "");
        }
    }
}
