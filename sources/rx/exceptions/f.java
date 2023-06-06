package rx.exceptions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public f(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
