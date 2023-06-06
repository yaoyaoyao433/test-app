package com.unionpay.mobile.android.pboctransaction.icfcc;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.unionpay.mobile.android.pboctransaction.AppIdentification;
import com.unionpay.mobile.android.pboctransaction.d;
import com.unionpay.mobile.android.pboctransaction.e;
import com.unionpay.mobile.android.utils.k;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class a implements com.unionpay.mobile.android.pboctransaction.c {
    private cn.gov.pbc.tsm.client.mobile.android.bank.service.a c;
    private com.unionpay.mobile.android.pboctransaction.b d;
    private Context e;
    private String a = null;
    private String b = "A0000003334355502D4D4F42494C45";
    private ServiceConnection f = new b(this);

    private byte[] a(byte[] bArr) {
        cn.gov.pbc.tsm.client.mobile.android.bank.service.a aVar;
        byte[] a;
        String str;
        byte[] bArr2 = null;
        try {
            String a2 = e.a(bArr);
            if (b(a2)) {
                if (a2.contains(this.a)) {
                    k.c("icfcc", "pbocAID = " + this.a);
                    aVar = this.c;
                    a = e.a(this.a);
                    str = "00";
                } else if (a2.contains(this.b)) {
                    k.c("icfcc", "upcardAID = " + this.b);
                    aVar = this.c;
                    a = e.a(this.b);
                    str = "01";
                }
                bArr2 = aVar.a(a, str);
            }
        } catch (Exception unused) {
        }
        k.c("icfcc", " openSEChannel result=" + e.a(bArr2));
        return bArr2;
    }

    private static boolean b(String str) {
        return str.startsWith("00A40400") || str.startsWith("01A40400") || str.startsWith("02A40400");
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        return "";
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(d dVar) {
        if (this.c == null) {
            return null;
        }
        ArrayList<com.unionpay.mobile.android.model.c> arrayList = new ArrayList<>();
        try {
            try {
                String a = c.a(e.a(this.c.a(e.a("325041592e5359532e4444463031"), "00")), "4F");
                k.c("icfcc", "aid =".concat(String.valueOf(a)));
                if (a != null) {
                    this.a = a;
                    AppIdentification appIdentification = new AppIdentification(a, "");
                    String c = e.c(dVar.a(appIdentification));
                    if (c != null && c.length() > 0) {
                        k.c("icfcc", "  ".concat(String.valueOf(c)));
                        arrayList.add(new com.unionpay.mobile.android.model.a(8, appIdentification.a(), "", c, 1));
                    }
                }
                try {
                    this.c.b("00");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                return arrayList;
            } catch (RemoteException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (Exception unused) {
            this.c.b("00");
            return null;
        } catch (Throwable th) {
            try {
                this.c.b("00");
            } catch (RemoteException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
        d();
        if (this.c != null) {
            try {
                this.c.a();
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception unused) {
            }
        }
        if (this.e != null) {
            new Intent("com.unionpay.mobile.tsm.PBOCService");
            this.e.unbindService(this.f);
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.d = bVar;
        this.e = context;
        try {
            Intent intent = new Intent("cn.gov.pbc.tsm.client.mobile.android.bank.service");
            intent.setPackage("cn.gov.pbc.tsm.client.mobile.andorid");
            context.startService(intent);
            if (context.bindService(intent, this.f, 1) || bVar == null) {
                return;
            }
            k.a("icfcc", "startTSMService.initFailed()");
            bVar.b();
        } catch (Exception unused) {
            if (bVar != null) {
                k.a("icfcc", "starticfccService exception");
                bVar.b();
            }
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final byte[] a(byte[] bArr, int i) {
        byte[] bArr2;
        String a = e.a(bArr);
        k.c("icfcc", "====>".concat(String.valueOf(a)));
        if (this.c == null) {
            return null;
        }
        if (b(a)) {
            return a(bArr);
        }
        try {
            bArr2 = this.c.b(bArr);
        } catch (RemoteException | Exception unused) {
            bArr2 = null;
        }
        k.c("icfcc", "<====" + e.a(bArr2));
        return bArr2;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void b() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void c() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void d() {
        if (this.c != null) {
            try {
                this.c.b("00");
                this.c.b("01");
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception unused) {
            }
        }
    }
}
