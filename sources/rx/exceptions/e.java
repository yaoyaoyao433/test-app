package rx.exceptions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e extends RuntimeException {
    private static final long serialVersionUID = -419289748403337611L;

    public e(String str, Throwable th) {
        super(str, th);
    }

    public e(Throwable th) {
        super(th.getMessage(), th);
    }
}
