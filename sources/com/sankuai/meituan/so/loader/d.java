package com.sankuai.meituan.so.loader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Context b;
    public String c;
    public String d;
    public String e;
    public String f;
    private boolean g;
    private boolean h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2da6b3b7a3d33ff74458f3dad9882f50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2da6b3b7a3d33ff74458f3dad9882f50");
            return;
        }
        this.g = false;
        this.h = false;
    }

    public static /* synthetic */ void a(d dVar, String str, String str2, String str3) {
        String a2;
        boolean z = false;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "761f7ac7d1209455dae5390086276929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "761f7ac7d1209455dae5390086276929");
            return;
        }
        g a3 = g.a(dVar.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        String a4 = PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "8a403687bf18a659e63d555af6598fde", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "8a403687bf18a659e63d555af6598fde") : a3.a("so_loader_apk_hash", "");
        if (!TextUtils.isEmpty(a4) && !TextUtils.equals(a4, str3)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "2d6de56f2da2153bde23a04144243062", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "2d6de56f2da2153bde23a04144243062");
            } else if (dVar.b == null) {
                e.a("so-loader", "you should call SoLoader.init() method first.", new Object[0]);
            } else {
                f.a(new File(dVar.b.getFilesDir(), "42b60d44456a45468a60a45015e28254"));
            }
        }
        String a5 = i.a(str);
        Object[] objArr4 = {a5};
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "cd680505e65e0d02192db2e956a8e9e1", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (String) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "cd680505e65e0d02192db2e956a8e9e1");
        } else {
            a2 = a3.a("so_loader_file_md5_" + a5, "");
        }
        boolean z2 = TextUtils.isEmpty(a2) || !TextUtils.equals(a2, str2);
        b b = f.b(str);
        if (b == null || !b.a) {
            return;
        }
        boolean z3 = b.c;
        boolean z4 = b.b;
        if (!z4 && z3) {
            if (!z2 && dVar.a(b.e)) {
                dVar.g = true;
            } else {
                dVar.a(str, (String) null, 2);
            }
        } else if (z4 && !z3) {
            String b2 = dVar.b(b.d);
            if (TextUtils.isEmpty(b2)) {
                e.a("so-loader", "can't found the validate cpuAbi dir.", new Object[0]);
                return;
            }
            if (!z2) {
                String a6 = a3.a();
                if (f.c(a6)) {
                    dVar.g = c.a(dVar.b, a6);
                    return;
                }
            }
            dVar.a(str, b2, 1);
        } else {
            String b3 = dVar.b(b.d);
            if (TextUtils.isEmpty(b3)) {
                e.a("so-loader", "can't found the validate cpuAbi dir.", new Object[0]);
                return;
            }
            if (!z2) {
                String a7 = a3.a();
                if (f.c(a7)) {
                    if (!c.a(dVar.b, a7)) {
                        return;
                    }
                    z = true;
                }
                boolean a8 = dVar.a(b.e);
                if (a8 && z) {
                    dVar.g = true;
                    return;
                } else if (!a8 && z) {
                    dVar.a(str, (String) null, 2);
                    return;
                } else if (a8 && !z) {
                    dVar.a(str, b3, 1);
                    return;
                }
            }
            dVar.a(str, b3, 3);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3f1ae606a365265d6dc03ba4b3775b8", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3f1ae606a365265d6dc03ba4b3775b8") : a.a;
    }

    private boolean a(@NonNull List<String> list) {
        String[] list2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0350dd1235040e5c0c73b40340d8645a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0350dd1235040e5c0c73b40340d8645a")).booleanValue();
        }
        File file = new File(this.b.getFilesDir(), "42b60d44456a45468a60a45015e28254/assets");
        if (!file.exists() || (list2 = file.list()) == null) {
            return false;
        }
        List asList = Arrays.asList(list2);
        for (String str : list) {
            if (!asList.contains(str)) {
                return false;
            }
        }
        return true;
    }

    private String b(@NonNull List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb9dd7d7373b5f9d693dadb2694d27c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb9dd7d7373b5f9d693dadb2694d27c");
        }
        String str = null;
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (TextUtils.equals(next, this.c)) {
                str = next;
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next2 = it2.next();
                if (TextUtils.equals(next2, this.d)) {
                    str = next2;
                    break;
                }
            }
        }
        return (TextUtils.isEmpty(str) && list.contains("armeabi")) ? "armeabi" : str;
    }

    private void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c446b566b14f5cf603ea8ea5d43dd53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c446b566b14f5cf603ea8ea5d43dd53");
        } else if (TextUtils.isEmpty(str)) {
            e.a("so-loader", "file path or cpuAbiDir is null. file path:" + str, new Object[0]);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                e.a("so-loader", "file not exists:" + str + ";cpuAbiDir:" + str2, new Object[0]);
                return;
            }
            File filesDir = this.b.getFilesDir();
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            File file2 = new File(filesDir, "42b60d44456a45468a60a45015e28254");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            switch (i) {
                case 1:
                    a(file, file2, str2);
                    return;
                case 2:
                    a(file, file2);
                    return;
                case 3:
                    b(file, file2, str2);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(File file, File file2) {
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d910976e831b5648d5814e298d71ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d910976e831b5648d5814e298d71ca");
        } else if (f.a(file, file2)) {
            this.g = true;
            g a2 = g.a(this.b);
            a2.b(i.a(file.getAbsolutePath()), this.e);
            a2.a(this.f);
        } else {
            e.a("so-loader", "copy asset failed.", new Object[0]);
        }
    }

    private void a(File file, File file2, String str) {
        Object[] objArr = {file, file2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe597d391f2725c8d44e42b0bac9cfba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe597d391f2725c8d44e42b0bac9cfba");
            return;
        }
        String b = f.b(file, file2, str);
        if (!TextUtils.isEmpty(b)) {
            if (c.a(this.b, b)) {
                this.g = true;
                g a2 = g.a(this.b);
                a2.b(i.a(file.getAbsolutePath()), this.e);
                a2.a(this.f);
                a2.b(b);
                return;
            }
            e.a("so-loader", "so reflect failed.", new Object[0]);
            return;
        }
        e.a("so-loader", "copy so failed.", new Object[0]);
    }

    private void b(File file, File file2, String str) {
        Object[] objArr = {file, file2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878e25d399cb992a32761aed1e913d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878e25d399cb992a32761aed1e913d1a");
            return;
        }
        String a2 = f.a(file, file2, str);
        if (!TextUtils.isEmpty(a2)) {
            if (c.a(this.b, a2)) {
                this.g = true;
                g a3 = g.a(this.b);
                a3.b(i.a(file.getAbsolutePath()), this.e);
                a3.a(this.f);
                a3.b(a2);
                return;
            }
            e.a("so-loader", "so reflect failed.", new Object[0]);
            return;
        }
        e.a("so-loader", "copy so and asset failed.", new Object[0]);
    }
}
