package com.sankuai.meituan.mapsdk.tencentadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.u;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r implements u {
    public static ChangeQuickRedirect a;
    public TileOverlay b;
    public TileOverlayOptions c;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
    }

    public r(TileOverlay tileOverlay, TileOverlayOptions tileOverlayOptions) {
        Object[] objArr = {tileOverlay, tileOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468540d86c54ff0d057e2cc2741dfa8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468540d86c54ff0d057e2cc2741dfa8f");
            return;
        }
        this.b = tileOverlay;
        this.c = tileOverlayOptions;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c65dccbdfc9ab61e2f304885307e83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c65dccbdfc9ab61e2f304885307e83");
        } else {
            this.b.reload();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352f4bd25fa5a047e5cdab7e51bebad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352f4bd25fa5a047e5cdab7e51bebad8");
        } else {
            this.b.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void setDiskCacheDir(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4441f1da1b8c54086a3c57079fcec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4441f1da1b8c54086a3c57079fcec2");
        } else {
            this.b.setDiskCacheDir(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87024fca0ac1679ee39c70e4c353dbbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87024fca0ac1679ee39c70e4c353dbbb");
        } else {
            this.b.setZindex((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void clearTileCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86b82d3af0bebbd082e6b3849895574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86b82d3af0bebbd082e6b3849895574");
        } else {
            this.b.clearTileCache();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75cbfcbafcc46e3e5a840fb358a93493", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75cbfcbafcc46e3e5a840fb358a93493") : this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1428b73b360517aa60ae9a6dfcda6bf4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1428b73b360517aa60ae9a6dfcda6bf4")).floatValue();
        }
        if (this.c == null) {
            return 0.0f;
        }
        return this.c.getZIndex();
    }
}
