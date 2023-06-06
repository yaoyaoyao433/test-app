package com.meituan.android.customerservice.callbase.avengine;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.utils.CallBaseUtil;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callbase.utils.Timer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final int A;
    private final int B;
    private final int C;
    private Object D;
    public RtcEngine b;
    public Context c;
    List<Object> d;
    List<Object> e;
    public List<e> f;
    d g;
    public com.meituan.android.customerservice.callbase.avengine.a h;
    public f i;
    public Timer j;
    public boolean k;
    c l;
    public String m;
    Handler n;
    public boolean o;
    public AtomicInteger p;
    public Map<Integer, com.meituan.android.customerservice.callbase.base.a> q;
    public Map<Integer, com.meituan.android.customerservice.callbase.base.a> r;
    Map<Integer, Integer> s;
    public int t;
    public int u;
    public boolean v;
    public final IRtcEngineEventHandler w;
    private final String x;
    private boolean y;
    private final int z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c {
        public String a;
        public String b;
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface e {
        void a(String str, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface f {
        void a(int i, int i2, int i3);
    }

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4232b4e087a25f52a22262c3995da909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4232b4e087a25f52a22262c3995da909");
            return;
        }
        if (i != 3 && i != 7 && i != 19 && i != 110) {
            switch (i) {
                case 101:
                case 102:
                    break;
                default:
                    switch (i) {
                        case 1001:
                        case 1002:
                            break;
                        default:
                            return;
                    }
            }
        }
        if (bVar.h != null) {
            bVar.h.onError(i);
            bVar.h = null;
        } else if (bVar.f != null && !bVar.f.isEmpty()) {
            for (e eVar : bVar.f) {
                eVar.a("通话异常", i);
            }
        }
        if (bVar.j != null) {
            bVar.j.cancel(2001);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b();

        public static /* synthetic */ b a() {
            return a;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9703da0b1a2a0b0941508e36f09f79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9703da0b1a2a0b0941508e36f09f79");
            return;
        }
        this.x = "AVEngine";
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.h = null;
        this.i = null;
        this.k = false;
        this.y = false;
        this.l = new c();
        this.n = new Handler(CallHandleWorker.getInstance().getLooper());
        this.o = false;
        this.z = 0;
        this.A = 1;
        this.B = 2;
        this.C = 3;
        this.p = new AtomicInteger(0);
        this.t = 0;
        this.u = 0;
        this.w = new IRtcEngineEventHandler() { // from class: com.meituan.android.customerservice.callbase.avengine.b.2
            public static ChangeQuickRedirect a;

            {
                b.this = this;
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onUserJoined(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c862939615e3c856bc2e6b32c6d768dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c862939615e3c856bc2e6b32c6d768dd");
                    return;
                }
                CallLog.log("AVEngine", "onUserJoined " + i);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onUserOffline(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7dc9a1733b281b462ff6330e1ef77be8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7dc9a1733b281b462ff6330e1ef77be8");
                    return;
                }
                CallLog.log("AVEngine", "onUserOffline " + (i & 4294967295L) + StringUtil.SPACE + i2);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
                Object[] objArr2 = {audioVolumeInfoArr, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15f7dd1ad387bc07b821ca0b7561a370", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15f7dd1ad387bc07b821ca0b7561a370");
                } else if (audioVolumeInfoArr == null || audioVolumeInfoArr.length <= 0) {
                    if (b.this.e == null || b.this.e.isEmpty()) {
                        return;
                    }
                    Iterator<Object> it = b.this.e.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                } else if (b.this.e != null && !b.this.e.isEmpty()) {
                    com.meituan.android.customerservice.callbase.avengine.c[] cVarArr = new com.meituan.android.customerservice.callbase.avengine.c[audioVolumeInfoArr.length];
                    for (int i2 = 0; i2 < audioVolumeInfoArr.length; i2++) {
                        com.meituan.android.customerservice.callbase.avengine.c cVar = new com.meituan.android.customerservice.callbase.avengine.c();
                        cVar.a = audioVolumeInfoArr[i2].uid;
                        cVar.b = audioVolumeInfoArr[i2].volume;
                        cVarArr[i2] = cVar;
                    }
                    Iterator<Object> it2 = b.this.e.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onUserMuteAudio(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cf217cefe71c65f3ffa6156f40edecb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cf217cefe71c65f3ffa6156f40edecb");
                } else if (!z || b.this.e == null || b.this.e.isEmpty()) {
                } else {
                    final com.meituan.android.customerservice.callbase.avengine.c cVar = new com.meituan.android.customerservice.callbase.avengine.c();
                    cVar.a = i;
                    cVar.b = 0;
                    b.this.n.postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.callbase.avengine.b.2.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass2.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d7d8d359440bdcad8548a00b92597e13", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d7d8d359440bdcad8548a00b92597e13");
                                return;
                            }
                            Iterator<Object> it = b.this.e.iterator();
                            while (it.hasNext()) {
                                it.next();
                                new com.meituan.android.customerservice.callbase.avengine.c[1][0] = cVar;
                            }
                        }
                    }, 1000L);
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
                Object[] objArr2 = {rtcStats};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd88a788144b46e377b0e086f3625a89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd88a788144b46e377b0e086f3625a89");
                    return;
                }
                CallLog.log("AVEngine", "onLeaveChannel " + rtcStats.totalDuration);
                CallHandleWorker.getInstance().post(new Runnable() { // from class: com.meituan.android.customerservice.callbase.avengine.b.2.2
                    public static ChangeQuickRedirect a;

                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d01cf20b62c83e75e9d7f8e50c549ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d01cf20b62c83e75e9d7f8e50c549ca");
                        } else {
                            b.this.e();
                        }
                    }
                });
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onLastmileQuality(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bec683cb877c49f491c1377f1c88e88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bec683cb877c49f491c1377f1c88e88");
                    return;
                }
                CallLog.log("AVEngine", "onLastmileQuality " + i);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac2b774f209a3e1e437b0bf25c181c42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac2b774f209a3e1e437b0bf25c181c42");
                    return;
                }
                CallLog.log("AVEngine", "onError " + i);
                b.a(b.this, i);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onNetworkQuality(int i, int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cceed814e62eda0deb6295affb4664f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cceed814e62eda0deb6295affb4664f");
                } else if (b.this.i != null) {
                    b.this.i.a(i, i2, i3);
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onConnectionLost() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "344470b0b448d2205f2a6dfab70d01d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "344470b0b448d2205f2a6dfab70d01d4");
                    return;
                }
                CallLog.log("AVEngine", "onConnectionLost");
                if (b.this.f == null || b.this.f.isEmpty()) {
                    return;
                }
                for (e eVar : b.this.f) {
                    eVar.a("网络异常", 112);
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onAudioQuality(int i, int i2, short s, short s2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Short.valueOf(s), Short.valueOf(s2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6e34ee27c07680ed30f3b71e9aa1cfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6e34ee27c07680ed30f3b71e9aa1cfe");
                    return;
                }
                if (b.this.g != null) {
                    new C0236b(i, i2, s, s2);
                }
                b.this.l.a = String.valueOf(i2);
                b.this.l.b = String.valueOf((int) s);
                b.this.l.c = String.valueOf((int) s2);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onConnectionStateChanged(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d20f8ecfb5016b08ec2cb4162ed7e71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d20f8ecfb5016b08ec2cb4162ed7e71");
                    return;
                }
                super.onConnectionStateChanged(i, i2);
                CallLog.log("AVEngine", "onConnectionStateChanged for agora " + i + " reason " + i2);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
                Object[] objArr2 = {remoteAudioStats};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4132c064c9bc50b6f1d827e9f9f12351", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4132c064c9bc50b6f1d827e9f9f12351");
                } else if (remoteAudioStats == null) {
                } else {
                    if (remoteAudioStats.quality >= 4 && remoteAudioStats.totalFrozenTime >= 10000) {
                        b.this.q.put(Integer.valueOf(remoteAudioStats.uid), new com.meituan.android.customerservice.callbase.base.a(remoteAudioStats.quality, remoteAudioStats.networkTransportDelay, remoteAudioStats.jitterBufferDelay, remoteAudioStats.audioLossRate, remoteAudioStats.frozenRate));
                        b.this.t = remoteAudioStats.frozenRate > b.this.t ? remoteAudioStats.frozenRate : b.this.t;
                    }
                    if (remoteAudioStats.networkTransportDelay <= 150) {
                        if (b.this.s.containsKey(Integer.valueOf(remoteAudioStats.uid))) {
                            b.this.s.remove(Integer.valueOf(remoteAudioStats.uid));
                            return;
                        }
                        return;
                    }
                    b.this.s.put(Integer.valueOf(remoteAudioStats.uid), Integer.valueOf(b.this.s.containsKey(Integer.valueOf(remoteAudioStats.uid)) ? 1 + b.this.s.get(Integer.valueOf(remoteAudioStats.uid)).intValue() : 1));
                    if (b.this.s.get(Integer.valueOf(remoteAudioStats.uid)).intValue() >= 3) {
                        b.this.r.put(Integer.valueOf(remoteAudioStats.uid), new com.meituan.android.customerservice.callbase.base.a(remoteAudioStats.quality, remoteAudioStats.networkTransportDelay, remoteAudioStats.jitterBufferDelay, remoteAudioStats.audioLossRate, remoteAudioStats.frozenRate));
                        b.this.u = remoteAudioStats.networkTransportDelay > b.this.u ? remoteAudioStats.networkTransportDelay : b.this.u;
                        b.this.s.remove(Integer.valueOf(remoteAudioStats.uid));
                    }
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onJoinChannelSuccess(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af42f392672049e0a494869c2a49f4e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af42f392672049e0a494869c2a49f4e4");
                    return;
                }
                CallLog.log("AVEngine", "onJoinChannelSuccess " + str + StringUtil.SPACE + (i & 4294967295L) + StringUtil.SPACE + i2);
                if (b.this.h != null) {
                    b.this.h.onSuccess(str, i);
                    b.this.h = null;
                }
                if (b.this.j != null) {
                    b.this.j.cancel(2001);
                }
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onRejoinChannelSuccess(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ba17a1ea2ac3001a2c7c3fa2086b8ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ba17a1ea2ac3001a2c7c3fa2086b8ea");
                    return;
                }
                CallLog.log("AVEngine", "onRejoinChannelSuccess " + str + StringUtil.SPACE + (i & 4294967295L) + StringUtil.SPACE + i2);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onWarning(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e778712cdd160903731b877889c1126a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e778712cdd160903731b877889c1126a");
                    return;
                }
                CallLog.log("AVEngine", "onWarning " + i);
            }

            @Override // io.agora.rtc.IRtcEngineEventHandler
            public final void onAudioRouteChanged(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60bde83b2b4271763b67a78ad6bd081c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60bde83b2b4271763b67a78ad6bd081c");
                    return;
                }
                CallLog.log("AVEngine", "onAudioRouteChanged " + i);
                if (i == 5) {
                    b.this.k = true;
                }
                if (b.this.d == null || b.this.d.size() <= 0) {
                    return;
                }
                Iterator<Object> it = b.this.d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        };
        this.D = new Object();
        this.q = new HashMap();
        this.r = new HashMap();
        this.s = new HashMap();
    }

    public final RtcEngine a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bfecdefc63af04904cf9f95434501d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RtcEngine) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bfecdefc63af04904cf9f95434501d");
        }
        synchronized (this.D) {
            if (!this.p.compareAndSet(0, 1)) {
                return this.b;
            }
            if (this.b == null) {
                CallLog.log("AVEngine", "init rtcengine fist time");
                try {
                    this.b = RtcEngine.create(this.c, this.m, this.w);
                    this.b.setChannelProfile(1);
                    this.b.setClientRole(1);
                    this.b.enableAudioVolumeIndication(300, 3, false);
                    this.b.setLogFileSize(1024);
                    if (!TextUtils.isEmpty(CallBaseUtil.getCachePath(this.c, null))) {
                        RtcEngine rtcEngine = this.b;
                        rtcEngine.setLogFile(CallBaseUtil.getCachePath(this.c, null) + "/callLog-agora-rtc.log");
                    }
                    this.j = new Timer(new Timer.TimeoutCallback() { // from class: com.meituan.android.customerservice.callbase.avengine.b.1
                        public static ChangeQuickRedirect a;

                        {
                            b.this = this;
                        }

                        @Override // com.meituan.android.customerservice.callbase.utils.Timer.TimeoutCallback
                        public final void onTimeout(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11ba14df7d8702d0715d9686bdd54182", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11ba14df7d8702d0715d9686bdd54182");
                                return;
                            }
                            if (b.this.h != null) {
                                b.this.h.onError(3);
                                b.this.h = null;
                            }
                            b.this.j.cancel(2001);
                        }
                    });
                    CallLog.log("AVEngine", "init rtcengine complete");
                } catch (Exception e2) {
                    CallLog.error("AVEngine", "NEED TO check rtc sdk init fatal error\n" + e2);
                    throw new RuntimeException("NEED TO check rtc sdk init fatal error\n");
                }
            }
            this.p.set(2);
            return this.b;
        }
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53338d3c7bd73d45449b6d50b79feac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53338d3c7bd73d45449b6d50b79feac");
            return;
        }
        CallLog.log("AVEngine", "setSpeakerOn " + z);
        if (!this.v) {
            ((AudioManager) this.c.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(z);
            return;
        }
        a();
        this.b.setEnableSpeakerphone(z);
    }

    public final synchronized boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95249a5a898a347a0a17784d05d58837", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95249a5a898a347a0a17784d05d58837")).booleanValue();
        }
        a();
        CallLog.log("AVEngine", "getSpeakerOn " + this.b.isSpeakerphoneEnabled());
        return this.b.isSpeakerphoneEnabled();
    }

    public final synchronized void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253bf7fa5caad50e7184ec5c83b780ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253bf7fa5caad50e7184ec5c83b780ec");
            return;
        }
        a();
        this.o = z;
        this.b.muteLocalAudioStream(z);
        CallLog.log("AVEngine", "setMute " + z);
    }

    public final synchronized boolean c() {
        return this.o;
    }

    public HashMap<String, Object> a(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "215ee829f37fb1111def9f821054ea6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "215ee829f37fb1111def9f821054ea6c");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, str);
        hashMap.put("vcid", str2);
        if (obj != null) {
            hashMap.put("remoteUids", obj);
        }
        return hashMap;
    }

    public final synchronized void d() {
        this.h = null;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f14266f3c39c8a99e5b7dcfc792e685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f14266f3c39c8a99e5b7dcfc792e685");
            return;
        }
        synchronized (this.D) {
            CallLog.log("AVEngine", "AVengine ondestroy  start " + this.p.get());
            if (this.p.get() != 3 && this.p.get() != 0) {
                this.p.set(3);
                if (this.b != null) {
                    this.h = null;
                    RtcEngine.destroy();
                    this.b = null;
                }
                this.o = false;
                CallLog.log("AVEngine", "AVengine ondestroy  complete!");
                this.p.set(0);
            }
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c058e190195ec7ed5cd36dee627b632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c058e190195ec7ed5cd36dee627b632");
        } else if (this.f.contains(eVar)) {
            this.f.remove(eVar);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.callbase.avengine.b$b */
    /* loaded from: classes2.dex */
    public class C0236b {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public short d;
        public short e;

        public C0236b(int i, int i2, short s, short s2) {
            b.this = r11;
            Object[] objArr = {r11, Integer.valueOf(i), Integer.valueOf(i2), Short.valueOf(s), Short.valueOf(s2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffce731adff24b27ce56e60960c5777", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffce731adff24b27ce56e60960c5777");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = s;
            this.e = s2;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a86ef662e4eb07c3cb8eb9909e7093", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a86ef662e4eb07c3cb8eb9909e7093");
            }
            return "uid" + this.b + ", quality " + this.c + ", delay " + ((int) this.d) + ", lost " + ((int) this.e);
        }
    }
}
