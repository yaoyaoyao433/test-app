package com.meituan.passport;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected Map<String, WeakReference<InterfaceC0502a>> b;
    private String c;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0502a {
        boolean a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb99efc3f8d9e1d6b1a6ad561a29eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb99efc3f8d9e1d6b1a6ad561a29eda");
        } else {
            this.b = new HashMap();
        }
    }

    public final boolean a() {
        WeakReference<InterfaceC0502a> weakReference;
        InterfaceC0502a interfaceC0502a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffc44d0628dca30d5e5ff6d0816d6891", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffc44d0628dca30d5e5ff6d0816d6891")).booleanValue();
        }
        if (TextUtils.isEmpty(this.c) || !this.b.containsKey(this.c) || (weakReference = this.b.get(this.c)) == null || (interfaceC0502a = weakReference.get()) == null) {
            return false;
        }
        return interfaceC0502a.a();
    }
}
