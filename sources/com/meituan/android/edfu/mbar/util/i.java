package com.meituan.android.edfu.mbar.util;

import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public RectF j;
    public String k;
    public int l;
    private int m;
    private String n;

    private i(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1860c7f8fdc7915f151eecea29b885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1860c7f8fdc7915f151eecea29b885");
            return;
        }
        this.m = aVar.b;
        this.n = aVar.c;
        this.b = aVar.d;
        this.c = aVar.e;
        this.d = aVar.f;
        this.e = aVar.g;
        this.f = aVar.j;
        this.j = aVar.i;
        this.g = aVar.h;
        this.h = aVar.k;
        this.i = aVar.l;
        this.k = aVar.m;
        this.l = aVar.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        String c;
        int d;
        int e;
        boolean f;
        boolean g;
        boolean h;
        RectF i;
        boolean j;
        boolean k;
        int l;
        String m;
        int n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7caf4b8a21f35a798f65b4c8411b4427", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7caf4b8a21f35a798f65b4c8411b4427");
            } else {
                this.n = 3;
            }
        }

        public final a a(boolean z) {
            this.g = false;
            return this;
        }

        public final a a(RectF rectF) {
            this.i = rectF;
            return this;
        }

        public final a a(String str) {
            this.m = str;
            return this;
        }

        public final i a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4dd11bc11fd36ab942aaaed3824f52", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4dd11bc11fd36ab942aaaed3824f52") : new i(this);
        }
    }
}
