package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.view.View;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.map.lib.models.MapExploreByTouchHelper;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ox extends MapExploreByTouchHelper implements fi {
    public List<AccessibleTouchItem> a;
    public List<AccessibleTouchItem> b;
    public so c;
    private Handler d;

    public ox(View view, so soVar) {
        super(view);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = new Handler();
        this.c = soVar;
        ((VectorMap) this.c.e_).a(this);
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final boolean onItemClicked(int i) {
        AccessibleTouchItem accessibleTouchItem;
        if (i < this.accessibleTouchItems.size() && (accessibleTouchItem = this.accessibleTouchItems.get(i)) != null) {
            invalidateVirtualView(i);
            sendEventForVirtualView(i, 1);
            accessibleTouchItem.onClick();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r2.getBounds().contains((int) r6, (int) r7) != false) goto L13;
     */
    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTargetPoiItemIdx(float r6, float r7) {
        /*
            r5 = this;
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            r1 = -1
            if (r0 == 0) goto L5f
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            int r0 = r0.size()
            if (r0 <= 0) goto L5f
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            if (r0 == 0) goto L3a
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            int r0 = r0.size()
            if (r0 <= 0) goto L3a
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            boolean r3 = r2 instanceof com.tencent.mapsdk.internal.oy
            if (r3 == 0) goto L3a
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L3a
            goto L3b
        L3a:
            r0 = -1
        L3b:
            if (r0 == r1) goto L3e
            return r0
        L3e:
            r0 = 0
        L3f:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            int r2 = r2.size()
            if (r0 >= r2) goto L5f
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L5c
            return r0
        L5c:
            int r0 = r0 + 1
            goto L3f
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ox.getTargetPoiItemIdx(float, float):int");
    }

    @Override // com.tencent.mapsdk.internal.fi
    public final void u() {
        this.d.post(new Runnable() { // from class: com.tencent.mapsdk.internal.ox.1
            @Override // java.lang.Runnable
            public final void run() {
                ox.this.accessibleTouchItems.clear();
                ox.this.a.clear();
                ox.this.b.clear();
                if (ox.this.c != null) {
                    so soVar = ox.this.c;
                    soVar.ar.clear();
                    fu[] fuVarArr = {y.b(((VectorMap) soVar.e_).getProjection().a(new fm(0.0d, 0.0d))), y.b(((VectorMap) soVar.e_).getProjection().a(new fm(soVar.X(), soVar.Y())))};
                    for (er erVar : soVar.aB.J.b) {
                        if (erVar instanceof aw) {
                            ao aoVar = ((aw) erVar).a;
                            if (so.a(aoVar.getPosition(), fuVarArr)) {
                                soVar.ar.add(aoVar);
                            }
                        }
                    }
                    List<ao> list = soVar.ar;
                    so soVar2 = ox.this.c;
                    soVar2.as.clear();
                    VectorMap vectorMap = (VectorMap) soVar2.e_;
                    ao aoVar2 = null;
                    soVar2.as = vectorMap.o == null ? null : vectorMap.o.D();
                    List<MapPoi> list2 = soVar2.as;
                    if (list != null) {
                        for (ao aoVar3 : list) {
                            String contentDescription = aoVar3.getContentDescription();
                            if (!hb.a(contentDescription)) {
                                if (contentDescription.startsWith(AccessibleTouchItem.MY_LOCATION_PREFIX)) {
                                    aoVar2 = aoVar3;
                                } else {
                                    ox.this.a.add(new oy(ox.this.c, aoVar3));
                                }
                            }
                        }
                        Collections.sort(ox.this.a);
                        ox.this.accessibleTouchItems.addAll(ox.this.a);
                    }
                    if (list2 != null) {
                        for (MapPoi mapPoi : list2) {
                            if (!hb.a(mapPoi.getName())) {
                                ox.this.b.add(new oz(ox.this.c, mapPoi));
                            }
                        }
                        Collections.sort(ox.this.b);
                        ox.this.accessibleTouchItems.addAll(ox.this.b);
                    }
                    if (aoVar2 != null) {
                        ox.this.accessibleTouchItems.add(new oy(ox.this.c, aoVar2));
                    }
                }
            }
        });
    }

    private int a(float f, float f2) {
        if (this.accessibleTouchItems == null || this.accessibleTouchItems.size() <= 0) {
            return -1;
        }
        int size = this.accessibleTouchItems.size() - 1;
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(size);
        if ((accessibleTouchItem instanceof oy) && accessibleTouchItem.getBounds().contains((int) f, (int) f2)) {
            return size;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mapsdk.internal.ot r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.getContentDescription()
            boolean r1 = com.tencent.mapsdk.internal.hb.a(r0)
            if (r1 == 0) goto Le
            return
        Le:
            com.tencent.mapsdk.internal.so r1 = r7.F
            r2 = 1
            if (r1 == 0) goto L35
            android.graphics.Rect r1 = r7.i()
            com.tencent.mapsdk.internal.so r3 = r7.F
            int r3 = r3.X()
            com.tencent.mapsdk.internal.so r4 = r7.F
            int r4 = r4.Y()
            int r5 = r1.left
            if (r5 < 0) goto L35
            int r5 = r1.top
            if (r5 < 0) goto L35
            int r5 = r1.right
            if (r5 > r3) goto L35
            int r1 = r1.bottom
            if (r1 > r4) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 != 0) goto L39
            return
        L39:
            com.tencent.mapsdk.internal.oy r1 = new com.tencent.mapsdk.internal.oy
            com.tencent.mapsdk.internal.so r3 = r6.c
            r1.<init>(r3, r7)
            r7 = 0
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r3 = r6.accessibleTouchItems
            int r3 = r3.size()
            if (r3 <= 0) goto L5f
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r3 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r4 = r6.accessibleTouchItems
            int r4 = r4.size()
            int r4 = r4 - r2
            java.lang.Object r2 = r3.get(r4)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            if (r2 == 0) goto L5f
            boolean r3 = r2 instanceof com.tencent.mapsdk.internal.oy
            if (r3 == 0) goto L5f
            r7 = r2
        L5f:
            java.lang.String r2 = "我的位置"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L6d
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.accessibleTouchItems
            r7.add(r1)
            return
        L6d:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.clear()
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.a
            r0.add(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.a
            java.util.Collections.sort(r0)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.a
            r0.addAll(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.b
            r0.addAll(r1)
            if (r7 == 0) goto L91
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.add(r7)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ox.a(com.tencent.mapsdk.internal.ot):void");
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final void onTalkBackActivate(View view) {
        super.onTalkBackActivate(view);
        ((VectorMap) this.c.e_).a(this);
        u();
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final void onTalkBackDeActivate(View view) {
        super.onTalkBackDeActivate(view);
        ((VectorMap) this.c.e_).b(this);
    }

    private void a() {
        ((VectorMap) this.c.e_).b(this);
        this.accessibleTouchItems.clear();
        this.a.clear();
        this.b.clear();
    }
}
