package com.meituan.android.mrn.component.map.view.map;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* loaded from: classes2.dex */
public class e extends TextureMapView implements a {
    public static ChangeQuickRedirect a;
    private int d;
    private c<e> e;
    private long f;
    private boolean g;
    private a.C0279a h;

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView, com.meituan.android.mrn.component.map.view.map.a
    public int getMapType() {
        return this.d;
    }

    @Override // com.meituan.android.mrn.component.map.view.map.a
    public c getMapViewDelegate() {
        return this.e;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cbab5305b568d0c631122d601d6696b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cbab5305b568d0c631122d601d6696b");
            return;
        }
        super.requestLayout();
        post(new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f0fe3c4dea2c1fa1098d24cb303417d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f0fe3c4dea2c1fa1098d24cb303417d");
                    return;
                }
                e.this.measure(View.MeasureSpec.makeMeasureSpec(e.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e.this.getHeight(), 1073741824));
                e.this.layout(e.this.getLeft(), e.this.getTop(), e.this.getRight(), e.this.getBottom());
            }
        });
    }

    public e(@NonNull ao aoVar, int i, com.meituan.android.mrn.component.map.b bVar, long j, String str, String str2, d dVar, String str3) {
        super(aoVar, i, Platform.MRN, com.meituan.android.mrn.component.map.utils.f.a(str, bVar), "m4b076b17e2a43dea706bac529619a0m".equals(str) ? "overseahotel" : str2);
        Object[] objArr = {aoVar, Integer.valueOf(i), bVar, new Long(j), str, str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6649eb7c84006b632c85046b56991bac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6649eb7c84006b632c85046b56991bac");
            return;
        }
        this.g = false;
        this.d = i;
        this.f = j;
        this.h = com.meituan.android.mrn.component.map.utils.a.a(aoVar);
        if ("m4b076b17e2a43dea706bac529619a0m".equals(str) && !dVar.c) {
            com.meituan.android.mrn.component.map.utils.e.a(aoVar.getCurrentActivity(), i, str, str2);
            com.meituan.android.mrn.component.map.utils.e.a(e.class, "isUseOverseasMap", 19000, "old bundle");
            dVar.c = true;
        }
        this.e = new c<>(str3, this, aoVar, bVar, this.h, j, true, dVar);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86de0382765226b89fafc7f1df08041f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86de0382765226b89fafc7f1df08041f");
            return;
        }
        if (!this.g) {
            com.meituan.android.mrn.component.map.utils.e.a(this.d, this.h, SystemClock.elapsedRealtime() - this.f, true, this.e.y);
            this.g = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
