package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ng extends mp<nh> implements ms, IntersectionOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ng(nf nfVar, nh nhVar) {
        super(nfVar, nhVar);
    }

    @Override // com.tencent.mapsdk.internal.ms
    public final int e_() {
        return ((nf) this.c).a(this.b);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setBounds(Rect rect) {
        ((nh) this.d).setBounds(rect);
        a((ng) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ((nh) this.d).setData(bArr);
        a((ng) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setVisibility(boolean z) {
        ((nh) this.d).setVisibility(z);
        a((ng) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setDistance(int i) {
        ((nh) this.d).setDistance(i);
        a((ng) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setDarkMode(boolean z) {
        ((nh) this.d).enableDarkMode(z);
        a((ng) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setRoundedCorner(boolean z) {
        ((nh) this.d).enableRoundedCorner(z);
        a((ng) this.d);
    }
}
