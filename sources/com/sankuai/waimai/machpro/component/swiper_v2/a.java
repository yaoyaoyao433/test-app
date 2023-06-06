package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends MPViewPager.c {
    public static ChangeQuickRedirect a;
    @NonNull
    private final List<MPViewPager.c> b;

    public a(int i) {
        Object[] objArr = {3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690bcccb2831247086d5d779c57a8238", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690bcccb2831247086d5d779c57a8238");
        } else {
            this.b = new ArrayList(3);
        }
    }

    public final void a(MPViewPager.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e588361be8d8a718501f7900429bf0c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e588361be8d8a718501f7900429bf0c6");
        } else {
            this.b.add(cVar);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void a(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575927c82430b07882eff136851bdb2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575927c82430b07882eff136851bdb2d");
            return;
        }
        try {
            for (MPViewPager.c cVar : this.b) {
                cVar.a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c520671eab7be48368c4fa6f28d5eebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c520671eab7be48368c4fa6f28d5eebc");
            return;
        }
        try {
            for (MPViewPager.c cVar : this.b) {
                cVar.a(i);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e0dabd0bbc865fcdf64e241de21e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e0dabd0bbc865fcdf64e241de21e94");
            return;
        }
        try {
            for (MPViewPager.c cVar : this.b) {
                cVar.b(i);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }

    private void a(ConcurrentModificationException concurrentModificationException) {
        Object[] objArr = {concurrentModificationException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0865d99cac270dee299ade7cdc07c1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0865d99cac270dee299ade7cdc07c1e9");
        } else {
            com.sankuai.waimai.machpro.util.a.a("Adding and removing callbacks during dispatch to callbacks is not supported");
        }
    }
}
