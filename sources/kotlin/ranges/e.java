package kotlin.ranges;

import com.meituan.metrics.common.Constants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.u;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", Constants.SPEED_METER_STEP, "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class e extends u {
    private final int a;
    private boolean b;
    private int c;
    private final int d;

    public e(int i, int i2, int i3) {
        this.d = i3;
        this.a = i2;
        boolean z = false;
        if (this.d <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.b = z;
        this.c = this.b ? i : this.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // kotlin.collections.u
    public final int a() {
        int i = this.c;
        if (i == this.a) {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        } else {
            this.c += this.d;
        }
        return i;
    }
}
