package com.meituan.mtmap.rendersdk.style.layer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public class Layer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum LayerOrderType {
        Auto(0),
        Order2D(1),
        Order3D(100),
        OrderSymbol(200);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int value;

        public static LayerOrderType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33ad10d30f8af8e747e6f8d79c56ef0c", RobustBitConfig.DEFAULT_VALUE) ? (LayerOrderType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33ad10d30f8af8e747e6f8d79c56ef0c") : (LayerOrderType) Enum.valueOf(LayerOrderType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LayerOrderType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8ff404c68c9c26ba6c688d00e6cef0e", RobustBitConfig.DEFAULT_VALUE) ? (LayerOrderType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8ff404c68c9c26ba6c688d00e6cef0e") : (LayerOrderType[]) values().clone();
        }

        LayerOrderType(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f8179822d4a47e2615552f6dd93a40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f8179822d4a47e2615552f6dd93a40");
                return;
            }
            this.value = 0;
            this.value = i;
        }

        public final int value() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum LayerType {
        Point,
        Polygon,
        Line,
        Raster;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        LayerType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd629d6635dba73ef5c7e35ef088b4ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd629d6635dba73ef5c7e35ef088b4ef");
            }
        }

        public static LayerType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ed57df7aaba6d4f376c0be1850ac246", RobustBitConfig.DEFAULT_VALUE) ? (LayerType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ed57df7aaba6d4f376c0be1850ac246") : (LayerType) Enum.valueOf(LayerType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LayerType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a0278368637acbc932575d33818a386", RobustBitConfig.DEFAULT_VALUE) ? (LayerType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a0278368637acbc932575d33818a386") : (LayerType[]) values().clone();
        }
    }
}
