package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.shortvideocore.mrn.MRNPlayerModule;
import com.xiaomi.push.ar;
import com.xiaomi.push.av;
import com.xiaomi.push.ge;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes6.dex */
public class c implements a {
    protected Context a;
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.d>> b;

    private List<String> a(String str) {
        FileInputStream fileInputStream;
        String str2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(str));
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            if (read == 4) {
                                if (com.xiaomi.push.f.a(bArr) == -573785174) {
                                    int read2 = fileInputStream.read(bArr2);
                                    if (read2 != -1) {
                                        if (read2 == 4) {
                                            int a = com.xiaomi.push.f.a(bArr2);
                                            if (a <= 0 || a > 4096) {
                                                break;
                                            }
                                            byte[] bArr3 = new byte[a];
                                            if (fileInputStream.read(bArr3) != a) {
                                                str2 = "eventData read from cache file failed cause buffer size not equal length";
                                                break;
                                            }
                                            String a2 = a(bArr3);
                                            if (!TextUtils.isEmpty(a2)) {
                                                arrayList.add(a2);
                                            }
                                        } else {
                                            str2 = "eventData read from cache file failed cause lengthBuffer error";
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    str2 = "eventData read from cache file failed because magicNumber error";
                                    break;
                                }
                            } else {
                                str2 = "eventData read from cache file failed because magicNumber error";
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        com.xiaomi.channel.commonutils.logger.c.a(e);
                        com.xiaomi.push.b.a(fileInputStream2);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        com.xiaomi.push.b.a(fileInputStream);
                        throw th;
                    }
                }
                str2 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K";
                com.xiaomi.channel.commonutils.logger.c.d(str2);
                com.xiaomi.push.b.a(fileInputStream);
            } catch (Exception e2) {
                e = e2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    private static void a(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
        }
        com.xiaomi.push.b.a(randomAccessFile);
    }

    @Override // com.xiaomi.clientreport.processor.a
    public final void a(HashMap<String, ArrayList<com.xiaomi.clientreport.data.d>> hashMap) {
        this.b = hashMap;
    }

    public void a(List<String> list) {
        av.a(this.a, list);
    }

    public c(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.clientreport.processor.e
    public final void a() {
        int i;
        RandomAccessFile randomAccessFile;
        FileLock lock;
        av.a(this.a, "event", "eventUploading");
        File[] b = av.b(this.a, "eventUploading");
        if (b == null || b.length <= 0) {
            return;
        }
        int length = b.length;
        FileLock fileLock = null;
        RandomAccessFile randomAccessFile2 = null;
        File file = null;
        while (i < length) {
            File file2 = b[i];
            if (file2 == null) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e) {
                        com.xiaomi.channel.commonutils.logger.c.a(e);
                    }
                }
                com.xiaomi.push.b.a(randomAccessFile2);
                if (file != null) {
                    file.delete();
                }
            } else {
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (file2.length() > MRNPlayerModule.MAX_CACHE_SIZE) {
                        com.xiaomi.channel.commonutils.logger.c.d("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                        String name = file2.getName();
                        String formatFileSize = Formatter.formatFileSize(this.a, file2.length());
                        com.xiaomi.clientreport.data.b a = com.xiaomi.clientreport.manager.b.a(this.a).a(5001, "24:" + name + CommonConstant.Symbol.COMMA + formatFileSize);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a.b());
                        a(arrayList);
                        file2.delete();
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e3) {
                                com.xiaomi.channel.commonutils.logger.c.a(e3);
                            }
                        }
                        com.xiaomi.push.b.a(randomAccessFile2);
                        if (file == null) {
                        }
                        file.delete();
                    } else {
                        String absolutePath = file2.getAbsolutePath();
                        File file3 = new File(absolutePath + ".lock");
                        try {
                            com.xiaomi.push.b.b(file3);
                            randomAccessFile = new RandomAccessFile(file3, "rw");
                            try {
                                lock = randomAccessFile.getChannel().lock();
                            } catch (Exception e4) {
                                e = e4;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            a(a(absolutePath));
                            file2.delete();
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException e6) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e6);
                                }
                            }
                            com.xiaomi.push.b.a(randomAccessFile);
                            file3.delete();
                            fileLock = lock;
                            randomAccessFile2 = randomAccessFile;
                            file = file3;
                        } catch (Exception e7) {
                            e = e7;
                            fileLock = lock;
                            randomAccessFile2 = randomAccessFile;
                            file = file3;
                            com.xiaomi.channel.commonutils.logger.c.a(e);
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e8) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e8);
                                }
                            }
                            com.xiaomi.push.b.a(randomAccessFile2);
                            i = file == null ? i + 1 : 0;
                            file.delete();
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = lock;
                            randomAccessFile2 = randomAccessFile;
                            file = file3;
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e9) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e9);
                                }
                            }
                            com.xiaomi.push.b.a(randomAccessFile2);
                            if (file != null) {
                                file.delete();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    private String a(byte[] bArr) {
        byte[] a;
        if (bArr.length <= 0) {
            return null;
        }
        if (com.xiaomi.clientreport.manager.b.a(this.a).a().a) {
            String a2 = av.a(this.a);
            if (!TextUtils.isEmpty(a2) && (a = av.a(a2)) != null && a.length > 0) {
                try {
                    return ar.a(Base64.decode(ge.a(a, bArr), 2));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
            }
            return null;
        }
        return ar.a(bArr);
    }

    private byte[] b(String str) {
        byte[] a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (com.xiaomi.clientreport.manager.b.a(this.a).a().a) {
            String a2 = av.a(this.a);
            byte[] c = ar.c(str);
            if (!TextUtils.isEmpty(a2) && c != null && c.length > 1 && (a = av.a(a2)) != null) {
                try {
                    if (a.length > 1) {
                        return ge.b(a, Base64.encode(c, 2));
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
            }
            return null;
        }
        return ar.c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    private com.xiaomi.clientreport.data.d[] a(com.xiaomi.clientreport.data.d[] dVarArr) {
        String str;
        Closeable closeable;
        BufferedOutputStream bufferedOutputStream;
        com.xiaomi.clientreport.data.d dVar = dVarArr[0];
        ?? externalFilesDir = this.a.getExternalFilesDir("event");
        String valueOf = String.valueOf(dVar.e);
        if (externalFilesDir != 0) {
            String str2 = externalFilesDir.getAbsolutePath() + File.separator + valueOf;
            externalFilesDir = 0;
            while (externalFilesDir < 100) {
                str = str2 + externalFilesDir;
                if (av.a(this.a, str)) {
                    break;
                }
                externalFilesDir++;
            }
        }
        str = null;
        ?? isEmpty = TextUtils.isEmpty(str);
        try {
            if (isEmpty != 0) {
                return null;
            }
            try {
                File file = new File(str + ".lock");
                com.xiaomi.push.b.b(file);
                externalFilesDir = new RandomAccessFile(file, "rw");
                try {
                    isEmpty = externalFilesDir.getChannel().lock();
                } catch (Exception e) {
                    e = e;
                    isEmpty = 0;
                    bufferedOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    isEmpty = 0;
                    closeable = null;
                }
            } catch (Exception e2) {
                e = e2;
                isEmpty = 0;
                externalFilesDir = 0;
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                isEmpty = 0;
                externalFilesDir = 0;
                closeable = null;
            }
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str), true));
                try {
                    int i = 0;
                    for (com.xiaomi.clientreport.data.d dVar2 : dVarArr) {
                        if (dVar2 != null) {
                            byte[] b = b(dVar2.b());
                            if (b != null && b.length > 0 && b.length <= 4096) {
                                if (!av.a(this.a, str)) {
                                    int length = dVarArr.length - i;
                                    com.xiaomi.clientreport.data.d[] dVarArr2 = new com.xiaomi.clientreport.data.d[length];
                                    System.arraycopy(dVarArr, i, dVarArr2, 0, length);
                                    com.xiaomi.push.b.a(bufferedOutputStream);
                                    a(externalFilesDir, isEmpty);
                                    return dVarArr2;
                                }
                                bufferedOutputStream.write(com.xiaomi.push.f.a(-573785174));
                                bufferedOutputStream.write(com.xiaomi.push.f.a(b.length));
                                bufferedOutputStream.write(b);
                                bufferedOutputStream.flush();
                                i++;
                            }
                            com.xiaomi.channel.commonutils.logger.c.d("event data throw a invalid item ");
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    com.xiaomi.channel.commonutils.logger.c.a("event data write to cache file failed cause exception", e);
                    com.xiaomi.push.b.a(bufferedOutputStream);
                    a(externalFilesDir, isEmpty);
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                com.xiaomi.push.b.a(closeable);
                a(externalFilesDir, isEmpty);
                throw th;
            }
            com.xiaomi.push.b.a(bufferedOutputStream);
            a(externalFilesDir, isEmpty);
            return null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.xiaomi.clientreport.processor.f
    public final void b() {
        if (this.b == null) {
            return;
        }
        if (this.b.size() > 0) {
            for (String str : this.b.keySet()) {
                ArrayList<com.xiaomi.clientreport.data.d> arrayList = this.b.get(str);
                if (arrayList != null && arrayList.size() > 0) {
                    com.xiaomi.clientreport.data.d[] dVarArr = new com.xiaomi.clientreport.data.d[arrayList.size()];
                    arrayList.toArray(dVarArr);
                    if (dVarArr.length == 0 || dVarArr[0] == null) {
                        com.xiaomi.channel.commonutils.logger.c.a("event data write to cache file failed because data null");
                    } else {
                        do {
                            dVarArr = a(dVarArr);
                            if (dVarArr != null && dVarArr.length > 0) {
                            }
                        } while (dVarArr[0] != null);
                    }
                }
            }
        }
        this.b.clear();
    }

    @Override // com.xiaomi.clientreport.processor.f
    public final void a(com.xiaomi.clientreport.data.d dVar) {
        if ((dVar instanceof com.xiaomi.clientreport.data.b) && this.b != null) {
            com.xiaomi.clientreport.data.b bVar = (com.xiaomi.clientreport.data.b) dVar;
            String valueOf = String.valueOf(bVar.e);
            ArrayList<com.xiaomi.clientreport.data.d> arrayList = this.b.get(valueOf);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(bVar);
            this.b.put(valueOf, arrayList);
        }
    }
}
