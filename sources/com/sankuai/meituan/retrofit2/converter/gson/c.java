package com.sankuai.meituan.retrofit2.converter.gson;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c<T> implements i<ap, T> {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson e;
    private final TypeAdapter<T> f;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        Object[] objArr = {gson, typeAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc7b3342977cd8ef1b3a2f8d9ab750f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc7b3342977cd8ef1b3a2f8d9ab750f");
            return;
        }
        this.e = gson;
        this.f = typeAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    public T a(ap apVar) throws IOException {
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0ac668284668c506dd499ae6b3c767", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0ac668284668c506dd499ae6b3c767");
        }
        InputStream source = apVar.source();
        try {
            return this.f.read(this.e.newJsonReader(new InputStreamReader(source, a(apVar.contentType()))));
        } finally {
            try {
                source.close();
            } catch (Throwable unused) {
            }
            apVar.close();
        }
    }

    private Charset a(String str) {
        String group;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28919a938643ea3d4a8da3c010cbd600", 6917529027641081856L)) {
            return (Charset) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28919a938643ea3d4a8da3c010cbd600");
        }
        if (str == null || str.isEmpty()) {
            return d;
        }
        Matcher matcher = b.matcher(str);
        if (matcher.lookingAt()) {
            matcher.group(1);
            matcher.group(2);
            String str2 = null;
            Matcher matcher2 = c.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return d;
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
            return TextUtils.isEmpty(str2) ? d : Charset.forName(str2);
        }
        return d;
    }
}
