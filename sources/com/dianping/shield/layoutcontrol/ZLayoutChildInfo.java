package com.dianping.shield.layoutcontrol;

import android.graphics.drawable.Drawable;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ZLayoutChildInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int baseY;
    public Drawable bottomDrawable;
    public int gravity;
    public HoverLayer hoverLayer;
    public ShieldDisplayNode node;
    public Drawable topDrawable;
    public int translationY;
    public InnerHoverInfo.HoverType type;
    public int zPosition;

    public ZLayoutChildInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2c819fd2f4add4bb9a3cc4a91563e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2c819fd2f4add4bb9a3cc4a91563e9");
        } else {
            this.hoverLayer = HoverLayer.HOVER_TOP_BOTTOM_LAYER;
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93a6e0262e248565c12c78b03e749297", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93a6e0262e248565c12c78b03e749297")).intValue();
        }
        return ((((((((((((this.type != null ? this.type.hashCode() : 0) * 31) + this.zPosition) * 31) + this.gravity) * 31) + this.baseY) * 31) + this.translationY) * 31) + (this.topDrawable != null ? this.topDrawable.hashCode() : 0)) * 31) + (this.bottomDrawable != null ? this.bottomDrawable.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c90dd5da82b6c0991c51fb02d9e17a97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c90dd5da82b6c0991c51fb02d9e17a97")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZLayoutChildInfo zLayoutChildInfo = (ZLayoutChildInfo) obj;
        return this.baseY == zLayoutChildInfo.baseY && this.translationY == zLayoutChildInfo.translationY && this.type == zLayoutChildInfo.type && this.zPosition == zLayoutChildInfo.zPosition && this.topDrawable == zLayoutChildInfo.topDrawable && this.bottomDrawable == zLayoutChildInfo.bottomDrawable && this.gravity == zLayoutChildInfo.gravity;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum HoverLayer {
        NORMAL_FLOATVIEW_LAYER(10000),
        HOVER_TOP_BOTTOM_LAYER(0),
        SCROLL_FLOATVIEW_LAYER(XPlayerConstants.MEDIA_ERROR_IJK_PLAYER);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mLayer;

        public static HoverLayer valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b52802cc83af8cb0debadcdf1860a92f", RobustBitConfig.DEFAULT_VALUE) ? (HoverLayer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b52802cc83af8cb0debadcdf1860a92f") : (HoverLayer) Enum.valueOf(HoverLayer.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HoverLayer[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f9b00f93f3649dfa03976ad27dfc03c", RobustBitConfig.DEFAULT_VALUE) ? (HoverLayer[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f9b00f93f3649dfa03976ad27dfc03c") : (HoverLayer[]) values().clone();
        }

        HoverLayer(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d455614f3785e13a854ff4460c4f3c50", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d455614f3785e13a854ff4460c4f3c50");
            } else {
                this.mLayer = i;
            }
        }

        public final int value() {
            return this.mLayer;
        }

        public static HoverLayer fromInt(int i) {
            HoverLayer[] valuesCustom;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d2b0646182b5c39fb0203d1b4c21e99", RobustBitConfig.DEFAULT_VALUE)) {
                return (HoverLayer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d2b0646182b5c39fb0203d1b4c21e99");
            }
            for (HoverLayer hoverLayer : valuesCustom()) {
                if (hoverLayer.mLayer == i) {
                    return hoverLayer;
                }
            }
            return null;
        }
    }
}
