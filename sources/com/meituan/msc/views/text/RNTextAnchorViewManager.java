package com.meituan.msc.views.text;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.dianping.picasso.PicassoBounceOnTouchListener;
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
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.uimanager.RNBaseViewManager;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.text.RNBaseTextShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RNTextAnchorViewManager<T extends View, C extends RNBaseTextShadowNode> extends RNBaseViewManager<T, C> {
    public static ChangeQuickRedirect b;
    private static final int[] c = {8, 0, 2, 1, 3};

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(ReactTextView reactTextView, int i) {
        Object[] objArr = {reactTextView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ffe8a9746b29e11f3e2488ffd9a5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ffe8a9746b29e11f3e2488ffd9a5b0");
        } else {
            reactTextView.setNumberOfLines(i);
        }
    }

    @ReactProp(name = EllipsizeMode.LOWER_CASE_NAME)
    public void setEllipsizeMode(ReactTextView reactTextView, @Nullable String str) {
        Object[] objArr = {reactTextView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5515aef1c7e193cc47ff3a416c9f3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5515aef1c7e193cc47ff3a416c9f3b2");
        } else if (str == null || str.equals("tail")) {
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
        Object[] objArr = {reactTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8756e15b188d2ebd92b460f4542ca45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8756e15b188d2ebd92b460f4542ca45f");
        } else {
            reactTextView.setAdjustFontSizeToFit(z);
        }
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(ReactTextView reactTextView, @Nullable String str) {
        Object[] objArr = {reactTextView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd0a41d1627271eeb878c7cc1831667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd0a41d1627271eeb878c7cc1831667");
        } else if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
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
        Object[] objArr = {reactTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688230f33a0010cc2a3c94b2ffc78ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688230f33a0010cc2a3c94b2ffc78ca9");
        } else {
            reactTextView.setTextIsSelectable(z);
        }
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, @Nullable Integer num) {
        Object[] objArr = {reactTextView, num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d813e52f6ac46abd3da801462f8dc347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d813e52f6ac46abd3da801462f8dc347");
        } else if (num == null) {
            reactTextView.setHighlightColor(d.a(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(ReactTextView reactTextView, int i, float f) {
        Object[] objArr = {reactTextView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dc5be2921dd03aa5db50b4687a7629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dc5be2921dd03aa5db50b4687a7629");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        if (i == 0) {
            reactTextView.setBorderRadius(a);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(a), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = ReactTextView.a;
        if (PatchProxy.isSupport(objArr2, reactTextView, changeQuickRedirect2, false, "452e9d975b87acea6f1e18f1425ab1fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactTextView, changeQuickRedirect2, false, "452e9d975b87acea6f1e18f1425ab1fa");
        } else {
            reactTextView.e.a(a, i2);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(ReactTextView reactTextView, @Nullable String str) {
        Object[] objArr = {reactTextView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31732b9890e4fd9dbc43444dc520af26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31732b9890e4fd9dbc43444dc520af26");
        } else {
            reactTextView.setBorderStyle(str);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(ReactTextView reactTextView, int i, float f) {
        Object[] objArr = {reactTextView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd9b42dfdc5d62638f10b0297a4d55e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd9b42dfdc5d62638f10b0297a4d55e6");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        int i2 = c[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = ReactTextView.a;
        if (PatchProxy.isSupport(objArr2, reactTextView, changeQuickRedirect2, false, "dddee1a59720765c09eac3fb5fd2dc8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactTextView, changeQuickRedirect2, false, "dddee1a59720765c09eac3fb5fd2dc8d");
        } else {
            reactTextView.e.a(i2, a);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(ReactTextView reactTextView, int i, Integer num) {
        Object[] objArr = {reactTextView, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db8e89b45159c6dae57d06fd4bd575a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db8e89b45159c6dae57d06fd4bd575a");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = c[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect2 = ReactTextView.a;
        if (PatchProxy.isSupport(objArr2, reactTextView, changeQuickRedirect2, false, "52dddca26557b5ca25a61c413a2c1e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactTextView, changeQuickRedirect2, false, "52dddca26557b5ca25a61c413a2c1e01");
        } else {
            reactTextView.e.a(i2, intValue, intValue2);
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z) {
        Object[] objArr = {reactTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8053090f61f035af24783b2e9d89831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8053090f61f035af24783b2e9d89831");
        } else {
            reactTextView.setIncludeFontPadding(z);
        }
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z) {
        Object[] objArr = {reactTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ce2c986d85cf793d8cce041b9977fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ce2c986d85cf793d8cce041b9977fc");
        } else {
            reactTextView.setEnabled(!z ? 1 : 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(ReactTextView reactTextView, @Nullable String str) {
        char c2;
        Object[] objArr = {reactTextView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8d36f46988f1ca7d55f96fd8144fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8d36f46988f1ca7d55f96fd8144fae");
            return;
        }
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 96673:
                if (str.equals("all")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3321850:
                if (str.equals(RegionLinkDao.TABLENAME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3387192:
                if (str.equals("none")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c2 = 2;
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
        Object[] objArr = {reactTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aaca014b7639470356972b87dbcf59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aaca014b7639470356972b87dbcf59c");
        } else {
            reactTextView.setNotifyOnInlineViewLayout(z);
        }
    }
}
