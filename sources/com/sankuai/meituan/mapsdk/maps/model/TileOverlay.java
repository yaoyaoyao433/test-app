package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.u;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class TileOverlay implements u {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final u a;

    public TileOverlay(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e2c3ab2ee05281dbfbe7a6490621375", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e2c3ab2ee05281dbfbe7a6490621375");
        } else {
            this.a = uVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void reload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5686d4b5e6ae9fca0653939545e0fa97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5686d4b5e6ae9fca0653939545e0fa97");
        } else {
            this.a.reload();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7af8da28948dbbd42b463b916119e513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7af8da28948dbbd42b463b916119e513");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void setDiskCacheDir(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "955973fc81b4ca27eae5b79673417ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "955973fc81b4ca27eae5b79673417ed4");
        } else {
            this.a.setDiskCacheDir(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a52e4842813f7d1e579810f1fd58bd08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a52e4842813f7d1e579810f1fd58bd08");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c866a2b3de230784efc9dc8441b0ce4a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c866a2b3de230784efc9dc8441b0ce4a")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u
    public final void clearTileCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65330fef9b60191468f47c5fe0c65179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65330fef9b60191468f47c5fe0c65179");
        } else {
            this.a.clearTileCache();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.u, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f03fcc272055408fb7d10c24c705c607", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f03fcc272055408fb7d10c24c705c607") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b4323a76d07736873ff3817a07a8096", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b4323a76d07736873ff3817a07a8096")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5236a5725d917495da811b5dd927510b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5236a5725d917495da811b5dd927510b");
        } else {
            this.a.setVisible(z);
        }
    }
}
