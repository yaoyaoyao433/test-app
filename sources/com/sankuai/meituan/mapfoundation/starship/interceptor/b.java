package com.sankuai.meituan.mapfoundation.starship.interceptor;

import android.content.Context;
import com.dianping.monitor.e;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import rx.d;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    public Context b;
    public int c;
    public String d;
    public String e;
    public e f;

    public static /* synthetic */ int a(b bVar, Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1bd40d8aeb7a1e03007b583e3dee4e50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1bd40d8aeb7a1e03007b583e3dee4e50")).intValue();
        }
        if (map == null || map.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append((String) map.get(str));
        }
        return sb.toString().getBytes().length;
    }

    public b(Context context, int i, final String str, String str2) {
        Object[] objArr = {context, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b94f073d1005463d8f462dfb246d49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b94f073d1005463d8f462dfb246d49");
            return;
        }
        this.b = context;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = new com.dianping.monitor.impl.a(context, i, str2) { // from class: com.sankuai.meituan.mapfoundation.starship.interceptor.b.1
            @Override // com.dianping.monitor.impl.a
            public final String getUnionid() {
                return str;
            }
        };
    }

    @Override // com.dianping.nvnetwork.r
    public final d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "156c0e2e5ae9ff57e03349ae9e9b6755", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "156c0e2e5ae9ff57e03349ae9e9b6755");
        }
        final Request a2 = aVar.a();
        return aVar.a(a2).d(new g<q, q>() { // from class: com.sankuai.meituan.mapfoundation.starship.interceptor.b.2
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0028, B:16:0x0044, B:18:0x004a, B:23:0x0073, B:25:0x0079, B:27:0x007f, B:29:0x0084, B:31:0x008a, B:33:0x00a6, B:34:0x00ab, B:36:0x00bf, B:38:0x00c5, B:39:0x00d2, B:41:0x00d8, B:42:0x00e6, B:43:0x00ea, B:45:0x00f9, B:46:0x010c, B:22:0x0053), top: B:51:0x0028 }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0028, B:16:0x0044, B:18:0x004a, B:23:0x0073, B:25:0x0079, B:27:0x007f, B:29:0x0084, B:31:0x008a, B:33:0x00a6, B:34:0x00ab, B:36:0x00bf, B:38:0x00c5, B:39:0x00d2, B:41:0x00d8, B:42:0x00e6, B:43:0x00ea, B:45:0x00f9, B:46:0x010c, B:22:0x0053), top: B:51:0x0028 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[Catch: Exception -> 0x0148, LOOP:0: B:39:0x00d2->B:41:0x00d8, LOOP_END, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0028, B:16:0x0044, B:18:0x004a, B:23:0x0073, B:25:0x0079, B:27:0x007f, B:29:0x0084, B:31:0x008a, B:33:0x00a6, B:34:0x00ab, B:36:0x00bf, B:38:0x00c5, B:39:0x00d2, B:41:0x00d8, B:42:0x00e6, B:43:0x00ea, B:45:0x00f9, B:46:0x010c, B:22:0x0053), top: B:51:0x0028 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00f9 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0028, B:16:0x0044, B:18:0x004a, B:23:0x0073, B:25:0x0079, B:27:0x007f, B:29:0x0084, B:31:0x008a, B:33:0x00a6, B:34:0x00ab, B:36:0x00bf, B:38:0x00c5, B:39:0x00d2, B:41:0x00d8, B:42:0x00e6, B:43:0x00ea, B:45:0x00f9, B:46:0x010c, B:22:0x0053), top: B:51:0x0028 }] */
            @Override // rx.functions.g
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.dianping.nvnetwork.q call(com.dianping.nvnetwork.q r33) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapfoundation.starship.interceptor.b.AnonymousClass2.call(com.dianping.nvnetwork.q):com.dianping.nvnetwork.q");
            }
        });
    }
}
