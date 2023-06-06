package com.meituan.android.neohybrid.v2.neo.http.converter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b<T> implements i<T, ak> {
    public static ChangeQuickRedirect a;
    private static final Charset b = Charset.forName("UTF-8");
    private final TypeAdapter<T> c;

    @Override // com.sankuai.meituan.retrofit2.i
    public final /* synthetic */ ak a(Object obj) throws IOException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc030da0ceacbf92e32eb8a2115ea8f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc030da0ceacbf92e32eb8a2115ea8f4");
        }
        okio.c cVar = new okio.c();
        JsonWriter newJsonWriter = n.a().newJsonWriter(new OutputStreamWriter(cVar.b(), b));
        this.c.write(newJsonWriter, obj);
        newJsonWriter.close();
        return al.a(cVar.o().i(), "application/json; charset=UTF-8");
    }

    public b(TypeAdapter<T> typeAdapter) {
        Object[] objArr = {typeAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b241ae04c2eae66049bf0697d3085dd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b241ae04c2eae66049bf0697d3085dd7");
        } else {
            this.c = typeAdapter;
        }
    }
}
