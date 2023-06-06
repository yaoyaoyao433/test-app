package com.meituan.android.legwork;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.legwork.bean.monitor.Link;
import com.meituan.android.legwork.bean.monitor.LinkMonitorConfigBean;
import com.meituan.android.legwork.common.location.BaseLocationManager;
import com.meituan.android.legwork.common.location.c;
import com.meituan.android.legwork.common.push.LegworkPushReceiver;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.common.util.a;
import com.meituan.android.legwork.common.util.d;
import com.meituan.android.legwork.common.util.e;
import com.meituan.android.legwork.monitor.BaseMonitorManager;
import com.meituan.android.legwork.ui.abactivity.LegworkMainActivity;
import com.meituan.android.legwork.ui.abbase.ABBaseActivity;
import com.meituan.android.legwork.ui.abfragment.LazyLoadHelperFragment;
import com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment;
import com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.ui.base.BaseActivity;
import com.meituan.android.legwork.ui.component.main.ComponentMainBPageAdapter;
import com.meituan.android.legwork.utils.aa;
import com.meituan.android.legwork.utils.h;
import com.meituan.android.legwork.utils.i;
import com.meituan.android.legwork.utils.m;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.r;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static Application c = null;
    public static WeakReference<Activity> d = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context e = null;
    private static boolean f = false;

    public static /* synthetic */ boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eecc11fb7ea9f54956a66adb6c2af944", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eecc11fb7ea9f54956a66adb6c2af944")).booleanValue();
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return false;
        }
        Uri data = activity.getIntent().getData();
        return TextUtils.equals(data.getQueryParameter("mrn_biz"), "banma") && com.meituan.android.legwork.mrn.b.c.contains(data.getQueryParameter("mrn_entry"));
    }

    public static /* synthetic */ void b(Activity activity) {
        String path;
        boolean z = true;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "463e9730a79b370b6b4de3c700e07a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "463e9730a79b370b6b4de3c700e07a7b");
            return;
        }
        q a2 = q.a();
        if (!((a2.c == null || (a2.c.monitorFlags & 8) <= 0) ? false : false) || activity == null || activity.getIntent() == null) {
            return;
        }
        if (activity.getIntent().getData() == null) {
            ComponentName component = activity.getIntent().getComponent();
            path = component != null ? component.getClassName() : "componentName is null";
        } else if ((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity)) {
            if (PmUtil.a() == 3) {
                String path2 = activity.getIntent().getData().getPath();
                path = TextUtils.isEmpty(path2) ? activity.getIntent().getData().getHost() : path2;
            } else {
                path = activity.getIntent().getData().getPath();
            }
        } else {
            path = activity.getIntent().getData().getQueryParameter("mrn_component");
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("pageName", path);
        q.a("legwork_activity_recovery", 8, hashMap);
    }

    public static void a(AppCompatActivity appCompatActivity) {
        Object[] objArr = {appCompatActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68966f7179e6a355d71f394a5b30739b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68966f7179e6a355d71f394a5b30739b");
        } else if (f) {
        } else {
            final Context applicationContext = appCompatActivity.getApplicationContext();
            appCompatActivity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.legwork.a.1
                public static ChangeQuickRedirect a;
                public final aa b;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                {
                    this.b = new aa(applicationContext);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6dc39d4838e51678b259fad9e102ad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6dc39d4838e51678b259fad9e102ad0");
                    } else if ((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity) || a.a(activity)) {
                        m mVar = m.a.a;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = m.a;
                        if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "4ef05d6dede1ea9a808722ef4345f34d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "4ef05d6dede1ea9a808722ef4345f34d");
                        } else {
                            mVar.b++;
                        }
                        if (bundle != null) {
                            a.b(activity);
                            x.d("LegworkApplication.onActivityCreated()", "activity 回收重建");
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "214804381cb4c8b7f76609928da08493", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "214804381cb4c8b7f76609928da08493");
                        return;
                    }
                    if ((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity) || a.a(activity)) {
                        i.a(activity);
                    }
                    m mVar = m.a.a;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = m.a;
                    if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "6a3a5807364bc834f9b169ed7d34bf0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "6a3a5807364bc834f9b169ed7d34bf0d");
                        return;
                    }
                    mVar.c++;
                    if (mVar.d && mVar.b > 0 && com.meituan.android.legwork.common.util.a.a().c()) {
                        x.c("LegworkActivityManager.onActivityStarted", "start jarvis looper when app foreground");
                        com.meituan.android.legwork.common.jarvis.a.a().b();
                    }
                    mVar.d = false;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac458ef6a5c8dce49e8bfd4ccfd70c41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac458ef6a5c8dce49e8bfd4ccfd70c41");
                        return;
                    }
                    if (a.d == null || a.d.get() != activity) {
                        a.d = new WeakReference<>(activity);
                    }
                    if (((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity) || a.a(activity)) && !aa.b) {
                        aa aaVar = this.b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = aa.a;
                        if (PatchProxy.isSupport(objArr3, aaVar, changeQuickRedirect3, false, "91492072fb503c798297486e5d708f0a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aaVar, changeQuickRedirect3, false, "91492072fb503c798297486e5d708f0a");
                            return;
                        }
                        aaVar.c = new aa.a(new Handler(Looper.getMainLooper()));
                        try {
                            aaVar.d.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, aaVar.c);
                        } catch (Exception e2) {
                            x.e("ScreenShotListenManager.startListen()", "registerContentObserver error,exception msg:", e2);
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6df7e4e15afd2417cc56ac0d1a90249", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6df7e4e15afd2417cc56ac0d1a90249");
                    } else if ((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity) || a.a(activity)) {
                        aa aaVar = this.b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = aa.a;
                        if (PatchProxy.isSupport(objArr3, aaVar, changeQuickRedirect3, false, "cfb433418a11da4d29688e4139002a16", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aaVar, changeQuickRedirect3, false, "cfb433418a11da4d29688e4139002a16");
                            return;
                        }
                        try {
                            if (aaVar.c != null) {
                                aaVar.d.getContentResolver().unregisterContentObserver(aaVar.c);
                                aaVar.c = null;
                            }
                        } catch (Exception e2) {
                            x.e("ScreenShotListenManager.stopListen()", "unregisterContentObserver error,exception msg:", e2);
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d5782b6dc57792538a3a2cde729bbd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d5782b6dc57792538a3a2cde729bbd5");
                        return;
                    }
                    if ((activity instanceof BaseActivity) || (activity instanceof ABBaseActivity) || a.a(activity)) {
                        m mVar = m.a.a;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = m.a;
                        if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "5d4903868d79576b6ab1bd79224a47b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "5d4903868d79576b6ab1bd79224a47b9");
                        } else {
                            mVar.b--;
                            if (mVar.b <= 0) {
                                if (q.a().b) {
                                    BaseMonitorManager.getInstance().setAutoReport(false);
                                    BaseMonitorManager.getInstance().start(a.a());
                                    BaseMonitorManager.getInstance().stop(a.a());
                                }
                                if (com.meituan.android.legwork.common.util.a.a().c()) {
                                    x.c("LegworkActivityManager.removeActivity", "stop jarvis looper when exit legwork");
                                    com.meituan.android.legwork.common.jarvis.a.a().d();
                                }
                            }
                        }
                    }
                    if (a.d == null || a.d.get() != activity) {
                        return;
                    }
                    a.d = null;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1953d885418582a51c06fd02604b8aff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1953d885418582a51c06fd02604b8aff");
                        return;
                    }
                    m mVar = m.a.a;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = m.a;
                    if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "6ad6726d0cfe346dba398943678ffe9e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "6ad6726d0cfe346dba398943678ffe9e");
                        return;
                    }
                    mVar.c--;
                    if (mVar.c > 0 || mVar.b <= 0 || !com.meituan.android.legwork.common.util.a.a().c()) {
                        return;
                    }
                    x.c("LegworkActivityManager.onActivityStopped", "stop jarvis looper when app background");
                    com.meituan.android.legwork.common.jarvis.a.a().d();
                    mVar.d = true;
                }
            });
        }
    }

    public static void b(AppCompatActivity appCompatActivity) {
        int intValue;
        Object[] objArr = {appCompatActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "177a4cd5131172ce5a8c4145b2a2f895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "177a4cd5131172ce5a8c4145b2a2f895");
            return;
        }
        if (!f) {
            f = true;
            e = appCompatActivity.getApplicationContext();
            c = appCompatActivity.getApplication();
            Context context = e;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a98cc59032a0a0403577cfbd37782c6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a98cc59032a0a0403577cfbd37782c6e");
            } else {
                boolean z = (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
                com.meituan.android.legwork.common.hostInfo.b e2 = com.meituan.android.legwork.common.hostInfo.b.e();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.common.hostInfo.b.d;
                b = (PatchProxy.isSupport(objArr3, e2, changeQuickRedirect3, false, "d38683dd7f15844b5e88caae1100fd30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, e2, changeQuickRedirect3, false, "d38683dd7f15844b5e88caae1100fd30")).booleanValue() : com.sankuai.waimai.kit.a.a().b()) || z;
            }
            com.meituan.android.legwork.common.hostInfo.b e3 = com.meituan.android.legwork.common.hostInfo.b.e();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.common.hostInfo.a.a;
            if (PatchProxy.isSupport(objArr4, e3, changeQuickRedirect4, false, "06aea354183fd0df1bd55825f1a8a8d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, e3, changeQuickRedirect4, false, "06aea354183fd0df1bd55825f1a8a8d9");
            } else {
                e3.c();
            }
            Context context2 = e;
            Object[] objArr5 = {context2};
            ChangeQuickRedirect changeQuickRedirect5 = h.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "8566341d27e1feefefef868464525427", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "8566341d27e1feefefef868464525427");
            } else {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                h.b = displayMetrics.density;
                h.c = displayMetrics.scaledDensity;
                h.d = displayMetrics.heightPixels;
                h.e = displayMetrics.widthPixels;
            }
            LegworkPushReceiver.a(e);
            q.a().b();
            x.d("LegworkApplication.init()", "APP启动后，首次进入跑腿频道");
        }
        if (m.a.a.b()) {
            r.a.a.a();
            c l = c.l();
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = BaseLocationManager.a;
            if (PatchProxy.isSupport(objArr6, l, changeQuickRedirect6, false, "62589b8afeb1e16be7829207ccfd0635", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, l, changeQuickRedirect6, false, "62589b8afeb1e16be7829207ccfd0635");
            } else {
                String str = "default";
                l.g = "";
                l.a();
                if (l.a(l.e())) {
                    l.g = l.e();
                    l.h = 1;
                    str = "location";
                }
                if (!l.a(l.g)) {
                    l.g = l.j();
                    str = "choose";
                }
                if (!l.a(l.g)) {
                    l.g = "110100";
                    l.h = 3;
                    str = "default";
                }
                x.d("BaseLocationManager.initDefaultCityIdForClientConfig()", "mDefaultCityId:", l.g, " mDefaultCityIdType:", Integer.valueOf(l.h), " cityInfoFrom:", str);
            }
            c l2 = c.l();
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = BaseLocationManager.a;
            if (PatchProxy.isSupport(objArr7, l2, changeQuickRedirect7, false, "f819d2588af2577c665e89dff0aca3b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, l2, changeQuickRedirect7, false, "f819d2588af2577c665e89dff0aca3b3");
            } else {
                boolean a2 = com.meituan.android.legwork.utils.address.a.a(l2.b(), l2.c());
                HashMap hashMap = new HashMap(2);
                hashMap.put("status", a2 ? "actual_location_valid" : "actual_location_invalid");
                q.a("legwork_default_locate", 2, hashMap);
            }
            if (!(appCompatActivity instanceof ToSendOneMoreActivity)) {
                com.meituan.android.legwork.common.util.a.a().a((a.InterfaceC0264a) null);
                c.l().a(appCompatActivity.getIntent());
            }
            com.meituan.android.legwork.utils.b a3 = com.meituan.android.legwork.utils.b.a();
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.legwork.utils.b.a;
            if (PatchProxy.isSupport(objArr8, a3, changeQuickRedirect8, false, "5ded119bd6bc9dc5b02f7c4d95167165", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, a3, changeQuickRedirect8, false, "5ded119bd6bc9dc5b02f7c4d95167165");
            } else {
                a3.f.clear();
            }
            final com.meituan.android.legwork.mrn.b a4 = com.meituan.android.legwork.mrn.b.a();
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.legwork.mrn.b.a;
            if (PatchProxy.isSupport(objArr9, a4, changeQuickRedirect9, false, "83b1d6059bcb1955bf3e24115715cc99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, a4, changeQuickRedirect9, false, "83b1d6059bcb1955bf3e24115715cc99");
            } else {
                if (b) {
                    Horn.debug(a(), "legwork_mrn_configuration", b);
                }
                a4.d = new HashMap();
                HashMap hashMap2 = new HashMap();
                com.meituan.android.legwork.common.hostInfo.b.e();
                hashMap2.put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
                e.a("legwork_mrn_configuration", new HornCallback() { // from class: com.meituan.android.legwork.mrn.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z2, String str2) {
                        Object[] objArr10 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ad23a58e75e51a2bd69a008d29c01a51", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ad23a58e75e51a2bd69a008d29c01a51");
                            return;
                        }
                        try {
                            b.this.d = (Map) new Gson().fromJson(str2, new TypeToken<HashMap<String, HashMap<String, Object>>>() { // from class: com.meituan.android.legwork.mrn.b.2.1
                            }.getType());
                            y a5 = y.a();
                            boolean b2 = b.this.b("legwork-map-switch");
                            Object[] objArr11 = {Byte.valueOf(b2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect11 = y.a;
                            if (PatchProxy.isSupport(objArr11, a5, changeQuickRedirect11, false, "3c12a43482f00c85d41c4f148894066f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, a5, changeQuickRedirect11, false, "3c12a43482f00c85d41c4f148894066f");
                            } else {
                                a5.a("useMRNMap", String.valueOf(b2));
                            }
                        } catch (Exception e4) {
                            x.e("MRNUtils.init()", "switch convert error, exception msg:", e4);
                            x.a(e4);
                        }
                    }
                }, hashMap2);
            }
            final com.meituan.android.legwork.monitor.b a5 = com.meituan.android.legwork.monitor.b.a();
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.legwork.monitor.b.a;
            if (PatchProxy.isSupport(objArr10, a5, changeQuickRedirect10, false, "507129fbe3d8b11ffc3d73e7b12a18d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, a5, changeQuickRedirect10, false, "507129fbe3d8b11ffc3d73e7b12a18d9");
            } else {
                if (b) {
                    Horn.debug(a(), "banma_legwork_business_monitor_new", b);
                }
                HashMap hashMap3 = new HashMap();
                com.meituan.android.legwork.common.hostInfo.b.e();
                hashMap3.put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
                e.a("banma_legwork_business_monitor_new", new HornCallback() { // from class: com.meituan.android.legwork.monitor.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z2, String str2) {
                        Object[] objArr11 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
                        ChangeQuickRedirect changeQuickRedirect11 = a;
                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "f133e42090313d903775aab26c15985a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "f133e42090313d903775aab26c15985a");
                            return;
                        }
                        try {
                            a5.c = (LinkMonitorConfigBean) new Gson().fromJson(str2, (Class<Object>) LinkMonitorConfigBean.class);
                            final b bVar = a5;
                            Object[] objArr12 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect12 = b.a;
                            if (PatchProxy.isSupport(objArr12, bVar, changeQuickRedirect12, false, "4154ee5083b925cdbe4b0730308face3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, bVar, changeQuickRedirect12, false, "4154ee5083b925cdbe4b0730308face3");
                            } else if (bVar.a((String) null)) {
                            } else {
                                try {
                                    ConcurrentHashMap<String, Map<String, Link>> concurrentHashMap = (ConcurrentHashMap) com.meituan.android.legwork.net.util.b.a().fromJson(z.a(com.meituan.android.legwork.a.a()).b("monitor", ""), new TypeToken<ConcurrentHashMap<String, Map<String, Link>>>() { // from class: com.meituan.android.legwork.monitor.b.1
                                    }.getType());
                                    if (concurrentHashMap != null) {
                                        bVar.b = concurrentHashMap;
                                    }
                                    bVar.d();
                                    bVar.c();
                                } catch (Exception e4) {
                                    x.e("LinkMonitorUtil.init()", "new LinkMonitorUtil error, exception msg:", e4);
                                    x.a(e4);
                                }
                            }
                        } catch (Exception e5) {
                            x.e("LinkMonitorUtil.initMonitorConfig()", "switch convert error,result:" + str2 + ", exception msg: ", e5);
                            x.a(e5);
                        }
                    }
                }, hashMap3);
            }
            com.meituan.android.legwork.common.util.c a6 = com.meituan.android.legwork.common.util.c.a();
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.legwork.common.util.c.a;
            if (PatchProxy.isSupport(objArr11, a6, changeQuickRedirect11, false, "db214d05d47bb5322a8f2840c7c23120", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, a6, changeQuickRedirect11, false, "db214d05d47bb5322a8f2840c7c23120");
            } else {
                if (b) {
                    Horn.debug(a(), "legwork_switch", b);
                }
                HashMap hashMap4 = new HashMap();
                com.meituan.android.legwork.common.hostInfo.b.e();
                hashMap4.put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
                hashMap4.put("appVersion", com.meituan.android.legwork.common.hostInfo.b.e().c());
                hashMap4.put("osType", "1");
                y a7 = y.a();
                int i = a6.c;
                Object[] objArr12 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect12 = y.a;
                if (PatchProxy.isSupport(objArr12, a7, changeQuickRedirect12, false, "2e4f19d2ac1e21363197c7f4444e5fa7", RobustBitConfig.DEFAULT_VALUE)) {
                    intValue = ((Integer) PatchProxy.accessDispatch(objArr12, a7, changeQuickRedirect12, false, "2e4f19d2ac1e21363197c7f4444e5fa7")).intValue();
                } else {
                    Object[] objArr13 = {"pt_send_page_type", Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect13 = y.a;
                    intValue = PatchProxy.isSupport(objArr13, a7, changeQuickRedirect13, false, "365cb5be73b49d5691ff6a226b61da19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr13, a7, changeQuickRedirect13, false, "365cb5be73b49d5691ff6a226b61da19")).intValue() : z.b(a7.b, "pt_send_page_type", i);
                }
                a6.c = intValue;
                e.a("legwork_switch", d.a(a6), hashMap4);
            }
            x.d("LegworkApplication.init()", "重新进入跑腿页面");
        }
    }

    public static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f91c745f4ce6c696a1271025c635fbb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f91c745f4ce6c696a1271025c635fbb1");
        }
        if (e == null) {
            e = com.meituan.android.legwork.common.hostInfo.b.e().i();
        }
        return e;
    }

    public static String b() {
        Activity activity;
        ComponentMainBPageAdapter componentMainBPageAdapter;
        Fragment fragment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bb1d1fb7e576fc12d9df80edd1eaf50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bb1d1fb7e576fc12d9df80edd1eaf50");
        }
        if (d == null || (activity = d.get()) == null) {
            return "componentName is null";
        }
        if (activity instanceof LegworkMainActivity) {
            LegworkMainActivity legworkMainActivity = (LegworkMainActivity) activity;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = LegworkMainActivity.a;
            if (PatchProxy.isSupport(objArr2, legworkMainActivity, changeQuickRedirect2, false, "09b9b4820305b86b3ebb13d7c2ba454d", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, legworkMainActivity, changeQuickRedirect2, false, "09b9b4820305b86b3ebb13d7c2ba454d");
            } else {
                Fragment e2 = legworkMainActivity.e();
                if (e2 instanceof LegworkMRNBaseFragment) {
                    str = legworkMainActivity.a(((LegworkMRNBaseFragment) e2).m());
                } else if ((e2 instanceof LegworkMainBFragment) && (componentMainBPageAdapter = ((LegworkMainBFragment) e2).f) != null && (fragment = (Fragment) componentMainBPageAdapter.c) != null && (fragment instanceof LazyLoadHelperFragment)) {
                    Fragment fragment2 = ((LazyLoadHelperFragment) fragment).b;
                    if (fragment2 instanceof LegworkMRNBaseFragment) {
                        str = legworkMainActivity.a(((LegworkMRNBaseFragment) fragment2).m());
                    }
                }
            }
            return TextUtils.isEmpty(str) ? "componentName is null" : str;
        }
        if (activity.getIntent() != null && activity.getIntent().getData() != null) {
            Uri data = activity.getIntent().getData();
            String queryParameter = data.getQueryParameter("mrn_biz");
            String queryParameter2 = data.getQueryParameter("mrn_entry");
            String queryParameter3 = data.getQueryParameter("mrn_component");
            if (TextUtils.equals(queryParameter, "banma") && com.meituan.android.legwork.mrn.b.c.contains(queryParameter2)) {
                return queryParameter2 + CommonConstant.Symbol.UNDERLINE + queryParameter3;
            }
        }
        String simpleName = activity.getClass().getSimpleName();
        return TextUtils.isEmpty(simpleName) ? "componentName is null" : simpleName;
    }
}
