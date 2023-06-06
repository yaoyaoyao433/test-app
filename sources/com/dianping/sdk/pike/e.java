package com.dianping.sdk.pike;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public String a;
    String b;
    Map<String, String> c;
    public ExecutorService d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public ExecutorService b;
        private String c;
        private String d;
        private Map<String, String> e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb6fc74b95e136790b9812df3aeaec5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb6fc74b95e136790b9812df3aeaec5");
                return;
            }
            this.c = "";
            this.d = "";
            this.e = new HashMap();
            this.b = null;
        }

        public final a a(String str) {
            if (str != null) {
                this.c = str;
            }
            return this;
        }

        public final a b(String str) {
            if (str != null) {
                this.d = str;
            }
            return this;
        }

        public final a a(Map<String, String> map) {
            if (map != null) {
                this.e = map;
            }
            return this;
        }

        public final e a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154787f7d205c48ee953e546cae0c057", RobustBitConfig.DEFAULT_VALUE)) {
                return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154787f7d205c48ee953e546cae0c057");
            }
            e eVar = new e();
            eVar.a = this.c;
            eVar.b = this.d;
            eVar.c = this.e;
            eVar.d = this.b;
            return eVar;
        }
    }
}
