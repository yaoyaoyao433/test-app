package com.dianping.live.live.mrn;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.dianping.live.live.utils.h;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.recce.props.gens.AutoFocus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.pusher.library.MTLivePusherView;
import com.tencent.mapsdk.internal.ki;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLivePusherView extends MTLivePusherView implements com.meituan.android.privacy.interfaces.d {
    public static ChangeQuickRedirect a = null;
    public static String b = "daodian_cips";
    ao c;
    h d;
    com.sankuai.meituan.mtlive.pusher.library.f e;
    com.sankuai.meituan.mtlive.pusher.library.c f;
    String g;
    ReadableMap h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public static /* synthetic */ int a(MLivePusherView mLivePusherView, int i) {
        mLivePusherView.x = 0;
        return 0;
    }

    public static /* synthetic */ void a(MLivePusherView mLivePusherView, final Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mLivePusherView, changeQuickRedirect, false, "90a4472d75abb655ee7284b1f42acdb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mLivePusherView, changeQuickRedirect, false, "90a4472d75abb655ee7284b1f42acdb9");
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    FileOutputStream fileOutputStream;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58bb86da30559a44a075cf63a67dfc06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58bb86da30559a44a075cf63a67dfc06");
                        return;
                    }
                    String uuid = UUID.randomUUID().toString();
                    FileOutputStream fileOutputStream2 = null;
                    File b2 = q.b(MLivePusherView.this.getContext(), MLivePusherView.b, "");
                    if (b2 == null) {
                        Log.e("snapshot", "sdcardDir is null");
                        return;
                    }
                    String str = b2 + File.separator + uuid + ".png";
                    File file = new File(str);
                    try {
                        try {
                            try {
                                file.getParentFile().mkdirs();
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                fileOutputStream = new FileOutputStream(file);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (IOException e) {
                            e = e;
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        }
                        if (file.exists()) {
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    if (file.exists() || file.length() <= 0) {
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("path", str);
                    MLivePusherView.this.a(k.STATE_ON_SNAPSHOT_SUCCESS, createMap);
                }
            });
        }
    }

    public static /* synthetic */ int b(MLivePusherView mLivePusherView, int i) {
        mLivePusherView.z = 0;
        return 0;
    }

    public static /* synthetic */ boolean b(MLivePusherView mLivePusherView, boolean z) {
        mLivePusherView.s = true;
        return true;
    }

    public static /* synthetic */ void c(MLivePusherView mLivePusherView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mLivePusherView, changeQuickRedirect, false, "2306886b886002c609711e92bcd870fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mLivePusherView, changeQuickRedirect, false, "2306886b886002c609711e92bcd870fd");
        } else if (mLivePusherView.r && mLivePusherView.s && mLivePusherView.x < mLivePusherView.y) {
            mLivePusherView.a(k.STATE_ON_NETWORK_AVAILABLE_RESTART, (WritableMap) null);
            com.dianping.live.live.utils.j.a("MLive_Logan: Pusher RECONNECT 监听到网络重连准备开始重启");
            mLivePusherView.a();
            mLivePusherView.a(mLivePusherView.h);
            new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24ac83637fe47464dc76e60b2c355ec9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24ac83637fe47464dc76e60b2c355ec9");
                    } else if (MLivePusherView.this.d == null || !MLivePusherView.this.d.c()) {
                    } else {
                        if (MLivePusherView.this.h != null) {
                            MLivePusherView.this.setDevicePosition(MLivePusherView.this.h);
                        }
                        new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.4.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4eb44de7f53577ba200b4f081c7c311", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4eb44de7f53577ba200b4f081c7c311");
                                } else if (MLivePusherView.this.w) {
                                    MLivePusherView.this.a(true);
                                }
                            }
                        }, 1000L);
                    }
                }
            }, 1000L);
            mLivePusherView.s = false;
            mLivePusherView.x++;
        }
    }

    public static /* synthetic */ boolean c(MLivePusherView mLivePusherView, boolean z) {
        mLivePusherView.o = false;
        return false;
    }

    public static /* synthetic */ int g(MLivePusherView mLivePusherView) {
        int i = mLivePusherView.z;
        mLivePusherView.z = i + 1;
        return i;
    }

    public MLivePusherView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d782f897d6963bd75f4cc727a0c3701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d782f897d6963bd75f4cc727a0c3701");
            return;
        }
        this.i = true;
        this.j = false;
        this.k = 300;
        this.l = 10;
        this.m = false;
        this.n = 0L;
        this.o = true;
        this.p = 0;
        this.q = false;
        this.r = true;
        this.s = false;
        this.t = "MLive_Pusher";
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.y = 16;
        this.z = 0;
    }

    public MLivePusherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c05e0842eb20628b5ea8ff17a1ad954", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c05e0842eb20628b5ea8ff17a1ad954");
            return;
        }
        this.i = true;
        this.j = false;
        this.k = 300;
        this.l = 10;
        this.m = false;
        this.n = 0L;
        this.o = true;
        this.p = 0;
        this.q = false;
        this.r = true;
        this.s = false;
        this.t = "MLive_Pusher";
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.y = 16;
        this.z = 0;
    }

    public void setReactContext(ao aoVar) {
        this.c = aoVar;
    }

    public ao getReactContext() {
        return this.c;
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277e26285f8a15c9bdc36f3af220ae7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277e26285f8a15c9bdc36f3af220ae7d");
            return;
        }
        if (str.equals(PermissionGuard.PERMISSION_CAMERA) && i <= 0) {
            a(k.STATE_ON_CAMERA_FAIL, (WritableMap) null);
        }
        if (str.equals(PermissionGuard.PERMISSION_MICROPHONE) && i <= 0) {
            a(k.STATE_ON_MIC_FAIL, (WritableMap) null);
        }
        if (!str.equals(PermissionGuard.PERMISSION_CAMERA) || i <= 0) {
            return;
        }
        com.dianping.live.live.utils.g.a();
        b();
        b a2 = b.a();
        Object[] objArr2 = {getContext().getApplicationContext()};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4d6446e9961de5eb860dff95a2c82ddb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4d6446e9961de5eb860dff95a2c82ddb")).booleanValue() : com.sankuai.meituan.mtlive.pusher.library.h.b(141374)) {
            b();
            return;
        }
        final b a3 = b.a();
        Context applicationContext = getContext().getApplicationContext();
        final h.a aVar = new h.a() { // from class: com.dianping.live.live.mrn.MLivePusherView.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.live.live.utils.h.a
            public final void b(int i2) {
            }

            @Override // com.dianping.live.live.utils.h.a
            public final void a(int i2) {
                Object[] objArr3 = {200};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "962143dac2df78e1a3af32396de9ebc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "962143dac2df78e1a3af32396de9ebc6");
                    return;
                }
                MLivePusherView.this.b();
                String unused = MLivePusherView.this.t;
            }
        };
        Object[] objArr3 = {applicationContext, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "490f0ba5e1ea584d139fbcd89901b067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "490f0ba5e1ea584d139fbcd89901b067");
        } else {
            com.sankuai.meituan.mtlive.pusher.library.h.a(141374, new k.a() { // from class: com.dianping.live.live.mrn.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialSucceed() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8efe33095ea0b5273bc4bd168ce5a236", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8efe33095ea0b5273bc4bd168ce5a236");
                    } else {
                        aVar.a(200);
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialFailed() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ea21d910a3c906471f61e6dd57c8275a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ea21d910a3c906471f61e6dd57c8275a");
                    } else {
                        aVar.b(202);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12ca46bc013356106703fd575a51f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12ca46bc013356106703fd575a51f64");
        } else if (this.d == null || !this.d.c()) {
            a(this.h);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fff9772e126568d04c18571112e7f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fff9772e126568d04c18571112e7f89");
            return;
        }
        super.requestLayout();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1c5c9cbc817c3f726cedcfbb2684063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1c5c9cbc817c3f726cedcfbb2684063");
        } else if (getWidth() <= 0 || getHeight() <= 0) {
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getWidth() + getPaddingLeft() + getLeft(), getHeight() + getPaddingTop() + getTop());
        }
    }

    public final void a(k kVar, WritableMap writableMap) {
        Object[] objArr = {kVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4d1d2f2c8b1270bae6f4fc3976836f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4d1d2f2c8b1270bae6f4fc3976836f");
        } else if (this.c == null) {
        } else {
            try {
                ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(j.a(getId(), kVar, writableMap));
            } catch (Exception e) {
                com.dianping.live.live.utils.j.a("MLive_Logan: Pusher CALLBACK 通知mrn侧pusher状态改变失败");
                com.dianping.live.live.utils.j.a(getContext());
                com.dianping.codelog.b.b(MLivePusherView.class, "notifyPusherStateChanged ERROR", e.getMessage() + " Address:" + this.g);
            }
        }
    }

    public final void a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf776d9c1b598aec01c8fa47599df04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf776d9c1b598aec01c8fa47599df04");
            return;
        }
        this.g = readableMap.getString(RaptorUploaderImpl.SRC);
        if (this.d != null) {
            this.q = true;
        }
        c();
        setAdjustBitrate(readableMap);
        setMode(readableMap);
        setMuted(readableMap);
        setEnableCamera(readableMap);
        setAutoFocus(readableMap);
        setOrientation(readableMap);
        setZoom(readableMap);
        setMinBitrate(readableMap);
        setMaxBitrate(readableMap);
        setAudioQuality(readableMap);
        setWaitingImage(readableMap);
        setPauseTime(readableMap);
        setPauseFPS(readableMap);
        setBackgroundMute(readableMap);
        setMirror(readableMap);
        setEnableMic(readableMap);
        setBeauty(readableMap);
        setWhiteness(readableMap);
        setEnableNearestIP(readableMap);
        setNetworkStatusSwitch(readableMap);
        setBitrate(readableMap);
        setFps(readableMap);
        setEnableAEC(readableMap);
        if (this.q && this.d.c()) {
            setDevicePosition(readableMap);
            return;
        }
        if (readableMap.hasKey("autopush") ? readableMap.getBoolean("autopush") : false) {
            b(readableMap);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151731e6a07cac6073086a3872c310e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151731e6a07cac6073086a3872c310e6");
            return;
        }
        if (this.f == null) {
            this.f = new com.sankuai.meituan.mtlive.pusher.library.c() { // from class: com.dianping.live.live.mrn.MLivePusherView.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.pusher.library.c
                public final void a(int i, Bundle bundle) {
                    Object[] objArr2 = {Integer.valueOf(i), bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfec683acb390a26a1ce5b7f2dfbdb0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfec683acb390a26a1ce5b7f2dfbdb0e");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("code", i);
                    createMap.putMap(GearsLocator.DETAIL, createMap2);
                    MLivePusherView.this.a(k.STATE_BIND_STATE_CHANGE, createMap);
                    if (i == 1002) {
                        MLivePusherView.this.a(k.STATE_ON_PUSH_STREAM_SUCCESS, (WritableMap) null);
                        MLivePusherView.a(MLivePusherView.this, 0);
                    } else if (i == 1003) {
                        MLivePusherView.this.a(k.STATE_ON_CAMERA_SUCCESS, (WritableMap) null);
                    } else if (i == -1301) {
                        MLivePusherView.this.a(k.STATE_ON_CAMERA_FAIL, (WritableMap) null);
                    } else if (i == -1302) {
                        MLivePusherView.this.a(k.STATE_ON_MIC_FAIL, (WritableMap) null);
                    } else if (i == -1307) {
                        MLivePusherView.this.a(k.STATE_ON_NETWORK_FAIL, (WritableMap) null);
                        MLivePusherView.b(MLivePusherView.this, true);
                        if (MLivePusherView.this.r) {
                            new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.3.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "040fbc0e0ad59690b71c87d3a5de18fe", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "040fbc0e0ad59690b71c87d3a5de18fe");
                                    } else {
                                        MLivePusherView.c(MLivePusherView.this);
                                    }
                                }
                            }, PayTask.j);
                        }
                    } else if (i == 1102) {
                        MLivePusherView.this.a(k.STATE_ON_NETWORK_RESTART, (WritableMap) null);
                    } else if (i == 1101) {
                        MLivePusherView.this.a(k.STATE_ON_NETWORK_BUSY, (WritableMap) null);
                    } else if (i == 1103) {
                        MLivePusherView.this.e.m(0);
                        MLivePusherView.this.d.a(MLivePusherView.this.e);
                    } else if (i == 1008) {
                        String string = bundle.getString("EVT_MSG", "没有任何信息");
                        String unused = MLivePusherView.this.t;
                        new StringBuilder("PUSH_EVT_START_VIDEO_ENCODER").append(string);
                        MLivePusherView.g(MLivePusherView.this);
                        if (MLivePusherView.this.z > 10 && string.contains("hardware")) {
                            MLivePusherView.this.a();
                            new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.3.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea081bac2798b58d9ce7b935fee6b40d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea081bac2798b58d9ce7b935fee6b40d");
                                        return;
                                    }
                                    MLivePusherView.this.e.m(0);
                                    MLivePusherView.this.b(MLivePusherView.this.h);
                                    MLivePusherView.b(MLivePusherView.this, 0);
                                    com.dianping.live.live.utils.j.a("MLive_Logan: Pusher PUSH_EVT_START_VIDEO_ENCODER 大于10次，重启推流");
                                    String unused2 = MLivePusherView.this.t;
                                }
                            }, 500L);
                        }
                    }
                    com.dianping.live.live.utils.j.a("MLive_Logan: Pusher Code " + i);
                    MLivePusherView.this.a(MLivePusherView.class, i);
                    String unused2 = MLivePusherView.this.t;
                    new StringBuilder("Code ").append(i);
                    if (i == -1301 && Privacy.createPermissionGuard().a(MLivePusherView.this.c.getCurrentActivity(), PermissionGuard.PERMISSION_CAMERA, "pt-642a4204d91edfe0") > 0 && MLivePusherView.this.o) {
                        MLivePusherView.this.a();
                        long j = MLivePusherView.this.p == 1 ? 500L : 0L;
                        if (MLivePusherView.this.p == 2) {
                            j = 1500;
                        }
                        new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.3.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1e826fdf68f4dde44ea843269669c09", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1e826fdf68f4dde44ea843269669c09");
                                    return;
                                }
                                MLivePusherView.this.b(MLivePusherView.this.h);
                                MLivePusherView.this.p++;
                                com.dianping.live.live.utils.j.a("MLive_Logan: Pusher RECONNECT 摄像头被上一页面占用，重启推流第" + MLivePusherView.this.p + "次");
                                com.dianping.live.live.utils.j.a(MLivePusherView.this.getContext());
                                String unused3 = MLivePusherView.this.t;
                                StringBuilder sb = new StringBuilder("RECONNECT 摄像头被上一页面占用，重启推流第");
                                sb.append(MLivePusherView.this.p);
                                sb.append("次");
                                if (MLivePusherView.this.p == 3) {
                                    MLivePusherView.c(MLivePusherView.this, false);
                                }
                            }
                        }, j);
                    }
                }

                @Override // com.sankuai.meituan.mtlive.pusher.library.c
                public final void a(Bundle bundle) {
                    Object[] objArr2 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c891e6f0aeeeb7ef2cb840a5304398e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c891e6f0aeeeb7ef2cb840a5304398e");
                        return;
                    }
                    String a2 = MLivePusherView.this.a(bundle);
                    long time = new Date().getTime();
                    if (MLivePusherView.this.n == 0 || time - MLivePusherView.this.n > 10000) {
                        if (MLivePusherView.this.m) {
                            MLivePusherView.this.n = time;
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("info", a2);
                            createMap.putString("memo", "");
                            MLivePusherView.this.a(k.STATE_BIND_NET_STATUS, createMap);
                        }
                        com.dianping.live.live.utils.j.a("MLive_Logan: Pusher NetStatus " + a2);
                        String unused = MLivePusherView.this.t;
                    }
                }
            };
        }
        if (this.e == null) {
            this.e = com.sankuai.meituan.mtlive.pusher.library.h.a(141374);
        }
        if (this.d == null) {
            this.d = h.a(getContext().getApplicationContext());
        }
    }

    public final String a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a342b72a9e7607559a23ac2b592a59a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a342b72a9e7607559a23ac2b592a59a");
        }
        return String.format("%-14s %-14s %-12s\n%-8s %-8s %-8s %-8s\n%-14s %-14s %-12s\n%-14s %-14s", "CPU:" + bundle.getString("CPU_USAGE"), "RES:" + bundle.getInt("VIDEO_WIDTH") + "*" + bundle.getInt("VIDEO_HEIGHT"), "SPD:" + bundle.getInt("NET_SPEED") + "Kbps", "JIT:" + bundle.getInt("NET_JITTER"), "FPS:" + bundle.getInt("VIDEO_FPS"), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE), "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "VRA:" + bundle.getInt("VIDEO_BITRATE") + "Kbps", "SVR:" + bundle.getString("SERVER_IP"), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Class r13, int r14) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.live.live.mrn.MLivePusherView.a(java.lang.Class, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9165a4dcc9b6174061b5d09017f580f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9165a4dcc9b6174061b5d09017f580f");
        } else if (this.d == null) {
        } else {
            this.d.a(this.f);
            this.d.a(this.e);
            this.d.a(true);
            this.d.a(this);
            setMode(readableMap);
            com.dianping.live.live.utils.j.a("MLive_Logan: Pusher  Address:" + this.g);
            this.z = 0;
            int a2 = this.d.a(this.g);
            if (a2 == 0) {
                if (readableMap != null) {
                    setDevicePosition(readableMap);
                }
                a(k.STATE_ON_PUSHER_START_SUCCESS, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Pusher START 启动成功");
                com.dianping.live.live.utils.j.a(getContext());
            } else if (a2 == -1) {
                if (this.d.c()) {
                    return;
                }
                a(k.STATE_ON_PUSHER_START_FAIL, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Pusher START 启动失败");
                com.dianping.live.live.utils.j.a(getContext());
                com.dianping.codelog.b.b(MLivePusherView.class, "start fail", "启动失败 Address:" + this.g);
            } else if (a2 == -5) {
                a(k.STATE_ON_LICENSE_FAIL, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Pusher START License校验失败");
                com.dianping.live.live.utils.j.a(getContext());
                String str = "";
                if (this.u) {
                    str = " LicenseUrl为空";
                }
                if (this.v) {
                    str = str + "&LicenseKey为空";
                }
                com.dianping.codelog.b.b(MLivePusherView.class, "start fail", "License校验失败" + str + " Address:" + this.g);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823566ed93f21581024e38613574c48d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823566ed93f21581024e38613574c48d");
            return;
        }
        com.dianping.live.live.utils.j.a("MLive_Logan: Pusher call MLivePusherView stopPush");
        com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.d, "call MLivePusherView stopPush");
        if (this.d != null) {
            this.d.g();
            this.d.a(true);
            this.d.a((com.sankuai.meituan.mtlive.pusher.library.c) null);
            this.d.a();
            this.d.b();
            com.dianping.live.live.utils.j.a(getContext());
            this.i = true;
        }
        if (this.e != null) {
            this.e.a((Bitmap) null);
        }
    }

    private void setAdjustBitrate(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f0c634ee30e7fe86671986be34ec28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f0c634ee30e7fe86671986be34ec28");
        } else if (readableMap.hasKey("adjustBitrate")) {
            setAdjustBitrate(readableMap.getBoolean("adjustBitrate"));
        }
    }

    private void setMode(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ddbfa98d07694ea48b3f9944daf45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ddbfa98d07694ea48b3f9944daf45c");
        } else if (readableMap.hasKey(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            a(this.d, this.e, readableMap.getString(JsBridgeResult.ARG_KEY_LOCATION_MODE));
        }
    }

    private void setMuted(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30585066033d4cb8465fc154ba96c875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30585066033d4cb8465fc154ba96c875");
        } else if (readableMap.hasKey("muted")) {
            a(this.d, readableMap.getBoolean("muted"));
        }
    }

    private void setEnableCamera(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def1cbee51f64e0e5e0b26547196d5a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def1cbee51f64e0e5e0b26547196d5a8");
        } else if (readableMap.hasKey("enableCamera")) {
            a(this.d, readableMap.getBoolean("enableCamera"), this);
        }
    }

    private void setAutoFocus(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887adf3ef48f0f51132299684de6b577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887adf3ef48f0f51132299684de6b577");
        } else if (readableMap.hasKey(AutoFocus.LOWER_CASE_NAME)) {
            a(this.e, readableMap.getBoolean(AutoFocus.LOWER_CASE_NAME));
        }
    }

    private void setOrientation(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1368e6fa1491b6245b49610b60feb8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1368e6fa1491b6245b49610b60feb8f");
        } else if (readableMap.hasKey(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)) {
            a(this.e, this.d, readableMap.getString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION));
        }
    }

    private void setZoom(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a8dc226ad6100190c22895ef1d4cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a8dc226ad6100190c22895ef1d4cfa");
        } else if (readableMap.hasKey("zoom")) {
            b(this.d, readableMap.getBoolean("zoom"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevicePosition(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2037538f5a74b105096c6c4a3194a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2037538f5a74b105096c6c4a3194a0c");
        } else if (readableMap.hasKey("devicePosition")) {
            String string = readableMap.getString("devicePosition");
            a(this.d, string);
            new StringBuilder("setDevicePosition: ").append(string);
        }
    }

    private void setMinBitrate(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd53d9d1ae1d30294b04a2f2162ca7c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd53d9d1ae1d30294b04a2f2162ca7c3");
        } else if (readableMap.hasKey("minBitrate")) {
            a(this.e, readableMap.getInt("minBitrate"));
        }
    }

    private void setMaxBitrate(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84df6408277f635f761b7c6e882de0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84df6408277f635f761b7c6e882de0dc");
        } else if (readableMap.hasKey("maxBitrate")) {
            b(this.e, readableMap.getInt("maxBitrate"));
        }
    }

    private void setAudioQuality(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7659c94631d771c25163f0c30c327169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7659c94631d771c25163f0c30c327169");
        } else if (readableMap.hasKey("audioQuality")) {
            a(this.e, readableMap.getString("audioQuality"));
        }
    }

    private void setWaitingImage(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781e3111e35f425d0e5151b2a413a00e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781e3111e35f425d0e5151b2a413a00e");
        } else if (readableMap.hasKey("waitingImage")) {
            b(this.e, readableMap.getString("waitingImage"));
        }
    }

    public void setPauseTime(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "049b78b13933b8d0ace5acfafdc0c00d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "049b78b13933b8d0ace5acfafdc0c00d");
        } else if (readableMap.hasKey("pauseTime")) {
            c(this.e, readableMap.getInt("pauseTime"));
        }
    }

    public void setPauseFPS(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66587577b2416eb0bd5f2df205ed590c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66587577b2416eb0bd5f2df205ed590c");
        } else if (readableMap.hasKey("pauseFps")) {
            d(this.e, readableMap.getInt("pauseFps"));
        }
    }

    private void setBackgroundMute(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beefff60550081eba7bac6f3c5b3bbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beefff60550081eba7bac6f3c5b3bbde");
        } else if (readableMap.hasKey("backgroundMute")) {
            b(this.e, readableMap.getBoolean("backgroundMute"));
        }
    }

    private void setMirror(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de21ba697f2ea0794b0c619fdf1e1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de21ba697f2ea0794b0c619fdf1e1b4");
        } else if (readableMap.hasKey("mirror")) {
            c(this.d, readableMap.getBoolean("mirror"));
        }
    }

    private void setEnableMic(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3554640e8574808cf9b79b48d8a045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3554640e8574808cf9b79b48d8a045");
        } else if (readableMap.hasKey("enableMic")) {
            d(this.d, readableMap.getBoolean("enableMic"));
        }
    }

    private void setBeauty(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb038ec9fd4281fe82530f3a0632428e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb038ec9fd4281fe82530f3a0632428e");
        } else if (readableMap.hasKey("beauty")) {
            a(this.d, readableMap.getInt("beauty"));
        }
    }

    private void setWhiteness(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b75abe1d6442ec102a83886a1eb62156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b75abe1d6442ec102a83886a1eb62156");
        } else if (readableMap.hasKey("whiteness")) {
            b(this.d, readableMap.getInt("whiteness"));
        }
    }

    private void setNetworkStatusSwitch(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8185e137c52e87e449c8ee6ab48a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8185e137c52e87e449c8ee6ab48a8e");
        } else if (readableMap.hasKey("networkStatusSwitch")) {
            this.m = readableMap.getBoolean("networkStatusSwitch");
        }
    }

    private void setEnableNearestIP(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c8becfe11c476761ae81323c801c9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c8becfe11c476761ae81323c801c9de");
        } else if (readableMap.hasKey("enableNearestIP")) {
            c(this.e, readableMap.getBoolean("enableNearestIP"));
        }
    }

    private void setBitrate(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61f99953dfad8b86ec43def83fc3e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61f99953dfad8b86ec43def83fc3e66");
        } else if (readableMap.hasKey("bitrate")) {
            e(this.e, readableMap.getInt("bitrate"));
        }
    }

    private void setFps(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a35cc919269193223ad2b018cafef81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a35cc919269193223ad2b018cafef81");
        } else if (readableMap.hasKey(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS)) {
            f(this.e, readableMap.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS));
        }
    }

    private void setEnableAEC(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3cccb51c85a7d9e0f4bdabd5167ad9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3cccb51c85a7d9e0f4bdabd5167ad9f");
        } else if (readableMap.hasKey("enableAEC")) {
            d(this.e, readableMap.getBoolean("enableAEC"));
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c480d4fcd366d8cc1597e2261eda91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c480d4fcd366d8cc1597e2261eda91");
        } else if (this.d != null) {
            this.w = z;
            this.d.c(z);
        }
    }

    public void setMICVolume(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76834af776965d5a1ea1cf613a0d24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76834af776965d5a1ea1cf613a0d24d");
        } else if (this.d != null) {
            h hVar = this.d;
            Object[] objArr2 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "e35fa3e78bb2246d2289d83fe902bca7", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "e35fa3e78bb2246d2289d83fe902bca7")).booleanValue();
            } else {
                hVar.b.b(f);
            }
        }
    }

    public void setBGMVolume(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b63e07112d3fc80ab246f3448c38e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b63e07112d3fc80ab246f3448c38e32");
        } else if (this.d != null) {
            h hVar = this.d;
            Object[] objArr2 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "36ae018d91d112ceb9517e1ea941a42a", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "36ae018d91d112ceb9517e1ea941a42a")).booleanValue();
            } else {
                hVar.b.a(f);
            }
        }
    }

    public void setAdjustBitrate(boolean z) {
        this.j = z;
    }

    public final void a(h hVar, com.sankuai.meituan.mtlive.pusher.library.f fVar, String str) {
        Object[] objArr = {hVar, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f22f35986cc04737edced5567821a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f22f35986cc04737edced5567821a21");
        } else if (str.equals("HD")) {
            hVar.a(2, this.j, false);
        } else if (str.equals("SD")) {
            hVar.a(1, this.j, false);
        } else if (str.equals("FHD")) {
            hVar.a(3, this.j, false);
        } else if (str.equals(ki.r)) {
            hVar.a(7, this.j, false);
        } else if (str.equals("MAIN")) {
            hVar.a(4, true, false);
        } else if (str.equals("SUB")) {
            hVar.a(5, false, false);
        }
    }

    public final void a(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e521ecdd05800562a67feb728e8389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e521ecdd05800562a67feb728e8389");
        } else {
            hVar.d(z);
        }
    }

    public final void a(h hVar, boolean z, MLivePusherView mLivePusherView) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892a73469c94cddf9b887c78c0bb5ed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892a73469c94cddf9b887c78c0bb5ed5");
        } else if (z) {
            hVar.a(true);
            hVar.a(mLivePusherView);
        } else {
            hVar.a(false);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685b4f1f9916d9cd7806ba34642eefb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685b4f1f9916d9cd7806ba34642eefb2");
        } else {
            fVar.a(!z ? 1 : 0);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.f fVar, h hVar, String str) {
        Object[] objArr = {fVar, hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f136b49afada2b6aeca79aea06facb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f136b49afada2b6aeca79aea06facb9b");
        } else if (str.equals("vertical")) {
            fVar.a(1);
            hVar.a(0);
        } else if (str.equals("horizontal")) {
            fVar.a(0);
            hVar.a(90);
        }
    }

    public final void b(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfaab2ff79222ec501a65ff1c2fc70b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfaab2ff79222ec501a65ff1c2fc70b");
        } else {
            hVar.b(z ? hVar.e() : 1);
        }
    }

    public final void a(h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a9eae4bd0eea335e6c529b33ba63bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a9eae4bd0eea335e6c529b33ba63bb");
        } else if (this.i && str.equals("front")) {
        } else {
            if (this.i || !str.equals("back")) {
                hVar.d();
                this.i = !this.i;
            }
        }
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0217224e10a7d53f880177d2cb58fe49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0217224e10a7d53f880177d2cb58fe49");
        } else {
            fVar.i(i);
        }
    }

    public final void b(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6bc4f3ab7e9fdba1166db8c690e15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6bc4f3ab7e9fdba1166db8c690e15e");
        } else {
            fVar.h(i);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb10929565c117b961f8467b66123b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb10929565c117b961f8467b66123b2");
        } else if (str.equals("low")) {
            fVar.j(16000);
        } else if (str.equals("high")) {
            fVar.j(48000);
        }
    }

    public final void b(com.sankuai.meituan.mtlive.pusher.library.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35bab2827947c8fa5c07903335e37614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35bab2827947c8fa5c07903335e37614");
        } else {
            fVar.a(a(str));
        }
    }

    public final void c(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0132f766a183652ff247af9977e5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0132f766a183652ff247af9977e5b7");
            return;
        }
        this.k = i;
        fVar.a(i, this.l);
    }

    public final void d(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ee58328bd681027e98ced3e867341d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ee58328bd681027e98ced3e867341d");
            return;
        }
        this.l = i;
        fVar.a(this.k, i);
    }

    private Bitmap a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b7722964f302f5e6e91693f3ae12e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b7722964f302f5e6e91693f3ae12e4");
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(com.sankuai.meituan.mtlive.pusher.library.f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa3e03f296c089ea2844acbc64c2a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa3e03f296c089ea2844acbc64c2a7d");
        } else if (z) {
            fVar.c(3);
        } else {
            fVar.c(1);
        }
    }

    public final void c(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36731553a4c297b9ac4f32474cfa0950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36731553a4c297b9ac4f32474cfa0950");
        } else {
            hVar.b(z);
        }
    }

    public final void d(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7718809cd9a6c784c7a5ebb2a5ac0aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7718809cd9a6c784c7a5ebb2a5ac0aec");
        } else {
            hVar.d(!z ? 1 : 0);
        }
    }

    public final void a(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb4216e58e817e058b12a65f1b577a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb4216e58e817e058b12a65f1b577a8");
        } else {
            hVar.f().a(i);
        }
    }

    public final void b(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a98595b007588d233ebd76f09c8c2dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a98595b007588d233ebd76f09c8c2dd");
        } else {
            hVar.f().b(i);
        }
    }

    public final void c(com.sankuai.meituan.mtlive.pusher.library.f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ac73c9cc45de9ca3ad6d92a2075b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ac73c9cc45de9ca3ad6d92a2075b91");
        } else {
            fVar.i(z);
        }
    }

    public final void e(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5b3ebff0ecdc4c1943c4f97496437a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5b3ebff0ecdc4c1943c4f97496437a");
        } else {
            fVar.g(i);
        }
    }

    public final void f(com.sankuai.meituan.mtlive.pusher.library.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c09c4f6df971335c53ecf0b916e7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c09c4f6df971335c53ecf0b916e7b3");
        } else {
            fVar.e(i);
        }
    }

    public final void d(com.sankuai.meituan.mtlive.pusher.library.f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538f025cfac8104af4ecef244dce636c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538f025cfac8104af4ecef244dce636c");
        } else {
            fVar.e(z);
        }
    }

    public String getSrc() {
        return this.g;
    }

    public void setSrc(String str) {
        this.g = str;
    }

    public ReadableMap getAllParas() {
        return this.h;
    }

    public void setAllParas(ReadableMap readableMap) {
        this.h = readableMap;
    }
}
