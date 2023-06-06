package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.h;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g<T extends View, U extends com.facebook.react.uimanager.b<T> & h<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1233251315:
                if (str.equals("initialPage")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1919780198:
                if (str.equals("peekEnabled")) {
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
                ((h) this.a).setInitialPage(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 1:
                ((h) this.a).setPageMargin(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 2:
                ((h) this.a).setPeekEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((h) this.a).setKeyboardDismissMode(t, (String) obj);
                return;
            case 4:
                ((h) this.a).setScrollEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
