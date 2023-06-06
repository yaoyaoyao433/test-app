package com.unionpay.mobile.android.pboctransaction.remoteapdu;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.pboctransaction.AppIdentification;
import com.unionpay.mobile.android.pboctransaction.e;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.tsm.connect.IInitCallback;
import com.unionpay.mobile.tsm.connect.IRemoteApdu;
import com.unionpay.tsmservice.data.AppStatus;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class a implements com.unionpay.mobile.android.pboctransaction.c {
    com.unionpay.mobile.android.pboctransaction.b a;
    private IRemoteApdu b = null;
    private boolean c = false;
    private Context d = null;
    private Handler e = null;
    private boolean f = false;
    private final Handler.Callback g = new b(this);
    private final ServiceConnection h = new c(this);
    private final IInitCallback.Stub i = new d(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean b(a aVar) {
        aVar.f = true;
        return true;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        return "";
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(com.unionpay.mobile.android.pboctransaction.d dVar) {
        ArrayList<AppIdentification> arrayList;
        String c;
        k.a("plugin-tsm", "RemoteApduEngine.readList() +++");
        ArrayList<com.unionpay.mobile.android.model.c> arrayList2 = null;
        try {
            String str = this.c ? "D15600010100016111000000B0004101" : "D15600010100016111000000B0004001";
            k.a("plugin-tsm", "sid=".concat(String.valueOf(str)));
            String writeApdu = this.b.writeApdu("00a4040010".concat(String.valueOf(str)), 0);
            if (writeApdu != null && writeApdu.equalsIgnoreCase("9000")) {
                writeApdu = this.b.writeApdu("80CA2F0000", 0);
            }
            arrayList = e.b(writeApdu);
        } catch (Exception e) {
            e.printStackTrace();
            k.c("plugin-tsm", e.getMessage());
            arrayList = null;
        }
        if (arrayList != null && arrayList.size() > 0) {
            arrayList2 = new ArrayList<>();
            Iterator<AppIdentification> it = arrayList.iterator();
            while (it.hasNext()) {
                AppIdentification next = it.next();
                if (next.c() && !AppStatus.APPLY.equalsIgnoreCase(next.b()) && (c = e.c(dVar.a(next))) != null && c.length() > 0) {
                    arrayList2.add(new com.unionpay.mobile.android.model.a(4, next.a(), "", c, 1));
                }
            }
        }
        k.a("plugin-tsm", "RemoteApduEngine.readList() ---");
        return arrayList2;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
        d();
        if (this.d != null) {
            Context context = this.d;
            k.a("plugin-tsm", "unbindTSMService() ++");
            if (this.f) {
                try {
                    context.unbindService(this.h);
                } catch (Exception unused) {
                }
                this.f = false;
            }
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.a = bVar;
        this.d = context;
        this.e = new Handler(this.g);
        try {
            Intent intent = new Intent("com.unionpay.mobile.tsm.PBOCService");
            intent.setPackage("com.unionpay.mobile.tsm");
            context.startService(intent);
            if (this.e != null) {
                this.e.sendMessageDelayed(Message.obtain(this.e, 3000), 8000L);
            }
            if (context.bindService(intent, this.h, 1) || this.a == null) {
                return;
            }
            k.a("plugin-tsm", "startTSMService.initFailed()");
            this.a.b();
        } catch (Exception unused) {
            if (this.a != null) {
                k.a("plugin-tsm", "startTSMService exception");
                this.a.b();
            }
        }
    }

    public final void a(boolean z) {
        this.c = z;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final byte[] a(byte[] bArr, int i) {
        String str;
        if (bArr == null) {
            return null;
        }
        String a = e.a(bArr);
        k.a("plugin-tsm", "[---->]".concat(String.valueOf(a)));
        try {
            str = this.b.writeApdu(a, i);
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        k.a("plugin-tsm", "[<----]".concat(String.valueOf(str)));
        return e.a(str);
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
        if (this.b != null) {
            try {
                this.b.closeChannel(0);
                this.b.closeChannel(1);
                this.b.closeChannel(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
