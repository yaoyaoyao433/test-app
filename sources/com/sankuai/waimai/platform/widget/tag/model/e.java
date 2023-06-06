package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.support.v4.util.Pools;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect o;
    private static final Pools.Pool<e> q = new Pools.SynchronizedPool(128);
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.e p;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b
    public final int[] b(Context context, int i) {
        int ceil;
        int height;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73010c6392e10688c7d5f9a04cc8350f", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73010c6392e10688c7d5f9a04cc8350f");
        }
        if (this.p == null) {
            return m;
        }
        if (TextUtils.isEmpty(this.p.f)) {
            ceil = 0;
            height = 0;
        } else {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setAntiAlias(true);
            textPaint.setColor(this.p.h.intValue());
            textPaint.setTextSize(this.p.d);
            textPaint.setFakeBoldText(this.p.e);
            int i2 = i - (this.p.i * 2);
            if (i2 <= 0) {
                return new int[]{i, com.sankuai.waimai.platform.widget.tag.util.b.a(context, 16.0f)};
            }
            int min = Math.min(i2, (int) Math.ceil(Layout.getDesiredWidth(this.p.f, textPaint)));
            StaticLayout a = com.sankuai.waimai.platform.widget.tag.util.c.a(this.p.f, 0, this.p.f.length(), textPaint, min, Layout.Alignment.ALIGN_NORMAL, 1.0f, this.p.k, false, TextUtils.TruncateAt.END, min, this.p.j == 0 ? Integer.MAX_VALUE : this.p.j);
            float f = 0.0f;
            for (int i3 = 0; i3 < a.getLineCount(); i3++) {
                f = Math.max(f, a.getLineWidth(i3));
            }
            ceil = (int) Math.ceil(f);
            height = a.getHeight();
            this.p.m = a;
        }
        return new int[]{ceil + (this.p.i * 2), Math.max(com.sankuai.waimai.platform.widget.tag.util.b.a(context, 16.0f), height + (this.p.l * 2))};
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0422828e64b52e2e4a8bf54eeccf9473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0422828e64b52e2e4a8bf54eeccf9473");
        } else {
            q.release(this);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.model.a, com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113e26a1ad668817a48a08ed6a71ee07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113e26a1ad668817a48a08ed6a71ee07");
            return;
        }
        if (this.p != null) {
            this.p.c();
            this.p = null;
        }
        super.a();
    }

    public static e a(com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d47648ce37b123024450b264768e842b", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d47648ce37b123024450b264768e842b");
        }
        e acquire = q.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.p = eVar;
        acquire.b = false;
        return acquire;
    }
}
