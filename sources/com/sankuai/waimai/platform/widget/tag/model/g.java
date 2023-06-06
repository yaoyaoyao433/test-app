package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.graphics.Paint;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends a {
    public static ChangeQuickRedirect o;
    private static final Pools.Pool<g> r = new Pools.SynchronizedPool(128);
    public h p;
    public int q;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b
    public final int[] b(Context context, int i) {
        int measureText;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3893fdf3ff7a0606a47568f25c383fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3893fdf3ff7a0606a47568f25c383fd");
        }
        if (this.p == null) {
            return m;
        }
        if (TextUtils.isEmpty(this.p.f)) {
            measureText = 0;
        } else {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextSize(this.p.d);
            measureText = (int) (paint.measureText(this.p.f, 0, this.p.f.length()) + 0.5f);
        }
        int[] iArr = new int[2];
        iArr[0] = measureText + (this.p.i * 2);
        iArr[1] = this.q > 0 ? this.q : com.sankuai.waimai.platform.widget.tag.util.b.a(context, 16.0f);
        return iArr;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93977bd2ec1f694e401ef40c6b787c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93977bd2ec1f694e401ef40c6b787c2b");
        } else {
            r.release(this);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.model.a, com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aaf8d87199cb7ccb26aef90cb055456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aaf8d87199cb7ccb26aef90cb055456");
            return;
        }
        if (this.p != null) {
            this.p.c();
            this.p = null;
        }
        this.q = 0;
        super.a();
    }

    public static g a(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3b6f4d2706785a51146207d4ef3832c", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3b6f4d2706785a51146207d4ef3832c");
        }
        g acquire = r.acquire();
        if (acquire == null) {
            acquire = new g();
        }
        acquire.p = hVar;
        acquire.q = i;
        acquire.b = false;
        return acquire;
    }

    public static g a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9652cdb9aebe1e37137117db6e157ade", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9652cdb9aebe1e37137117db6e157ade");
        }
        g acquire = r.acquire();
        if (acquire == null) {
            acquire = new g();
        }
        acquire.p = hVar;
        acquire.q = 0;
        acquire.b = false;
        return acquire;
    }
}
