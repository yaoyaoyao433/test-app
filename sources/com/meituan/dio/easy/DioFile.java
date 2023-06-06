package com.meituan.dio.easy;

import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.dio.e;
import com.meituan.dio.utils.c;
import com.meituan.dio.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DioFile implements Serializable, Comparable<DioFile> {
    public static ChangeQuickRedirect a;
    protected File f;
    protected e g;
    protected com.meituan.dio.a h;
    protected String i;
    protected boolean j;
    protected a k;
    protected String l;
    protected String m;
    public static final char b = File.separatorChar;
    public static final String c = File.separator;
    public static final char d = File.pathSeparatorChar;
    public static final String e = File.pathSeparator;
    private static final int o = 4;
    protected static final Comparator<com.meituan.dio.a> n = new Comparator<com.meituan.dio.a>() { // from class: com.meituan.dio.easy.DioFile.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.meituan.dio.a aVar, com.meituan.dio.a aVar2) {
            com.meituan.dio.a aVar3 = aVar;
            com.meituan.dio.a aVar4 = aVar2;
            Object[] objArr = {aVar3, aVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a42883a208afc783a82b4551ee3824", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a42883a208afc783a82b4551ee3824")).intValue();
            }
            if (aVar3 == aVar4) {
                return 0;
            }
            if (aVar3 == null) {
                return -1;
            }
            if (aVar4 == null) {
                return 1;
            }
            String a2 = aVar3.a();
            String a3 = aVar4.a();
            int compareTo = a2.compareTo(a3);
            if (compareTo <= 0 || !a2.startsWith(a3)) {
                return compareTo;
            }
            return 0;
        }
    };

    public final DioFile i() {
        return this;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e4db207df6410f15f4001e3734e4cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e4db207df6410f15f4001e3734e4cc");
        }
        DioFile dioFile = new DioFile();
        dioFile.m = this.m;
        dioFile.g = this.g;
        dioFile.h = this.h;
        dioFile.f = this.f;
        dioFile.j = this.j;
        dioFile.l = this.l;
        dioFile.k = this.k;
        return dioFile;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        FILE_IN_DIO,
        DIRECTORY_IN_DIO,
        NOT_DIO,
        INVALID;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb55da080907092d78cc9ff7b7aed05", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb55da080907092d78cc9ff7b7aed05");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efaf9b19db47cf902214316b30c81460", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efaf9b19db47cf902214316b30c81460") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "193784074604121b6cbb8fb8c3dc0dd0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "193784074604121b6cbb8fb8c3dc0dd0") : (a[]) values().clone();
        }
    }

    public DioFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe54a366e1e41cd2018dda4dabace38c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe54a366e1e41cd2018dda4dabace38c");
            return;
        }
        this.j = false;
        this.k = null;
    }

    public DioFile(File file) {
        this(file.toString());
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3720e8e8c00328168032b41b13ad09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3720e8e8c00328168032b41b13ad09");
        }
    }

    public DioFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3e18eebf7e017ebd3a26697d22f482", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3e18eebf7e017ebd3a26697d22f482");
            return;
        }
        this.j = false;
        this.k = null;
        if (str == null) {
            throw new NullPointerException("path can't be null");
        }
        this.l = com.meituan.dio.utils.e.a(str);
    }

    private DioFile(e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bace42fc7537774402e8c401543f6769", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bace42fc7537774402e8c401543f6769");
            return;
        }
        this.j = false;
        this.k = null;
        if (eVar == null) {
            throw new NullPointerException("dioReader can't be null");
        }
        this.g = eVar;
        this.f = eVar.c();
        this.i = str;
        this.l = this.f != null ? this.f.getAbsolutePath() : null;
        this.m = str;
        this.j = true;
        this.k = a.DIRECTORY_IN_DIO;
    }

    private DioFile(e eVar, com.meituan.dio.a aVar) {
        Object[] objArr = {eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a3d73b1d384256990e534d50bf9b30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a3d73b1d384256990e534d50bf9b30");
            return;
        }
        this.j = false;
        this.k = null;
        if (eVar == null || aVar == null) {
            throw new NullPointerException("dioReader can't be null");
        }
        this.g = eVar;
        this.f = eVar.c();
        this.h = aVar;
        this.l = this.f != null ? this.f.getAbsolutePath() : null;
        this.m = aVar.a();
        this.j = true;
        this.k = a.FILE_IN_DIO;
    }

    public DioFile(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d042a227aa7436144d26d3981536eff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d042a227aa7436144d26d3981536eff");
            return;
        }
        this.j = false;
        this.k = null;
        if (str == null) {
            throw new NullPointerException("parent can't be null");
        }
        if (str2 != null && str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        String a2 = com.meituan.dio.utils.e.a(str);
        String a3 = com.meituan.dio.utils.e.a(str2);
        if (!d(a3)) {
            this.l = com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(a2, a3));
            return;
        }
        this.l = a2;
        this.m = a3;
    }

    public DioFile(File file, String str) {
        this(file.toString(), str);
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deab878a578dc19584f489382e55ecb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deab878a578dc19584f489382e55ecb3");
        }
    }

    private DioFile(DioFile dioFile, String str) {
        Object[] objArr = {dioFile, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca5add8727c902c245eda81b3b4ea40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca5add8727c902c245eda81b3b4ea40");
            return;
        }
        this.j = false;
        this.k = null;
        if (dioFile.j && dioFile.o()) {
            e n2 = dioFile.n();
            String a2 = com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(dioFile.h != null ? dioFile.h.a() : dioFile.i, str));
            if (!d(a2)) {
                File c2 = dioFile.g.c();
                if (c2 != null) {
                    this.l = com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(c2.getAbsolutePath(), a2));
                    return;
                }
                return;
            }
            this.g = n2;
            this.f = n2.c();
            this.l = this.f != null ? this.f.getAbsolutePath() : null;
            this.m = a2;
            return;
        }
        this.l = dioFile.l;
        this.m = com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(dioFile.m, str));
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933ebfcdda75757cefe36938b1d52609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933ebfcdda75757cefe36938b1d52609");
        } else if (this.j) {
        } else {
            synchronized (this) {
                if (this.j) {
                    return;
                }
                if (this.g != null) {
                    a(this.g, this.m);
                } else if (this.m != null) {
                    if (!a(this.l, this.m)) {
                        this.l = com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(this.l, this.m));
                        this.m = null;
                        a(this.l);
                    }
                } else {
                    a(com.meituan.dio.utils.e.a(this.l));
                }
                this.j = true;
            }
        }
    }

    private void a(String str) {
        String substring;
        String substring2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8a75000d6c3c6d8514c7cad9921f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8a75000d6c3c6d8514c7cad9921f3c");
        } else if (str == null) {
            this.k = a.INVALID;
        } else {
            File file = new File(str);
            if (file.exists()) {
                if (a(str, (String) null)) {
                    return;
                }
                this.f = file;
                this.k = a.NOT_DIO;
            } else if (str.endsWith(MRNBundleManager.DIO_BUNDLE_SUFFIX)) {
                if (a(str.substring(0, str.length() - o), (String) null)) {
                    return;
                }
                this.k = a.INVALID;
            } else {
                int length = str.length();
                boolean z = false;
                while (true) {
                    length = str.lastIndexOf(MRNBundleManager.DIO_BUNDLE_SUFFIX + File.separatorChar, length - 1);
                    if (length < 0) {
                        if (z) {
                            this.k = a.INVALID;
                            return;
                        }
                        int length2 = str.length() - 1;
                        do {
                            length2 = str.lastIndexOf(File.separatorChar, length2 - 1);
                            if (length2 >= 0) {
                                substring = str.substring(0, length2);
                                substring2 = str.substring(length2 + 1);
                            } else {
                                this.k = a.INVALID;
                                return;
                            }
                        } while (!new File(substring).exists());
                        if (a(substring, substring2)) {
                            return;
                        }
                        this.k = a.INVALID;
                        return;
                    }
                    String substring3 = str.substring(0, o + length);
                    String substring4 = str.substring(o + length + 1);
                    if (a(substring3, substring4) || a(substring3.substring(0, substring3.length() - o), substring4)) {
                        return;
                    }
                    z = true;
                }
            }
        }
    }

    private boolean a(e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453b102087052def64a580f769653b68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453b102087052def64a580f769653b68")).booleanValue();
        }
        if (!f.a(str)) {
            try {
                this.h = eVar.a(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.h == null) {
                if (b(eVar, str)) {
                    this.i = str;
                    this.k = a.DIRECTORY_IN_DIO;
                    return true;
                }
                this.g = null;
                this.f = null;
                return false;
            }
            this.k = a.FILE_IN_DIO;
            return true;
        }
        this.i = "";
        this.k = a.DIRECTORY_IN_DIO;
        return true;
    }

    private boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94245dee2dfaa061c2e3e1b33d94c435", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94245dee2dfaa061c2e3e1b33d94c435")).booleanValue();
        }
        e c2 = c(str);
        if (e.a(c2, false)) {
            if (a(c2, str2)) {
                this.g = c2;
                this.f = c2.c();
            }
            return true;
        }
        return false;
    }

    private a r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c328c3a00166769b507f1e0156829db8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c328c3a00166769b507f1e0156829db8");
        }
        q();
        return this.k;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cbceaafd9efca246907ee588ac7f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cbceaafd9efca246907ee588ac7f35");
        }
        switch (r()) {
            case FILE_IN_DIO:
                return this.h.a();
            case DIRECTORY_IN_DIO:
                return this.i;
            default:
                return "";
        }
    }

    public final void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2150c65eae4b6ead56de7950aee9d1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2150c65eae4b6ead56de7950aee9d1a2");
        } else if (file.getAbsolutePath().equals(h())) {
            throw new IOException("The target file is equals the source file");
        } else {
            if (k()) {
                if (file.exists()) {
                    throw new IOException(String.format("The target file %s is already existing", file));
                }
                file.getParentFile().mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    InputStream b2 = b();
                    Object[] objArr2 = {b2, fileOutputStream};
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8a299ac881b71b5a21eafd365effeec0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8a299ac881b71b5a21eafd365effeec0");
                    } else {
                        c.a(b2, fileOutputStream, true);
                    }
                    if (b2 != null) {
                        b2.close();
                    }
                    fileOutputStream.close();
                } finally {
                }
            } else if (j()) {
                if (file.exists() && !file.isDirectory()) {
                    throw new IOException(String.format("The target file %s is already existing", file));
                }
                List<DioFile> a2 = a(this);
                String h = h();
                for (DioFile dioFile : a2) {
                    String h2 = dioFile.h();
                    int indexOf = h2.indexOf(h);
                    if (indexOf < 0) {
                        throw new IOException(String.format("The file %s is not the descendant of %s", h2, h));
                    }
                    dioFile.a(new File(file, h2.substring(indexOf + h.length())));
                }
            } else {
                throw new IOException("Unknown file type");
            }
        }
    }

    public final byte[] a(boolean z) throws IOException {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f781f43d554b990559f597bf7609975", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f781f43d554b990559f597bf7609975");
        }
        q();
        if (this.k == a.FILE_IN_DIO) {
            return this.g.a(this.h, z);
        }
        return c.a((InputStream) new FileInputStream(t()));
    }

    public final InputStream b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349529211bbc06ed09baae1f7fa874d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349529211bbc06ed09baae1f7fa874d4");
        }
        q();
        if (this.g != null) {
            if (this.h != null) {
                return this.g.a(this.h);
            }
            if (!f.a(this.i)) {
                throw new FileNotFoundException(String.format("%s (Is a directory)", g()));
            }
            return new FileInputStream(t());
        }
        return new FileInputStream(t());
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b54c5274877a34c24370ad447af229a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b54c5274877a34c24370ad447af229a")).booleanValue() : s();
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e0bea85ed859d22b146e3f3736012c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e0bea85ed859d22b146e3f3736012c")).booleanValue();
        }
        File d2 = d();
        return d2 != null && d2.exists();
    }

    public final File d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd4023f94f9f35ba0b88928f427d8b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd4023f94f9f35ba0b88928f427d8b2");
        }
        q();
        return this.g != null ? this.g.c() : this.f;
    }

    private File t() throws FileNotFoundException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d084fff85f8ef3b32ffcaa6e7c0dd790", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d084fff85f8ef3b32ffcaa6e7c0dd790");
        }
        if (this.f == null) {
            throw new FileNotFoundException(g());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b93f0f7c584f99ecac85979841e718", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b93f0f7c584f99ecac85979841e718")).intValue();
        }
        if (dioFile == null) {
            return 1;
        }
        String h = h();
        if (h == null) {
            return -1;
        }
        return h.compareTo(dioFile.h());
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab736e00700255d5c887424cf4ac952f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab736e00700255d5c887424cf4ac952f") : com.meituan.dio.utils.e.c(g());
    }

    public final DioFile f() {
        String b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc0251165f97f55a5dceff974235a824", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc0251165f97f55a5dceff974235a824");
        }
        if (this.j) {
            if (this.g != null) {
                String a2 = this.h != null ? this.h.a() : this.i;
                if (!f.a(a2) && (b2 = com.meituan.dio.utils.e.b(a2)) != null && d(b2)) {
                    return new DioFile(this.g, b2);
                }
                return new DioFile(this.f.getParent());
            } else if (this.f != null) {
                File parentFile = this.f.getParentFile();
                Object[] objArr2 = {parentFile};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d13ab7b7bd1bba1a0c612093126920d9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DioFile) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d13ab7b7bd1bba1a0c612093126920d9");
                }
                DioFile dioFile = new DioFile();
                dioFile.j = true;
                dioFile.k = a.NOT_DIO;
                dioFile.f = parentFile;
                dioFile.l = parentFile.getAbsolutePath();
                return dioFile;
            }
        }
        String b3 = com.meituan.dio.utils.e.b(this.i);
        if (b3 == null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            return new DioFile(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f25fd7e83e0646c3b1855716016d8387", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f25fd7e83e0646c3b1855716016d8387") : com.meituan.dio.utils.e.b(g()));
        }
        return new DioFile(this.l, b3);
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f073bd4cb10fe7fb81f984f75cc659", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f073bd4cb10fe7fb81f984f75cc659");
        }
        if (this.j && this.g != null) {
            File c2 = this.g.c();
            String absolutePath = c2 == null ? "" : c2.getAbsolutePath();
            if (!absolutePath.endsWith(MRNBundleManager.DIO_BUNDLE_SUFFIX)) {
                absolutePath = absolutePath + MRNBundleManager.DIO_BUNDLE_SUFFIX;
            }
            if (this.h != null) {
                return com.meituan.dio.utils.e.a(absolutePath, this.h.a());
            }
            return com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(absolutePath, this.i));
        }
        return com.meituan.dio.utils.e.a(com.meituan.dio.utils.e.a(this.l, this.m));
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c505424e2f2786757f365b1ea43fe087", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c505424e2f2786757f365b1ea43fe087") : g();
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1987f80f38d44fbe5bc2fb55dc2334", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1987f80f38d44fbe5bc2fb55dc2334")).booleanValue();
        }
        q();
        return this.g != null ? this.h == null && s() : this.f != null && this.f.isDirectory();
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6acb9ec1d9bfa8f7a18067c7dfdd015", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6acb9ec1d9bfa8f7a18067c7dfdd015")).booleanValue();
        }
        q();
        return this.g != null ? this.h != null && s() : this.f != null && this.f.isFile();
    }

    public final long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb56882af9c1f94842924f5e8021e44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb56882af9c1f94842924f5e8021e44")).longValue();
        }
        q();
        if (this.g != null) {
            if (this.h != null) {
                return this.h.b();
            }
            return 0L;
        } else if (this.f != null) {
            return this.f.length();
        } else {
            return 0L;
        }
    }

    public final DioFile[] m() {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffc575538ca50d588e86b386c5cd947", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffc575538ca50d588e86b386c5cd947");
        }
        q();
        if (this.g != null) {
            if (this.h == null && s()) {
                return b(this.i);
            }
            return null;
        } else if (this.f == null || (listFiles = this.f.listFiles()) == null) {
            return null;
        } else {
            DioFile[] dioFileArr = new DioFile[listFiles.length];
            for (int i = 0; i < listFiles.length; i++) {
                dioFileArr[i] = new DioFile(this, listFiles[i].getName());
            }
            return dioFileArr;
        }
    }

    private DioFile[] b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa429c0c764fc3788f4f35db7cff5b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa429c0c764fc3788f4f35db7cff5b4");
        }
        if (this.g == null) {
            return null;
        }
        try {
            this.g.b();
            if (f.a(str)) {
                return a(0, "");
            }
            if (str.charAt(str.length() - 1) != File.separatorChar) {
                str = str + File.separator;
            }
            try {
                this.g.d();
                int a2 = this.g.a(str, n);
                if (a2 < 0) {
                    return null;
                }
                return a(a2, str);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private DioFile[] a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0d96087e5ad9474498fba1039c2283", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0d96087e5ad9474498fba1039c2283");
        }
        com.meituan.dio.a[] a2 = this.g.a();
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        for (int i2 = i - 1; i2 >= 0 && a(str, a2, arrayList, hashSet, i2); i2--) {
        }
        while (i < a2.length && a(str, a2, arrayList, hashSet, i)) {
            i++;
        }
        for (String str2 : hashSet) {
            arrayList.add(new DioFile(this.g, com.meituan.dio.utils.e.a(str, str2)));
        }
        return (DioFile[]) arrayList.toArray(new DioFile[arrayList.size()]);
    }

    private boolean a(String str, com.meituan.dio.a[] aVarArr, List<DioFile> list, Set<String> set, int i) {
        Object[] objArr = {str, aVarArr, list, set, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77c3c134985fea04d0062b6f80f00f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77c3c134985fea04d0062b6f80f00f5")).booleanValue();
        }
        String a2 = aVarArr[i].a();
        if (a2.startsWith(str)) {
            int indexOf = a2.indexOf(File.separatorChar, str.length());
            if (indexOf < 0) {
                list.add(new DioFile(this.g, aVarArr[i]));
                return true;
            }
            set.add(a2.substring(str.length(), indexOf));
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1c9f4fb657768663a5da1fc7f45cc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1c9f4fb657768663a5da1fc7f45cc5")).booleanValue() : (obj instanceof DioFile) && compareTo((DioFile) obj) == 0;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc05b6d9b25600225cefeef6bebd42b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc05b6d9b25600225cefeef6bebd42b")).intValue();
        }
        String g = g();
        if (g == null) {
            return 0;
        }
        return g.hashCode();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978d9af611becd29d9c40e92f941773d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978d9af611becd29d9c40e92f941773d") : g();
    }

    public final e n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c087a292d171ebf8a0d01b826ae56e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c087a292d171ebf8a0d01b826ae56e9");
        }
        q();
        return this.g;
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8425224a89f2961b6965ec5e57e78d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8425224a89f2961b6965ec5e57e78d")).booleanValue();
        }
        q();
        return this.g != null;
    }

    private static void a(File file, List<DioFile> list) throws IOException {
        File[] listFiles;
        Object[] objArr = {file, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2433b8e2d92bfc81532a56c0b2275a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2433b8e2d92bfc81532a56c0b2275a10");
        } else if (file != null && list != null && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, list);
                } else if (!file2.isHidden()) {
                    list.add(new DioFile(file2));
                }
            }
        }
    }

    public static List<DioFile> a(DioFile dioFile) throws IOException {
        com.meituan.dio.a[] b2;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "648606a6e375873cc99607246cbb9ff3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "648606a6e375873cc99607246cbb9ff3");
        }
        if (dioFile.k()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (dioFile.j()) {
            e n2 = dioFile.n();
            String str = dioFile.i;
            for (com.meituan.dio.a aVar : n2.b()) {
                if (f.a(str) || aVar.a().startsWith(str)) {
                    arrayList.add(new DioFile(n2, aVar));
                }
            }
        } else if (!dioFile.o()) {
            a(dioFile.d(), arrayList);
        }
        return arrayList;
    }

    private static e c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd294ea01002656719d56fa6b7d9e35a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd294ea01002656719d56fa6b7d9e35a");
        }
        if (str == null) {
            return null;
        }
        return b.b.a(str);
    }

    public final com.meituan.dio.a p() {
        return this.h;
    }

    private static boolean b(e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98438c70cdcbd5b34714b285b7da3438", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98438c70cdcbd5b34714b285b7da3438")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        if (f.a(str)) {
            return true;
        }
        if (str.charAt(str.length() - 1) != File.separatorChar) {
            str = str + File.separator;
        }
        try {
            return eVar.b(str, n) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b74997b4ef0366aac4633af1688c918", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b74997b4ef0366aac4633af1688c918")).booleanValue() : str == null || !(str.startsWith("../") || "..".equals(str));
    }
}
