package com.meituan.android.privacy.impl.monitor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.android.privacy.interfaces.monitor.b {
    public static ChangeQuickRedirect a;
    private final c b;
    @GuardedBy("this")
    private final WeakHashMap<Activity, Map<String, Object>> c;

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b66564e26aa9ea29d59dce371d0f983", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b66564e26aa9ea29d59dce371d0f983");
            return;
        }
        this.c = new WeakHashMap<>();
        this.b = cVar;
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc59a14ba810fb8936d14c56dcd21a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc59a14ba810fb8936d14c56dcd21a6");
        } else if ((dVar.s instanceof e) && ((e) dVar.s).a) {
            HashMap hashMap = new HashMap();
            Activity topActivityProbably = PermissionGuard.a.a.getTopActivityProbably();
            if (topActivityProbably != null) {
                hashMap.putAll(a(topActivityProbably));
            }
            hashMap.put("privacyType", dVar.b);
            hashMap.put("privacyToken", dVar.c);
            hashMap.put(Constants.MULTI_PROCESS_PID, dVar.d);
            hashMap.put("code", Integer.valueOf(dVar.e));
            hashMap.put("background", Boolean.valueOf(dVar.f));
            hashMap.put("appAlert", dVar.i);
            hashMap.put("sysAlert", dVar.j);
            hashMap.put("calledAPI", dVar.k);
            hashMap.put("duration", Long.valueOf(dVar.h - dVar.g));
            hashMap.put("apiAuthorization", dVar.l);
            hashMap.put("callingSysAPI", dVar.m);
            hashMap.put("hash", dVar.p);
            hashMap.put("validToken", Boolean.valueOf(dVar.r));
            hashMap.put("cacheDuration", dVar.q);
            hashMap.put("$sr", Double.valueOf(((e) dVar.s).b));
            Babel.log(new Log.Builder("").generalChannelStatus(true).tag("privacy_statistics").value(1L).optional(hashMap).build());
        }
    }

    @NonNull
    private Map<String, Object> a(@NonNull Activity activity) {
        Map<String, Object> map;
        String str;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "827c92f07753c75805d04d3766db86fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "827c92f07753c75805d04d3766db86fd");
        }
        synchronized (this) {
            map = this.c.get(activity);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("nPage", activity.getClass().getName());
                Intent intent = activity.getIntent();
                Uri uri = null;
                if (intent != null && (uri = intent.getData()) != null) {
                    hashMap.put("pageUrl", uri.toString());
                }
                Uri uri2 = uri;
                Object[] objArr2 = {activity, uri2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e371816fcd2f933a61a3b4ab6381907b", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e371816fcd2f933a61a3b4ab6381907b");
                } else if (uri2 == null) {
                    str = activity.getClass().getName();
                } else {
                    String queryParameter = uri2.getQueryParameter("mrn_biz");
                    String queryParameter2 = uri2.getQueryParameter("mrn_entry");
                    if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                        str = "rn|" + queryParameter + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + queryParameter2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + uri2.getQueryParameter("mrn_component");
                    } else {
                        str = uri2.getScheme() + "://" + uri2.getHost() + uri2.getPath();
                    }
                }
                hashMap.put("pagePath", str);
                this.c.put(activity, hashMap);
                map = hashMap;
            }
        }
        return map;
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f330627e5d893954edeacc7a671b67eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f330627e5d893954edeacc7a671b67eb");
        } else if (i > this.b.i) {
        } else {
            a(aVar, "CheckURL");
        }
    }

    private void a(c.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2dc29a3379a2a0ec9f63c7038ec5ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2dc29a3379a2a0ec9f63c7038ec5ddf");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("APIType", str);
        hashMap.put("status", Integer.valueOf(aVar.a()));
        hashMap.put("illegalTypes", Long.valueOf(aVar.c()));
        hashMap.put("supportTypes", Long.valueOf(aVar.b()));
        hashMap.put("hostPath", aVar.f());
        if (aVar instanceof com.meituan.android.privacy.interfaces.def.netfilter.a) {
            hashMap.put("costMs", Long.valueOf(((com.meituan.android.privacy.interfaces.def.netfilter.a) aVar).i));
        }
        hashMap.put("originURL", aVar.d());
        hashMap.put("filterURL", aVar.e());
        hashMap.put("rules", aVar.f());
        Babel.logRT(new Log.Builder("").generalChannelStatus(true).tag("url_filter").optional(hashMap).build());
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void b(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3425006b7c22aac8d6ce19afea916e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3425006b7c22aac8d6ce19afea916e");
        } else if (i > this.b.i) {
        } else {
            a(aVar, "CheckType");
        }
    }
}
