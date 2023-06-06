package com.sankuai.waimai.alita.core.mlmodel.preprocess;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaMLFeatureProcessConfig {
    public static ChangeQuickRedirect a;
    public a b;
    @NonNull
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public int k;
    public List<com.sankuai.waimai.alita.core.mlmodel.operator.a> l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Source {
    }

    public AlitaMLFeatureProcessConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c503bd1b2a0772a00cb393aa3b50446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c503bd1b2a0772a00cb393aa3b50446");
            return;
        }
        this.c = AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = false;
        this.i = "";
        this.j = "";
        this.k = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @NonNull
        public final String b;
        @Nullable
        public final String c;
        @Nullable
        public final String d;
        public final boolean e;
        private final int f;

        public a(@NonNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
            Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733a4baeccddb28d9e44bf2ff8f10c65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733a4baeccddb28d9e44bf2ff8f10c65");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = Objects.hash(str, str2, str3, Boolean.valueOf(z));
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa98d840763a7d73d91a5ea28673580c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa98d840763a7d73d91a5ea28673580c")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.e == aVar.e && this.b.equals(aVar.b) && Objects.equals(this.c, aVar.c) && Objects.equals(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.f;
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8139c12f10e06b7cb67dc25b182594", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8139c12f10e06b7cb67dc25b182594")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlitaMLFeatureProcessConfig alitaMLFeatureProcessConfig = (AlitaMLFeatureProcessConfig) obj;
        return this.c.equals(alitaMLFeatureProcessConfig.c) && Objects.equals(this.d, alitaMLFeatureProcessConfig.d) && Objects.equals(this.e, alitaMLFeatureProcessConfig.e) && Objects.equals(this.f, alitaMLFeatureProcessConfig.f);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30de51b2bdcd68f804847f718b9cbedf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30de51b2bdcd68f804847f718b9cbedf")).intValue() : Objects.hash(this.c, this.d, this.e, this.f);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cad41f560fd2fb3b004c9b59e49beb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cad41f560fd2fb3b004c9b59e49beb4")).booleanValue() : (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.i) || this.k <= 0) ? false : true;
    }
}
