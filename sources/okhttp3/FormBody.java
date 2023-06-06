package okhttp3;

import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.c;
import okio.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(d dVar) throws IOException {
        writeOrCountBytes(dVar, false);
    }

    private long writeOrCountBytes(@Nullable d dVar, boolean z) {
        c a;
        if (z) {
            a = new c();
        } else {
            a = dVar.a();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a.h(38);
            }
            a.b(this.encodedNames.get(i));
            a.h(61);
            a.b(this.encodedValues.get(i));
        }
        if (z) {
            long j = a.b;
            a.s();
            return j;
        }
        return 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset;
        }

        public final Builder add(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final Builder addEncoded(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }
}
