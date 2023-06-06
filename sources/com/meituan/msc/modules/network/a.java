package com.meituan.msc.modules.network;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends CookieHandler {
    public static ChangeQuickRedirect a;
    private static final boolean b;
    private final C0464a c;
    @Nullable
    private CookieManager d;

    static {
        b = Build.VERSION.SDK_INT < 21;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88233be17dfaf5933ce7d8d557d5ce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88233be17dfaf5933ce7d8d557d5ce5");
        } else {
            this.c = new C0464a();
        }
    }

    @Override // java.net.CookieHandler
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34866f643a71713dfbe5fba6065450b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34866f643a71713dfbe5fba6065450b4");
        }
        CookieManager b2 = b();
        if (b2 == null) {
            return Collections.emptyMap();
        }
        String cookie = b2.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // java.net.CookieHandler
    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        boolean z;
        int i = 2;
        boolean z2 = false;
        int i2 = 1;
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ba83d49c4ea6c188b6463d44741a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ba83d49c4ea6c188b6463d44741a16");
            return;
        }
        final String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                Object[] objArr2 = new Object[i2];
                objArr2[z2 ? 1 : 0] = key;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1504a51dc1f094595e6c4d073422c5d6", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, i2, "1504a51dc1f094595e6c4d073422c5d6")).booleanValue();
                } else {
                    z = key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2");
                }
                if (z) {
                    final List<String> value = entry.getValue();
                    Object[] objArr3 = new Object[i];
                    objArr3[z2 ? 1 : 0] = uri2;
                    objArr3[i2] = value;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "818068d4e6042be87ba2fca8120df368", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, z2, "818068d4e6042be87ba2fca8120df368");
                    } else {
                        final CookieManager b2 = b();
                        if (b2 != null) {
                            if (b) {
                                a(new Runnable() { // from class: com.meituan.msc.modules.network.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f261cfacdabe9f5a2538582bff39f625", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f261cfacdabe9f5a2538582bff39f625");
                                            return;
                                        }
                                        for (String str : value) {
                                            b2.setCookie(uri2, str);
                                        }
                                        a.this.c.a();
                                    }
                                });
                            } else {
                                ?? r10 = z2;
                                for (String str : value) {
                                    Object[] objArr4 = new Object[i];
                                    objArr4[r10] = uri2;
                                    objArr4[1] = str;
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "48e5eec1b1cabb8d7f680b3bd3baee17", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "48e5eec1b1cabb8d7f680b3bd3baee17");
                                    } else {
                                        CookieManager b3 = b();
                                        if (b3 != null) {
                                            b3.setCookie(uri2, str, null);
                                        }
                                    }
                                    i = 2;
                                    r10 = 0;
                                }
                                b2.flush();
                                this.c.a();
                                i = 2;
                                z2 = false;
                            }
                        }
                    }
                    i2 = 1;
                    z2 = z2;
                }
            }
            i = 2;
            z2 = false;
            i2 = 1;
            z2 = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "126a00a21525ebe9712051502e6a4a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "126a00a21525ebe9712051502e6a4a1c");
        } else {
            b.a(new AsyncTask<Void, Void, Void>() { // from class: com.meituan.msc.modules.network.a.2
                public static ChangeQuickRedirect a;

                @Override // android.os.AsyncTask
                public final /* synthetic */ Void doInBackground(Void[] voidArr) {
                    Object[] objArr2 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "054c4e20f4eec7392ea373feea7abb80", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "054c4e20f4eec7392ea373feea7abb80");
                    }
                    runnable.run();
                    return null;
                }
            }, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public CookieManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82dad1f48ca1271e519b4ac095ab80b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CookieManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82dad1f48ca1271e519b4ac095ab80b1");
        }
        if (this.d == null) {
            Context context = MSCEnvHelper.getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "39ca69d77213169cef325b531bb89b7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "39ca69d77213169cef325b531bb89b7d");
            } else if (b) {
                CookieSyncManager.createInstance(context).sync();
            }
            try {
                this.d = CookieManager.getInstance();
                if (b) {
                    this.d.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                g.a("ForwardingCookieHandler@getCookieManager", e);
                return null;
            }
        }
        return this.d;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0464a {
        public static ChangeQuickRedirect a;
        final Handler b;

        public C0464a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a3513164105933a8f9ffb39b765b4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a3513164105933a8f9ffb39b765b4c");
            } else {
                this.b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.meituan.msc.modules.network.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        Object[] objArr2 = {message};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0727c8b9a9b4f48e019aecedf73bea23", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0727c8b9a9b4f48e019aecedf73bea23")).booleanValue();
                        }
                        if (message.what == 1) {
                            final C0464a c0464a = C0464a.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = C0464a.a;
                            if (PatchProxy.isSupport(objArr3, c0464a, changeQuickRedirect3, false, "5d18fd87d1acd992fa1f05255cc2a0d3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, c0464a, changeQuickRedirect3, false, "5d18fd87d1acd992fa1f05255cc2a0d3");
                            } else {
                                c0464a.b.removeMessages(1);
                                a.this.a(new Runnable() { // from class: com.meituan.msc.modules.network.a.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "153ad7dedf04f1b8c375ea739bd5b6c4", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "153ad7dedf04f1b8c375ea739bd5b6c4");
                                        } else if (a.b) {
                                            CookieSyncManager.getInstance().sync();
                                        } else {
                                            C0464a c0464a2 = C0464a.this;
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = C0464a.a;
                                            if (PatchProxy.isSupport(objArr5, c0464a2, changeQuickRedirect5, false, "ba304d16b910e0b55940e3bf4dbb9465", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, c0464a2, changeQuickRedirect5, false, "ba304d16b910e0b55940e3bf4dbb9465");
                                                return;
                                            }
                                            CookieManager b = a.this.b();
                                            if (b != null) {
                                                b.flush();
                                            }
                                        }
                                    }
                                });
                            }
                            return true;
                        }
                        return false;
                    }
                });
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4218c2fba93bcb402121b5eba3c2f3ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4218c2fba93bcb402121b5eba3c2f3ee");
            } else if (a.b) {
                this.b.sendEmptyMessageDelayed(1, 30000L);
            }
        }
    }
}
