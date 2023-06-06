package kotlin.text;

import com.meituan.robust.common.CommonConstant;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class d {
    @JvmField
    @NotNull
    public static final Charset a;
    @JvmField
    @NotNull
    public static final Charset b;
    @JvmField
    @NotNull
    public static final Charset c;
    @JvmField
    @NotNull
    public static final Charset d;
    @JvmField
    @NotNull
    public static final Charset e;
    @JvmField
    @NotNull
    public static final Charset f;
    public static final d g = new d();

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.h.a((Object) forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.h.a((Object) forName2, "Charset.forName(\"UTF-16\")");
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.h.a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.h.a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.h.a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        e = forName5;
        Charset forName6 = Charset.forName(CommonConstant.Encoding.ISO88591);
        kotlin.jvm.internal.h.a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f = forName6;
    }

    private d() {
    }
}
