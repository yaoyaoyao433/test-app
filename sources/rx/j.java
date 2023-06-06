package rx;

import rx.internal.util.m;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class j<T> implements e<T>, k {
    private static final long NOT_SET = Long.MIN_VALUE;
    private f producer;
    private long requested;
    private final j<?> subscriber;
    private final m subscriptions;

    public void onStart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j() {
        this(null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(j<?> jVar) {
        this(jVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(j<?> jVar, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = jVar;
        this.subscriptions = (!z || jVar == null) ? new m() : jVar.subscriptions;
    }

    public final void add(k kVar) {
        this.subscriptions.a(kVar);
    }

    @Override // rx.k
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            if (this.producer != null) {
                this.producer.a(j);
                return;
            }
            addToRequested(j);
        }
    }

    private void addToRequested(long j) {
        if (this.requested == NOT_SET) {
            this.requested = j;
            return;
        }
        long j2 = this.requested + j;
        if (j2 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j2;
        }
    }

    public void setProducer(f fVar) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = fVar;
            z = this.subscriber != null && j == NOT_SET;
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET) {
            this.producer.a(Long.MAX_VALUE);
        } else {
            this.producer.a(j);
        }
    }
}
