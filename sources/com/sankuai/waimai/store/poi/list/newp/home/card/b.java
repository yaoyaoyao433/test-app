package com.sankuai.waimai.store.poi.list.newp.home.card;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.c;
import com.sankuai.waimai.store.assembler.component.e;
import com.sankuai.waimai.store.assembler.component.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    protected f b;
    protected FragmentActivity c;
    private BaseCard d;

    public b(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db4021e8dabadb25ab29599b9cea843", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db4021e8dabadb25ab29599b9cea843");
            return;
        }
        this.d = null;
        this.b = fVar;
        this.c = fragmentActivity;
    }

    public final BaseCard a(final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8878c15533fbe4123dbb97a3a5d1c07", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8878c15533fbe4123dbb97a3a5d1c07");
        }
        if (this.d == null) {
            c cVar = new c(this.b, this.c);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.Float;
            cVar.c = new i() { // from class: com.sankuai.waimai.store.poi.list.newp.home.card.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bed3c578f320f46e687ad744014ecf00", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bed3c578f320f46e687ad744014ecf00") : new PoiFloatCard(b.this.b, b.this.c, eVar);
                }
            };
            this.d = cVar.a();
        }
        return this.d;
    }
}
