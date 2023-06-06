package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qy {
    Map<String, a> a = new ConcurrentHashMap();
    private final bj b;

    public qy(bj bjVar) {
        this.b = bjVar;
    }

    private Map<String, a> c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@NonNull List<Detail> list) {
        int i;
        if (this.b == null || list.isEmpty()) {
            return;
        }
        for (Detail detail : list) {
            String str = detail.basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                String substring = str.substring(i);
                kj.a(ki.m, "type:" + detail.basic.type + ", coord:" + detail.basic.coord_lat + ", " + detail.basic.coord_lon + ", minScale:" + detail.basic.min_scale + ", maxScale:" + detail.basic.max_scale);
                a aVar = this.a.get(detail.basic.eventid);
                if (aVar == null) {
                    nk nkVar = new nk(detail.basic.coord_lat, detail.basic.coord_lon, substring);
                    nkVar.anchor(detail.basic.anchor_x, detail.basic.anchor_y);
                    nkVar.minScaleLevel(detail.basic.min_scale);
                    nkVar.maxScaleLevel(detail.basic.max_scale);
                    nkVar.avoidAnnotation(true);
                    nkVar.avoidOtherMarker(true);
                    this.a.put(detail.basic.eventid, new a((ni) this.b.a((bj) nkVar), detail));
                } else {
                    nk a2 = aVar.a.a();
                    a2.position(detail.basic.coord_lat, detail.basic.coord_lon);
                    a2.iconName(substring);
                    a2.anchor(detail.basic.anchor_x, detail.basic.anchor_y);
                    a2.minScaleLevel(detail.basic.min_scale);
                    a2.maxScaleLevel(detail.basic.max_scale);
                    aVar.a.a((ni) a2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@NonNull List<Detail> list) {
        if (list.isEmpty()) {
            return;
        }
        for (Detail detail : list) {
            a aVar = this.a.get(detail.basic.eventid);
            if (aVar != null) {
                aVar.a.remove();
                this.a.remove(detail.basic.eventid);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.a == null) {
            return;
        }
        for (String str : this.a.keySet()) {
            a aVar = this.a.get(str);
            if (aVar != null) {
                aVar.a.remove();
            }
        }
        this.a.clear();
    }

    public final void b() {
        a();
        this.a = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        final ni a;
        final Detail b;

        a(ni niVar, Detail detail) {
            this.a = niVar;
            this.b = detail;
        }
    }
}
