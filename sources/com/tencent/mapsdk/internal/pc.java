package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pc implements ez, AoiLayer.OnAoiLayerLoadListener {
    public final mn b;
    public TencentMap.OnMapPoiClickListener c;
    public final List<pa> a = new CopyOnWriteArrayList();
    public final Map<String, AoiLayer.OnAoiLayerLoadListener> d = new HashMap();

    @Override // com.tencent.mapsdk.internal.ez
    public final void a(fs fsVar) {
    }

    public pc(mn mnVar) {
        this.b = mnVar;
    }

    private bn a() {
        return this.b;
    }

    private mn b() {
        return this.b;
    }

    private AoiLayer a(String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        pa paVar;
        Iterator<pa> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                paVar = null;
                break;
            }
            paVar = it.next();
            if (paVar.getId() != null && paVar.getId().equals(str)) {
                break;
            }
        }
        if (paVar == null) {
            paVar = new pa(this, str, aoiLayerOptions, this);
            this.a.add(paVar);
            if (onAoiLayerLoadListener != null) {
                this.d.put(str, onAoiLayerLoadListener);
            }
        }
        paVar.a(aoiLayerOptions);
        return paVar;
    }

    private void a(pa paVar) {
        this.a.remove(paVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        r4 = com.tencent.mapsdk.internal.pa.a(r0.getId(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EDGE_INSN: B:32:0x0070->B:27:0x0070 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.tencent.mapsdk.engine.jni.models.TappedElement r11) {
        /*
            r10 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r10.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r11 == 0) goto L79
            int r0 = r11.type
            r2 = 4
            if (r0 != r2) goto L79
            long r2 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.pa> r11 = r10.a
            java.util.Iterator r11 = r11.iterator()
        L15:
            boolean r0 = r11.hasNext()
            r4 = 0
            if (r0 == 0) goto L70
            java.lang.Object r0 = r11.next()
            com.tencent.mapsdk.internal.pa r0 = (com.tencent.mapsdk.internal.pa) r0
            com.tencent.mapsdk.internal.pb r5 = r0.b
            if (r5 == 0) goto L66
            com.tencent.mapsdk.internal.pb r5 = r0.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            if (r5 == 0) goto L66
            com.tencent.mapsdk.internal.pb r5 = r0.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            java.util.List<com.tencent.mapsdk.internal.pb$d> r5 = r5.j
            if (r5 == 0) goto L66
            com.tencent.mapsdk.internal.pb r5 = r0.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            java.util.List<com.tencent.mapsdk.internal.pb$d> r5 = r5.j
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.pb$d r6 = (com.tencent.mapsdk.internal.pb.d) r6
            com.tencent.mapsdk.internal.pc r7 = r0.a
            com.tencent.mapsdk.internal.mn r7 = r7.b
            com.tencent.mapsdk.internal.bj r7 = r7.k
            java.lang.Class<com.tencent.mapsdk.internal.ni> r8 = com.tencent.mapsdk.internal.ni.class
            int r9 = r6.a
            com.tencent.mapsdk.internal.mp r7 = r7.a(r8, r9)
            com.tencent.mapsdk.internal.ni r7 = (com.tencent.mapsdk.internal.ni) r7
            if (r7 == 0) goto L3e
            int r7 = r7.e_()
            long r7 = (long) r7
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L3e
            r4 = r6
        L66:
            if (r4 == 0) goto L15
            java.lang.String r11 = r0.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.pa.a(r11, r4)
        L70:
            if (r4 == 0) goto L79
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r10.c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pc.a(com.tencent.mapsdk.engine.jni.models.TappedElement):boolean");
    }

    private void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.c = onMapPoiClickListener;
    }

    private void c() {
        this.c = null;
        this.a.clear();
        this.d.clear();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener
    public final void onAoiLayerLoaded(boolean z, AoiLayer aoiLayer) {
        if (aoiLayer == null || this.b == null) {
            return;
        }
        AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = this.d.get(aoiLayer.getId());
        if (onAoiLayerLoadListener != null) {
            onAoiLayerLoadListener.onAoiLayerLoaded(z, aoiLayer);
        }
        if (z) {
            this.b.d.g().a++;
        }
    }
}
