package com.sankuai.waimai.store.order;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public Context a;
    public String b;
    public String c = "0";
    public long d;
    public String e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6121d29fc0797c3e4b7ff9ce247f4055", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6121d29fc0797c3e4b7ff9ce247f4055");
            } else {
                this.b = new b();
            }
        }

        public final a a(Context context) {
            this.b.a = context;
            return this;
        }

        public final a a(String str) {
            this.b.b = str;
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb114147f32949e7eff18516cb53754", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb114147f32949e7eff18516cb53754");
            }
            this.b.d = j;
            return this;
        }
    }
}
