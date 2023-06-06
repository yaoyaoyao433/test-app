package com.meituan.passport.converter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e<T> implements com.sankuai.meituan.retrofit2.i<T, ak> {
    public static ChangeQuickRedirect a;
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final TypeAdapter<T> d;

    public e(Gson gson, TypeAdapter<T> typeAdapter) {
        Object[] objArr = {gson, typeAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4893deaea0c703a350f28e44c18a5611", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4893deaea0c703a350f28e44c18a5611");
            return;
        }
        this.c = gson;
        this.d = typeAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    /* renamed from: b */
    public ak a(T t) throws IOException {
        JsonWriter jsonWriter;
        OutputStreamWriter outputStreamWriter;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2fe04fa752d22700c9268faa68f54f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2fe04fa752d22700c9268faa68f54f");
        }
        okio.c cVar = new okio.c();
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            outputStreamWriter = new OutputStreamWriter(cVar.b(), b);
            try {
                jsonWriter = this.c.newJsonWriter(outputStreamWriter);
            } catch (Throwable th) {
                th = th;
                jsonWriter = null;
            }
        } catch (Throwable th2) {
            th = th2;
            jsonWriter = null;
        }
        try {
            this.d.write(jsonWriter, t);
            com.meituan.passport.utils.i.a(outputStreamWriter);
            com.meituan.passport.utils.i.a(jsonWriter);
            return al.a(cVar.o().i(), "application/json; charset=UTF-8");
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter2 = outputStreamWriter;
            com.meituan.passport.utils.i.a(outputStreamWriter2);
            com.meituan.passport.utils.i.a(jsonWriter);
            throw th;
        }
    }
}
