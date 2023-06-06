package com.sankuai.waimai.store.poi.list.cp;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.Porcelain;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.poi.list.cp.base.a {
    public static ChangeQuickRedirect g;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;

    public c(Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1b5372f44cfc61a61fe083d90a97e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1b5372f44cfc61a61fe083d90a97e1");
            return;
        }
        this.F = 62;
        a(context);
        this.z = aVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.cp.base.a
    public final void a(Porcelain porcelain, int i, int i2, PoiVerticalityDataResponse poiVerticalityDataResponse, int i3, Map<String, Object> map) {
        Object[] objArr = {porcelain, Integer.valueOf(i), Integer.valueOf(i2), poiVerticalityDataResponse, Integer.valueOf(i3), map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64dd4a34810608d9b33ad89e177c16cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64dd4a34810608d9b33ad89e177c16cc");
            return;
        }
        super.a(porcelain, i, i2, poiVerticalityDataResponse, i3, map);
        a(porcelain, porcelain.isBigCard());
    }

    public final void a(boolean z, boolean z2, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e80f80e90b05cce5b17ba3ebe5cb903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e80f80e90b05cce5b17ba3ebe5cb903");
            return;
        }
        this.D = i;
        this.E = i2;
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.n.getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.o.getLayoutParams();
        if (aVar == null || aVar2 == null) {
            return;
        }
        this.H = i - 12;
        this.I = (i2 - 18) - 62;
        this.G = z2 ? this.I : this.H;
        aVar.width = h.a(this.i, this.F);
        aVar.height = h.a(this.i, this.F);
        aVar2.width = h.a(this.i, this.G);
        aVar2.height = h.a(this.i, this.G);
        if (getLayoutParams() != null) {
            getLayoutParams().height = h.a(this.i, z ? this.I + 42 : 124.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
        layoutParams.width = h.a(this.i, i2 - 2);
        this.u.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.poi.list.cp.base.a
    public final void a(Porcelain porcelain, boolean z) {
        Object[] objArr = {porcelain, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997d02140d9a64651859368b7e744b95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997d02140d9a64651859368b7e744b95");
            return;
        }
        super.a(porcelain, z);
        this.n.setAlpha(z ? 1.0f : 0.0f);
        this.p.setAlpha(z ? 1.0f : 0.0f);
    }

    public final void a(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2061c8bd088af9adfc649b6cfba3b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2061c8bd088af9adfc649b6cfba3b5");
            return;
        }
        if (!z) {
            f2 = 1.0f - f2;
        }
        double d = f2;
        this.u.setAlpha(d <= 0.1d ? 0.0f : 1.0f);
        if (d >= 0.5d) {
            float f3 = (f2 - 0.5f) * 2.0f;
            this.n.setAlpha(f3);
            this.p.setAlpha(f3);
        }
    }

    public final void a(Porcelain porcelain, boolean z, float f) {
        Object[] objArr = {porcelain, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159b855794c817abd6f0b9e46f27b309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159b855794c817abd6f0b9e46f27b309");
            return;
        }
        Math.min(1.0f, f * 2.0f);
        Math.max(0.0f, (1.0f - f) * 2.0f);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b074ba65df454ba625125f7af244c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b074ba65df454ba625125f7af244c2");
            return;
        }
        int a = h.a(this.i, (f * (this.I - this.H)) + this.H);
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.o.getLayoutParams();
        if (aVar != null) {
            aVar.width = a;
            aVar.height = a;
        }
    }
}
