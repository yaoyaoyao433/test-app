package com.meituan.msc.uimanager.animate;

import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.MSCWritableArray;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public double b;
    public ReadableArray c;
    public ReadableArray d;
    public double e;
    public double f;
    private String g;

    public b() {
    }

    public b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f346aa3db14eda7b32b49a584391ae3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f346aa3db14eda7b32b49a584391ae3d");
        } else if (bVar != null) {
            this.g = bVar.g;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.f = bVar.f;
        }
    }

    public b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d493c8de7abeb64100477afae64fc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d493c8de7abeb64100477afae64fc8");
        } else if (readableMap == null) {
        } else {
            double d = -1.0d;
            this.f = (readableMap.hasKey("offset") && readableMap.getType("offset") == ReadableType.Number) ? readableMap.getDouble("offset") : -1.0d;
            if (this.f < 0.0d || this.f > 1.0d) {
                throw new RuntimeException("offset must between 0 and 1");
            }
            ReadableArray readableArray = null;
            this.g = (readableMap.hasKey(CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE) && readableMap.getType(CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE) == ReadableType.String) ? readableMap.getString(CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE) : null;
            if (readableMap.hasKey("opacity") && readableMap.getType("opacity") == ReadableType.Number) {
                double d2 = readableMap.getDouble("opacity");
                double d3 = d2 >= 0.0d ? d2 : 0.0d;
                this.b = d3 > 1.0d ? 1.0d : d3;
            } else {
                this.b = -1.0d;
            }
            if (readableMap.hasKey("scale") && readableMap.getType("scale") == ReadableType.Array) {
                readableArray = readableMap.getArray("scale");
            }
            this.c = readableArray;
            this.d = a(readableMap);
            if (readableMap.hasKey(AnimationViewCommandModel.Rotation) && readableMap.getType(AnimationViewCommandModel.Rotation) == ReadableType.Number) {
                d = readableMap.getInt(AnimationViewCommandModel.Rotation);
            }
            this.e = d;
        }
    }

    private ReadableArray a(ReadableMap readableMap) {
        double d;
        int i = 1;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78912bcdda2a2bacb9a702ffd57da3ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78912bcdda2a2bacb9a702ffd57da3ec");
        }
        MSCWritableArray mSCWritableArray = new MSCWritableArray();
        ReadableArray array = (readableMap.hasKey("translate") && readableMap.getType("translate") == ReadableType.Array) ? readableMap.getArray("translate") : null;
        if (array == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < array.size()) {
            Dynamic dynamic = array.getDynamic(i2);
            if (dynamic == null) {
                d = 0.0d;
            } else if (dynamic.getType() == ReadableType.Number) {
                d = dynamic.asDouble();
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                Object[] objArr2 = new Object[i];
                objArr2[0] = asString;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f1dc203af9a4f9c0ed5f02fd84772bc", RobustBitConfig.DEFAULT_VALUE)) {
                    d = ((Double) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f1dc203af9a4f9c0ed5f02fd84772bc")).doubleValue();
                } else if (asString.endsWith("rpx")) {
                    double parseDouble = (Double.parseDouble(asString.substring(0, asString.length() - 3)) / 750.0d) * com.meituan.msc.uimanager.c.b.widthPixels;
                    double floor = parseDouble >= 0.0d ? Math.floor(parseDouble + 1.0E-4d) : Math.ceil(parseDouble - 1.0E-4d);
                    if (floor == 0.0d) {
                        floor = 1.0d;
                    }
                    d = floor;
                } else {
                    d = 0.0d;
                    if (asString.endsWith("px")) {
                        d = Double.parseDouble(asString.substring(0, asString.length() - 2)) / com.meituan.msc.uimanager.c.b.density;
                    }
                }
            } else {
                i2++;
                i = 1;
            }
            mSCWritableArray.pushDouble(d);
            i2++;
            i = 1;
        }
        return mSCWritableArray;
    }
}
