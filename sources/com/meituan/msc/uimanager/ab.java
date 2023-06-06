package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    public static ChangeQuickRedirect a;
    public final ReadableMap b;

    public ab(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07eb24207e9150053b16ce0c610f319", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07eb24207e9150053b16ce0c610f319");
        } else {
            this.b = readableMap;
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef1b6cf5268a270397959586a70671a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef1b6cf5268a270397959586a70671a")).booleanValue() : this.b.hasKey(str);
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf7befd52e4ed4c5ae99c5a66724dda", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf7befd52e4ed4c5ae99c5a66724dda")).booleanValue() : this.b.isNull(str) ? z : this.b.getBoolean(str);
    }

    public final float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d99585e5d01c1b397d8eb562f04245", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d99585e5d01c1b397d8eb562f04245")).floatValue() : this.b.isNull(str) ? f : (float) this.b.getDouble(str);
    }

    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574583f14f7871133a5eebc8375e6d5f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574583f14f7871133a5eebc8375e6d5f")).intValue() : this.b.isNull(str) ? i : this.b.getInt(str);
    }

    @Nullable
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642947dd0f16339488772bae01899914", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642947dd0f16339488772bae01899914") : this.b.getString(str);
    }

    @Nullable
    public final Dynamic c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ef1b596f4bb0c5ebef0db74f86ccfd", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ef1b596f4bb0c5ebef0db74f86ccfd") : this.b.getDynamic(str);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069cb0554e4b05a52fe2d3a9bd89d24a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069cb0554e4b05a52fe2d3a9bd89d24a");
        }
        return "{ " + getClass().getSimpleName() + ": " + this.b.toString() + " }";
    }
}
