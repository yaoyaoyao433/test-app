package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<T extends View, U extends com.facebook.react.uimanager.b<T> & b<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c = 0;
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
                ((b) this.a).setStyleAttr(t, obj != null ? (String) obj : null);
                return;
            case 1:
                ((b) this.a).setTypeAttr(t, obj != null ? (String) obj : null);
                return;
            case 2:
                ((b) this.a).setIndeterminate(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((b) this.a).setProgress(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 4:
                ((b) this.a).setAnimating(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 5:
                ((b) this.a).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 6:
                ((b) this.a).setTestID(t, obj == null ? "" : (String) obj);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
