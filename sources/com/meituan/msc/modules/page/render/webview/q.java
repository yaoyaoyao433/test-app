package com.meituan.msc.modules.page.render.webview;

import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.jse.bridge.LazyParseJSONArray;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "WebView")
/* loaded from: classes3.dex */
public class q extends com.meituan.msc.modules.manager.k {
    public static ChangeQuickRedirect a;
    public n b;
    e c;
    private final String d;
    private final com.meituan.msc.modules.service.b e;

    @MSCMethod(isSync = true)
    public void receive_sync_config(String str) {
    }

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e002f70355bac00f6c7e4d6cc61db7d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e002f70355bac00f6c7e4d6cc61db7d9");
            return;
        }
        this.d = "WebView" + hashCode();
        this.e = new com.meituan.msc.modules.service.b() { // from class: com.meituan.msc.modules.page.render.webview.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.service.b
            public final void a(Collection<DioFile> collection, String str, @Nullable ValueCallback<String> valueCallback) {
                Object[] objArr2 = {collection, str, valueCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "376d883d57fcbeefa64a638886be38a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "376d883d57fcbeefa64a638886be38a5");
                    return;
                }
                q qVar = q.this;
                Object[] objArr3 = {collection, valueCallback};
                ChangeQuickRedirect changeQuickRedirect3 = q.a;
                if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "dd37994745c2eefc91f87ed7a71be6b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "dd37994745c2eefc91f87ed7a71be6b9");
                } else if (collection != null) {
                    if (DebugHelper.b) {
                        Iterator<DioFile> it = collection.iterator();
                        while (it.hasNext()) {
                            n nVar = qVar.b;
                            nVar.a(String.format("var a = document.createElement('script');\na.src = '%s'; a.async = %s;document.body.appendChild(a);", "mtlocalfile://" + it.next().h(), Boolean.FALSE), valueCallback);
                        }
                        return;
                    }
                    qVar.b.a(com.meituan.msc.modules.service.g.a(collection, qVar.U_(), valueCallback), valueCallback);
                }
            }
        };
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34530b523509eee772894a0dc6d25f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34530b523509eee772894a0dc6d25f2d");
        } else {
            com.meituan.msc.modules.reporter.g.d(this.d, str);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a369ae4b6e8c5b74a553325bfd1bd624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a369ae4b6e8c5b74a553325bfd1bd624");
        } else {
            this.c.getPerfEventRecorder().c(str);
        }
    }

    @MSCMethod(isSync = true)
    public void onFirstRender() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e000864836774b50c82fa0fe79936c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e000864836774b50c82fa0fe79936c");
            return;
        }
        b("onFirstRender");
        a("onFirstRender");
        this.c.f().c("first.render");
        this.c.a((HashMap<String, Object>) null);
    }

    @MSCMethod(isSync = true)
    public void sendInitialData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb65026711e8a4c86d304c3187dba9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb65026711e8a4c86d304c3187dba9d");
            return;
        }
        a("sendInitialData");
        com.meituan.msc.common.framework.c.a().e.a("native_received_first_data_from_service");
        this.c.e(str);
        WebViewMethods.a(this.b, str);
    }

    @MSCMethod(isSync = true)
    public void onPageInteractive() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8727d8813d903e50bd31b435e0323158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8727d8813d903e50bd31b435e0323158");
        } else {
            a("onPageInteractive");
        }
    }

    @MSCMethod(isSync = true)
    public void onFirstScript() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fdf449b3c9f697dac4cf9dba16d30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fdf449b3c9f697dac4cf9dba16d30b");
            return;
        }
        b("onFirstScript");
        a("onFirstScript");
        this.c.y();
        this.c.f().c("first.script");
    }

    @MSCMethod(isSync = true)
    public void onFirstScreen(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd70c9c0b1c3a7c6f5c730e9a8df32f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd70c9c0b1c3a7c6f5c730e9a8df32f5");
            return;
        }
        a("onFirstScreen");
        int j2 = this.c.j();
        com.meituan.msc.modules.container.p e = U_().b().e(j2);
        if (e != null) {
            e.a(j, j2);
        } else {
            a("onPageFirstScreen: containerDelegate is null.");
        }
    }

    @MSCMethod(isSync = true)
    public void invokeWebViewModule(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e31774e47e8ef1ef7a383c38b48546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e31774e47e8ef1ef7a383c38b48546");
        } else if (this.b != null) {
            this.b.a(str, str2, new LazyParseJSONArray(str3));
        } else {
            throw new RuntimeException("invokeWebViewModule without handler" + str + str2);
        }
    }

    @MSCMethod(isSync = true)
    public void onSinkModeHotZone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ef576e5434596f16419807dc1d9f3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ef576e5434596f16419807dc1d9f3a");
            return;
        }
        a("onSinkModeHotZone");
        e eVar = this.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = e.y;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "df47c1079c3e0a5ea2af9695c31d0ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "df47c1079c3e0a5ea2af9695c31d0ff7");
        } else if (eVar.B.c != null) {
            eVar.B.c.a(str);
        } else {
            eVar.C = str;
        }
    }

    @MSCMethod(isSync = true)
    public String importScripts(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4803e81db2b3506edf0b4f62425e7082", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4803e81db2b3506edf0b4f62425e7082");
        }
        a("importScripts");
        return com.meituan.msc.modules.service.g.a(ab.a(jSONArray), str, U_(), this.e);
    }

    @MSCMethod
    public void reportException(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5068af288b663c1d0d7c0ed8f88bf81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5068af288b663c1d0d7c0ed8f88bf81e");
            return;
        }
        a("reportException");
        if (jSONObject == null) {
            return;
        }
        if (com.meituan.msc.modules.exception.b.a(jSONObject)) {
            e eVar = this.c;
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = e.y;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "d5215fd9ccf4c29132df673b290021a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "d5215fd9ccf4c29132df673b290021a8");
            } else if (eVar.D != null) {
                eVar.D.a(new com.meituan.msc.modules.manager.p(jSONObject.optString("message")));
            }
        }
        ((com.meituan.msc.modules.exception.a) c(com.meituan.msc.modules.exception.a.class)).a(jSONObject, this.o instanceof com.meituan.msc.modules.page.e ? (com.meituan.msc.modules.page.e) this.o : null);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9453bcf61aa6920b8f70250c281e5ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9453bcf61aa6920b8f70250c281e5ac0");
        } else {
            super.L_();
        }
    }
}
