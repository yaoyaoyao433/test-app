package com.meituan.android.recce.shark;

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
public final class m<T> implements com.sankuai.meituan.retrofit2.i<T, ak> {
    public static ChangeQuickRedirect a;
    private static final Charset b = Charset.forName("UTF-8");
    private final TypeAdapter<T> c;

    @Override // com.sankuai.meituan.retrofit2.i
    public final /* synthetic */ ak a(Object obj) throws IOException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d246a697928475b5b32b06943eba14eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d246a697928475b5b32b06943eba14eb");
        }
        okio.c cVar = new okio.c();
        JsonWriter newJsonWriter = g.a().newJsonWriter(new OutputStreamWriter(cVar.b(), b));
        this.c.write(newJsonWriter, obj);
        newJsonWriter.close();
        return al.a(cVar.o().i(), "application/json; charset=UTF-8");
    }

    public m(TypeAdapter<T> typeAdapter) {
        Object[] objArr = {typeAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26292ca35b7d9010aab67ad295d47900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26292ca35b7d9010aab67ad295d47900");
        } else {
            this.c = typeAdapter;
        }
    }
}
