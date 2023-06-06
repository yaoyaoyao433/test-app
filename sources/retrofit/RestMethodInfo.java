package retrofit;

import com.meituan.robust.common.CommonConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.client.Header;
import retrofit.client.Response;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.RestMethod;
import retrofit.http.Streaming;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class RestMethodInfo {
    private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);
    private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    String contentTypeHeader;
    List<Header> headers;
    final boolean isObservable;
    boolean isStreaming;
    final boolean isSynchronous;
    final Method method;
    boolean requestHasBody;
    String requestMethod;
    Annotation[] requestParamAnnotations;
    String requestQuery;
    String requestUrl;
    Set<String> requestUrlParamNames;
    Type responseObjectType;
    boolean loaded = false;
    RequestType requestType = RequestType.SIMPLE;
    final ResponseType responseType = parseResponseType();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum RequestType {
        SIMPLE,
        MULTIPART,
        FORM_URL_ENCODED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum ResponseType {
        VOID,
        OBSERVABLE,
        OBJECT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RestMethodInfo(Method method) {
        this.method = method;
        this.isSynchronous = this.responseType == ResponseType.OBJECT;
        this.isObservable = this.responseType == ResponseType.OBSERVABLE;
    }

    private RuntimeException methodError(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return new IllegalArgumentException(this.method.getDeclaringClass().getSimpleName() + CommonConstant.Symbol.DOT + this.method.getName() + ": " + str);
    }

    private RuntimeException parameterError(int i, String str, Object... objArr) {
        return methodError(str + " (parameter #" + (i + 1) + CommonConstant.Symbol.BRACKET_RIGHT, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void init() {
        if (this.loaded) {
            return;
        }
        parseMethodAnnotations();
        parseParameters();
        this.loaded = true;
    }

    private void parseMethodAnnotations() {
        Annotation[] annotations;
        for (Annotation annotation : this.method.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            RestMethod restMethod = null;
            Annotation[] annotations2 = annotationType.getAnnotations();
            int length = annotations2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Annotation annotation2 = annotations2[i];
                if (RestMethod.class == annotation2.annotationType()) {
                    restMethod = (RestMethod) annotation2;
                    break;
                }
                i++;
            }
            if (restMethod != null) {
                if (this.requestMethod != null) {
                    throw methodError("Only one HTTP method is allowed. Found: %s and %s.", this.requestMethod, restMethod.value());
                }
                try {
                    parsePath((String) annotationType.getMethod("value", new Class[0]).invoke(annotation, new Object[0]));
                    this.requestMethod = restMethod.value();
                    this.requestHasBody = restMethod.hasBody();
                } catch (Exception unused) {
                    throw methodError("Failed to extract String 'value' from @%s annotation.", annotationType.getSimpleName());
                }
            } else if (annotationType == Headers.class) {
                String[] value = ((Headers) annotation).value();
                if (value.length == 0) {
                    throw methodError("@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(value);
            } else if (annotationType == Multipart.class) {
                if (this.requestType != RequestType.SIMPLE) {
                    throw methodError("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.requestType = RequestType.MULTIPART;
            } else if (annotationType == FormUrlEncoded.class) {
                if (this.requestType != RequestType.SIMPLE) {
                    throw methodError("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.requestType = RequestType.FORM_URL_ENCODED;
            } else if (annotationType != Streaming.class) {
                continue;
            } else if (this.responseObjectType != Response.class) {
                throw methodError("Only methods having %s as data type are allowed to have @%s annotation.", Response.class.getSimpleName(), Streaming.class.getSimpleName());
            } else {
                this.isStreaming = true;
            }
        }
        if (this.requestMethod == null) {
            throw methodError("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (this.requestHasBody) {
            return;
        }
        if (this.requestType == RequestType.MULTIPART) {
            throw methodError("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        }
        if (this.requestType == RequestType.FORM_URL_ENCODED) {
            throw methodError("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        }
    }

    private void parsePath(String str) {
        String str2;
        String str3;
        if (str == null || str.length() == 0 || str.charAt(0) != '/') {
            throw methodError("URL path \"%s\" must start with '/'.", str);
        }
        int indexOf = str.indexOf(63);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            str2 = null;
            str3 = str;
        } else {
            str3 = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            if (PARAM_URL_REGEX.matcher(str2).find()) {
                throw methodError("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2);
            }
        }
        Set<String> parsePathParameters = parsePathParameters(str);
        this.requestUrl = str3;
        this.requestUrlParamNames = parsePathParameters;
        this.requestQuery = str2;
    }

    final List<Header> parseHeaders(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                throw methodError("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(substring)) {
                this.contentTypeHeader = trim;
            } else {
                arrayList.add(new Header(substring, trim));
            }
        }
        return arrayList;
    }

    private ResponseType parseResponseType() {
        Type type;
        Type genericReturnType = this.method.getGenericReturnType();
        Type[] genericParameterTypes = this.method.getGenericParameterTypes();
        Class cls = null;
        boolean z = true;
        if (genericParameterTypes.length > 0) {
            type = genericParameterTypes[genericParameterTypes.length - 1];
            Type rawType = type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
            if (rawType instanceof Class) {
                cls = (Class) rawType;
            }
        } else {
            type = null;
        }
        boolean z2 = genericReturnType != Void.TYPE;
        z = (cls == null || !Callback.class.isAssignableFrom(cls)) ? false : false;
        if (z2 && z) {
            throw methodError("Must have return type or Callback as last argument, not both.", new Object[0]);
        }
        if (z2 || z) {
            if (z2) {
                if (Platform.HAS_RX_JAVA) {
                    Class<?> rawType2 = Types.getRawType(genericReturnType);
                    if (RxSupport.isObservable(rawType2)) {
                        this.responseObjectType = getParameterUpperBound((ParameterizedType) RxSupport.getObservableType(genericReturnType, rawType2));
                        return ResponseType.OBSERVABLE;
                    }
                }
                this.responseObjectType = genericReturnType;
                return ResponseType.OBJECT;
            }
            Type supertype = Types.getSupertype(type, Types.getRawType(type), Callback.class);
            if (supertype instanceof ParameterizedType) {
                this.responseObjectType = getParameterUpperBound((ParameterizedType) supertype);
                return ResponseType.VOID;
            }
            throw methodError("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
        }
        throw methodError("Must have either a return type or Callback as last argument.", new Object[0]);
    }

    private static Type getParameterUpperBound(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                actualTypeArguments[i] = ((WildcardType) type).getUpperBounds()[0];
            }
        }
        return actualTypeArguments[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseParameters() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.RestMethodInfo.parseParameters():void");
    }

    private void validatePathName(int i, String str) {
        if (!PARAM_NAME_REGEX.matcher(str).matches()) {
            throw parameterError(i, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
        }
        if (!this.requestUrlParamNames.contains(str)) {
            throw parameterError(i, "URL \"%s\" does not contain \"{%s}\".", this.requestUrl, str);
        }
    }

    static Set<String> parsePathParameters(String str) {
        Matcher matcher = PARAM_URL_REGEX.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class RxSupport {
        private RxSupport() {
        }

        public static boolean isObservable(Class cls) {
            return cls == d.class;
        }

        public static Type getObservableType(Type type, Class cls) {
            return Types.getSupertype(type, cls, d.class);
        }
    }
}
