package com.dianping.shield.node.useritem;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.dianping.shield.node.PositionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DividerStyle {
    public static final int INVALID_OFFSET_VALUE = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @ColorInt
    public Integer bottomStyleLineColor;
    public Drawable bottomStyleLineDrawable;
    public Rect bottomStyleLineOffset;
    @ColorInt
    public Integer cellBottomLineColor;
    public Drawable cellBottomLineDrawable;
    public Rect cellBottomLineOffset;
    @ColorInt
    public Integer cellTopLineColor;
    public Drawable cellTopLineDrawable;
    public Rect cellTopLineOffset;
    @ColorInt
    public Integer middleStyleLineColor;
    public Drawable middleStyleLineDrawable;
    public Rect middleStyleLineOffset;
    public StyleType styleType;
    @ColorInt
    public Integer topStyleLineColor;
    public Drawable topStyleLineDrawable;
    public Rect topStyleLineOffset;

    public DividerStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0647acfac71834ad9047335fe95b539c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0647acfac71834ad9047335fe95b539c");
            return;
        }
        this.styleType = StyleType.AUTO;
        this.topStyleLineColor = null;
        this.middleStyleLineColor = null;
        this.bottomStyleLineColor = null;
    }

    public Rect getTopLineOffset(PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d7d8e184dce452d56140f9cf88362f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d7d8e184dce452d56140f9cf88362f6");
        }
        if (this.cellTopLineOffset != null) {
            return this.cellTopLineOffset;
        }
        if (needTopStyle(positionType)) {
            return this.topStyleLineOffset;
        }
        return null;
    }

    public Drawable getTopLineDrawable(PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49b3f67167ea6f17373e046ad906893b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49b3f67167ea6f17373e046ad906893b");
        }
        if (this.cellTopLineDrawable != null) {
            return this.cellTopLineDrawable;
        }
        if (needTopStyle(positionType)) {
            return this.topStyleLineDrawable;
        }
        return null;
    }

    private boolean needTopStyle(PositionType positionType) {
        return positionType == PositionType.FIRST || positionType == PositionType.SINGLE;
    }

    public Rect getBottomLineOffset(PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190d94f482d792c7a3994e696001ee4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190d94f482d792c7a3994e696001ee4c");
        }
        if (this.cellBottomLineOffset != null) {
            return this.cellBottomLineOffset;
        }
        if (needBottomStyle(positionType)) {
            return this.bottomStyleLineOffset;
        }
        return this.middleStyleLineOffset;
    }

    public Drawable getBottomLineDrawable(PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3975dbbebfd115722ae2c8bd5eb1a27b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3975dbbebfd115722ae2c8bd5eb1a27b");
        }
        if (this.cellBottomLineDrawable != null) {
            return this.cellBottomLineDrawable;
        }
        if (needBottomStyle(positionType)) {
            return this.bottomStyleLineDrawable;
        }
        return this.middleStyleLineDrawable;
    }

    private boolean needBottomStyle(PositionType positionType) {
        return positionType == PositionType.LAST || positionType == PositionType.SINGLE;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum StyleType {
        AUTO,
        TOP,
        MIDDLE,
        BOTTOM,
        SINGLE,
        NONE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        StyleType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74161ab13dc099f073b7058070043058", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74161ab13dc099f073b7058070043058");
            }
        }

        public static StyleType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3dd495e6a89dac3ff2bf8f57d6332089", RobustBitConfig.DEFAULT_VALUE) ? (StyleType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3dd495e6a89dac3ff2bf8f57d6332089") : (StyleType) Enum.valueOf(StyleType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static StyleType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c0fbc8f444805833ee22c3fe12ff084", RobustBitConfig.DEFAULT_VALUE) ? (StyleType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c0fbc8f444805833ee22c3fe12ff084") : (StyleType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ShowType {
        TOP_BOTTOM,
        ALL,
        NONE,
        MIDDLE,
        NO_TOP,
        NO_BOTTOM,
        DEFAULT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ShowType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba3a8c44b5864a95112d711bd5c499b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba3a8c44b5864a95112d711bd5c499b1");
            }
        }

        public static ShowType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb0d9136d0a9521ec781662b7f6879ed", RobustBitConfig.DEFAULT_VALUE) ? (ShowType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb0d9136d0a9521ec781662b7f6879ed") : (ShowType) Enum.valueOf(ShowType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ShowType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4735bb6f9d94aea4725d7089301b3e4a", RobustBitConfig.DEFAULT_VALUE) ? (ShowType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4735bb6f9d94aea4725d7089301b3e4a") : (ShowType[]) values().clone();
        }
    }
}
