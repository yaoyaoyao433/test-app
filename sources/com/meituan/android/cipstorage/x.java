package com.meituan.android.cipstorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class x {
    public static ChangeQuickRedirect a;
    public final q b;

    @Deprecated
    public static x a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a6eed8291f409f0418b058d5a8c34ca", RobustBitConfig.DEFAULT_VALUE) ? (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a6eed8291f409f0418b058d5a8c34ca") : new x(qVar);
    }

    private x(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b0eb532ccc1c727ede101a47148137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b0eb532ccc1c727ede101a47148137");
        } else {
            this.b = qVar;
        }
    }

    private static SharedPreferences a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bab8cd8b8249d8b0aeb1526c34affb6b", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bab8cd8b8249d8b0aeb1526c34affb6b") : v.c.getSharedPreferences(str, 0);
    }

    @Deprecated
    public final boolean a(String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9101401f013d95810dc540189b27736", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9101401f013d95810dc540189b27736")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31f93793ebbe35a90f30e2ad7934fb9e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31f93793ebbe35a90f30e2ad7934fb9e")).booleanValue() : this.b.a(str, z, uVar);
    }

    @Deprecated
    public final boolean b(String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7db98421fa0d6bfe24915659ba7356a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7db98421fa0d6bfe24915659ba7356a")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a398fee844763c4287e071a8319b553", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a398fee844763c4287e071a8319b553")).booleanValue();
        }
        if (this.b.a(str, uVar)) {
            return this.b.b(str, z, uVar);
        }
        return a(str2).getBoolean(str, z);
    }

    @Deprecated
    public final boolean a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e68e73abf6384f30bbcfe4028b3118e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e68e73abf6384f30bbcfe4028b3118e")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, Integer.valueOf(i), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbc336a6f7c68af09790bbf7e5e0b25e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbc336a6f7c68af09790bbf7e5e0b25e")).booleanValue() : this.b.a(str, i, uVar);
    }

    @Deprecated
    public final int b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ec38621c39311745e1bb78b2e6c6fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ec38621c39311745e1bb78b2e6c6fe")).intValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, Integer.valueOf(i), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49705e1efc7c5e4482314418d7280023", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49705e1efc7c5e4482314418d7280023")).intValue();
        }
        if (this.b.a(str, uVar)) {
            return this.b.b(str, i, uVar);
        }
        return a(str2).getInt(str, i);
    }

    @Deprecated
    public final boolean a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c6a7f92d495f7391ef3a512d28e534", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c6a7f92d495f7391ef3a512d28e534")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, new Long(j), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ddcdaf42e526e50047296f0996392c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ddcdaf42e526e50047296f0996392c")).booleanValue() : this.b.a(str, j, uVar);
    }

    @Deprecated
    public final long b(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7feb7041bf080191869ff645e020621", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7feb7041bf080191869ff645e020621")).longValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, new Long(j), uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecae9e35f233b4e077bf7111c309cd7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecae9e35f233b4e077bf7111c309cd7b")).longValue();
        }
        if (this.b.a(str, uVar)) {
            return this.b.b(str, j, uVar);
        }
        return a(str2).getLong(str, j);
    }

    @Deprecated
    public final boolean a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb015171edc58d27643b5e66655e516", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb015171edc58d27643b5e66655e516")).booleanValue() : a(str, str2, u.f, str3);
    }

    @Deprecated
    private boolean a(String str, String str2, u uVar, String str3) {
        Object[] objArr = {str, str2, uVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97db116a0e52c029091032ded6e0d24e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97db116a0e52c029091032ded6e0d24e")).booleanValue() : this.b.a(str, str2, uVar);
    }

    @Deprecated
    public final String b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7f72ae57d0201a8ff696db2c60fb24", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7f72ae57d0201a8ff696db2c60fb24");
        }
        u uVar = u.f;
        Object[] objArr2 = {str, str2, uVar, str3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0464ada4bd78ca4e1f4244dd71d07f7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0464ada4bd78ca4e1f4244dd71d07f7e");
        }
        if (this.b.a(str, uVar)) {
            return this.b.b(str, str2, uVar);
        }
        return a(str3).getString(str, str2);
    }

    @Deprecated
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0c5a4dc3d7dde895eeb8ae8305d6db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0c5a4dc3d7dde895eeb8ae8305d6db")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79a9e5475e8483d402177a8e93cd40fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79a9e5475e8483d402177a8e93cd40fc")).booleanValue() : this.b.a(str, uVar) || a(str2).contains(str);
    }

    @Deprecated
    public final boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7121193996d4ed0f37b76960d8e6b11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7121193996d4ed0f37b76960d8e6b11")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8c8d657d38d6c7599a21d594de96ec2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8c8d657d38d6c7599a21d594de96ec2")).booleanValue();
        }
        if (!TextUtils.isEmpty(str2)) {
            a(str2).edit().remove(str).apply();
        }
        return this.b.b(str, uVar);
    }

    public static void a(q qVar, u uVar, String... strArr) {
        Object[] objArr = {qVar, uVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3a2c87841042eb79ab81b51a0c3349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3a2c87841042eb79ab81b51a0c3349");
            return;
        }
        for (String str : strArr) {
            Map<String, ?> all = a(str).getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Object[] objArr2 = {key, value, qVar, uVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5fd4d6024f5c8754682f4fc12cdca6e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5fd4d6024f5c8754682f4fc12cdca6e9");
                    } else if (value instanceof Boolean) {
                        qVar.a(key, ((Boolean) value).booleanValue(), uVar);
                    } else if (value instanceof Integer) {
                        qVar.a(key, ((Integer) value).intValue(), uVar);
                    } else if (value instanceof Long) {
                        qVar.a(key, ((Long) value).longValue(), uVar);
                    } else if (value instanceof Float) {
                        qVar.a(key, ((Float) value).floatValue(), uVar);
                    } else if (value instanceof Double) {
                        qVar.a(key, ((Double) value).doubleValue(), uVar);
                    } else if (value instanceof String) {
                        qVar.a(key, (String) value, uVar);
                    } else if (value instanceof Set) {
                        qVar.a(key, (Set) value, uVar);
                    }
                }
            }
        }
    }

    private static boolean a(Context context, String str, boolean z, u uVar, String... strArr) {
        File cacheDir;
        Object[] objArr = {context, str, (byte) 0, uVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f7a54bd4865457d31984afa0249df6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f7a54bd4865457d31984afa0249df6b")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return false;
        }
        if (uVar == null) {
            uVar = u.f;
        }
        if (uVar.g) {
            cacheDir = context.getFilesDir();
        } else {
            cacheDir = context.getCacheDir();
        }
        File a2 = q.a(context, str, (String) null, uVar);
        if (a2 == null) {
            return false;
        }
        if (a2.exists() || a2.mkdirs()) {
            for (int i = 0; i < strArr.length; i++) {
                File file = new File(cacheDir, strArr[i]);
                if (file.exists()) {
                    file.renameTo(new File(a2, strArr[i]));
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str, u uVar, String... strArr) {
        Object[] objArr = {context, str, uVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "993064e9c665c9625875570a9f0a2da8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "993064e9c665c9625875570a9f0a2da8")).booleanValue() : a(context, str, false, uVar, strArr);
    }
}
