package retrofit;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ErrorHandler {
    public static final ErrorHandler DEFAULT = new ErrorHandler() { // from class: retrofit.ErrorHandler.1
        @Override // retrofit.ErrorHandler
        public final Throwable handleError(RetrofitError retrofitError) {
            return retrofitError;
        }
    };

    Throwable handleError(RetrofitError retrofitError);
}
