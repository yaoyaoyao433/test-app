package com.meituan.android.mrn.component.map.view.childview.tile;

import android.content.Context;
import com.meituan.android.mrn.component.map.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.Tile;
import com.sankuai.meituan.mapsdk.maps.model.TileProvider;
/* loaded from: classes2.dex */
public final class c implements TileProvider {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final int c;
    private final int d;
    private final a e;

    /* loaded from: classes2.dex */
    public interface a {
        byte[] a(int i, int i2, int i3);
    }

    public c(Context context, a aVar) {
        this(context, aVar, 256, 256);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa748efa3fe9b20ebcb09317ccf901af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa748efa3fe9b20ebcb09317ccf901af");
        }
    }

    private c(Context context, a aVar, int i, int i2) {
        Object[] objArr = {context, aVar, 256, 256};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a08e857c4b483a2d698b9d9277ffd67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a08e857c4b483a2d698b9d9277ffd67");
            return;
        }
        this.b = context.getApplicationContext();
        this.e = aVar;
        this.c = 256;
        this.d = 256;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f994eb26b848e02a4a5b05d6ef0e6132", RobustBitConfig.DEFAULT_VALUE)) {
            return (Tile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f994eb26b848e02a4a5b05d6ef0e6132");
        }
        Tile tile = NO_TILE;
        long currentTimeMillis = System.currentTimeMillis();
        e.a("MRNMap", "[s1]" + Thread.currentThread().getId() + " [" + i + CommonConstant.Symbol.COMMA + i2 + CommonConstant.Symbol.COMMA + i3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        byte[] a2 = this.e.a(i, i2, i3);
        if (a2 != null && a2.length != 0) {
            tile = new Tile(this.c, this.d, a2);
        }
        StringBuilder sb = new StringBuilder("[e1]");
        sb.append(Thread.currentThread().getId());
        sb.append(" [");
        sb.append(i);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(i2);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(i3);
        sb.append("] time:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" data:");
        sb.append(a2 != null ? Integer.valueOf(a2.length) : "0");
        e.a("MRNMap", sb.toString());
        return tile;
    }
}
