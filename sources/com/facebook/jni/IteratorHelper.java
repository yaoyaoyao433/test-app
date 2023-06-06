package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Iterator;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class IteratorHelper {
    @DoNotStrip
    @Nullable
    private Object mElement;
    private final Iterator mIterator;

    @DoNotStrip
    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    @DoNotStrip
    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    @DoNotStrip
    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
