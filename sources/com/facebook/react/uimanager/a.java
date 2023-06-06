package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T extends View, U extends b<T>> implements bb<T> {
    protected final U a;

    public a(U u) {
        this.a = u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.bb
    public void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1228066334:
                if (str.equals(BorderTopLeftRadius.LOWER_CASE_NAME)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals(RecceAnimUtils.SCALE_X)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals(RecceAnimUtils.SCALE_Y)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(RecceAnimUtils.ROTATION)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 333432965:
                if (str.equals(BorderTopRightRadius.LOWER_CASE_NAME)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 581268560:
                if (str.equals(BorderBottomLeftRadius.LOWER_CASE_NAME)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 588239831:
                if (str.equals(BorderBottomRightRadius.LOWER_CASE_NAME)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1349188574:
                if (str.equals(BorderRadius.LOWER_CASE_NAME)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    c = 14;
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
                this.a.setAccessibilityActions(t, (ReadableArray) obj);
                return;
            case 1:
                this.a.setAccessibilityHint(t, (String) obj);
                return;
            case 2:
                this.a.setAccessibilityLabel(t, (String) obj);
                return;
            case 3:
                this.a.setAccessibilityLiveRegion(t, (String) obj);
                return;
            case 4:
                this.a.setAccessibilityRole(t, (String) obj);
                return;
            case 5:
                this.a.setViewState(t, (ReadableMap) obj);
                return;
            case 6:
                this.a.setBackgroundColor(t, obj != null ? ColorPropConverter.getColor(obj, t.getContext()).intValue() : 0);
                return;
            case 7:
                this.a.setBorderRadius(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\b':
                this.a.setBorderBottomLeftRadius(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\t':
                this.a.setBorderBottomRightRadius(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\n':
                this.a.setBorderTopLeftRadius(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 11:
                this.a.setBorderTopRightRadius(t, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case '\f':
                this.a.setElevation(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case '\r':
                this.a.setImportantForAccessibility(t, (String) obj);
                return;
            case 14:
                this.a.setNativeId(t, (String) obj);
                return;
            case 15:
                this.a.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 16:
                this.a.setRenderToHardwareTexture(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 17:
                this.a.setRotation(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 18:
                this.a.setScaleX(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 19:
                this.a.setScaleY(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 20:
                this.a.setTestId(t, (String) obj);
                return;
            case 21:
                this.a.setTransform(t, (ReadableArray) obj);
                return;
            case 22:
                this.a.setTranslateX(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 23:
                this.a.setTranslateY(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 24:
                this.a.setZIndex(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            default:
                return;
        }
    }
}
