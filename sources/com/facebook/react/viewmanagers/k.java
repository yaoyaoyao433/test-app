package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.l;
import com.meituan.metrics.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k<T extends View, U extends com.facebook.react.uimanager.b<T> & l<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3540684:
                if (str.equals(Constants.SPEED_METER_STEP)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = 11;
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
                ((l) this.a).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 1:
                ((l) this.a).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((l) this.a).setMaximumTrackImage(t, (ReadableMap) obj);
                return;
            case 3:
                ((l) this.a).setMaximumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((l) this.a).setMaximumValue(t, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case 5:
                ((l) this.a).setMinimumTrackImage(t, (ReadableMap) obj);
                return;
            case 6:
                ((l) this.a).setMinimumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 7:
                ((l) this.a).setMinimumValue(t, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\b':
                ((l) this.a).setStep(t, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\t':
                ((l) this.a).setTestID(t, obj == null ? "" : (String) obj);
                return;
            case '\n':
                ((l) this.a).setThumbImage(t, (ReadableMap) obj);
                return;
            case 11:
                ((l) this.a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\f':
                ((l) this.a).setTrackImage(t, (ReadableMap) obj);
                return;
            case '\r':
                ((l) this.a).setValue(t, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
