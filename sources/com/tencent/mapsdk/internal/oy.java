package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class oy extends AccessibleTouchItem {
    private ao a;
    private so b;

    public oy(so soVar, ao aoVar) {
        this.b = soVar;
        this.a = aoVar;
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final Rect getBounds() {
        Rect i;
        if (this.a == null || (i = this.a.i()) == null) {
            return null;
        }
        int i2 = i.left;
        int i3 = i.right;
        int i4 = i.top;
        int i5 = i.bottom;
        int i6 = (i.right + i.left) / 2;
        int i7 = (i.top + i.bottom) / 2;
        int i8 = i.right - i.left;
        int i9 = i.bottom - i.top;
        if (i8 < gy.n() * 40.0f) {
            float f = i6;
            i2 = (int) (f - (gy.n() * 20.0f));
            i3 = (int) (f + (gy.n() * 20.0f));
        }
        if (i9 < gy.n() * 40.0f) {
            float f2 = i7;
            i4 = (int) (f2 - (gy.n() * 20.0f));
            i5 = (int) (f2 + (gy.n() * 20.0f));
        }
        return new Rect(i2, i4, i3, i5);
    }

    private static Rect a(Rect rect) {
        if (rect == null) {
            return null;
        }
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        int i5 = (rect.right + rect.left) / 2;
        int i6 = (rect.top + rect.bottom) / 2;
        int i7 = rect.right - rect.left;
        int i8 = rect.bottom - rect.top;
        if (i7 < gy.n() * 40.0f) {
            float f = i5;
            i = (int) (f - (gy.n() * 20.0f));
            i2 = (int) (f + (gy.n() * 20.0f));
        }
        if (i8 < gy.n() * 40.0f) {
            float f2 = i6;
            i3 = (int) (f2 - (gy.n() * 20.0f));
            i4 = (int) (f2 + (gy.n() * 20.0f));
        }
        return new Rect(i, i3, i2, i4);
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final String getContentDescription() {
        if (this.a == null) {
            return null;
        }
        return this.a.getContentDescription();
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final void onClick() {
        if (this.b != null) {
            TencentMap.OnMarkerClickListener onMarkerClickListener = this.b.y;
            if (this.a == null || onMarkerClickListener == null) {
                return;
            }
            onMarkerClickListener.onMarkerClick(this.a);
        }
    }
}
