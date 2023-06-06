package com.meituan.msc.uimanager;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.modules.core.c;
import com.meituan.msc.mmpviews.image.MPRoundImageView;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msc.views.image.RCTRoundImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class UIImplementation {
    public static ChangeQuickRedirect c = null;
    public static int d = -10000;
    public static int e = -20000;
    public static int f = -30000;
    public static int g = -40000;
    private final String a;
    private boolean b;
    protected Object h;
    public final com.meituan.msc.uimanager.events.b i;
    protected final ReactApplicationContext j;
    protected final ag k;
    protected final av l;
    protected final UIViewOperationQueue m;
    protected final n n;
    protected final int[] o;
    protected final ArrayList<Integer> p;
    protected long q;
    protected i r;
    protected boolean s;
    protected volatile boolean t;
    protected volatile boolean u;
    public BroadcastReceiver v;

    public abstract void a(int i);

    public abstract void a(int i, ReadableArray readableArray);

    public abstract void a(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5);

    public abstract <T extends View> void a(T t, int i, ThemedReactContext themedReactContext);

    public void a(p pVar) {
    }

    public static /* synthetic */ JSONObject a(UIImplementation uIImplementation) throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, uIImplementation, changeQuickRedirect, false, "e6be1e711f469fe4eec1864c41c093cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, uIImplementation, changeQuickRedirect, false, "e6be1e711f469fe4eec1864c41c093cd");
        }
        Activity currentActivity = uIImplementation.j.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("currentActivity null!");
        }
        JSONObject jSONObject = new JSONObject();
        View findViewById = currentActivity.findViewById(1);
        if ((findViewById instanceof ViewGroup) && ((ViewGroup) findViewById).getChildCount() > 0) {
            a(findViewById, jSONObject);
            return jSONObject;
        }
        throw new com.meituan.msc.common.a("view null!");
    }

    public static /* synthetic */ JSONObject a(UIImplementation uIImplementation, Intent intent) throws Exception {
        aa c2;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, uIImplementation, changeQuickRedirect, false, "f2bca234214529bde6b280d725d37844", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, uIImplementation, changeQuickRedirect, false, "f2bca234214529bde6b280d725d37844");
        }
        JSONObject jSONObject = new JSONObject();
        int a = com.sankuai.waimai.platform.utils.f.a(intent, "nodeId", Integer.MIN_VALUE);
        if (a == Integer.MIN_VALUE || (c2 = uIImplementation.k.c(a)) == null) {
            return jSONObject;
        }
        jSONObject.put("rnTag", c2.p());
        jSONObject.put(CommonConstant.File.CLASS, c2.h());
        jSONObject.put("style", c2.f());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, com.meituan.android.msc.yoga.f.b(c2.D()) + Constants.GestureMoveEvent.KEY_X + com.meituan.android.msc.yoga.f.b(c2.E()));
        jSONObject2.put("offset", com.meituan.android.msc.yoga.f.b(c2.B()) + Constants.GestureMoveEvent.KEY_X + com.meituan.android.msc.yoga.f.b(c2.C()));
        jSONObject.put("layout", jSONObject2);
        return jSONObject;
    }

    public static /* synthetic */ JSONObject a(UIImplementation uIImplementation, Intent intent, boolean z) throws Exception {
        Object[] objArr = {intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, uIImplementation, changeQuickRedirect, false, "a6d4245a88081dcd8480c324429cc73f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, uIImplementation, changeQuickRedirect, false, "a6d4245a88081dcd8480c324429cc73f");
        }
        int a = uIImplementation.k.a();
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < a; i++) {
            a(uIImplementation.k.c(uIImplementation.k.e(i)), jSONObject, z, uIImplementation.k);
        }
        return jSONObject;
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, av avVar, ag agVar, UIViewOperationQueue uIViewOperationQueue, com.meituan.msc.uimanager.events.b bVar) {
        Object[] objArr = {reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e500f131b8a7519367ffe5100c35ed6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e500f131b8a7519367ffe5100c35ed6");
            return;
        }
        this.h = new Object();
        this.o = new int[4];
        this.p = new ArrayList<>();
        this.q = 0L;
        this.s = false;
        this.t = true;
        this.u = false;
        this.a = "UIImplementation@" + Integer.toHexString(hashCode());
        this.b = false;
        this.v = new BroadcastReceiver() { // from class: com.meituan.msc.uimanager.UIImplementation.1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, final Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "895f72371de44c85afd5c4cda92deed5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "895f72371de44c85afd5c4cda92deed5");
                    return;
                }
                final String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "cmd");
                Log.e("msc-dumpinfo", "cmd: " + a2);
                if ("printViewTree".equals(a2)) {
                    try {
                        JSONObject a3 = UIImplementation.a(UIImplementation.this);
                        Log.e("msc-dumpinfo", "cmd: " + a2 + " Thread: " + Thread.currentThread().hashCode());
                        a3.put("time", new Date().toString());
                        String json = new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement) new JsonParser().parse(a3.toString()).getAsJsonObject());
                        FileOutputStream fileOutputStream = new FileOutputStream(new File("/sdcard/msc_dump_view.json"));
                        fileOutputStream.write(json.getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        com.meituan.msc.modules.reporter.g.b(UIImplementation.this.a, th, "[onReceive]");
                        return;
                    }
                }
                UIImplementation.this.j.runOnNativeModulesQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.UIImplementation.1.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: Exception -> 0x01af, TryCatch #0 {Exception -> 0x01af, blocks: (B:7:0x0019, B:10:0x0030, B:32:0x0079, B:33:0x007c, B:41:0x013b, B:42:0x013e, B:34:0x0080, B:36:0x00a1, B:37:0x0114, B:38:0x011a, B:39:0x0125, B:40:0x0130, B:19:0x004c, B:22:0x0057, B:25:0x0062, B:28:0x006d), top: B:47:0x0019 }] */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: Exception -> 0x01af, TryCatch #0 {Exception -> 0x01af, blocks: (B:7:0x0019, B:10:0x0030, B:32:0x0079, B:33:0x007c, B:41:0x013b, B:42:0x013e, B:34:0x0080, B:36:0x00a1, B:37:0x0114, B:38:0x011a, B:39:0x0125, B:40:0x0130, B:19:0x004c, B:22:0x0057, B:25:0x0062, B:28:0x006d), top: B:47:0x0019 }] */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[Catch: Exception -> 0x01af, TryCatch #0 {Exception -> 0x01af, blocks: (B:7:0x0019, B:10:0x0030, B:32:0x0079, B:33:0x007c, B:41:0x013b, B:42:0x013e, B:34:0x0080, B:36:0x00a1, B:37:0x0114, B:38:0x011a, B:39:0x0125, B:40:0x0130, B:19:0x004c, B:22:0x0057, B:25:0x0062, B:28:0x006d), top: B:47:0x0019 }] */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0125 A[Catch: Exception -> 0x01af, TryCatch #0 {Exception -> 0x01af, blocks: (B:7:0x0019, B:10:0x0030, B:32:0x0079, B:33:0x007c, B:41:0x013b, B:42:0x013e, B:34:0x0080, B:36:0x00a1, B:37:0x0114, B:38:0x011a, B:39:0x0125, B:40:0x0130, B:19:0x004c, B:22:0x0057, B:25:0x0062, B:28:0x006d), top: B:47:0x0019 }] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x0130 A[Catch: Exception -> 0x01af, TryCatch #0 {Exception -> 0x01af, blocks: (B:7:0x0019, B:10:0x0030, B:32:0x0079, B:33:0x007c, B:41:0x013b, B:42:0x013e, B:34:0x0080, B:36:0x00a1, B:37:0x0114, B:38:0x011a, B:39:0x0125, B:40:0x0130, B:19:0x004c, B:22:0x0057, B:25:0x0062, B:28:0x006d), top: B:47:0x0019 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 462
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.UIImplementation.AnonymousClass1.RunnableC04821.run():void");
                    }
                });
            }
        };
        this.j = reactApplicationContext;
        this.l = avVar;
        this.k = agVar;
        this.m = uIViewOperationQueue;
        this.n = new n(this.m, this.k, this.j == null ? null : this.j.getRuntimeDelegate());
        this.i = bVar;
        this.s = this instanceof com.meituan.msc.uimanager.list.c;
    }

    public final ReactApplicationContext e() {
        return this.j;
    }

    public final av f() {
        return this.l;
    }

    public final UIViewOperationQueue g() {
        return this.m;
    }

    public aa a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f732e4970b0d77fcfcefa068e1d64d", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f732e4970b0d77fcfcefa068e1d64d");
        }
        aa a = this.l.a(str).a(i, this.j);
        a.b(str);
        a.c(str);
        a.g(i2);
        return a;
    }

    public final aa b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de1c3940eadda75914dae31131d32b7", RobustBitConfig.DEFAULT_VALUE) ? (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de1c3940eadda75914dae31131d32b7") : this.k.c(i);
    }

    public final UIViewOperationQueue h() {
        return this.m;
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062cc19fa984aac867afdb5e34c6323d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062cc19fa984aac867afdb5e34c6323d");
            return;
        }
        aa c2 = this.k.c(i);
        if (c2 == null) {
            com.meituan.msc.modules.reporter.g.e(this.a, "[updateRootView] Tried to update non-existent root tag: ", Integer.valueOf(i));
            return;
        }
        Object[] objArr2 = {c2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2584a5725abbc4fe705404b481e64d40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2584a5725abbc4fe705404b481e64d40");
        } else {
            c2.a(i2, i3);
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee5b3da0d518ef05533f3f2975dc0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee5b3da0d518ef05533f3f2975dc0cf");
            return;
        }
        String str = this.a;
        com.meituan.msc.modules.reporter.g.d(str, "[removeRootView] rootViewTag: " + i);
        d(i);
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "017412a3a897b85c012cd8bbebe63cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "017412a3a897b85c012cd8bbebe63cc0");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.p(i));
        }
    }

    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6b2fcdbfe12ffb559d05c5cb3c733f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6b2fcdbfe12ffb559d05c5cb3c733f");
            return;
        }
        synchronized (this.h) {
            this.k.c(i);
            this.k.a(i);
            String str = this.a;
            com.meituan.msc.modules.reporter.g.d(str, "[removeRootShadowNode]", "rootNodeTag: " + i);
        }
    }

    public final void b(int i, int i2, int i3) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8626bece1458ede46739e6bd60a12d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8626bece1458ede46739e6bd60a12d7");
            return;
        }
        aa c2 = this.k.c(i);
        if (c2 == null) {
            com.meituan.msc.modules.reporter.g.e(this.a, "[updateNodeSize] Tried to update size of non-existent tag: ", Integer.valueOf(i));
            return;
        }
        c2.a(i2);
        c2.b(i3);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f5f379f7e15ef2841c9334cd10f6baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f5f379f7e15ef2841c9334cd10f6baf");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr3, uIViewOperationQueue, changeQuickRedirect3, false, "70fbf76a3a1b8ab61bbe68c76e11aca8", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, uIViewOperationQueue, changeQuickRedirect3, false, "70fbf76a3a1b8ab61bbe68c76e11aca8")).booleanValue();
        } else if (uIViewOperationQueue.e.isEmpty() && uIViewOperationQueue.d.isEmpty()) {
            z = true;
        }
        if (z) {
            int i4 = d;
            d = i4 - 1;
            f(i4);
        }
    }

    public void a(int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd74cb16a02f15a99bcdb73d5658c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd74cb16a02f15a99bcdb73d5658c69");
        } else if (this.t) {
            synchronized (this.h) {
                if (!this.p.contains(Integer.valueOf(i2))) {
                    this.p.add(Integer.valueOf(i2));
                }
                aa a = a(i, i2, str);
                a.f(i);
                if (readableMap != null && readableMap.hasKey("is")) {
                    a.c(readableMap.getString("is"));
                }
                if (i2 != i) {
                    aa c2 = this.k.c(i2);
                    com.facebook.infer.annotation.a.a(c2, "Root node with tag " + i2 + " doesn't exist");
                    a.a(c2.t());
                }
                this.k.b(a);
                ab abVar = null;
                if (readableMap != null) {
                    abVar = new ab(readableMap);
                    a.a(abVar);
                }
                a(a, i2, abVar);
            }
        }
    }

    public final void a(aa aaVar, int i, @Nullable ab abVar) {
        Object[] objArr = {aaVar, Integer.valueOf(i), abVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ed256afc1172ac93b5c2c852244911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ed256afc1172ac93b5c2c852244911");
        } else if (aaVar.b()) {
        } else {
            this.n.a(aaVar, aaVar.t(), abVar);
        }
    }

    public final void a(int i, String str, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b88b939781352f46ca8b8ef27a07a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b88b939781352f46ca8b8ef27a07a32");
        } else if (this.t) {
            PerfTrace.begin("update_shadow_properties").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
            if (this.l.a(str) == null) {
                throw new g("Got unknown view type: " + str);
            }
            aa c2 = this.k.c(i);
            if (c2 == null) {
                com.meituan.msc.modules.reporter.g.b(this.a, null, "[updateView] Trying to update non-existent view with tag ", Integer.valueOf(i), str, Boolean.valueOf(this.u));
            } else if (readableMap != null) {
                ab abVar = new ab(readableMap);
                c2.a(abVar);
                PerfTrace.end("update_shadow_properties").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
                if (c2.b()) {
                    return;
                }
                this.n.a(c2, str, abVar);
            } else {
                PerfTrace.end("update_shadow_properties").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
            }
        }
    }

    public final void a(int i, ab abVar) {
        Object[] objArr = {Integer.valueOf(i), abVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c9742692546675d964d989da82f9aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c9742692546675d964d989da82f9aa6");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.m.a().a(i, "", abVar);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4e3aeaf8a5d8ad9accea9583534cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4e3aeaf8a5d8ad9accea9583534cfb");
        } else if (this.k.d(i) || this.k.d(i2)) {
            throw new g("Trying to add or replace a root tag!");
        } else {
            aa c2 = this.k.c(i);
            if (c2 == null) {
                throw new g("Trying to replace unknown view tag: " + i);
            }
            aa r = c2.r();
            if (r == null) {
                throw new g("Node is not attached to a parent: " + i);
            }
            int a = r.a(c2);
            if (a < 0) {
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i2);
            WritableArray createArray2 = Arguments.createArray();
            createArray2.pushInt(a);
            WritableArray createArray3 = Arguments.createArray();
            createArray3.pushInt(a);
            a(r.p(), null, null, createArray, createArray2, createArray3);
        }
    }

    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b0c5f377a73822f79dd02ac75c29f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b0c5f377a73822f79dd02ac75c29f4");
            return;
        }
        aa c2 = this.k.c(i);
        if (c2 == null) {
            throw new g("Trying to remove subviews of an unknown view tag: " + i);
        }
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < c2.m(); i2++) {
            createArray.pushInt(i2);
        }
        a(i, null, null, null, null, createArray);
    }

    public final void a(int i, float f2, float f3, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f664bc415f949531ef9efe1b4b443d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f664bc415f949531ef9efe1b4b443d41");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), callback};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "8d778a6f593dbd6b440adc0ab9bb1f8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "8d778a6f593dbd6b440adc0ab9bb1f8f");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.i(i, f2, f3, callback));
        }
    }

    @Deprecated
    public final void a(int i, int i2, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82945f6bc31c05cee4065ca6de30b647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82945f6bc31c05cee4065ca6de30b647");
            return;
        }
        aa c2 = this.k.c(i);
        aa c3 = this.k.c(i2);
        if (c2 == null || c3 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(c2.d(c3)));
        }
    }

    public final void a(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81c4745d75420ace962a1f43ea464dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81c4745d75420ace962a1f43ea464dc");
        } else if (this.t) {
            UIViewOperationQueue uIViewOperationQueue = this.m;
            Object[] objArr2 = {Integer.valueOf(i), callback};
            ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
            if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "032ff6fc780ab65abea86ad29c6c880d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "032ff6fc780ab65abea86ad29c6c880d");
            } else {
                uIViewOperationQueue.b(new UIViewOperationQueue.m(i, callback));
            }
        }
    }

    public final void b(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83438615dc08008f88c3b670f3c13202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83438615dc08008f88c3b670f3c13202");
        } else if (this.t) {
            UIViewOperationQueue uIViewOperationQueue = this.m;
            Object[] objArr2 = {Integer.valueOf(i), callback};
            ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
            if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "5b98dd8f6c720a3b2d91d37144ff26ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "5b98dd8f6c720a3b2d91d37144ff26ff");
            } else {
                uIViewOperationQueue.b(new UIViewOperationQueue.l(i, callback));
            }
        }
    }

    public final void a(int i, int i2, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589e3353b72f0faaa377a46083d0948c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589e3353b72f0faaa377a46083d0948c");
        } else if (this.t) {
            try {
                a(i, i2, this.o);
                callback2.invoke(Float.valueOf(s.c(this.o[0])), Float.valueOf(s.c(this.o[1])), Float.valueOf(s.c(this.o[2])), Float.valueOf(s.c(this.o[3])));
            } catch (g e2) {
                callback.invoke(e2.getMessage());
            }
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7bfba05825d32b4f4ca59d95f2aa735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7bfba05825d32b4f4ca59d95f2aa735");
            return;
        }
        this.m.a(-1, SystemClock.uptimeMillis(), this.q);
    }

    public final void a(int i, Callback callback, Callback callback2) {
        int i2;
        Object[] objArr = {Integer.valueOf(i), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38f7d2efa6eabf612d511ce84be2619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38f7d2efa6eabf612d511ce84be2619");
        } else if (!this.t) {
        } else {
            try {
                int[] iArr = this.o;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i);
                i2 = 1;
                try {
                    objArr2[1] = iArr;
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "716bf0cdf6728d26dc64982f2f66d4db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "716bf0cdf6728d26dc64982f2f66d4db");
                    } else {
                        aa c2 = this.k.c(i);
                        if (c2 == null) {
                            throw new g("No native view for tag " + i + " exists!");
                        }
                        aa r = c2.r();
                        if (r == null) {
                            throw new g("View with tag " + i + " doesn't have a parent!");
                        }
                        a(c2, r, iArr);
                    }
                    float c3 = s.c(this.o[0]);
                    float c4 = s.c(this.o[1]);
                    float c5 = s.c(this.o[2]);
                    float c6 = s.c(this.o[3]);
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = Float.valueOf(c3);
                    Float valueOf = Float.valueOf(c4);
                    i2 = 1;
                    objArr3[1] = valueOf;
                    objArr3[2] = Float.valueOf(c5);
                    objArr3[3] = Float.valueOf(c6);
                    callback2.invoke(objArr3);
                } catch (g e2) {
                    e = e2;
                    Object[] objArr4 = new Object[i2];
                    objArr4[0] = e.getMessage();
                    callback.invoke(objArr4);
                }
            } catch (g e3) {
                e = e3;
                i2 = 1;
            }
        }
    }

    public final void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8587f1ca734f44d9d08ef93985e13d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8587f1ca734f44d9d08ef93985e13d55");
            return;
        }
        com.meituan.msc.systrace.b.a(0L, "UIImplementation.dispatchViewUpdates");
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            a(i);
            this.n.a();
            this.m.a(i, uptimeMillis, this.q);
        } finally {
            com.meituan.msc.systrace.a.a(0L);
            this.j.getRuntimeDelegate().getRenderPerf().b(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH, i);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5ed144ef3ee5dd80abdc502fffbb7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5ed144ef3ee5dd80abdc502fffbb7e");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "bde47e26785d98dea5baa5c88ec12f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "bde47e26785d98dea5baa5c88ec12f97");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.r(z));
        }
    }

    public final void a(ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7073a952119ebf60c0e430965fee3c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7073a952119ebf60c0e430965fee3c00");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "005d28453f61d97be596fc64c49c0d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "005d28453f61d97be596fc64c49c0d64");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.b(readableMap, callback));
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4c865f77940fa0f29f5deaa96539d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4c865f77940fa0f29f5deaa96539d0");
            return;
        }
        aa c2 = this.k.c(i);
        if (c2 == null) {
            return;
        }
        while (c2.A() == m.NONE) {
            c2 = c2.r();
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        int p = c2.p();
        Object[] objArr2 = {Integer.valueOf(p), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "11f6b7fa671e2027f738c75a4e12850a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "11f6b7fa671e2027f738c75a4e12850a");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.a(p, i, false, z));
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde17b71db76833a97e440904f43063f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde17b71db76833a97e440904f43063f");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "1a5b40ab5be69e8c7ba223540b8a5e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "1a5b40ab5be69e8c7ba223540b8a5e93");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.a(0, 0, true, false));
        }
    }

    @Deprecated
    public final void a(int i, int i2, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d05876510745a4e0267c3b57b486b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d05876510745a4e0267c3b57b486b48");
        } else if (this.t) {
            try {
                a(i, "dispatchViewManagerCommand");
                UIViewOperationQueue uIViewOperationQueue = this.m;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
                ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
                if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "54043632815e84647b3350ea2f52b4e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "54043632815e84647b3350ea2f52b4e8");
                    return;
                }
                UIViewOperationQueue.e eVar = new UIViewOperationQueue.e(i, i2, readableArray);
                if (uIViewOperationQueue.c) {
                    uIViewOperationQueue.d.add(eVar);
                } else {
                    uIViewOperationQueue.e.add(eVar);
                }
            } catch (Exception e2) {
                this.j.getRuntimeDelegate().handleException(e2);
            }
        }
    }

    public final void a(int i, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c404d6ba32ad336910b4deeb924e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c404d6ba32ad336910b4deeb924e42");
        } else if (this.t) {
            try {
                a(i, "dispatchViewManagerCommand");
                UIViewOperationQueue uIViewOperationQueue = this.m;
                Object[] objArr2 = {Integer.valueOf(i), str, readableArray};
                ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
                if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "f54ef6adf9f5ebc17b49e016302d9200", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "f54ef6adf9f5ebc17b49e016302d9200");
                    return;
                }
                UIViewOperationQueue.g gVar = new UIViewOperationQueue.g(i, str, readableArray);
                if (uIViewOperationQueue.c) {
                    uIViewOperationQueue.d.add(gVar);
                } else {
                    uIViewOperationQueue.e.add(gVar);
                }
            } catch (Exception e2) {
                this.j.getRuntimeDelegate().handleException(e2);
            }
        }
    }

    public final void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), readableArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683dad2ba941cc6b93a5ea4776c3ea2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683dad2ba941cc6b93a5ea4776c3ea2c");
            return;
        }
        a(i, "showPopupMenu");
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {Integer.valueOf(i), readableArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "0d968721f50cb2bad2b858def4a37caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "0d968721f50cb2bad2b858def4a37caa");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.s(i, readableArray, callback, callback2));
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87171e6c49029c1d995d2b81b1a8e82c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87171e6c49029c1d995d2b81b1a8e82c");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "052083e5204011c7bc27cc7002eb42fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "052083e5204011c7bc27cc7002eb42fe");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.d());
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d716aee7c8d88676599938a6776c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d716aee7c8d88676599938a6776c1c");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "674001bccdc1f60afcf5c7d797a77687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "674001bccdc1f60afcf5c7d797a77687");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.q(i, i2));
        }
    }

    public final void a(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableArray, readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7acc77407e83194974e372851d6ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7acc77407e83194974e372851d6ad1");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {readableArray, readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "5dc821b987d2f41f5be5b6648d074ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "5dc821b987d2f41f5be5b6648d074ec8");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.n(readableArray, readableMap, callback));
        }
    }

    public final void b(ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd55f6d63009c22c6eafea57229c6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd55f6d63009c22c6eafea57229c6fb");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "e8074573f069c89a1865e18e068fcaac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "e8074573f069c89a1865e18e068fcaac");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.o(readableMap, callback));
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "613527c0968d9907a83935f24fb73e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "613527c0968d9907a83935f24fb73e30");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "f336c640f7a7da4543c281b4038928f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "f336c640f7a7da4543c281b4038928f5");
            return;
        }
        uIViewOperationQueue.f = true;
        com.meituan.msc.jse.modules.core.c.b().a(c.a.DISPATCH_UI, uIViewOperationQueue.b);
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17394fe2cfdd9dd580166d0f46caf3f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17394fe2cfdd9dd580166d0f46caf3f0");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "a0373f9a10f517a4e19758dbcdc74a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "a0373f9a10f517a4e19758dbcdc74a91");
            return;
        }
        uIViewOperationQueue.f = false;
        com.meituan.msc.jse.modules.core.c.b().b(c.a.DISPATCH_UI, uIViewOperationQueue.b);
        uIViewOperationQueue.b();
    }

    public final void n() {
        this.t = false;
    }

    public final void o() {
        this.u = true;
    }

    public final void a(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f63686bfb2583b20fd89a32399c6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f63686bfb2583b20fd89a32399c6fe");
        } else if (aaVar != null) {
            e(aaVar);
            aa r = aaVar.r();
            if (r != null) {
                for (int m = r.m() - 1; m >= 0; m--) {
                    if (r.e(m) == aaVar) {
                        r.c(m);
                        return;
                    }
                }
            }
        }
    }

    private void e(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf63c3e995de768b971428e373a3f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf63c3e995de768b971428e373a3f35");
            return;
        }
        n.a(aaVar);
        this.k.b(aaVar.p());
        for (int m = aaVar.m() - 1; m >= 0; m--) {
            e(aaVar.e(m));
        }
        aaVar.o();
    }

    private void a(int i, int i2, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8765fc6b829a80e0781d26fd3bd2b759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8765fc6b829a80e0781d26fd3bd2b759");
            return;
        }
        aa c2 = this.k.c(i);
        aa c3 = this.k.c(i2);
        if (c2 == null || c3 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (c2 != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new g(sb.toString());
        }
        if (c2 != c3) {
            for (aa r = c2.r(); r != c3; r = r.r()) {
                if (r == null) {
                    throw new g("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        a(c2, c3, iArr);
    }

    private void a(aa aaVar, aa aaVar2, int[] iArr) {
        int i;
        int i2;
        Object[] objArr = {aaVar, aaVar2, iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0173b617a2b315381ee3c57af75a8968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0173b617a2b315381ee3c57af75a8968");
            return;
        }
        if (aaVar != aaVar2) {
            i = Math.round(aaVar.B());
            i2 = Math.round(aaVar.C());
            for (aa r = aaVar.r(); r != aaVar2; r = r.r()) {
                com.facebook.infer.annotation.a.a(r);
                f(r);
                i += Math.round(r.B());
                i2 += Math.round(r.C());
            }
            f(aaVar2);
        } else {
            i = 0;
            i2 = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = aaVar.H();
        iArr[3] = aaVar.I();
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c143332e593eabd93f38b454b3eb8219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c143332e593eabd93f38b454b3eb8219");
        } else if (this.k.c(i) != null) {
        } else {
            g gVar = new g("Unable to execute operation " + str + " on view, since the view does not exists");
            com.meituan.msc.modules.reporter.g.b(this.a, gVar, "[assertViewExists] reactTag:", Integer.valueOf(i));
            throw gVar;
        }
    }

    private void f(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf6bfe3c6d64f57a31e1db8cace238d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf6bfe3c6d64f57a31e1db8cace238d");
            return;
        }
        as asVar = (as) com.facebook.infer.annotation.a.a(this.l.a(aaVar.i()));
        if (asVar instanceof f) {
            f fVar = (f) asVar;
            if (fVar == null || !fVar.h()) {
                return;
            }
            throw new g("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + aaVar.i() + "). Use measure instead.");
        }
        throw new g("Trying to use view " + aaVar.i() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    public final void b(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9908fd117f8f057e18add273014dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9908fd117f8f057e18add273014dbe");
        } else if (aaVar.k()) {
            for (int i = 0; i < aaVar.m(); i++) {
                b(aaVar.e(i));
            }
            aaVar.a(this.n);
        }
    }

    public void c(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206908bd0233790d5bbc356dc30a4e20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206908bd0233790d5bbc356dc30a4e20");
            return;
        }
        com.meituan.msc.systrace.b.a(0L, "cssRoot.calculateLayout");
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = aaVar.L().intValue();
            int intValue2 = aaVar.M().intValue();
            float f2 = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f2 = View.MeasureSpec.getSize(intValue2);
            }
            aaVar.a(size, f2);
        } finally {
            com.meituan.msc.systrace.a.a(0L);
            this.q = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public final void a(am amVar) {
        Object[] objArr = {amVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be13a6a021f965642443cb52cc3eb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be13a6a021f965642443cb52cc3eb9e");
            return;
        }
        UIViewOperationQueue uIViewOperationQueue = this.m;
        Object[] objArr2 = {amVar};
        ChangeQuickRedirect changeQuickRedirect2 = UIViewOperationQueue.a;
        if (PatchProxy.isSupport(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "e31f84b0e8edd5992b66eb01e4970016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, uIViewOperationQueue, changeQuickRedirect2, false, "e31f84b0e8edd5992b66eb01e4970016");
        } else {
            uIViewOperationQueue.b(new UIViewOperationQueue.t(amVar));
        }
    }

    @Deprecated
    public final View g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04dc74c69bd62e0cc497a8a6d23fb14", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04dc74c69bd62e0cc497a8a6d23fb14") : this.m.a().a(i);
    }

    public final View h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909a0b7c3418e3e04c6eb9cd4798eb0e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909a0b7c3418e3e04c6eb9cd4798eb0e") : this.m.a().b(i);
    }

    public final ag p() {
        return this.k;
    }

    public final int d(aa aaVar) {
        int i = 1;
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d2da7608634481bd3105f22d2c830c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d2da7608634481bd3105f22d2c830c")).intValue();
        }
        if (aaVar == null) {
            return 0;
        }
        for (int i2 = 0; i2 < aaVar.m(); i2++) {
            i += d(aaVar.e(i2));
        }
        return i;
    }

    private static void a(View view, JSONObject jSONObject) throws Exception {
        int i = 0;
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d781454c7166feef18f350dd3882b933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d781454c7166feef18f350dd3882b933");
            return;
        }
        jSONObject.put("id", view.getId());
        jSONObject.put("className", view.getClass().getSimpleName());
        if (view instanceof TextView) {
            jSONObject.put("text", ((TextView) view).getText());
        }
        if (view instanceof MPRoundImageView) {
            Uri uri = ((MPRoundImageView) view).getImageSource().b;
            jSONObject.put(RaptorUploaderImpl.SRC, uri == null ? null : uri.toString());
        }
        if (view instanceof RCTRoundImageView) {
            Uri uri2 = ((RCTRoundImageView) view).getImageSource().b;
            jSONObject.put(RaptorUploaderImpl.SRC, uri2 != null ? uri2.toString() : null);
        }
        jSONObject.put("WxH", view.getWidth() + Constants.GestureMoveEvent.KEY_X + view.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        jSONObject.put("location", iArr[0] + Constants.GestureMoveEvent.KEY_X + iArr[1]);
        JSONArray jSONArray = new JSONArray();
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i < viewGroup.getChildCount()) {
                JSONObject jSONObject2 = new JSONObject();
                a(viewGroup.getChildAt(i), jSONObject2);
                jSONArray.put(jSONObject2);
                i++;
            } else {
                jSONObject.put("children", jSONArray);
                return;
            }
        }
    }

    private static void a(aa aaVar, JSONObject jSONObject, boolean z, ag agVar) throws Exception {
        JSONArray jSONArray;
        Object[] objArr = {aaVar, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), agVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61343ef5de268822ea63cf992c93962f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61343ef5de268822ea63cf992c93962f");
            return;
        }
        jSONObject.put("rnTag", aaVar.p());
        jSONObject.put(Constants.EventType.VIEW, aaVar.i());
        jSONObject.put("viewTag", aaVar.j());
        jSONObject.put(CommonConstant.File.CLASS, aaVar.h());
        jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, com.meituan.android.msc.yoga.f.b(aaVar.D()) + Constants.GestureMoveEvent.KEY_X + com.meituan.android.msc.yoga.f.b(aaVar.E()));
        jSONObject.put("offset", com.meituan.android.msc.yoga.f.b(aaVar.B()) + Constants.GestureMoveEvent.KEY_X + com.meituan.android.msc.yoga.f.b(aaVar.C()));
        if (z) {
            List<aa> b = aaVar.b(agVar);
            if (b == null || b.size() == 0) {
                return;
            }
            jSONArray = new JSONArray();
            for (aa aaVar2 : b) {
                JSONObject jSONObject2 = new JSONObject();
                a(aaVar2, jSONObject2, true, agVar);
                jSONArray.put(jSONObject2);
            }
        } else if (aaVar.m() == 0) {
            return;
        } else {
            jSONArray = new JSONArray();
            for (int i = 0; i < aaVar.m(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                a(aaVar.e(i), jSONObject3, false, agVar);
                jSONArray.put(jSONObject3);
            }
        }
        jSONObject.put("children", jSONArray);
    }
}
