package com.sankuai.waimai.reactnative.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m {
    public static ChangeQuickRedirect a;
    String b;
    private int c;
    private double d;
    private String e;
    private String f;

    private m(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9881dfe6986c97d21b1e31dc377285d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9881dfe6986c97d21b1e31dc377285d1");
            return;
        }
        this.c = aVar.b;
        this.b = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        public String c;
        double d;
        public String e;
        String f;

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6850a5bd54ccff3e2bbdff5f32b89ec9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6850a5bd54ccff3e2bbdff5f32b89ec9");
            } else {
                this.b = i;
            }
        }

        public final m a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cdc2778872442079430c2d429cbe80", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cdc2778872442079430c2d429cbe80") : new m(this);
        }
    }
}
