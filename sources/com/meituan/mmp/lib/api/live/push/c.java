package com.meituan.mmp.lib.api.live.push;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.msi.view.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.MTLivePusherView;
import com.sankuai.meituan.mtlive.pusher.library.i;
import com.tencent.rtmp.TXLiveConstants;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends MTLivePusherView implements e {
    public static ChangeQuickRedirect a;
    public int b;
    public OrientationEventListener c;
    public RunnableC0397c d;
    public com.meituan.mmp.lib.api.live.push.a e;
    b f;
    public Handler g;
    private String h;
    private com.sankuai.meituan.mtlive.pusher.library.c i;
    private com.meituan.mmp.lib.interfaces.c j;
    private String k;
    private int l;
    private int m;
    private boolean n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i, String str, String str2);
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27f5cfe00b99ddacd9b383bf116ab2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27f5cfe00b99ddacd9b383bf116ab2d");
        } else if (this.e == null) {
        } else {
            if (i == 2 || i == 1) {
                this.e.c(true);
            } else if (i == 17 || i == 16) {
                this.e.c(false);
            }
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eccc3590297a19115c8c80343aa0a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eccc3590297a19115c8c80343aa0a2f");
        } else if (this.e == null) {
        } else {
            this.e.b();
        }
    }

    public void setToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1376a9406ef1d3dd3713ae3ceb6b5b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1376a9406ef1d3dd3713ae3ceb6b5b22");
            return;
        }
        this.h = str;
        if (this.e != null) {
            com.meituan.mmp.lib.api.live.push.a aVar = this.e;
            String str2 = this.h;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.live.push.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "dd3718a67aceef7c63d7ca7ea2a3785a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "dd3718a67aceef7c63d7ca7ea2a3785a");
            } else if (aVar.i != null) {
                aVar.i.c(str2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        PORTRAIT,
        LANDSCAPE,
        REVERSE_PORTRAIT,
        REVERSE_LANDSCAPE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16fb4e0fa67eb5b17e37017a1310b526", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16fb4e0fa67eb5b17e37017a1310b526");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ac2ec52b9137d942f025e24ed865bc4", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ac2ec52b9137d942f025e24ed865bc4") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abf17924dd9cd500f89b7444a4bad4b5", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abf17924dd9cd500f89b7444a4bad4b5") : (a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.live.push.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0397c implements Runnable {
        public static ChangeQuickRedirect a;
        public int b;
        public int c = 0;

        public RunnableC0397c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a90c73465c8348ba36a2c735e89a96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a90c73465c8348ba36a2c735e89a96");
                return;
            }
            this.c++;
            int rotationAngle = c.this.getRotationAngle();
            if (rotationAngle == this.b) {
                c.this.a(rotationAngle);
            } else if (this.c < 8) {
                c.this.g.postDelayed(this, 250L);
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83fc33642bed3c6bbf01288d240c6093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83fc33642bed3c6bbf01288d240c6093");
            return;
        }
        super.onConfigurationChanged(configuration);
        a(getRotationAngle());
    }

    public c(Context context, @NonNull com.meituan.mmp.lib.interfaces.c cVar, String str, int i, int i2) {
        super(context);
        Object[] objArr = {context, cVar, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcfbf136cac76b852c61fa3fcac221e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcfbf136cac76b852c61fa3fcac221e");
            return;
        }
        this.b = 0;
        this.d = new RunnableC0397c();
        this.g = new Handler(getContext().getMainLooper());
        this.n = false;
        this.j = cVar;
        this.k = str;
        this.l = i;
        this.m = i2;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "100b24e2defc0087a0ea019e9298c396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "100b24e2defc0087a0ea019e9298c396");
            return;
        }
        this.e = new com.meituan.mmp.lib.api.live.push.a(context, this.m);
        setBackgroundColor(-16777216);
        this.c = new OrientationEventListener(context) { // from class: com.meituan.mmp.lib.api.live.push.c.1
            public static ChangeQuickRedirect a;
            private int c = 45;
            private a d = a.NONE;

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i3) {
                Object[] objArr3 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "29356313acb61b0e54f0709d9bba80ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "29356313acb61b0e54f0709d9bba80ba");
                    return;
                }
                a aVar = this.d;
                if ((i3 >= 360 - this.c && i3 < 360) || (i3 >= 0 && i3 <= this.c + 0)) {
                    aVar = a.PORTRAIT;
                } else if (i3 >= 270 - this.c && i3 <= this.c + 270) {
                    aVar = a.LANDSCAPE;
                } else if (i3 >= 180 - this.c && i3 <= this.c + TXLiveConstants.RENDER_ROTATION_180) {
                    aVar = a.REVERSE_PORTRAIT;
                } else if (i3 >= 90 - this.c && i3 <= this.c + 90) {
                    aVar = a.REVERSE_LANDSCAPE;
                }
                if (aVar != this.d) {
                    if (this.d != a.NONE) {
                        switch (AnonymousClass6.a[this.d.ordinal()]) {
                            case 1:
                                c.this.d.c = 1;
                            case 2:
                                c.this.d.c = 0;
                            case 3:
                                c.this.d.c = 2;
                            case 4:
                                c.this.d.c = 3;
                                break;
                        }
                        c.this.d.c = 0;
                        c.this.g.removeCallbacks(c.this.d);
                        c.this.d.b = i3;
                        c.this.g.postDelayed(c.this.d, 250L);
                    }
                    this.d = aVar;
                }
            }
        };
        this.c.enable();
        a(getRotationAngle());
        setOnPushEventListener(new com.sankuai.meituan.mtlive.pusher.library.c() { // from class: com.meituan.mmp.lib.api.live.push.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.pusher.library.c
            public final void a(int i3, Bundle bundle) {
                Object[] objArr3 = {Integer.valueOf(i3), bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96a6efea476bb62913203472b22a46af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96a6efea476bb62913203472b22a46af");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errCode", i3);
                    jSONObject.put("livePusherId", c.this.k);
                    if (bundle != null) {
                        jSONObject.put("errMsg", bundle.getString("EVT_MSG"));
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str2 : bundle.keySet()) {
                            jSONObject2.put(str2, bundle.get(str2));
                        }
                        jSONObject.put("info", jSONObject2);
                    }
                } catch (JSONException unused) {
                }
                c.this.j.a("onLivePusherEvent", jSONObject, c.this.l);
                if (i3 < 0) {
                    String string = bundle != null ? bundle.getString("EVT_MSG", "出错了!!!") : "出错了!!!";
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    c cVar2 = c.this;
                    Object[] objArr4 = {Integer.valueOf(i3), string, ""};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "377f81c20388f1132cd62f438baad0c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "377f81c20388f1132cd62f438baad0c7");
                    } else if (cVar2.f != null) {
                        cVar2.f.a(i3, string, "");
                    }
                }
            }

            @Override // com.sankuai.meituan.mtlive.pusher.library.c
            public final void a(Bundle bundle) {
                Object[] objArr3 = {bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2437f6150ef8a29265cabe719dc8ec11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2437f6150ef8a29265cabe719dc8ec11");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("livePusherId", c.this.k);
                    JSONObject jSONObject2 = new JSONObject();
                    if (bundle != null) {
                        for (String str2 : bundle.keySet()) {
                            jSONObject2.put(str2, bundle.get(str2));
                        }
                    }
                    jSONObject.put("info", jSONObject2);
                } catch (JSONException unused) {
                }
                c.this.j.a("onLivePusherNetStatus", jSONObject, c.this.l);
            }
        });
        setBGMNotifyListener(new i.c() { // from class: com.meituan.mmp.lib.api.live.push.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
            public final void c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d21391ca0d6869f5bf2ef8d3c691eea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d21391ca0d6869f5bf2ef8d3c691eea");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("livePusherId", c.this.k);
                } catch (JSONException unused) {
                }
                c.this.j.a("onBGMStart", jSONObject, c.this.l);
            }

            @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
            public final void a(long j, long j2) {
                Object[] objArr3 = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dec68709c07524522723cf11499147f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dec68709c07524522723cf11499147f8");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, j);
                    jSONObject.put("duration", j2);
                    jSONObject.put("livePusherId", c.this.k);
                } catch (JSONException unused) {
                }
                c.this.j.a("onBGMProgress", jSONObject, c.this.l);
            }

            @Override // com.sankuai.meituan.mtlive.pusher.library.i.c
            public final void b(int i3) {
                Object[] objArr3 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41dddabdd3609e690ab3c09703d36c25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41dddabdd3609e690ab3c09703d36c25");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errCode", i3);
                    jSONObject.put("livePusherId", c.this.k);
                } catch (JSONException unused) {
                }
                c.this.j.a("onBGMComplete", jSONObject, c.this.l);
            }
        });
        setOnErrorListener(new b() { // from class: com.meituan.mmp.lib.api.live.push.c.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.live.push.c.b
            public final void a(int i3, String str2, String str3) {
                Object[] objArr3 = {Integer.valueOf(i3), str2, str3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82a5e151303cd8fba50b53c57fcc54b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82a5e151303cd8fba50b53c57fcc54b8");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errCode", i3);
                    jSONObject.put("errMsg", str2);
                    jSONObject.put("livePusherId", c.this.k);
                } catch (JSONException unused) {
                }
                c.this.j.a("onLivePusherError", jSONObject, c.this.l);
            }
        });
        this.e.i.a(new i.a() { // from class: com.meituan.mmp.lib.api.live.push.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.pusher.library.i.a
            public final void a(int i3) {
                Object[] objArr3 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a8808b175b3789c5a7b5d4c463e5241", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a8808b175b3789c5a7b5d4c463e5241");
                } else if (c.this.n) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("livePusherId", c.this.k);
                        jSONObject.put("volume", i3);
                    } catch (JSONException unused) {
                    }
                    c.this.j.a("onLivePusherAudioVolume", jSONObject, c.this.l);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52b629ee9c9f581cc5e1d0413c79859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52b629ee9c9f581cc5e1d0413c79859");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "129574b8b5e4e3782d7dca44600c5c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "129574b8b5e4e3782d7dca44600c5c9b");
        } else {
            com.meituan.mmp.lib.api.live.push.a aVar = this.e;
            if (aVar.n) {
                aVar.i.i();
                aVar.a();
                aVar.i.b();
                aVar.i.f();
                aVar.i.a((com.sankuai.meituan.mtlive.pusher.library.c) null);
                aVar.n = false;
            }
        }
        super.onDetachedFromWindow();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.live.push.c$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] a = new int[a.valuesCustom().length];

        static {
            try {
                a[a.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.REVERSE_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.REVERSE_LANDSCAPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRotationAngle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9acce9df02c7990d7d52d55079c1067", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9acce9df02c7990d7d52d55079c1067")).intValue() : ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b51d48b545c3fb120febaca691553c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b51d48b545c3fb120febaca691553c")).booleanValue();
        }
        if (i != this.b) {
            this.b = i;
            this.e.a(i);
            return true;
        }
        return false;
    }

    public final int a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d81079c9e22ef7680bc492df9cb895", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d81079c9e22ef7680bc492df9cb895")).intValue();
        }
        com.meituan.mmp.lib.api.live.push.a aVar = this.e;
        if (bundle == null) {
            return -1;
        }
        if (aVar.n) {
            aVar.a(bundle, false);
            this.n = bundle.getBoolean("needAudioVolume", this.n);
            String string = bundle.getString("pushUrl", aVar.k);
            if (string != null && !string.isEmpty() && aVar.k != null && !aVar.k.equalsIgnoreCase(string) && aVar.i.e()) {
                aVar.a();
                aVar.i.b();
                aVar.i.f();
            }
            aVar.k = string;
            aVar.c = bundle.getBoolean("autopush", aVar.c);
            if (!aVar.c || aVar.k == null || aVar.k.isEmpty() || aVar.i.e()) {
                return 0;
            }
            aVar.a(aVar.d);
            aVar.b(aVar.e);
            return aVar.i.a(aVar.k);
        }
        return -3;
    }

    public final int a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f5fb753631f3fb08148cc28de90395", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f5fb753631f3fb08148cc28de90395")).intValue() : this.e.a(str, jSONObject);
    }

    public void setOnPushEventListener(com.sankuai.meituan.mtlive.pusher.library.c cVar) {
        this.i = cVar;
        this.e.j = this.i;
    }

    public void setSnapshotListener(i.b bVar) {
        this.e.l = bVar;
    }

    public void setBGMNotifyListener(i.c cVar) {
        this.e.m = cVar;
    }

    public void setOnErrorListener(b bVar) {
        this.f = bVar;
    }

    public static Bundle a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7f7971693e7ca6fa9ca31a00323503c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7f7971693e7ca6fa9ca31a00323503c");
        }
        Bundle bundle = new Bundle();
        if (jSONObject.has("pushUrl")) {
            bundle.putString("pushUrl", jSONObject.optString("pushUrl"));
        }
        if (jSONObject.has("needAudioVolume")) {
            bundle.putBoolean("needAudioVolume", jSONObject.optBoolean("needAudioVolume"));
        }
        if (jSONObject.has(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            bundle.putInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE));
        }
        if (jSONObject.has("autopush")) {
            bundle.putBoolean("autopush", jSONObject.optBoolean("autopush"));
        }
        if (jSONObject.has("audioQuality")) {
            bundle.putString("audioQuality", jSONObject.optString("audioQuality"));
        }
        if (jSONObject.has("muted")) {
            bundle.putBoolean("muted", jSONObject.optBoolean("muted"));
        }
        if (jSONObject.has("enableCamera")) {
            bundle.putBoolean("enableCamera", jSONObject.optBoolean("enableCamera"));
        }
        if (jSONObject.has("enableMic")) {
            bundle.putBoolean("enableMic", jSONObject.optBoolean("enableMic"));
        }
        if (jSONObject.has("enableAGC")) {
            bundle.putBoolean("enableAGC", jSONObject.optBoolean("enableAGC"));
        }
        if (jSONObject.has("enableANS")) {
            bundle.putBoolean("enableANS", jSONObject.optBoolean("enableANS"));
        }
        if (jSONObject.has("audioVolumeType")) {
            bundle.putString("audioVolumeType", jSONObject.optString("audioVolumeType"));
        }
        if (jSONObject.has("audioReverbType")) {
            bundle.putInt("audioReverbType", jSONObject.optInt("audioReverbType"));
        }
        if (jSONObject.has("videoWidth")) {
            bundle.putInt("videoWidth", jSONObject.optInt("videoWidth"));
        }
        if (jSONObject.has("videoHeight")) {
            bundle.putInt("videoHeight", jSONObject.optInt("videoHeight"));
        }
        if (jSONObject.has("focusMode")) {
            bundle.putInt("focusMode", jSONObject.optInt("focusMode"));
        }
        if (jSONObject.has(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)) {
            bundle.putString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, jSONObject.optString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION));
        }
        if (jSONObject.has("beauty")) {
            bundle.putInt("beauty", jSONObject.optInt("beauty"));
        }
        if (jSONObject.has("whiteness")) {
            bundle.putInt("whiteness", jSONObject.optInt("whiteness"));
        }
        if (jSONObject.has("aspect")) {
            bundle.putInt("aspect", jSONObject.optInt("aspect"));
        }
        if (jSONObject.has("minBitrate")) {
            bundle.putInt("minBitrate", jSONObject.optInt("minBitrate"));
        }
        if (jSONObject.has("maxBitrate")) {
            bundle.putInt("maxBitrate", jSONObject.optInt("maxBitrate"));
        }
        if (jSONObject.has("backgroundMute")) {
            bundle.putBoolean("backgroundMute", jSONObject.optBoolean("backgroundMute"));
        }
        if (jSONObject.has("zoom")) {
            bundle.putBoolean("zoom", jSONObject.optBoolean("zoom"));
        }
        if (jSONObject.has("needEvent")) {
            bundle.putBoolean("needEvent", jSONObject.optBoolean("needEvent"));
        }
        if (jSONObject.has("debug")) {
            bundle.putBoolean("debug", jSONObject.optBoolean("debug"));
        }
        if (jSONObject.has("mirror")) {
            bundle.putBoolean("mirror", jSONObject.optBoolean("mirror"));
        }
        if (jSONObject.has("remoteMirror")) {
            bundle.putBoolean("remoteMirror", jSONObject.optBoolean("remoteMirror"));
        }
        if (jSONObject.has("localMirror")) {
            bundle.putString("localMirror", jSONObject.optString("localMirror"));
        }
        if (jSONObject.has("watermarkLeft")) {
            bundle.putFloat("watermarkLeft", BigDecimal.valueOf(jSONObject.optDouble("watermarkLeft")).floatValue());
        }
        if (jSONObject.has("watermarkTop")) {
            bundle.putFloat("watermarkTop", BigDecimal.valueOf(jSONObject.optDouble("watermarkTop")).floatValue());
        }
        if (jSONObject.has("watermarkWidth")) {
            bundle.putFloat("watermarkWidth", BigDecimal.valueOf(jSONObject.optDouble("watermarkWidth")).floatValue());
        }
        if (jSONObject.has("devicePosition")) {
            bundle.putString("devicePosition", jSONObject.optString("devicePosition"));
        }
        if (jSONObject.has("needBGMEvent")) {
            bundle.putBoolean("needBGMEvent", jSONObject.optBoolean("needBGMEvent"));
        }
        return bundle;
    }
}
