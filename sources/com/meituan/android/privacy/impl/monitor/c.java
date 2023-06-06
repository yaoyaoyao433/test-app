package com.meituan.android.privacy.impl.monitor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements com.meituan.android.privacy.interfaces.monitor.b {
    public static ChangeQuickRedirect a;
    @NonNull
    public final List<com.meituan.android.privacy.interfaces.monitor.b> b;
    public boolean c;
    public boolean d;
    Set<String> e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    final Set<Integer> k;
    final Set<Integer> l;
    private final ExecutorService m;
    private boolean n;
    private Random o;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e7d8c1f1bc6543b9fcea6b148836208", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e7d8c1f1bc6543b9fcea6b148836208");
            return;
        }
        this.b = Collections.synchronizedList(new ArrayList(3));
        this.m = com.sankuai.android.jarvis.c.a("privacy-monitor");
        this.e = Collections.emptySet();
        this.k = new HashSet(Arrays.asList(-2, -12, -18));
        this.l = new HashSet(Arrays.asList(-2, -12, -18, -15, -3));
        Horn.register("privacy_monitor", new HornCallback() { // from class: com.meituan.android.privacy.impl.monitor.c.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
            }
        });
        String accessCache = Horn.accessCache("privacy_monitor");
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(accessCache);
            if (jSONObject.optBoolean("enable", false)) {
                this.c = jSONObject.optBoolean("loganEnable", false);
                this.d = jSONObject.optBoolean("babelEnable", false);
                this.n = jSONObject.optBoolean("logcatEnable", false);
                this.f = jSONObject.optInt("babelSample", 0);
                this.h = jSONObject.optInt("babelSpecialSample", 0);
                if (this.h == 0) {
                    this.h = this.f;
                }
                this.g = jSONObject.optInt("loganSample", 0);
                this.e = a(jSONObject, "blackTokens", this.e);
                this.i = jSONObject.optInt("netFilterBabelSample", 0);
                this.j = jSONObject.optInt("netFilterLoganSample", 0);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private Set<String> a(JSONObject jSONObject, String str, Set<String> set) throws JSONException {
        Object[] objArr = {jSONObject, str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d782355ee448b5b042073e99695f238", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d782355ee448b5b042073e99695f238");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            hashSet.add(optJSONArray.getString(i));
        }
        return hashSet;
    }

    public final void a(com.meituan.android.privacy.interfaces.monitor.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0c85dd0f6fbe0322115dd692146ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0c85dd0f6fbe0322115dd692146ddf");
        } else {
            this.b.add(bVar);
        }
    }

    public static void b(com.meituan.android.privacy.interfaces.monitor.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7797657a9cdfaa68350cadca782cb24f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7797657a9cdfaa68350cadca782cb24f");
            return;
        }
        com.meituan.android.privacy.interfaces.monitor.b bVar2 = com.meituan.android.privacy.interfaces.monitor.c.a;
        if (bVar2 instanceof c) {
            ((c) bVar2).a(bVar);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(final com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b03e361594e851282feadb16f692f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b03e361594e851282feadb16f692f61");
        } else if (dVar.n) {
        } else {
            this.m.execute(new Runnable() { // from class: com.meituan.android.privacy.impl.monitor.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82d2a60b98bba544297099474ea164fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82d2a60b98bba544297099474ea164fb");
                        return;
                    }
                    e eVar = new e();
                    c cVar = c.this;
                    com.meituan.android.privacy.interfaces.monitor.d dVar2 = dVar;
                    Object[] objArr3 = {dVar2, eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "02c824de416475780442f86457608d57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "02c824de416475780442f86457608d57");
                    } else {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        Context context = PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "27ab22acb40c3c1459be100fef646ccc", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "27ab22acb40c3c1459be100fef646ccc") : PermissionGuard.a.a.getContext(null);
                        if (context != null) {
                            com.meituan.android.privacy.impl.config.d a2 = com.meituan.android.privacy.impl.config.d.a(context);
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.privacy.impl.config.d.a;
                            dVar2.p = PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "60827738c211e6c3f113de98bd79e067", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "60827738c211e6c3f113de98bd79e067") : a2.c.a();
                        } else {
                            dVar2.p = "context-null";
                        }
                        eVar.d = true;
                        if (!cVar.e.contains(dVar2.c)) {
                            int a3 = cVar.a();
                            if (a3 >= cVar.h) {
                                eVar.a = false;
                            } else {
                                int i = cVar.f;
                                if (SocialConstants.TYPE_REQUEST.equals(dVar2.b)) {
                                    if (cVar.l.contains(Integer.valueOf(dVar2.e))) {
                                        i = cVar.h;
                                    }
                                } else if (cVar.k.contains(Integer.valueOf(dVar2.e))) {
                                    i = cVar.h;
                                }
                                if (a3 < i) {
                                    eVar.a = true;
                                    eVar.b = (i * 1.0d) / 100000.0d;
                                }
                            }
                            if (a3 < cVar.g && !dVar2.o) {
                                eVar.c = true;
                            }
                        }
                    }
                    dVar.s = eVar;
                    for (com.meituan.android.privacy.interfaces.monitor.b bVar : c.this.b) {
                        bVar.a(dVar);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(final c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abff8cb3adee9396f7472841f1874ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abff8cb3adee9396f7472841f1874ba9");
        } else {
            this.m.execute(new Runnable() { // from class: com.meituan.android.privacy.impl.monitor.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a11129e91e6144196dcaf8d36369a42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a11129e91e6144196dcaf8d36369a42");
                        return;
                    }
                    int a2 = c.this.a();
                    for (com.meituan.android.privacy.interfaces.monitor.b bVar : c.this.b) {
                        bVar.a(aVar, a2);
                    }
                }
            });
        }
    }

    int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb09de45a8834ec109058adb217870e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb09de45a8834ec109058adb217870e")).intValue();
        }
        if (this.o == null) {
            this.o = new Random();
        }
        return (int) (this.o.nextDouble() * 100000.0d);
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void b(final c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a236affd846acb42cb59fa9a38f408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a236affd846acb42cb59fa9a38f408");
        } else {
            this.m.execute(new Runnable() { // from class: com.meituan.android.privacy.impl.monitor.c.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b665fd963941004e419117c3d44a6d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b665fd963941004e419117c3d44a6d8");
                        return;
                    }
                    int a2 = c.this.a();
                    for (com.meituan.android.privacy.interfaces.monitor.b bVar : c.this.b) {
                        bVar.b(aVar, a2);
                    }
                }
            });
        }
    }
}
