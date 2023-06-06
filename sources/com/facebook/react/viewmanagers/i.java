package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.facebook.react.viewmanagers.j;
import com.meituan.android.recce.props.gens.HardwareAccelerated;
import com.meituan.android.recce.props.gens.StatusBarTranslucent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i<T extends View, U extends com.facebook.react.uimanager.b<T> & j<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.bb
    public final void a(T t, String str, @Nullable Object obj) {
        char c;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1156137512:
                if (str.equals(StatusBarTranslucent.LOWER_CASE_NAME)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -795203165:
                if (str.equals(DMKeys.KEY_SHARE_INFO_ANIMATED)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1195991583:
                if (str.equals(HardwareAccelerated.LOWER_CASE_NAME)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2031205598:
                if (str.equals("animationType")) {
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
                ((j) this.a).setAnimationType(t, (String) obj);
                return;
            case 1:
                ((j) this.a).setPresentationStyle(t, (String) obj);
                return;
            case 2:
                ((j) this.a).setTransparent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((j) this.a).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((j) this.a).setHardwareAccelerated(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((j) this.a).setAnimated(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((j) this.a).setSupportedOrientations(t, (ReadableArray) obj);
                return;
            case 7:
                ((j) this.a).setIdentifier(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
