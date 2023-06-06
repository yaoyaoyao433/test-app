package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    @Nullable
    public a e;
    @Nullable
    public b f;
    public int g;
    private static final Pools.Pool<g> h = new Pools.SynchronizedPool(128);
    public static final g d = new g();

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.platform.widget.tag.b {
        public static ChangeQuickRedirect c;
        private static final Pools.Pool<a> k = new Pools.SynchronizedPool(128);
        public String d;
        @DrawableRes
        public Integer e;
        public Integer f;
        public Integer g;
        public int h;
        public Integer i;
        public boolean j;

        @Override // com.sankuai.waimai.platform.widget.tag.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a53f00347b0a76f3f935a085595db59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a53f00347b0a76f3f935a085595db59");
                return;
            }
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = 0;
            this.i = null;
            this.j = false;
        }

        public final a d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7f02ff77c1e62a7abc56da4e1b7f4a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7f02ff77c1e62a7abc56da4e1b7f4a");
            }
            a e = e();
            e.d = this.d;
            e.e = this.e;
            e.f = this.f;
            e.g = this.g;
            e.h = this.h;
            e.i = this.i;
            e.j = this.j;
            return e;
        }

        @Override // com.sankuai.waimai.platform.widget.tag.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8524553ff0c6fcc6e2f6fc05e50177d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8524553ff0c6fcc6e2f6fc05e50177d4");
            } else {
                k.release(this);
            }
        }

        public static a e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f93368cb26b9bc05fdbe4fdb60131ae5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f93368cb26b9bc05fdbe4fdb60131ae5");
            }
            a acquire = k.acquire();
            if (acquire == null) {
                acquire = new a();
            }
            acquire.b = false;
            return acquire;
        }

        public final void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a171198c120581b686b2ae724de432db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a171198c120581b686b2ae724de432db");
                return;
            }
            boolean z = true;
            if (TextUtils.isEmpty(this.d) && this.e == null && !g() && this.i == null) {
                z = false;
            }
            this.j = z;
        }

        public final boolean g() {
            if (this.f == null || this.g == null) {
                return false;
            }
            return this.h == 0 || this.h == 1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.platform.widget.tag.b {
        public static ChangeQuickRedirect c;
        private static final Pools.Pool<b> g = new Pools.SynchronizedPool(128);
        public Integer d;
        public float e;
        public float[] f;

        @Override // com.sankuai.waimai.platform.widget.tag.b
        public final void a() {
            this.d = null;
            this.e = 0.0f;
            this.f = null;
        }

        public final b d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d76fafb66024c1f4c7b984e559976ad", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d76fafb66024c1f4c7b984e559976ad");
            }
            b e = e();
            e.d = this.d;
            e.e = this.e;
            e.f = this.f;
            return e;
        }

        @Override // com.sankuai.waimai.platform.widget.tag.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744a054d2afe0d5841a6ec3c47477aba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744a054d2afe0d5841a6ec3c47477aba");
            } else {
                g.release(this);
            }
        }

        public static b e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7e5f3d4f1ba8b02948cf1dc6d7cbbc4", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7e5f3d4f1ba8b02948cf1dc6d7cbbc4");
            }
            b acquire = g.acquire();
            if (acquire == null) {
                acquire = new b();
            }
            acquire.b = false;
            return acquire;
        }
    }

    public final g d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f23a5cf385eb66bdb2be597edb7ab4", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f23a5cf385eb66bdb2be597edb7ab4");
        }
        return a(this.e == null ? null : this.e.d(), this.f != null ? this.f.d() : null, this.g);
    }

    public static g a(a aVar, b bVar, int i) {
        Object[] objArr = {aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9858063e0a2f5a61ccc0a014d6504d58", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9858063e0a2f5a61ccc0a014d6504d58");
        }
        g acquire = h.acquire();
        if (acquire == null) {
            acquire = new g();
        }
        acquire.e = aVar;
        acquire.f = bVar;
        acquire.g = i;
        acquire.b = false;
        return acquire;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f183e7cec761c7635914523cf567a652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f183e7cec761c7635914523cf567a652");
            return;
        }
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
        this.g = 0;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7d4f9db6a4e6b30ffd709745c1728d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7d4f9db6a4e6b30ffd709745c1728d");
        } else {
            h.release(this);
        }
    }
}
