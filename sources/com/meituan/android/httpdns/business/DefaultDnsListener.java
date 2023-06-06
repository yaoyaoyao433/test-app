package com.meituan.android.httpdns.business;

import android.content.Context;
import android.util.Log;
import com.dianping.monitor.impl.m;
import com.dianping.monitor.metric.c;
import com.google.gson.Gson;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.httpdns.IDnsListener;
import com.meituan.android.httpdns.d;
import com.meituan.android.httpdns.h;
import com.meituan.android.httpdns.i;
import com.meituan.android.httpdns.x;
import com.meituan.android.httpdns.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.uuid.GetUUID;
import com.sankuai.common.utils.UniqueDeviceId;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DefaultDnsListener implements IDnsListener {
    public static ChangeQuickRedirect a = null;
    static String b = null;
    static String c = null;
    public static String d = null;
    private static long e = -1;

    @Override // com.meituan.android.httpdns.IDnsListener
    public void a(final d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbdddfecf513b5c9623fd30a7e12fcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbdddfecf513b5c9623fd30a7e12fcc");
        } else if (dVar == null) {
        } else {
            z.a(new Runnable() { // from class: com.meituan.android.httpdns.business.DefaultDnsListener.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String str2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7ad35b6731c8d3c9fc82fbffa32dc9f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7ad35b6731c8d3c9fc82fbffa32dc9f");
                        return;
                    }
                    DefaultDnsListener defaultDnsListener = DefaultDnsListener.this;
                    d dVar2 = dVar;
                    Object[] objArr3 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = DefaultDnsListener.a;
                    if (PatchProxy.isSupport(objArr3, defaultDnsListener, changeQuickRedirect3, false, "7dbabaa1940421b250c9e1a4e00ac925", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, defaultDnsListener, changeQuickRedirect3, false, "7dbabaa1940421b250c9e1a4e00ac925");
                        return;
                    }
                    int i = h.a().c;
                    Context context = i.c;
                    if (context != null) {
                        m mVar = new m(i, context);
                        List<Float> singletonList = Collections.singletonList(Float.valueOf((float) dVar2.g));
                        String c2 = dVar2.c();
                        String d2 = dVar2.d();
                        int a2 = c.a().a("dns.httpdns");
                        mVar.a("dns.httpdns", singletonList);
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = DefaultDnsListener.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "460dc13a15b70749ffe6094cc25be808", 6917529027641081856L)) {
                            str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "460dc13a15b70749ffe6094cc25be808");
                        } else if (i.c == null) {
                            str = "";
                        } else {
                            if (x.a(DefaultDnsListener.b)) {
                                DefaultDnsListener.b = GetUUID.getInstance().getUUID(i.c);
                            }
                            str = DefaultDnsListener.b;
                        }
                        mVar.a("uuid", str);
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = DefaultDnsListener.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "efedfe75b2e677d3ea662a9872449bfc", 6917529027641081856L)) {
                            str2 = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "efedfe75b2e677d3ea662a9872449bfc");
                        } else if (i.c == null) {
                            str2 = "";
                        } else {
                            if (x.a(DefaultDnsListener.c)) {
                                DefaultDnsListener.c = UniqueDeviceId.getDeviceId(i.c);
                            }
                            str2 = DefaultDnsListener.c;
                        }
                        mVar.a("deviceId", str2);
                        mVar.a("osVersion", AppUtil.getOSVersion(context));
                        mVar.a(DeviceInfo.OS_BRAND, AppUtil.getBrand(context));
                        mVar.a("osModel", AppUtil.getDeviceModel(context));
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        mVar.a("sampleRate", sb.toString());
                        mVar.a("host", dVar2.d);
                        if (dVar2.f == 1 || dVar2.f == 2) {
                            mVar.a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, c2);
                            mVar.a("ips", "");
                        } else {
                            mVar.a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "");
                            mVar.a("ips", c2);
                        }
                        mVar.a("buildType", "release");
                        mVar.a("fetchStatus", d2);
                        mVar.a("cityId", i.b);
                        if (!x.a(dVar2.h)) {
                            mVar.a("cacheExp", dVar2.h);
                        }
                        if (dVar2.k != null) {
                            mVar.a("netState", dVar2.k.toString());
                        }
                        try {
                            a.a(dVar2, mVar);
                        } catch (Throwable th) {
                            DefaultDnsListener.d = Log.getStackTraceString(th);
                        }
                        if (!x.a(DefaultDnsListener.d)) {
                            dVar2.i += ";" + DefaultDnsListener.d;
                        }
                        if (!x.a(dVar2.i)) {
                            mVar.a("extra", dVar2.i);
                        }
                        mVar.a();
                        if (h.a().e) {
                            System.out.println("HttpDnsService: [Cat]" + dVar2.d + " fetchStatus:" + d2 + " ips:" + c2 + " cacheExp：" + dVar2.h + " extra:" + dVar2.i + " extra_not_use:" + new Gson().toJson(dVar2.j) + " sampleRate:" + a2);
                        }
                    }
                }
            });
        }
    }
}
