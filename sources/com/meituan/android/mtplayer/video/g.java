package com.meituan.android.mtplayer.video;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.player.d;
import com.meituan.android.mtplayer.video.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class g implements com.meituan.android.mtplayer.video.callback.b {
    public static ChangeQuickRedirect b;
    private d.b A;
    private d.InterfaceC0298d B;
    private d.c C;
    private Pair<Float, Float> a;
    protected Context c;
    protected com.meituan.android.mtplayer.video.player.d d;
    l e;
    protected volatile int f;
    protected volatile int g;
    protected volatile boolean h;
    protected int i;
    int j;
    float k;
    int l;
    boolean m;
    BasePlayerParam n;
    a o;
    long p;
    final String q;
    private boolean r;
    private float s;
    private IPlayerStateCallback t;
    private h u;
    private TimerTask v;
    private ScheduledExecutorService w;
    private d.e x;
    private d.a y;
    private d.f z;

    public abstract void a();

    public abstract void a(int i, int i2);

    public abstract void h();

    public abstract void i();

    public abstract boolean j();

    public g(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7915caba659085ee933f3c993ffc740", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7915caba659085ee933f3c993ffc740");
            return;
        }
        this.e = l.TYPE_ANDROID;
        this.f = 0;
        this.g = 0;
        this.j = -1;
        this.k = -1.0f;
        this.l = -1;
        this.s = -1.0f;
        Activity activity = null;
        this.o = new a();
        this.x = new d.e() { // from class: com.meituan.android.mtplayer.video.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.e
            public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2dcee5277cd9dd58ea0c0439a6d5f49b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2dcee5277cd9dd58ea0c0439a6d5f49b");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MediaPlayer has prepared");
                if (g.this.g != 4) {
                    g.this.f = 2;
                    g.this.b(0, g.this.f);
                } else {
                    g.this.f = 4;
                }
                if (g.this.k > -1.0f) {
                    g.this.j = (int) (g.this.getDuration() * g.this.k);
                    g.this.k = -1.0f;
                }
                int i = g.this.j;
                if (i >= 0) {
                    g.this.a(i);
                }
                long time = new Date().getTime() - g.this.p;
                com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "first load time:" + time + "ms");
                com.meituan.android.mtplayer.video.sniffer.c.a(com.meituan.android.mtplayer.video.sniffer.a.a(time, g.this.j(), g.this.q));
                if (g.this.o()) {
                    g.this.a(dVar.getVideoWidth(), dVar.getVideoHeight());
                }
            }
        };
        this.y = new d.a() { // from class: com.meituan.android.mtplayer.video.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.a
            public final void a(com.meituan.android.mtplayer.video.player.d dVar, int i) {
                Object[] objArr2 = {dVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "630d290f7dc801d57ffab4a2dfee1fae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "630d290f7dc801d57ffab4a2dfee1fae");
                } else if (i != g.this.i) {
                    int i2 = g.this.i;
                    g.this.i = i;
                    com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MediaPlayer buffer percent has changed:" + i2 + "->" + g.this.i);
                }
            }
        };
        this.z = new d.f() { // from class: com.meituan.android.mtplayer.video.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.f
            public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c74f931cecab7737598e1095d117cbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c74f931cecab7737598e1095d117cbe");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MediaPlayer has seeked :mTargetSeekPoi = " + g.this.l + ", currentPoi:" + dVar.getCurrentPosition());
                g.this.h = false;
                if (g.this.o()) {
                    g.this.i();
                }
            }
        };
        this.A = new d.b() { // from class: com.meituan.android.mtplayer.video.g.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.b
            public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
                boolean z = true;
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07df1330ac32d08bac026ffc3b8e0af8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07df1330ac32d08bac026ffc3b8e0af8");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MediaPlayer has completed");
                if (g.this.f != -1) {
                    z = (g.this.m && g.this.f == 3) ? false : false;
                    g gVar = g.this;
                    g.this.f = 7;
                    gVar.g = 7;
                    g.this.b(0, g.this.f);
                    int duration = g.this.getDuration();
                    if (duration > 0) {
                        g.this.c(duration, duration);
                    }
                    if (z) {
                        g.this.l = -1;
                        g.this.c();
                        g gVar2 = g.this;
                        g.this.f = 3;
                        gVar2.g = 3;
                        g.this.b(0, g.this.f);
                        return;
                    }
                }
                g.this.b(false);
            }
        };
        this.B = new d.InterfaceC0298d() { // from class: com.meituan.android.mtplayer.video.g.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.InterfaceC0298d
            public final boolean a(com.meituan.android.mtplayer.video.player.d dVar, int i, int i2) {
                Object[] objArr2 = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01fa2542ea29cf23001b7b03bc347068", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01fa2542ea29cf23001b7b03bc347068")).booleanValue();
                }
                if (i == 3) {
                    if (!g.this.j()) {
                        if (g.this.f != 4 && g.this.f != 6) {
                            g.this.f = 3;
                            g.this.b(0, g.this.f);
                            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "MediaPlayer first render is available , begin to play");
                        } else {
                            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "MediaPlayer在暂停态，first render ready，不通知");
                        }
                        return true;
                    }
                } else {
                    switch (i) {
                        case 701:
                            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "MediaPlayer buffer start");
                            if (g.this.f == 4) {
                                g.this.f = 6;
                            } else {
                                g.this.f = 5;
                            }
                            g.this.b(0, g.this.f);
                            return true;
                        case 702:
                            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "MediaPlayer buffer end");
                            if (g.this.f == 5 || g.this.f == 6) {
                                if (g.this.f == 5) {
                                    g.this.f = 3;
                                } else if (g.this.f == 6) {
                                    g.this.f = 4;
                                }
                                g.this.b(0, g.this.f);
                            }
                            return true;
                    }
                }
                return false;
            }
        };
        this.C = new d.c() { // from class: com.meituan.android.mtplayer.video.g.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.c
            public final boolean a(com.meituan.android.mtplayer.video.player.d dVar, int i, int i2) {
                String str;
                boolean z;
                Object[] objArr2 = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6551af2ab6803dd1507754a6e0da3057", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6551af2ab6803dd1507754a6e0da3057")).booleanValue();
                }
                com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "MediaPlayer has error:what = " + i + ",extra = " + i2);
                g gVar = g.this;
                g.this.f = -1;
                gVar.g = -1;
                g gVar2 = g.this;
                int i3 = g.this.f;
                Object[] objArr3 = {0, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = g.b;
                if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "61de370b301982da896c794d286f7138", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "61de370b301982da896c794d286f7138");
                } else {
                    Message obtain = Message.obtain(gVar2.o, 0, i3, 0, gVar2);
                    Bundle bundle = new Bundle();
                    bundle.putInt("error_what", i);
                    bundle.putInt("error_extra", i2);
                    obtain.setData(bundle);
                    obtain.sendToTarget();
                }
                String str2 = "";
                String str3 = "";
                try {
                    JSONObject put = new JSONObject().put("what", i).put("extra", i2).put("playertype", g.this.e);
                    str3 = g.this.n != null ? g.this.n.b() : "mPlayerParam is null";
                    put.put("video_url", str3);
                    str2 = put.toString();
                } catch (Throwable unused) {
                }
                Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mtplayer.video.sniffer.b.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "5da409d5e938b94a46a4456a1c9017ad", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "5da409d5e938b94a46a4456a1c9017ad");
                } else {
                    str = "play_error__what" + i + "_extra" + i2;
                }
                com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_play", str, str2);
                if (g.this.c != null) {
                    com.meituan.android.mtplayer.video.utils.b a2 = com.meituan.android.mtplayer.video.utils.b.a(g.this.c);
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mtplayer.video.utils.b.a;
                    if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "a120a95573ae2b2c2daa82d1a8a5a273", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "a120a95573ae2b2c2daa82d1a8a5a273")).booleanValue();
                    } else {
                        z = a2.a() != b.EnumC0300b.NONE;
                    }
                    if (z) {
                        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
                            com.meituan.android.mtplayer.video.sniffer.c.a(com.meituan.android.mtplayer.video.sniffer.a.a(1, g.this.j(), g.this.q, str3));
                        } else {
                            com.meituan.android.mtplayer.video.sniffer.c.a(com.meituan.android.mtplayer.video.sniffer.a.a(0, g.this.j(), g.this.q, str3));
                        }
                        return false;
                    }
                }
                com.meituan.android.mtplayer.video.sniffer.c.a(com.meituan.android.mtplayer.video.sniffer.a.a(0, g.this.j(), g.this.q, str3));
                return false;
            }
        };
        this.c = context.getApplicationContext();
        if (!j()) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e59f614e6708dcf43cbfdb062c3746c4", RobustBitConfig.DEFAULT_VALUE)) {
                activity = (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e59f614e6708dcf43cbfdb062c3746c4");
            } else if (context != null) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else if (context instanceof ContextWrapper) {
                    Context baseContext = ((ContextWrapper) context).getBaseContext();
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    }
                }
            }
        }
        this.q = activity != null ? activity.getClass().getName() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50891e51e3edce9350a76b4f506cde9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50891e51e3edce9350a76b4f506cde9");
            } else if (message.obj instanceof g) {
                g gVar = (g) message.obj;
                switch (message.what) {
                    case 0:
                        if (message.arg1 == -1) {
                            gVar.a(-1, message.getData());
                            return;
                        } else {
                            gVar.b(message.arg1);
                            return;
                        }
                    case 1:
                        gVar.c(message.arg1, message.arg2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public static ChangeQuickRedirect a;
        private long c;
        private long d;

        private b() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcde40be2227f70ba8b46558f08b69ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcde40be2227f70ba8b46558f08b69ff");
                return;
            }
            this.c = 0L;
            this.d = 0L;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd5f6263fb544e795b4f8765a2f171d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd5f6263fb544e795b4f8765a2f171d");
                return;
            }
            com.meituan.android.mtplayer.video.player.d dVar = g.this.d;
            if (dVar == null || g.this.f != 3) {
                return;
            }
            int currentPosition = (int) dVar.getCurrentPosition();
            int duration = (int) dVar.getDuration();
            long j = currentPosition;
            if (this.c == j) {
                this.d += 1000;
            } else {
                this.d = 0L;
                this.c = j;
            }
            if (g.this.l >= 0 && currentPosition <= g.this.l) {
                com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "delay process update because currentPosition(" + currentPosition + "ms) <= mTargetSeekPos(" + g.this.l + "ms)");
                return;
            }
            g.this.l = -1;
            if (this.d > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE && dVar != null) {
                dVar.pause();
                dVar.start();
            }
            if (duration > 0) {
                g.this.a(1, currentPosition, duration);
            }
        }
    }

    public void l() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867d3c0c26dd1bcba7b7c8f05af00357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867d3c0c26dd1bcba7b7c8f05af00357");
            return;
        }
        if (this.u != null) {
            this.d = this.u.a(this.c, this.e);
        } else {
            this.d = com.meituan.android.mtplayer.video.player.f.a(this.c, this.e);
        }
        if (this.d.getPlayerType() == 1) {
            this.e = l.TYPE_IJK;
        } else if (this.d.getPlayerType() == 2) {
            this.e = l.TYPE_XPLAYER;
        } else {
            this.e = l.TYPE_ANDROID;
        }
        this.d.setOnPreparedListener(this.x);
        this.d.setOnCompletionListener(this.A);
        this.d.setOnErrorListener(this.C);
        this.d.setOnInfoListener(this.B);
        this.d.setOnBufferingUpdateListener(this.y);
        this.d.setOnSeekCompleteListener(this.z);
        this.d.setAudioStreamType(3);
        this.d.setScreenOnWhilePlaying(true);
    }

    void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5ef9c53e496bdf382bd4cb6700dc45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5ef9c53e496bdf382bd4cb6700dc45");
        } else {
            Message.obtain(this.o, i, i2, 0, this).sendToTarget();
        }
    }

    void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c766f592de549e393d4857d4fba985e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c766f592de549e393d4857d4fba985e2");
        } else {
            Message.obtain(this.o, i, i2, i3, this).sendToTarget();
        }
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590540588506fea86d273cd5d793ea9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590540588506fea86d273cd5d793ea9e");
        } else {
            a(i, (Bundle) null);
        }
    }

    public void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5eae5e20d1d361d1cf0147391c86030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5eae5e20d1d361d1cf0147391c86030");
        } else if (this.t != null) {
            if (this.t instanceof com.meituan.android.mtplayer.video.callback.d) {
                com.meituan.android.mtplayer.video.error.a aVar = null;
                if (bundle != null) {
                    aVar = new com.meituan.android.mtplayer.video.error.a();
                    aVar.a = bundle.getInt("error_what");
                    aVar.b = bundle.getInt("error_extra");
                }
                ((com.meituan.android.mtplayer.video.callback.d) this.t).a(i, aVar);
            } else {
                this.t.a(i);
            }
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "notify play state changed :" + i);
        }
    }

    public void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965789a77c5f08bffaa189ddb3ab4365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965789a77c5f08bffaa189ddb3ab4365");
        } else if (this.t != null) {
            this.t.a(i, i2, this.i);
        }
    }

    private boolean q() {
        return (this.d == null || this.f == -1 || this.f == 0 || this.f == 1) ? false : true;
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf9adffc62726e2acbc2c8f07baa887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf9adffc62726e2acbc2c8f07baa887");
            return;
        }
        this.g = 0;
        this.f = 0;
        this.h = false;
        this.i = 0;
        this.j = -1;
        this.l = -1;
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3ac6eda48d88b8adfdc2731704673f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3ac6eda48d88b8adfdc2731704673f");
            return;
        }
        n();
        this.v = new b();
        this.w = com.sankuai.android.jarvis.c.b("mtplayer-base-process-timer", 1);
        this.w.scheduleAtFixedRate(this.v, 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e50f1780af54c5dd27eb2268fdf84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e50f1780af54c5dd27eb2268fdf84d");
            return;
        }
        if (this.w != null) {
            this.w.shutdownNow();
            this.w = null;
        }
        if (this.v != null) {
            this.v.cancel();
            this.v = null;
        }
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f3d8df68f0b48c76f8b9c422099a92", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f3d8df68f0b48c76f8b9c422099a92")).booleanValue() : (this.d == null || this.f == 3 || this.g != 3 || this.h) ? false : true;
    }

    public void a(IPlayerStateCallback iPlayerStateCallback) {
        this.t = iPlayerStateCallback;
    }

    public void a(h hVar) {
        this.u = hVar;
    }

    public void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac2a1fb68a30abd25b59f42891a60a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac2a1fb68a30abd25b59f42891a60a8");
        } else if (lVar != null) {
            if (lVar == l.TYPE_XPLAYER) {
                this.e = l.TYPE_XPLAYER;
            } else {
                this.e = l.TYPE_ANDROID;
            }
        }
    }

    public l k() {
        return this.e;
    }

    public void a(BasePlayerParam basePlayerParam) {
        this.n = basePlayerParam;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public synchronized void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a487828f51356026c2165a904b1f078f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a487828f51356026c2165a904b1f078f");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.prepare()");
        if (this.n == null) {
            return;
        }
        if (this.f == 0) {
            this.p = new Date().getTime();
            com.meituan.android.mtplayer.video.sniffer.c.a(com.meituan.android.mtplayer.video.sniffer.a.a(j(), this.q));
            this.g = 2;
            if (this.d == null) {
                l();
                if (this.d == null) {
                    this.f = -1;
                    this.g = -1;
                    this.C.a(new com.meituan.android.mtplayer.video.player.c(), 1, 0);
                    return;
                }
            }
            if (this.n != null) {
                try {
                    this.n.e();
                    BasePlayerParam basePlayerParam = this.n;
                    Object[] objArr2 = {basePlayerParam};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.utils.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "20b0acade0c7208ed0940801b66d182f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "20b0acade0c7208ed0940801b66d182f");
                    } else {
                        try {
                            String c = basePlayerParam.c();
                            if (!TextUtils.isEmpty(c)) {
                                com.dianping.networklog.c.a("MTPlayer Video Url: " + c, 3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (this.n.a(this.c, this.d)) {
                        this.d.prepareAsync();
                        com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "Method call: MediaPlayer.prepareAsync()");
                        this.f = 1;
                        b(0, this.f);
                    } else {
                        this.f = -1;
                        this.g = -1;
                        this.C.a(this.d, 1, 0);
                        com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "setDataSource failed");
                    }
                } catch (IOException unused2) {
                    this.f = -1;
                    this.g = -1;
                    this.C.a(this.d, 1, 0);
                    String str2 = "";
                    try {
                        JSONObject put = new JSONObject().put("playertype", this.e);
                        if (this.n != null) {
                            put.put("video_url", this.n.b());
                        }
                        put.put("errortype", "io");
                        str2 = put.toString();
                    } catch (JSONException unused3) {
                    }
                    com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_play", "play_prepare_error", str2);
                    com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "IOException,did you set correct data source? ");
                } catch (IllegalStateException unused4) {
                    int i = this.f;
                    int i2 = this.g;
                    this.f = -1;
                    this.g = -1;
                    this.C.a(this.d, 1, 0);
                    try {
                        JSONObject put2 = new JSONObject().put("playertype", this.e);
                        if (this.n != null) {
                            put2.put("video_url", this.n.b());
                        }
                        put2.put("currentstate", i);
                        put2.put("targetstate", i2);
                        put2.put("errortype", "illegalState");
                        str = put2.toString();
                    } catch (JSONException unused5) {
                        str = "";
                    }
                    com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_play", "play_prepare_error", str);
                    com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "IllegalStateException when preparing");
                    b(false);
                }
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d9d84e46a4eb0827fc9257a606a5ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d9d84e46a4eb0827fc9257a606a5ac");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.start()");
        if (this.f == 0) {
            b();
        } else if ((this.f != 3 || !e()) && q() && !this.h) {
            if (this.a != null) {
                this.d.setVolume(((Float) this.a.first).floatValue(), ((Float) this.a.second).floatValue());
            }
            if (!this.r) {
                a();
            }
            if (this.s > 0.0f && (Build.VERSION.SDK_INT >= 23 || this.e == l.TYPE_IJK || this.e == l.TYPE_XPLAYER)) {
                this.d.setPlayerSpeed(this.s);
                if (this.e == l.TYPE_IJK || this.e == l.TYPE_XPLAYER) {
                    this.d.start();
                }
            } else {
                this.d.start();
            }
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "Method call: MediaPlayer.start()");
            if (p()) {
                this.f = 3;
                b(0, this.f);
            }
            m();
        }
        this.g = 3;
    }

    public boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46601d939498a50b8a6f2ac9392f5abc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46601d939498a50b8a6f2ac9392f5abc")).booleanValue() : this.f == 4 || j();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7951a8e582a8036953cb262657cf5690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7951a8e582a8036953cb262657cf5690");
        } else {
            a(true);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516880152145a020fa6eb48c3c1c13f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516880152145a020fa6eb48c3c1c13f7");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.pause()");
        if (this.f != 4 && q()) {
            this.d.pause();
            n();
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "Method call: MediaPlayer.pause()");
            this.f = 4;
            if (z) {
                h();
            }
        }
        this.g = 4;
        if (this.f == 5) {
            this.f = 6;
        }
        b(0, 4);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4852fa246f31a889247ffd34a898b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4852fa246f31a889247ffd34a898b67");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.seekTo(" + i + CommonConstant.Symbol.BRACKET_RIGHT);
        if (q()) {
            if (i < 0 || i > getDuration()) {
                com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "cann't seek to " + i + ", duration is " + getDuration());
                this.h = false;
                this.j = -1;
                return;
            }
            this.l = i;
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "Method call:MediaPlayer.seekTo(" + i + "),mTargetSeekPos=" + this.l);
            this.h = true;
            this.i = 0;
            this.j = -1;
            a(1, i, getDuration());
            this.d.seekTo(i);
            return;
        }
        this.j = i;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7c44771de4ad60f8607a42dae79f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7c44771de4ad60f8607a42dae79f75");
        } else if (f < 0.0f || f > 1.0f) {
        } else {
            if (q()) {
                a((int) (getDuration() * f));
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: seek to percent " + (f * 100.0f) + "%");
                return;
            }
            this.k = f;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8698731d05369d42f7536f751c7403c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8698731d05369d42f7536f751c7403c")).booleanValue() : q() && this.d.isPlaying();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void setPlaySpeed(@FloatRange(from = 0.0d, to = 6.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc21d5d288102de1fc05d7f58573335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc21d5d288102de1fc05d7f58573335");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.setPlaySpeed()");
        if (f <= 0.0f || f > 6.0f) {
            return;
        }
        if (q() && this.f != 4 && this.f != 6) {
            if ((Build.VERSION.SDK_INT >= 23 || this.e == l.TYPE_IJK || this.e == l.TYPE_XPLAYER) && this.d != null) {
                this.d.setPlayerSpeed(f);
                return;
            }
            return;
        }
        this.s = f;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void a(float f, float f2) {
        boolean z = false;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce6ab6d592249378c4fc81155e668c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce6ab6d592249378c4fc81155e668c4");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.setVolume()");
        this.a = new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        if (Math.abs(f) < 0.001d && Math.abs(f2) < 0.001d) {
            z = true;
        }
        this.r = z;
        if (q()) {
            if (this.d != null) {
                this.d.setVolume(f, f2);
            }
            if (!e() || this.r) {
                return;
            }
            a();
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b403b782337bcad0eea1205f53c2be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b403b782337bcad0eea1205f53c2be");
        } else {
            b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0629cc0eab86f54b1a68069937fefd33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0629cc0eab86f54b1a68069937fefd33");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.reset()");
        n();
        if (this.d != null) {
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "Method call: MediaPlayer.reset()(multi player real reset in thread)");
            if (this.u != null) {
                this.u.a(this.d);
                this.d = null;
            } else {
                this.d.reset();
            }
        }
        if (this.n != null) {
            this.n.e();
            this.n.g();
        }
        r();
        if (z) {
            this.o.removeMessages(0);
            if (this.o.getLooper().getThread() == Thread.currentThread()) {
                b(this.f);
                return;
            }
            final int i = this.f;
            this.o.post(new Runnable() { // from class: com.meituan.android.mtplayer.video.g.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92e97547f39a12b53d45fdf50bc21011", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92e97547f39a12b53d45fdf50bc21011");
                    } else {
                        g.this.b(i);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a8b6ae79aee165d03e54d6b9d19926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a8b6ae79aee165d03e54d6b9d19926");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.release()");
        f();
        if (this.d != null) {
            this.d.release();
            this.d = null;
        }
        h();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public void setLooping(boolean z) {
        this.m = z;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public int getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0133f5f9aa0b8da404a77d0f9640336f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0133f5f9aa0b8da404a77d0f9640336f")).intValue();
        }
        if (q()) {
            return (int) this.d.getDuration();
        }
        return 0;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public int getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab0484f857bf0b282d7b8c9ac9ff90b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab0484f857bf0b282d7b8c9ac9ff90b7")).intValue();
        }
        if (q()) {
            return (int) this.d.getCurrentPosition();
        }
        return 0;
    }
}
