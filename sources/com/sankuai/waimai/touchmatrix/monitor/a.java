package com.sankuai.waimai.touchmatrix.monitor;

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
    boolean g;
    boolean h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babdc301da4d2903f7c10334a431fd87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babdc301da4d2903f7c10334a431fd87");
        } else {
            this.d = "default";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1349a {
        public static ChangeQuickRedirect a;
        protected a b;

        public abstract String a();

        public AbstractC1349a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15de5f09d30cfa4d508849f6c8cbec0d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15de5f09d30cfa4d508849f6c8cbec0d");
                return;
            }
            this.b = new a();
            this.b.c = a();
        }

        public final AbstractC1349a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9399e0c3066ed4848d81c27425dcec19", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1349a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9399e0c3066ed4848d81c27425dcec19");
            }
            this.b.b = str;
            return this;
        }

        public final AbstractC1349a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4322d3b08414c9952529bdc73a720b", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1349a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4322d3b08414c9952529bdc73a720b");
            }
            this.b.d = str;
            return this;
        }

        public final AbstractC1349a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb5145af934f94afcc5bfd1396ebb2c", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1349a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb5145af934f94afcc5bfd1396ebb2c");
            }
            this.b.e = str;
            return this;
        }

        public final AbstractC1349a d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6ae2c1feeb646fbdc30042e8bff493", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1349a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6ae2c1feeb646fbdc30042e8bff493");
            }
            this.b.f = str;
            return this;
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b37330e830561132b8e5857b767b954", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b37330e830561132b8e5857b767b954");
            }
            if (this.b == null || TextUtils.isEmpty(this.b.b)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.b;
        }
    }
}
