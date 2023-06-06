package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderTopColor;
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
import com.meituan.metrics.sampler.fps.FpsEvent;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class bf {
    public static final int[] a = {8, 4, 5, 1, 3, 0, 2};
    public static final int[] b = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final int[] c = {4, 5, 1, 3};
    private static final HashSet<String> d = new HashSet<>(Arrays.asList(AlignSelf.LOWER_CASE_NAME, AlignItems.LOWER_CASE_NAME, "collapsable", "fspIgnore", "flex", FlexBasis.LOWER_CASE_NAME, FlexDirection.LOWER_CASE_NAME, FlexGrow.LOWER_CASE_NAME, FlexShrink.LOWER_CASE_NAME, FlexWrap.LOWER_CASE_NAME, JustifyContent.LOWER_CASE_NAME, AlignContent.LOWER_CASE_NAME, "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", MinWidth.LOWER_CASE_NAME, "maxWidth", MinHeight.LOWER_CASE_NAME, "maxHeight", "margin", MarginVertical.LOWER_CASE_NAME, MarginHorizontal.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, MarginBottom.LOWER_CASE_NAME, MarginStart.LOWER_CASE_NAME, MarginEnd.LOWER_CASE_NAME, "padding", PaddingVertical.LOWER_CASE_NAME, "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", PaddingStart.LOWER_CASE_NAME, PaddingEnd.LOWER_CASE_NAME));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(ReadableMap readableMap, String str) {
        char c2;
        if (d.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = readableMap.getString(str);
            return FpsEvent.TYPE_SCROLL_AUTO.equals(string) || "box-none".equals(string);
        }
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals(BorderRightColor.LOWER_CASE_NAME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1971292586:
                if (str.equals(BorderRightWidth.LOWER_CASE_NAME)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1470826662:
                if (str.equals(BorderTopColor.LOWER_CASE_NAME)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1308858324:
                if (str.equals(BorderBottomColor.LOWER_CASE_NAME)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1290574193:
                if (str.equals(BorderBottomWidth.LOWER_CASE_NAME)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -242276144:
                if (str.equals(BorderLeftColor.LOWER_CASE_NAME)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -223992013:
                if (str.equals(BorderLeftWidth.LOWER_CASE_NAME)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals(BorderRadius.LOWER_CASE_NAME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d;
            case 1:
                if (!readableMap.hasKey("backgroundColor") || readableMap.getInt("backgroundColor") == 0) {
                    return !readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
                }
                return false;
            case 2:
                return !readableMap.isNull(BorderLeftColor.LOWER_CASE_NAME) && readableMap.getInt(BorderLeftColor.LOWER_CASE_NAME) == 0;
            case 3:
                return !readableMap.isNull(BorderRightColor.LOWER_CASE_NAME) && readableMap.getInt(BorderRightColor.LOWER_CASE_NAME) == 0;
            case 4:
                return !readableMap.isNull(BorderTopColor.LOWER_CASE_NAME) && readableMap.getInt(BorderTopColor.LOWER_CASE_NAME) == 0;
            case 5:
                return !readableMap.isNull(BorderBottomColor.LOWER_CASE_NAME) && readableMap.getInt(BorderBottomColor.LOWER_CASE_NAME) == 0;
            case 6:
                return readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case 7:
                return readableMap.isNull(BorderLeftWidth.LOWER_CASE_NAME) || readableMap.getDouble(BorderLeftWidth.LOWER_CASE_NAME) == 0.0d;
            case '\b':
                return readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d;
            case '\t':
                return readableMap.isNull(BorderRightWidth.LOWER_CASE_NAME) || readableMap.getDouble(BorderRightWidth.LOWER_CASE_NAME) == 0.0d;
            case '\n':
                return readableMap.isNull(BorderBottomWidth.LOWER_CASE_NAME) || readableMap.getDouble(BorderBottomWidth.LOWER_CASE_NAME) == 0.0d;
            case 11:
                return readableMap.isNull("overflow") || "visible".equals(readableMap.getString("overflow"));
            default:
                return false;
        }
    }
}
