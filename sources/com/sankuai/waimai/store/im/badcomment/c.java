package com.sankuai.waimai.store.im.badcomment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.imbase.listener.b {
    public static ChangeQuickRedirect a;

    public static final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c5afbd6c79c29ae58f88986058497d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c5afbd6c79c29ae58f88986058497d9")).booleanValue() : "匿名用户".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x0023, B:8:0x0033, B:10:0x0054, B:12:0x005a, B:19:0x0073, B:21:0x008b, B:48:0x00f1, B:23:0x0093, B:25:0x0097, B:26:0x009e, B:28:0x00a2, B:29:0x00a9, B:31:0x00ad, B:32:0x00b5, B:34:0x00b9, B:35:0x00c1, B:37:0x00c5, B:43:0x00d5, B:47:0x00e9, B:16:0x0063), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x0023, B:8:0x0033, B:10:0x0054, B:12:0x005a, B:19:0x0073, B:21:0x008b, B:48:0x00f1, B:23:0x0093, B:25:0x0097, B:26:0x009e, B:28:0x00a2, B:29:0x00a9, B:31:0x00ad, B:32:0x00b5, B:34:0x00b9, B:35:0x00c1, B:37:0x00c5, B:43:0x00d5, B:47:0x00e9, B:16:0x0063), top: B:53:0x0023 }] */
    @Override // com.sankuai.waimai.imbase.listener.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.badcomment.c.a(com.sankuai.xm.im.session.entry.a):com.sankuai.waimai.imbase.listener.model.b");
    }
}
