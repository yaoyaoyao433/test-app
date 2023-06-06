package com.meituan.passport.converter;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.Mop;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g<T> implements com.sankuai.meituan.retrofit2.i<ap, T> {
    public static ChangeQuickRedirect b;
    protected final Gson c;
    protected final TypeAdapter<T> d;
    protected final Type e;
    protected final JsonParser f;
    private static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Charset h = Charset.forName("UTF-8");

    public g(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        Object[] objArr = {gson, typeAdapter, type};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f15bec50063cf5e3981f13b8544462b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f15bec50063cf5e3981f13b8544462b7");
            return;
        }
        this.f = new JsonParser();
        this.c = gson;
        this.d = typeAdapter;
        this.e = type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.meituan.retrofit2.i
    public T a(ap apVar) throws IOException {
        InputStreamReader inputStreamReader;
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af174f35bbefab4edb2bf8d1d6aee7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af174f35bbefab4edb2bf8d1d6aee7c");
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(apVar.source(), a(apVar.contentType()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            T a2 = a(this.f.parse(inputStreamReader));
            com.meituan.passport.utils.i.a(inputStreamReader);
            return a2;
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader2 = inputStreamReader;
            com.meituan.passport.utils.i.a(inputStreamReader2);
            throw th;
        }
    }

    public T a(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32779fdbaf945311eb2d14679917779", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32779fdbaf945311eb2d14679917779");
        }
        if (!jsonElement.isJsonObject()) {
            throw new IOException("Parse exception converting JSON to object", new JsonParseException("Root is not JsonObject"));
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("error") && asJsonObject.get("error").isJsonObject()) {
            b(asJsonObject.get("error"));
            throw new IOException("Fail to get data");
        }
        JsonElement jsonElement2 = asJsonObject.get(User.class.equals(this.e) ? "user" : "data");
        if (jsonElement2 == null) {
            throw new IOException("there are not data element");
        }
        if (YodaResult.class.equals(this.e)) {
            return (T) this.c.fromJson(jsonElement, this.e);
        }
        if (Mop.class.equals(this.e)) {
            return (T) this.c.fromJson(asJsonObject, this.e);
        }
        return (T) this.c.fromJson(jsonElement2, this.e);
    }

    public void b(JsonElement jsonElement) throws ApiException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3462989da64d76631bd87b5600f53d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3462989da64d76631bd87b5600f53d4e");
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has("data") && asJsonObject.get("data") != null) {
                throw new ApiException(asJsonObject.get("message").getAsString(), asJsonObject.get("code").getAsInt(), asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "", asJsonObject.get("data").toString());
            }
            throw new ApiException(asJsonObject.get("message").getAsString(), asJsonObject.get("code").getAsInt(), asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "", asJsonObject.toString());
        }
    }

    private Charset a(String str) {
        String group;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bace59df8082b127a28003c382573806", RobustBitConfig.DEFAULT_VALUE)) {
            return (Charset) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bace59df8082b127a28003c382573806");
        }
        if (str == null || str.isEmpty()) {
            return h;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.lookingAt()) {
            String str2 = null;
            Matcher matcher2 = g.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return h;
                }
                String group2 = matcher2.group(1);
                if (group2 != null && group2.equalsIgnoreCase("charset")) {
                    if (matcher2.group(2) != null) {
                        group = matcher2.group(2);
                    } else {
                        group = matcher2.group(3);
                    }
                    if (str2 != null && !group.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("Multiple different charsets: " + str);
                    }
                    str2 = group;
                }
            }
            return TextUtils.isEmpty(str2) ? h : Charset.forName(str2);
        }
        return h;
    }
}
