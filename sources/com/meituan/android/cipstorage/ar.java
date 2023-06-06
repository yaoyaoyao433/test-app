package com.meituan.android.cipstorage;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ar {
    public static ChangeQuickRedirect a;
    final Map<String, Set<am>> b;
    private final Map<String, b> c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface b {
        String a();

        Set<am> a(Set<am> set);
    }

    public ar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc29f123e9890b99206b6b4435f92590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc29f123e9890b99206b6b4435f92590");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final void a(Collection<String> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ac6035a0265beed3a5f36a5b9e29e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ac6035a0265beed3a5f36a5b9e29e2");
            return;
        }
        for (String str : collection) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            b bVar = null;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9ed6100b45ad6d242955851be83b6eff", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9ed6100b45ad6d242955851be83b6eff");
            } else if (!TextUtils.isEmpty(str)) {
                if (str.startsWith(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                    bVar = new c(str);
                } else {
                    bVar = new a(str);
                }
            }
            if (bVar != null) {
                this.b.put(bVar.a(), new HashSet());
                this.c.put(str, bVar);
            }
        }
    }

    public final Set<am> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0b7ff7dc472f209e0e032df99533dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0b7ff7dc472f209e0e032df99533dc");
        }
        b bVar = this.c.get(str);
        if (bVar != null) {
            return bVar.a(this.b.get(bVar.a()));
        }
        return Collections.emptySet();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements b {
        public static ChangeQuickRedirect a;
        public String b;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf22b3b739b3d2cdf140fd615496680", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf22b3b739b3d2cdf140fd615496680");
            } else {
                this.b = str;
            }
        }

        @Override // com.meituan.android.cipstorage.ar.b
        public final String a() {
            return this.b;
        }

        @Override // com.meituan.android.cipstorage.ar.b
        public final Set<am> a(Set<am> set) {
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2a8cf4d1064a74b8eb418fbb2e3da3", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2a8cf4d1064a74b8eb418fbb2e3da3") : new HashSet(set);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class c implements b {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public String[] d;
        public List<Pattern> e;

        public c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e961c30f6170803024ad869af7566e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e961c30f6170803024ad869af7566e");
                return;
            }
            this.d = str.split("/");
            int indexOf = str.indexOf("<regex>");
            if (indexOf == -1) {
                this.b = str.substring(1);
                this.c = this.d.length;
                return;
            }
            this.b = str.substring(1, indexOf - 1);
            int i = 0;
            for (int i2 = 0; i2 < indexOf; i2++) {
                if (str.charAt(i2) == '/') {
                    i++;
                }
            }
            this.c = i;
            this.e = new ArrayList(this.d.length - this.c);
            for (int i3 = 0; this.c + i3 < this.d.length; i3++) {
                String str2 = this.d[this.c + i3];
                this.e.add(null);
                if (str2.startsWith("<regex>")) {
                    try {
                        this.e.set(i3, Pattern.compile(str2.substring(7)));
                    } catch (PatternSyntaxException e) {
                        if (v.b) {
                            Log.getStackTraceString(e);
                        }
                    }
                }
            }
        }

        @Override // com.meituan.android.cipstorage.ar.b
        public final String a() {
            return this.b;
        }

        @Override // com.meituan.android.cipstorage.ar.b
        public final Set<am> a(Set<am> set) {
            boolean matches;
            char c = 0;
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ee402de5cbc544c0a25a2212b6d6c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ee402de5cbc544c0a25a2212b6d6c1");
            }
            if (this.c >= this.d.length) {
                return new HashSet(set);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            for (am amVar : set) {
                arrayDeque.offer(amVar);
            }
            int i = 0;
            while (this.c + i < this.d.length) {
                Pattern pattern = this.e.get(i);
                String str = this.d[this.c + i];
                int size = arrayDeque.size();
                while (size != 0) {
                    am amVar2 = (am) arrayDeque.poll();
                    if (amVar2 != null && amVar2.j != null) {
                        for (am amVar3 : amVar2.j) {
                            String name = amVar3.h.getName();
                            Object[] objArr2 = new Object[3];
                            objArr2[c] = name;
                            objArr2[1] = str;
                            objArr2[2] = pattern;
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f16f95f247f03035b1aa0284924b2ff9", RobustBitConfig.DEFAULT_VALUE)) {
                                matches = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f16f95f247f03035b1aa0284924b2ff9")).booleanValue();
                            } else if (pattern == null) {
                                matches = TextUtils.equals(name, str);
                            } else {
                                matches = pattern.matcher(name).matches();
                            }
                            if (matches) {
                                arrayDeque.offer(amVar3);
                            }
                            c = 0;
                        }
                    }
                    size--;
                    c = 0;
                }
                i++;
                c = 0;
            }
            return new HashSet(arrayDeque);
        }
    }
}
