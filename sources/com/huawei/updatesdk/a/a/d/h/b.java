package com.huawei.updatesdk.a.a.d.h;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b extends com.huawei.updatesdk.a.b.c.c.b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    /* compiled from: ProGuard */
    /* renamed from: com.huawei.updatesdk.a.a.d.h.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0176b {
        private final Context a;
        private boolean b;
        private Set<String> c;
        private String[] d;
        private boolean e;

        public C0176b(Context context) {
            this.a = context;
        }

        private String b() {
            List arrayList = new ArrayList(c.d(this.a));
            Set<String> set = this.c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            if (this.e) {
                arrayList = c.a(arrayList, this.d);
            }
            return com.huawei.updatesdk.a.a.d.e.a(arrayList, CommonConstant.Symbol.COMMA);
        }

        public C0176b a(boolean z) {
            this.b = z;
            return this;
        }

        public b a() {
            b bVar = new b();
            bVar.abis_ = com.huawei.updatesdk.a.a.d.e.a(c.f(), CommonConstant.Symbol.COMMA);
            bVar.dpi_ = Integer.parseInt(c.f(this.a));
            bVar.preferLan_ = b();
            if (this.b) {
                bVar.deviceFeatures_ = c.a(this.a);
            }
            return bVar;
        }
    }

    private b() {
    }
}
