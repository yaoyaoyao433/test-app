package com.unionpay.mobile.android.pboctransaction.samsung;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.RemoteException;
import com.alipay.sdk.app.PayTask;
import com.unionpay.client3.tsm.ITsmConnection;
import com.unionpay.client3.tsm.SeAppInfo;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.tsmservice.data.AppStatus;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class b implements com.unionpay.mobile.android.pboctransaction.c {
    private Context a;
    private com.unionpay.mobile.android.pboctransaction.b b;
    private ITsmConnection c;
    private int d = 0;
    private Handler.Callback e = new c(this);
    private Handler f = new Handler(this.e);

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.b != null) {
            if (z) {
                this.b.a();
            } else {
                this.b.b();
            }
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        return "";
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(com.unionpay.mobile.android.pboctransaction.d dVar) {
        ArrayList<com.unionpay.mobile.android.model.c> arrayList = null;
        if (this.c == null) {
            return null;
        }
        try {
            SeAppInfo[] seApps = this.c.getSeApps(this.d);
            if (seApps == null || seApps.length <= 0) {
                return null;
            }
            ArrayList<com.unionpay.mobile.android.model.c> arrayList2 = new ArrayList<>();
            for (int i = 0; i < seApps.length; i++) {
                try {
                    String appAid = seApps[i].getAppAid();
                    if (appAid != null && appAid.startsWith("A000000333")) {
                        String appAid2 = seApps[i].getAppAid();
                        if (!(appAid2 == null || appAid2.length() <= 16 || AppStatus.APPLY.equalsIgnoreCase(appAid2.substring(14, 16)))) {
                            arrayList2.add(new com.unionpay.mobile.android.model.a(1, seApps[i].getAppAid(), "", seApps[i].getPan(), 1));
                        }
                    }
                } catch (RemoteException e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (RemoteException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.b = bVar;
        this.a = context;
        try {
            Intent intent = new Intent();
            intent.setAction("com.unionpay.client3.action.TSM_MODEL");
            intent.setPackage("com.unionpay");
            context.startService(intent);
            if (context.bindService(intent, new d(this), 1)) {
                this.f.sendMessageDelayed(this.f.obtainMessage(1), PayTask.j);
                return;
            }
            k.a("plugin-clientV3", "startSamsungService() failed!!!");
            a(false);
        } catch (Exception unused) {
            a(false);
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final byte[] a(byte[] bArr, int i) {
        if (this.c != null) {
            try {
                k.a("plugin-clientV3", "--->" + com.unionpay.mobile.android.pboctransaction.e.a(bArr));
                String sendApdu = this.c.sendApdu(this.d, com.unionpay.mobile.android.pboctransaction.e.a(bArr), i);
                k.a("plugin-clientV3", "<---".concat(String.valueOf(sendApdu)));
                return com.unionpay.mobile.android.pboctransaction.e.a(sendApdu);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void b() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void c() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void d() {
    }
}
