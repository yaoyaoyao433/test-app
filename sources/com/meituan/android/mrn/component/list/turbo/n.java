package com.meituan.android.mrn.component.list.turbo;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;
    final ConcurrentHashMap<String, List<f>> b;

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6172cfcb8e35aabcca7a9224b0307246", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6172cfcb8e35aabcca7a9224b0307246");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public static Object a(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45a120578dd2746e0d6beebe5cf24b96", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45a120578dd2746e0d6beebe5cf24b96");
        }
        ReadableType readableType = ReadableType.Null;
        try {
            readableType = dynamic.getType();
        } catch (Exception unused) {
        }
        switch (readableType) {
            case Boolean:
                return Boolean.valueOf(dynamic.asBoolean());
            case String:
                return dynamic.asString();
            case Array:
                return dynamic.asArray();
            case Map:
                return dynamic.asMap();
            case Number:
                double asDouble = dynamic.asDouble();
                int i = (int) asDouble;
                if (asDouble == i) {
                    return Integer.valueOf(i);
                }
                return Double.valueOf(asDouble);
            case Null:
                return null;
            default:
                throw new IllegalStateException("unknown type " + dynamic.getType());
        }
    }
}
