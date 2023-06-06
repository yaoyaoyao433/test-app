package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import android.text.TextUtils;
import com.dianping.monitor.g;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements r {
    public static ChangeQuickRedirect a;
    g b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd45d6f30e1ca4ed9ff836c3f9cc345", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd45d6f30e1ca4ed9ff836c3f9cc345");
        } else {
            this.b = new g(com.meituan.android.singleton.b.a);
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d270166959c3a1aa3080ee55e6847b9", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d270166959c3a1aa3080ee55e6847b9") : a(aVar);
    }

    private rx.d<q> a(r.a aVar) {
        final String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c04ff19c8a99a43e5059099c5791b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c04ff19c8a99a43e5059099c5791b4");
        }
        Request a2 = aVar.a();
        final String str2 = a2.d;
        final String str3 = "code";
        if (!TextUtils.isEmpty(str2)) {
            URL url = null;
            try {
                url = new URL(str2);
            } catch (MalformedURLException unused) {
            }
            if (url != null) {
                str = url.getHost() + url.getPath();
                a2 = a2.a().catCommand(str).build();
                if ("maf.meituan.com".equals(url.getHost())) {
                    str3 = "status";
                }
                return aVar.a(a2).d(new rx.functions.g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.d.1
                    public static ChangeQuickRedirect a;

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6  */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x0209  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x0222  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x022b  */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x024d  */
                    @Override // rx.functions.g
                    /* renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public com.dianping.nvnetwork.q call(com.dianping.nvnetwork.q r21) {
                        /*
                            Method dump skipped, instructions count: 601
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.nvnetwork.d.AnonymousClass1.call(com.dianping.nvnetwork.q):com.dianping.nvnetwork.q");
                    }
                });
            }
        }
        str = str2;
        return aVar.a(a2).d(new rx.functions.g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.dianping.nvnetwork.q call(com.dianping.nvnetwork.q r21) {
                /*
                    Method dump skipped, instructions count: 601
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.nvnetwork.d.AnonymousClass1.call(com.dianping.nvnetwork.q):com.dianping.nvnetwork.q");
            }
        });
    }
}
