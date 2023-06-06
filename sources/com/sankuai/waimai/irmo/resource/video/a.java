package com.sankuai.waimai.irmo.resource.video;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.waimai.irmo.mach.c;
import com.sankuai.waimai.irmo.mach.vap.e;
import com.sankuai.waimai.irmo.render.load.IrmoResDownloader;
import com.sankuai.waimai.irmo.resource.bean.IrmoResource;
import com.sankuai.waimai.irmo.utils.d;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    File b;
    protected com.sankuai.waimai.irmo.resource.a c;
    protected InterfaceC0978a d;
    protected String e;
    private e f;
    private File g;
    private IrmoResDownloader h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.resource.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0978a {
        void a(int i, Throwable th);

        void a(String str, String str2);
    }

    public static /* synthetic */ File a(a aVar, String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c6444cfce21db3e005fe41450bb8047a", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c6444cfce21db3e005fe41450bb8047a");
        }
        if (aVar.g == null) {
            aVar.g = new File(str);
        }
        if (aVar.g.isDirectory() && aVar.g.listFiles() != null && aVar.g.listFiles().length != 0) {
            for (File file : aVar.g.listFiles()) {
                if (file.getName().endsWith("mp4")) {
                    return file;
                }
            }
            return null;
        }
        aVar.d.a(10006, (Throwable) null);
        return null;
    }

    public static /* synthetic */ void b(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "76e66df9278b72d678f779ca61ae5aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "76e66df9278b72d678f779ca61ae5aa7");
        } else {
            aVar.c.a(str, new com.sankuai.waimai.irmo.resource.api.a() { // from class: com.sankuai.waimai.irmo.resource.video.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.resource.api.a
                public final void a(@Nullable IrmoResource irmoResource) {
                    Object[] objArr2 = {irmoResource};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ffbe2fc3d8974553922e9dc87a9645b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ffbe2fc3d8974553922e9dc87a9645b");
                        return;
                    }
                    String str2 = null;
                    if (irmoResource != null && !TextUtils.isEmpty(irmoResource.rootPath)) {
                        a aVar2 = a.this;
                        File a2 = a.a(a.this, irmoResource.rootPath);
                        aVar2.b = a2;
                        if (a2 != null) {
                            if (!TextUtils.isEmpty(a.this.e)) {
                                str2 = irmoResource.rootPath + "/" + a.this.e;
                            }
                            a.this.d.a(a.this.b.getAbsolutePath(), str2);
                            return;
                        }
                    }
                    a.this.d.a(10006, (Throwable) null);
                }

                @Override // com.sankuai.waimai.irmo.resource.api.a
                public final void a(int i, @Nullable Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fce5d41e3482bbc39a3624c5a8281c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fce5d41e3482bbc39a3624c5a8281c4");
                    } else {
                        a.this.d.a(i, exc);
                    }
                }
            });
        }
    }

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7292ae552f85b57ccb73cef777569c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7292ae552f85b57ccb73cef777569c");
            return;
        }
        this.c = com.sankuai.waimai.irmo.resource.a.a();
        this.h = new IrmoResDownloader();
        this.f = eVar;
    }

    public final void a(InterfaceC0978a interfaceC0978a) {
        Object[] objArr = {interfaceC0978a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a03a9b37d1b0c5ccc12a52a78ac35e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a03a9b37d1b0c5ccc12a52a78ac35e2");
            return;
        }
        this.d = interfaceC0978a;
        if (this.f == null || this.f.l == null) {
            this.d.a(10007, (Throwable) null);
            return;
        }
        final String str = this.f.l;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27288d63226e656a269a2eba58eaef94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27288d63226e656a269a2eba58eaef94");
        } else {
            this.h.a(str, 0, new IrmoResDownloader.a() { // from class: com.sankuai.waimai.irmo.resource.video.a.2
                public static ChangeQuickRedirect a;
                public long b = SystemClock.elapsedRealtime();

                @Override // com.sankuai.waimai.irmo.render.load.IrmoResDownloader.a
                public final void a(@NonNull File file) {
                    Object[] objArr3 = {file};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "095c80b8caa77bbedcfb0702f4e37b38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "095c80b8caa77bbedcfb0702f4e37b38");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(FileUtils.readFile(file));
                        String valueOf = String.valueOf(jSONObject.get("asset_bundle_id"));
                        a.this.e = a.this.a(jSONObject);
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
                        float f = (float) elapsedRealtime;
                        String str2 = str;
                        Object[] objArr4 = {Float.valueOf(f), str2, "1000"};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "5075581f94858d3b5fcfb30aad03ee28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "5075581f94858d3b5fcfb30aad03ee28");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("EffectDslParseTime", Float.valueOf(f));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("url", str2);
                            hashMap2.put("effectType", "1000");
                            c.a(hashMap, hashMap2);
                        }
                        if (!TextUtils.isEmpty(valueOf)) {
                            d.e("DSL 解析耗时: " + elapsedRealtime + " ,加载的 bundleId: " + valueOf, new Object[0]);
                            a.b(a.this, valueOf);
                            return;
                        }
                        a.this.d.a(10001, (Throwable) null);
                    } catch (Exception e) {
                        a.this.d.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, e);
                    }
                }

                @Override // com.sankuai.waimai.irmo.render.load.IrmoResDownloader.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd3e4507b1a544d92d1162d2356d3113", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd3e4507b1a544d92d1162d2356d3113");
                    } else {
                        a.this.d.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT, (Throwable) null);
                    }
                }
            });
        }
    }

    String a(JSONObject jSONObject) {
        JSONArray jSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171b20c7d96e6ca8f960128feae23964", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171b20c7d96e6ca8f960128feae23964");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONArray = jSONObject.getJSONArray("layers");
        } catch (Exception e) {
            e.printStackTrace();
            d.e("getFirstFramePath-exception:" + e.getMessage(), new Object[0]);
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) jSONArray.get(0);
        if (jSONObject2.getInt("type") != 1000) {
            return null;
        }
        String string = ((JSONObject) jSONObject2.get("effect_params")).getString("first_frame_ass_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(APKStructure.Assets_Type);
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i);
            if (string.equals(jSONObject3.get("id"))) {
                return jSONObject3.getString("path");
            }
        }
        return null;
    }
}
