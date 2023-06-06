package com.meituan.msi.privacy.permission;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.msi.provider.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @Nullable
    public com.meituan.msi.privacy.permission.c b;
    private final Queue<b> c;
    private e d;
    private int e;
    private b f;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.privacy.permission.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0498a {
        void onResult(String str, String[] strArr, int[] iArr, String str2);
    }

    public static /* synthetic */ int a(a aVar, String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3d9c4a1695e18ccbd0f8b07af4aa1f77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3d9c4a1695e18ccbd0f8b07af4aa1f77")).intValue();
        }
        if (strArr == null || strArr.length <= 0) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.equals(str, strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public a(int i, e eVar, @Nullable com.meituan.msi.privacy.permission.c cVar) {
        Object[] objArr = {Integer.valueOf(i), eVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc3ba8ecbec0a265382871b52e94ee3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc3ba8ecbec0a265382871b52e94ee3");
            return;
        }
        this.c = new ConcurrentLinkedQueue();
        this.e = i;
        this.d = eVar;
        this.b = cVar;
    }

    public static boolean a(@NonNull Context context, @NonNull String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d83e777ba42057a6087531df131b8374", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d83e777ba42057a6087531df131b8374")).booleanValue() : a(context, str, str2, false);
    }

    public static boolean a(@NonNull Context context, @NonNull String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27abfff22b716b8e784fc8ac5fdb650", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27abfff22b716b8e784fc8ac5fdb650")).booleanValue();
        }
        com.meituan.msi.log.a.a("MMPPrivacy MsiPermissionGuard checkSelfPermission " + str);
        c a2 = a(new String[]{str});
        if (a2 == c.MT_PERMISSION) {
            if (PermissionGuard.BUSINESS_CHECK_ONLY.equals(str2)) {
                int a3 = Privacy.createPermissionGuard().a(context, str, str2);
                com.meituan.msi.log.a.a("MMPPrivacy MsiPermissionGuard checkSelfPermission token=__checkOnly " + str + StringUtil.SPACE + a3);
                return a3 > 0 || a3 == -13;
            }
            return b(context, str, str2, z);
        } else if (a2 == c.SYS_PERMISSION) {
            com.meituan.msi.log.a.a("checkSelfPermission permissionType is SYS_PERMISSION");
            return ContextCompat.checkSelfPermission(context, str) == 0;
        } else {
            return false;
        }
    }

    private static boolean b(@NonNull Context context, @NonNull String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9b943dc0c469b09a3bf699328528a61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9b943dc0c469b09a3bf699328528a61")).booleanValue();
        }
        int a2 = Privacy.createPermissionGuard().a(context, str, str2, z);
        com.meituan.msi.log.a.a("checkMtPermission: permission=>" + str + ", token=>" + str2 + StringUtil.SPACE + a2 + " IgnoreMonitor" + z);
        return a2 > 0;
    }

    public final synchronized void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int[] iArr2;
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d95695a4b39e530c94e86ea57daba06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d95695a4b39e530c94e86ea57daba06");
            return;
        }
        if (i == this.e && this.f != null && Arrays.equals(this.f.a, strArr)) {
            if (iArr != null) {
                iArr2 = new int[iArr.length];
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    if (iArr[i2] == 0) {
                        iArr2[i2] = 2;
                    } else {
                        iArr2[i2] = -9;
                    }
                }
            } else {
                iArr2 = null;
            }
            if (this.b != null) {
                this.b.a(this.f.c, this.f.a, iArr2);
            }
            if (this.f.d != null) {
                this.f.d.onResult(this.f.c, this.f.a, iArr2, "");
            }
            this.f = null;
            a();
        }
    }

    private void b(@NonNull Activity activity, @NonNull String[] strArr, String str, InterfaceC0498a interfaceC0498a) {
        boolean z;
        int[] iArr;
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb2de992a2f3b6cca24bceb70b6bb77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb2de992a2f3b6cca24bceb70b6bb77");
            return;
        }
        c a2 = a(strArr);
        if (a2 == c.UNKNOWN_PERMISSION) {
            interfaceC0498a.onResult(str, strArr, null, "invalid permissions");
        } else if (a2 == c.MT_PERMISSION) {
            if (this.b == null) {
                d(activity, strArr, str, interfaceC0498a);
            } else if (this.b.a(strArr, str)) {
                d(activity, strArr, str, interfaceC0498a);
            } else {
                interfaceC0498a.onResult(str, strArr, null, "limited");
            }
        } else if (activity != null) {
            Object[] objArr2 = {activity, strArr, str, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a044f241bbff0ee72b223cc8628cb731", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a044f241bbff0ee72b223cc8628cb731")).booleanValue();
            } else {
                com.meituan.msi.log.a.a("MMPPrivacy MsiPermissionGuard checkPermission");
                if (activity != null && strArr != null) {
                    for (String str2 : strArr) {
                        if (ContextCompat.checkSelfPermission(activity, str2) == 0) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                if (this.b == null) {
                    c(activity, strArr, str, interfaceC0498a);
                    return;
                } else if (this.b.a(strArr, str)) {
                    c(activity, strArr, str, interfaceC0498a);
                    return;
                } else {
                    interfaceC0498a.onResult(str, strArr, null, "limited");
                    return;
                }
            }
            int length = strArr != null ? strArr.length : 0;
            if (length > 0) {
                iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = 2;
                }
            } else {
                iArr = null;
            }
            interfaceC0498a.onResult(str, strArr, iArr, com.meituan.msi.privacy.permission.b.a(iArr));
        } else {
            interfaceC0498a.onResult(str, strArr, null, "Activity is null");
        }
    }

    private void c(@NonNull Activity activity, @NonNull String[] strArr, String str, InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90ffc1dc8f867da3ae909bcd11b8dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90ffc1dc8f867da3ae909bcd11b8dbd");
            return;
        }
        this.f = new b(strArr, activity, str, interfaceC0498a);
        ActivityCompat.requestPermissions(activity, strArr, this.e);
    }

    private void d(@NonNull Activity activity, @NonNull String[] strArr, String str, final InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90380418373cafe7f31f8d40700263a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90380418373cafe7f31f8d40700263a");
        } else {
            e(activity, strArr, str, new InterfaceC0498a() { // from class: com.meituan.msi.privacy.permission.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public final void onResult(String str2, String[] strArr2, int[] iArr, String str3) {
                    Object[] objArr2 = {str2, strArr2, iArr, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61f246a2a1cf84b93e00c031c6c5c98c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61f246a2a1cf84b93e00c031c6c5c98c");
                        return;
                    }
                    if (a.this.b != null) {
                        a.this.b.a(str2, strArr2, iArr);
                    }
                    interfaceC0498a.onResult(str2, strArr2, iArr, str3);
                }
            });
        }
    }

    private void e(@NonNull Activity activity, @NonNull final String[] strArr, final String str, final InterfaceC0498a interfaceC0498a) {
        int i;
        AtomicInteger atomicInteger;
        int[] iArr;
        int i2 = 0;
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d327e18e4891e250c372c58ae44b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d327e18e4891e250c372c58ae44b9c");
            return;
        }
        int length = strArr != null ? strArr.length : 0;
        if (length > 0) {
            AtomicInteger atomicInteger2 = new AtomicInteger(length);
            int[] iArr2 = new int[length];
            while (i2 < length) {
                com.meituan.msi.log.a.a("requestMtPermissions: permission=>" + strArr[i2] + ", token=>" + str);
                int a2 = Privacy.createPermissionGuard().a(activity, strArr[i2], str);
                if (a2 > 0) {
                    iArr2[i2] = a2;
                    if (atomicInteger2.decrementAndGet() == 0) {
                        interfaceC0498a.onResult(str, strArr, iArr2, "");
                    }
                    iArr = iArr2;
                    i = length;
                    atomicInteger = atomicInteger2;
                } else {
                    final int i3 = length;
                    i = length;
                    final int[] iArr3 = iArr2;
                    final AtomicInteger atomicInteger3 = atomicInteger2;
                    atomicInteger = atomicInteger2;
                    iArr = iArr2;
                    Privacy.createPermissionGuard().a(activity, strArr[i2], str, new d() { // from class: com.meituan.msi.privacy.permission.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.privacy.interfaces.d
                        public final void onResult(String str2, int i4) {
                            Object[] objArr2 = {str2, Integer.valueOf(i4)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e84daaddb6f0ac23b458ddd8b3193343", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e84daaddb6f0ac23b458ddd8b3193343");
                                return;
                            }
                            com.meituan.msi.log.a.a("MMPPrivacy Privacy Mt requestPermissions result " + str2 + StringUtil.SPACE + i4);
                            int a3 = a.a(a.this, strArr, str2);
                            if (a3 >= 0 && a3 < i3) {
                                iArr3[a3] = i4;
                            }
                            if (atomicInteger3.decrementAndGet() == 0) {
                                interfaceC0498a.onResult(str, strArr, iArr3, com.meituan.msi.privacy.permission.b.a(iArr3));
                            }
                        }
                    });
                }
                i2++;
                length = i;
                atomicInteger2 = atomicInteger;
                iArr2 = iArr;
            }
            return;
        }
        interfaceC0498a.onResult(str, strArr, null, "invalid permissions");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum c {
        MT_PERMISSION,
        SYS_PERMISSION,
        UNKNOWN_PERMISSION;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6d6a1312a989f53e47788a8145a51d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6d6a1312a989f53e47788a8145a51d");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d61f6c6c279b0cdd003217b6ffc66b86", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d61f6c6c279b0cdd003217b6ffc66b86") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9984c8900587bb59cafd78c2df1bddb6", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9984c8900587bb59cafd78c2df1bddb6") : (c[]) values().clone();
        }
    }

    private static c a(String[] strArr) {
        c cVar;
        int i = 0;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dc34131f936d9ad374bff297099d282", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dc34131f936d9ad374bff297099d282");
        }
        c cVar2 = c.UNKNOWN_PERMISSION;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                if (!TextUtils.isEmpty(str) && str.startsWith("android.permission")) {
                    cVar = c.SYS_PERMISSION;
                } else {
                    cVar = c.MT_PERMISSION;
                }
                if (cVar2 != c.UNKNOWN_PERMISSION && cVar2 != cVar) {
                    return c.UNKNOWN_PERMISSION;
                }
                i++;
                cVar2 = cVar;
            }
        }
        return cVar2;
    }

    public final synchronized void a(Activity activity, @NonNull String[] strArr, String str, InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e3a5acaeff5b11ba2131a8ed3273a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e3a5acaeff5b11ba2131a8ed3273a7");
            return;
        }
        if (strArr != null && strArr.length > 0) {
            com.meituan.msi.log.a.a("MMPPrivacy MsiPermissionGuard requestPermissionsOrEnqueue " + strArr[0]);
        }
        b bVar = new b(strArr, activity, str, interfaceC0498a);
        this.c.add(bVar);
        if (this.c.size() <= 1) {
            a(bVar);
        }
    }

    private void a(@NonNull final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b419af77827b55c65b20cd97319fdfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b419af77827b55c65b20cd97319fdfe");
        } else if (bVar == null) {
        } else {
            if (bVar != null && bVar.a != null && bVar.a.length > 0) {
                com.meituan.msi.log.a.a("MMPPrivacy MsiPermissionGuard requestPermissions " + bVar.a[0]);
            }
            StringBuilder sb = new StringBuilder();
            if (this.d != null ? this.d.a(bVar.a, bVar.c, sb) : false) {
                if (bVar.d != null) {
                    bVar.d.onResult(bVar.c, bVar.a, null, sb.toString());
                }
                a();
                return;
            }
            b(bVar.b.get(), bVar.a, bVar.c, new InterfaceC0498a() { // from class: com.meituan.msi.privacy.permission.a.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public final void onResult(String str, String[] strArr, int[] iArr, String str2) {
                    Object[] objArr2 = {str, strArr, iArr, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0409a80be9a9c184012733519cdeb769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0409a80be9a9c184012733519cdeb769");
                        return;
                    }
                    bVar.d.onResult(str, strArr, iArr, str2);
                    a.this.a();
                }
            });
        }
    }

    synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a326db3afa5cdcc0a3ecdb566e359b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a326db3afa5cdcc0a3ecdb566e359b80");
            return;
        }
        if (this.c.size() > 0) {
            try {
                this.c.remove();
                b();
            } catch (NoSuchElementException e) {
                com.meituan.msi.log.a.a("consumeRequestPermission " + e.getMessage());
            }
        }
    }

    private void b() {
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716453c5228b5a13fdd0f90a31c28e7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716453c5228b5a13fdd0f90a31c28e7d");
                return;
            } else if (this.c.size() == 0) {
                return;
            } else {
                b peek = this.c.peek();
                if (peek == null || peek.a == null) {
                    this.c.remove();
                } else {
                    a(peek);
                    return;
                }
            }
        }
    }

    public static boolean a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca672ce54776ed948e4d0c253108781e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca672ce54776ed948e4d0c253108781e")).booleanValue();
        }
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public String[] a;
        public WeakReference<Activity> b;
        public String c;
        public InterfaceC0498a d;

        public b(String[] strArr, Activity activity, String str, InterfaceC0498a interfaceC0498a) {
            this.a = strArr;
            this.b = new WeakReference<>(activity);
            this.c = str;
            this.d = interfaceC0498a;
        }
    }
}
