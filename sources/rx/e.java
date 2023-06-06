package rx;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface e<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
