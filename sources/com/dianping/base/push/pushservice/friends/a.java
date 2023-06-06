package com.dianping.base.push.pushservice.friends;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.k;
import com.dianping.base.push.pushservice.l;
import com.dianping.base.push.pushservice.util.f;
import com.dianping.base.push.pushservice.util.h;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.xm.monitor.report.db.ReportBean;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    int i;
    d j;
    long k;
    long l;
    long m;
    long n;

    public static /* synthetic */ void a(Context context, String str, int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce1d21ebcd62c04efad71f31274f3518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce1d21ebcd62c04efad71f31274f3518");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", str);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os", Build.VERSION.RELEASE);
            k.a(context).a(l.a(context, i, jSONObject));
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.b("FriendAppInfo", "wakeUpLog data error: " + e.toString());
        }
    }

    public static /* synthetic */ boolean a(Context context, String str) throws Throwable {
        List<ActivityManager.RunningServiceInfo> runningServices;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d64bb11ff2ac56f0e4500ff66d8d0396", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d64bb11ff2ac56f0e4500ff66d8d0396")).booleanValue();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.process.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public a(Context context, JSONObject jSONObject) throws c {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8885348aa5553620ee2ffc0672eef6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8885348aa5553620ee2ffc0672eef6");
            return;
        }
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        try {
            this.b = jSONObject.getString("pkg");
            if (TextUtils.isEmpty(this.b)) {
                throw new c("package name can't be empty");
            }
            this.c = jSONObject.optString(Constants.EventInfoConsts.KEY_PROC);
            if (TextUtils.isEmpty(this.c)) {
                this.c = this.b;
            }
            this.d = jSONObject.optString("service");
            this.e = jSONObject.getString("action");
            if (TextUtils.isEmpty(this.e)) {
                throw new c("action name can't be empty");
            }
            this.f = jSONObject.optString("key1");
            this.g = jSONObject.optString(ReportBean.VALUE_1);
            this.h = jSONObject.optString("key2");
            this.i = jSONObject.optInt(ReportBean.VALUE_2);
            if (TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.h)) {
                this.f = "source";
            }
            if (TextUtils.isEmpty(this.g) && this.i == 0) {
                this.g = context.getPackageName();
            }
            switch (jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
                case 1:
                    this.j = d.APP_FIRST_LAUNCH;
                    break;
                case 2:
                    this.j = d.ALWAYS;
                    break;
            }
            this.k = jSONObject.optInt("beginTime");
            this.l = jSONObject.optInt("endTime");
            if (this.j == d.ALWAYS) {
                this.m = jSONObject.optInt("interval");
            }
        } catch (JSONException e) {
            com.dianping.base.push.pushservice.c.d("FriendAppInfo", e.toString());
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb69cea42258f91e1beb35759f24481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb69cea42258f91e1beb35759f24481");
        } else {
            this.n = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.dianping.base.push.pushservice.friends.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0057a implements Runnable {
        public static ChangeQuickRedirect a;
        Context b;
        a c;

        public RunnableC0057a(Context context, a aVar) {
            Object[] objArr = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c0ed6480ee2d50d25415a1825c7603", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c0ed6480ee2d50d25415a1825c7603");
                return;
            }
            this.b = context;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e02540e4bf807df27b239d510ef5995", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e02540e4bf807df27b239d510ef5995");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.friends.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec840c2272805fdbbd153891986d1e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec840c2272805fdbbd153891986d1e9");
                            return;
                        }
                        try {
                            if (a.a(RunnableC0057a.this.b, RunnableC0057a.this.c.c)) {
                                com.dianping.base.push.pushservice.c.b("FriendAppInfo", RunnableC0057a.this.c.c + " is running, won't wake up");
                                return;
                            }
                            com.dianping.base.push.pushservice.c.b("FriendAppInfo", RunnableC0057a.this.c.c + " is not running, start to wake up");
                            Intent intent = new Intent();
                            intent.setPackage(RunnableC0057a.this.c.b);
                            if (!TextUtils.isEmpty(RunnableC0057a.this.c.d)) {
                                intent.setComponent(new ComponentName(RunnableC0057a.this.c.b, RunnableC0057a.this.c.d));
                            }
                            intent.setAction(RunnableC0057a.this.c.e);
                            if (!TextUtils.isEmpty(RunnableC0057a.this.c.f)) {
                                intent.putExtra(RunnableC0057a.this.c.f, RunnableC0057a.this.c.g);
                            }
                            if (!TextUtils.isEmpty(RunnableC0057a.this.c.h)) {
                                intent.putExtra(RunnableC0057a.this.c.h, RunnableC0057a.this.c.i);
                            }
                            f.a(RunnableC0057a.this.b, intent);
                            Thread.sleep(400L);
                            if (a.a(RunnableC0057a.this.b, RunnableC0057a.this.c.c)) {
                                com.dianping.base.push.pushservice.c.b("FriendAppInfo", RunnableC0057a.this.c.c + " wakedup success");
                                a.a(RunnableC0057a.this.b, RunnableC0057a.this.c.b, 401, 0);
                                return;
                            }
                            com.dianping.base.push.pushservice.c.b("FriendAppInfo", RunnableC0057a.this.c.c + " wakeup fail");
                            a.a(RunnableC0057a.this.b, RunnableC0057a.this.c.b, 402, 0);
                        } catch (Throwable th) {
                            com.dianping.base.push.pushservice.c.d("FriendAppInfo", th.toString());
                        }
                    }
                });
            }
        }
    }
}
