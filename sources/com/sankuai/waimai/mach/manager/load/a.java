package com.sankuai.waimai.mach.manager.load;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    private long f;

    private a(C1015a c1015a) {
        Object[] objArr = {c1015a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bdedeb4156cc4cc9684346f14b748b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bdedeb4156cc4cc9684346f14b748b");
            return;
        }
        this.b = c1015a.b;
        this.c = c1015a.c;
        this.d = c1015a.d;
        this.e = c1015a.e;
        this.f = c1015a.f;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager.load.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1015a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public long f;

        public final C1015a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e936b6c83567342d615cf498b3eeb73", RobustBitConfig.DEFAULT_VALUE)) {
                return (C1015a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e936b6c83567342d615cf498b3eeb73");
            }
            this.f = j;
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eed7f1559dcd7a72e98d005f1b3d93a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eed7f1559dcd7a72e98d005f1b3d93a");
            }
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalArgumentException("setTemplateId is required.");
            }
            if (TextUtils.isEmpty(this.d)) {
                throw new IllegalArgumentException("moduleId is required.");
            }
            return new a(this);
        }
    }
}
