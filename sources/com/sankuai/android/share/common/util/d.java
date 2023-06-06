package com.sankuai.android.share.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.clipboard.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final ArrayList<a.InterfaceC0192a> b = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public void a() {
        }

        public void a(int i, Exception exc) {
        }

        public void a(String str) {
        }

        public void b() {
        }

        public void b(String str) {
        }
    }

    public static synchronized void a(Context context, final String str, final a aVar) {
        synchronized (d.class) {
            Object[] objArr = {context, str, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9768443b16f0a72508355812f0dadd24", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9768443b16f0a72508355812f0dadd24");
                return;
            }
            a.InterfaceC0192a interfaceC0192a = new a.InterfaceC0192a() { // from class: com.sankuai.android.share.common.util.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.a.InterfaceC0192a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91186b2dfa2347464dec33f3ce9ffc0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91186b2dfa2347464dec33f3ce9ffc0b");
                        return;
                    }
                    com.sankuai.android.share.util.c.a("getPasteText-剪切板初始化成功");
                    CharSequence a2 = com.meituan.android.clipboard.a.a(str, new com.meituan.android.clipboard.b() { // from class: com.sankuai.android.share.common.util.d.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.clipboard.b
                        public final void onSuccess() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75799c9e8c92d498324c3beb7bbd93e7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75799c9e8c92d498324c3beb7bbd93e7");
                            } else {
                                a.this.a();
                            }
                        }

                        @Override // com.meituan.android.clipboard.b
                        public final void onFail(int i, Exception exc) {
                            Object[] objArr3 = {Integer.valueOf(i), exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "592276dcce6bd9fc514e6a496914c7d4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "592276dcce6bd9fc514e6a496914c7d4");
                            } else {
                                a.this.a(i, exc);
                            }
                        }
                    });
                    String a3 = com.meituan.android.clipboard.a.a(str);
                    String charSequence = !TextUtils.isEmpty(a2) ? a2.toString() : "";
                    if (TextUtils.isEmpty(a3)) {
                        a3 = "";
                    }
                    com.sankuai.android.share.util.c.a(charSequence);
                    com.sankuai.android.share.util.c.a(a3);
                    a.this.b(a3);
                    a.this.a(charSequence);
                    a.this.b();
                }
            };
            com.meituan.android.clipboard.a.a(context, interfaceC0192a);
            b.add(interfaceC0192a);
        }
    }

    public static synchronized void a(Context context, final String str) {
        synchronized (d.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47052cadee88f29efde5a52f8a1e6150", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47052cadee88f29efde5a52f8a1e6150");
                return;
            }
            a.InterfaceC0192a interfaceC0192a = new a.InterfaceC0192a() { // from class: com.sankuai.android.share.common.util.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.a.InterfaceC0192a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bc88fa148effc6fbd855194c98cea76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bc88fa148effc6fbd855194c98cea76");
                        return;
                    }
                    com.sankuai.android.share.util.c.a("clearClipText-剪切板初始化成功");
                    com.meituan.android.clipboard.a.b(str);
                }
            };
            com.meituan.android.clipboard.a.a(context, interfaceC0192a);
            b.add(interfaceC0192a);
        }
    }

    public static synchronized void a(Context context, final String str, final String str2, final String str3, final a aVar) {
        synchronized (d.class) {
            Object[] objArr = {context, str, str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99c17f7f4b22f99dc97dea987978ab58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99c17f7f4b22f99dc97dea987978ab58");
                return;
            }
            a.InterfaceC0192a interfaceC0192a = new a.InterfaceC0192a() { // from class: com.sankuai.android.share.common.util.d.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.a.InterfaceC0192a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39b8fdb8fc3ea5a17ab2307c14a77b30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39b8fdb8fc3ea5a17ab2307c14a77b30");
                        return;
                    }
                    com.sankuai.android.share.util.c.a("copyText-剪切板初始化成功");
                    com.meituan.android.clipboard.a.a(str, (CharSequence) str2, str3, new com.meituan.android.clipboard.b() { // from class: com.sankuai.android.share.common.util.d.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.clipboard.b
                        public final void onSuccess() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5bf64640c78e4c316564fbca78ee6d32", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5bf64640c78e4c316564fbca78ee6d32");
                            } else {
                                a.this.a();
                            }
                        }

                        @Override // com.meituan.android.clipboard.b
                        public final void onFail(int i, Exception exc) {
                            Object[] objArr3 = {Integer.valueOf(i), exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f47f9e5a2e1f799870a88585d9c76cca", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f47f9e5a2e1f799870a88585d9c76cca");
                            } else {
                                a.this.a(i, exc);
                            }
                        }
                    });
                }
            };
            com.meituan.android.clipboard.a.a(context, interfaceC0192a);
            b.add(interfaceC0192a);
        }
    }

    public static synchronized void a() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af445a090619f7c9d6ab4ee48a328050", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af445a090619f7c9d6ab4ee48a328050");
                return;
            }
            Iterator<a.InterfaceC0192a> it = b.iterator();
            while (it.hasNext()) {
                com.sankuai.android.share.util.c.a("unregisterInitReadyCallback-注销初始化callback");
                com.meituan.android.clipboard.a.a(it.next());
            }
            b.clear();
        }
    }
}
