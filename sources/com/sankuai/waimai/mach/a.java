package com.sankuai.waimai.mach;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private static Context b = com.meituan.android.singleton.b.a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r11 = this;
            android.content.Context r0 = com.sankuai.waimai.mach.a.b
            int r1 = com.sankuai.waimai.mach.n.a(r0)
            r11.<init>(r0, r1)
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.mach.a.a
            java.lang.String r10 = "97c0f60755c883fd387802d6d9d0844e"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.a.<init>():void");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0997a {
        @SuppressLint({"StaticFieldLeak"})
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d71c00546c1d82a20405a3ed201f9f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d71c00546c1d82a20405a3ed201f9f") : C0997a.a;
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a6650fa76728d6ab4ccdd2b004070f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a6650fa76728d6ab4ccdd2b004070f") : GetUUID.getInstance().getSyncUUID(b, null);
    }
}
