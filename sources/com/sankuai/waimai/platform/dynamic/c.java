package com.sankuai.waimai.platform.dynamic;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.dynamic.e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    Gson b;
    public e c;
    f d;
    public boolean e;
    public Map<String, Object> f;
    @Nullable
    private com.meituan.android.cube.pga.block.a g;

    public c() {
        this(new Gson());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df123fe6fd032d350e0f308809a2d7cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df123fe6fd032d350e0f308809a2d7cd");
        } else {
            this.c = new e();
        }
    }

    private c(Gson gson) {
        Object[] objArr = {gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703667826f18b916d27f7ada14b708bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703667826f18b916d27f7ada14b708bf");
            return;
        }
        this.e = false;
        this.g = null;
        this.b = gson;
    }

    com.meituan.android.cube.pga.viewmodel.a a(com.meituan.android.cube.pga.dynamic.c cVar, com.meituan.android.cube.pga.type.a aVar) {
        com.meituan.android.cube.pga.dynamic.d a2;
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7dddcfb8171694ba8f6ad4a055852f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7dddcfb8171694ba8f6ad4a055852f");
        }
        if (cVar != null && (a2 = a(cVar.c)) != null) {
            String str = "";
            if (this.f != null && this.f.containsKey(cVar.c)) {
                if (cVar.f == 0 && cVar.e == null) {
                    cVar.e = (JSONObject) this.f.get(cVar.c);
                } else if (cVar.f == 1 && TextUtils.isEmpty(cVar.d)) {
                    cVar.d = (String) this.f.get(cVar.c);
                }
            }
            if (cVar.f == 0) {
                if (cVar.e != null) {
                    str = cVar.e.toString();
                }
            } else {
                str = cVar.d;
            }
            try {
                com.meituan.android.cube.pga.viewmodel.a a3 = a2.a((com.meituan.android.cube.pga.dynamic.d) a2.a(str, this.b));
                e eVar = this.c;
                Object[] objArr2 = {cVar, a3};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ad870a65a65acc91ff43ce61d1ca8a97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ad870a65a65acc91ff43ce61d1ca8a97");
                } else {
                    try {
                        if (a3.e() == null) {
                            if (eVar.b) {
                                com.sankuai.waimai.platform.capacity.log.c a4 = com.sankuai.waimai.platform.capacity.log.c.a();
                                a4.a(16007, 0, "homepage_head_" + cVar.a);
                            }
                            com.sankuai.waimai.platform.capacity.log.i.d(new e.a().a(cVar.a).b("native_id_error").c(cVar.c == null ? "unknown" : cVar.c).d(eVar.a(cVar)).b());
                        } else if (cVar.b != null && cVar.b.length() > 0) {
                            if (eVar.b) {
                                com.sankuai.waimai.platform.capacity.log.c a5 = com.sankuai.waimai.platform.capacity.log.c.a();
                                a5.a(16006, 0, "homepage_head_" + cVar.a);
                            }
                        } else if (eVar.b) {
                            com.sankuai.waimai.platform.capacity.log.c a6 = com.sankuai.waimai.platform.capacity.log.c.a();
                            a6.a(16005, 0, "homepage_head_" + cVar.a);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (a3 != null && cVar != null) {
                    a3.b = cVar.i;
                }
                a3.a(aVar);
                a3.d(cVar.c);
                a3.c(cVar.a);
                if (a3.e() != null) {
                    if (a3.c().booleanValue()) {
                        return a3;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a {
        public static ChangeQuickRedirect a;
        private String c;
        private com.meituan.android.cube.pga.dynamic.b d;
        private List<com.meituan.android.cube.pga.block.a> e;
        private com.meituan.android.cube.pga.type.a f;
        private Map<String, String> g;

        public a(String str, @Nullable List<com.meituan.android.cube.pga.block.a> list, com.meituan.android.cube.pga.type.a aVar, com.meituan.android.cube.pga.dynamic.b bVar) {
            Object[] objArr = {c.this, str, list, aVar, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9538a1867e267ebf894d3c1f30403abe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9538a1867e267ebf894d3c1f30403abe");
                return;
            }
            this.c = str;
            this.d = bVar;
            this.f = aVar;
            this.e = list;
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x0289, code lost:
            r12 = r20.b.a(r1, r20.f);
            r1.j = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0295 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00da A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.meituan.android.cube.pga.dynamic.c> a(java.lang.Void... r21) {
            /*
                Method dump skipped, instructions count: 704
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.dynamic.c.a.a(java.lang.Void[]):java.util.List");
        }

        public void a(List<com.meituan.android.cube.pga.dynamic.c> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51bd992670c80f0c45460a151e8fcffe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51bd992670c80f0c45460a151e8fcffe");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.meituan.android.cube.pga.dynamic.c cVar : list) {
                if (cVar != null && cVar.k != null) {
                    com.meituan.android.cube.pga.block.b bVar = null;
                    if (cVar.j) {
                        String str = cVar.c;
                        if (cVar.k instanceof j) {
                            str = cVar.a;
                        }
                        com.meituan.android.cube.pga.dynamic.d a2 = c.this.a(str);
                        if (a2 != null && (bVar = a(this.e, arrayList, a2.a())) == null) {
                            bVar = a2.a(this.f);
                        }
                    } else {
                        bVar = a(this.e, arrayList, cVar.a);
                        if (bVar == null) {
                            bVar = new g(this.f, c.this.e);
                        }
                    }
                    if (bVar != null) {
                        if (cVar != null && cVar.k != null) {
                            cVar.k.b = cVar.i;
                        }
                        bVar.a((com.meituan.android.cube.pga.block.b) cVar.k);
                        if (com.meituan.android.cube.pga.block.a.class.isInstance(bVar)) {
                            arrayList.add((com.meituan.android.cube.pga.block.a) bVar);
                        }
                    }
                }
            }
            this.d.a(arrayList);
        }

        private com.meituan.android.cube.pga.block.a a(List<com.meituan.android.cube.pga.block.a> list, List<com.meituan.android.cube.pga.block.a> list2, Type type) {
            Object[] objArr = {list, list2, type};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07d8ae5cf916f352a4007775ed4cb6f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07d8ae5cf916f352a4007775ed4cb6f");
            }
            for (com.meituan.android.cube.pga.block.a aVar : list) {
                if (aVar.getClass().equals(type) && !list2.contains(aVar)) {
                    return aVar;
                }
            }
            return null;
        }

        private com.meituan.android.cube.pga.block.a a(List<com.meituan.android.cube.pga.block.a> list, List<com.meituan.android.cube.pga.block.a> list2, String str) {
            Object[] objArr = {list, list2, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157664c7b572c6b659b5cd7e5d7187e1", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157664c7b572c6b659b5cd7e5d7187e1");
            }
            for (com.meituan.android.cube.pga.block.a aVar : list) {
                if ((aVar instanceof g) && ((g) aVar).M().equals(str) && !list2.contains(aVar)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    @Nullable
    public final com.meituan.android.cube.pga.dynamic.d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb66ba6c1bd808c3d31a47337fb885bd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.dynamic.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb66ba6c1bd808c3d31a47337fb885bd") : com.meituan.android.cube.pga.dynamic.a.a().a(str);
    }
}
