package com.sankuai.meituan.xp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.xp.c;
import com.sankuai.meituan.xp.core.XPlayer;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.meituan.xp.core.codec.MediaCodecSelector;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements c {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean s = false;
    private static volatile boolean t = false;
    public c.a b;
    public XPlayer c;
    com.sankuai.meituan.xp.stat.a d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    boolean j;
    protected Surface k;
    ExecutorService l;
    protected XPlayer.IPlayerCallback m;
    public AppBus.OnBackgroundListener n;
    public AppBus.OnForegroundListener o;
    private Context p;
    private HandlerC0657a q;
    private PowerManager.WakeLock r;

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public long j() {
        return 0L;
    }

    public long k() {
        return 0L;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa955f315240b9df289375e216f0fdca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa955f315240b9df289375e216f0fdca");
            return;
        }
        this.i = true;
        this.l = com.sankuai.android.jarvis.c.a("background-forground-switch", 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), null, new RejectedExecutionHandler() { // from class: com.sankuai.meituan.xp.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Object[] objArr2 = {runnable, threadPoolExecutor};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cb65088c8581c4df5cab92817b4a581", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cb65088c8581c4df5cab92817b4a581");
                } else if (a.this.l.isShutdown()) {
                    a.this.c("rejectedExecution after shutdown");
                } else {
                    a.this.c("rejectedExecution with unknown exception");
                }
            }
        });
        this.m = new XPlayer.IPlayerCallback() { // from class: com.sankuai.meituan.xp.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.xp.core.XPlayer.IPlayerCallback
            public final void postEventFromNative(int i, int i2, int i3, Object obj) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55719fbad23d99a81d82a2302d826b68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55719fbad23d99a81d82a2302d826b68");
                } else {
                    a.this.a(i, i2, i3, obj);
                }
            }

            @Override // com.sankuai.meituan.xp.core.XPlayer.IPlayerCallback
            public final boolean onNativeInvoke(int i, Bundle bundle) {
                Object[] objArr2 = {Integer.valueOf(i), bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60aeae92c0599c2b6212e58fd4e9a41d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60aeae92c0599c2b6212e58fd4e9a41d")).booleanValue() : a.a(a.this, i, bundle);
            }

            @Override // com.sankuai.meituan.xp.core.XPlayer.IPlayerCallback
            public final String onSelectCodec(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc949c525b31050f79ff9b29929dd838", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc949c525b31050f79ff9b29929dd838");
                }
                String selectedCodec = MediaCodecSelector.getSelectedCodec(str, i, i2);
                StringBuilder sb = new StringBuilder("onSelectCodec mimeType: ");
                sb.append(str);
                sb.append(" , profile: ");
                sb.append(i);
                sb.append(" , level: ");
                sb.append(i2);
                sb.append(",codecInfo: ");
                sb.append(selectedCodec);
                a aVar = a.this;
                aVar.c("onSelectCodec mimeType: " + str + " , profile: " + i + " , level: " + i2 + ",codecInfo: " + selectedCodec);
                return selectedCodec;
            }
        };
        this.n = new AppBus.OnBackgroundListener() { // from class: com.sankuai.meituan.xp.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b8967771a0ab605d28c80d26e882b4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b8967771a0ab605d28c80d26e882b4e");
                    return;
                }
                HandlerC0657a handlerC0657a = a.this.q;
                if (handlerC0657a != null) {
                    handlerC0657a.post(new Runnable() { // from class: com.sankuai.meituan.xp.a.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8198c8a57968df97a19835fc1293fb1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8198c8a57968df97a19835fc1293fb1");
                                return;
                            }
                            final a aVar = a.this;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "9b129cad7b28b1cced456e94afc9c815", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "9b129cad7b28b1cced456e94afc9c815");
                                return;
                            }
                            aVar.c("onEnterBackground");
                            aVar.j = true;
                            if (aVar.d != null) {
                                com.sankuai.meituan.xp.stat.a aVar2 = aVar.d;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.xp.stat.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "aa953e8e6b669bbaccefe650b6637cd0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "aa953e8e6b669bbaccefe650b6637cd0");
                                } else {
                                    if (aVar2.p == 0) {
                                        aVar2.p = com.meituan.android.time.c.b();
                                    }
                                    aVar2.o.set(true);
                                }
                            }
                            if (aVar.l != null) {
                                aVar.l.submit(new Runnable() { // from class: com.sankuai.meituan.xp.a.6
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "19b27421c7cbbaf4fef41318e1a0ba56", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "19b27421c7cbbaf4fef41318e1a0ba56");
                                        } else {
                                            a.this.c.resetFrozenStatus();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        };
        this.o = new AppBus.OnForegroundListener() { // from class: com.sankuai.meituan.xp.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
            public final void onForeground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa0a842eabaa4e0288566d18c09276f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa0a842eabaa4e0288566d18c09276f9");
                    return;
                }
                HandlerC0657a handlerC0657a = a.this.q;
                if (handlerC0657a != null) {
                    handlerC0657a.post(new Runnable() { // from class: com.sankuai.meituan.xp.a.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "673d127792f31dd781a189dd937a913b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "673d127792f31dd781a189dd937a913b");
                                return;
                            }
                            final a aVar = a.this;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "7e477f08a7696a4db30bb994af910d31", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "7e477f08a7696a4db30bb994af910d31");
                                return;
                            }
                            aVar.c("onEnterForeground");
                            aVar.j = false;
                            if (aVar.l != null) {
                                aVar.l.submit(new Runnable() { // from class: com.sankuai.meituan.xp.a.7
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ffce2a6311ff6dab21db79eb8112f2da", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ffce2a6311ff6dab21db79eb8112f2da");
                                            return;
                                        }
                                        if (a.this.c != null) {
                                            a.this.c.resetFrozenStatus();
                                        }
                                        if (a.this.d != null) {
                                            com.sankuai.meituan.xp.stat.a aVar2 = a.this.d;
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.xp.stat.a.a;
                                            if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "3a346989fd3567183f445fb31f4c55c2", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "3a346989fd3567183f445fb31f4c55c2");
                                                return;
                                            }
                                            if (aVar2.p > 0) {
                                                aVar2.q += com.meituan.android.time.c.b() - aVar2.p;
                                                aVar2.p = 0L;
                                            }
                                            aVar2.o.set(false);
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        };
    }

    public static /* synthetic */ void a(a aVar, Message message) {
        boolean a2;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7ad37ceaa87a6d5004b2d099ef5f8246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7ad37ceaa87a6d5004b2d099ef5f8246");
            return;
        }
        com.sankuai.meituan.xp.stat.a aVar2 = aVar.d;
        int i = message.what;
        int i2 = message.arg2;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.xp.stat.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "fc37ace6b89b0bd79c0d2786d2ef595b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "fc37ace6b89b0bd79c0d2786d2ef595b");
        } else {
            aVar2.a("", "MEDIA_ERROR", "Error (" + i + CommonConstant.Symbol.COMMA + i2 + CommonConstant.Symbol.BRACKET_RIGHT);
            StringBuilder sb = new StringBuilder("firstCode:");
            sb.append(i);
            sb.append(",secondCode:");
            sb.append(i2);
            String sb2 = sb.toString();
            Object[] objArr3 = {"error", sb2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.xp.stat.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "7fecbc92c52b7c9caffe4530103757ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "7fecbc92c52b7c9caffe4530103757ff");
            } else if (aVar2.g()) {
                com.sankuai.meituan.mtliveqos.c.b(aVar2.c, aVar2.a(false), "error", sb2);
            }
            aVar2.d();
        }
        int i3 = message.arg1;
        int i4 = message.arg2;
        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "80e5e9f5651c2f151c1aea7a8b0a9ff3", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "80e5e9f5651c2f151c1aea7a8b0a9ff3")).booleanValue();
        } else {
            aVar.c("Error (" + i3 + CommonConstant.Symbol.COMMA + i4 + CommonConstant.Symbol.BRACKET_RIGHT);
            if (NetWorkUtils.isNetworkConnected(aVar.p) && i4 == -20001) {
                s = true;
                t = true;
            }
            aVar.c(false);
            Bundle bundle = new Bundle();
            bundle.putInt("what", i3);
            bundle.putInt("extra", i4);
            a2 = aVar.a(1005, bundle);
        }
        if (a2) {
            return;
        }
        aVar.l();
    }

    public static /* synthetic */ boolean a(a aVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "07d19dfa0165c17ffcf002140c1e8608", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "07d19dfa0165c17ffcf002140c1e8608")).booleanValue();
        }
        aVar.c("notifyOnInfo (" + i + CommonConstant.Symbol.COMMA + i2 + CommonConstant.Symbol.BRACKET_RIGHT);
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        aVar.a(1003, bundle);
        return true;
    }

    public static /* synthetic */ boolean a(a aVar, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8f817c1e89318571c8c372b42d0a8cba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8f817c1e89318571c8c372b42d0a8cba")).booleanValue();
        }
        com.sankuai.meituan.xp.stat.a aVar2 = aVar.d;
        Object[] objArr2 = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.xp.stat.a.a;
        if (!PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "470cfe372963c9ad0992d2f6efd6fe4a", RobustBitConfig.DEFAULT_VALUE)) {
            switch (i) {
                case 10:
                    String string = bundle.getString(com.sankuai.xm.im.message.bean.Message.SID);
                    new StringBuilder("onNativeInvoke: AVAPP_EVENT_DID_GET_SID =  ").append(string);
                    aVar2.e = string;
                    break;
                case 11:
                    long j = bundle.getLong("DNSCost");
                    new StringBuilder("onNativeInvoke: AVAPP_EVENT_DID_DNS =  ").append(j);
                    aVar2.f = j;
                    break;
                case XPlayerConstants.FFP_MSG_VIDEO_FROZEN_STARTED /* 420 */:
                case XPlayerConstants.FFP_MSG_VIDEO_FROZEN_ENDED /* 421 */:
                case XPlayerConstants.FFP_MSG_VIDEO_BUFFER_EMPTY /* 422 */:
                case XPlayerConstants.FFP_MSG_VIDEO_BUFFER_FILLED /* 423 */:
                case XPlayerConstants.FFP_MSG_AUDIO_FROZEN_STARTED /* 430 */:
                case XPlayerConstants.FFP_MSG_AUDIO_FROZEN_ENDED /* 431 */:
                case XPlayerConstants.FFP_MSG_AUDIO_BUFFER_EMPTY /* 432 */:
                case XPlayerConstants.FFP_MSG_AUDIO_BUFFER_FILLED /* 433 */:
                    long j2 = bundle.getLong("arg1");
                    Object[] objArr3 = {Integer.valueOf(i), new Long(j2), new Long(bundle.getLong("arg2"))};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.xp.stat.a.a;
                    if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "af1145f4f250b4a0465c21ee4c316f93", RobustBitConfig.DEFAULT_VALUE)) {
                        if (aVar2.g()) {
                            if (i != 432) {
                                switch (i) {
                                    case XPlayerConstants.FFP_MSG_VIDEO_BUFFER_EMPTY /* 422 */:
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap.put("MTLIVE_VIDEO_FROZEN_BUFFER", Float.valueOf((float) j2));
                                        aVar2.a(hashMap, hashMap2);
                                        break;
                                }
                            } else {
                                HashMap hashMap3 = new HashMap();
                                HashMap hashMap4 = new HashMap();
                                hashMap3.put("MTLIVE_AUDIO_FROZEN_BUFFER", Float.valueOf((float) j2));
                                aVar2.a(hashMap3, hashMap4);
                                break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "af1145f4f250b4a0465c21ee4c316f93");
                        break;
                    }
                    break;
                case 131074:
                    Object[] objArr4 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.xp.stat.a.a;
                    if (!PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "5ec9b49f11297c2d7cef27e6ffa9b235", RobustBitConfig.DEFAULT_VALUE)) {
                        String string2 = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                        if (!TextUtils.isEmpty(string2)) {
                            aVar2.i = string2 + CommonConstant.Symbol.COLON + bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "5ec9b49f11297c2d7cef27e6ffa9b235");
                        break;
                    }
                    break;
                case XPlayerConstants.AVAPP_CTRL_LOGAN /* 131081 */:
                    Object[] objArr5 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.xp.stat.a.a;
                    if (!PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "e0b22f1d329a79acb702685f5ef01c0a", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2.a(bundle);
                        Object[] objArr6 = {bundle};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.xp.stat.a.a;
                        if (!PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "4169e96e9bdf4056ea503e3061c74779", RobustBitConfig.DEFAULT_VALUE)) {
                            if (aVar2.g()) {
                                String string3 = bundle.getString("description");
                                new StringBuilder("reportNdkEvent2Es: ").append(string3);
                                com.sankuai.meituan.mtliveqos.c.a(aVar2.c, aVar2.a(false), aVar2.hashCode() + "_xplayer_ndk_event", "personal_case_ " + string3);
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "4169e96e9bdf4056ea503e3061c74779");
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "e0b22f1d329a79acb702685f5ef01c0a");
                        break;
                    }
                    break;
            }
        } else {
            ((Boolean) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "470cfe372963c9ad0992d2f6efd6fe4a")).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ long e(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "49dd09eace1eb11d4e6b6a2764cbcba2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "49dd09eace1eb11d4e6b6a2764cbcba2")).longValue() : aVar.c.getNativeMediaPlayer();
    }

    public static /* synthetic */ void f(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "9c4c030dee30fc94f69978f5d10e151c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "9c4c030dee30fc94f69978f5d10e151c");
            return;
        }
        aVar.c("onPrepared");
        aVar.d.b(true);
        aVar.a(1001, new Bundle());
    }

    public static /* synthetic */ void h(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b03785d4fb9208f576632598ffbf6b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b03785d4fb9208f576632598ffbf6b44");
            return;
        }
        aVar.c("notifyOnVideoSizeChanged width: " + aVar.e + "，height: " + aVar.f + "，sarNum: " + aVar.g + "，sarDen: " + aVar.h);
        Bundle bundle = new Bundle();
        bundle.putInt("videoWidth", aVar.e);
        bundle.putInt("videoHeight", aVar.f);
        bundle.putInt("videoSarNum", aVar.g);
        bundle.putInt("videoSarDen", aVar.h);
        com.sankuai.meituan.xp.stat.a aVar2 = aVar.d;
        int i = aVar.e;
        int i2 = aVar.f;
        aVar2.k = i;
        aVar2.l = i2;
        aVar.a(1002, bundle);
    }

    static {
        com.sankuai.android.jarvis.c.a("mediaCodecSelect", new Runnable() { // from class: com.sankuai.meituan.xp.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864fc898e7a81dab8b61947b422c9c55", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864fc898e7a81dab8b61947b422c9c55");
                    return;
                }
                boolean unused = a.s = TextUtils.isEmpty(MediaCodecSelector.getSelectedCodec("video/avc", 0, 0));
                boolean unused2 = a.t = TextUtils.isEmpty(MediaCodecSelector.getSelectedCodec("video/hevc", 0, 0));
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, Object obj) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3e250993dd0bee0b86924eb64e1088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3e250993dd0bee0b86924eb64e1088");
            return;
        }
        this.d.a(i, i2, i3, obj);
        this.q.sendMessage(this.q.obtainMessage(i, i2, i3, obj));
    }

    public final void a(Context context, XPlayer xPlayer, com.sankuai.meituan.xp.stat.a aVar) {
        Object[] objArr = {context, xPlayer, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa23521a049bc0489a294a1da8f2317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa23521a049bc0489a294a1da8f2317");
            return;
        }
        this.p = context.getApplicationContext();
        this.c = xPlayer;
        this.d = aVar;
        c("init");
        this.q = new HandlerC0657a(this, Looper.getMainLooper());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d713b6684df818bcf79df9eb28ff241b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d713b6684df818bcf79df9eb28ff241b");
        } else {
            this.r = ((PowerManager) this.p.getSystemService("power")).newWakeLock(536870913, d.class.getName());
            this.r.setReferenceCounted(false);
            this.r.acquire();
        }
        XPlayer.native_setLogLevel(3);
        AppBus.getInstance().register(this.n);
        AppBus.getInstance().register(this.o);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734a5e77121d9fd211030889723c01ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734a5e77121d9fd211030889723c01ba");
        } else if (this.d != null) {
            this.d.h = str;
        }
    }

    public final void b(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc8986522d289140b530f96b45cdee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc8986522d289140b530f96b45cdee8");
            return;
        }
        c("setDataSource: " + str);
        this.d.j = str;
        this.c._setDataSource(str, null, null);
    }

    public void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e489c39f54f4ce0b24654a43adbe73ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e489c39f54f4ce0b24654a43adbe73ca");
            return;
        }
        c("prepareAsync");
        this.d.b(false);
        if (!s && this.i) {
            a(4, "mediacodec", 1L);
        }
        if (!t && this.i) {
            a(4, "mediacodec-hevc", 1L);
        }
        if ((!s || !t) && this.i) {
            a(4, "mediacodec-auto-rotate", 1L);
            a(4, "mediacodec-handle-resolution-change", 1L);
        }
        a(4, "framedrop", 1L);
        a(1, "http-detect-range-support", 0L);
        a(2, "skip_loop_filter", 48L);
        a(4, "soundtouch", 1L);
        this.c._prepareAsync();
    }

    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b16548a84a984d9a3c38bb9350c3671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b16548a84a984d9a3c38bb9350c3671");
        } else {
            this.c._setVolume(f, f2);
        }
    }

    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeff78a9922dd2f70fcf1ccab089371c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeff78a9922dd2f70fcf1ccab089371c");
            return;
        }
        c("start, mIsBackground:" + this.j);
        if (!this.j) {
            this.d.a();
        }
        c(true);
        this.c._start();
    }

    public final void c() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca06a9fce660ac21766c859d5340165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca06a9fce660ac21766c859d5340165");
            return;
        }
        c("pause");
        this.d.b();
        c(false);
        this.c._pause();
    }

    public void d() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4011a681fcd17dce34d823b6c2916b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4011a681fcd17dce34d823b6c2916b57");
            return;
        }
        c("stop");
        this.d.c();
        c(false);
        this.c._stop();
    }

    @SuppressLint({"Wakelock"})
    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4511410e95b405f22106037416abfdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4511410e95b405f22106037416abfdb5");
        } else if (this.r != null) {
            if (z && !this.r.isHeld()) {
                this.r.acquire();
            } else if (z || !this.r.isHeld()) {
            } else {
                this.r.release();
            }
        }
    }

    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a314a93393f001b624a281532e2a5702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a314a93393f001b624a281532e2a5702");
            return;
        }
        c("setSurface :" + surface);
        this.k = surface;
        this.c._setVideoSurface(surface);
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c231b76cc5815b4a319656859c7b389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c231b76cc5815b4a319656859c7b389");
            return;
        }
        c("release");
        this.b = null;
        this.d.d();
        this.q.removeCallbacksAndMessages(null);
        c(false);
        this.c.release();
        AppBus.getInstance().unregister(this.n);
        AppBus.getInstance().unregister(this.o);
        this.l.shutdownNow();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d5b99a7ff1272d247c4f8b7349ab13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d5b99a7ff1272d247c4f8b7349ab13");
            return;
        }
        c("reset");
        c(false);
        this.d.e();
        this.d.d();
        this.c._reset();
        this.q.removeCallbacksAndMessages(null);
    }

    public final void a(int i, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162a433f74f108ea976640c785da9df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162a433f74f108ea976640c785da9df4");
            return;
        }
        com.sankuai.meituan.xp.stat.a aVar = this.d;
        aVar.a("setOption:" + str + ", value: " + j);
        this.c._setOption(i, str, j);
    }

    public final void a(HashMap<String, Float> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac99f282a105dd6ec34473691e04d347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac99f282a105dd6ec34473691e04d347");
        } else {
            this.d.a(hashMap, (Map<String, String>) null);
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab650006dd28c1a14ea19cbea8667ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab650006dd28c1a14ea19cbea8667ea");
        } else {
            this.d.a(str, str2, str3);
        }
    }

    public final long a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f87f425384f2844fa8b6a82508a16f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f87f425384f2844fa8b6a82508a16f")).longValue() : this.c.getPropertyLong(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.xp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class HandlerC0657a extends Handler {
        public static ChangeQuickRedirect a;
        private final WeakReference<a> b;

        public HandlerC0657a(a aVar, Looper looper) {
            super(looper);
            Object[] objArr = {aVar, looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca488df56b70908a76bb9c4a7cca0e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca488df56b70908a76bb9c4a7cca0e6");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a3b7b3ca99a739f09c4958110dc4a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a3b7b3ca99a739f09c4958110dc4a0");
                return;
            }
            a aVar = this.b.get();
            if (aVar == null || a.e(aVar) == 0) {
                return;
            }
            switch (message.what) {
                case 1:
                    a.f(aVar);
                    return;
                case 2:
                    aVar.l();
                    return;
                case 4:
                    aVar.g();
                    return;
                case 5:
                    aVar.e = message.arg1;
                    aVar.f = message.arg2;
                    a.h(aVar);
                    return;
                case 100:
                    a.a(aVar, message);
                    return;
                case 200:
                    a.a(aVar, message.arg1, message.arg2);
                    if (701 == message.arg1) {
                        aVar.i();
                        return;
                    } else if (702 == message.arg1) {
                        aVar.h();
                        return;
                    } else {
                        return;
                    }
                case 10001:
                    aVar.g = message.arg1;
                    aVar.h = message.arg2;
                    a.h(aVar);
                    return;
                default:
                    new StringBuilder("Unknown message type ").append(message.what);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0792b411f11c407fa178820f6747cf07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0792b411f11c407fa178820f6747cf07");
            return;
        }
        c("onCompletion");
        this.d.c();
        a(1004, new Bundle());
        c(false);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fdc600b7f627e0bafa7ac58074295cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fdc600b7f627e0bafa7ac58074295cb");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", hashCode:");
        sb.append(hashCode());
        this.d.a("XPlayer", "", str);
        this.d.a(str);
    }

    public final boolean a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414d2c4801eb5dacf9b87f9910fc15e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414d2c4801eb5dacf9b87f9910fc15e2")).booleanValue();
        }
        if (this.b != null) {
            this.b.a(i, bundle);
        }
        return true;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27affe2839f9a3899566e6f2b4c2ffdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27affe2839f9a3899566e6f2b4c2ffdf");
        } else {
            this.d.a(i);
        }
    }
}
