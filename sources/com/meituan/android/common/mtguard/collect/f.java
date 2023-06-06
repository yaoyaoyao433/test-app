package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.DpidCallback;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public class f implements c, DpidCallback {
    private static final int a = 136;
    private static f b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context c;
    private String d;
    private boolean e;

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8e0fbd58a26a869db76266bfd6885e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8e0fbd58a26a869db76266bfd6885e5");
            return;
        }
        this.d = "";
        this.e = false;
        this.c = context;
        b();
    }

    public static f a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b2f837a1966ee8196e83c9ad92e9a08", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b2f837a1966ee8196e83c9ad92e9a08");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f(context);
                }
            }
        }
        return b;
    }

    private void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f43a5d58347fe363406e550b3bbb8bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f43a5d58347fe363406e550b3bbb8bb");
            return;
        }
        try {
            if (this.e) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{136});
            if (main3 != null) {
                z = ((Boolean) main3[0]).booleanValue();
            }
            if (z) {
                return;
            }
            OneIdHandler.getInstance(this.c).registerChangeListener(this);
            this.e = true;
        } catch (Throwable unused) {
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b253bc989aa9d5c3ae07c1ce392b413a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b253bc989aa9d5c3ae07c1ce392b413a");
            return;
        }
        try {
            if (this.e) {
                OneIdHandler.getInstance(this.c).unRegisterChangeListener(this);
                this.e = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final String a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cde4c7e97361c5f0bb7c8b483804c91", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cde4c7e97361c5f0bb7c8b483804c91");
        }
        try {
            Object[] main3 = NBridge.main3(53, new Object[]{136});
            if (main3 != null) {
                z = ((Boolean) main3[0]).booleanValue();
            }
        } catch (Throwable unused) {
        }
        if (z) {
            return "";
        }
        if (TextUtils.isEmpty(this.d)) {
            OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.c);
            oneIdHandler.init();
            this.d = oneIdHandler.getOneIdByDpid(p.a(this.c).a(), AppUtil.getAndroidId(this.c), AppUtil.getSerial(this.c), AppUtil.getWifiMac(this.c));
        }
        return this.d;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a637c8c16cf1e67fae5f2e3294d9042f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a637c8c16cf1e67fae5f2e3294d9042f");
            return;
        }
        try {
            a();
            eVar.a(136, this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f559b06f5f1dfdc64ea79fd97664238", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f559b06f5f1dfdc64ea79fd97664238");
        } else if (!z) {
            b();
        } else {
            try {
                if (this.e) {
                    OneIdHandler.getInstance(this.c).unRegisterChangeListener(this);
                    this.e = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.android.common.unionid.oneid.cache.DpidCallback
    public void call(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b4aaa74399ad2fb82ac3c540ddb29b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b4aaa74399ad2fb82ac3c540ddb29b");
        } else if (TextUtils.isEmpty(str) || str.equals(this.d)) {
        } else {
            this.d = str;
            MTGuardLog.setLogan("dpid changed");
            NBridge.main3(50, new Object[]{136});
        }
    }
}
