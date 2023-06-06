package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.tools.EncryptAesUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response;
import com.tencent.mapsdk.internal.qy;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.io.File;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qz implements of {
    public static final String a = "d8ab2f7b7a7536a71894084e1c812fd0";
    public static final IvParameterSpec b = new IvParameterSpec("c0ab1f54he78k36d".getBytes());
    public static int c = 0;
    public static int d = 1;
    public static int e = 2;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    qy i;
    private mn k;
    private String m;
    private dq n;
    private final SparseArray<qw> l = new SparseArray<>(32);
    public final a j = new a();

    @Override // com.tencent.mapsdk.internal.of
    public final void h() {
    }

    static /* synthetic */ boolean a(qz qzVar) {
        qzVar.g = false;
        return false;
    }

    public qz(mn mnVar) {
        this.k = mnVar;
        this.k.a(this);
        this.i = new qy(this.k.k);
        mi a2 = mi.a(mnVar.getContext(), (TencentMapOptions) null);
        kd.a(a2.d);
        this.m = a2.d;
        this.n = (dq) ck.a(dq.class);
    }

    private void a(boolean z) {
        this.f = z;
        if (z) {
            try {
                synchronized (this.j) {
                    this.j.start();
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.f = false;
        synchronized (this.j) {
            this.j.notifyAll();
        }
    }

    private void a() {
        this.g = false;
        synchronized (this.j) {
            this.j.notifyAll();
        }
    }

    private void b() {
        this.g = true;
    }

    private void c() {
        this.h = true;
        this.f = false;
        synchronized (this.j) {
            this.j.notifyAll();
        }
    }

    private qw b(int i) {
        if (this.k == null || (this.k.C() != null && this.k.C().e)) {
            return null;
        }
        kj.c(ki.m, "traffic event tobe fetch data from net!");
        Rect rect = this.k.o;
        LatLng a2 = this.k.n.a(new PointF(rect.width() * (-2), rect.height() * 3));
        LatLng a3 = this.k.n.a(new PointF(rect.width() * 3, rect.height() * (-2)));
        LatLng a4 = kb.a(this.k.t.m);
        NetResponse mapTrafficEvent = ((dc) this.n.h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + a2.latitude + "&lblon=" + a2.longitude + "&rtlat=" + a3.latitude + "&rtlon=" + a3.longitude + "&zoom=" + i + "&suid=" + gy.d() + "&version=" + gy.m() + "&nt=" + gy.g() + "&location=" + a4.latitude + CommonConstant.Symbol.COMMA + a4.longitude, a, b)));
        if (mapTrafficEvent == null || mapTrafficEvent.data == null) {
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : StringUtil.NULL);
            kj.c("net", sb.toString());
            return null;
        }
        m mVar = new m(mapTrafficEvent.data);
        mVar.a("UTF-8");
        Response response = new Response();
        response.readFrom(mVar);
        if (response.error != 0 || response.detail == null) {
            return null;
        }
        return new qw(new LatLngBounds.Builder().include(a2).include(a3).build(), response.detail);
    }

    private qw a(int i, LatLng latLng, LatLng latLng2, LatLng latLng3) {
        NetResponse mapTrafficEvent = ((dc) this.n.h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + latLng.latitude + "&lblon=" + latLng.longitude + "&rtlat=" + latLng2.latitude + "&rtlon=" + latLng2.longitude + "&zoom=" + i + "&suid=" + gy.d() + "&version=" + gy.m() + "&nt=" + gy.g() + "&location=" + latLng3.latitude + CommonConstant.Symbol.COMMA + latLng3.longitude, a, b)));
        if (mapTrafficEvent == null || mapTrafficEvent.data == null) {
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : StringUtil.NULL);
            kj.c("net", sb.toString());
            return null;
        }
        m mVar = new m(mapTrafficEvent.data);
        mVar.a("UTF-8");
        Response response = new Response();
        response.readFrom(mVar);
        if (response.error != 0 || response.detail == null) {
            return null;
        }
        return new qw(new LatLngBounds.Builder().include(latLng).include(latLng2).build(), response.detail);
    }

    private void a(qw qwVar, qw qwVar2) {
        if (qwVar2 == null || qwVar2.c == null) {
            return;
        }
        if (qwVar2.c.isEmpty()) {
            this.i.a();
            return;
        }
        LinkedList linkedList = new LinkedList();
        if (qwVar == null || qwVar.c == null || qwVar.c.isEmpty()) {
            return;
        }
        List<Detail> list = qwVar.c;
        List<Detail> list2 = qwVar2.c;
        for (Detail detail : list) {
            boolean z = false;
            Iterator<Detail> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().basic.eventid.equals(detail.basic.eventid)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                linkedList.add(detail);
            }
        }
        this.i.b(linkedList);
    }

    final void a(qw qwVar) {
        int i;
        byte[] c2;
        gs gsVar;
        if (qwVar == null || qwVar.c == null || qwVar.c.isEmpty()) {
            return;
        }
        if (this.k != null && (gsVar = this.k.d) != null) {
            gsVar.f().a++;
        }
        for (Detail detail : qwVar.c) {
            String str = detail.basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                String substring = str.substring(i);
                if (gx.b.a(substring) == null) {
                    File file = new File(this.m, substring);
                    if (!file.exists()) {
                        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
                        if (doGet != null && doGet.data != null) {
                            kc.a(file, doGet.data);
                            c2 = doGet.data;
                        }
                    } else {
                        c2 = kc.c(file);
                    }
                    if (c2 != null && c2.length > 0) {
                        gx.b.a(substring, com.sankuai.waimai.launcher.util.image.a.a(c2, 0, c2.length));
                    }
                }
            }
        }
        this.i.a(qwVar.c);
    }

    private void a(List<Detail> list) {
        int i;
        byte[] c2;
        for (Detail detail : list) {
            String str = detail.basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                String substring = str.substring(i);
                if (gx.b.a(substring) == null) {
                    File file = new File(this.m, substring);
                    if (!file.exists()) {
                        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
                        if (doGet != null && doGet.data != null) {
                            kc.a(file, doGet.data);
                            c2 = doGet.data;
                        }
                    } else {
                        c2 = kc.c(file);
                    }
                    if (c2 != null && c2.length > 0) {
                        gx.b.a(substring, com.sankuai.waimai.launcher.util.image.a.a(c2, 0, c2.length));
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.of
    public final void i() {
        synchronized (this.j) {
            this.j.notifyAll();
        }
    }

    public final TrafficEvent a(int i) {
        if (this.i == null) {
            return null;
        }
        for (String str : this.i.a.keySet()) {
            qy.a aVar = this.i.a.get(str);
            if (aVar != null && aVar.a.e_() == i) {
                return new qx(aVar.b);
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends Thread {
        private static final int b = 60000;

        a() {
            setName("tms-traffic");
            qz.a(qz.this);
            qz.this.h = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z;
            while (!qz.this.h && qz.this.f) {
                if (!qz.this.g) {
                    if (qz.this.k == null) {
                        qz.this.h = true;
                    } else {
                        int a = (int) qz.this.k.t.a();
                        LatLng[] a2 = qz.this.k.n.a();
                        qw qwVar = (qw) qz.this.l.get(a);
                        qw a3 = (qwVar != null && qwVar.c != null && System.currentTimeMillis() - qwVar.a <= LocationStrategy.LOCATION_TIMEOUT && qwVar.b.contains(a2[0]) && qwVar.b.contains(a2[1]) && qwVar.b.contains(a2[2]) && qwVar.b.contains(a2[3])) ? null : qz.a(qz.this, a);
                        if (a3 == null || a3.c == null) {
                            a3 = qwVar;
                        }
                        qz.this.l.put(a, a3);
                        qz qzVar = qz.this;
                        if (a3 != null && a3.c != null) {
                            if (a3.c.isEmpty()) {
                                qzVar.i.a();
                            } else {
                                LinkedList linkedList = new LinkedList();
                                if (qwVar != null && qwVar.c != null && !qwVar.c.isEmpty()) {
                                    List<Detail> list = qwVar.c;
                                    List<Detail> list2 = a3.c;
                                    for (Detail detail : list) {
                                        Iterator<Detail> it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (it.next().basic.eventid.equals(detail.basic.eventid)) {
                                                    z = true;
                                                    break;
                                                }
                                            } else {
                                                z = false;
                                                break;
                                            }
                                        }
                                        if (!z) {
                                            linkedList.add(detail);
                                        }
                                    }
                                    qzVar.i.b(linkedList);
                                }
                            }
                        }
                        qz.this.a(a3);
                        synchronized (this) {
                            try {
                                wait(LocationStrategy.LOCATION_TIMEOUT);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else {
                    kj.c(ki.m, "traffic event tobe paused!");
                    synchronized (this) {
                        try {
                            wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            kj.c(ki.m, "traffic event tobe destroyed!");
            if (qz.this.i != null) {
                qz.this.i.b();
                qz.this.l.clear();
            }
        }
    }

    static /* synthetic */ qw a(qz qzVar, int i) {
        if (qzVar.k == null || (qzVar.k.C() != null && qzVar.k.C().e)) {
            return null;
        }
        kj.c(ki.m, "traffic event tobe fetch data from net!");
        Rect rect = qzVar.k.o;
        LatLng a2 = qzVar.k.n.a(new PointF(rect.width() * (-2), rect.height() * 3));
        LatLng a3 = qzVar.k.n.a(new PointF(rect.width() * 3, rect.height() * (-2)));
        LatLng a4 = kb.a(qzVar.k.t.m);
        NetResponse mapTrafficEvent = ((dc) qzVar.n.h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + a2.latitude + "&lblon=" + a2.longitude + "&rtlat=" + a3.latitude + "&rtlon=" + a3.longitude + "&zoom=" + i + "&suid=" + gy.d() + "&version=" + gy.m() + "&nt=" + gy.g() + "&location=" + a4.latitude + CommonConstant.Symbol.COMMA + a4.longitude, a, b)));
        if (mapTrafficEvent == null || mapTrafficEvent.data == null) {
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : StringUtil.NULL);
            kj.c("net", sb.toString());
            return null;
        }
        m mVar = new m(mapTrafficEvent.data);
        mVar.a("UTF-8");
        Response response = new Response();
        response.readFrom(mVar);
        if (response.error != 0 || response.detail == null) {
            return null;
        }
        return new qw(new LatLngBounds.Builder().include(a2).include(a3).build(), response.detail);
    }
}
