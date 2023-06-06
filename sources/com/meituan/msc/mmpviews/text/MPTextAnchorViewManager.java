package com.meituan.msc.mmpviews.text;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.meituan.android.recce.props.gens.EllipsizeMode;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager;
import com.meituan.msc.mmpviews.text.MPBaseTextShadowNode;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.text.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MPTextAnchorViewManager<T extends View, C extends MPBaseTextShadowNode> extends MPShellDelegateViewManager<T, C> {
    public static ChangeQuickRedirect a;
    private static final int[] b = {8, 0, 2, 1, 3};
    private String c;
    private String e;

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(MPTextView mPTextView, int i) {
        Object[] objArr = {mPTextView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed6a2e6cdfb78b466891023ade87754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed6a2e6cdfb78b466891023ade87754");
        } else {
            mPTextView.setNumberOfLines(i);
        }
    }

    @ReactProp(name = EllipsizeMode.LOWER_CASE_NAME)
    public void setEllipsizeMode(MPTextView mPTextView, @Nullable String str) {
        Object[] objArr = {mPTextView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c889ae9abc2343c3fb04c342fb4a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c889ae9abc2343c3fb04c342fb4a7c");
        } else if (str == null || str.equals("tail")) {
            mPTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (str.equals(PicassoBounceOnTouchListener.HEAD_BOUNCE)) {
            mPTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (str.equals("middle")) {
            mPTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (str.equals("clip")) {
            mPTextView.setEllipsizeLocation(null);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501150b38fec8fbd3b19857435fef732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501150b38fec8fbd3b19857435fef732");
        } else {
            mPTextView.setAdjustFontSizeToFit(z);
        }
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(MPTextView mPTextView, @Nullable String str) {
        Object[] objArr = {mPTextView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0b08273c3d9510b4431bb50114eb59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0b08273c3d9510b4431bb50114eb59");
        } else if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            mPTextView.setGravityVertical(0);
        } else if ("top".equals(str)) {
            mPTextView.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            mPTextView.setGravityVertical(80);
        } else if ("center".equals(str)) {
            mPTextView.setGravityVertical(16);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
    }

    @ReactProp(name = "selectable")
    public void setSelectable(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75eb8bc04828edc7e62de92d5aeb33da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75eb8bc04828edc7e62de92d5aeb33da");
        } else {
            mPTextView.setTextIsSelectable(z);
        }
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(MPTextView mPTextView, @Nullable Integer num) {
        Object[] objArr = {mPTextView, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c552844ab48d27e2c3ad5621974ea0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c552844ab48d27e2c3ad5621974ea0d6");
        } else if (num == null) {
            mPTextView.setHighlightColor(d.a(mPTextView.getContext()));
        } else {
            mPTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b6f4c654c5b0688b89487787138814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b6f4c654c5b0688b89487787138814");
        } else {
            mPTextView.setIncludeFontPadding(z);
        }
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d233f9db9a663edae0b34226740e15ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d233f9db9a663edae0b34226740e15ae");
        } else {
            mPTextView.setEnabled(!z ? 1 : 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(MPTextView mPTextView, @Nullable String str) {
        char c;
        Object[] objArr = {mPTextView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5f6084f3d0d2c1e5640458aff08d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5f6084f3d0d2c1e5640458aff08d28");
            return;
        }
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
                mPTextView.setLinkifyMask(4);
                return;
            case 1:
                mPTextView.setLinkifyMask(1);
                return;
            case 2:
                mPTextView.setLinkifyMask(2);
                return;
            case 3:
                mPTextView.setLinkifyMask(15);
                return;
            default:
                mPTextView.setLinkifyMask(0);
                return;
        }
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af593eb2add4dc6dc9cceea4c01250cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af593eb2add4dc6dc9cceea4c01250cb");
        } else {
            mPTextView.setNotifyOnInlineViewLayout(z);
        }
    }

    @ReactProp(name = "space")
    public void setSpace(MPTextView mPTextView, Dynamic dynamic) {
        Object[] objArr = {mPTextView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbb61247870b9236998d813234dafee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbb61247870b9236998d813234dafee");
        } else {
            mPTextView.setSpace(dynamic);
        }
    }

    @ReactProp(name = "user-select")
    public void setUserSelect(MPTextView mPTextView, boolean z) {
        Object[] objArr = {mPTextView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891f33ed097d25895dc5d20304927522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891f33ed097d25895dc5d20304927522");
        } else {
            mPTextView.setTextIsSelectable(z);
        }
    }

    @ReactProp(name = "whiteSpace")
    public void setWhiteSpace(MPTextView mPTextView, String str) {
        this.c = str;
    }

    @ReactProp(name = "textOverflow")
    public void setTextOverflow(MPTextView mPTextView, String str) {
        this.e = str;
    }
}
