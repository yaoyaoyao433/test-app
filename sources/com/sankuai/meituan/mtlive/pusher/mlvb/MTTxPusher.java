package com.sankuai.meituan.mtlive.pusher.mlvb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.pusher.library.MTLivePusherView;
import com.sankuai.meituan.mtlive.pusher.library.c;
import com.sankuai.meituan.mtlive.pusher.library.f;
import com.sankuai.meituan.mtlive.pusher.library.i;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.e;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxPusher implements com.sankuai.meituan.mtlive.pusher.library.b<MTTxPusherConfig> {
    public static ChangeQuickRedirect a;
    private a b;
    private TXLivePusher c;
    private f d;
    private c e;
    private boolean f;
    private TXCloudVideoView g;
    private String h;
    private String i;
    private String j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private long o;
    private String p;
    private Context q;
    private c.d r;
    @SuppressLint({"HandlerLeak"})
    private Handler s;

    public static /* synthetic */ void f(MTTxPusher mTTxPusher) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPusher, changeQuickRedirect, false, "c5aaf613374b3241a7cb4d2683c8a364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPusher, changeQuickRedirect, false, "c5aaf613374b3241a7cb4d2683c8a364");
        } else if (mTTxPusher.l) {
        } else {
            mTTxPusher.l = true;
            long currentTimeMillis = System.currentTimeMillis() - mTTxPusher.o;
            long currentTimeMillis2 = System.currentTimeMillis() - mTTxPusher.k;
            HashMap hashMap = new HashMap();
            hashMap.put("MTLIVE_SOCKET_CONNECT_COMPLETED", Float.valueOf((float) currentTimeMillis));
            hashMap.put("MTLIVE_HANDSHAKE", Float.valueOf((float) currentTimeMillis2));
            e.a(mTTxPusher.q, mTTxPusher.a(), hashMap, (Map<String, String>) null);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final /* synthetic */ void a(MTTxPusherConfig mTTxPusherConfig) {
        MTTxPusherConfig mTTxPusherConfig2 = mTTxPusherConfig;
        Object[] objArr = {mTTxPusherConfig2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c85ccdc6be5269131ca47b1c509d25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c85ccdc6be5269131ca47b1c509d25");
            return;
        }
        this.d = mTTxPusherConfig2;
        if (mTTxPusherConfig2 != null) {
            this.c.setConfig(mTTxPusherConfig2.b);
        } else {
            this.c.setConfig(null);
        }
    }

    public MTTxPusher(final Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859658ad05e44732371fbfaa483c7faf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859658ad05e44732371fbfaa483c7faf");
            return;
        }
        this.m = 1000;
        this.n = 10000;
        this.r = c.d.SOFTWARE;
        this.s = new Handler() { // from class: com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2cdbf464fb28e5773626ddaa944a4e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2cdbf464fb28e5773626ddaa944a4e6");
                    return;
                }
                super.handleMessage(message);
                long b = com.meituan.android.time.c.b();
                String str = "SEI_PushTS_" + b;
                long a2 = com.meituan.android.time.c.a();
                if (MTTxPusher.this.e()) {
                    e.a(MTTxPusher.this.q, MTTxPusher.this.a(), c.b.MTLIVE_EVENT_SYNC_CLOCK.C, b + CommonConstant.Symbol.UNDERLINE + a2, null);
                    MTTxPusher.this.a(str.getBytes());
                }
                MTTxPusher.this.s.sendEmptyMessageDelayed(MTTxPusher.this.m, MTTxPusher.this.n);
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        this.p = sb.toString();
        this.q = context;
        this.c = new TXLivePusher(context);
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca50aa823bed677cd459a5156dc61455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca50aa823bed677cd459a5156dc61455");
        } else {
            this.c.setPushListener(new ITXLivePushListener() { // from class: com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.ITXLivePushListener
                public final void onPushEvent(int i2, Bundle bundle) {
                    Object[] objArr3 = {Integer.valueOf(i2), bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7adb0684a5dfdc53630f4b033c334df5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7adb0684a5dfdc53630f4b033c334df5");
                        return;
                    }
                    MTTxPusher mTTxPusher = MTTxPusher.this;
                    mTTxPusher.a("onPushEvent", "eventCode " + i2 + " param = " + bundle.getString("EVT_MSG", "没有任何信息"));
                    if (i2 == 1001) {
                        MTTxPusher.this.k = System.currentTimeMillis();
                    } else if (i2 == 1002) {
                        MTTxPusher.f(MTTxPusher.this);
                    } else if (i2 == 1102) {
                        Context context2 = MTTxPusher.this.q;
                        com.sankuai.meituan.mtliveqos.statistic.b a2 = MTTxPusher.this.a();
                        c.b bVar = c.b.MTLIVE_EVENT_LIVE_AUTO_RESTART;
                        long currentTimeMillis = System.currentTimeMillis();
                        Object[] objArr4 = {context2, a2, bVar, new Long(currentTimeMillis), null};
                        ChangeQuickRedirect changeQuickRedirect4 = e.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9e44ad5536456ace610d631274d2a857", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9e44ad5536456ace610d631274d2a857");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("MTLIVE_LIVE_TYPE", String.valueOf(a2.d.l));
                            hashMap.put("MTLIVE_METRIC_SOURCE", String.valueOf(a2.e.h));
                            com.sankuai.meituan.mtliveqos.common.e.a(context2, a2, bVar, currentTimeMillis, hashMap);
                        }
                        MTTxPusher.this.o = System.currentTimeMillis();
                    }
                    if (i2 < 0) {
                        MTTxPusher.this.c(i2);
                    }
                    if (i2 < 0 || (i2 > 1100 && i2 < 3006)) {
                        MTTxPusher.this.a(b.a(i2), i2, bundle.getString("EVT_MSG", "没有任何信息"), (Map<String, String>) null);
                    }
                    if (i2 == 1103) {
                        MTTxPusher.this.r = c.d.SOFTWARE;
                    }
                    if (MTTxPusher.this.e != null) {
                        MTTxPusher.this.e.a(i2, bundle);
                    }
                }

                @Override // com.tencent.rtmp.ITXLivePushListener
                public final void onNetStatus(Bundle bundle) {
                    Object[] objArr3 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a20ad0f48d862a6e0fef1c7c32d613a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a20ad0f48d862a6e0fef1c7c32d613a2");
                        return;
                    }
                    if (bundle == null) {
                        MTTxPusher.this.a("onNetStatus", "bundle ==null");
                    } else {
                        int i2 = bundle.getInt("VIDEO_WIDTH");
                        int i3 = bundle.getInt("VIDEO_HEIGHT");
                        MTTxPusher mTTxPusher = MTTxPusher.this;
                        mTTxPusher.i = i2 + Constants.GestureMoveEvent.KEY_X + i3;
                        try {
                            String string = bundle.getString("SERVER_IP");
                            MTTxPusher.this.j = TextUtils.isEmpty(string) ? "" : string.split(CommonConstant.Symbol.COLON)[0];
                        } catch (Exception unused) {
                        }
                        if (context != null) {
                            b.a(context, bundle, MTTxPusher.this.a());
                        } else {
                            MTTxPusher.this.a("onNetStatus", "context ==null");
                        }
                    }
                    if (MTTxPusher.this.e != null) {
                        MTTxPusher.this.e.a(bundle);
                    }
                }
            });
        }
        this.f = true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(com.sankuai.meituan.mtlive.pusher.library.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2444157527a74cdfcbd01b7558b5e508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2444157527a74cdfcbd01b7558b5e508");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cVar);
        a("setPushListener", sb.toString());
        this.e = cVar;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(MTLivePusherView mTLivePusherView) {
        Object[] objArr = {mTLivePusherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f80aaf34b610b4ac8ada7690beb960e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f80aaf34b610b4ac8ada7690beb960e");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mTLivePusherView);
        a("startCameraPreview", sb.toString());
        if (mTLivePusherView == null) {
            Log.e("MTTxPusher", "view can not cast TXCloudVideoView");
            a(c.a.MLVB_START_PREVIEW, -1, "", (Map<String, String>) null);
            this.c.startCameraPreview(null);
            return;
        }
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(mTLivePusherView.getContext());
        tXCloudVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.g = tXCloudVideoView;
        mTLivePusherView.addView(tXCloudVideoView);
        if (k.a().b()) {
            TextView textView = new TextView(mTLivePusherView.getContext());
            textView.setText("腾讯SDK");
            textView.setBackgroundColor(Color.argb(64, 255, 0, 0));
            textView.setTextSize(14.0f);
            textView.setPadding(8, 8, 8, 8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = 40;
            layoutParams.leftMargin = 40;
            textView.setTextColor(-1);
            mTLivePusherView.addView(textView, layoutParams);
        }
        this.c.startCameraPreview(tXCloudVideoView);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a811973f7c3fe6cf3abef9fe0426e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a811973f7c3fe6cf3abef9fe0426e0e");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        a("stopCameraPreview", sb.toString());
        this.c.stopCameraPreview(z);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7218db57c1361f9ed95af2e7c21db47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7218db57c1361f9ed95af2e7c21db47")).intValue();
        }
        this.h = str;
        this.o = System.currentTimeMillis();
        this.s.removeMessages(this.m);
        this.s.sendEmptyMessageDelayed(this.m, this.n);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a428f4c4a25fb74c5fb69927f0a7f985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a428f4c4a25fb74c5fb69927f0a7f985");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("MTLIVE_PLAY_TOTAL_COUNT", Float.valueOf(1.0f));
            e.a(this.q, a(), hashMap, (Map<String, String>) null);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80c6bae7c221413f8e5217f6db798cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80c6bae7c221413f8e5217f6db798cc0");
        } else {
            String str2 = "1";
            String str3 = "20";
            String str4 = "1200";
            if (this.d != null) {
                str2 = String.valueOf(this.d.h);
                str3 = String.valueOf(this.d.g);
                str4 = String.valueOf(this.d.i);
                if (this.d.F == 1) {
                    this.r = c.d.HARDWARE;
                } else {
                    this.r = c.d.SOFTWARE;
                }
            }
            e.a(this.q, a(), c.b.MTLIVE_EVENT_LIVE_VIDEO_RESOLUTION.C, str2, null);
            e.a(this.q, a(), c.b.MTLIVE_EVENT_LIVE_VIDEO_FPS.C, str3, null);
            e.a(this.q, a(), c.b.MTLIVE_EVENT_LIVE_VIDEO_BITRATE.C, str4, null);
        }
        int startPusher = this.c.startPusher(str);
        a("startPusher", "r = " + startPusher + " url = " + str);
        if (startPusher != 0) {
            c(startPusher);
            c.a aVar = c.a.MLVB_START_PUSH;
            a(aVar, startPusher, "启动 RTMP 推流 失败 rtmpURL = " + str, (Map<String, String>) null);
        }
        return startPusher;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f68201721d1b48eaaf6e654b579d05cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f68201721d1b48eaaf6e654b579d05cf");
        } else if (this.q != null) {
            e.a(this.q, a(), c.b.MTLIVE_EVENT_SYNC_CLOCK.C, str, null);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a16e6f19c5963f790edd48d6467def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a16e6f19c5963f790edd48d6467def");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82a2af260ce81741bf41ae5f0416e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82a2af260ce81741bf41ae5f0416e4d");
        } else if (this.o > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.o;
            HashMap hashMap = new HashMap();
            hashMap.put("MTLIVE_LIVE_DURATION", Float.valueOf(((float) currentTimeMillis) / 1000.0f));
            e.a(this.q, a(), hashMap, (Map<String, String>) null);
        }
        a("stopPusher", "");
        this.c.stopPusher();
        this.s.removeMessages(this.m);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7040288130ba82b5d510bd09d60dd0d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7040288130ba82b5d510bd09d60dd0d9");
            return;
        }
        a("pausePusher", "");
        this.c.pausePusher();
        this.s.removeMessages(this.m);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc12d5133d11b1bf668e041674120d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc12d5133d11b1bf668e041674120d3");
            return;
        }
        a("resumePusher", "");
        this.c.resumePusher();
        this.s.removeMessages(this.m);
        this.s.sendEmptyMessageDelayed(this.m, this.n);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "190326e94b52d830bbbbb7aa3350b423", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "190326e94b52d830bbbbb7aa3350b423")).booleanValue();
        }
        boolean isPushing = this.c.isPushing();
        StringBuilder sb = new StringBuilder();
        sb.append(isPushing);
        a("isPushing", sb.toString());
        return isPushing;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5187d2c59fc990e97a18e5c45c841cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5187d2c59fc990e97a18e5c45c841cf0");
            return;
        }
        a("setVideoQuality", i + " adjustBitrate = " + z + " adjustResolution = " + z2);
        this.c.setVideoQuality(i, z, z2);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155e849de257d1c4738cf2beb5660842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155e849de257d1c4738cf2beb5660842");
            return;
        }
        a("switchCamera", "");
        this.c.switchCamera();
        this.f = !this.f;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884eaeaee0ab5f087705252de7c2925a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884eaeaee0ab5f087705252de7c2925a")).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        a("setMirror", sb.toString());
        return this.c.setMirror(z);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c4cb08ca966d918102bf0443758bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c4cb08ca966d918102bf0443758bae");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        a("setRenderRotation", sb.toString());
        this.c.setRenderRotation(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02faab0cd6f44d66356b766405b55fd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02faab0cd6f44d66356b766405b55fd4")).booleanValue();
        }
        boolean turnOnFlashLight = this.c.turnOnFlashLight(z);
        a("turnOnFlashLight", "e = " + z + " r = " + turnOnFlashLight);
        return turnOnFlashLight;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c0080ddbebe676d4ba389af5316b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c0080ddbebe676d4ba389af5316b0e")).intValue();
        }
        int maxZoom = this.c.getMaxZoom();
        StringBuilder sb = new StringBuilder();
        sb.append(maxZoom);
        a("getMaxZoom", sb.toString());
        return maxZoom;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41b58156f180915111aa89f3071a37a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41b58156f180915111aa89f3071a37a")).booleanValue();
        }
        boolean zoom = this.c.setZoom(i);
        a("setZoom", "v = " + i + " r" + zoom);
        return zoom;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final com.sankuai.meituan.mtlive.pusher.library.a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92989962d527d3e6db7f38b84c186441", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtlive.pusher.library.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92989962d527d3e6db7f38b84c186441");
        }
        if (this.b == null) {
            this.b = new a(this.c.getBeautyManager());
        }
        return this.b;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de898c6d06e2a0c6ed3c5b785b43852d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de898c6d06e2a0c6ed3c5b785b43852d")).booleanValue();
        }
        a("setBeautyFilter", "style = " + i + " beautyLevel" + i2 + " whiteningLevel" + i3 + " ruddyLevel" + i4);
        return this.c.setBeautyFilter(i, i2, i3, i4);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66747e8c4fb3fc26fb6cc6fdaee12499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66747e8c4fb3fc26fb6cc6fdaee12499");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        a("setMute", sb.toString());
        this.c.setMute(z);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(final i.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23ce02dc441bd49a05995d25a9ca152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23ce02dc441bd49a05995d25a9ca152");
            return;
        }
        a("setBGMNotify", "");
        if (cVar == null) {
            this.c.setBGMNofify(null);
        } else {
            this.c.setBGMNofify(new TXLivePusher.OnBGMNotify() { // from class: com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher.3
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
                public final void onBGMStart() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "652491a622bca1498f6eb72d178e044b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "652491a622bca1498f6eb72d178e044b");
                        return;
                    }
                    MTTxPusher.this.a("setBGMNotify", "onBGMStart");
                    cVar.c();
                }

                @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
                public final void onBGMProgress(long j, long j2) {
                    Object[] objArr2 = {new Long(j), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb790e67707ded95002ee9bf79dd7c8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb790e67707ded95002ee9bf79dd7c8d");
                    } else {
                        cVar.a(j, j2);
                    }
                }

                @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
                public final void onBGMComplete(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a32f70258ff3e592b0f33c20f06355ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a32f70258ff3e592b0f33c20f06355ec");
                        return;
                    }
                    MTTxPusher.this.a("setBGMNotify", "onBGMComplete");
                    cVar.b(i);
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d01d2f1d2daed4fe0554bfc9e2f3f74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d01d2f1d2daed4fe0554bfc9e2f3f74")).booleanValue();
        }
        a("playBGM", str);
        return this.c.playBGM(str);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457a7821e71d7d0c1c50b44ced3517d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457a7821e71d7d0c1c50b44ced3517d2")).booleanValue();
        }
        boolean stopBGM = this.c.stopBGM();
        StringBuilder sb = new StringBuilder();
        sb.append(stopBGM);
        a("stopBGM", sb.toString());
        return stopBGM;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d89ca1f14aa093f1204fb02c493f7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d89ca1f14aa093f1204fb02c493f7b")).booleanValue();
        }
        a("pauseBGM", "");
        return this.c.pauseBGM();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cc279bb5cdc3427039e962dc8c8663", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cc279bb5cdc3427039e962dc8c8663")).booleanValue();
        }
        a("resumeBGM", "");
        return this.c.resumeBGM();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201e318729f9985fc56e157309f68118", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201e318729f9985fc56e157309f68118")).booleanValue();
        }
        boolean bGMVolume = this.c.setBGMVolume(f);
        a("setBGMVolume", "v = " + f + " r = " + bGMVolume);
        return bGMVolume;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262e655cf972585539e58a070d8cfba6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262e655cf972585539e58a070d8cfba6")).booleanValue();
        }
        boolean micVolume = this.c.setMicVolume(f);
        a("setMicVolume", "v = " + f + " r = " + micVolume);
        return micVolume;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5083b5a8b6aa61792042086bb4a03b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5083b5a8b6aa61792042086bb4a03b");
            return;
        }
        a("setReverb", r.o + i);
        this.c.setReverb(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(final i.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf44d27c3a0b7336583c964e437e9d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf44d27c3a0b7336583c964e437e9d1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bVar);
        a("snapshot", sb.toString());
        if (bVar == null) {
            this.c.snapshot(null);
        } else {
            this.c.snapshot(new TXLivePusher.ITXSnapshotListener() { // from class: com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher.4
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
                public final void onSnapshot(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cf5042297a7a59156315441b1a2401b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cf5042297a7a59156315441b1a2401b");
                    } else {
                        bVar.a(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad105a98aea2ed7aa56b145a789d57a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad105a98aea2ed7aa56b145a789d57a")).booleanValue();
        }
        boolean sendMessageEx = this.c.sendMessageEx(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(sendMessageEx);
        a("sendMessageEx", sb.toString());
        return sendMessageEx;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(final i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d4e38c92d441e2e212428b586e7c20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d4e38c92d441e2e212428b586e7c20");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar);
        a("setAudioVolumeEvaluationListener", sb.toString());
        if (aVar == null) {
            this.c.setAudioVolumeEvaluationListener(null);
        } else {
            this.c.setAudioVolumeEvaluationListener(new TXLivePusher.ITXAudioVolumeEvaluationListener() { // from class: com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher.5
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
                public final void onAudioVolumeEvaluationNotify(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a09292f8a25303647ba3cbbd21e378f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a09292f8a25303647ba3cbbd21e378f");
                    } else {
                        aVar.a(i);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98743a7ab9478f422304c684f18a57e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98743a7ab9478f422304c684f18a57e2");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        a("enableAudioVolumeEvaluation", sb.toString());
        this.c.enableAudioVolumeEvaluation(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bcb994688aa8badba5abc95e6c4cb70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bcb994688aa8badba5abc95e6c4cb70");
            return;
        }
        a("release", "");
        this.s.removeMessages(this.m);
        if (this.c != null) {
            this.c.setPushListener(null);
            this.c.setAudioProcessListener(null);
            this.c.setVideoProcessListener(null);
            this.c.setVideoRecordListener(null);
            this.c.setAudioVolumeEvaluationListener(null);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean n() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c.a aVar, int i, String str, Map<String, String> map) {
        Object[] objArr = {aVar, Integer.valueOf(i), str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a702f903cbd42c399c906a825e5c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a702f903cbd42c399c906a825e5c17");
        } else if (this.d == null || this.p == null) {
        } else {
            new HashMap().put("MTLIVE_STREAM_URL", this.h);
            com.sankuai.meituan.mtliveqos.statistic.a aVar2 = new com.sankuai.meituan.mtliveqos.statistic.a();
            aVar2.b = i;
            aVar2.d = aVar == null ? StringUtil.NULL : aVar.ao;
            aVar2.c = str;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aeeb0e11cc0e544871342a9397255c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aeeb0e11cc0e544871342a9397255c4");
        } else if (this.d == null || this.p == null) {
        } else {
            com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
            cVar.d = str2;
            cVar.c = str;
            cVar.b = com.sankuai.meituan.mtlive.pusher.library.e.class.getSimpleName();
            e.a(this.q, a(), cVar, (Map<String, String>) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.mtliveqos.statistic.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbdce7c449d4688993e507e20644bf05", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbdce7c449d4688993e507e20644bf05");
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.b = this.i;
        bVar.d = c.f.PUSH;
        bVar.e = c.g.MLVB;
        bVar.c = this.p;
        bVar.h = "2.0.24";
        bVar.i = this.h;
        bVar.k = this.j;
        bVar.n = this.r;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.o > 0) {
            bVar.o = (currentTimeMillis - this.o) / 1000;
        }
        bVar.p = currentTimeMillis;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87489b38c94d2f687feafe67576bfadb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87489b38c94d2f687feafe67576bfadb");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("MTLIVE_PLAY_FAILED_COUNT", Float.valueOf(1.0f));
        hashMap2.put("MTLIVE_ERROR_CODE", String.valueOf(f));
        e.a(this.q, a(), hashMap, hashMap2);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6670c504d66f525e2766a9148bdeaaef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6670c504d66f525e2766a9148bdeaaef");
        } else if (this.g != null) {
            this.g.showLog(z);
        }
    }
}
