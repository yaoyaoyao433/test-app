package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.msc.jse.bridge.ColorPropConverter;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.uimanager.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<T extends View, U extends b<T>> implements at<T> {
    public static ChangeQuickRedirect a;
    protected final U b;

    public a(U u) {
        Object[] objArr = {u};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528d35d8592f4ae3890bdcc68ff88372", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528d35d8592f4ae3890bdcc68ff88372");
        } else {
            this.b = u;
        }
    }

    @Override // com.meituan.msc.uimanager.at
    public void a(T t, String str, @Nullable Object obj) {
        Object[] objArr = {t, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2663af3824a69c3df51e07dd180b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2663af3824a69c3df51e07dd180b33");
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 22;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 23;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 15;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals(BorderTopLeftRadius.LOWER_CASE_NAME)) {
                    c = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals(RecceAnimUtils.SCALE_X)) {
                    c = 18;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(RecceAnimUtils.SCALE_Y)) {
                    c = 19;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = 20;
                    break;
                }
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c = 24;
                    break;
                }
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    c = 1;
                    break;
                }
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    c = 4;
                    break;
                }
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    c = 16;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(RecceAnimUtils.ROTATION)) {
                    c = 17;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    c = 3;
                    break;
                }
                break;
            case 333432965:
                if (str.equals(BorderTopRightRadius.LOWER_CASE_NAME)) {
                    c = 11;
                    break;
                }
                break;
            case 581268560:
                if (str.equals(BorderBottomLeftRadius.LOWER_CASE_NAME)) {
                    c = '\b';
                    break;
                }
                break;
            case 588239831:
                if (str.equals(BorderBottomRightRadius.LOWER_CASE_NAME)) {
                    c = '\t';
                    break;
                }
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    c = '\r';
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c = 21;
                    break;
                }
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    c = 2;
                    break;
                }
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    c = 5;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = 6;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals(BorderRadius.LOWER_CASE_NAME)) {
                    c = 7;
                    break;
                }
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    c = 0;
                    break;
                }
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.b.setAccessibilityActions(t, (ReadableArray) obj);
                return;
            case 1:
                this.b.setAccessibilityHint(t, (String) obj);
                return;
            case 2:
                this.b.setAccessibilityLabel(t, (String) obj);
                return;
            case 3:
                this.b.setAccessibilityLiveRegion(t, (String) obj);
                return;
            case 4:
                this.b.setAccessibilityRole(t, (String) obj);
                return;
            case 5:
                this.b.setViewState(t, (ReadableMap) obj);
                return;
            case 6:
                this.b.setBackgroundColor(t, obj != null ? ColorPropConverter.getColor(obj, t.getContext()).intValue() : 0);
                return;
            case 7:
                this.b.a(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\b':
                this.b.b(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\t':
                this.b.c(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\n':
                this.b.d(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 11:
                this.b.e(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\f':
                this.b.setElevation(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case '\r':
                this.b.setImportantForAccessibility(t, (String) obj);
                return;
            case 14:
                this.b.setNativeId(t, (String) obj);
                return;
            case 15:
                this.b.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 16:
                this.b.setRenderToHardwareTexture(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 17:
                this.b.setRotation(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 18:
                this.b.setScaleX(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 19:
                this.b.setScaleY(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 20:
                this.b.setTestId(t, (String) obj);
                return;
            case 21:
                this.b.setTransform(t, (ReadableArray) obj);
                return;
            case 22:
                this.b.setTranslateX(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 23:
                this.b.setTranslateY(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 24:
                this.b.setZIndex(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            default:
                return;
        }
    }
}
