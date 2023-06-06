package com.meituan.android.mtplayer.video;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    int b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5134c5794f44e03203a2062f14ad026", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5134c5794f44e03203a2062f14ad026");
        } else {
            this.b = 0;
        }
    }

    public final Rect a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34732e3d6347c241a8faee559c442c48", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34732e3d6347c241a8faee559c442c48");
        }
        Rect rect = new Rect(i, i2, i3, i4);
        switch (this.b) {
            case 6:
                if (i >= 0) {
                    if (i2 < 0) {
                        rect.top = 0;
                        rect.bottom = i4 - i2;
                        break;
                    }
                } else {
                    rect.left = 0;
                    rect.right = i3 - i;
                    break;
                }
                break;
            case 7:
                if (i >= 0) {
                    if (i2 < 0) {
                        rect.top = i2 + i2;
                        rect.bottom = i4 + i2;
                        break;
                    }
                } else {
                    rect.left = i + i;
                    rect.right = i3 + i;
                    break;
                }
                break;
        }
        return rect;
    }
}
