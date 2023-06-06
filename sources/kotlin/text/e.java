package kotlin.text;

import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", TensorConfig.KEY_INPUT_ARRAY, "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class e implements kotlin.sequences.a<kotlin.ranges.f> {
    final CharSequence a;
    final int b;
    final int c;
    final kotlin.jvm.functions.c<CharSequence, Integer, kotlin.k<Integer, Integer>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull CharSequence charSequence, int i, int i2, @NotNull kotlin.jvm.functions.c<? super CharSequence, ? super Integer, kotlin.k<Integer, Integer>> cVar) {
        kotlin.jvm.internal.h.b(charSequence, TensorConfig.KEY_INPUT_ARRAY);
        kotlin.jvm.internal.h.b(cVar, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = cVar;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Iterator<kotlin.ranges.f>, kotlin.jvm.internal.markers.a {
        private int b = -1;
        private int c;
        private int d;
        @Nullable
        private kotlin.ranges.f e;
        private int f;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a() {
            int i = e.this.b;
            int length = e.this.a.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.c = i;
                this.d = this.c;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0" + CommonConstant.Symbol.DOT_CHAR);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r7.f < r7.a.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r7 = this;
                int r0 = r7.d
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.b = r1
                r0 = 0
                r7.e = r0
                return
            Lb:
                kotlin.text.e r0 = kotlin.text.e.this
                int r0 = r0.c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L20
                int r0 = r7.f
                int r0 = r0 + r3
                r7.f = r0
                int r0 = r7.f
                kotlin.text.e r4 = kotlin.text.e.this
                int r4 = r4.c
                if (r0 >= r4) goto L2c
            L20:
                int r0 = r7.d
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = r4.a
                int r4 = r4.length()
                if (r0 <= r4) goto L40
            L2c:
                int r0 = r7.c
                kotlin.ranges.f r1 = new kotlin.ranges.f
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = r4.a
                int r4 = kotlin.text.g.c(r4)
                r1.<init>(r0, r4)
                r7.e = r1
                r7.d = r2
                goto L9c
            L40:
                kotlin.text.e r0 = kotlin.text.e.this
                kotlin.jvm.functions.c<java.lang.CharSequence, java.lang.Integer, kotlin.k<java.lang.Integer, java.lang.Integer>> r0 = r0.d
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = r4.a
                int r5 = r7.d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.k r0 = (kotlin.k) r0
                if (r0 != 0) goto L6a
                int r0 = r7.c
                kotlin.ranges.f r1 = new kotlin.ranges.f
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = r4.a
                int r4 = kotlin.text.g.c(r4)
                r1.<init>(r0, r4)
                r7.e = r1
                r7.d = r2
                goto L9c
            L6a:
                A r2 = r0.a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r7.c
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L87
                kotlin.ranges.f$a r4 = kotlin.ranges.f.e
                kotlin.ranges.f r4 = kotlin.ranges.f.b()
                goto L8f
            L87:
                kotlin.ranges.f r5 = new kotlin.ranges.f
                int r6 = r2 + (-1)
                r5.<init>(r4, r6)
                r4 = r5
            L8f:
                r7.e = r4
                int r2 = r2 + r0
                r7.c = r2
                int r2 = r7.c
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r7.d = r2
            L9c:
                r7.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.e.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ kotlin.ranges.f next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            kotlin.ranges.f fVar = this.e;
            if (fVar == null) {
                throw new kotlin.o("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.e = null;
            this.b = -1;
            return fVar;
        }
    }

    @Override // kotlin.sequences.a
    @NotNull
    public final Iterator<kotlin.ranges.f> a() {
        return new a();
    }
}
