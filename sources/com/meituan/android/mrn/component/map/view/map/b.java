package com.meituan.android.mrn.component.map.view.map;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapView;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* loaded from: classes2.dex */
public final class b extends MapView implements a {
    public static ChangeQuickRedirect a;
    private int d;
    private c<b> e;
    private long f;
    private boolean g;
    private a.C0279a h;

    public b(@NonNull ao aoVar, int i, com.meituan.android.mrn.component.map.b bVar, long j, String str, String str2, d dVar, String str3) {
        super(aoVar, i, Platform.MRN, com.meituan.android.mrn.component.map.utils.f.a(str, bVar), str2);
        Object[] objArr = {aoVar, Integer.valueOf(i), bVar, new Long(j), str, str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cc65918f3901597f245df57635daa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cc65918f3901597f245df57635daa0");
            return;
        }
        this.g = false;
        this.d = i;
        this.f = j;
        this.h = com.meituan.android.mrn.component.map.utils.a.a(aoVar);
        this.e = new c<>(str3, this, aoVar, bVar, this.h, j, false, dVar);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView, com.meituan.android.mrn.component.map.view.map.a
    public final int getMapType() {
        return this.d;
    }

    @Override // com.meituan.android.mrn.component.map.view.map.a
    public final c getMapViewDelegate() {
        return this.e;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798d2f88b4bc4bf7257f8e3cf6cb8e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798d2f88b4bc4bf7257f8e3cf6cb8e8d");
            return;
        }
        super.requestLayout();
        post(new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc1940dc5722dbb9164651df9e2bf4a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc1940dc5722dbb9164651df9e2bf4a9");
                    return;
                }
                b.this.measure(View.MeasureSpec.makeMeasureSpec(b.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(b.this.getHeight(), 1073741824));
                b.this.layout(b.this.getLeft(), b.this.getTop(), b.this.getRight(), b.this.getBottom());
            }
        });
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef26e676cf257f08f68c8ba6cfe069ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef26e676cf257f08f68c8ba6cfe069ae");
            return;
        }
        if (!this.g) {
            com.meituan.android.mrn.component.map.utils.e.a(this.d, this.h, SystemClock.elapsedRealtime() - this.f, false, this.e.y);
            this.g = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
