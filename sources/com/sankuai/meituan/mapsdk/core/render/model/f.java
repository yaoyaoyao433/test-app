package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public com.sankuai.meituan.mapsdk.core.render.a b;
    public long c;
    public String d;
    public String e;

    public f(com.sankuai.meituan.mapsdk.core.render.a aVar, String str, String str2) {
        String str3;
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9b725ef62445247b294addc5b3037f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9b725ef62445247b294addc5b3037f");
            return;
        }
        this.b = aVar;
        if (str != null) {
            str3 = str;
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6a698780998e3da2df7f5f686194c1ba", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6a698780998e3da2df7f5f686194c1ba");
            } else {
                str3 = "msa-layer-" + System.nanoTime() + ((int) (Math.random() * 100.0d));
            }
        }
        this.d = str3;
        this.e = str2;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc1c6e4098d6230f78a79888c77db4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc1c6e4098d6230f78a79888c77db4a")).booleanValue();
        }
        if (this.b != null) {
            this.c = this.b.createLayer(this.d, this.e);
            this.b.addLayer(this.c);
            this.b.setSourceLayer(this.c, this.e);
        }
        return com.sankuai.meituan.mapsdk.mapcore.utils.h.a(this.c);
    }

    public final boolean a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2519464d1f0cc34cee1a2c23b1856ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2519464d1f0cc34cee1a2c23b1856ed")).booleanValue();
        }
        if (this.b != null && fVar != null) {
            this.c = this.b.copyLayer(fVar.c, this.d, this.e);
            this.b.addLayer(this.c);
            this.b.setSourceLayer(this.c, this.e);
        }
        return com.sankuai.meituan.mapsdk.mapcore.utils.h.a(this.c);
    }

    public final void a(float f, g gVar) {
        Object[] objArr = {Float.valueOf(f), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ff3c179bcece2ee900e5d9ebdf60ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ff3c179bcece2ee900e5d9ebdf60ce");
        } else if (this.b != null) {
            this.b.setLayerOrder(this.c, f, gVar);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a330cc1c1c3b7a937b0ba08779d6cde4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a330cc1c1c3b7a937b0ba08779d6cde4");
        } else if (this.b != null) {
            this.b.setLayerInteractive(this.c, z);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f4be49578f205f04e028014aeb0b326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f4be49578f205f04e028014aeb0b326");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, z);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("Layer.setProperty flag: " + i + ", value: " + z);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b050dc2583a09261f2efd71267bf0dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b050dc2583a09261f2efd71267bf0dad");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, i2);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("Layer.setProperty flag: " + i + ", value: " + i2);
        }
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95a9b7135234be45151ae662c88ebdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95a9b7135234be45151ae662c88ebdfc");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, f);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("Layer.setProperty flag: " + i + ", value: " + f);
        }
    }

    public final void a(int i, float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7322cb4c37638805fd8ae4059cd13d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7322cb4c37638805fd8ae4059cd13d31");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, fArr);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("Layer.setProperty flag: " + i + ", value: " + Arrays.toString(fArr));
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6e9419dcd8e507261eb165f92c5644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6e9419dcd8e507261eb165f92c5644");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, str);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("Layer.setProperty flag: " + i + ", value: " + str);
        }
    }

    public final void a(int i, boolean z, String str) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4961b6cf171e15345593bcb753aa5c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4961b6cf171e15345593bcb753aa5c1c");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, z, str);
        }
    }

    public final void a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15e22ccd3b806c0d3643eb7d65d95f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15e22ccd3b806c0d3643eb7d65d95f5");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, i2, str);
        }
    }

    public final void a(int i, float f, String str) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88baec11bbaeaba81941d673769fd531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88baec11bbaeaba81941d673769fd531");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, i, f, str);
        }
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf((int) MapConstant.LayerPropertyFlag_IconImage), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de743c149d3c977f3bae62439c00543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de743c149d3c977f3bae62439c00543");
        } else if (this.b != null) {
            this.b.setLayerProperty(this.c, MapConstant.LayerPropertyFlag_IconImage, str, str2);
        }
    }

    public final void b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242f500359a1cc7339481addba2f957e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242f500359a1cc7339481addba2f957e");
        } else if (this.b != null) {
            this.b.setLayerPropertyByDataDriven(this.c, i, str);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95384c0eef7fd28829521a42f7c46fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95384c0eef7fd28829521a42f7c46fda");
        } else if (this.b != null) {
            this.b.setLayerVisibility(this.c, z);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae341aea1d17940a534fc7ad992c4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae341aea1d17940a534fc7ad992c4b5");
        } else if (this.b != null) {
            this.b.setLayerMaxZoom(this.c, f);
        }
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fff42f19a4250f09ba7175f5634ee10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fff42f19a4250f09ba7175f5634ee10");
        } else if (this.b != null) {
            this.b.setLayerMinZoom(this.c, f);
        }
    }
}
