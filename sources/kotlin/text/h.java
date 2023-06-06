package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class h {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.b<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.b(str2, "line");
            return str2;
        }
    }

    @NotNull
    public static final String a(@NotNull String str) {
        kotlin.jvm.internal.h.b(str, "$this$trimIndent");
        return g.a(str, "");
    }

    @NotNull
    public static final String a(@NotNull String str, @NotNull String str2) {
        String invoke;
        kotlin.jvm.internal.h.b(str, "$this$replaceIndent");
        kotlin.jvm.internal.h.b(str2, "newIndent");
        List<String> e = g.e(str);
        List<String> list = e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!g.a((CharSequence) ((String) obj))) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.h.a((Iterable) arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(Integer.valueOf(b(str3)));
        }
        Integer num = (Integer) kotlin.collections.h.d((Iterable<? extends Comparable>) arrayList3);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * e.size());
        kotlin.jvm.functions.b<String, String> c = c(str2);
        int a2 = kotlin.collections.h.a((List) e);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == a2) && g.a((CharSequence) str4)) {
                str4 = null;
            } else {
                String b2 = g.b(str4, intValue);
                if (b2 != null && (invoke = c.invoke(b2)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList4.add(str4);
            }
            i = i2;
        }
        String sb = ((StringBuilder) kotlin.collections.h.a(arrayList4, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.h.a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    private static final int b(@NotNull String str) {
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!kotlin.text.a.a(str2.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    private static final kotlin.jvm.functions.b<String, String> c(String str) {
        return str.length() == 0 ? a.a : new b(str);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.b<String, String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.b(str2, "line");
            return this.a + str2;
        }
    }
}
