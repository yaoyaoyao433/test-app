package com.sankuai.waimai.alita.core.datadownload.net;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import java.lang.reflect.Type;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public ar b;
    private Gson d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull com.sankuai.waimai.alita.core.datadownload.net.a aVar);

        void a(@Nullable Throwable th);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d0fb4faf221ecc9eb2434f12eac39ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d0fb4faf221ecc9eb2434f12eac39ec");
        }
        if (c == null) {
            synchronized (com.sankuai.waimai.alita.core.dataupload.b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public b() {
        Gson create;
        ar a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f705ffa7ebb6cece1b29781867f1efe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f705ffa7ebb6cece1b29781867f1efe");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7de057dc8460bb1bb9fd09a404e513b3", RobustBitConfig.DEFAULT_VALUE)) {
            create = (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7de057dc8460bb1bb9fd09a404e513b3");
        } else {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(com.sankuai.waimai.alita.core.datadownload.net.a.class, new JsonDeserializer<com.sankuai.waimai.alita.core.datadownload.net.a>() { // from class: com.sankuai.waimai.alita.core.datadownload.net.AlitaDataDownloadHelper$2
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.google.gson.JsonDeserializer
                /* renamed from: a */
                public a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    Object[] objArr3 = {jsonElement, type, jsonDeserializationContext};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96e5b730a54b3a9da50bd3645493463f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96e5b730a54b3a9da50bd3645493463f");
                    }
                    try {
                        return a.a(new JSONObject(jsonElement.getAsJsonObject().toString()));
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            create = gsonBuilder.create();
        }
        this.d = create;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a6669a07686a92ee493378ece29cff3", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ar) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a6669a07686a92ee493378ece29cff3");
        } else {
            a2 = new ar.a().a(com.sankuai.waimai.alita.platform.debug.a.a().d() ? "http://waimai-openapi.apigw.st.sankuai.com/" : "https://alita.waimai.meituan.com/").a(f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(this.d)).a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a()).a();
        }
        this.b = a2;
    }
}
