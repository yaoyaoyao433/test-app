package com.meituan.android.neohybrid.v2.neo.recce;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.neohybrid.v2.neo.a {
    public static ChangeQuickRedirect d;
    boolean e;
    String f;

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "recce_plugin";
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7cd778a3c6eeb2e880d461ce31d49fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7cd778a3c6eeb2e880d461ce31d49fb");
            return;
        }
        com.meituan.android.neohybrid.v2.core.a i = i();
        if (i != null) {
            i.a(str);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void b() {
        KernelConfig kernelConfig;
        String kernelType;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2453fb71d28c5d031e17ef38e9ba758b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2453fb71d28c5d031e17ef38e9ba758b");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c20c24e1a85417b00fe34ef2924ee52", RobustBitConfig.DEFAULT_VALUE)) {
            kernelType = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c20c24e1a85417b00fe34ef2924ee52");
        } else {
            NeoConfig j = j();
            kernelType = (j == null || (kernelConfig = j.kernelConfig()) == null) ? null : kernelConfig.getKernelType();
        }
        if (TextUtils.equals(kernelType, KernelConfig.KERNEL_TYPE_RECCE)) {
            com.meituan.android.neohybrid.v2.neo.recce.a.a(i(), "neo_create", new HashMap());
            NeoConfig j2 = j();
            String url = j2 != null ? j2.getUrl() : null;
            if (TextUtils.isEmpty(url)) {
                a("neo config url is empty");
                return;
            }
            Uri parse = Uri.parse(url);
            String path = parse.getPath();
            String str = "";
            if (path != null && path.length() > 1 && path.startsWith(File.separator)) {
                str = path.substring(1);
            }
            if (TextUtils.isEmpty(str)) {
                a("resourceName is empty");
                return;
            } else {
                g.a(this.b, str, parse.getQueryParameter("default_wasm_version"), new a(this, url));
                return;
            }
        }
        this.c = true;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(@Nullable Bundle bundle) {
        com.meituan.android.neohybrid.v2.core.a i;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6985a33f1da34cc71c2c1979ed1dbc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6985a33f1da34cc71c2c1979ed1dbc5");
            return;
        }
        super.a(bundle);
        this.e = true;
        if (TextUtils.isEmpty(this.f) || (i = i()) == null) {
            return;
        }
        i.c(this.f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements g.d {
        public static ChangeQuickRedirect a;
        private WeakReference<b> b;
        private String c;

        public a(b bVar, String str) {
            Object[] objArr = {bVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1459abac68c52c4d0be44bf2d6a8bf3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1459abac68c52c4d0be44bf2d6a8bf3e");
                return;
            }
            this.b = new WeakReference<>(bVar);
            this.c = str;
        }

        @Override // com.meituan.android.neohybrid.v2.neo.offline.g.d
        public final void a(String str, g.c cVar) {
            Object[] objArr = {str, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5808d47ef98b4fc77177c2af7a53ddf3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5808d47ef98b4fc77177c2af7a53ddf3");
                return;
            }
            new StringBuilder("ResourceReadyCallback onResourceReady ").append(str);
            c.a("RC: offline " + cVar, 3, new String[]{"Recce-Android"});
            b bVar = this.b.get();
            if (bVar == null) {
                c.a("ResourceReadyCallback: onResourceReady reccePlugin is null", 3, new String[]{"Recce-Android"});
            } else if (!TextUtils.isEmpty(str) && FileUtils.isFileExist(str)) {
                Uri parse = Uri.parse(this.c);
                String path = parse.getPath();
                if (path != null && path.length() > 1 && path.startsWith(File.separator)) {
                    path = path.substring(1);
                }
                com.meituan.android.neohybrid.v2.neo.recce.a.a(bVar.i(), "one_click_pay_wasai_ddd_ready", new HashMap());
                Uri build = parse.buildUpon().path(str).appendQueryParameter("wasm_version", g.b(str)).appendQueryParameter("bundle_name", path).build();
                com.meituan.android.neohybrid.v2.neo.report.a.a(bVar.i(), "wasm_version", g.b(str));
                String uri = build.toString();
                Object[] objArr2 = {uri};
                ChangeQuickRedirect changeQuickRedirect2 = b.d;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a0b15c275f859309e37619df8d8dfa5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a0b15c275f859309e37619df8d8dfa5f");
                    return;
                }
                new StringBuilder("ReccePlugin loadUrl ").append(uri);
                HashMap hashMap = new HashMap();
                hashMap.put("url", uri);
                com.meituan.android.neohybrid.v2.neo.recce.a.a(bVar.i(), "recce_init_succ", hashMap);
                com.meituan.android.neohybrid.v2.core.a i = bVar.i();
                if (i != null) {
                    if (bVar.e) {
                        i.c(uri);
                    } else {
                        bVar.f = uri;
                    }
                }
            } else {
                bVar.a("path is null");
            }
        }

        @Override // com.meituan.android.neohybrid.v2.neo.offline.g.d
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae4482ff8bebfd06a4862272771cedf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae4482ff8bebfd06a4862272771cedf");
                return;
            }
            Log.e("Recce-Android", "ResourceReadyCallback onResourceError " + str);
            b bVar = this.b.get();
            if (bVar == null) {
                c.a("ResourceReadyCallback: onResourceError reccePlugin is null", 3, new String[]{"Recce-Android"});
            } else {
                bVar.a(str);
            }
        }
    }
}
