package com.sankuai.waimai.store.poi.list.adapter.subcategory;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public Drawable m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e42b634e5494f43ca0dc6b0dead1db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e42b634e5494f43ca0dc6b0dead1db");
            return;
        }
        this.e = -14539738;
        this.f = -8026489;
        this.g = -26367;
        this.h = -32256;
        this.i = -14539738;
        this.j = -1;
        this.o = false;
        this.p = true;
        this.q = false;
    }

    public static void a(PoiVerticalityDataResponse.Promotion promotion, boolean z, b bVar, boolean z2) {
        Object[] objArr = {promotion, Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03509ce7b28e82db4d956eef6275fc43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03509ce7b28e82db4d956eef6275fc43");
        } else if (promotion.buttonArea != null) {
            PoiVerticalityDataResponse.ButtonArea buttonArea = promotion.buttonArea;
            if (t.a(buttonArea.startColor) || t.a(buttonArea.endColor)) {
                return;
            }
            bVar.g = d.a(buttonArea.startColor, -26367);
            bVar.h = d.a(buttonArea.endColor, -32256);
            if (z2) {
                bVar.e = d.a(buttonArea.endColor, -32256);
            }
        }
    }
}
