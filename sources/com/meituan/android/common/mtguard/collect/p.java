package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDChangedListener;
import com.meituan.uuid.UUIDListener;
/* loaded from: classes2.dex */
public class p implements c, UUIDChangedListener, UUIDListener {
    private static final int a = 153;
    private static p b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context c;
    private String d;
    private boolean e;

    public p(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec3ab8cd4cd0956030f8eb84edbd125", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec3ab8cd4cd0956030f8eb84edbd125");
            return;
        }
        this.d = "";
        this.e = false;
        this.c = context;
        b();
    }

    public static p a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c95098c4897d8a26cce280ce15ad2823", 6917529027641081856L)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c95098c4897d8a26cce280ce15ad2823");
        }
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new p(context);
                }
            }
        }
        return b;
    }

    private void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efaddb83d3bfa9fc284dfb4c083dbcea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efaddb83d3bfa9fc284dfb4c083dbcea");
            return;
        }
        try {
            if (this.e) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{153});
            if (main3 != null) {
                z = ((Boolean) main3[0]).booleanValue();
            }
            if (z) {
                return;
            }
            GetUUID.getInstance().registerUUIDListener(this);
            this.d = GetUUID.getInstance().loadUUIDFromSelfCache(this.c, this);
            this.e = true;
        } catch (Throwable unused) {
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e68888c6f8c9edc8c069f0ac60334bdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e68888c6f8c9edc8c069f0ac60334bdd");
            return;
        }
        try {
            if (this.e) {
                GetUUID.getInstance().unregisterUUIDListener(this);
                GetUUID.getInstance().unRegisterUUIDChagnedListener(this);
                this.e = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final String a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42fd9a6af0a7b381a7c1bbe2e1fa57c2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42fd9a6af0a7b381a7c1bbe2e1fa57c2");
        }
        try {
            Object[] main3 = NBridge.main3(53, new Object[]{153});
            if (main3 != null) {
                z = ((Boolean) main3[0]).booleanValue();
            }
            if (z) {
                return "";
            }
        } catch (Throwable unused) {
        }
        return this.d;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79a8771da0bc14675445ebf93051a8dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79a8771da0bc14675445ebf93051a8dd");
            return;
        }
        try {
            eVar.a(153, this);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4923e8afba9905643141df62cb83f03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4923e8afba9905643141df62cb83f03");
        } else if (!z) {
            b();
        } else {
            try {
                if (this.e) {
                    GetUUID.getInstance().unregisterUUIDListener(this);
                    GetUUID.getInstance().unRegisterUUIDChagnedListener(this);
                    this.e = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.uuid.UUIDListener
    public void notify(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "805d67c910e2cbdcc5e130029321ef94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "805d67c910e2cbdcc5e130029321ef94");
        } else if (TextUtils.isEmpty(str) || str.equals(this.d)) {
        } else {
            this.d = str;
            MTGuardLog.setLogan("uuid notify");
            NBridge.main3(50, new Object[]{153});
        }
    }

    @Override // com.meituan.uuid.UUIDChangedListener
    public void notifyChanged(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3c57c9b530635f0d4d590d7c6dc0cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3c57c9b530635f0d4d590d7c6dc0cd");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            this.d = str2;
            MTGuardLog.setLogan("uuid notifyChanged");
            NBridge.main3(50, new Object[]{153});
        }
    }
}
