package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends e {
    public static ChangeQuickRedirect a;
    protected int b;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377b3125efd4b7d1c5b4249fb464a080", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377b3125efd4b7d1c5b4249fb464a080");
        } else {
            this.b = i;
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final f a(View view, int i, int i2, int i3, int i4, int i5) {
        int max;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c70d1760fb6127f897b99468f966a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c70d1760fb6127f897b99468f966a0");
        }
        Object[] objArr2 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd170be8faa0878ba0298d49179045cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd170be8faa0878ba0298d49179045cf");
        }
        int i6 = i2 > 0 ? 2 : 1;
        float f = i3 / i2;
        int left = (this.d - view.getLeft()) * (i2 > 0 ? 1 : -1);
        int i7 = (int) (left * f);
        Object[] objArr3 = {Integer.valueOf(left), Integer.valueOf(i7), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        int intValue = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51ccebbce767c060a75931fb7a200cf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51ccebbce767c060a75931fb7a200cf1")).intValue() : (int) Math.sqrt(Math.pow(left - i2, 2.0d) + Math.pow(i7 - i3, 2.0d));
        if (Math.abs(i4) > this.f) {
            max = (int) Math.min((intValue / Math.abs(i4)) * 1800.0f, 350.0f);
        } else {
            max = Math.max(350, intValue / 2);
        }
        return new f(left, i7, max, new LinearInterpolator(), i6);
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final f b(View view, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2add54d0d0fef948b149ef95abc02c87", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2add54d0d0fef948b149ef95abc02c87") : new f(0, 0, 350, new LinearInterpolator());
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final boolean c(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f157604f8962f0c1cd5db35e5ed86438", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f157604f8962f0c1cd5db35e5ed86438")).booleanValue();
        }
        if (!(this.b != 0 ? Math.abs(i3) >= view.getHeight() / 2 : Math.abs(i2) >= view.getWidth() / 2)) {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66fdb6b50ab0238201767555dd7b7f7a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66fdb6b50ab0238201767555dd7b7f7a")).booleanValue();
            } else {
                int abs = Math.abs(i4);
                z = abs > this.f * 3 && abs >= Math.abs(i5);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
