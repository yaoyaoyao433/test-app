package android.support.v4.util;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        int length = this.mElements.length;
        int i = length - this.mHead;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr = new Object[i2];
        System.arraycopy(this.mElements, this.mHead, objArr, 0, i);
        System.arraycopy(this.mElements, 0, objArr, i, this.mHead);
        this.mElements = (E[]) objArr;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i2 - 1;
    }

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.mCapacityBitmask = i - 1;
        this.mElements = (E[]) new Object[i];
    }

    public final void addFirst(E e) {
        this.mHead = (this.mHead - 1) & this.mCapacityBitmask;
        this.mElements[this.mHead] = e;
        if (this.mHead == this.mTail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e) {
        this.mElements[this.mTail] = e;
        this.mTail = (this.mTail + 1) & this.mCapacityBitmask;
        if (this.mTail == this.mHead) {
            doubleCapacity();
        }
    }

    public final E popFirst() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.mElements[this.mHead];
        this.mElements[this.mHead] = null;
        this.mHead = (this.mHead + 1) & this.mCapacityBitmask;
        return e;
    }

    public final E popLast() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = (this.mTail - 1) & this.mCapacityBitmask;
        E e = this.mElements[i];
        this.mElements[i] = null;
        this.mTail = i;
        return e;
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.mElements.length;
        if (i < length - this.mHead) {
            length = this.mHead + i;
        }
        for (int i2 = this.mHead; i2 < length; i2++) {
            this.mElements[i2] = null;
        }
        int i3 = length - this.mHead;
        int i4 = i - i3;
        this.mHead = this.mCapacityBitmask & (this.mHead + i3);
        if (i4 > 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                this.mElements[i5] = null;
            }
            this.mHead = i4;
        }
    }

    public final void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i < this.mTail ? this.mTail - i : 0;
        for (int i3 = i2; i3 < this.mTail; i3++) {
            this.mElements[i3] = null;
        }
        int i4 = this.mTail - i2;
        int i5 = i - i4;
        this.mTail -= i4;
        if (i5 > 0) {
            this.mTail = this.mElements.length;
            int i6 = this.mTail - i5;
            for (int i7 = i6; i7 < this.mTail; i7++) {
                this.mElements[i7] = null;
            }
            this.mTail = i6;
        }
    }

    public final E getFirst() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mHead];
    }

    public final E getLast() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(this.mTail - 1) & this.mCapacityBitmask];
    }

    public final E get(int i) {
        if (i < 0 || i >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i)];
    }

    public final int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }

    public final boolean isEmpty() {
        return this.mHead == this.mTail;
    }
}
