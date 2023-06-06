package com.meituan.android.paybase.downgrading;

import android.content.Context;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static boolean e = true;
    private static volatile a f;
    private static final Type g = new TypeToken<ArrayList<Downgrading>>() { // from class: com.meituan.android.paybase.downgrading.a.1
    }.getType();
    public boolean b;
    private ConcurrentLinkedQueue<Object> c;
    private ConcurrentHashMap<String, Downgrading> d;
    private HornCallback h;

    @MTPaySuppressFBWarnings({"UR_UNINIT_READ"})
    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2c6744fc56b174cf8364022fc75e84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2c6744fc56b174cf8364022fc75e84");
            return;
        }
        this.c = new ConcurrentLinkedQueue<>();
        this.b = false;
        this.h = b.a(this);
        if (this.d == null) {
            this.d = new ConcurrentHashMap<>();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66e5b2d8d7cb3753138e54e23af17cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66e5b2d8d7cb3753138e54e23af17cc4");
        }
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    public final String a(String str) {
        Downgrading downgrading;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6848f6158435c00144fccd3c09d18c25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6848f6158435c00144fccd3c09d18c25");
        }
        if (this.d == null || !this.d.containsKey(str) || (downgrading = this.d.get(str)) == null) {
            return null;
        }
        return downgrading.getStrategy();
    }

    public final String b(String str) {
        Downgrading downgrading;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e80c389139e87197165eee1849ed20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e80c389139e87197165eee1849ed20");
        }
        if (this.d == null || !this.d.containsKey(str) || (downgrading = this.d.get(str)) == null) {
            return null;
        }
        return downgrading.getJsonParam();
    }

    public static /* synthetic */ void a(a aVar, boolean z, String str) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a7734e53b66af92c8316b375d62985a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a7734e53b66af92c8316b375d62985a");
            return;
        }
        v.a("c_pdj05ry3", "b_lzke7dj2", "", new a.b().a("enable", String.valueOf(z)).a("result", str).b);
        if (z) {
            try {
                ArrayList<Downgrading> arrayList = (ArrayList) n.a().fromJson(str, g);
                aVar.a(arrayList);
                if (arrayList == null || aVar.c == null || aVar.c.size() <= 0) {
                    return;
                }
                Iterator<Object> it = aVar.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "DowngradingService_onChanged").a("message", e2.getMessage()).b);
            }
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dedcfbc4ec60450e1cb81890741fa9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dedcfbc4ec60450e1cb81890741fa9c");
            return;
        }
        if (this.c != null && this.c.size() > 0) {
            Iterator<Object> it = this.c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.Environment.KEY_CITYID, com.meituan.android.paybase.config.a.d().g());
        hashMap.put("pay_sdk_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("uuid", com.meituan.android.paybase.config.a.d().j());
        hashMap.put("appname", com.meituan.android.paybase.config.a.d().k());
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, "wallet");
        hashMap.put("env", (!ah.a(context) || e) ? AiDownloadEnv.ENV_ONLINE : "debug");
        Horn.register("finance", this.h, hashMap);
        hashMap.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        this.b = true;
    }

    private synchronized void a(ArrayList<Downgrading> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561cc785244aeaa2fb678f8032e87748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561cc785244aeaa2fb678f8032e87748");
            return;
        }
        this.d.clear();
        if (arrayList != null) {
            Iterator<Downgrading> it = arrayList.iterator();
            while (it.hasNext()) {
                Downgrading next = it.next();
                this.d.put(next.getName(), next);
            }
        }
    }

    public static boolean b() {
        return e;
    }

    public static void a(boolean z) {
        e = z;
    }
}
