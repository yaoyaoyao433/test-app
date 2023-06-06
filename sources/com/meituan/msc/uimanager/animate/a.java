package com.meituan.msc.uimanager.animate;

import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    b b;
    b c;
    float d;

    private double a(double d, double d2, double d3) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c299790a6a132ba941d0dd69061f319", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c299790a6a132ba941d0dd69061f319")).doubleValue() : d > d2 ? d - ((d - d2) * d3) : d + ((d2 - d) * d3);
    }

    public a(b bVar, b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25721b49b05ce050d17d7ee90a3d3259", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25721b49b05ce050d17d7ee90a3d3259");
            return;
        }
        this.b = bVar;
        this.c = bVar2;
    }

    public final WritableMap a() {
        WritableMap writableMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43fc346b6f588347b1ed5ed81f67f7e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43fc346b6f588347b1ed5ed81f67f7e6");
        }
        if (this.b == null || this.c == null) {
            return null;
        }
        b bVar = this.b;
        b bVar2 = this.c;
        float f = this.d;
        Object[] objArr2 = {bVar, bVar2, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "198ad266cfe9a339763ab8456508b3c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "198ad266cfe9a339763ab8456508b3c1");
        }
        if (bVar == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        if (bVar2.b >= 0.0d && bVar.b >= 0.0d && bVar2.b <= 1.0d && bVar.b <= 1.0d) {
            createMap.putDouble("opacity", a(bVar.b, bVar2.b, f));
        }
        WritableArray createArray = Arguments.createArray();
        createMap.putArray("transform", createArray);
        if (bVar2.c == null || bVar.c == null || bVar2.c.size() != 2 || bVar.c.size() != 2) {
            writableMap = createMap;
        } else {
            WritableArray createArray2 = Arguments.createArray();
            int i = 0;
            while (i < bVar2.c.size()) {
                WritableArray writableArray = createArray2;
                writableArray.pushDouble(a(bVar.c.getDouble(i), bVar2.c.getDouble(i), f));
                i++;
                createArray2 = writableArray;
                createMap = createMap;
            }
            writableMap = createMap;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putArray("scale", createArray2);
            createArray.pushMap(createMap2);
        }
        if (bVar2.d != null && bVar.d != null && bVar2.d.size() == 2 && bVar.d.size() == 2) {
            WritableArray createArray3 = Arguments.createArray();
            for (int i2 = 0; i2 < bVar2.d.size(); i2++) {
                createArray3.pushDouble(a(bVar.d.getDouble(i2), bVar2.d.getDouble(i2), f));
            }
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putArray("translate", createArray3);
            createArray.pushMap(createMap3);
        }
        if (bVar2.e >= 0.0d && bVar.e >= 0.0d) {
            WritableMap createMap4 = Arguments.createMap();
            double a2 = a(bVar.e, bVar2.e, f);
            createMap4.putString(AnimationViewCommandModel.Rotation, a2 + "deg");
            createArray.pushMap(createMap4);
        }
        return writableMap;
    }

    public static WritableMap a(ReadableMap readableMap, b bVar) {
        Object[] objArr = {readableMap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9226d9b16270a3b40c2721177dd0a7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9226d9b16270a3b40c2721177dd0a7e");
        }
        if (bVar == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        if (readableMap == null || (readableMap.hasKey("opacity") && readableMap.getBoolean("opacity"))) {
            createMap.putDouble("opacity", bVar.b);
        }
        if (readableMap == null || readableMap.hasKey("scale") || readableMap.hasKey("translate") || readableMap.hasKey(AnimationViewCommandModel.Rotation)) {
            WritableArray createArray = Arguments.createArray();
            createMap.putArray("transform", createArray);
            if (readableMap == null || (readableMap.hasKey("scale") && readableMap.getBoolean("scale"))) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putArray("scale", bVar.c);
                createArray.pushMap(createMap2);
            }
            if (readableMap == null || (readableMap.hasKey("translate") && readableMap.getBoolean("translate"))) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putArray("translate", bVar.d);
                createArray.pushMap(createMap3);
            }
            if (readableMap == null || (readableMap.hasKey(AnimationViewCommandModel.Rotation) && readableMap.getBoolean(AnimationViewCommandModel.Rotation))) {
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString(AnimationViewCommandModel.Rotation, bVar.e + "deg");
                createArray.pushMap(createMap4);
            }
        }
        return createMap;
    }
}
