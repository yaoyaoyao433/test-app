package com.meituan.android.turbo.converter;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a83779863cc35c6d83826a13fea0202", 6917529027641081856L)) {
            throw new UnsupportedOperationException("This method does not support.");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a83779863cc35c6d83826a13fea0202");
    }

    public <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67f4b2d299a9b5ec63630cfdc86ca7c", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67f4b2d299a9b5ec63630cfdc86ca7c");
        }
        throw new UnsupportedOperationException("This method does not support.");
    }

    public <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b22bc4762c0eb7fe55c582ea731b5ffb", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b22bc4762c0eb7fe55c582ea731b5ffb");
        }
        throw new UnsupportedOperationException("This method does not support.");
    }
}
