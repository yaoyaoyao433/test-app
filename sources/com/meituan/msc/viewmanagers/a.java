package com.meituan.msc.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.recce.props.gens.HardwareAccelerated;
import com.meituan.android.recce.props.gens.StatusBarTranslucent;
import com.meituan.msc.uimanager.b;
import com.meituan.msc.viewmanagers.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a<T extends View, U extends com.meituan.msc.uimanager.b<T> & b<T>> extends com.meituan.msc.uimanager.a<T, U> {
    public static ChangeQuickRedirect c;

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a(com.meituan.msc.uimanager.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6460429b1bbbe3f5c117a29281b95e53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6460429b1bbbe3f5c117a29281b95e53");
        }
    }

    @Override // com.meituan.msc.uimanager.a, com.meituan.msc.uimanager.at
    public final void a(T t, String str, @Nullable Object obj) {
        Object[] objArr = {t, str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae667a99560fcb16416321b1998b8e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae667a99560fcb16416321b1998b8e96");
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals(StatusBarTranslucent.LOWER_CASE_NAME)) {
                    c2 = 3;
                    break;
                }
                break;
            case -795203165:
                if (str.equals(DMKeys.KEY_SHARE_INFO_ANIMATED)) {
                    c2 = 5;
                    break;
                }
                break;
            case 1195991583:
                if (str.equals(HardwareAccelerated.LOWER_CASE_NAME)) {
                    c2 = 4;
                    break;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                ((b) this.b).setAnimationType(t, (String) obj);
                return;
            case 1:
                return;
            case 2:
                ((b) this.b).setTransparent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((b) this.b).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((b) this.b).setHardwareAccelerated(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                if (obj != null) {
                    ((Boolean) obj).booleanValue();
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                if (obj != null) {
                    ((Double) obj).intValue();
                    return;
                }
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
