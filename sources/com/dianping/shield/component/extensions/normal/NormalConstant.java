package com.dianping.shield.component.extensions.normal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalConstant;", "", "()V", "ArrowPositionType", "ContextActionStyle", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalConstant {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalConstant$ArrowPositionType;", "", "(Ljava/lang/String;I)V", "CellCenter", "ContentCenter", "ContentTop", "ContentBottom", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum ArrowPositionType {
        CellCenter,
        ContentCenter,
        ContentTop,
        ContentBottom;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static ArrowPositionType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (ArrowPositionType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98bbad1b8e9c1daa0c15ac0205f53db7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98bbad1b8e9c1daa0c15ac0205f53db7") : Enum.valueOf(ArrowPositionType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ArrowPositionType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (ArrowPositionType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c23e6d37a484113c314211a3b5e0f61", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c23e6d37a484113c314211a3b5e0f61") : values().clone());
        }

        ArrowPositionType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7590fe3dddaad36fe1010d012370b4ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7590fe3dddaad36fe1010d012370b4ae");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalConstant$ContextActionStyle;", "", "(Ljava/lang/String;I)V", "Normal", "Destructive", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum ContextActionStyle {
        Normal,
        Destructive;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static ContextActionStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (ContextActionStyle) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc1603c66bb683002a8ae4f6e15053c4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc1603c66bb683002a8ae4f6e15053c4") : Enum.valueOf(ContextActionStyle.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ContextActionStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (ContextActionStyle[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "102f4e9abfd61bf68e1577f79e20d941", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "102f4e9abfd61bf68e1577f79e20d941") : values().clone());
        }

        ContextActionStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce1de264346e23bf14fb24bde7e08e6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce1de264346e23bf14fb24bde7e08e6d");
            }
        }
    }
}
