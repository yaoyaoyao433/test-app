package com.sankuai.waimai.platform.net.service;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends i.a {
    public static ChangeQuickRedirect a;
    private final Gson b;
    private final com.sankuai.meituan.retrofit2.converter.gson.a c;

    public b(Gson gson) {
        Object[] objArr = {gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9dd1d0f2c13abafd528b7f4fdbfa92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9dd1d0f2c13abafd528b7f4fdbfa92");
            return;
        }
        this.b = gson;
        this.c = com.sankuai.meituan.retrofit2.converter.gson.a.a(gson);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78b7a0c4c79f60d7ce827d2862eb441", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78b7a0c4c79f60d7ce827d2862eb441") : new a(this.b.getAdapter(TypeToken.get(type)), this.c.a(type, annotationArr, arVar));
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c756ba1b3c7f06d8f78b73d5460bb23", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c756ba1b3c7f06d8f78b73d5460bb23") : this.c.a(type, annotationArr, annotationArr2, arVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a<T> implements i<ap, T> {
        public static ChangeQuickRedirect a;
        private final TypeAdapter<T> b;
        private final i<ap, T> c;

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* synthetic */ Object a(ap apVar) throws IOException {
            ap apVar2 = apVar;
            Object[] objArr = {apVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08db105fb01262675020ae9e7299aea1", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08db105fb01262675020ae9e7299aea1");
            }
            if (apVar2 instanceof com.sankuai.waimai.platform.cache.a) {
                com.sankuai.waimai.platform.cache.a aVar = (com.sankuai.waimai.platform.cache.a) apVar2;
                if (aVar.b != null) {
                    return this.b.fromJsonTree(aVar.b);
                }
            }
            return this.c.a(apVar2);
        }

        public a(TypeAdapter<T> typeAdapter, i<ap, ?> iVar) {
            Object[] objArr = {typeAdapter, iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9d019841b49fd16b238fff7b6b0688", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9d019841b49fd16b238fff7b6b0688");
                return;
            }
            this.b = typeAdapter;
            this.c = iVar;
        }
    }
}
