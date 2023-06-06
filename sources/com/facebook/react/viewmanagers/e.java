package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<T extends View, U extends com.facebook.react.uimanager.b<T> & f<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c = 2;
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
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3551:
                if (str.equals("on")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 5;
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
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c = 4;
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
                ((f) this.a).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 1:
                ((f) this.a).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((f) this.a).setThumbColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((f) this.a).setTrackColorForFalse(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((f) this.a).setTrackColorForTrue(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 5:
                ((f) this.a).setValue(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((f) this.a).setOn(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((f) this.a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\b':
                ((f) this.a).setTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
