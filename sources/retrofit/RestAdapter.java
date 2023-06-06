package retrofit;

import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import retrofit.Profiler;
import retrofit.RxSupport;
import retrofit.Utils;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class RestAdapter {
    static final String IDLE_THREAD_NAME = "Retrofit-Idle";
    static final String THREAD_PREFIX = "Retrofit-";
    final Executor callbackExecutor;
    private final Client.Provider clientProvider;
    final Converter converter;
    final ErrorHandler errorHandler;
    final Executor httpExecutor;
    final Log log;
    volatile LogLevel logLevel;
    private final Profiler profiler;
    final RequestInterceptor requestInterceptor;
    private RxSupport rxSupport;
    final Endpoint server;
    private final Map<Class<?>, Map<Method, RestMethodInfo>> serviceMethodInfoCache;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Log {
        public static final Log NONE = new Log() { // from class: retrofit.RestAdapter.Log.1
            @Override // retrofit.RestAdapter.Log
            public final void log(String str) {
            }
        };

        void log(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum LogLevel {
        NONE,
        BASIC,
        HEADERS,
        HEADERS_AND_ARGS,
        FULL;

        public final boolean log() {
            return this != NONE;
        }
    }

    private RestAdapter(Endpoint endpoint, Client.Provider provider, Executor executor, Executor executor2, RequestInterceptor requestInterceptor, Converter converter, Profiler profiler, ErrorHandler errorHandler, Log log, LogLevel logLevel) {
        this.serviceMethodInfoCache = new LinkedHashMap();
        this.server = endpoint;
        this.clientProvider = provider;
        this.httpExecutor = executor;
        this.callbackExecutor = executor2;
        this.requestInterceptor = requestInterceptor;
        this.converter = converter;
        this.profiler = profiler;
        this.errorHandler = errorHandler;
        this.log = log;
        this.logLevel = logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        if (this.logLevel == null) {
            throw new NullPointerException("Log level may not be null.");
        }
        this.logLevel = logLevel;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public <T> T create(Class<T> cls) {
        Utils.validateServiceClass(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RestHandler(getMethodInfoCache(cls)));
    }

    Map<Method, RestMethodInfo> getMethodInfoCache(Class<?> cls) {
        Map<Method, RestMethodInfo> map;
        synchronized (this.serviceMethodInfoCache) {
            map = this.serviceMethodInfoCache.get(cls);
            if (map == null) {
                map = new LinkedHashMap<>();
                this.serviceMethodInfoCache.put(cls, map);
            }
        }
        return map;
    }

    static RestMethodInfo getMethodInfo(Map<Method, RestMethodInfo> map, Method method) {
        RestMethodInfo restMethodInfo;
        synchronized (map) {
            restMethodInfo = map.get(method);
            if (restMethodInfo == null) {
                restMethodInfo = new RestMethodInfo(method);
                map.put(method, restMethodInfo);
            }
        }
        return restMethodInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class RestHandler implements InvocationHandler {
        private final Map<Method, RestMethodInfo> methodDetailsCache;

        RestHandler(Map<Method, RestMethodInfo> map) {
            this.methodDetailsCache = map;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, final Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            final RestMethodInfo methodInfo = RestAdapter.getMethodInfo(this.methodDetailsCache, method);
            if (methodInfo.isSynchronous) {
                try {
                    return invokeRequest(RestAdapter.this.requestInterceptor, methodInfo, objArr);
                } catch (RetrofitError e) {
                    Throwable handleError = RestAdapter.this.errorHandler.handleError(e);
                    if (handleError == null) {
                        throw new IllegalStateException("Error handler returned null for wrapped exception.", e);
                    }
                    throw handleError;
                }
            } else if (RestAdapter.this.httpExecutor == null || RestAdapter.this.callbackExecutor == null) {
                throw new IllegalStateException("Asynchronous invocation requires calling setExecutors.");
            } else {
                if (methodInfo.isObservable) {
                    if (RestAdapter.this.rxSupport == null) {
                        if (Platform.HAS_RX_JAVA) {
                            RestAdapter.this.rxSupport = new RxSupport(RestAdapter.this.httpExecutor, RestAdapter.this.errorHandler, RestAdapter.this.requestInterceptor);
                        } else {
                            throw new IllegalStateException("Observable method found but no RxJava on classpath.");
                        }
                    }
                    return RestAdapter.this.rxSupport.createRequestObservable(new RxSupport.Invoker() { // from class: retrofit.RestAdapter.RestHandler.1
                        @Override // retrofit.RxSupport.Invoker
                        public ResponseWrapper invoke(RequestInterceptor requestInterceptor) {
                            return (ResponseWrapper) RestHandler.this.invokeRequest(requestInterceptor, methodInfo, objArr);
                        }
                    });
                }
                final RequestInterceptorTape requestInterceptorTape = new RequestInterceptorTape();
                RestAdapter.this.requestInterceptor.intercept(requestInterceptorTape);
                b.a(RestAdapter.this.httpExecutor, new CallbackRunnable((Callback) objArr[objArr.length - 1], RestAdapter.this.callbackExecutor, RestAdapter.this.errorHandler) { // from class: retrofit.RestAdapter.RestHandler.2
                    @Override // retrofit.CallbackRunnable
                    public ResponseWrapper obtainResponse() {
                        return (ResponseWrapper) RestHandler.this.invokeRequest(requestInterceptorTape, methodInfo, objArr);
                    }
                });
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object invokeRequest(RequestInterceptor requestInterceptor, RestMethodInfo restMethodInfo, Object[] objArr) {
            String str;
            try {
                try {
                    try {
                        restMethodInfo.init();
                        String url = RestAdapter.this.server.getUrl();
                        RequestBuilder requestBuilder = new RequestBuilder(url, restMethodInfo, RestAdapter.this.converter);
                        requestBuilder.setArguments(objArr);
                        requestInterceptor.intercept(requestBuilder);
                        Request build = requestBuilder.build();
                        str = build.getUrl();
                        try {
                            if (!restMethodInfo.isSynchronous) {
                                int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK, url.length());
                                if (indexOf == -1) {
                                    indexOf = str.length();
                                }
                                Thread.currentThread().setName(RestAdapter.THREAD_PREFIX + str.substring(url.length(), indexOf));
                            }
                            if (RestAdapter.this.logLevel.log()) {
                                build = RestAdapter.this.logAndReplaceRequest("HTTP", build, objArr);
                            }
                            Object beforeCall = RestAdapter.this.profiler != null ? RestAdapter.this.profiler.beforeCall() : null;
                            long nanoTime = System.nanoTime();
                            Response execute = RestAdapter.this.clientProvider.get().execute(build);
                            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                            int status = execute.getStatus();
                            if (RestAdapter.this.profiler != null) {
                                RestAdapter.this.profiler.afterCall(RestAdapter.getRequestInfo(url, restMethodInfo, build), millis, status, beforeCall);
                            }
                            if (RestAdapter.this.logLevel.log()) {
                                execute = RestAdapter.this.logAndReplaceResponse(str, execute, millis);
                            }
                            Type type = restMethodInfo.responseObjectType;
                            if (status < 200 || status >= 300) {
                                throw RetrofitError.httpError(str, Utils.readBodyToBytesIfNecessary(execute), RestAdapter.this.converter, type);
                            }
                            if (type.equals(Response.class)) {
                                if (!restMethodInfo.isStreaming) {
                                    execute = Utils.readBodyToBytesIfNecessary(execute);
                                }
                                if (restMethodInfo.isSynchronous) {
                                    return execute;
                                }
                                ResponseWrapper responseWrapper = new ResponseWrapper(execute, execute);
                                if (!restMethodInfo.isSynchronous) {
                                    Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                                }
                                return responseWrapper;
                            }
                            TypedInput body = execute.getBody();
                            if (body == null) {
                                if (restMethodInfo.isSynchronous) {
                                    if (!restMethodInfo.isSynchronous) {
                                        Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                                    }
                                    return null;
                                }
                                ResponseWrapper responseWrapper2 = new ResponseWrapper(execute, null);
                                if (!restMethodInfo.isSynchronous) {
                                    Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                                }
                                return responseWrapper2;
                            }
                            ExceptionCatchingTypedInput exceptionCatchingTypedInput = new ExceptionCatchingTypedInput(body);
                            try {
                                Object fromBody = RestAdapter.this.converter.fromBody(exceptionCatchingTypedInput, type);
                                RestAdapter.this.logResponseBody(body, fromBody);
                                if (restMethodInfo.isSynchronous) {
                                    if (!restMethodInfo.isSynchronous) {
                                        Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                                    }
                                    return fromBody;
                                }
                                ResponseWrapper responseWrapper3 = new ResponseWrapper(execute, fromBody);
                                if (!restMethodInfo.isSynchronous) {
                                    Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                                }
                                return responseWrapper3;
                            } catch (ConversionException e) {
                                if (exceptionCatchingTypedInput.threwException()) {
                                    throw exceptionCatchingTypedInput.getThrownException();
                                }
                                throw RetrofitError.conversionError(str, Utils.replaceResponseBody(execute, null), RestAdapter.this.converter, type, e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            if (RestAdapter.this.logLevel.log()) {
                                RestAdapter.this.logException(e, str);
                            }
                            throw RetrofitError.networkError(str, e);
                        } catch (Throwable th) {
                            th = th;
                            if (RestAdapter.this.logLevel.log()) {
                                RestAdapter.this.logException(th, str);
                            }
                            throw RetrofitError.unexpectedError(str, th);
                        }
                    } catch (RetrofitError e3) {
                        throw e3;
                    }
                } finally {
                    if (!restMethodInfo.isSynchronous) {
                        Thread.currentThread().setName(RestAdapter.IDLE_THREAD_NAME);
                    }
                }
            } catch (IOException e4) {
                e = e4;
                str = null;
            } catch (Throwable th2) {
                th = th2;
                str = null;
            }
        }
    }

    Request logAndReplaceRequest(String str, Request request, Object[] objArr) throws IOException {
        this.log.log(String.format("---> %s %s %s", str, request.getMethod(), request.getUrl()));
        if (this.logLevel.ordinal() >= LogLevel.HEADERS.ordinal()) {
            for (Header header : request.getHeaders()) {
                this.log.log(header.toString());
            }
            String str2 = "no";
            TypedOutput body = request.getBody();
            if (body != null) {
                String mimeType = body.mimeType();
                if (mimeType != null) {
                    this.log.log("Content-Type: " + mimeType);
                }
                long length = body.length();
                str2 = length + "-byte";
                if (length != -1) {
                    this.log.log("Content-Length: " + length);
                }
                if (this.logLevel.ordinal() >= LogLevel.FULL.ordinal()) {
                    if (!request.getHeaders().isEmpty()) {
                        this.log.log("");
                    }
                    if (!(body instanceof TypedByteArray)) {
                        request = Utils.readBodyToBytesIfNecessary(request);
                        body = request.getBody();
                    }
                    this.log.log(new String(((TypedByteArray) body).getBytes(), MimeUtil.parseCharset(body.mimeType(), "UTF-8")));
                } else if (this.logLevel.ordinal() >= LogLevel.HEADERS_AND_ARGS.ordinal()) {
                    if (!request.getHeaders().isEmpty()) {
                        this.log.log("---> REQUEST:");
                    }
                    for (int i = 0; i < objArr.length; i++) {
                        this.log.log("#" + i + ": " + objArr[i]);
                    }
                }
            }
            this.log.log(String.format("---> END %s (%s body)", str, str2));
        }
        return request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response logAndReplaceResponse(String str, Response response, long j) throws IOException {
        this.log.log(String.format("<--- HTTP %s %s (%sms)", Integer.valueOf(response.getStatus()), str, Long.valueOf(j)));
        if (this.logLevel.ordinal() >= LogLevel.HEADERS.ordinal()) {
            for (Header header : response.getHeaders()) {
                this.log.log(header.toString());
            }
            long j2 = 0;
            TypedInput body = response.getBody();
            if (body != null) {
                j2 = body.length();
                if (this.logLevel.ordinal() >= LogLevel.FULL.ordinal()) {
                    if (!response.getHeaders().isEmpty()) {
                        this.log.log("");
                    }
                    if (!(body instanceof TypedByteArray)) {
                        response = Utils.readBodyToBytesIfNecessary(response);
                        body = response.getBody();
                    }
                    byte[] bytes = ((TypedByteArray) body).getBytes();
                    long length = bytes.length;
                    this.log.log(new String(bytes, MimeUtil.parseCharset(body.mimeType(), "UTF-8")));
                    j2 = length;
                }
            }
            this.log.log(String.format("<--- END HTTP (%s-byte body)", Long.valueOf(j2)));
        }
        return response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logResponseBody(TypedInput typedInput, Object obj) {
        if (this.logLevel.ordinal() == LogLevel.HEADERS_AND_ARGS.ordinal()) {
            this.log.log("<--- BODY:");
            this.log.log(obj.toString());
        }
    }

    void logException(Throwable th, String str) {
        Log log = this.log;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        log.log(String.format("---- ERROR %s", objArr));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.log.log(stringWriter.toString());
        this.log.log("---- END ERROR");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Profiler.RequestInformation getRequestInfo(String str, RestMethodInfo restMethodInfo, Request request) {
        long j;
        String str2;
        TypedOutput body = request.getBody();
        if (body != null) {
            j = body.length();
            str2 = body.mimeType();
        } else {
            j = 0;
            str2 = null;
        }
        long j2 = j;
        return new Profiler.RequestInformation(restMethodInfo.requestMethod, str, restMethodInfo.requestUrl, j2, str2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class Builder {
        private Executor callbackExecutor;
        private Client.Provider clientProvider;
        private Converter converter;
        private Endpoint endpoint;
        private ErrorHandler errorHandler;
        private Executor httpExecutor;
        private Log log;
        private LogLevel logLevel = LogLevel.NONE;
        private Profiler profiler;
        private RequestInterceptor requestInterceptor;

        public Builder setEndpoint(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.endpoint = Endpoints.newFixedEndpoint(str);
            return this;
        }

        public Builder setEndpoint(Endpoint endpoint) {
            if (endpoint == null) {
                throw new NullPointerException("Endpoint may not be null.");
            }
            this.endpoint = endpoint;
            return this;
        }

        public Builder setClient(final Client client) {
            if (client == null) {
                throw new NullPointerException("Client may not be null.");
            }
            return setClient(new Client.Provider() { // from class: retrofit.RestAdapter.Builder.1
                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return client;
                }
            });
        }

        public Builder setClient(Client.Provider provider) {
            if (provider == null) {
                throw new NullPointerException("Client provider may not be null.");
            }
            this.clientProvider = provider;
            return this;
        }

        public Builder setExecutors(Executor executor, Executor executor2) {
            if (executor == null) {
                throw new NullPointerException("HTTP executor may not be null.");
            }
            if (executor2 == null) {
                executor2 = new Utils.SynchronousExecutor();
            }
            this.httpExecutor = executor;
            this.callbackExecutor = executor2;
            return this;
        }

        public Builder setRequestInterceptor(RequestInterceptor requestInterceptor) {
            if (requestInterceptor == null) {
                throw new NullPointerException("Request interceptor may not be null.");
            }
            this.requestInterceptor = requestInterceptor;
            return this;
        }

        public Builder setConverter(Converter converter) {
            if (converter == null) {
                throw new NullPointerException("Converter may not be null.");
            }
            this.converter = converter;
            return this;
        }

        public Builder setProfiler(Profiler profiler) {
            if (profiler == null) {
                throw new NullPointerException("Profiler may not be null.");
            }
            this.profiler = profiler;
            return this;
        }

        public Builder setErrorHandler(ErrorHandler errorHandler) {
            if (errorHandler == null) {
                throw new NullPointerException("Error handler may not be null.");
            }
            this.errorHandler = errorHandler;
            return this;
        }

        public Builder setLog(Log log) {
            if (log == null) {
                throw new NullPointerException("Log may not be null.");
            }
            this.log = log;
            return this;
        }

        public Builder setLogLevel(LogLevel logLevel) {
            if (logLevel == null) {
                throw new NullPointerException("Log level may not be null.");
            }
            this.logLevel = logLevel;
            return this;
        }

        public RestAdapter build() {
            if (this.endpoint == null) {
                throw new IllegalArgumentException("Endpoint may not be null.");
            }
            ensureSaneDefaults();
            return new RestAdapter(this.endpoint, this.clientProvider, this.httpExecutor, this.callbackExecutor, this.requestInterceptor, this.converter, this.profiler, this.errorHandler, this.log, this.logLevel);
        }

        private void ensureSaneDefaults() {
            if (this.converter == null) {
                this.converter = Platform.get().defaultConverter();
            }
            if (this.clientProvider == null) {
                this.clientProvider = Platform.get().defaultClient();
            }
            if (this.httpExecutor == null) {
                this.httpExecutor = Platform.get().defaultHttpExecutor();
            }
            if (this.callbackExecutor == null) {
                this.callbackExecutor = Platform.get().defaultCallbackExecutor();
            }
            if (this.errorHandler == null) {
                this.errorHandler = ErrorHandler.DEFAULT;
            }
            if (this.log == null) {
                this.log = Platform.get().defaultLog();
            }
            if (this.requestInterceptor == null) {
                this.requestInterceptor = RequestInterceptor.NONE;
            }
        }
    }
}
