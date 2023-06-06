package com.meituan.android.mrn.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.mrn.event.listeners.b;
import com.meituan.android.mrn.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b c;
    public Map<String, a> b;

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c64fda4fcb03a72d06f350d454021b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c64fda4fcb03a72d06f350d454021b1");
        }
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(context);
                }
            }
        }
        return c;
    }

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc1def47130d0409ba366b1ba735574d", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc1def47130d0409ba366b1ba735574d");
            } else if (c == null) {
                throw new IllegalStateException("createInstance() needs to be called before getInstance()");
            } else {
                return c;
            }
        }
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fd76cdd7ecd8c1b0cd9f99840d7d47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fd76cdd7ecd8c1b0cd9f99840d7d47");
            return;
        }
        this.b = new com.meituan.android.mrn.utils.collection.c(context, com.meituan.android.mrn.common.b.a(context), "BundleUsageInfo", com.meituan.android.mrn.utils.collection.b.c, new com.meituan.android.mrn.utils.collection.b<a>() { // from class: com.meituan.android.mrn.monitor.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ a a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f32c82354e99e99cfc3378dda9e2bdcd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f32c82354e99e99cfc3378dda9e2bdcd") : (a) com.meituan.android.mrn.utils.g.a(str, a.class);
            }

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ String a(a aVar) {
                a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "634c919c0ccef03a1c2120acbd744724", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "634c919c0ccef03a1c2120acbd744724") : com.meituan.android.mrn.utils.g.a(aVar2);
            }
        });
        com.meituan.android.mrn.event.c.b.a(new com.meituan.android.mrn.event.listeners.f() { // from class: com.meituan.android.mrn.monitor.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.event.listeners.f, com.meituan.android.mrn.event.listeners.b
            public final void a(b.f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c04c35b9ba80d3336aad356e6d7a57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c04c35b9ba80d3336aad356e6d7a57");
                }
            }

            @Override // com.meituan.android.mrn.event.listeners.f, com.meituan.android.mrn.event.listeners.b
            public final void a(b.d dVar) {
                a aVar;
                boolean z;
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a38c9449bd146f1f85a81b4e72aaa32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a38c9449bd146f1f85a81b4e72aaa32");
                    return;
                }
                b bVar = b.this;
                String c2 = dVar.c();
                Object[] objArr3 = {c2};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a2fda22b0b6d84d0833ee5716cf5aadb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a2fda22b0b6d84d0833ee5716cf5aadb");
                    return;
                }
                Object[] objArr4 = {c2};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "47c1c04a812ffd447e318fda19957aa3", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "47c1c04a812ffd447e318fda19957aa3");
                } else if (TextUtils.isEmpty(c2)) {
                    aVar = new a();
                } else {
                    aVar = bVar.b.get(c2);
                    if (aVar == null) {
                        aVar = new a();
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                Object[] objArr5 = {new Long(currentTimeMillis)};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "1b24a66e58dd0bb8648c4ffaa86fe34b", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "1b24a66e58dd0bb8648c4ffaa86fe34b");
                } else {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a.a;
                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "79bb9aa2a519ffbde14c2e3b306ff0fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "79bb9aa2a519ffbde14c2e3b306ff0fe");
                    } else {
                        long j = aVar.b;
                        Object[] objArr7 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect7 = ah.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "83efebc38707dc1382bb2ae2d74efc08", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "83efebc38707dc1382bb2ae2d74efc08")).booleanValue();
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            Object[] objArr8 = {new Long(j), new Long(currentTimeMillis2)};
                            ChangeQuickRedirect changeQuickRedirect8 = ah.a;
                            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "6b93e32e56e081d66714487026679059", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "6b93e32e56e081d66714487026679059")).booleanValue();
                            } else {
                                z = currentTimeMillis2 / 86400000 == j / 86400000;
                            }
                        }
                        if (!z) {
                            aVar.d = 0;
                        }
                    }
                    aVar.c++;
                    aVar.d++;
                    aVar.b = currentTimeMillis;
                }
                Object[] objArr9 = {c2, aVar};
                ChangeQuickRedirect changeQuickRedirect9 = b.a;
                if (PatchProxy.isSupport(objArr9, bVar, changeQuickRedirect9, false, "5ce6afe1a1334a5384577ca71c1402be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, bVar, changeQuickRedirect9, false, "5ce6afe1a1334a5384577ca71c1402be");
                } else if (TextUtils.isEmpty(c2) || aVar == null) {
                } else {
                    bVar.b.put(c2, aVar);
                }
            }
        });
    }

    public final List<String> a(final Comparator<a> comparator) {
        Object[] objArr = {comparator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a82e9bbb7aca8fde5e42ad18f12046", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a82e9bbb7aca8fde5e42ad18f12046");
        }
        int size = this.b.size();
        if (size <= 0) {
            return new ArrayList();
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.b.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, a>>() { // from class: com.meituan.android.mrn.monitor.b.3
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, a> entry, Map.Entry<String, a> entry2) {
                Map.Entry<String, a> entry3 = entry;
                Map.Entry<String, a> entry4 = entry2;
                Object[] objArr2 = {entry3, entry4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70e747e9cd270a19ae820ac8f022a94", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70e747e9cd270a19ae820ac8f022a94")).intValue() : comparator.compare(entry3.getValue(), entry4.getValue());
            }
        });
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry entry : arrayList) {
            arrayList2.add(entry.getKey());
        }
        return arrayList2;
    }
}
