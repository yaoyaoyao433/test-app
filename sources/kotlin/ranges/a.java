package kotlin.ranges;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.metrics.common.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", Constants.SPEED_METER_STEP, "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", DMKeys.KEY_IS_EMPTY, "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public class a implements Iterable<Character>, kotlin.jvm.internal.markers.a {
    public static final C1533a c = new C1533a(null);
    final char a;
    final char b;
    private final int d = 1;

    public a(char c2, char c3, int i) {
        this.a = c2;
        this.b = (char) kotlin.internal.d.a(c2, c3, 1);
    }

    public boolean a() {
        return this.d > 0 ? this.a > this.b : this.a < this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            if (a() && ((a) obj).a()) {
                return true;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.d == aVar.d;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.d > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.d;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", Constants.SPEED_METER_STEP, "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    /* renamed from: kotlin.ranges.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1533a {
        private C1533a() {
        }

        public /* synthetic */ C1533a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Character> iterator() {
        return new b(this.a, this.b, this.d);
    }
}
