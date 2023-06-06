package com.sankuai.waimai.alita.persona;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.persona.d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    private com.sankuai.waimai.alita.base.d<String, a> c;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<e>> d;

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7937da9c0b2803dca73d618cc14c35ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7937da9c0b2803dca73d618cc14c35ca");
            return;
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = bVar.d.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<e> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next != null) {
                if (jSONObject != null) {
                    next.a(jSONObject);
                } else {
                    next.a();
                }
            }
        }
    }

    public b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72274e2cca612b94c07595c3bceae394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72274e2cca612b94c07595c3bceae394");
            return;
        }
        this.c = new com.sankuai.waimai.alita.base.d<>();
        this.d = new ConcurrentHashMap<>();
        this.b = str;
    }

    @Nullable
    private a a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78abbdf08161dcae121d6d912097e503", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78abbdf08161dcae121d6d912097e503");
        }
        d a2 = d.a();
        String str2 = this.b;
        Object[] objArr2 = {str2, str};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "16f3f6a4b248d3262f33a8a223e78187", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "16f3f6a4b248d3262f33a8a223e78187");
        }
        String a3 = d.a(str2, str);
        Object[] objArr3 = {a3};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d2a574f30e02c94bc0010d0a65d70917", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d2a574f30e02c94bc0010d0a65d70917");
        }
        d.a a4 = a2.b.a((com.sankuai.waimai.alita.base.d<String, d.a>) a3);
        if (a4 != null) {
            return (a) a4.b;
        }
        return null;
    }

    public final void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5fa8fac61fe25135626fbc3b861de08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5fa8fac61fe25135626fbc3b861de08");
        } else {
            d.a().a(aVar);
        }
    }

    public final synchronized void a(String str, @NonNull e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0723a74bf2f5da9a733ca5b0aca004c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0723a74bf2f5da9a733ca5b0aca004c5");
            return;
        }
        Object[] objArr2 = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3554bf84eb8490a0364844653a1eedc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3554bf84eb8490a0364844653a1eedc");
        } else {
            CopyOnWriteArrayList<e> copyOnWriteArrayList = this.d.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.d.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(eVar);
        }
        b(str);
    }

    public final synchronized void b(String str, @NonNull e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfee252a889e77d0585c375bac157c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfee252a889e77d0585c375bac157c5");
            return;
        }
        d(str, eVar);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89764232205885e73f2e5450907e5fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89764232205885e73f2e5450907e5fc6");
            return;
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            this.d.remove(str);
            a a2 = a(str);
            if (a2 != null) {
                a2.e();
            }
        }
    }

    public final synchronized void c(String str, @NonNull e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85512ae79c0e97f6ee35c424a3462903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85512ae79c0e97f6ee35c424a3462903");
            return;
        }
        a a2 = a(str);
        if (a2 != null) {
            a2.b(eVar);
        }
    }

    private synchronized void d(String str, @NonNull e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09215b126a19b8bae76dc908d50c5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09215b126a19b8bae76dc908d50c5ef");
            return;
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    private synchronized void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4631882f08caa083cde8f57772d847ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4631882f08caa083cde8f57772d847ab");
            return;
        }
        a a2 = a(str);
        if (a2 != null) {
            a2.a(new e() { // from class: com.sankuai.waimai.alita.persona.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.persona.e
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2e8053da7879b0d96bb7e2eb5f43cce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2e8053da7879b0d96bb7e2eb5f43cce");
                    } else {
                        b.a(b.this, jSONObject, str);
                    }
                }

                @Override // com.sankuai.waimai.alita.persona.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4e780e480cf57e72f4fc2320f0330b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4e780e480cf57e72f4fc2320f0330b8");
                    } else {
                        b.a(b.this, null, str);
                    }
                }
            });
            a2.d();
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "150f7f9eb1ebc41cbad8ce06bfb1717c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "150f7f9eb1ebc41cbad8ce06bfb1717c");
        } else {
            d.a().b();
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d58862f5522c988bbd4c46ffd9506ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d58862f5522c988bbd4c46ffd9506ca");
        } else {
            d.a().c();
        }
    }
}
