package com.unionpay.mobile.android.pboctransaction.simapdu;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.StringUtil;
import com.unionpay.mobile.android.pboctransaction.AppIdentification;
import com.unionpay.mobile.android.pboctransaction.d;
import com.unionpay.mobile.android.pboctransaction.e;
import com.unionpay.mobile.android.pboctransaction.simapdu.a;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.android.utils.l;
import com.unionpay.tsmservice.data.AppStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simalliance.openmobileapi.service.SmartcardError;
/* loaded from: classes6.dex */
public final class b implements com.unionpay.mobile.android.pboctransaction.c {
    private static b d = new b();
    private com.unionpay.mobile.android.pboctransaction.b c;
    private org.simalliance.openmobileapi.c a = null;
    private org.simalliance.openmobileapi.a[] b = new org.simalliance.openmobileapi.a[3];
    private Handler.Callback e = new c(this);
    private Handler f = new Handler(this.e);

    private b() {
    }

    private synchronized String a(String str, int i) throws a.C1511a {
        String str2 = null;
        if (str == null) {
            return null;
        }
        k.a("plugin-sim", "====>".concat(String.valueOf(str)));
        String upperCase = str.toUpperCase(Locale.CHINA);
        boolean z = false;
        if (i > this.b.length) {
            i = 0;
        }
        if ((upperCase.startsWith("00A40400") || upperCase.startsWith("01A40400") || upperCase.startsWith("02A40400")) ? true : true) {
            a(i);
            String b = b(e.a(upperCase.substring(10, (((Integer.parseInt(upperCase.substring(8, 9), 16) * 16) + Integer.parseInt(upperCase.substring(9, 10), 16)) * 2) + 10)), i);
            if (TextUtils.isEmpty(b)) {
                k.c("plugin-sim", " writeApdu openchannel exception!!!");
                throw new a.C1511a();
            }
            return b;
        }
        try {
            try {
                byte[] a = e.a(upperCase);
                if (a != null) {
                    str2 = e.a(this.b[i].a(a));
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new a.C1511a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        k.a("plugin-sim", "<====".concat(String.valueOf(str2)));
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.unionpay.mobile.android.pboctransaction.b b(b bVar) {
        bVar.c = null;
        return null;
    }

    private String b(byte[] bArr, int i) {
        org.simalliance.openmobileapi.a a;
        try {
            org.simalliance.openmobileapi.b[] b = this.a.b();
            if (b.length <= 0 || (a = b[0].a().a(bArr)) == null) {
                return "";
            }
            this.b[i] = a;
            return e.a(a.a());
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            bVar = d;
        }
        return bVar;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        return "";
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(d dVar) {
        ArrayList arrayList;
        String a;
        k.c("plugin-sim", " SIMEngine.readList() +++");
        ArrayList<com.unionpay.mobile.android.model.c> arrayList2 = null;
        try {
            arrayList = new ArrayList(1);
            a = dVar.a("A0000003330101");
            k.c("plugin-sim", "full AID:".concat(String.valueOf(a)));
        } catch (Throwable th) {
            th = th;
        }
        if (a != null && a.length() >= 16) {
            arrayList.add(new AppIdentification(a, null));
            if (arrayList.size() > 0) {
                ArrayList<com.unionpay.mobile.android.model.c> arrayList3 = new ArrayList<>();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AppIdentification appIdentification = (AppIdentification) it.next();
                        if (!AppStatus.APPLY.equalsIgnoreCase(appIdentification.b())) {
                            String c = e.c(dVar.a(appIdentification));
                            k.a("nfcphone", " cardNumber=".concat(String.valueOf(c)));
                            if (c != null && c.length() > 0) {
                                arrayList3.add(new com.unionpay.mobile.android.model.a(16, appIdentification.a(), "", c, 1));
                                k.a("nfcphone", " valid Number= ".concat(String.valueOf(c)));
                            }
                        }
                    }
                    arrayList2 = arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    arrayList2 = arrayList3;
                    Log.e("plugin-sim", " SimEngine Exception = " + th.getMessage());
                    k.c("plugin-sim", " SIMEngine.readList() ---");
                    return arrayList2;
                }
            } else {
                Log.e("plugin-sim", " SIMEngine --- there has no PBOC aids!!!");
            }
            k.c("plugin-sim", " SIMEngine.readList() ---");
            return arrayList2;
        }
        return null;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
        k.c("plugin-sim", "SIMEngine.destroy() +++ ");
        k.c("plugin-sim", " mSEService = " + this.a);
        d();
        if (this.a != null && this.a.a()) {
            k.a("TAG", " mSEService.isConnected() = " + this.a.a());
            k.c("plugin-sim", " mSEService.shutdown() ");
            this.a.c();
        }
        k.c("plugin-sim", "SIMEngine.destroy() --- ");
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.c = bVar;
        try {
            new l();
            if (l.a() == null || !l.a().a()) {
                this.f.sendEmptyMessage(2);
                return;
            }
            this.a = l.a();
            this.f.sendEmptyMessage(1);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("plugin-sim", " service ERROR!!!");
            this.f.sendEmptyMessage(2);
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final byte[] a(byte[] bArr, int i) {
        byte[] bArr2;
        k.c("plugin-sim", " SIMEngine.sendApdu() +++");
        try {
            bArr2 = e.a(a(e.a(bArr), i));
        } catch (a.C1511a e) {
            e.printStackTrace();
            k.c("plugin-sim", StringUtil.SPACE + e.getMessage());
            bArr2 = null;
        }
        k.c("plugin-sim", " SIMEngine.sendApdu() ---");
        return bArr2;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void b() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void c() {
        d();
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void d() {
        k.a("plugin-sim", "closeChannels() +++");
        for (int i = 0; i < this.b.length; i++) {
            a(i);
        }
        k.a("plugin-sim", "closeChannels() ---");
    }

    private void a(int i) {
        org.simalliance.openmobileapi.a aVar;
        k.a("plugin-sim", "closeChannel(int) +++");
        if (this.b[i] != null && i <= this.b.length) {
            try {
                aVar = this.b[i];
            } catch (Exception e) {
                e.printStackTrace();
                k.a("plugin-sim", " mChannel[channel].close() exception!!!");
            }
            if (aVar.b == null || !aVar.b.a()) {
                throw new IllegalStateException("service not connected to system");
            }
            if (aVar.a == null) {
                throw new NullPointerException("channel must not be null");
            }
            SmartcardError smartcardError = new SmartcardError();
            try {
                aVar.a.close(smartcardError);
            } catch (RemoteException unused) {
            }
            org.simalliance.openmobileapi.c.a(smartcardError);
            this.b[i] = null;
        }
        k.a("plugin-sim", "closeChannel(int) ---");
    }
}
