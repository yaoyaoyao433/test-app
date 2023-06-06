package com.sankuai.meituan.retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b<T> implements i<T, ak> {
    public static ChangeQuickRedirect a;
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final TypeAdapter<T> d;

    @Override // com.sankuai.meituan.retrofit2.i
    public final /* synthetic */ ak a(Object obj) throws IOException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168e99c672317b0977891b0b7559a568", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168e99c672317b0977891b0b7559a568");
        }
        okio.c cVar = new okio.c();
        JsonWriter newJsonWriter = this.c.newJsonWriter(new OutputStreamWriter(cVar.b(), b));
        this.d.write(newJsonWriter, obj);
        newJsonWriter.close();
        return al.a(cVar.o().i(), "application/json; charset=UTF-8");
    }

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        Object[] objArr = {gson, typeAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6954575db6510dd63a8f6c118c7dbb69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6954575db6510dd63a8f6c118c7dbb69");
            return;
        }
        this.c = gson;
        this.d = typeAdapter;
    }
}
