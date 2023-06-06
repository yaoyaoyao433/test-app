package com.sankuai.waimai.business.page.common.list.popuplayer;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Config {
    public static ChangeQuickRedirect a;
    ViewGroup b;
    int c;
    ViewGroup.LayoutParams d;
    int e;
    long f;
    b g;
    int h;
    String i;
    String j;
    String k;
    String l;
    boolean m;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SourceType {
    }

    public Config(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9439f859100531e7d4653f9e6808b933", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9439f859100531e7d4653f9e6808b933");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.l = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.k = aVar.l;
        this.m = aVar.m;
        this.i = aVar.j;
        this.j = aVar.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public ViewGroup b;
        public int c;
        public ViewGroup.LayoutParams d;
        public int e;
        long f;
        public String g;
        public b h;
        public int i;
        public String j;
        public String k;
        public String l;
        public boolean m;

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470bbbb0b367bf7c4bd0ffc5ca7065d9", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470bbbb0b367bf7c4bd0ffc5ca7065d9");
            }
            this.f = j;
            return this;
        }

        public final Config a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9e6acc25b33748daed4c34f5e57e3f", RobustBitConfig.DEFAULT_VALUE) ? (Config) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9e6acc25b33748daed4c34f5e57e3f") : new Config(this);
        }
    }
}
