package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderEndWidth;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStartWidth;
import com.meituan.android.recce.props.gens.FlexBasis;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.FlexWrap;
import com.meituan.android.recce.props.gens.JustifyContent;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginEnd;
import com.meituan.android.recce.props.gens.MarginHorizontal;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginStart;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MarginVertical;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.android.recce.props.gens.PaddingEnd;
import com.meituan.android.recce.props.gens.PaddingStart;
import com.meituan.android.recce.props.gens.PaddingVertical;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.fps.FpsEvent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final a mTempYogaValue = new a();

    @ReactProp(name = "fspIgnore")
    public void setFspIgnore(boolean z) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        float a;
        YogaUnit b;

        private a() {
        }

        final void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.b = YogaUnit.UNDEFINED;
                this.a = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
                    this.b = YogaUnit.AUTO;
                    this.a = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.b = YogaUnit.PERCENT;
                    this.a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else if (asString.endsWith("rpt")) {
                    this.b = YogaUnit.POINT;
                    this.a = w.a(w.a(asString));
                } else if (asString.matches("[-+]?[0-9]*\\.?[0-9]+")) {
                    try {
                        double parseDouble = Double.parseDouble(asString);
                        this.b = YogaUnit.POINT;
                        this.a = w.a((float) parseDouble);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Unknown value: " + asString);
                    }
                } else {
                    throw new IllegalArgumentException("Unknown value: " + asString);
                }
            } else {
                this.b = YogaUnit.POINT;
                this.a = w.a((float) dynamic.asDouble());
            }
        }
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        switch (this.mTempYogaValue.b) {
            case POINT:
            case UNDEFINED:
                setStyleWidth(this.mTempYogaValue.a);
                break;
            case AUTO:
                setStyleWidthAuto();
                break;
            case PERCENT:
                setStyleWidthPercent(this.mTempYogaValue.a);
                break;
        }
        dynamic.recycle();
    }

    @ReactProp(name = MinWidth.LOWER_CASE_NAME)
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    setStyleMinWidth(this.mTempYogaValue.a);
                    break;
            }
        } else {
            setStyleMinWidthPercent(this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(boolean z) {
        this.mCollapsable = z;
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    setStyleMaxWidth(this.mTempYogaValue.a);
                    break;
            }
        } else {
            setStyleMaxWidthPercent(this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        switch (this.mTempYogaValue.b) {
            case POINT:
            case UNDEFINED:
                setStyleHeight(this.mTempYogaValue.a);
                break;
            case AUTO:
                setStyleHeightAuto();
                break;
            case PERCENT:
                setStyleHeightPercent(this.mTempYogaValue.a);
                break;
        }
        dynamic.recycle();
    }

    @ReactProp(name = MinHeight.LOWER_CASE_NAME)
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    setStyleMinHeight(this.mTempYogaValue.a);
                    break;
            }
        } else {
            setStyleMinHeightPercent(this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    setStyleMaxHeight(this.mTempYogaValue.a);
                    break;
            }
        } else {
            setStyleMaxHeightPercent(this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = FlexGrow.LOWER_CASE_NAME)
    public void setFlexGrow(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = FlexShrink.LOWER_CASE_NAME)
    public void setFlexShrink(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f);
    }

    @ReactProp(name = FlexBasis.LOWER_CASE_NAME)
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        switch (this.mTempYogaValue.b) {
            case POINT:
            case UNDEFINED:
                setFlexBasis(this.mTempYogaValue.a);
                break;
            case AUTO:
                setFlexBasisAuto();
                break;
            case PERCENT:
                setFlexBasisPercent(this.mTempYogaValue.a);
                break;
        }
        dynamic.recycle();
    }

    @ReactProp(defaultFloat = Float.NaN, name = AspectRatio.LOWER_CASE_NAME)
    public void setAspectRatio(float f) {
        setStyleAspectRatio(f);
    }

    @ReactProp(name = FlexDirection.LOWER_CASE_NAME)
    public void setFlexDirection(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexDirection(YogaFlexDirection.COLUMN);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1448970769) {
            if (hashCode != -1354837162) {
                if (hashCode != 113114) {
                    if (hashCode == 1272730475 && str.equals("column-reverse")) {
                        c = 1;
                    }
                } else if (str.equals("row")) {
                    c = 2;
                }
            } else if (str.equals("column")) {
                c = 0;
            }
        } else if (str.equals("row-reverse")) {
            c = 3;
        }
        switch (c) {
            case 0:
                setFlexDirection(YogaFlexDirection.COLUMN);
                return;
            case 1:
                setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                return;
            case 2:
                setFlexDirection(YogaFlexDirection.ROW);
                return;
            case 3:
                setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
        }
    }

    @ReactProp(name = FlexWrap.LOWER_CASE_NAME)
    public void setFlexWrap(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexWrap(YogaWrap.NO_WRAP);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1039592053) {
            if (hashCode != -749527969) {
                if (hashCode == 3657802 && str.equals("wrap")) {
                    c = 1;
                }
            } else if (str.equals("wrap-reverse")) {
                c = 2;
            }
        } else if (str.equals("nowrap")) {
            c = 0;
        }
        switch (c) {
            case 0:
                setFlexWrap(YogaWrap.NO_WRAP);
                return;
            case 1:
                setFlexWrap(YogaWrap.WRAP);
                return;
            case 2:
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
        }
    }

    @ReactProp(name = AlignSelf.LOWER_CASE_NAME)
    public void setAlignSelf(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignSelf(YogaAlign.AUTO);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals(DynamicTitleParser.PARSER_KEY_STRETCH)) {
                    c = 4;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 5;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
                    c = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 6;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignSelf(YogaAlign.AUTO);
                return;
            case 1:
                setAlignSelf(YogaAlign.FLEX_START);
                return;
            case 2:
                setAlignSelf(YogaAlign.CENTER);
                return;
            case 3:
                setAlignSelf(YogaAlign.FLEX_END);
                return;
            case 4:
                setAlignSelf(YogaAlign.STRETCH);
                return;
            case 5:
                setAlignSelf(YogaAlign.BASELINE);
                return;
            case 6:
                setAlignSelf(YogaAlign.SPACE_BETWEEN);
                return;
            case 7:
                setAlignSelf(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
        }
    }

    @ReactProp(name = AlignItems.LOWER_CASE_NAME)
    public void setAlignItems(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignItems(YogaAlign.STRETCH);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals(DynamicTitleParser.PARSER_KEY_STRETCH)) {
                    c = 4;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 5;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
                    c = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 6;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignItems(YogaAlign.AUTO);
                return;
            case 1:
                setAlignItems(YogaAlign.FLEX_START);
                return;
            case 2:
                setAlignItems(YogaAlign.CENTER);
                return;
            case 3:
                setAlignItems(YogaAlign.FLEX_END);
                return;
            case 4:
                setAlignItems(YogaAlign.STRETCH);
                return;
            case 5:
                setAlignItems(YogaAlign.BASELINE);
                return;
            case 6:
                setAlignItems(YogaAlign.SPACE_BETWEEN);
                return;
            case 7:
                setAlignItems(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
        }
    }

    @ReactProp(name = AlignContent.LOWER_CASE_NAME)
    public void setAlignContent(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignContent(YogaAlign.FLEX_START);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals(DynamicTitleParser.PARSER_KEY_STRETCH)) {
                    c = 4;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 5;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
                    c = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 6;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignContent(YogaAlign.AUTO);
                return;
            case 1:
                setAlignContent(YogaAlign.FLEX_START);
                return;
            case 2:
                setAlignContent(YogaAlign.CENTER);
                return;
            case 3:
                setAlignContent(YogaAlign.FLEX_END);
                return;
            case 4:
                setAlignContent(YogaAlign.STRETCH);
                return;
            case 5:
                setAlignContent(YogaAlign.BASELINE);
                return;
            case 6:
                setAlignContent(YogaAlign.SPACE_BETWEEN);
                return;
            case 7:
                setAlignContent(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
        }
    }

    @ReactProp(name = JustifyContent.LOWER_CASE_NAME)
    public void setJustifyContent(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setJustifyContent(YogaJustify.FLEX_START);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 3;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 2;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setJustifyContent(YogaJustify.FLEX_START);
                return;
            case 1:
                setJustifyContent(YogaJustify.CENTER);
                return;
            case 2:
                setJustifyContent(YogaJustify.FLEX_END);
                return;
            case 3:
                setJustifyContent(YogaJustify.SPACE_BETWEEN);
                return;
            case 4:
                setJustifyContent(YogaJustify.SPACE_AROUND);
                return;
            case 5:
                setJustifyContent(YogaJustify.SPACE_EVENLY);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setOverflow(YogaOverflow.VISIBLE);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    c = 0;
                }
            } else if (str.equals(Constants.FPS_TYPE_SCROLL)) {
                c = 2;
            }
        } else if (str.equals("hidden")) {
            c = 1;
        }
        switch (c) {
            case 0:
                setOverflow(YogaOverflow.VISIBLE);
                return;
            case 1:
                setOverflow(YogaOverflow.HIDDEN);
                return;
            case 2:
                setOverflow(YogaOverflow.SCROLL);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
        }
    }

    @ReactProp(name = "display")
    public void setDisplay(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(YogaDisplay.FLEX);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3145721) {
            if (hashCode == 3387192 && str.equals("none")) {
                c = 1;
            }
        } else if (str.equals("flex")) {
            c = 0;
        }
        switch (c) {
            case 0:
                setDisplay(YogaDisplay.FLEX);
                return;
            case 1:
                setDisplay(YogaDisplay.NONE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
        }
    }

    @ReactPropGroup(names = {"margin", MarginVertical.LOWER_CASE_NAME, MarginHorizontal.LOWER_CASE_NAME, MarginStart.LOWER_CASE_NAME, MarginEnd.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME})
    public void setMargins(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(bf.b[i]);
        this.mTempYogaValue.a(dynamic);
        switch (this.mTempYogaValue.b) {
            case POINT:
            case UNDEFINED:
                setMargin(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
                break;
            case AUTO:
                setMarginAuto(maybeTransformLeftRightToStartEnd);
                break;
            case PERCENT:
                setMarginPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
                break;
        }
        dynamic.recycle();
    }

    @ReactPropGroup(names = {"padding", PaddingVertical.LOWER_CASE_NAME, "paddingHorizontal", PaddingStart.LOWER_CASE_NAME, PaddingEnd.LOWER_CASE_NAME, "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(bf.b[i]);
        this.mTempYogaValue.a(dynamic);
        int i2 = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i2 != 4) {
            switch (i2) {
                case 1:
                case 2:
                    setPadding(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
                    break;
            }
        } else {
            setPaddingPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME})
    public void setBorderWidths(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(bf.a[i]), w.a(dynamic));
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i]);
        this.mTempYogaValue.a(dynamic);
        int i2 = AnonymousClass1.a[this.mTempYogaValue.b.ordinal()];
        if (i2 != 4) {
            switch (i2) {
                case 1:
                case 2:
                    setPosition(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
                    break;
            }
        } else {
            setPositionPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
        }
        dynamic.recycle();
    }

    private int maybeTransformLeftRightToStartEnd(int i) {
        com.facebook.react.modules.i18nmanager.a.a();
        if (com.facebook.react.modules.i18nmanager.a.a(getThemedContext(), "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
            if (i != 0) {
                if (i != 2) {
                    return i;
                }
                return 5;
            }
            return 4;
        }
        return i;
    }

    @ReactProp(name = "position")
    public void setPosition(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(YogaPositionType.RELATIVE);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -554435892) {
            if (hashCode == 1728122231 && str.equals("absolute")) {
                c = 1;
            }
        } else if (str.equals("relative")) {
            c = 0;
        }
        switch (c) {
            case 0:
                setPositionType(YogaPositionType.RELATIVE);
                return;
            case 1:
                setPositionType(YogaPositionType.ABSOLUTE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }
}
