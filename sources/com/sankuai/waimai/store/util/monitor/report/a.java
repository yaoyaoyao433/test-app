package com.sankuai.waimai.store.util.monitor.report;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    String f;
    long g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf416f1ff5cb5bc97657daa3ebbfe9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf416f1ff5cb5bc97657daa3ebbfe9e");
        } else {
            this.d = "default";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.util.monitor.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1332a {
        public static ChangeQuickRedirect a;
        protected a b;

        public abstract String a();

        public AbstractC1332a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bd97a39d4b8b26b3313e8f3fc6cae7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bd97a39d4b8b26b3313e8f3fc6cae7");
                return;
            }
            this.b = new a();
            this.b.c = a();
            this.b.g = com.meituan.android.time.c.b();
        }

        public final AbstractC1332a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff919cf9d7476ca410bfe1a70bef6815", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1332a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff919cf9d7476ca410bfe1a70bef6815");
            }
            this.b.b = str;
            return this;
        }

        public final AbstractC1332a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eadf3e1f460041afc219d82b24ace4e", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1332a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eadf3e1f460041afc219d82b24ace4e");
            }
            this.b.e = str;
            return this;
        }

        public final AbstractC1332a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f4b2964279581e6215613347103215", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1332a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f4b2964279581e6215613347103215");
            }
            this.b.f = str;
            return this;
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a5a14e90b1c1d4f4fee8f6e8294f4c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a5a14e90b1c1d4f4fee8f6e8294f4c");
            }
            if (this.b == null || TextUtils.isEmpty(this.b.b)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.b;
        }
    }
}
