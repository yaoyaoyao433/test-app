package com.facebook.react.views.text;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.EllipsizeMode;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends ReactBaseTextShadowNode> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(ReactTextView reactTextView, int i) {
        reactTextView.setNumberOfLines(i);
    }

    @ReactProp(name = EllipsizeMode.LOWER_CASE_NAME)
    public void setEllipsizeMode(ReactTextView reactTextView, @Nullable String str) {
        if (str == null || str.equals("tail")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (str.equals(PicassoBounceOnTouchListener.HEAD_BOUNCE)) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (str.equals("middle")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (str.equals("clip")) {
            reactTextView.setEllipsizeLocation(null);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(ReactTextView reactTextView, boolean z) {
        reactTextView.setAdjustFontSizeToFit(z);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(ReactTextView reactTextView, @Nullable String str) {
        if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            reactTextView.setGravityVertical(0);
        } else if ("top".equals(str)) {
            reactTextView.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            reactTextView.setGravityVertical(80);
        } else if ("center".equals(str)) {
            reactTextView.setGravityVertical(16);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
    }

    @ReactProp(name = "selectable")
    public void setSelectable(ReactTextView reactTextView, boolean z) {
        reactTextView.setTextIsSelectable(z);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, @Nullable Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(d.b(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(ReactTextView reactTextView, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        if (i == 0) {
            reactTextView.setBorderRadius(f);
        } else {
            reactTextView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(ReactTextView reactTextView, @Nullable String str) {
        reactTextView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(ReactTextView reactTextView, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        reactTextView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(ReactTextView reactTextView, int i, Integer num) {
        reactTextView.setBorderColor(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z) {
        reactTextView.setIncludeFontPadding(z);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z) {
        reactTextView.setEnabled(!z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(ReactTextView reactTextView, @Nullable String str) {
        char c;
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96673:
                if (str.equals("all")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3321850:
                if (str.equals(RegionLinkDao.TABLENAME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                reactTextView.setLinkifyMask(4);
                return;
            case 1:
                reactTextView.setLinkifyMask(1);
                return;
            case 2:
                reactTextView.setLinkifyMask(2);
                return;
            case 3:
                reactTextView.setLinkifyMask(15);
                return;
            default:
                reactTextView.setLinkifyMask(0);
                return;
        }
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(ReactTextView reactTextView, boolean z) {
        reactTextView.setNotifyOnInlineViewLayout(z);
    }
}
