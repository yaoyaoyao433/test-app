package com.dianping.shield.node.cellnode;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class InnerHoverInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Drawable bottomDrawable;
    public int endPos;
    public HoverStateChangeListener listener;
    public boolean needAutoOffset;
    public int offset;
    public int startPos;
    public Drawable topDrawable;
    public HoverType type;
    public int zPosition;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface HoverStateChangeListener {
        void onStateChanged(ShieldDisplayNode shieldDisplayNode, HoverState hoverState);
    }

    public abstract int getBaseLine(int i, int i2);

    public abstract boolean isEndHover(int i, int i2, int i3);

    public abstract boolean isHover(int i, int i2, int i3);

    public InnerHoverInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c257087ac93d61099818cc99409db69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c257087ac93d61099818cc99409db69");
            return;
        }
        this.startPos = -1;
        this.endPos = Integer.MAX_VALUE;
        this.needAutoOffset = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum HoverState {
        NORMAL,
        HOVER,
        END;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HoverState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bae5c5f4372ac0b60e292ef1602b3670", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bae5c5f4372ac0b60e292ef1602b3670");
            }
        }

        public static HoverState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ea98d3160d2bab997d954c336711a3e", RobustBitConfig.DEFAULT_VALUE) ? (HoverState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ea98d3160d2bab997d954c336711a3e") : (HoverState) Enum.valueOf(HoverState.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HoverState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7e4984ddb94250af42a8d169735f75a", RobustBitConfig.DEFAULT_VALUE) ? (HoverState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7e4984ddb94250af42a8d169735f75a") : (HoverState[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum HoverType {
        HOVER_TOP,
        HOVER_BOTTOM,
        HOVER_NORMAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HoverType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14805a5245ea5e3c6e250d06ccb32b76", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14805a5245ea5e3c6e250d06ccb32b76");
            }
        }

        public static HoverType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9130578a98645b485cbdd7dade1aeef", RobustBitConfig.DEFAULT_VALUE) ? (HoverType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9130578a98645b485cbdd7dade1aeef") : (HoverType) Enum.valueOf(HoverType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HoverType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4b12f292413d97d25a7107737327173", RobustBitConfig.DEFAULT_VALUE) ? (HoverType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4b12f292413d97d25a7107737327173") : (HoverType[]) values().clone();
        }
    }
}
