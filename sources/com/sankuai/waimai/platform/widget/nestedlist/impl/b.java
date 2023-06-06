package com.sankuai.waimai.platform.widget.nestedlist.impl;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.platform.widget.recycler.d implements com.sankuai.waimai.platform.widget.nestedlist.interfaces.d {
    public static ChangeQuickRedirect c;
    @NonNull
    private final d a;
    @NonNull
    protected final GroupItemInfo d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adc8d99919de93813a263d4046c300cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adc8d99919de93813a263d4046c300cc");
            return;
        }
        this.d = new GroupItemInfo();
        this.a = new d(this);
    }

    public int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fe1cd72062ee5c8e327e1627bcf94e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fe1cd72062ee5c8e327e1627bcf94e")).intValue();
        }
        a(i, this.d);
        return this.d.b;
    }

    public boolean e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf913a41432851f2b072eba5205a8477", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf913a41432851f2b072eba5205a8477")).booleanValue();
        }
        a(i, this.d);
        return this.d.b();
    }

    public boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c97f87d644da6106427fc092b626a8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c97f87d644da6106427fc092b626a8c")).booleanValue();
        }
        d dVar = this.a;
        return dVar.b == i && dVar.c == i2;
    }
}
