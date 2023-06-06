package com.sankuai.waimai.platform.capacity.network.cdn;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.cdn.d;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements t {
    public static ChangeQuickRedirect a;
    d b;
    public f c;

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        d.b bVar;
        boolean z;
        z zVar;
        d.b bVar2;
        z zVar2;
        z zVar3;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91187366efdb3f658a5f48630092befc", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91187366efdb3f658a5f48630092befc");
        }
        x a2 = aVar.a();
        if (this.b == null || !this.b.b) {
            return aVar.a(a2);
        }
        String host = a2.b().getHost();
        d dVar = this.b;
        Object[] objArr2 = {host};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "fc30ea512f8c8fa04b26c3b5598869c8", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (d.b) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "fc30ea512f8c8fa04b26c3b5598869c8");
        } else {
            if (dVar.c != null && !dVar.c.isEmpty() && !TextUtils.isEmpty(host)) {
                Iterator<d.b> it = dVar.c.iterator();
                while (it.hasNext()) {
                    d.b next = it.next();
                    if (next.b != null && host.equals(next.b.a)) {
                        bVar = next;
                        break;
                    }
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d2922155f63c0a6b306d0060e68ab923", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d2922155f63c0a6b306d0060e68ab923")).booleanValue();
            } else {
                z = (bVar.a() + bVar.c()) + bVar.b() > 0;
            }
            if (z) {
                String str = host + "_final";
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    Object[] objArr4 = {a2, aVar, bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    d.b bVar3 = bVar;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b5ed24434db8c4f76995d1bd1724bad0", RobustBitConfig.DEFAULT_VALUE)) {
                        zVar3 = (z) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b5ed24434db8c4f76995d1bd1724bad0");
                    } else {
                        int a3 = bVar3.a();
                        int b = bVar3.b();
                        int c = bVar3.c();
                        if (a3 > 0) {
                            z a4 = a(aVar, a2, a3, b + c == 0);
                            if (a(a4)) {
                                zVar3 = a4;
                            } else {
                                zVar = a4;
                            }
                        } else {
                            zVar = null;
                        }
                        if (b > 0) {
                            bVar2 = bVar3;
                            zVar2 = a(aVar, a(a2, bVar2.c.a), b, c == 0);
                            if (!a(zVar2)) {
                            }
                            zVar3 = zVar2;
                        } else {
                            bVar2 = bVar3;
                            zVar2 = zVar;
                        }
                        if (c > 0) {
                            zVar3 = a(aVar, a(a2, bVar2.d.a), c, true);
                        }
                        zVar3 = zVar2;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (zVar3 == null) {
                        a(str, c.a(), currentTimeMillis2);
                    } else {
                        a(str, zVar3.c, currentTimeMillis2);
                    }
                    return zVar3;
                } catch (IOException e) {
                    a(str, c.a(e), System.currentTimeMillis() - currentTimeMillis);
                    throw e;
                }
            }
        }
        return aVar.a(a2);
    }

    private boolean a(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1361bb3d3b652bf0b17f0c28e61a33eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1361bb3d3b652bf0b17f0c28e61a33eb")).booleanValue() : zVar != null && zVar.c();
    }

    private x a(x xVar, String str) throws IOException {
        Object[] objArr = {xVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fc593bfdff3ba07714330f16aa52fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (x) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fc593bfdff3ba07714330f16aa52fa");
        }
        URI b = xVar.b();
        x.a f = xVar.f();
        return f.a(b.getScheme() + "://" + str + b.getRawPath()).a();
    }

    private z a(t.a aVar, x xVar, int i, boolean z) throws IOException {
        z a2;
        Object[] objArr = {aVar, xVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ac3e43420696b97bc4ab393401e1a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ac3e43420696b97bc4ab393401e1a2");
        }
        String host = xVar.b().getHost();
        for (int i2 = 1; i2 <= i; i2++) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                a2 = aVar.a(xVar);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (a2 == null) {
                    a(host, c.a(), currentTimeMillis2);
                } else {
                    if (!z && !a2.c() && i2 >= i) {
                        a(host, 10001, currentTimeMillis2);
                    }
                    a(host, a2.c, currentTimeMillis2);
                }
            } catch (IOException e) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                if (z || i2 < i) {
                    a(host, c.a(e), currentTimeMillis3);
                } else {
                    a(host, 10001, currentTimeMillis3);
                }
                if (!z) {
                    continue;
                } else if (i2 == i) {
                    throw e;
                }
            }
            if ((a2 != null && a2.c()) || i2 >= i) {
                return a2;
            }
        }
        return null;
    }

    private void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4748760f0e75a2765e02574b6cd6472f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4748760f0e75a2765e02574b6cd6472f");
        } else if (this.c == null) {
        } else {
            this.c.a(str, i, j);
        }
    }
}
