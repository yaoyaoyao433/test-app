package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c<T extends View, U extends com.facebook.react.uimanager.b<T> & d<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1354842768:
                if (str.equals(LinearGradientManager.PROP_COLORS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3530753:
                if (str.equals(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                    c = 3;
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
                ((d) this.a).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 1:
                ((d) this.a).setColors(t, (ReadableArray) obj);
                return;
            case 2:
                ((d) this.a).setProgressBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((d) this.a).setSize(t, obj != null ? ((Double) obj).intValue() : 1);
                return;
            case 4:
                ((d) this.a).setProgressViewOffset(t, obj == null ? 0.0f : ((Double) obj).floatValue());
                return;
            case 5:
                ((d) this.a).setRefreshing(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
