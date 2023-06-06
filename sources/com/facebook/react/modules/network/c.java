package com.facebook.react.modules.network;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends CookieHandler {
    static final boolean a;
    final a b = new a();
    final ReactContext c;
    @Nullable
    private CookieManager d;

    static {
        a = Build.VERSION.SDK_INT < 21;
    }

    public c(ReactContext reactContext) {
        this.c = reactContext;
    }

    @Override // java.net.CookieHandler
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager a2 = a();
        if (a2 == null) {
            return Collections.emptyMap();
        }
        String cookie = a2.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        final String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                if (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2")) {
                    final List<String> value = entry.getValue();
                    final CookieManager a2 = a();
                    if (a2 != null) {
                        if (a) {
                            a(new Runnable() { // from class: com.facebook.react.modules.network.c.3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (String str : value) {
                                        a2.setCookie(uri2, str);
                                    }
                                    c.this.b.a();
                                }
                            });
                        } else {
                            for (String str : value) {
                                CookieManager a3 = a();
                                if (a3 != null) {
                                    a3.setCookie(uri2, str, null);
                                }
                            }
                            a2.flush();
                            this.b.a();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Runnable runnable) {
        com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(this.c) { // from class: com.facebook.react.modules.network.c.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                runnable.run();
            }
        }, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CookieManager a() {
        if (this.d == null) {
            ReactContext reactContext = this.c;
            if (a) {
                CookieSyncManager.createInstance(reactContext).sync();
            }
            try {
                this.d = CookieManager.getInstance();
                if (a) {
                    this.d.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                com.facebook.common.logging.a.d("ForwardingCookieHandler@getCookieManager", "", e);
                return null;
            }
        }
        return this.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        private final Handler b;

        public a() {
            this.b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.facebook.react.modules.network.c.a.1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what == 1) {
                        a.this.b();
                        return true;
                    }
                    return false;
                }
            });
        }

        public final void a() {
            if (c.a) {
                this.b.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        public final void b() {
            this.b.removeMessages(1);
            c.this.a(new Runnable() { // from class: com.facebook.react.modules.network.c.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!c.a) {
                        CookieManager a = c.this.a();
                        if (a != null) {
                            a.flush();
                            return;
                        }
                        return;
                    }
                    CookieSyncManager.getInstance().sync();
                }
            });
        }
    }
}
