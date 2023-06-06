package com.meituan.android.mrn.utils.event;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.mrn.utils.collection.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a implements Closeable {
    public static ChangeQuickRedirect c;
    protected com.meituan.android.mrn.utils.collection.f<String, Object> d;
    protected ExecutorService e;
    protected final int f;
    protected boolean g;
    protected boolean h;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.utils.event.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0296a extends RuntimeException {
        public C0296a(String str) {
            super(str);
        }
    }

    public a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), (byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2090f25b9f4b6b0755c0046f3220495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2090f25b9f4b6b0755c0046f3220495");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.utils.collection.f.a;
        this.d = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "19e439bcb5d1e45585e60b5721673340", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.utils.collection.f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "19e439bcb5d1e45585e60b5721673340") : new com.meituan.android.mrn.utils.collection.f<>(new f.a<K, V>() { // from class: com.meituan.android.mrn.utils.collection.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.collection.f.a
            public final Map<K, Collection<V>> c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72734cce211710b33574d1bb432efc0c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72734cce211710b33574d1bb432efc0c") : new ConcurrentHashMap();
            }

            @Override // com.meituan.android.mrn.utils.collection.f.a
            public final Collection<V> b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e74cec79d915b0aba44718cbe86c719", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e74cec79d915b0aba44718cbe86c719") : new CopyOnWriteArrayList();
            }
        });
        this.f = i;
        this.g = true;
        this.h = true;
    }

    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dccdb47efdb80845bc7a9ec1d334b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dccdb47efdb80845bc7a9ec1d334b7");
        } else if (gVar == null) {
        } else {
            a(gVar.a(), gVar);
        }
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cece1ede8039818d055a7a755f0d930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cece1ede8039818d055a7a755f0d930");
        } else if (obj == null || str == null) {
        } else {
            this.d.a(str, obj);
        }
    }

    public final void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b24fd21dbc7e8c5638f63e8588d738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b24fd21dbc7e8c5638f63e8588d738");
        } else if (obj == null || str == null) {
        } else {
            this.d.b(str, obj);
        }
    }

    public <L, O> void a(e<L, O> eVar, O o) {
        Object[] objArr = {eVar, o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775c873b75a2027f7280fd20c424975f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775c873b75a2027f7280fd20c424975f");
        } else {
            a(null, eVar, o);
        }
    }

    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82bf587371e8c6f0e5afc97d3bd08c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82bf587371e8c6f0e5afc97d3bd08c57");
            return;
        }
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = com.sankuai.android.jarvis.c.a("mrn_event_emitter", this.f);
                }
            }
        }
        this.e.execute(runnable);
    }

    public final <L, O> void a(@NonNull String str, @NonNull e<L, O> eVar, @NonNull Collection<Object> collection, O o) {
        int i = 4;
        char c2 = 0;
        Object[] objArr = {str, eVar, collection, o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2358ebcf156d38d456d2f6389997f7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2358ebcf156d38d456d2f6389997f7b7");
            return;
        }
        for (Object obj : collection) {
            if (obj != null) {
                Object[] objArr2 = new Object[i];
                objArr2[c2] = str;
                objArr2[1] = eVar;
                objArr2[2] = obj;
                objArr2[3] = o;
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd23e9836b31dfdfd434bf899f3ec647", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd23e9836b31dfdfd434bf899f3ec647");
                } else {
                    try {
                        Object[] objArr3 = new Object[4];
                        objArr3[0] = str;
                        objArr3[1] = eVar;
                        try {
                            objArr3[2] = obj;
                            objArr3[3] = o;
                            ChangeQuickRedirect changeQuickRedirect3 = c;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0af073a280ac78a069d88623025226d7", RobustBitConfig.DEFAULT_VALUE)) {
                                try {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0af073a280ac78a069d88623025226d7");
                                } catch (ClassCastException e) {
                                    e = e;
                                    Throwable th = e;
                                    if (!this.h) {
                                        a(th, str, eVar, obj, o);
                                    }
                                    i = 4;
                                    c2 = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    a(th, str, eVar, obj, o);
                                    i = 4;
                                    c2 = 0;
                                }
                            } else {
                                eVar.b(str, obj, o);
                            }
                        } catch (ClassCastException e2) {
                            e = e2;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (ClassCastException e3) {
                        e = e3;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                i = 4;
                c2 = 0;
            }
        }
    }

    private <L, O> void b(@NonNull final String str, @NonNull final e<L, O> eVar, @NonNull Collection<Object> collection, final O o) {
        boolean z;
        boolean z2;
        String str2 = str;
        char c2 = 0;
        Object[] objArr = {str2, eVar, collection, o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6369454c72d69479f2ddf6d254ee892f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6369454c72d69479f2ddf6d254ee892f");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object[] objArr2 = new Object[2];
            objArr2[c2] = eVar;
            objArr2[1] = next;
            ChangeQuickRedirect changeQuickRedirect2 = c;
            Iterator<Object> it2 = it;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99a322504a1be3bdce2f9b6de2a37373", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99a322504a1be3bdce2f9b6de2a37373")).booleanValue();
            } else {
                z = (next instanceof h) || !this.g;
            }
            if (z) {
                if (!(eVar instanceof d) || ((d) eVar).a(str2, next, o)) {
                    arrayList2.add(next);
                } else {
                    a(new C0296a(String.format("This EventEmitter forbid %s to receive synchronously!", next.getClass().getName())), str, eVar, next, o);
                }
                it = it2;
            } else {
                Object[] objArr3 = {eVar, next};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8e7c098cc4142986a47a453966728beb", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8e7c098cc4142986a47a453966728beb")).booleanValue();
                } else if (!(next instanceof c)) {
                    z2 = this.g;
                } else {
                    Collection<e> a = ((c) next).a();
                    z2 = a == null || a.contains(eVar);
                }
                if (z2) {
                    arrayList.add(next);
                }
                it = it2;
                str2 = str;
            }
            c2 = 0;
        }
        if (arrayList2.size() > 0) {
            a(str, eVar, arrayList2, o);
        }
        if (arrayList.size() > 0) {
            a(new Runnable() { // from class: com.meituan.android.mrn.utils.event.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5b6b3a6436f93a456b38767af5471997", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5b6b3a6436f93a456b38767af5471997");
                    } else {
                        a.this.a(str, eVar, arrayList, o);
                    }
                }
            });
        }
    }

    public final <L, O> void a(String str, e<L, O> eVar, O o) {
        Collection<Object> a;
        Object[] objArr = {str, eVar, o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1735cac291eecc07f16477ad0496a759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1735cac291eecc07f16477ad0496a759");
        } else if (eVar == null) {
        } else {
            if (str == null) {
                str = eVar.a();
            }
            if (TextUtils.isEmpty(str) || (a = this.d.a(str)) == null || a.size() <= 0) {
                return;
            }
            if (o instanceof b) {
                ((b) o).m = System.currentTimeMillis();
            }
            b(str, eVar, a, o);
        }
    }

    private void a(Throwable th, String str, e eVar, Object obj, Object obj2) {
        Object[] objArr = {th, str, eVar, obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c29cdfe24e81001a9db8456b4cf7387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c29cdfe24e81001a9db8456b4cf7387");
        } else if ((obj instanceof f) && ((f) obj).a(th, str, eVar, obj, obj2)) {
        } else {
            if (!(eVar instanceof f) || !((f) eVar).a(th, str, eVar, obj, obj2)) {
                throw new RuntimeException(th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879eb7e5a63617c2901b7981bb659828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879eb7e5a63617c2901b7981bb659828");
            return;
        }
        if (this.e != null) {
            this.e.shutdownNow();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c054b89e49355ce97df67bf45aeef194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c054b89e49355ce97df67bf45aeef194");
        } else {
            this.d.a();
        }
    }
}
