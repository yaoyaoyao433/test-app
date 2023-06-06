package retrofit;

import android.os.Build;
import android.os.Process;
import com.google.gson.Gson;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import retrofit.RestAdapter;
import retrofit.Utils;
import retrofit.android.AndroidApacheClient;
import retrofit.android.AndroidLog;
import retrofit.android.MainThreadExecutor;
import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client;
import retrofit.client.OkClient;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class Platform {
    private static final Platform PLATFORM = findPlatform();
    static final boolean HAS_RX_JAVA = hasRxJavaOnClasspath();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Executor defaultCallbackExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Client.Provider defaultClient();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Converter defaultConverter();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Executor defaultHttpExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract RestAdapter.Log defaultLog();

    Platform() {
    }

    static /* synthetic */ boolean access$300() {
        return hasOkHttpOnClasspath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Platform get() {
        return PLATFORM;
    }

    private static Platform findPlatform() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new Android();
            }
        } catch (ClassNotFoundException unused) {
        }
        if (System.getProperty("com.google.appengine.runtime.version") != null) {
            return new AppEngine();
        }
        return new Base();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class Base extends Platform {
        private Base() {
        }

        @Override // retrofit.Platform
        Converter defaultConverter() {
            return new GsonConverter(new Gson());
        }

        @Override // retrofit.Platform
        Client.Provider defaultClient() {
            final Client urlConnectionClient;
            if (Platform.access$300()) {
                urlConnectionClient = OkClientInstantiator.instantiate();
            } else {
                urlConnectionClient = new UrlConnectionClient();
            }
            return new Client.Provider() { // from class: retrofit.Platform.Base.1
                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return urlConnectionClient;
                }
            };
        }

        @Override // retrofit.Platform
        Executor defaultHttpExecutor() {
            return Executors.newCachedThreadPool(new ThreadFactory() { // from class: retrofit.Platform.Base.2
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(final Runnable runnable) {
                    return new Thread(new Runnable() { // from class: retrofit.Platform.Base.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Thread.currentThread().setPriority(1);
                            runnable.run();
                        }
                    }, "Retrofit-Idle");
                }
            });
        }

        @Override // retrofit.Platform
        Executor defaultCallbackExecutor() {
            return new Utils.SynchronousExecutor();
        }

        @Override // retrofit.Platform
        RestAdapter.Log defaultLog() {
            return new RestAdapter.Log() { // from class: retrofit.Platform.Base.3
                @Override // retrofit.RestAdapter.Log
                public void log(String str) {
                    System.out.println(str);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class Android extends Platform {
        private Android() {
        }

        @Override // retrofit.Platform
        Converter defaultConverter() {
            return new GsonConverter(new Gson());
        }

        @Override // retrofit.Platform
        Client.Provider defaultClient() {
            final Client urlConnectionClient;
            if (Platform.access$300()) {
                urlConnectionClient = OkClientInstantiator.instantiate();
            } else if (Build.VERSION.SDK_INT < 9) {
                urlConnectionClient = new AndroidApacheClient();
            } else {
                urlConnectionClient = new UrlConnectionClient();
            }
            return new Client.Provider() { // from class: retrofit.Platform.Android.1
                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return urlConnectionClient;
                }
            };
        }

        @Override // retrofit.Platform
        Executor defaultHttpExecutor() {
            return Executors.newCachedThreadPool(new ThreadFactory() { // from class: retrofit.Platform.Android.2
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(final Runnable runnable) {
                    return new Thread(new Runnable() { // from class: retrofit.Platform.Android.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Process.setThreadPriority(10);
                            runnable.run();
                        }
                    }, "Retrofit-Idle");
                }
            });
        }

        @Override // retrofit.Platform
        Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }

        @Override // retrofit.Platform
        RestAdapter.Log defaultLog() {
            return new AndroidLog("Retrofit");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class AppEngine extends Base {
        private AppEngine() {
            super();
        }

        @Override // retrofit.Platform.Base, retrofit.Platform
        Client.Provider defaultClient() {
            final UrlFetchClient urlFetchClient = new UrlFetchClient();
            return new Client.Provider() { // from class: retrofit.Platform.AppEngine.1
                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return urlFetchClient;
                }
            };
        }
    }

    private static boolean hasOkHttpOnClasspath() {
        try {
            Class.forName("com.squareup.okhttp.v");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class OkClientInstantiator {
        private OkClientInstantiator() {
        }

        static Client instantiate() {
            return new OkClient();
        }
    }

    private static boolean hasRxJavaOnClasspath() {
        try {
            Class.forName("rx.d");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
