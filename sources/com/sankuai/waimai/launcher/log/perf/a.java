package com.sankuai.waimai.launcher.log.perf;

import android.net.Uri;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final HashSet<String> b = new HashSet<>(3);

    public static /* synthetic */ void a(String str, TrafficRecord trafficRecord, boolean z, boolean z2, boolean z3) {
        String sb;
        Object[] objArr = {str, trafficRecord, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07c546020c0570d447adc22f41978709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07c546020c0570d447adc22f41978709");
            return;
        }
        i.d(new com.sankuai.waimai.launcher.log.a().a("network_request_baseline_exceeded").c(str).b());
        if (!com.sankuai.meituan.takeoutnew.a.f) {
            b.add(str);
            return;
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "354945dc1e7f601432c3ec08518e267e", RobustBitConfig.DEFAULT_VALUE)) {
            sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "354945dc1e7f601432c3ec08518e267e");
        } else {
            StringBuilder sb2 = new StringBuilder();
            Uri parse = Uri.parse(trafficRecord.getUrl());
            sb2.append("Host: ");
            sb2.append(parse.getHost());
            sb2.append("\nPath: ");
            sb2.append(parse.getPath());
            sb2.append("\n");
            if (z) {
                sb2.append("Url size: ");
                sb2.append(trafficRecord.getUrl().getBytes().length);
                sb2.append("(max:1843");
                sb2.append(")\n");
            }
            if (z2) {
                sb2.append("Header size: ");
                sb2.append(trafficRecord.getRequestHeaderSize());
                sb2.append("(max:3072");
                sb2.append(")\n");
            }
            if (z3) {
                sb2.append("Body size: ");
                sb2.append(trafficRecord.getRequestBodySize());
                sb2.append("(max:1048576");
                sb2.append(")\n");
            }
            sb = sb2.toString();
        }
        com.sankuai.waimai.foundation.utils.log.a.e("超过请求基线大小限制", sb, new Object[0]);
    }

    public static void a(final TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "560926a44816e8b979d654c0353072f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "560926a44816e8b979d654c0353072f8");
            return;
        }
        try {
            String url = trafficRecord.getUrl();
            Uri parse = Uri.parse(url);
            final String str = parse.getHost() + parse.getPath();
            if (com.sankuai.meituan.takeoutnew.a.f || !("sentry7.sankuai.com".equals(parse.getHost()) || b.size() >= 3 || b.contains(str))) {
                final boolean z = url.getBytes().length > 1843;
                final boolean z2 = trafficRecord.getRequestHeaderSize() > 3072;
                final boolean z3 = trafficRecord.getRequestBodySize() > 1048576;
                if (z || z2 || z3) {
                    ad.c(new Runnable() { // from class: com.sankuai.waimai.launcher.log.perf.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ac51e2919ac599dbe5a2f6bc743c317", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ac51e2919ac599dbe5a2f6bc743c317");
                            } else {
                                a.a(str, trafficRecord, z, z2, z3);
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
