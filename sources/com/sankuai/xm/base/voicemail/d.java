package com.sankuai.xm.base.voicemail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String g = ".amr";
    private static String h = ".acc";
    private static int i;
    private static boolean j;
    v b;
    com.sankuai.xm.base.voicemail.c c;
    String d;
    int e;
    Context f;
    private c k;
    private long l;
    private long m;
    private String n;
    private File o;
    private String p;
    private b q;
    private final Handler r;
    private MediaRecorder.OnErrorListener s;
    private AudioManager.AudioRecordingCallback t;
    private a u;
    private boolean v;
    private AudioManager w;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e7799d4d77c9d38c53a941f5ad01e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e7799d4d77c9d38c53a941f5ad01e7");
            return;
        }
        this.n = "";
        this.c = null;
        this.r = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.xm.base.voicemail.d.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b880c3d9002df11ca1d0d4f5cb2fc6c2", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b880c3d9002df11ca1d0d4f5cb2fc6c2")).booleanValue();
                }
                if (message.what == 0) {
                    if (!d.this.o.exists() || d.this.o.length() == 0) {
                        if (d.this.q != null) {
                            b unused = d.this.q;
                        }
                        if (d.this.c != null) {
                            d.this.c.b(d.this.n);
                        }
                        d.this.a();
                        d.this.c = null;
                    } else if (d.this.c != null) {
                        d.this.c.a(d.this.n);
                    }
                }
                return false;
            }
        });
        this.s = new MediaRecorder.OnErrorListener() { // from class: com.sankuai.xm.base.voicemail.d.2
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaRecorder.OnErrorListener
            public final void onError(MediaRecorder mediaRecorder, int i2, int i3) {
                Object[] objArr2 = {mediaRecorder, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab9bcb2e87cdecea6e27c8b88bcee7bc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab9bcb2e87cdecea6e27c8b88bcee7bc");
                    return;
                }
                com.sankuai.xm.log.c.d("meituan_base", "SoundMeterImpl mOnErrorListener what: " + i2 + " extra: " + i3, new Object[0]);
                if (d.this.q != null) {
                    b unused = d.this.q;
                }
                if (d.this.c != null) {
                    d.this.c.b(d.this.n);
                }
                d dVar = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "7f519037b8b5d7678f1346ea7e47eb8c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "7f519037b8b5d7678f1346ea7e47eb8c");
                    return;
                }
                dVar.a();
                dVar.c = null;
            }
        };
        this.v = false;
        this.k = c.AMR;
        this.p = g;
        this.b = null;
        this.f = context != null ? context.getApplicationContext() : null;
        if (this.f != null) {
            this.w = (AudioManager) context.getSystemService("audio");
        }
    }

    public static void a(int i2) {
        i = i2;
    }

    public static void a(boolean z) {
        j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b0d2f1f221596d6fa05f44635d1747", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b0d2f1f221596d6fa05f44635d1747");
            return;
        }
        synchronized (this) {
            if (this.b != null) {
                com.sankuai.xm.log.c.c("SoundMeterImpl", "doStart: recording, we return here.", new Object[0]);
                return;
            }
            this.b = Privacy.createMediaRecorder("jcyf-e4b399808a333f25");
            String str = this.d;
            com.sankuai.xm.log.c.b("SoundMeterImpl", "doStart: recording, use bluetooth = " + z + ", path = " + str, new Object[0]);
            this.o = new File(str);
            this.l = 0L;
            this.m = 0L;
            this.e = 0;
            this.l = System.currentTimeMillis();
            this.n = this.l + this.p;
            boolean z2 = j;
            try {
                this.b.c(1);
                if (this.w != null) {
                    this.w.setBluetoothScoOn(z);
                }
                if (this.k == c.AMR) {
                    this.b.e(z2 ? 4 : 3);
                    this.b.a(z2 ? 2 : 1);
                } else if (this.k == c.ACC) {
                    this.b.e(0);
                    this.b.a(3);
                    if (z2) {
                        this.b.b(16000);
                    }
                }
                this.b.a(this.s);
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                this.b.a(str);
                this.b.j(i);
                if (Build.VERSION.SDK_INT > 28 && this.w != null && this.t == null) {
                    synchronized (this) {
                        if (this.t == null) {
                            this.t = new AudioManager.AudioRecordingCallback() { // from class: com.sankuai.xm.base.voicemail.d.3
                                public static ChangeQuickRedirect a;

                                @Override // android.media.AudioManager.AudioRecordingCallback
                                public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                                    Object[] objArr2 = {list};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a025e3acdfe91fee737965a4e66cdd08", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a025e3acdfe91fee737965a4e66cdd08");
                                        return;
                                    }
                                    int b2 = com.sankuai.xm.base.util.b.b(list);
                                    com.sankuai.xm.log.c.b("SoundMeterImpl", "onRecordingConfigChanged conf size:%s", Integer.valueOf(b2));
                                    if (b2 > 1) {
                                        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                                            com.sankuai.xm.log.c.c("SoundMeterImpl", "onRecordingConfigChanged config id:%s, src: %s", Integer.valueOf(audioRecordingConfiguration.getClientAudioSessionId()), Integer.valueOf(audioRecordingConfiguration.getClientAudioSource()));
                                        }
                                    }
                                }
                            };
                            this.w.registerAudioRecordingCallback(this.t, this.r);
                        }
                    }
                }
                this.b.d();
                this.b.a();
                long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
                if (currentThreadTimeMillis2 > 1000) {
                    a(currentThreadTimeMillis2);
                }
                this.r.sendEmptyMessageDelayed(0, 200L);
            } catch (Exception e) {
                com.sankuai.xm.log.c.d("meituan_base", "SoundMeterImpl.start, exception=" + e.toString(), new Object[0]);
                if (this.c != null) {
                    this.c.b(this.n);
                }
                a();
                this.c = null;
            }
        }
    }

    private void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f555a2235d473143968f7eafabbc5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f555a2235d473143968f7eafabbc5e");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        com.sankuai.xm.monitor.statistics.a.a("imlib", "recordStart", sb.toString());
    }

    public final synchronized void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9ccbecfbab735b25c7d4b5779b04df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9ccbecfbab735b25c7d4b5779b04df");
            return;
        }
        com.sankuai.xm.log.c.b("meituan_base", "SoundMeterImpl.stop：" + z + CommonConstant.Symbol.COLON + System.currentTimeMillis(), new Object[0]);
        this.m = System.currentTimeMillis();
        if (this.b == null) {
            com.sankuai.xm.log.c.b("meituan_base", "mRecorder == null", new Object[0]);
            return;
        }
        a();
        if (this.c != null && !z) {
            if (this.o != null && this.o.exists()) {
                com.sankuai.xm.log.c.b("meituan_base", "SoundMeterImpl.onFinish", new Object[0]);
                com.sankuai.xm.base.voicemail.c cVar = this.c;
                long j2 = this.m - this.l;
                if (i > 0 && j2 > i) {
                    j2 = i;
                }
                cVar.a(j2, this.o.length(), this.o);
            } else {
                this.c.b(this.n);
            }
        }
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2c82ece5d0363ed6b06f65cce4e95d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2c82ece5d0363ed6b06f65cce4e95d");
            return;
        }
        if (this.b != null) {
            try {
                if (Build.VERSION.SDK_INT > 28 && this.f != null && this.t != null) {
                    if (this.w != null) {
                        this.w.unregisterAudioRecordingCallback(this.t);
                    }
                    this.t = null;
                }
                this.b.b();
                this.b.c();
                this.b.e();
                this.b = null;
            } catch (Exception e) {
                e.printStackTrace();
                com.sankuai.xm.log.c.d("meituan_base", "SoundMeterImpl stopAndRelease RuntimeException: " + e.getMessage(), new Object[0]);
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            if (this.b != null) {
                try {
                    this.b.b();
                } catch (IllegalStateException e3) {
                    this.b = null;
                    this.b = Privacy.createMediaRecorder("jcyf-e4b399808a333f25");
                    com.sankuai.xm.log.c.d("meituan_base", "SoundMeterImpl stopAndRelease Exception: " + e3.getMessage(), new Object[0]);
                } catch (Exception e4) {
                    this.b = null;
                    this.b = Privacy.createMediaRecorder("jcyf-e4b399808a333f25");
                    com.sankuai.xm.log.c.d("meituan_base", "SoundMeterImpl stopAndRelease Exception: " + e4.getMessage(), new Object[0]);
                }
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                this.b.c();
                this.b.e();
                this.b = null;
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5e0040b42967e7fbaab0a729f33883e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5e0040b42967e7fbaab0a729f33883e");
            return;
        }
        com.sankuai.xm.log.c.b("SoundMeterImpl", "closeSco.", new Object[0]);
        if (this.v && this.w != null) {
            this.v = false;
            this.w.stopBluetoothSco();
        }
        if (this.u != null && this.f != null) {
            this.f.unregisterReceiver(this.u);
            this.u = null;
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2145acb01eeef4d691a709b7a7304f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2145acb01eeef4d691a709b7a7304f");
            return;
        }
        if (this.o != null && this.o.exists()) {
            this.o.delete();
        }
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904abeb06667c611f6af3b2c0efcba19", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904abeb06667c611f6af3b2c0efcba19")).booleanValue();
        }
        try {
            if (Privacy.createPermissionGuard().a(context, PermissionGuard.PERMISSION_BLUETOOTH, "jcyf-64d00485ef7690b8") > 0) {
                MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter("jcyf-64d00485ef7690b8");
                if (createBluetoothAdapter == null) {
                    com.sankuai.xm.log.c.c("SoundMeterImpl", "checkBluetoothConnected MtBluetoothAdapter is null.", new Object[0]);
                    return false;
                } else if (2 == createBluetoothAdapter.getProfileConnectionState(1)) {
                    return true;
                }
            }
            return this.w != null && this.w.isBluetoothA2dpOn();
        } catch (Throwable th) {
            com.sankuai.xm.log.c.a("SoundMeterImpl", th, "checkBluetoothConnected exception.", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59cb78e3ab6a98289a0e3e9bb5c1420f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59cb78e3ab6a98289a0e3e9bb5c1420f")).booleanValue();
        }
        com.sankuai.xm.log.c.b("SoundMeterImpl", "openSco", new Object[0]);
        if (this.w == null || !this.w.isBluetoothScoAvailableOffCall()) {
            com.sankuai.xm.log.c.c("SoundMeterImpl", "openSco fail.", new Object[0]);
            return false;
        }
        try {
            if (this.w.isBluetoothScoOn()) {
                b(true);
            } else {
                if (this.u == null) {
                    this.u = new a();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                    context.registerReceiver(this.u, new IntentFilter(intentFilter));
                }
                this.w.startBluetoothSco();
                this.v = true;
            }
            return true;
        } catch (Throwable th) {
            com.sankuai.xm.log.c.a("SoundMeterImpl", th, "openSco exception.", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private boolean c;
        private int d;
        private int e;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ffdd548478d62fd7b0068d72a07478", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ffdd548478d62fd7b0068d72a07478");
                return;
            }
            this.c = true;
            this.d = 0;
            this.e = Integer.MIN_VALUE;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7b1f9f71afb64ae34537233ed2a180", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7b1f9f71afb64ae34537233ed2a180");
                return;
            }
            com.sankuai.xm.log.c.b("SoundMeterImpl", "BluetoothScoStateReceiver::onReceive action = " + intent.getAction(), new Object[0]);
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int a2 = f.a(intent, "android.media.extra.SCO_AUDIO_STATE", -1);
                com.sankuai.xm.log.c.b("SoundMeterImpl", "BluetoothScoStateReceiver sco state = " + a2 + ", watchSCO = " + this.c, new Object[0]);
                if (this.c) {
                    switch (a2) {
                        case 0:
                            com.sankuai.xm.log.c.b("SoundMeterImpl", "BluetoothScoStateReceiver sco disconnected.", new Object[0]);
                            if (this.e == 2) {
                                d.this.b(false);
                                this.c = false;
                                break;
                            }
                            break;
                        case 1:
                            d.this.b(true);
                            this.c = false;
                            break;
                        case 2:
                            com.sankuai.xm.log.c.b("SoundMeterImpl", "BluetoothScoStateReceiver sco connecting.", new Object[0]);
                            break;
                        default:
                            int i = this.d;
                            this.d = i + 1;
                            if (i < 3 && d.this.w != null) {
                                com.sankuai.xm.log.c.b("SoundMeterImpl", "BluetoothScoStateReceiver sco error, retry = " + this.d, new Object[0]);
                                d.this.w.startBluetoothSco();
                                break;
                            } else {
                                com.sankuai.xm.log.c.c("SoundMeterImpl", "BluetoothSCOStateReceiver openSco fail, use mic.", new Object[0]);
                                d.this.b(false);
                                this.c = false;
                                break;
                            }
                            break;
                    }
                    this.e = a2;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum c {
        AMR,
        ACC;
        
        public static ChangeQuickRedirect a;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf037bea3e1f53e9af700531ba8f87cf", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf037bea3e1f53e9af700531ba8f87cf") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ff36a5124e200674b46f5778cfd9b15", 6917529027641081856L) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ff36a5124e200674b46f5778cfd9b15") : (c[]) values().clone();
        }

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca5c39170daaef035d2f74dacc552f0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca5c39170daaef035d2f74dacc552f0e");
            }
        }
    }
}
