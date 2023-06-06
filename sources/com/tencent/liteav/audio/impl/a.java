package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private static final a a = new a();
    private ConcurrentHashMap<Integer, WeakReference<b>> b = new ConcurrentHashMap<>();
    private PhoneStateListener c = null;
    private Context d;

    public static a a() {
        return a;
    }

    private a() {
    }

    public synchronized void a(b bVar) {
        if (bVar == null) {
            return;
        }
        this.b.put(Integer.valueOf(bVar.hashCode()), new WeakReference<>(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        Iterator<Map.Entry<Integer, WeakReference<b>>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            b bVar = it.next().getValue().get();
            if (bVar != null) {
                bVar.onCallStateChanged(i);
            } else {
                it.remove();
            }
        }
    }

    public void a(Context context) {
        if (this.c != null) {
            return;
        }
        this.d = context.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null) {
                    return;
                }
                a.this.c = new PhoneStateListener() { // from class: com.tencent.liteav.audio.impl.a.1.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i, String str) {
                        super.onCallStateChanged(i, str);
                        TXCLog.i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:" + i);
                        a.this.a(i);
                    }
                };
                try {
                    ((TelephonyManager) a.this.d.getSystemService("phone")).listen(a.this.c, 32);
                } catch (Exception e) {
                    TXCLog.e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                }
            }
        });
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.c == null || this.d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null && a.this.d != null) {
                    try {
                        ((TelephonyManager) a.this.d.getApplicationContext().getSystemService("phone")).listen(a.this.c, 0);
                    } catch (Exception e) {
                        TXCLog.e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e);
                    }
                }
                a.this.c = null;
            }
        });
    }
}
